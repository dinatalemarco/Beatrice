<html xmlns:v="urn:schemas-microsoft-com:vml"
xmlns:o="urn:schemas-microsoft-com:office:office"
xmlns:w="urn:schemas-microsoft-com:office:word"
xmlns:m="http://schemas.microsoft.com/office/2004/12/omml"
xmlns="http://www.w3.org/TR/REC-html40">

<head>
<meta http-equiv=Content-Type content="text/html; charset=unicode">
<meta name=ProgId content=Word.Document>
<meta name=Generator content="Microsoft Word 15">
<meta name=Originator content="Microsoft Word 15">
<link rel=File-List href="README.fld/filelist.xml">
<link rel=Edit-Time-Data href="README.fld/editdata.mso">

<link rel=themeData href="README.fld/themedata.thmx">
<link rel=colorSchemeMapping href="README.fld/colorschememapping.xml">


</head>

<body lang=en-IT style='tab-interval:36.0pt;word-wrap:break-word'>

<div class=WordSection1>


<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT style='font-size:
11.5pt;mso-bidi-font-size:11.0pt;font-family:"Times New Roman",serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></p>

<h1>Beatrice</h1>
<span>The Web Application that guides you on a amazing journey like Beatrice guides Dante in Haven</span>

</div>

<div class=WordSection2>

<h3><span lang=IT>INTRODUZIONE</span></h3>

