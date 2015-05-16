This is the default JSF directory for CSS files.

CSSs can be referred in XHTML page with a specific JSF tag:
    <h:head>
        <h:outputStylesheet library="css" name="default.css"/>
        ...
    <h:head />

and are rendered in HTML as:

    <link type="text/css" rel="stylesheet" href="/JSF-Maven/faces/javax.faces.resource/default.css?ln=css">