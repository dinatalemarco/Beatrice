var startPosition =[13.349552899999935,42.3676833];
var map;
var stores;


$( document ).ready(function() {
						
	setUser();
	filterAll();
	
});

function setUser(){
	
	if(getCookie("session")!== ""){
		cookiesArray = JSON.parse(getCookie("session"));
		document.getElementById("login_on").classList.remove("hidden");
		document.getElementById("login_off").classList.add("hidden");
		document.getElementById("form_comment").classList.remove("hidden");
		document.getElementById("user").innerHTML = "Ciao "+cookiesArray['name']+" "+cookiesArray['surname'];
	}
	
}

function filterAll(){
	document.getElementById('listings').innerHTML = "";
	$( document ).ready(function() {

		$.ajax({ 
			url: 'http://localhost:8080/travelmanager/api/city-activities/Aquila/', 
			type: "GET",
			contentType: "application/json", 
			dataType: 'json', 
			success: function(result){ 
						stores = result;
						getMap();
					 } 
		});
		
	});
}

function filterActivity(profile){
	document.getElementById('listings').innerHTML = "";
		$( document ).ready(function() {

			$.ajax({ 
				url: 'http://localhost:8080/travelmanager/api/city-activities-by-profile/Aquila/profile/'+profile, 
				type: "GET",
				contentType: "application/json", 
				dataType: 'json', 
				success: function(result){ 
							stores = result;
							getMap();
						 } 
			});
			
		});
}

function routeInformation(means,startLon,startLat,endLon,endLat){

	if (map.getSource('route')) {
		map.removeLayer('route');
		map.removeSource('route');
	}
	
	
	$.ajax({ 
		url: 'http://localhost:8080/travelmanager/api/maps-cordinates/means/'+means+'/start/'+startLon+'/'+startLat+'/end/'+endLon+'/'+endLat, 
		type: "GET",
		contentType: "application/json", 
		dataType: 'json', 
		success: function(result){ 
					  map.removeLayer("route");
				      map.addLayer({
				          "id": "route",
				          "type": "line",
				          "source": {
				              "type": "geojson",
				              "data": {
				                  "type": "Feature",
				                  "properties": {},
				                  "geometry": {
				                      "type": "LineString",
				                      "coordinates": result.coordinates
				                  }
				              }
				          },
				          "layout": {
				              "line-join": "round",
				              "line-cap": "round"
				          },
				          "paint": {
				              "line-color": "#3887be",
				              "line-width": 4
				          }
				      });
			
			
				 } 
	});

}

function getInfoActivity(currentFeature){

	if(currentFeature.properties.car === 0){
		$( document ).ready(function() {

			$.ajax({ 
				url: 'http://localhost:8080/travelmanager/api/maps-info-point2point/start/'+startPosition[0]+'/'+startPosition[1]+'/end/'+currentFeature.geometry.coordinates[0]+'/'+currentFeature.geometry.coordinates[1], 
				type: "GET",
				contentType: "application/json", 
				dataType: 'json', 
				success: function(result){ 
					        currentFeature.properties.distance = result.distance[0].distance;
							currentFeature.properties.car = result.distance[0].duration;
							currentFeature.properties.cycling = result.distance[1].duration;
							currentFeature.properties.walking = result.distance[2].duration;
						 } 
			});
			
		});	
	}

}

function register(){
	
	//sessionStorage.clear();
	name = document.getElementById("name").value;
	surname = document.getElementById("surname").value	
	email = document.getElementById("emailRegister").value;
	password = document.getElementById("passwordRegister").value
	
	$( document ).ready(function() {
		$.ajax({ 
			url: 'http://localhost:8080/travelmanager/api/register/'+name+'/'+surname+'/'+email+'/'+password, 
			type: "GET",
			contentType: "application/json", 
			dataType: 'json', 
			success: function(result){ 
					cookiesArray = getCookie("likes").split(",");
					if(result.valueResponse){
						document.getElementById("nameUserSuccess").innerHTML = name;
						document.getElementById("formRegister").classList.add("hidden");
						document.getElementById("messageRegisterSuccess").classList.remove("hidden");
					}else{
						document.getElementById("nameUser").innerHTML = name;
						document.getElementById("emailUser").innerHTML = email;
						document.getElementById("formRegister").classList.add("hidden");
						document.getElementById("messageRegisterError").classList.remove("hidden");
					}
				} 
		});
		
	});	

}