<br>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.3pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>This project is a SOA-based application that aims to provide users with possible activities to do in a city (in our case L'Aquila). Users can consult the map of the city (provided by an external provider, Map BOX) on which the activities proposed for that city by the application will be shown (thanks to a provider implemented by us, PlacesOfCity). The world in which they will be recommended to the user depends on the current time and the weather (provided by an external provider, Weather). In fact, if the venue is closed it will not be offered or, if it rains, mountain excursions or similar activities which are inappropriate to practice in adverse weather will not be offered. These recreational proposals can also be recommended to the user according to an interest filter which is divided into three profiles: Adventure, Tasty and Nerd. The first profile includes all the "lively" activities which can be excursions or sports to be practiced. The second profile concerns all culinary venues: from pubs to gourmet venues, but also pubs, pastry shops or trattorias. The last profile is the nerdy one who recommends all the city's historic places, monuments and museums. In addition to showing the recommended places on the map, it is possible to click on the desired activity: in this way 3 possible ways to reach this activity will be shown (by bicycle, car or on foot) with the relative travel times and, if you choose one, the route to get to the desired place from your position will be shown.</p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>The user has the possibility of registering on the system and, when accessing the application via login, he can express his appreciation for an activity by leaving a like or a comment.</p>

<br>

<h3 style='margin-top:9.2pt;line-height:12.3pt;mso-line-height-rule:exactly'><span
lang=IT>OVERVIEW</span></h3>

<p class=MsoBodyText style='margin-left:46.0pt;line-height:12.3pt;mso-line-height-rule:
exactly'>The image below shows how the system components are connected.</p>

<br>

<p class=MsoBodyText style='margin-top:.15pt'><!--[if gte vml 1]><o:wrapblock><v:shapetype
  id="_x0000_t75" coordsize="21600,21600" o:spt="75" o:preferrelative="t"
  path="m@4@5l@4@11@9@11@9@5xe" filled="f" stroked="f">
  <v:stroke joinstyle="miter"/>
  <v:formulas>
   <v:f eqn="if lineDrawn pixelLineWidth 0"/>
   <v:f eqn="sum @0 1 0"/>
   <v:f eqn="sum 0 0 @1"/>
   <v:f eqn="prod @2 1 2"/>
   <v:f eqn="prod @3 21600 pixelWidth"/>
   <v:f eqn="prod @3 21600 pixelHeight"/>
   <v:f eqn="sum @0 0 1"/>
   <v:f eqn="prod @6 1 2"/>
   <v:f eqn="prod @7 21600 pixelWidth"/>
   <v:f eqn="sum @8 21600 0"/>
   <v:f eqn="prod @7 21600 pixelHeight"/>
   <v:f eqn="sum @10 21600 0"/>
  </v:formulas>
  <v:path o:extrusionok="f" gradientshapeok="t" o:connecttype="rect"/>
  <o:lock v:ext="edit" aspectratio="t"/>
 </v:shapetype><v:shape id="image2.jpeg" o:spid="_x0000_s1040" type="#_x0000_t75"
  style='position:absolute;margin-left:56.6pt;margin-top:18.8pt;width:500.25pt;
  height:376.5pt;z-index:251659264;visibility:visible;mso-wrap-style:square;
  mso-width-percent:0;mso-height-percent:0;mso-wrap-distance-left:0;
  mso-wrap-distance-top:0;mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image003.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=47 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=500 height=377 src="README.fld/image003.jpg" v:shapes="image2.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:14.5pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:14.5pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection3>

<p class=MsoBodyText style='margin-top:.35pt'><span lang=IT style='font-size:
6.0pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:6.55pt;margin-right:67.15pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:86%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>Beatrice:<span
style='letter-spacing:.8pt'> </span></span></b><span lang=IT>it is the component that represents the web application with which the user interfaces. The implementation was carried out using Javascript, html and css.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:0cm;margin-right:53.85pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:92%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>PlacesOfCity: </span></b><span lang=IT>it is the component that provides information on recommended places in the city. Inside it provides the names of the activities, the coordinates to reach them, opening and closing times of the place that provides the indicated activity, the recommended climate for carrying out this activity and his profile which can be one of: Nerd (if you want visit museums or monuments), Adventure (for sports or recreational activities) or Tasty (for pubs and restaurants). It then allows the user to register with the system and therefore also the login service. It also allows the registered user to leave likes and comments on each activity in the system's list of proposals. This service can be used via the SOAP communication protocol.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:.05pt;margin-right:74.3pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:90%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>MapBOX: </span></b><span lang=IT> it is the component that provides communication with the maps and the functions connected to them (such as geolocation, information on travel times, directions, ...). This service can be used via REST communication.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT style='font-size:
11.5pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:0cm;margin-right:77.15pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:86%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>Weather</span></b><span
lang=IT>:it is the component that is queried to request the weather forecast of the city where the user is located. This service can be used via REST communication.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:.05pt;margin-right:56.6pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:92%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>Travel Manager: </span></b><span
lang=IT> it is the Prosumer who manages the requests made via the web Application, using external services (Providers). The final service provided by the prosumer, as regards the visualization and filtering part of the services offered in a city, is a summary of the services consumed by him: weather conditions, time and activities of a city are combined to provide a list of activities to suggest to the user for visiting the city. Travel Manager also provides REST APIs that allow you to consult the city map with its related functions, described in detail previously in MapBox. The same applies to the login, registration, like and comment services provided and explained above in Places Of City. As regards communication, the prosumer uses both SOAP communication (to communicate with the Loadbalancer and the Places Of City Provider) and REST communication (with the two Providers Weather and Map Box, and with the Beaatrice Web Application) </span></p>

<p class=MsoBodyText style='margin-top:.25pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:0cm;margin-right:55.85pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:92%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>Loadbalancer : </span></b><span
lang=IT> it is a component that manages the workload through a round robin scheduling algorithm: when a request is made to the prosumer the latter invokes the Loadbalancer to request the connection address to one of the Place Of City servers. The Loadbalancer returns a connection address to the service depending on the number of connections it has assigned in a certain time interval and depending on the number of connections it supports. Consequently, when a server is assigned a number of requests equal to the maximum it can support (number chosen in the balancing algorithm) in a given time interval, the Loadbalancer will check the possibility of passing the request to the server next in the list of available servers, using the Round Robin algorithm, until the first available server is found. The query is made by the Prosumer to the Loadbalancer via SOAP calls.</span></p>

</div>

<span lang=IT style='font-size:11.0pt;line-height:92%;font-family:"Arial MT",sans-serif;
mso-fareast-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
IT;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=all
style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection4>

<h3 style='line-height:12.3pt;mso-line-height-rule:exactly'><span lang=IT>DIAGRAMS</span></h3>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>This section shows the dynamic study of the system represented through sequence diagrams. We therefore provide below 8 sequence diagrams that represent all the actions that can be performed with the application.</span></p>

<p class=MsoListParagraph style='margin-top:11.45pt;margin-right:0cm;
margin-bottom:0cm;margin-left:64.0pt;margin-bottom:.0001pt;text-indent:-18.0pt;
line-height:12.3pt;mso-line-height-rule:exactly;mso-list:l0 level1 lfo4;
tab-stops:64.0pt'><![if !supportLists]><span lang=IT><span style='mso-list:
Ignore'>1.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp; </span></span></span><![endif]><span
lang=IT>REGISTER</span></p>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Once the user enters the credentials to register on the system, the Beatrice client sends them, via REST call, to Travel Manager. The prosumer will then ask the Loadbalancer for the address of the provider to make the request. Once the address has been provided, Travel Manager will send the registration request, via SOAP, to one of the servers on which the Place of service is available

City .Subsequently the provider will check whether the credentials previously provided by the user that already exist: if this were the case, it would communicate this to the prosumer who, in turn, would communicate to the client the impossibility of registering with those credentials because they already exist. Similarly, when registration is successful, first the provider generates an identifying token (or userKey) relating to the user who has just registered and saves it in the database by associating it with that user, then communicates via SOAP with the prosumer registration has taken place. Once the prosumer knows the outcome of the registration, whether it was successful or not, he communicates it to the client via REST.</span></p>

<p class=MsoBodyText style='margin-top:.45pt'>

 <span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=16 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=538 height=307 src="README.fld/image004.png"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:13.5pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:13.5pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection5>

<p class=MsoListParagraph style='margin-left:64.0pt;text-indent:-18.0pt;
line-height:12.3pt;mso-line-height-rule:exactly;mso-list:l0 level1 lfo4;
tab-stops:64.0pt'><![if !supportLists]><span lang=IT><span style='mso-list:
Ignore'>2.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp; </span></span></span><![endif]><span
lang=IT>LOGIN</span></p>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:58.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT> Here it's illustrated the Login service. The user provides his credentials (email and password) to log in via the Beatrice client which sends them, in the form of a REST request, to the prosumer. Then the prosumer asks the Loadbalancer for the address of the provider to make the request to. Once the address has been provided, Travel Manager will send the login request, via SOAP, to one of the servers on which the Place of City service is available. Once the request has been received, the provider will retrieve the user's information from the database. The database response is communicated to the prosumer via SOAP, and finally to the client via REST.

If the credentials entered are correct, the user will be able to log in to the web application and his identifying token (or userKey) will be returned with which he can make all requests requiring authentication.

If the credentials are incorrect, it will not be possible to access the application. Once logged in, the user has different permissions than the simple visitor user: he can view the likes corresponding to the places in the city that he himself liked and can view and write comments relating to an activity.</span></p>

<br>

<br>

<p class=MsoBodyText style='margin-top:.05pt'><!--[if gte vml 1]><o:wrapblock><v:shape
  id="image4.png" o:spid="_x0000_s1036" type="#_x0000_t75" style='position:absolute;
  margin-left:30.75pt;margin-top:16.4pt;width:537.9pt;height:306.55pt;
  z-index:3;visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image005.png" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=21 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=538 height=307 src="README.fld/image018.jpg" v:shapes="image4.png"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:12.5pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:12.5pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection6>

<br>

<p class=MsoBodyText style='margin-top:.1pt'><span lang=IT style='font-size:
10.5pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:0cm;margin-right:0cm;margin-bottom:
0cm;margin-left:64.3pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
exactly;mso-list:l0 level1 lfo4;tab-stops:64.35pt'><![if !supportLists]><span
lang=IT><span style='mso-list:Ignore'>3.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span lang=IT>MAPBOX</span></p>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>The MAPBOX provider provides, always according to the same principle, three types of services to the user: the display of the map, the display of the route depending on the means of transport chosen and the time taken to travel that road based on the means chosen. All three of these services are requested by the user via Beatrice with a REST request to the prosumer.

Next TravelManager will request the service from the MAPBOX provider via REST. When the provider gives the response to TravelManager, the latter will filter this response according to what the user asked, also adapting the data for the application. Once this operation is completed, it will return the result to the user via the client.</span></p>

<br>

<p class=MsoBodyText><!--[if gte vml 1]><o:wrapblock><v:shape id="image5.jpeg"
  o:spid="_x0000_s1035" type="#_x0000_t75" style='position:absolute;
  margin-left:20.3pt;margin-top:16.35pt;width:551.95pt;height:227.95pt;
  z-index:4;visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image007.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=10 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=552 height=228 src="README.fld/image007.jpg" v:shapes="image5.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:12.5pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:12.5pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection7>

<p class=MsoListParagraph style='margin-left:64.3pt;mso-list:l0 level1 lfo4;
tab-stops:64.35pt'><![if !supportLists]><span lang=IT><span style='mso-list:
Ignore'>4.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp; </span></span></span><![endif]><span
lang=IT>LIKE<span style='letter-spacing:-.65pt'> </span>BY<span
style='letter-spacing:-.65pt'> </span>USER</span></p>

<p class=MsoBodyText style='margin-top:.4pt'><span lang=IT style='font-size:
10.0pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>When the user is logged in he can view the likes he has previously assigned. This operation happens automatically as soon as the user logs in: first the client sends the user's userKey to the prosumer via REST service. Then the prosumer asks the Loadbalancer for the address of the provider to make the request to. Once the address has been provided, Travel Manager will send the request to view the likes, via SOAP, to one of the servers on which the Place of City service is available. The latter will check in the Database whether the userKey provided actually corresponds to an existing user in the database.

If the response is positive (therefore the user ID is different from NULL), it means that the Database will return the list of likes to the provider who in turn will forward it to the prosumer via SOAP, who will finally return it to the user thanks to the client via REST.

Instead, in the case in which the userKey does not have a corresponding user ID in the Data Base (therefore the user ID is NULL ), the provider will communicate this to the prosumer via SOAP and, as always, this result will be forwarded by TravelManager to the client via REST.</span></p>

<br>

<br>

<br>

<p class=MsoBodyText style='margin-top:.15pt'><!--[if gte vml 1]><o:wrapblock><v:shape
  id="image6.png" o:spid="_x0000_s1034" type="#_x0000_t75" style='position:absolute;
  margin-left:20.4pt;margin-top:7.85pt;width:542.5pt;height:326.35pt;z-index:5;
  visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image008.png" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=10 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=543 height=327 src="README.fld/image019.jpg" v:shapes="image6.png"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:5.0pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:5.0pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection8>

<p class=MsoListParagraph style='margin-left:64.3pt;line-height:12.3pt;
mso-line-height-rule:exactly;mso-list:l0 level1 lfo4;tab-stops:64.35pt'><![if !supportLists]><span
lang=IT><span style='mso-list:Ignore'>5.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span lang=IT>ALL<span style='letter-spacing:
-.3pt'> </span>COMMENT</span></p>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>When the user wants to view comments left for an activity, the client sends this request via REST to the prosumer, passing the id of the requested activity. Then the prosumer asks the Loadbalancer for the address of the provider to make the request to. Once the address has been provided, Travel Manager will send the request to view comments, via SOAP, to one of the servers on which the Place of City service is available. In this way the provider can then request the desired information from the Data Base. When the database responds, it will return the list of comments to the provider who, in turn, will forward it to the prosumer with the aim of providing it to the user via Beatrice.</span></p>

<br>

<br>

<p class=MsoBodyText style='margin-top:.15pt'><!--[if gte vml 1]><o:wrapblock><v:shape
  id="image7.jpeg" o:spid="_x0000_s1033" type="#_x0000_t75" style='position:absolute;
  margin-left:16.2pt;margin-top:18.8pt;width:551.35pt;height:248.6pt;z-index:6;
  visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image010.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=6 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=552 height=248 src="README.fld/image010.jpg" v:shapes="image7.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:14.5pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:14.5pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection9>

<p class=MsoListParagraph style='margin-left:64.3pt;mso-list:l0 level1 lfo4;
tab-stops:64.35pt'>ADD LIKE</p>


<p class=MsoBodyText style='margin-top:0cm;margin-right:58.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>If the user wishes to like an activity, the client will forward this request to the prosumer via REST service, passing him the userKey and the IDactivity.

Then the prosumer asks the Loadbalancer for the address of the provider to make the request to. Once the address has been provided, Travel Manager will send the request to add a like, via SOAP, to one of the servers on which the Place of City service is available. The provider will then communicate with the Data Base to understand if the action requested by the user is possible. In fact, first PlacesOfCity will provide the userKey to the Database in order to see if the user ID exists for that user. If the response is positive (so the user ID is different from NULL), it means that the like is added.

Subsequently the system will check the outcome of this operation, returning the error or correct functioning response to the prosumer via SOAP, which will finally be sent by the prosumer to the client via REST.

Instead, in the case in which the userKey does not have a corresponding user ID in the Database (therefore the user ID is NULL), the provider will communicate this to the prosumer via SOAP and, as always, this result will be forwarded by TravelManager to the client via REST .</p>

<p class=MsoBodyText><!--[if gte vml 1]><o:wrapblock><v:shape id="image8.jpeg"
  o:spid="_x0000_s1032" type="#_x0000_t75" style='position:absolute;
  margin-left:34.25pt;margin-top:15.75pt;width:543.25pt;height:370.45pt;
  z-index:7;visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image011.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=24 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=544 height=371 src="README.fld/image011.jpg" v:shapes="image8.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:12.0pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<br>

<div class=WordSection10>

<p class=MsoListParagraph style='margin-left:64.3pt;mso-list:l0 level1 lfo4;
tab-stops:64.35pt'>ADD COMMENT</p>

<p class=MsoBodyText style='margin-top:.4pt'><span lang=IT style='font-size:
10.0pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>The process for inserting a comment is very similar to that for inserting a like: the client will forward the comment just inserted by the user to the prosumer, via the REST service, also passing it the userKey and the IDactivity.

Then the prosumer asks the Loadbalancer for the address of the provider to make the request to. Once the address has been provided, Travel Manager will send the request to add a comment, via SOAP, to one of the servers on which the Place of City service is available. The provider will subsequently communicate with the Data Base to understand if the action requested by the user is possible. In fact, first PlacesOfCity will provide the userKey to the Database in order to see if the user ID exists for that user. If the response is positive (so the user ID is different from NULL), it means that the comment is added. Subsequently the system will check the outcome of this operation, returning the error or correct functioning response to the prosumer via SOAP, which will finally be sent by the prosumer to the client via REST.

Instead, in the case in which the userKey does not have a corresponding user ID in the Database (therefore the user ID is NULL), the provider will communicate this to the prosumer via SOAP and, as always, this result will be forwarded by TravelManager to the client via REST .</p>

<br>

<p class=MsoBodyText style='margin-top:.4pt'><!--[if gte vml 1]><o:wrapblock><v:shape
  id="image9.jpeg" o:spid="_x0000_s1031" type="#_x0000_t75" style='position:absolute;
  margin-left:29.35pt;margin-top:14.45pt;width:540.85pt;height:342.15pt;
  z-index:8;visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image012.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=19 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=541 height=343 src="README.fld/image012.jpg" v:shapes="image9.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:10.5pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:10.5pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection11>

<p class=MsoListParagraph style='margin-left:64.3pt;mso-list:l0 level1 lfo4;
tab-stops:64.35pt'>ACTIVITY LIST</p>

<p class=MsoBodyText style='margin-top:.25pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>When the user requests the prosumer, via REST, the list of activities proposed by Beatrice for that city, the prosumer first asks the Loadbalancer for the address of the Place of City provider to which to request this list.
Provided this address,
TravelManager will forward two requests in parallel: the request (via REST) for the weather for that city on that day and the request
(via SOAP) of activities for
that city (at the address that the Loadbalancer returned to the
prosumer). The first will be requested from the PlacesOfCity provider, which in turn will query the Data Base to be able to provide this response. The second
will be requested from the Weather provider. As soon as the providers have responded to the prosumer, TravelManager will manage the newly received information by composing the list of activities according to the weather in the city at that moment, showing only the activities available at that moment according to the weather and time. Once this list has been composed, the result will be shown to the user via Beatrice.</p>

<br>

<p class=MsoBodyText style='margin-top:.5pt'><!--[if gte vml 1]><o:wrapblock><v:shape
  id="image10.jpeg" o:spid="_x0000_s1030" type="#_x0000_t75" style='position:absolute;
  margin-left:20.25pt;margin-top:18.6pt;width:560.45pt;height:348.6pt;
  z-index:9;visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image013.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=10 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=561 height=349 src="README.fld/image013.jpg" v:shapes="image10.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:14.0pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:14.0pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection12>

<h3 style='line-height:12.3pt;mso-line-height-rule:exactly'>APPLICATION SETTINGS</h3>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>In this section it will be illustrated the technologies and tools used and a brief description of how to install the system.</p>

<p class=MsoBodyText style='margin-top:11.45pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt'>TECHNOLOGIES AND TOOLS</p>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 style='margin-left:46.15pt;border-collapse:collapse;mso-table-layout-alt:fixed;
 border:none;mso-border-alt:solid #7F7F7F .5pt;mso-yfti-tbllook:480;mso-padding-alt:
 0cm 0cm 0cm 0cm;mso-border-insideh:.5pt solid #7F7F7F;mso-border-insidev:.5pt solid #7F7F7F'>
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:22.6pt'>
  <td width=321 valign=top style='width:240.8pt;border:none;border-bottom:solid #7F7F7F 1.0pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:#BEC0BF;padding:0cm 0cm 0cm 0cm;
  height:22.6pt'>
  <p class=TableParagraph style='margin-top:4.8pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.3pt;margin-bottom:.0001pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT";color:black;mso-color-alt:windowtext;letter-spacing:-.1pt'>Tool</span></b><b
  style='mso-bidi-font-weight:normal'><span lang=IT style='font-size:10.0pt;
  mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;mso-hansi-font-family:
  "Arial MT";mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext;
  letter-spacing:-.5pt'> </span></b><b style='mso-bidi-font-weight:normal'><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
  mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";color:black;
  mso-color-alt:windowtext;letter-spacing:-.1pt'>or</span></b><b
  style='mso-bidi-font-weight:normal'><span lang=IT style='font-size:10.0pt;
  mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;mso-hansi-font-family:
  "Arial MT";mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext;
  letter-spacing:-.45pt'> </span></b><b style='mso-bidi-font-weight:normal'><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
  mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";color:black;
  mso-color-alt:windowtext;letter-spacing:-.1pt'>Technology</span></b><b
  style='mso-bidi-font-weight:normal'><span lang=IT style='font-size:10.0pt;
  mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;mso-hansi-font-family:
  "Arial MT";mso-bidi-font-family:"Arial MT"'></span></b></p>
  </td>
  <td width=321 valign=top style='width:240.8pt;border:none;border-bottom:solid #7F7F7F 1.0pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:#BEC0BF;padding:0cm 0cm 0cm 0cm;
  height:22.6pt'>
  <p class=TableParagraph style='margin-top:4.8pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.5pt;margin-bottom:.0001pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT";color:black;mso-color-alt:windowtext'>Version</span></b><b
  style='mso-bidi-font-weight:normal'><span lang=IT style='font-size:10.0pt;
  mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;mso-hansi-font-family:
  "Arial MT";mso-bidi-font-family:"Arial MT"'></span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:22.35pt'>
  <td width=321 valign=top style='width:240.8pt;border:solid #BFBFBF 1.0pt;
  border-top:none;mso-border-top-alt:solid #7F7F7F .5pt;mso-border-alt:solid #BFBFBF .25pt;
  mso-border-top-alt:solid #7F7F7F .5pt;padding:0cm 0cm 0cm 0cm;height:22.35pt'>
  <p class=TableParagraph style='margin-top:4.7pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='font-size:
  10.0pt;mso-bidi-font-size:11.0pt'>JDK</span></p>
  </td>
  <td width=321 valign=top style='width:240.8pt;border-top:none;border-left:
  none;border-bottom:solid #BFBFBF 1.0pt;border-right:solid #BFBFBF 1.0pt;
  mso-border-top-alt:solid #7F7F7F .5pt;mso-border-left-alt:solid #BFBFBF .25pt;
  mso-border-alt:solid #BFBFBF .25pt;mso-border-top-alt:solid #7F7F7F .5pt;
  padding:0cm 0cm 0cm 0cm;height:22.35pt'>
  <p class=TableParagraph style='margin-top:4.7pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.35pt;margin-bottom:.0001pt'><span lang=IT style='font-size:
  10.0pt;mso-bidi-font-size:11.0pt'>1.8</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.5pt'>
  <td width=321 valign=top style='width:240.8pt;border:solid #BFBFBF 1.0pt;
  border-top:none;mso-border-top-alt:solid #BFBFBF .25pt;mso-border-alt:solid #BFBFBF .25pt;
  background:#EFEFEF;padding:0cm 0cm 0cm 0cm;height:22.5pt'>
  <p class=TableParagraph style='margin-top:4.05pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='font-size:
  10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:windowtext'>Eclipse<span
  style='letter-spacing:.2pt'> </span>Photon</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
  <td width=321 valign=top style='width:240.8pt;border-top:none;border-left:
  none;border-bottom:solid #BFBFBF 1.0pt;border-right:solid #BFBFBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-left-alt:solid #BFBFBF .25pt;
  mso-border-alt:solid #BFBFBF .25pt;background:#EFEFEF;padding:0cm 0cm 0cm 0cm;
  height:22.5pt'>
  <p class=TableParagraph style='margin-top:4.05pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.35pt;margin-bottom:.0001pt'><span lang=IT style='font-size:
  10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:windowtext'>4.8.0</span><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:22.5pt'>
  <td width=321 valign=top style='width:240.8pt;border:solid #BFBFBF 1.0pt;
  border-top:none;mso-border-top-alt:solid #BFBFBF .25pt;mso-border-alt:solid #BFBFBF .25pt;
  padding:0cm 0cm 0cm 0cm;height:22.5pt'>
  <p class=TableParagraph style='margin-top:4.3pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='font-size:
  10.0pt;mso-bidi-font-size:11.0pt'>Tomcat</span></p>
  </td>
  <td width=321 valign=top style='width:240.8pt;border-top:none;border-left:
  none;border-bottom:solid #BFBFBF 1.0pt;border-right:solid #BFBFBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-left-alt:solid #BFBFBF .25pt;
  mso-border-alt:solid #BFBFBF .25pt;padding:0cm 0cm 0cm 0cm;height:22.5pt'>
  <p class=TableParagraph style='margin-top:4.3pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.35pt;margin-bottom:.0001pt'><span lang=IT style='font-size:
  10.0pt;mso-bidi-font-size:11.0pt'>8.5</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=321 valign=top style='width:240.8pt;border:solid #BFBFBF 1.0pt;
  border-top:none;mso-border-top-alt:solid #BFBFBF .25pt;mso-border-alt:solid #BFBFBF .25pt;
  background:#EFEFEF;padding:0cm 0cm 0cm 0cm;height:22.5pt'>
  <p class=TableParagraph style='margin-top:4.55pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='font-size:
  10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:windowtext'>Maven</span><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
  <td width=321 valign=top style='width:240.8pt;border-top:none;border-left:
  none;border-bottom:solid #BFBFBF 1.0pt;border-right:solid #BFBFBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-left-alt:solid #BFBFBF .25pt;
  mso-border-alt:solid #BFBFBF .25pt;background:#EFEFEF;padding:0cm 0cm 0cm 0cm;
  height:22.5pt'>
  <p class=TableParagraph style='margin-top:4.55pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.35pt;margin-bottom:.0001pt'><span lang=IT style='font-size:
  10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:windowtext'>3.6.0</span><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
</table>

<p class=MsoBodyText><span lang=IT style='font-size:13.0pt;mso-bidi-font-size:
11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:8.9pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt'><span lang=IT style='mso-font-width:
95%'>API REST</span></p>

<p class=MsoBodyText style='margin-top:11.35pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt'><span lang=IT>Below is the list of REST APIs made available by the prosumer:</span></p>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:3.6pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>infoPoint2PointByMeans</span></b></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'><span lang=IT style='color:black;mso-color-alt:
  windowtext'>Get travel times between two points</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:31.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border-top:none;
  border-left:solid #FFFEBF 1.0pt;border-bottom:solid #7F7F7F 1.0pt;border-right:
  solid #FFFEBF 1.0pt;mso-border-top-alt:solid #7F7F7F .5pt;mso-border-top-alt:
  #7F7F7F .5pt;mso-border-left-alt:#FFFEBF .25pt;mso-border-bottom-alt:#7F7F7F .5pt;
  mso-border-right-alt:#FFFEBF .25pt;mso-border-style-alt:solid;background:
  #E5EFB0;padding:0cm 0cm 0cm 0cm;height:31.65pt'>
  <p class=TableParagraph style='margin-top:3.4pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><span style='color:black;mso-color-alt:windowtext;mso-font-width:
  105%;mso-ansi-language:#0C00'>http://localhost:8080/travelmanager/api/maps-info-poiny2point/start/{startLon}/{startLat}/end/</span></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'><span lang=IT style='color:black;mso-color-alt:
  windowtext'>{endLon}/{endLat}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:4.25pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.15pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.6pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.3pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{startLon}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.55pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Longitude of the point relative to the user's position</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:3.85pt;margin-right:
  7.0pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{startLat}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:3.8pt'>Latitude of the point relative to the user's position</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:5;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:4.1pt;margin-right:
  6.6pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{endLon}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.05pt'>Longitude of the point relative to the user's destination</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:6;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top style='width:88.2pt;border-top:none;border-left:
  solid #FFFEBF 1.0pt;border-bottom:solid #FFFEBF 1.0pt;border-right:solid #BFBFBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-top-alt:#BFBFBF;mso-border-left-alt:
  #FFFEBF;mso-border-bottom-alt:#FFFEBF;mso-border-right-alt:#BFBFBF;
  mso-border-style-alt:solid;mso-border-width-alt:.25pt;padding:0cm 0cm 0cm 0cm;
  height:22.5pt'>
  <p class=TableParagraph align=center style='margin-top:4.35pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.4pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{endLat}</span></b></p>
  </td>
  <td width=525 valign=top style='width:393.4pt;border-top:none;border-left:
  none;border-bottom:solid #FFFEBF 1.0pt;border-right:solid #FFFEBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-left-alt:solid #BFBFBF .25pt;
  mso-border-top-alt:#BFBFBF;mso-border-left-alt:#BFBFBF;mso-border-bottom-alt:
  #FFFEBF;mso-border-right-alt:#FFFEBF;mso-border-style-alt:solid;mso-border-width-alt:
  .25pt;padding:0cm 0cm 0cm 0cm;height:22.5pt'>
  <p class=TableParagraph style='margin-top:4.3pt'>Latitude of the point relative to the user's destination</p>
  </td>
 </tr>
</table>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:4.35pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>routePoint2Point</span></b></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'>Get the route to the desired activity through a specific means of transport</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:31.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border-top:none;
  border-left:solid #FFFEBF 1.0pt;border-bottom:solid #7F7F7F 1.0pt;border-right:
  solid #FFFEBF 1.0pt;mso-border-top-alt:solid #7F7F7F .5pt;mso-border-top-alt:
  #7F7F7F .5pt;mso-border-left-alt:#FFFEBF .25pt;mso-border-bottom-alt:#7F7F7F .5pt;
  mso-border-right-alt:#FFFEBF .25pt;mso-border-style-alt:solid;background:
  #E5EFB0;padding:0cm 0cm 0cm 0cm;height:31.65pt'>
  <p class=TableParagraph style='margin-top:3.15pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><span style='color:black;mso-color-alt:windowtext;mso-font-width:
  105%;mso-ansi-language:#0C00'>http://localhost:8080/travelmanager/api/maps-coordinate/means/{means}/start/{startLon}/</span></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'><span lang=IT style='color:black;mso-color-alt:
  windowtext'>{startLat}/end/{endLon}/{endLat}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.95pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:3.9pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:4.35pt;margin-right:
  6.9pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{means}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.3pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Chosen means of transport</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;height:22.45pt'>
  <td width=118 valign=top style='width:88.2pt;border-top:none;border-left:
  solid #FFFEBF 1.0pt;border-bottom:solid #BFBFBF 1.0pt;border-right:solid #BFBFBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-alt:solid #BFBFBF .25pt;
  mso-border-left-alt:solid #FFFEBF .25pt;padding:0cm 0cm 0cm 0cm;height:22.45pt'>
  <p class=TableParagraph align=center style='margin-top:3.6pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.3pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'>{startLon}</b></p>
  </td>
  <td width=525 valign=top style='width:393.4pt;border-top:none;border-left:
  none;border-bottom:solid #BFBFBF 1.0pt;border-right:solid #FFFEBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-left-alt:solid #BFBFBF .25pt;
  mso-border-alt:solid #BFBFBF .25pt;mso-border-right-alt:solid #FFFEBF .25pt;
  padding:0cm 0cm 0cm 0cm;height:22.45pt'>
  <p class=TableParagraph style='margin-top:4.55pt'>Longitude of the point relative to the user's position</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:5;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.85pt;margin-right:
  7.0pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{startLat}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:3.8pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Latitude of the point relative to the user's position</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:6;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:4.1pt;margin-right:
  6.6pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{endLon}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.05pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Longitude of the point relative to the user's destination</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:7;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top style='width:88.2pt;border-top:none;border-left:
  solid #FFFEBF 1.0pt;border-bottom:solid #FFFEBF 1.0pt;border-right:solid #BFBFBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-top-alt:#BFBFBF;mso-border-left-alt:
  #FFFEBF;mso-border-bottom-alt:#FFFEBF;mso-border-right-alt:#BFBFBF;
  mso-border-style-alt:solid;mso-border-width-alt:.25pt;background:#EFEFEF;
  padding:0cm 0cm 0cm 0cm;height:22.5pt'>
  <p class=TableParagraph align=center style='margin-top:4.35pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.4pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{endLat}</span></b></p>
  </td>
  <td width=525 valign=top style='width:393.4pt;border-top:none;border-left:
  none;border-bottom:solid #FFFEBF 1.0pt;border-right:solid #FFFEBF 1.0pt;
  mso-border-top-alt:solid #BFBFBF .25pt;mso-border-left-alt:solid #BFBFBF .25pt;
  mso-border-top-alt:#BFBFBF;mso-border-left-alt:#BFBFBF;mso-border-bottom-alt:
  #FFFEBF;mso-border-right-alt:#FFFEBF;mso-border-style-alt:solid;mso-border-width-alt:
  .25pt;background:#EFEFEF;padding:0cm 0cm 0cm 0cm;height:22.5pt'>
  <p class=TableParagraph style='margin-top:4.3pt'>Latitude of the point relative to the user's destination</p>
  </td>
 </tr>
</table>

</div>

<span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection13>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:3.4pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>register</span></b></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'><span lang=IT style='color:black;mso-color-alt:
  windowtext'>Registration for the web application</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:22.25pt'>
  <td width=642 colspan=2 valign=top >
  <p class=TableParagraph style='margin-top:3.25pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span style='color:black;
  mso-color-alt:windowtext;mso-ansi-language:#0C00'>http://localhost:8080/travelmanager/api/register/{name}/{surname}/{email}/{password}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.5pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.4pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.85pt;margin-right:
  6.8pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{name}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:3.8pt'>User name</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:4.1pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.3pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{surname}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.05pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>User surname</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:5;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.35pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.4pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{email}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.3pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>User Email</span><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:6;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:3.6pt;margin-right:
  6.6pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{password}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:3.55pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>User Password</span></p>
  </td>
 </tr>
</table>



<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT style='font-size:
12.0pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:3.8pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>login</span></b></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'><span lang=IT style='color:black;mso-color-alt:
  windowtext'>Login to access at the web application</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:22.25pt'>
  <td width=642 colspan=2 valign=top >
  <p class=TableParagraph style='margin-top:2.6pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='color:
  black;mso-color-alt:windowtext'>http://localhost:8080/travelmanager/api/login/{email}/{password}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.85pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:3.8pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:4.25pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.4pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{email}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.15pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>User Email</span><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:3.5pt;margin-right:
  6.6pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{password}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.4pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>User Password</span></p>
  </td>
 </tr>
</table>





<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:3.5pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-family:"Arial",sans-serif;mso-hansi-font-family:
  "Arial MT";mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>activityList</span></b></p>
  <p class=TableParagraph style='margin-top:.35pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='color:
  black;mso-color-alt:windowtext'>Get the list of activities based on a specific city</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:22.25pt'>
  <td width=642 colspan=2 valign=top >
  <p class=TableParagraph style='margin-top:3.3pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='color:
  black;mso-color-alt:windowtext;mso-font-width:105%'>http://localhost:8080/travelmanager/api/city-activities/{city}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.55pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.5pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.9pt;margin-right:
  7.2pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{city}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:3.85pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Name of the city to visit</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
</table>





<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:3.9pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>activityListByProfile</span></b></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'>Get the list of activities based on a specific city and a profile chosen by the user</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:22.25pt'>
  <td width=642 colspan=2 valign=top >
  <p class=TableParagraph style='margin-top:2.7pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='color:
  black;mso-color-alt:windowtext;mso-font-width:105%'>http://localhost:8080/travelmanager/api/city-activity-by-profile/{city}/profile/{profile}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.95pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:3.9pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:4.35pt;margin-right:
  7.2pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{city}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.3pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Name of the city to visit</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:3.6pt;margin-right:
  6.55pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{profile}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.55pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Requested profile (tasty, adventure, nerd)</span></p>
  </td>
 </tr>
</table>

</div>

<span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection14>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:3.4pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>addLike</span></b></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'><span lang=IT style='color:black;mso-color-alt:
  windowtext'>Add likes to an activity</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:22.25pt'>
  <td width=642 colspan=2 valign=top >
  <p class=TableParagraph style='margin-top:3.25pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='color:
  black;mso-color-alt:windowtext'>http://localhost:8080/travelmanager/api/like/activities/{activityId}/user-key/{userKey}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.5pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.4pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.85pt;margin-right:
  6.5pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{activityId}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:3.8pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Id of the liked activity</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:4.1pt;margin-right:
  6.95pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{userKey}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.05pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>User identification key</span></p>
  </td>
 </tr>
</table>


<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:4.3pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>LikeByUse</span></b></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'><span lang=IT style='color:black;mso-color-alt:
  windowtext'>Return the list of activities to which the user has assigned a like</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:22.25pt'>
  <td width=642 colspan=2 valign=top >
  <p class=TableParagraph style='margin-top:3.1pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='color:
  black;mso-color-alt:windowtext'>http://localhost:8080/travelmanager/api/user-likes/{userKey}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:4.35pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.3pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.75pt;margin-right:
  6.95pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{userKey}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.65pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>User identification key</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
</table>





<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:3.75pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
  exactly'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>addComment</span></b></p>
  <p class=TableParagraph style='margin-left:4.15pt;line-height:12.3pt;
  mso-line-height-rule:exactly'><span lang=IT style='color:black;mso-color-alt:
  windowtext'>Add a comment to an activity</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:31.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border-top:none;
  border-left:solid #FFFEBF 1.0pt;border-bottom:solid #7F7F7F 1.0pt;border-right:
  solid #FFFEBF 1.0pt;mso-border-top-alt:solid #7F7F7F .5pt;mso-border-top-alt:
  #7F7F7F .5pt;mso-border-left-alt:#FFFEBF .25pt;mso-border-bottom-alt:#7F7F7F .5pt;
  mso-border-right-alt:#FFFEBF .25pt;mso-border-style-alt:solid;background:
  #E5EFB0;padding:0cm 0cm 0cm 0cm;height:31.65pt'>
  <p class=TableParagraph style='margin-top:3.05pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT
  style='color:black;mso-color-alt:windowtext'>http://localhost:8080/travelmanager/api/add-comment/activities/{activityId}/user-key/{userKey}/<span
  style='letter-spacing:.05pt'> </span><span style='mso-font-width:105%'>title/{title}/comment/{comment}</span></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:4.35pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.3pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.7pt;margin-right:
  6.5pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{activityId}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.65pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>ID of the activity that the user want to leave a comment on</span><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:3.95pt;margin-right:
  6.95pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{userKey}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:3.9pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>User identification key</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:5;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:4.2pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.0pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{title}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.15pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Comment title</span><span lang=IT style='font-size:10.0pt;
  mso-bidi-font-size:11.0pt'></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:6;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top >
  <p class=TableParagraph align=center style='margin-top:3.45pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:6.95pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>{comment}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:4.4pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Body comment</span></p>
  </td>
 </tr>
</table>





<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 >
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:32.65pt'>
  <td width=642 colspan=2 valign=top style='width:481.6pt;border:solid #FFFEBF 1.0pt;
  border-bottom:solid #7F7F7F 1.0pt;mso-border-alt:solid #FFFEBF .25pt;
  mso-border-bottom-alt:solid #7F7F7F .5pt;background:peachpuff;padding:0cm 0cm 0cm 0cm;
  height:32.65pt'>
  <p class=TableParagraph style='margin-top:3.45pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-family:"Arial",sans-serif;mso-hansi-font-family:
  "Arial MT";mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>allComment</span></b></p>
  <p class=TableParagraph style='margin-top:.35pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='color:
  black;mso-color-alt:windowtext'>Returns all comments associated with an activity</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:22.25pt'>
  <td width=642 colspan=2 valign=top >
  <p class=TableParagraph style='margin-top:3.3pt;margin-right:0cm;margin-bottom:
  0cm;margin-left:4.15pt;margin-bottom:.0001pt'><span lang=IT style='color:
  black;mso-color-alt:windowtext;mso-font-width:105%'>http://localhost:8080/travelmanager/api/comments-by-activity/activities/{activityId}</span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:22.35pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.55pt;margin-right:
  7.4pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT"'>PARAMETER</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.45pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIPTION</span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;mso-yfti-lastrow:yes;height:22.5pt'>
  <td width=118 valign=top>
  <p class=TableParagraph align=center style='margin-top:3.9pt;margin-right:
  6.5pt;margin-bottom:0cm;margin-left:7.65pt;margin-bottom:.0001pt;text-align:
  center'><b style='mso-bidi-font-weight:normal'><span lang=IT
  style='font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";
  mso-bidi-font-family:"Arial MT";color:black;mso-color-alt:windowtext'>{activityId}</span></b></p>
  </td>
  <td width=525 valign=top >
  <p class=TableParagraph style='margin-top:3.85pt'>Activity ID</p>
  </td>
 </tr>
</table>
</div>

<span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection15>


<h3 style='margin-top:9.5pt'><span lang=IT style='font-size:13.0pt;mso-bidi-font-size:
11.0pt;font-family:"Arial MT",sans-serif;mso-hansi-font-family:Arial;
position:relative;top:-1.0pt;mso-text-raise:1.0pt;font-weight:normal;
mso-bidi-font-weight:bold'>-<span style='letter-spacing:3.45pt'> </span></span><span
lang=IT>How to run the project</span></h3>

<p class=MsoBodyText style='margin-top:11.35pt;margin-right:211.05pt;
margin-bottom:0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:190%'><span
lang=IT>using eclipse, import the contents of the PROJECT folder: File/Import/Existing Maven Projects

Once all the packages that make up the project have been imported, import the database dump present in the folder into phpmyadmin:</p>

<p class=MsoBodyText style='margin-top:.35pt'><span lang=IT style='font-size:
10.5pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-left:46.0pt'><i style='mso-bidi-font-style:
normal'><span lang=IT style='font-family:"Arial",sans-serif;mso-hansi-font-family:
"Arial MT";mso-bidi-font-family:"Arial MT"'>PROJECTS/SQL/placesofcity.sql<o:p></o:p></span></i></p>

<p class=MsoBodyText style='margin-top:.4pt'><i style='mso-bidi-font-style:
normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT"'><o:p>&nbsp;</o:p></span></i></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Then create a new database called placesofcity and import the previously described file. The default project expects to access the database on port 8889. If this is not the same as the one running on your PC, you will need to change it in the access configuration in the file located in:</p>

<p class=MsoBodyText style='margin-top:.3pt'><span lang=IT style='font-size:
10.5pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-left:46.0pt'><i style='mso-bidi-font-style:
normal'><span lang=EN-US style='font-family:"Arial",sans-serif;mso-hansi-font-family:
"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:EN-US'>placesofcity/src/main/webapp/META-INF/context.xml.<o:p></o:p></span></i></p>

<p class=MsoBodyText style='margin-top:.3pt'><i style='mso-bidi-font-style:
normal'><span lang=EN-US style='font-size:10.5pt;mso-bidi-font-size:11.0pt;
font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:EN-US'><o:p>&nbsp;</o:p></span></i></p>

<p class=MsoNormal style='margin-left:46.0pt'><span lang=EN-US
style='mso-ansi-language:EN-US'>Modify:<span style='letter-spacing:2.9pt'> </span></span><i
style='mso-bidi-font-style:normal'><span lang=EN-US style='font-family:"Arial",sans-serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
EN-US'>url=&quot;jdbc:mysql://localhost:8889/placesofcity?verifyServerCertificate=false&quot;<o:p></o:p></span></i></p>

<p class=MsoBodyText style='margin-top:.35pt'><i style='mso-bidi-font-style:
normal'><span lang=EN-US style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:EN-US'><o:p>&nbsp;</o:p></span></i></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>changing port 8889 with the one you have available. If you want to change the name of the database on phpmyadmin you will need to modify it line.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Once all the steps explained above have been done, you will need to create an execution server for the project. Still inside eclipse follow the path:</span></p>

<p class=MsoBodyText style='margin-top:.35pt'><span lang=IT style='font-size:
10.5pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-left:46.0pt'><i style='mso-bidi-font-style:
normal'><span lang=IT style='font-family:"Arial",sans-serif;mso-hansi-font-family:
"Arial MT";mso-bidi-font-family:"Arial MT"'>File/New/Other/Server<o:p></o:p></span></i></p>

<p class=MsoBodyText style='margin-top:.35pt'><i style='mso-bidi-font-style:
normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT"'><o:p>&nbsp;</o:p></span></i></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>once the server configuration window is open, choose the version &quot;Tomcat v8.5 Server&quot; importing the path of the Tomcat 8.5 folder.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT style='font-size:
10.0pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Before running the entire project on the server you need to setup two more servers. This is because the loadbalancer expects to find a server running on port 8081 and one on port 8082. These two will host the execution of the service &quot;placesofcity&quot;.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:54.75pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Once all the servers have been created, run the placesofcity service on servers 8081 and 8082 and launch the execution of all the services created on the server running on port 8080 INCLUDED placesofcity.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:57.9pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>If you want to create other instances for the &quot;placesofcity&quot; service it is necessary to create other servers, run the service on them and modify the loadbalancer so as to make it aware of the existence of other servers that use the service. To add more servers to the loadbalacer go to:<o:p></o:p></span></p>

<p class=MsoBodyText style='margin-top:.25pt'><span lang=EN-US
style='font-size:10.5pt;mso-bidi-font-size:11.0pt;mso-ansi-language:EN-US'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-left:46.0pt;line-height:101%'><i
style='mso-bidi-font-style:normal'><span lang=EN-US style='font-family:"Arial",sans-serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
EN-US'>loadbalancer/src/main/java/it/univaq/disim/sose/project./loadbalancer/business/impl/ LoadBalancerServiceImpl.java<o:p></o:p></span></i></p>

<p class=MsoBodyText style='margin-top:11.45pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Once the file is open, add all the instances you want to the list, keeping in mind the port in which they are executed.</span></p>

<p class=MsoBodyText style='margin-top:.3pt'><span lang=IT style='font-size:
10.5pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-top:.05pt;margin-right:0cm;margin-bottom:0cm;
margin-left:46.0pt;margin-bottom:.0001pt'><i style='mso-bidi-font-style:normal'><span
lang=EN-US style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
EN-US'>List&lt;ServerObject&gt;<span style='letter-spacing:-.35pt'> </span>servers<span
style='letter-spacing:-.35pt'> </span>=<span style='letter-spacing:-.3pt'> </span>new<span
style='letter-spacing:-.35pt'> </span>ArrayList&lt;ServerObject&gt;();<o:p></o:p></span></i></p>

<p class=MsoNormal style='margin-top:.5pt;margin-right:0cm;margin-bottom:0cm;
margin-left:46.0pt;margin-bottom:.0001pt'><i style='mso-bidi-font-style:normal'><span
lang=EN-US style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
EN-US'>servers.add(new<span style='letter-spacing:1.35pt'> </span>ServerObject(&quot;http://localhost:8080/placesofcity/services/placesofcity?wsdl&quot;,<span
style='letter-spacing:1.4pt'> </span>5,<span style='letter-spacing:1.4pt'> </span>5));<o:p></o:p></span></i></p>

