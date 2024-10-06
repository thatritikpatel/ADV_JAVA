window.onload = initAll;

var abc;
function initAll(){
	abc = document.getElementById('abc');
	abc.onclick = sendRequest;
}

var reqObj;
function sendRequest(){
	reqObj = new XMLHttpRequest();
	
	reqObj.open('get','act.do',true);
	reqObj.onreadystatechange = showResponse;
	reqObj.send(null);
}

function showResponse(){
	//alert(reqObj.readyState+' ~~~~~ '+reqObj.status);
	if(reqObj.readyState==4&&reqObj.status==200){
		alert(reqObj.responseText)
	}
}