function login(){
	
	//sessionStorage.clear();
	email = document.getElementById("email").value;
	password = document.getElementById("password").value
	
	$( document ).ready(function() {

		$.ajax({ 
			url: 'http://localhost:8080/travelmanager/api/login/'+email+'/'+password, 
			type: "GET",
			contentType: "application/json", 
			dataType: 'json', 
			success: function(result){ 
				
						if(result.session.name != null){
							var session = {id:result.session.id, 
										   name:result.session.name, 
										   surname:result.session.surname, 
										   email:result.session.email, 
										   key:result.session.token};
							
							setCookie("session",JSON.stringify(session),1);						
							
							var cookiesArray = JSON.parse(getCookie("session"));					
							
							document.getElementById("myModal").removeAttribute("style");
							$( ".modal-backdrop" ).remove();
	
							document.getElementById("login_on").classList.remove("hidden");
							document.getElementById("login_off").classList.add("hidden");
							document.getElementById("user").innerHTML = "Ciao "+cookiesArray['name']+" "+cookiesArray['surname'];
							document.getElementById("form_comment").classList.remove("hidden");
						
							getLikesUser(true);
						}else{
							document.getElementById("message-error").classList.remove("hidden");
						}
				} 
		});
		
	});	

}

function logout(){
	
	cookiesArray = getCookie("likes").split(",");
	setCookie("session","",-1);
	setCookie("likes","",-1);

	for(i = 0; i <cookiesArray.length; i++) {
		if(document.getElementById("id"+cookiesArray[i]) != null){
			document.getElementById("id"+cookiesArray[i]).classList.add("like_icon");
			document.getElementById("id"+cookiesArray[i]).classList.remove("like");
		}
	}
	
	document.getElementById("login_on").classList.add("hidden");
	document.getElementById("login_off").classList.remove("hidden");
	document.getElementById("form_comment").classList.add("hidden");
}

function getLikesUser(valBool){
	
	if(getCookie("session")!== ""){
		cookiesArray = JSON.parse(getCookie("session"));
		
		if(valBool){
			$( document ).ready(function() {
				
				$.ajax({ 
					url: 'http://localhost:8080/travelmanager/api/user-likes/'+cookiesArray['key'], 
					type: "GET",
					contentType: "application/json", 
					dataType: 'json', 
					success: function(result){ 
						        setCookie("likes",result.idActivity,1);	
								for(i = 0; i <result.idActivity.length; i++) {
									var item = document.getElementById("id"+result.idActivity[i]);
									if(item  != null){
										item.classList.remove("like_icon");
										item.classList.add("like");
									}
								}
						
							 } 
				});
				
			});	
		}else{
			cookiesArray = getCookie("likes").split(",");
			for(i = 0; i <cookiesArray.length; i++) {
				document.getElementById("id"+cookiesArray[i]).classList.remove("like_icon");
				document.getElementById("id"+cookiesArray[i]).classList.add("like");
			}
		}


	}
	
}

function addLike(id_activity){
	
	if(getCookie("session")!== ""){
		cookiesArray = JSON.parse(getCookie("session"));
		$( document ).ready(function() {

			$.ajax({ 
				url: 'http://localhost:8080/travelmanager/api/like/activities/'+id_activity+'/user-key/'+cookiesArray['key'], 
				type: "GET",
				contentType: "application/json", 
				dataType: 'json', 
				success: function(result){ 
							if(result.valueResponse){
								document.getElementById("id"+id_activity).classList.remove("like_icon");
								document.getElementById("id"+id_activity).classList.add("like");
								document.getElementById("id"+id_activity+"value").innerHTML = Number(document.getElementById("id"+id_activity+"value").textContent)+1;
								getLikesUser(true);
							}
						 } 
			});
			
		});		
		
	}
	
}