<p class=MsoNormal style='margin-top:.5pt;margin-right:0cm;margin-bottom:0cm;
margin-left:46.0pt;margin-bottom:.0001pt'>ServerObject(&quot;http://localhost:8081/placesofcity/services/placesofcity?wsdl&quot;,1,5));</p>

<p class=MsoNormal style='margin-top:.5pt;margin-right:0cm;margin-bottom:0cm;
margin-left:46.0pt;margin-bottom:.0001pt'>servers.add(new ServerObject(&quot;http://localhost:8082/placesofcity/services/placesofcity?wsdl&quot;,20, 5));</p>

<br>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>The list takes an object of type ServerObject and expects three parameters: one of type String and the remaining of type Integer.
The string PARAMETER is the URL of the running service and is what the loadbalancer will return when it is invoked. The second and third PARAMETER identify the maximum number of requests that can be executed in a time interval, where: the second PARAMETER is the number of requests and the third PARAMETER is the time interval.</p>

</div>

<span lang=IT style='font-size:11.0pt;line-height:95%;font-family:"Arial MT",sans-serif;
mso-fareast-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
IT;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=all
style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection16>

<p class=MsoBodyText style='margin-top:4.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>
In the first case, the server identified with port 8080 can execute 5 requests in 5 seconds, the server on port 8081 1 request in an interval of 5 seconds and the third 20 requests in an interval of 5 seconds.
Once these configurations have been completed, it is possible to run the entire project and access the address via browser:
<br>
localhost:8080/beatrice
</p>

