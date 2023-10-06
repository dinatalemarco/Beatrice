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

<p class=MsoBodyText><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:
11.0pt;font-family:"Times New Roman",serif;mso-hansi-font-family:"Arial MT";
mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:
11.0pt;font-family:"Times New Roman",serif;mso-hansi-font-family:"Arial MT";
mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:
11.0pt;font-family:"Times New Roman",serif;mso-hansi-font-family:"Arial MT";
mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:
11.0pt;font-family:"Times New Roman",serif;mso-hansi-font-family:"Arial MT";
mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:
11.0pt;font-family:"Times New Roman",serif;mso-hansi-font-family:"Arial MT";
mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:
11.0pt;font-family:"Times New Roman",serif;mso-hansi-font-family:"Arial MT";
mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT style='font-size:
11.5pt;mso-bidi-font-size:11.0pt;font-family:"Times New Roman",serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></p>

<p class=MsoTitle><span lang=IT style='color:#3D3C3D'>Beatrice</span></p>

<p class=MsoBodyText><b style='mso-bidi-font-weight:normal'><span lang=IT
style='font-size:30.0pt;mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT"'><o:p>&nbsp;</o:p></span></b></p>

</div>

<span lang=IT style='font-size:16.0pt;mso-bidi-font-size:11.0pt;font-family:
"Arial MT",sans-serif;mso-fareast-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:IT;mso-fareast-language:EN-US;mso-bidi-language:
AR-SA'><br clear=all style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection2>

<h1><span lang=IT>INTRODUZIONE</span></h1>

<br>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.3pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Il progetto è un’applicazione SOA-based che ha lo scopo di fornire agli utenti delle possibili attività da fare in una città (nel nostro caso L’Aquila ). Gli utenti possono consultare la cartina della città (fornita da un provider esterno, Map BOX ) sulla quale verranno mostrate delle attività proposte per quella città dall’applicazione (grazie ad un provider da noi implementato, PlacesOfCity ). Il mondo in cui verranno consigliate all’utente dipende dall’orario corrente e dal tempo atmosferico( fornito da un provider esterno, Weather ). Infatti se il locale è chiuso non verrà proposto o, se piove, non saranno proposte le escursioni in montagna o attività simili che sono sconvenienti da praticare con tempo avverso. Queste proposte ricreative possono essere consigliate all’utente anche secondo un filtro di interesse che si divide in tre profili: Adventure, Tasty e Nerd. Il primo profilo comprende tutte le attività “movimentate” che possono essere escursioni o sport da praticare. Il secondo profilo riguarda tutti locali culinari: dai pub ai locali gourmè, ma anche birrerie, pasticcerie o trattorie. L’ultimo profilo è quello nerd che consiglia tutti i luoghi storici della città, i monumenti ed i musei. Oltre a riportare i luoghi consigliati sulla mappa, è possibile cliccare sull’attività desiderata: in questo modo verranno mostrati 3 possibili modi per raggiungere tale attività ( bicicletta, auto o a piedi ) con i relativi tempi di percorrenza e, se se ne sceglie uno, verrà mostrato il percorso per arrivare al luogo desiderato dalla propria posizione.</p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>L’utente ha la possibilità di registrarsi al sistema e, quando accede all’applicazione tramite login, può manifestare il suo gradimento per un’attività lasciando un like o un commento.</p>

<br>

<h1 style='margin-top:9.2pt;line-height:12.3pt;mso-line-height-rule:exactly'><span
lang=IT>OVERVIEW</span></h1>