function addComment(id_activity){
	
	title = document.getElementById("title").value;
	comment = document.getElementById("commenttextarea").value
	img = document.getElementById("hiddenimg").value
	activityname = document.getElementById("hiddenactivity").value
	
	if(getCookie("session")!== ""){
		cookiesArray = JSON.parse(getCookie("session"));
		$( document ).ready(function() {

			$.ajax({ 
				url: 'http://localhost:8080/travelmanager/api/add-comment/activities/'+id_activity+'/user-key/'+cookiesArray['key']+'/title/'+title+'/comment/'+comment, 
				type: "GET",
				contentType: "application/json", 
				dataType: 'json', 
				success: function(result){ 
							if(result.valueResponse){
								document.getElementById("title").value="";
								document.getElementById("commenttextarea").value=""
								getComment(id_activity,activityname,img);
							}
						 } 
			});
			
		});		
		
	}
		
	
	
}


function getComment(id_activity,name,img){

	document.getElementById("map").classList.add("hidden");
	document.getElementById("comment").classList.remove("hidden");
	document.getElementById('titleactivity').innerHTML = name;
	document.getElementById('imgactivity').innerHTML = '<img src="'+img+'" style="height:70%;">';
	document.getElementById('buttonaddcomment').innerHTML = '<button class="btn btn-primary pull-right" onclick="addComment('+id_activity+')">Inserisci</button>';
	document.getElementById('hiddeninfo').innerHTML = '<input type="hidden" id="hiddenimg" value="'+img+'"><input type="hidden" id="hiddenactivity" value="'+name+'">';

	
	
	

		$( document ).ready(function() {

			$.ajax({ 
				url: 'http://localhost:8080/travelmanager/api/comments-by-activity/activities/'+id_activity, 
				type: "GET",
				contentType: "application/json", 
				dataType: 'json', 
				success: function(result){ 
							if(result.item.length > 0){
								
							    var comments = document.getElementById('listcomment');	
							    document.getElementById('listcomment').innerHTML = "";
								
								for(i = 0; i <result.item.length; i++) {
								      	 
								   var timeSlot = comments.appendChild(document.createElement('div'));
								       timeSlot.className = 'item';
								       timeSlot.innerHTML += '<a href="#" id="'+result.item[i].id+'" class="title">'+result.item[i].title+'</a><p>'+result.item[i].text+'</p>';

								}
	
							}else{
							    var comments = document.getElementById('listcomment');	
							    document.getElementById('listcomment').innerHTML = "";
								   	 
								var timeSlot = comments.appendChild(document.createElement('div'));
								    timeSlot.className = 'item';
								    timeSlot.innerHTML += '<p>Nessun commento per questa attività!</p>';

								
							}
						 } 
			});
			
		});		
		
		
	
	
}
  	
function mapView(id_activity){

	document.getElementById("map").classList.remove("hidden");
	document.getElementById("comment").classList.add("hidden");
	
}