<h3 style='margin-top:9.5pt;margin-right:0cm;margin-bottom:0cm;margin-left:
58.0pt;margin-bottom:.0001pt;text-indent:-12.0pt;mso-list:l1 level1 lfo6;
tab-stops:58.0pt'>To use the realized ARCHETYPE:</h3>

<p class=MsoBodyText style='margin-top:11.35pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
exactly'>In the ARCHETYPE folder there are two folders:</p>

<p class=MsoListParagraph style='margin-top:.2pt;margin-right:135.25pt;
margin-bottom:0cm;margin-left:94.2pt;margin-bottom:.0001pt;text-indent:-12.25pt;
line-height:95%;mso-list:l1 level2 lfo6;tab-stops:89.35pt'>&quot;generic&quot; allows you to instantiate a new project with a basic example by automatically preconfiguring it</p>

<p class=MsoListParagraph style='margin-top:0cm;margin-right:67.3pt;margin-bottom:
0cm;margin-left:94.2pt;margin-bottom:.0001pt;text-indent:-12.25pt;line-height:
95%;mso-list:l1 level2 lfo6;tab-stops:89.35pt'>&quot;specific&quot; creates the structure used to create the prosumer, therefore specifies the basic structure used</p>

<p class=MsoBodyText style='margin-top:11.4pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
exactly'>TO USE THE ARCHETYPE</p>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:58.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>open the Terminal and go to the ARCHETYPE folder. Once inside the folder type the command:</p>

