<%@ include file="../../inc/import.jsp"%>
<%@ include file="../../inc/public.jsp"%>

<s:form action="test-save.req" method="post">
	<s:hidden name="editType" value="ADD"></s:hidden>
	<table border="2">
		<s:textfield name="test.c1" label="C1"></s:textfield>
		<s:textfield name="test.c2" label="C2"></s:textfield>
		<s:textfield name="test.c3" label="C3"></s:textfield>
		<s:textfield name="test.c4" label="C4"></s:textfield>
		<s:submit value="Save"></s:submit>
	</table>
</s:form>