<p class=MsoBodyText style='margin-left:46.0pt;line-height:12.3pt;mso-line-height-rule:
exactly'>L’immagine sottostante mostra in che modo sono connesse le componenti del sistema.</p>

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
style='letter-spacing:.8pt'> </span></span></b><span lang=IT>è la componente che rappresenta l’applicazione web con cui si interfaccia l’utente.<span style='letter-spacing:-2.95pt'> </span>L’implementazione
è stata realizzata tramite Javascript,
html e css.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:0cm;margin-right:53.85pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:92%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>PlacesOfCity: </span></b><span lang=IT>è la componente che fornisce informazioni sui luoghi consigliati della città. Al suo interno fornisce i nomi delle attività, le coordinate per raggiungerle, orari di apertura e chiusura del luogo che fornisce l’attività indicata, il clima consigliato per svolgere tale attività ed il suo profilo<span
style='letter-spacing:-.1pt'> </span>che può<span
style='letter-spacing:-.1pt'> </span>essere uno<span style='letter-spacing:-.1pt'> </span>tra: Nerd<span style='letter-spacing:-.1pt'> </span>(se si desidera<span
style='letter-spacing:-.1pt'> </span>visitare musei<span style='letter-spacing:-.1pt'> </span>o monumenti),<span style='letter-spacing:-.1pt'> </span>Adventure (<span style='letter-spacing:-.1pt'> </span>per attività sportive o ricreative) o Tasty (per pub e ristoranti). Permette poi la registrazione dell’utente al sistema e quindi anche il servizio di login. Inoltre fornisce all’utente registrato di lasciare like e commenti ad ogni attività presente nell’elenco delle proposte del sistema. Questo servizio
è fruibile tramite il protocollo di
comunicazione SOAP.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:.05pt;margin-right:74.3pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:90%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>MapBOX: </span></b><span lang=IT>è la componente che fornisce la comunicazione con le mappe e le funzionalità ad<span style='letter-spacing:-2.95pt'> </span>esse connesse ( come geolocalizzazione, informazioni sui tempi di percorrenza, indicazioni stradali, …). Questo servizio è fruibile tramite comunicazione REST.</span></p>

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
lang=IT>: è la componente che viene interrogata per la richiesta delle previsioni meteo della città in cui si trova l’utente. Questo servizio è fruibile tramite comunicazione REST.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:.05pt;margin-right:56.6pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:92%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>Travel Manager: </span></b><span
lang=IT>è il Prosumer che gestisce le richieste fatte tramite la web Application, servendosi di servizi a lui esterni (Providers). Il servizio
finale fornito dal prosumer, per quanto riguarda la parte di visualizzazione e di filtraggio dei servizi offerti in una città, è un elaborato dei servizi da lui consumati: condizioni meteorologiche, orario ed attività di una città vengono combinate per fornire un elenco delle attività da suggerire all’utente per visitare la città. Travel Manager fornisce inoltre delle REST API che permettono di consultare la mappa della città con le sue relative funzionalità, descritte in dettaglio precedentemente in MapBox. Lo stesso vale per i servizi di login, registrazione, like e commenti forniti e spiegati precedentemente in Places Of City. Per quanto riguarda invece la comunicazione, il prosumer utilizza sia la comunicazione SOAP<span
style='letter-spacing:-.1pt'> </span>( per<span
style='letter-spacing:-.1pt'> </span>comunicare con il<span
style='letter-spacing:-.1pt'> </span>Loadbalancer e<span style='letter-spacing:-.1pt'> </span>con il Provider<span
style='letter-spacing:-.1pt'> </span>Places Of<span style='letter-spacing:-.1pt'> </span>City ) che<span
style='letter-spacing:-.1pt'> </span>quella REST</span></p>

<p class=MsoBodyText style='margin-left:55.0pt;line-height:12.2pt;mso-line-height-rule:
exactly'><span lang=IT>( con i due
Provider Weather e Map Box, e con la Web Application Beatrice ).</span></p>

<p class=MsoBodyText style='margin-top:.25pt'><span lang=IT><o:p>&nbsp;</o:p></span></p>

<p class=MsoListParagraph style='margin-top:0cm;margin-right:55.85pt;
margin-bottom:0cm;margin-left:55.0pt;margin-bottom:.0001pt;text-indent:-9.0pt;
line-height:92%;mso-list:l2 level1 lfo2;tab-stops:55.0pt'><![if !supportLists]><span
lang=IT style='font-family:"Arial",sans-serif;mso-fareast-font-family:Arial;
position:relative;top:.5pt;mso-text-raise:-.5pt;mso-font-width:99%;mso-bidi-font-weight:
bold'><span style='mso-list:Ignore'>•<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><b style='mso-bidi-font-weight:normal'><span
lang=IT style='font-family:"Arial",sans-serif;mso-bidi-font-family:"Arial MT"'>Loadbalancer : </span></b><span
lang=IT>è una componente che gestisce il carico di lavoro tramite un algoritmo di scheduling di tipo round robin: quando viene fatta una richiesta al prosumer quest’ultimo<span style='letter-spacing:
.45pt'> </span>invoca<span style='letter-spacing:-2.95pt'> </span>il Loadbalancer per richiedere l’indirizzo di connessione ad uno dei server di Place Of City. Il Loadbalancer restituisce un indirizzo di connessione al servizio a seconda del numero di connessioni che ha assegnato in un certo intervallo di tempo e a seconda del numero di connessioni che questo supporta. Di conseguenza, nel momento in cui ad un server vengono assegnate un numero di richieste pari a quello massimo che può supportare ( numero scelto nell’algoritmo di balancing ) in un determinato intervallo di tempo, il Loadbalancer verificherà la possibilità di passare la richiesta al server successivo nella lista dei server disponibili, tramite l’algoritmo di Round Robin, fino a trovare il primo server disponibile. L’interrogazione viene fatta dal Prosumer
al Loadbalancer tramite chiamate SOAP.</span></p>

</div>

<span lang=IT style='font-size:11.0pt;line-height:92%;font-family:"Arial MT",sans-serif;
mso-fareast-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
IT;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=all
style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection4>

<h1 style='line-height:12.3pt;mso-line-height-rule:exactly'><span lang=IT>DIAGRAMMI</span></h1>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Questa sezione mostra lo studio dinamico del sistema rappresentato<span style='letter-spacing:
.35pt'> </span>tramite sequence diagrams. Forniamo quindi di seguito 8 sequence Diagrams che rappresentano tutte le azioni che è possibile compiere con l’applicazione.</span></p>

