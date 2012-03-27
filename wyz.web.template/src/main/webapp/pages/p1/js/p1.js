function doAdd() {alert();
	var url = "test-add.req";
	window.document.location = url;
}

function doEdit(id) {
	var url = "test-edit.req";
	if (null == id || typeof (id) == "undefined") {
		return;
	}
	url += "?test.id=" + id;
	window.document.location = url;
}

function doDelete(id) {
	var url = "test-remove.req";
	if (null == id || typeof (id) == "undefined") {
		return;
	}
	url += "?test.id=" + id;
	window.document.location = url;
}