<p class=MsoNormal style='margin-left:46.0pt'><b>mvn</b> clean install</p>

<br>

<p class=MsoBodyText style='margin-top:.05pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Once the command has been executed, exit the folder and position yourself in the folder in which you want to generate the project. Then execute the command:</p>

<p class=MsoBodyText style='margin-top:.35pt'></p>

<p class=MsoNormal style='margin-top:0cm;margin-right:86.15pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:101%'>

<b>mvn</b> archetype:generate -DgroupId=it.univaq.sose.application -DartifactId=my_application - Dversion=0.0.1-SNAPSHOT -DarchetypeGroupId=it.univaq.disim.sose.project - DarchetypeArtifactId=prosumer-archetype -DarchetypeVersion=1.0.0-SNAPSHOT - DinteractiveMode=false
</p>

<p class=MsoBodyText style='margin-top:10.9pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt'>Editing to your liking:</p>

<br>

<p class=MsoBodyText style='margin-left:46.0pt;line-height:12.0pt;mso-line-height-rule:
exactly'>-DartifactId</p>

<p class=MsoBodyText style='margin-left:46.0pt;line-height:12.0pt;mso-line-height-rule:
exactly'>-Dversion</p>

<p class=MsoBodyText style='margin-left:46.0pt;line-height:12.3pt;mso-line-height-rule:
exactly'>-DarchetypeGroupId</p>