<p class=MsoListParagraph style='margin-top:11.45pt;margin-right:0cm;
margin-bottom:0cm;margin-left:64.0pt;margin-bottom:.0001pt;text-indent:-18.0pt;
line-height:12.3pt;mso-line-height-rule:exactly;mso-list:l0 level1 lfo4;
tab-stops:64.0pt'><![if !supportLists]><span lang=IT><span style='mso-list:
Ignore'>1.<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp; </span></span></span><![endif]><span
lang=IT>REGISTER</span></p>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Una volta che l’utente inserisce le credenziali per registrarsi al sistema, il client Beatrice le invia, tramite chiamata<span style='letter-spacing:-.2pt'> </span>REST, a<span style='letter-spacing:-.2pt'> </span>Travel Manager .Il<span style='letter-spacing:-.2pt'> </span>prosumer chiederà quindi<span style='letter-spacing:-.2pt'> </span>al Loadbalancer<span style='letter-spacing:
-.2pt'> </span>l’indirizzo del
provider a cui fare richiesta. Fornitogli
l’indirizzo, Travel Manager invierà la richiesta di registrazione, tramite SOAP, ad uno dei server su cui è disponibile il servizio Place of</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:54.75pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>City .Successivamente il provider controllerà se le credenziali precedentemente fornite dall'utente sono già esistenti: se così fosse lo comunicherebbe al prosumer che, a sua volta, comunicherebbe al client l’impossibilità<span style='letter-spacing:
.35pt'> </span>di effettuare la registrazione con quelle credenziali<span style='letter-spacing:
.35pt'> </span>perché già esistenti. Similmente, quando la registrazione va a buon fine, per prima cosa il provider genera un token ( o userKey ) identificativo relativo all’utente che si è appena registrato e lo salva nel database associandolo a quell’utente, poi comunica tramite SOAP con il prosumer l’avvenuta registrazione. Una volta che il prosumer sa l’esito della registrazione, che sia andata a buon fine o meno, lo comunica al client tramite il REST.</span></p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Illustriamo
qui il servizio di Login. L’utente fornisce le sue credenziali ( email e password ) per effettuare l’accesso tramite il client Beatrice che le invia, sotto forma di richiesta REST, al prosumer. Poi il prosumer chiede al Loadbalancer l’indirizzo del provider a cui fare richiesta. Fornitogli<span style='letter-spacing:-.2pt'> </span>l’indirizzo, Travel<span style='letter-spacing:-.15pt'>
</span>Manager<span style='letter-spacing:-.2pt'> </span>invierà la<span style='letter-spacing:-.15pt'> </span>richiesta di<span style='letter-spacing:-.2pt'> </span>login,<span
style='letter-spacing:-.15pt'> </span>tramite SOAP,<span style='letter-spacing:-.2pt'> </span>ad<span
style='letter-spacing:-.15pt'> </span>uno<span style='letter-spacing:-.2pt'> </span>dei<span
style='letter-spacing:-.15pt'> </span>server<span style='letter-spacing:-2.95pt'>
</span>su cui è disponibile il servizio Place of City. Ricevute la richiesta, il provider recupererà le informazioni dell’utente dal Data Base. La risposta della base di dati viene comunicata al prosumer<span
style='letter-spacing:-.1pt'> </span>sempre tramite SOAP, ed infine<span
style='letter-spacing:-.1pt'> </span>al client tramite REST.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Se le credenziali inserite risulteranno corrette, l’utente riuscirà ad effettuare l’accesso alla web application e gli verrà restituito il suo token ( o userKey ) identificativo con il quale potrà effettuare<span style='letter-spacing:-2.9pt'>
</span>tutte le richieste che chiedono
l’autenticazione.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Nel caso in cui le credenziali dovessero risultare scorrette non sarà possibile accedere all’applicazione. Una volta effettuato il login l’utente ha dei<span style='letter-spacing:
.35pt'> </span>permessi diversi dal semplice utente visitatore: può visualizzare i like corrispondenti ai luoghi della città che lui stesso ha gradito e può<span style='letter-spacing:-2.95pt'> </span>visualizzare
e scrivere i commenti relativi ad
un’attività.</span></p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Il provider MAPBOX fornisce, sempre secondo lo stesso principio, tre tipi servizi all’utente: la visualizzazione della mappa, la visualizzazione del percorso a seconda del mezzo di trasporto scelto ed il tempo impiegato per percorrere quella strada in base al mezzo scelto. Tutti e tre questi<span
style='letter-spacing:-2.95pt'> </span>servizi sono chiesti dall’utente tramite Beatrice con una richiesta REST al prosumer.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Successivamente<span
style='letter-spacing:-.4pt'> </span>TravelManager<span style='letter-spacing:
-.35pt'> </span>richiederà<span style='letter-spacing:-.4pt'> </span>il<span
style='letter-spacing:-.35pt'> </span>servizio<span style='letter-spacing:-.4pt'>
</span>al<span style='letter-spacing:-.35pt'> </span>provider<span
style='letter-spacing:-.4pt'> </span>MAPBOX<span style='letter-spacing:-.35pt'>
</span>tramite<span style='letter-spacing:-.4pt'> </span>REST.<span
style='letter-spacing:-.35pt'> </span>Quando<span style='letter-spacing:-2.9pt'>
</span>il provider darà la risposta a TravelManager, quest’ultimo filtrerà tale risposta a seconda di ciò che<span style='letter-spacing:-2.95pt'> </span>ha chiesto l’utente, riadattando anche i dati per l’applicazione. Terminata questa operazione restituirà il risultato
all’utente tramite il client.</span></p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Quando l’utente ha effettuato il login può visualizzare i like da lui assegnati in precedenza. Questa operazione avviene automaticamente non appena l’utente effettua il login: per prima cosa il client invia
al prosumer la userKey dell’utente tramite servizio REST. Poi il prosumer
chiede al Loadbalancer l’indirizzo del provider a cui fare richiesta. Fornitogli l’indirizzo, Travel Manager invierà<span
style='letter-spacing:-.15pt'> </span>la<span style='letter-spacing:-.15pt'> </span>richiesta<span
style='letter-spacing:-.1pt'> </span>di<span style='letter-spacing:-.15pt'> </span>visualizzazione<span
style='letter-spacing:-.15pt'> </span>dei<span style='letter-spacing:-.1pt'> </span>like,<span
style='letter-spacing:-.15pt'> </span>tramite<span style='letter-spacing:-.1pt'>
</span>SOAP,<span style='letter-spacing:-.15pt'> </span>ad<span
style='letter-spacing:-.15pt'> </span>uno<span style='letter-spacing:-.1pt'> </span>dei<span
style='letter-spacing:-.15pt'> </span>server<span style='letter-spacing:-.1pt'>
</span>su<span style='letter-spacing:-.15pt'> </span>cui<span style='letter-spacing:
-.15pt'> </span>è<span style='letter-spacing:-.1pt'> </span>disponibile<span
style='letter-spacing:-.15pt'> </span>il servizio Place of City. Quest’ultimo controllerà nel Data Base se l’userKey fornitagli corrisponde effettivamente ad un utente esistente
nella base di dati.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:58.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Se
la risposta è positiva ( quindi l’IDuser è diverso da NULL ), significa che il
Data Base restituirà<span style='letter-spacing:-2.95pt'> </span>la lista dei
like al provider che a sua volta la inoltrerà al prosumer tramite SOAP, che
infine la restituirà all’utente grazie al client tramite REST.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.9pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Invece,
nel caso in cui l’userKey non ha un IDuser corrispondente nel Data Base (
quindi l’IDuser è<span style='letter-spacing:-2.95pt'> </span>NULL ), il provider lo comunicherà al prosumer tramite SOAP e, come sempre, tale risultato sarà inoltrato da TravelManager
al client tramite REST.</span></p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Quando l’utente desidera visualizzare i commenti lasciati per un’attività, il client invia questa richiesta tramite REST al prosumer, passando l’id di dell’attività richiesta. Poi il prosumer chiede al Loadbalancer l’indirizzo del provider a cui fare richiesta. Fornitogli l’indirizzo, Travel Manager invierà la richiesta di visualizzazione
dei commenti, tramite SOAP, ad uno dei server su cui è disponibile il servizio Place of City. In questo modo il provider può quindi richiedere le informazioni desiderate al Data Base. Quando la base di dati risponderà, restituirà la lista dei commenti al provider che, a sua volta, la inoltrerà al prosumer con il fine di fornirla all’utente tramite Beatrice.</span></p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Se l’utente desidera mettere un like ad un’attività, il client inoltrerà tale richiesta al prosumer tramite servizio REST,passandogli la userKey e l’IDactivity.</p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:58.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Poi il prosumer chiede al Loadbalancer l’indirizzo del provider a cui fare richiesta. Fornitogli l’indirizzo, Travel Manager invierà la richiesta di aggiungere un like,
tramite SOAP, ad uno dei server su cui è disponibile il servizio Place of City. Il provider comunicherà poi con il Data Base per capire se l’azione richiesta dall’utente è possibile. Infatti per prima cosa PlacesOfCity fornirà l’userKey al Data Base con il fine di vedere se esiste l’IDuser per quell’utente. Se la risposta è positiva ( quindi l’IDuser è diverso da NULL ), significa che viene effettuata l’aggiunta del like.</p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Successivamente il sistema controllerà l’esito di tale operazione, restituendo la risposta di errore o di corretto funzionamento al prosumer tramite SOAP, che sarà infine inviata dal prosumer al client tramite REST.</p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Invece,
nel caso in cui l’userKey non ha un’IDuser corrispondente
nel Data Base ( quindi l’IDuser è NULL ), il provider lo comunicherà al prosumer tramite SOAP e, come sempre, tale risultato sarà inoltrato da TravelManager
al client tramite REST.</p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Il processo per inserire un commento è molto simile a quello per inserire un like: il client inoltrerà il commento appena inserito
dall’user al prosumer, tramite servizio REST, passandogli anche la userKey e l’IDactivity.</p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:55.2pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Poi il prosumer chiede al Loadbalancer l’indirizzo del provider a cui fare richiesta. Fornitogli l’indirizzo, Travel Manager invierà la richiesta di aggiunta
commento, tramite SOAP, ad uno dei server su cui è disponibile il servizio Place of City. Il provider, successivamente, comunicherà con il Data Base per capire se l’azione richiesta dall’utente è possibile. Infatti per prima cosa PlacesOfCity fornirà l’userKey al Data Base con il fine di vedere se esiste l’IDuser per quell’utente. Se la risposta è positiva ( quindi l’IDuser è diverso da NULL ), significa che viene effettuata l’aggiunta del commento. Successivamente il sistema controllerà l’esito di tale operazione, restituendo la risposta di errore o di corretto funzionamento al prosumer tramite SOAP, che sarà infine inviata dal prosumer al
client tramite REST.</p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Invece,
nel caso in cui l’userKey non ha un’IDuser corrispondente
nel Data Base ( quindi l’IDuser è NULL ), il provider lo comunicherà al prosumer tramite SOAP e, come sempre, tale risultato sarà inoltrato da TravelManager
al client tramite REST.</p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Quando l’utente richiede al prosumer, tramite REST, la lista delle attività proposte da Beatrice per quella città, questo chiede per prima cosa al Loadbalancer l’indirizzo del provider Place of City a cui effettuare la richiesta di questa lista.
Fornitogli tale indirizzo,
TravelManager inoltrerà parallelamente due richieste: la richiesta (tramite REST) del tempo atmosferico per quella città in quel giorno e la richiesta
(tramite SOAP) delle attività per
quella città ( all’indirizzo che il Loadbalancer ha restituito al
prosumer). La prima verrà richiesta al provider PlacesOfCity, che a sua volta interrogherà il Data Base per essere in grado di fornire tale risposta. La seconda
verrà richiesta al provider Weather. Non appena i provider avranno risposto al prosumer, TravelManager gestirà le informazioni appena ricevute componendo la lista delle attività secondo il tempo metereologico della città in quel momento, mostrando solo le attività disponibili in quel momento secondo il meteo e l’orario. Composta questa lista, il risultato sarà mostrato all’utente tramite Beatrice.</p>

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

