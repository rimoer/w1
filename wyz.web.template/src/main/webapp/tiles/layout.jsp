<%@ include file="../inc/import.jsp"%>
<%@ include file="../inc/public.jsp"%>
<html>
<head>
<title><tiles:insertAttribute name="title" />
</title>
<link rel="stylesheet" href="css/demos.css">
<link rel="stylesheet"
	href="css/ui-lightness/jquery-ui-1.8.17.custom.css">

<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/jquery.layout.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.17.custom.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%><tiles:getAsString name='jsfile' />"></script>
 
<script type="text/javascript">
	$(document).ready(function() {
		$('body').layout();
	});
</script>

</head>
<body>

	<div class="ui-layout-north">
		<tiles:insertAttribute name="header" />
	</div>
	
	<div class="ui-layout-west">
		<tiles:insertAttribute name="menu" />
	</div>

	<div class="ui-layout-center">
		<tiles:insertAttribute name="body" />
	</div>

</body>
</html>