<p class=MsoBodyText style='margin-top:11.35pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt'>e mantenendo invariate:</p>

<p class=MsoBodyText style='margin-top:11.35pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
exactly'>-DarchetypeArtifactId</p>

<p class=MsoBodyText style='margin-left:46.0pt;line-height:12.3pt;mso-line-height-rule:
exactly'>-DarchetypeVersion</p>

</div>

<br>

<div class=WordSection17>

<h3><span lang=IT>DESKTOP APPLICATION</h3>

<br>

<p class=MsoBodyText style='margin-top:0cm;margin-right:71.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>The following view shows what is displayed as soon as you access the web application (without having logged in):</span></p>

<p class=MsoBodyText style='margin-top:.05pt'><!--[if gte vml 1]><o:wrapblock><v:shape
  id="image11.jpeg" o:spid="_x0000_s1029" type="#_x0000_t75" style='position:absolute;
  margin-left:56.7pt;margin-top:13.55pt;width:478.1pt;height:259.1pt;z-index:10;
  visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image020.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=47 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=478 height=259 src="README.fld/image020.jpg" v:shapes="image11.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

<p class=MsoBodyText><span lang=IT style='font-size:13.0pt;mso-bidi-font-size:
11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:9.9pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>The following view shows what happens when you select an activity from the list on the left side of the image. Please note that the travel times to reach this activity are indicated depending on the vehicle shown:</span></p>