<h1 style='line-height:12.3pt;mso-line-height-rule:exactly'>INSTALLAZIONE</h1>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>In questa sezione illustriamo le tecnologie e i tools usati ed una breve descrizione di come installare il sistema.</p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt'><span lang=IT>Presentiamo<span
style='letter-spacing:-.15pt'> </span>la<span style='letter-spacing:-.15pt'> </span>lista<span
style='letter-spacing:-.15pt'> </span>delle<span style='letter-spacing:-.15pt'>
</span>API<span style='letter-spacing:-.1pt'> </span>REST<span
style='letter-spacing:-.15pt'> </span>messe<span style='letter-spacing:-.15pt'>
</span>a<span style='letter-spacing:-.15pt'> </span>disposizione<span
style='letter-spacing:-.15pt'> </span>dal<span style='letter-spacing:-.1pt'> </span>prosumer:</span></p>

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
  windowtext'>Ottenere<span style='letter-spacing:.2pt'> </span>i tempi<span style='letter-spacing:.25pt'>
  </span>di percorrenza<span
  style='letter-spacing:.2pt'> </span>tra due punti</span></p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.15pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  windowtext'>Longitudine del punto relativo alla posizione dell’utente</span><span lang=IT
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
  <p class=TableParagraph style='margin-top:3.8pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Latitudine<span
  style='letter-spacing:.35pt'> </span>del punto relativo<span style='letter-spacing:.4pt'>
  </span>alla posizione<span
  style='letter-spacing:.35pt'> </span>dell’utente</span></p>
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
  <p class=TableParagraph style='margin-top:4.05pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Longitudine<span style='letter-spacing:.35pt'> </span>del punto relativo alla<span style='letter-spacing:.35pt'> </span>destinazione dell’utente</span><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
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
  <p class=TableParagraph style='margin-top:4.3pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Latitudine<span
  style='letter-spacing:.35pt'> </span>del<span style='letter-spacing:.35pt'> </span>punto<span
  style='letter-spacing:.35pt'> </span>relativo<span style='letter-spacing:
  .4pt'> </span>alla<span style='letter-spacing:.35pt'> </span>destinazione<span
  style='letter-spacing:.35pt'> </span>dell’utente</span></p>
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
  mso-line-height-rule:exactly'>Ottenere il percorso verso l'attività desiderata attraverso un determinato mezzo di trasposto</p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:3.9pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  windowtext'>Mezzo scelto per il trasporto</span><span lang=IT
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
  <p class=TableParagraph style='margin-top:4.55pt'>Longitudine del punto relativo alla posizione dell’utente</p>
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
  windowtext'>Latitudine<span style='letter-spacing:.35pt'> </span>del punto relativo alla posizione<span
  style='letter-spacing:.35pt'> </span>dell’utente</span><span lang=IT
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
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Longitudine<span
  style='letter-spacing:.35pt'> </span>del punto relativo<span style='letter-spacing:.4pt'>
  </span>alla<span style='letter-spacing:.35pt'> </span>destinazione dell’utente</span></p>
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
  <p class=TableParagraph style='margin-top:4.3pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Latitudine<span style='letter-spacing:.35pt'> </span>del<span
  style='letter-spacing:.35pt'> </span>punto<span style='letter-spacing:.35pt'>
  </span>relativo alla<span
  style='letter-spacing:.35pt'> </span>destinazione<span style='letter-spacing:
  .35pt'> </span>dell’utente</span><span lang=IT style='font-size:10.0pt;
  mso-bidi-font-size:11.0pt'></span></p>
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
  windowtext'>Registrazione alla web application</span></p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.4pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  <p class=TableParagraph style='margin-top:3.8pt'><span lang=IT
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt;color:black;mso-color-alt:
  windowtext'>Nome<span style='letter-spacing:.2pt'> </span>utente</span><span
  lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt'></span></p>
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
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Cognome utente</span></p>
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
  windowtext'>Email<span style='letter-spacing:-.1pt'> </span>utente</span><span
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
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Password utente</span></p>
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
  windowtext'>Login<span style='letter-spacing:.35pt'> </span>per<span
  style='letter-spacing:.35pt'> </span>accedere<span style='letter-spacing:
  .4pt'> </span>alla<span style='letter-spacing:.35pt'> </span>web application</span></p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:3.8pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  windowtext'>Email<span style='letter-spacing:-.1pt'> </span>utente</span><span
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
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Password utente</span></p>
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
  black;mso-color-alt:windowtext'>Ottenere la<span
  style='letter-spacing:.2pt'> </span>lista<span style='letter-spacing:.2pt'> </span>delle<span
  style='letter-spacing:.2pt'> </span>attività<span style='letter-spacing:.15pt'>
  </span>in<span style='letter-spacing:.2pt'> </span>base<span
  style='letter-spacing:.2pt'> </span>ad<span style='letter-spacing:.2pt'> </span>una<span
  style='letter-spacing:.2pt'> </span>determinata<span style='letter-spacing:
  .15pt'> </span>città</span></p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.5pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  windowtext'>Nome<span style='letter-spacing:.2pt'> </span>della<span
  style='letter-spacing:.2pt'> </span>città<span style='letter-spacing:.2pt'> </span>da<span
  style='letter-spacing:.2pt'> </span>visitare</span><span lang=IT
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
  mso-line-height-rule:exactly'>Ottenere la lista delle attività in base ad una determinata città e ad un profilo scelto dall’utente</p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:3.9pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  windowtext'>Nome<span style='letter-spacing:.2pt'> </span>della<span
  style='letter-spacing:.2pt'> </span>città<span style='letter-spacing:.2pt'> </span>da<span
  style='letter-spacing:.2pt'> </span>visitare</span><span lang=IT
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
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Profilo<span
  style='letter-spacing:-.2pt'> </span>richiesto<span style='letter-spacing:
  -.15pt'> </span>(tasty,<span style='letter-spacing:-.2pt'> </span>adventure,<span
  style='letter-spacing:-.15pt'> </span>nerd)</span></p>
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
  windowtext'>Aggiungere un<span
  style='letter-spacing:.35pt'> </span>like ad<span
  style='letter-spacing:.35pt'> </span>un'attività</span></p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.4pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  windowtext'>id dell’attività<span
  style='letter-spacing:.2pt'> </span>a<span style='letter-spacing:.2pt'> </span>cui<span
  style='letter-spacing:.2pt'> </span>si desidera<span
  style='letter-spacing:.2pt'> </span>lasciare<span style='letter-spacing:.2pt'>
  </span>un<span style='letter-spacing:.2pt'> </span>like</span><span lang=IT
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
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Chiave<span
  style='letter-spacing:.55pt'> </span>identificativa<span style='letter-spacing:
  .55pt'> </span>dell’utente</span></p>
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
  windowtext'>Restituire<span style='letter-spacing:.2pt'> </span>l’elenco<span
  style='letter-spacing:.2pt'> </span>delle attività<span
  style='letter-spacing:.2pt'> </span>a cui<span
  style='letter-spacing:.2pt'> </span>l’utente<span style='letter-spacing:.25pt'>
  </span>ha<span style='letter-spacing:.2pt'> </span>assegnato un<span style='letter-spacing:.2pt'> </span>like</span></p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.3pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  windowtext'>Chiave<span style='letter-spacing:.55pt'> </span>identificativa<span
  style='letter-spacing:.55pt'> </span>dell’utente</span><span lang=IT
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
  windowtext'>Aggiungere<span style='letter-spacing:.6pt'> </span>un<span
  style='letter-spacing:.6pt'> </span>commento<span style='letter-spacing:.6pt'>
  </span>ad<span style='letter-spacing:.6pt'> </span>un'attività</span></p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.3pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  windowtext'>ID dell'attività a cui si desidera lasciare un commento</span><span
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
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Chiave<span
  style='letter-spacing:.55pt'> </span>identificativa<span style='letter-spacing:
  .55pt'> </span>dell’utente</span></p>
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
  windowtext'>Titolo<span style='letter-spacing:.2pt'> </span>del commento che si desidera lasciare</span><span lang=IT style='font-size:10.0pt;
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
  style='font-size:10.0pt;mso-bidi-font-size:11.0pt'>Corpo del commento che si desidera lasciare</span></p>
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
  black;mso-color-alt:windowtext'>Restituisce<span style='letter-spacing:.5pt'>
  </span>tutti i<span
  style='letter-spacing:.55pt'> </span>commenti<span style='letter-spacing:
  .5pt'> </span>associati<span style='letter-spacing:.55pt'> </span>ad una<span style='letter-spacing:.55pt'> </span>determinata attività</span></p>
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
  mso-bidi-font-family:"Arial MT"'>PARAMETRO</span></b></p>
  </td>
  <td width=525 valign=top>
  <p class=TableParagraph style='margin-top:4.45pt'><b style='mso-bidi-font-weight:
  normal'><span lang=IT style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
  font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
  "Arial MT"'>DESCRIZIONE</span></b></p>
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
  <p class=TableParagraph style='margin-top:3.85pt'>ID dell'attività a cui si desidera lasciare un commento</p>
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


