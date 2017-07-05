//###################################################
function requestPage(url, target) {
	$.ajax({
		type: "GET",
		url: url,
		dataType: "html",
		success: function(data) {
			$(target).html(data);
		}
	});
}
//###################################################