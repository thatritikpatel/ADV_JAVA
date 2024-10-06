window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();

	/*
	var arr = [{'user_name':'mohan','email':'mohan@gmail.com'},
				{'user_name':'sohan','email':'sohan@gmail.com'},];
	for(i=0;i<arr.length;i++){
		var obj = arr[i];
		for(x in obj){
			//alert(x+'~~'+obj[x])
		}
	}*/
}

var uname,email,passw,repass,btn;
var xyz,rec;
function getAllElements(){
	uname = document.getElementById('uname');
	email = document.getElementById('email');
	passw = document.getElementById('passw');
	repass = document.getElementById('repass');	

	xyz = document.getElementById('xyz');
	rec = document.getElementById('rec');
}

function setAllActions(){
	xyz.onclick = collectRecords;
}

var creq;
function collectRecords(){
	creq = new XMLHttpRequest();

	creq.open('get','collect_users.do',true);
	creq.onreadystatechange = showRecords;
	creq.send(null);
}

function showRecords(){
	if(creq.readyState==4&&creq.status==200){
		//alert(creq.responseText);

		var records = eval(creq.responseText);
		//alert(records);

		var len = records.length;
		for(i=0;i<len;i++){
			var row = rec.insertRow(i);
			
			var n = 0;
			var obj = records[i];
			for(x in obj){
				var cell = row.insertCell(n);
				cell.innerHTML = obj[x];
				n++;
			}			
		}		
	}
}

var req;
function sendRequest(){
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