<h1 style='margin-top:9.5pt'><span lang=IT style='font-size:13.0pt;mso-bidi-font-size:
11.0pt;font-family:"Arial MT",sans-serif;mso-hansi-font-family:Arial;
position:relative;top:-1.0pt;mso-text-raise:1.0pt;font-weight:normal;
mso-bidi-font-weight:bold'>-<span style='letter-spacing:3.45pt'> </span></span><span
lang=IT>Per l'utilizzo del progetto:</span></h1>

<p class=MsoBodyText style='margin-top:11.35pt;margin-right:211.05pt;
margin-bottom:0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:190%'><span
lang=IT>utilizzando eclipse, importare il contenuto della cartella PROJECT:<span
style='letter-spacing:-2.95pt'> </span>File/Import/Existing Maven Projects</span></p>

<p class=MsoBodyText style='margin-top:.45pt;margin-right:58.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Una volta importati tutti i pacchetti che compongono il progetto, importare in phpmyadmin il dump
del database presente nella cartella:</p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Quindi creare un nuovo database denominato placesofcity e importare il file in precendenza descritto.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:54.5pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Il progetto di default si aspetta di accedere al database sulla porta 8889, in caso questa non risulti essere la stessa di quella in esecuzione sul proprio PC, bisognerà cambiarla nella configurazione di accesso nel file situato in:</p>

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
style='mso-ansi-language:EN-US'>Modificare:<span style='letter-spacing:2.9pt'> </span></span><i
style='mso-bidi-font-style:normal'><span lang=EN-US style='font-family:"Arial",sans-serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
EN-US'>url=&quot;jdbc:mysql://localhost:8889/placesofcity?verifyServerCertificate=false&quot;<o:p></o:p></span></i></p>