<br>

<p class=MsoBodyText><!--[if gte vml 1]><o:wrapblock><v:shape id="image12.jpeg"
  o:spid="_x0000_s1028" type="#_x0000_t75" style='position:absolute;
  margin-left:56.7pt;margin-top:8.9pt;width:477.4pt;height:258pt;z-index:11;
  visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image021.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=47 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=477 height=258 src="README.fld/image021.jpg" v:shapes="image12.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
<span lang=IT style='font-size:6.0pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

<span lang=IT style='font-size:6.0pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection18>

<p class=MsoBodyText style='margin-top:4.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>By clicking on one of the three proposed means of transport, the most convenient route to take with that means is displayed:</span></p>

<br>

<p class=MsoBodyText style='margin-top:.2pt'><!--[if gte vml 1]><o:wrapblock><v:shape
  id="image13.jpeg" o:spid="_x0000_s1027" type="#_x0000_t75" style='position:absolute;
  margin-left:56.7pt;margin-top:10.2pt;width:477.4pt;height:258.75pt;z-index:12;
  visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image022.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=47 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=477 height=258 src="README.fld/image022.jpg" v:shapes="image13.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
</p>

<p class=MsoBodyText><span lang=IT style='font-size:13.0pt;mso-bidi-font-size:
11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:10.1pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Once logged in, you can view the likes left with your profile and the form to insert a new comment for a given activity:</span></p>

