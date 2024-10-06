var req;
function sendRequest(){
	getAllElements();

	req = new XMLHttpRequest();
	
	url='act.do?user_name='+uname.value+'&email='+email.value+'&password='+passw.value+'&repassword='+repass.value;
	//alert(url);

	req.open('get',url,true);
	req.onreadystatechange = handleResponse;
	req.send(null);
}

function handleResponse(){
	if(req.readyState==4&&req.status==200){
		alert(req.responseText);
	}
}

var uname,email,passw,repass,btn;
function getAllElements(){
	uname = document.getElementById('uname');
	email = document.getElementById('email');
	passw = document.getElementById('passw');
	repass = document.getElementById('repass');	
}