<p class=MsoBodyText style='margin-top:.35pt'><i style='mso-bidi-font-style:
normal'><span lang=EN-US style='font-size:10.0pt;mso-bidi-font-size:11.0pt;
font-family:"Arial",sans-serif;mso-hansi-font-family:"Arial MT";mso-bidi-font-family:
"Arial MT";mso-ansi-language:EN-US'><o:p>&nbsp;</o:p></span></i></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>cambiando la porta 8889 con quella che si ha a disposizione. Nel caso si voglia cambiare il nome<span style='letter-spacing:
-2.95pt'> </span>al database su
phpmyadmin sarà necessario modificare la stessa
riga.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Una volta fatti tutti i passaggi in precedenza spiegati bisognerà creare un server di esecuzione per il
progetto. Sempre all'interno di eclipse seguire il path:</span></p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>una
volta aperta la finestra di configurazione del server scegliere la versione
&quot;Tomcat v8.5 Server&quot;<span style='letter-spacing:-2.95pt'> </span>importando
il path della cartella di Tomcat 8.5.</span></p>

<p class=MsoBodyText style='margin-top:.5pt'><span lang=IT style='font-size:
10.0pt;mso-bidi-font-size:11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Prima
di eseguire l'intero progetto sul server è necessario configurare altri due server. Questo perchè
il loadbalancer si aspetta di trovare in esecuzione un server
in esecuzione sulla porta 8081<span style='letter-spacing:-2.95pt'> </span>ed uno sulla porta 8082. Questi due ospiteranno l'esecuzione del servizio &quot;placesofcity&quot;.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:54.75pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Una
volta creati tutti i server, mandare in esecuzione sui server 8081 e 8082 il
servizio placesofcity<span style='letter-spacing:-2.95pt'> </span>e lanciare l'esecuzione di tutti i servizi creati sul server in esecuzione sulla porta 8080 COMPRESO placesofcity.</span></p>