<br>

<p class=MsoBodyText style='margin-top:.35pt'><!--[if gte vml 1]><o:wrapblock><v:shape
  id="image14.jpeg" o:spid="_x0000_s1026" type="#_x0000_t75" style='position:absolute;
  margin-left:56.7pt;margin-top:10.4pt;width:477pt;height:258.35pt;z-index:13;
  visibility:visible;mso-wrap-style:square;mso-width-percent:0;
  mso-height-percent:0;mso-wrap-distance-left:0;mso-wrap-distance-top:0;
  mso-wrap-distance-right:0;mso-wrap-distance-bottom:0;
  mso-position-horizontal:absolute;mso-position-horizontal-relative:page;
  mso-position-vertical:absolute;mso-position-vertical-relative:text;
  mso-width-percent:0;mso-height-percent:0;mso-width-relative:page;
  mso-height-relative:page'>
  <v:imagedata src="README.fld/image023.jpg" o:title=""/>
  <w:wrap type="topAndBottom" anchorx="page"/>
 </v:shape><![endif]--><![if !vml]><span style='mso-ignore:vglayout'>
 <table cellpadding=0 cellspacing=0 align=left>
  <tr>
   <td width=47 height=0></td>
  </tr>
  <tr>
   <td></td>
   <td><img width=477 height=258 src="README.fld/image023.jpg" v:shapes="image14.jpeg"></td>
  </tr>
 </table>
 </span><![endif]><!--[if gte vml 1]></o:wrapblock><![endif]--><br
style='mso-ignore:vglayout' clear=ALL>
</p>

</div>

</body>

</html>
