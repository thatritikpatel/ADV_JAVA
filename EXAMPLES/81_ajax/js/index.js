window.onload = initAll;

var abc,nm,ag;
function initAll(){
	abc = document.getElementById('abc');
	abc.onclick = sendRequest;

	nm = document.getElementById('nm');
	ag = document.getElementById('ag');
}

var reqObj;
function sendRequest(){
	reqObj = new XMLHttpRequest();
	
	reqObj.open('post','act.do',true);
	reqObj.onreadystatechange = showResponse;
	reqObj.setRequestHeader('content-type','application/x-www-form-urlencoded')
	reqObj.send('user='+nm.value+'&age='+ag.value);
}

function showResponse(){
	//alert(reqObj.readyState+' ~~~~~ '+reqObj.status);
	if(reqObj.readyState==4&&reqObj.status==200){
		alert(reqObj.responseText);
	}
}