<%@ include file="../../inc/import.jsp"%>
<%@ include file="../../inc/public.jsp"%>
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>ID</td>
		<td>T1</td>
		<td>T2</td>
		<td>execute</td>
	</tr>

	<s:iterator value="result">
		<tr>
			<td><s:property value="id" />
			</td>
			<td><s:property value="c1" />
			</td>
			<td><s:property value="c2" />
			</td>
			<td><a href="#" onclick="doAdd()">Add</a> <a href="#"
				onclick="doEdit(<s:property value="id"/>)">Edit</a> <a href="#"
				onclick="doDelete(<s:property value="id"/>)">Delete</a>
			</td>
		</tr>
	</s:iterator>

</table>
