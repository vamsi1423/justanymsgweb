<#assign tiles=JspTaglibs["http://tiles.apache.org/tags-tiles"]>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="styles/jquery/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="styles/jquery/jquery-ui.structure.css" />
<link rel="stylesheet" type="text/css" href="styles/jquery/jquery-ui.theme.css" />
<link rel="stylesheet" type="text/css" href="styles/basic-style.css" />
<title><@tiles.getAsString name="title" /></title>
</head>
<body>
	<@tiles.insertAttribute name="header" />
	<@tiles.insertAttribute name="body" />
	<@tiles.insertAttribute name="footer" />
</body>
</html>