function getMap(){

mapboxgl.accessToken = 'pk.eyJ1IjoiY3JpczEyMCIsImEiOiJjanNlZ2h1bjAwMWxnNDRwNWlnbWVlOTF6In0.1Ss0QZL4vNR5_joy80C5xQ';


  function truncateToInt(x){
      if(x > 0){
           return Math.floor(x);
      }else{
           return Math.ceil(x);
      }
   }
  
  
  // This will let you use the .remove() function later on
  if (!('remove' in Element.prototype)) {
    Element.prototype.remove = function() {
      if (this.parentNode) {
          this.parentNode.removeChild(this);
      }
    };
  }


  // This adds the map
  map = new mapboxgl.Map({
    // container id specified in the HTML
    container: 'map',
    // style URL
    style: 'mapbox://styles/mapbox/streets-v11',
    // initial position in [long, lat] format
    center: startPosition,
    // initial zoom
    zoom: 15,
    scrollZoom: true
  });

  // This adds the data to the map
  map.on('load', function (e) {
    // This is where your '.addLayer()' used to be, instead add only the source without styling a layer
    map.addSource("places", {
      "type": "geojson",
      "data": stores
    });
    // Initialize the list
    buildLocationList(stores);

  });



  // This is where your interactions with the symbol layer used to be
  // Now you have interactions with DOM markers instead
  stores.features.forEach(function(marker, i) {
    // Create an img element for the marker
    var el = document.createElement('div');
    el.id = "marker-" + i;
    
    if(marker.properties.profile === 'NERD'){
    	el.className = "marker-nerd";
    }else if(marker.properties.profile === 'TASTY'){
    	el.className = "marker-tasty";
    }else el.className = "marker-adventure";

    // add transient marker to cursor
    var markerStartPoint = document.createElement('div');
    markerStartPoint.classList = 'currentPosition';
    new mapboxgl.Marker(markerStartPoint)
        .setLngLat(startPosition)
        .addTo(map);


    // Add markers to the map at all points
    new mapboxgl.Marker(el, {offset: [0, -23]})
        .setLngLat(marker.geometry.coordinates)
        .addTo(map);

    el.addEventListener('click', function(e){
    	
        // 1. Fly to the point
        flyToStore(marker);

        // 2. Close all other popups and display popup for clicked store
        createPopUp(marker);

        // 3. Highlight listing in sidebar (and remove highlight for all other listings)
        var activeItem = document.getElementsByClassName('active');

        e.stopPropagation();
        if (activeItem[0]) {
           activeItem[0].classList.remove('active');
        }

        var listing = document.getElementById('listing-' + i);
        listing.classList.add('active');
    });
  });

  function flyToStore(currentFeature) {
    map.flyTo({
        center: currentFeature.geometry.coordinates,
        zoom: 15
      });
  }

  function createPopUp(currentFeature) {
    var popUps = document.getElementsByClassName('mapboxgl-popup');
    if (popUps[0]) popUps[0].remove();


    var popup = new mapboxgl.Popup({closeOnClick: true})
          .setLngLat(currentFeature.geometry.coordinates)
          .setHTML('<h3>' + currentFeature.properties.name + '</h3>' +
            '<div class="img_box"><img src="' + currentFeature.properties.image + '" style="width:100%;"></div>'+
            '<div><p style="border-bottom:1px solid #6A3460;;"><b>'+currentFeature.properties.city+',</b> '+currentFeature.properties.street+'<br>'+
            '<b>'+Math.round(parseFloat(currentFeature.properties.distance), 2)+' Km</b> from your position</p></div>'+
            '<div class="box_means"><button class="car" onclick="routeInformation(\'driving\','+currentFeature.geometry.coordinates+','+startPosition+')"></button><div class="text_means">' 
            + truncateToInt(currentFeature.properties.car) + 'min</div></div>'+
            '<div class="box_means"><button class="cycling" onclick="routeInformation(\'cycling\','+currentFeature.geometry.coordinates+','+startPosition+')"></button><div class="text_means">' 
            + truncateToInt(currentFeature.properties.cycling) + 'min</div></div>'+
            '<div class="box_means"><button class="walking" onclick="routeInformation(\'walking\','+currentFeature.geometry.coordinates+','+startPosition+')"></button><div class="text_means">' 
            + truncateToInt(currentFeature.properties.walking) + 'min</div></div>')
          .addTo(map);
  }


  function buildLocationList(data) {
    for (i = 0; i < data.features.length; i++) { 
    	
      var currentTime;
      var currentFeature = data.features[i];     
      var prop = currentFeature.properties;
      var listings = document.getElementById('listings');
      
      if(currentTime !== currentFeature.properties.hourWeather){
    	  currentTime = currentFeature.properties.hourWeather;
    	  var timeSlot = listings.appendChild(document.createElement('div'));
    	  timeSlot.className = 'itembar';
    	  timeSlot.innerHTML += '<div class="text">Recommended activities from <b>'+currentFeature.properties.hourWeather+'</b> to <b>'+(parseInt(currentFeature.properties.hourWeather.substring(1, 3))+3)+':00</b> with</div>'+
    	                        '<div class="'+currentFeature.properties.weather+'"></div>';
      }   
      
      var listing = listings.appendChild(document.createElement('div'));
      listing.className = 'item';
      listing.id = "listing-" + i;   
    
      
      var link = listing.appendChild(document.createElement('a'));
      link.href = '#';
      link.className = 'title';
      link.dataPosition = i;
      link.innerHTML = prop.name;
      
      var details = listing.appendChild(document.createElement('div'));
      
      details.innerHTML += '<div class="text_section">';
      if(currentFeature.properties.profile === 'NERD'){
    	  details.innerHTML += '<b style="color:#33cc00;">'+currentFeature.properties.profile+'<b> ';
      }else if (currentFeature.properties.profile === 'TASTY'){
    	  details.innerHTML += '<b style="color:#1a75ff;">'+currentFeature.properties.profile+'<b> ';
      }else if(currentFeature.properties.profile === 'ADVENTURE'){
    	  details.innerHTML += '<b style="color:#ff8533;">'+currentFeature.properties.profile+'<b> ';
      }else{
    	  details.innerHTML += '<b style="color:#ff9900;">'+currentFeature.properties.profile+'<b> ';
      }
      

      if(String(currentFeature.properties.openingTime) === String(currentFeature.properties.closingTime)){
    	  details.innerHTML += '<div style="float:left; margin-right:10px;">Always Open</div>';
      }else{
    	  details.innerHTML += '<div style="float:left; margin-right:10px;">Open from '+currentFeature.properties.openingTime+' to '+currentFeature.properties.closingTime+' </div>';
      }
      
     
      if(getCookie("likes")!== ""){
		cookiesArray = getCookie("likes").split(",");
		insert = false;
		for(f = 0; f < cookiesArray.length; f++) {
			if(cookiesArray[f] == currentFeature.properties.id){
				insert = true;
				details.innerHTML += '</div><div class="like_section"><button class="comment" onclick="getComment('+currentFeature.properties.id+',\''+currentFeature.properties.name+'\',\''+currentFeature.properties.image+'\')"></button><button id="id'+currentFeature.properties.id+'" class="like"></button><b>'+currentFeature.properties.like+' Likes</b></div>';
			}
		}
		
		if(insert === false){
			details.innerHTML += '</div><div class="like_section"><button class="comment" onclick="getComment('+currentFeature.properties.id+',\''+currentFeature.properties.name+'\',\''+currentFeature.properties.image+'\')"></button><button id="id'+currentFeature.properties.id+'" class="like_icon" onclick="addLike('+currentFeature.properties.id+')"></button><b id="id'+currentFeature.properties.id+'value">'+currentFeature.properties.like+'</b><b>Likes</b></div>';
		}
      }else{
    	  details.innerHTML += '</div><div class="like_section"><button class="comment" onclick="getComment('+currentFeature.properties.id+',\''+currentFeature.properties.name+'\',\''+currentFeature.properties.image+'\')"></button><button id="id'+currentFeature.properties.id+'" class="like_icon" onclick="addLike('+currentFeature.properties.id+')"></button><b id="id'+currentFeature.properties.id+'value">'+currentFeature.properties.like+'</b><b>Likes</b></div>';
      }
            
      /* Ho caricato la pagina, procedo con il recupero delle informazioni di ogni punto */
      getInfoActivity(data.features[i]);      

      /* Gestisco l'evento in cui viene cliccata un attività */
      link.addEventListener('click', function(e){

    	  
        // Update the currentFeature to the store associated with the clicked link
        var clickedListing = data.features[this.dataPosition];

        // 1. Fly to the point
        flyToStore(clickedListing);

        // 2. Close all other popups and display popup for clicked store
        createPopUp(clickedListing);

        // 3. Highlight listing in sidebar (and remove highlight for all other listings)
        var activeItem = document.getElementsByClassName('active');

        if (activeItem[0]) {
           activeItem[0].classList.remove('active');
        }
        this.parentNode.classList.add('active');
        
        // Se ho aperto la finestra dei commenti, voglio chiuderla e mostrare la mappa
    	document.getElementById("map").classList.remove("hidden");
    	document.getElementById("comment").classList.add("hidden");


      });
    }
  }
}



function setCookie(cname, cvalue, exdays) {
	  var d = new Date();
	  d.setTime(d.getTime() + (exdays*24*60*60*1000));
	  var expires = "expires="+ d.toUTCString();
	  document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}


function getCookie(cname) {
	  var name = cname + "=";
	  var decodedCookie = decodeURIComponent(document.cookie);
	  var ca = decodedCookie.split(';');
	  for(var i = 0; i <ca.length; i++) {
	    var c = ca[i];
	    while (c.charAt(0) == ' ') {
	      c = c.substring(1);
	    }
	    if (c.indexOf(name) == 0) {
	      return c.substring(name.length, c.length);
	    }
	  }
	  return "";
}