<p class=MsoBodyText style='margin-top:0cm;margin-right:57.9pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Se si vogliono creare delle altre istanze per il servizio &quot;placesofcity&quot; è necessario creare altri server, eseguire su questi il servizio e
modificare il loadbalancer così da fargli presente l'esistenza<span
style='letter-spacing:-2.95pt'> </span>di altri server che fruiscono il
servizio. </span><span lang=EN-US style='mso-ansi-language:EN-US'>Per
aggiungere altri server al
loadbalacer andare in:<o:p></o:p></span></p>

<p class=MsoBodyText style='margin-top:.25pt'><span lang=EN-US
style='font-size:10.5pt;mso-bidi-font-size:11.0pt;mso-ansi-language:EN-US'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-left:46.0pt;line-height:101%'><i
style='mso-bidi-font-style:normal'><span lang=EN-US style='font-family:"Arial",sans-serif;
mso-hansi-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
EN-US'>loadbalancer/src/main/java/it/univaq/disim/sose/project./loadbalancer/business/impl/ LoadBalancerServiceImpl.java<o:p></o:p></span></i></p>

<p class=MsoBodyText style='margin-top:11.45pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Una volta aperto il file aggiungere alla lista tutte le istanze che si vogliono, tenendo presente la<span style='letter-spacing:-2.95pt'> </span>porta
in cui vengono eseguite.</span></p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>La lista prende un oggetto di tipo ServerObject e si aspetta tre parametri: uno di tipo Stringa e i restanti di tipo Intero.
Il parametro di tipo stringa è l'url del servizio in esecuzione ed è quello che il loadbalancer restituirà quando viene invocato. Il secondo ed il terzo parametro identificano il numero di richieste massime che possono essere eseguito in un intervallo di tempo, dove: il secondo parametro è il numero di richieste ed il terzo parametro è l’intervallo di tempo.</p>

</div>

<span lang=IT style='font-size:11.0pt;line-height:95%;font-family:"Arial MT",sans-serif;
mso-fareast-font-family:"Arial MT";mso-bidi-font-family:"Arial MT";mso-ansi-language:
IT;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=all
style='page-break-before:always;mso-break-type:section-break'>
</span>

<div class=WordSection16>

<p class=MsoBodyText style='margin-top:4.2pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>
Nel primo caso il server identificato con la porta 8080 può eseguire 5 richieste in 5 secondi, il server sulla porta 8081 1 richiesta in un intervallo di 5 secondi ed il terzo 20 richieste in un intervallo di 5 secondi.
Finite queste configurazione è possibile mandare in esecuzione l’intero progetto e accedere mediante browser all'indirizzo:
<br>
localhost:8080/beatrice
</p>

<h1 style='margin-top:9.5pt;margin-right:0cm;margin-bottom:0cm;margin-left:
58.0pt;margin-bottom:.0001pt;text-indent:-12.0pt;mso-list:l1 level1 lfo6;
tab-stops:58.0pt'>To use the realized ARCHETYPE:</h1>

<p class=MsoBodyText style='margin-top:11.35pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
exactly'>Nella cartella ARCHETYPE ci sono due cartelle:</p>

<p class=MsoListParagraph style='margin-top:.2pt;margin-right:135.25pt;
margin-bottom:0cm;margin-left:94.2pt;margin-bottom:.0001pt;text-indent:-12.25pt;
line-height:95%;mso-list:l1 level2 lfo6;tab-stops:89.35pt'>&quot;generic&quot; permette di istanziare un nuovo progetto con un esempio base preconfigurandolo automaticamente</p>

<p class=MsoListParagraph style='margin-top:0cm;margin-right:67.3pt;margin-bottom:
0cm;margin-left:94.2pt;margin-bottom:.0001pt;text-indent:-12.25pt;line-height:
95%;mso-list:l1 level2 lfo6;tab-stops:89.35pt'>&quot;specific&quot; crea la struttura utilizzata per creare il prosumer, di conseguenza specifica la struttura di base utilizzata</p>

<p class=MsoBodyText style='margin-top:11.4pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:12.3pt;mso-line-height-rule:
exactly'>Per l'utilizzo:</p>

<p class=MsoBodyText style='margin-top:.2pt;margin-right:58.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>aprire il Terminale e recarsi all'interno della cartella ARCHETYPE. Una volta all'interno della cartella digitare il comando:</p>

<p class=MsoNormal style='margin-left:46.0pt'><b>mvn</b> clean install</p>

<br>

<p class=MsoBodyText style='margin-top:.05pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'>Eseguito il comando uscire dalla cartella e posizionarsi nella cartella in cui si vuole generare il progetto. Eseguire quindi il comando:</p>

<p class=MsoBodyText style='margin-top:.35pt'></p>

<p class=MsoNormal style='margin-top:0cm;margin-right:86.15pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:101%'>

<b>mvn</b> archetype:generate -DgroupId=it.univaq.sose.application -DartifactId=my_application - Dversion=0.0.1-SNAPSHOT -DarchetypeGroupId=it.univaq.disim.sose.project - DarchetypeArtifactId=prosumer-archetype -DarchetypeVersion=1.0.0-SNAPSHOT - DinteractiveMode=false
</p>

<p class=MsoBodyText style='margin-top:10.9pt;margin-right:0cm;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt'>>Modificando a proprio piacimento:</p>

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

<h1><span lang=IT>DESKTOP APPLICATION</h1>

<br>

<p class=MsoBodyText style='margin-top:0cm;margin-right:71.0pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>La
seguente view mostra cosa si visualizza appena si accede alla web Application (
senza aver<span style='letter-spacing:-2.95pt'> </span>effettuato il login):</span></p>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>La seguente view mostra cosa succede quando si seleziona un’attività dall’elenco sulla parte sinistra dell’immagine. Si noti che vengono indicati i tempi di percorrenza per raggiungere tale attività
a seconda del mezzo mostrato:</span></p>

<br>

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
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Cliccando su uno dei tre mezzi di trasporto proposti viene visualizzato<span style='letter-spacing:
.35pt'> </span>il percorso più conveniente da effettuare con quel mezzo :</span></p>

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
<span lang=IT style='font-size:7.0pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

<p class=MsoBodyText><span lang=IT style='font-size:13.0pt;mso-bidi-font-size:
11.0pt'><o:p>&nbsp;</o:p></span></p>

<p class=MsoBodyText style='margin-top:10.1pt;margin-right:53.6pt;margin-bottom:
0cm;margin-left:46.0pt;margin-bottom:.0001pt;line-height:95%'><span lang=IT>Effettuato il login è possibile visualizzare i like lasciati con il proprio profilo e la form per inserire un nuovo
commento per una data attività:</span></p>

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
<span lang=IT style='font-size:7.0pt;mso-bidi-font-size:11.0pt'><o:p></o:p></span></p>

</div>

</body>

</html>
