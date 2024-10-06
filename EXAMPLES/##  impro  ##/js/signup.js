window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();	
} 

var recs,signup_form;
var city_id,email,username,password,repassword,address,ctid;
function getAllElements(){
	city_id = document.getElementById('city_id');	
	email = document.getElementById('email');
	username = document.getElementById('username');
	password = document.getElementById('password');
	repassword = document.getElementById('repassword');
	address = document.getElementById('address');
	ctid = document.getElementById('ctid');
	
	recs = document.getElementById('recs');	
	signup_form = document.getElementById('signup_form');
}

function setAllActions(){
	city_id.onkeyup = searchCity;
	email.onblur = checkDuplicateEmail;
	email.onfocus = function(){
						email.className = 'fld';
					};
	signup_form.onsubmit = validate;
}

var ereq;
function checkDuplicateEmail(){
	ereq = new XMLHttpRequest();
	
	ereq.open('get','check_duplicate_email.do?email='+email.value,true);
	ereq.onreadystatechange = showDuplicateEmailCheckResult;
	ereq.send(null);
}

function showDuplicateEmailCheckResult(){
	if(ereq.readyState==4&&ereq.status==200){
		var resp = ereq.responseText;

		if(resp=='true'){
			email.className = 'fld invalid';
		}else{
			email.className = 'fld valid';
		}
	}
}


function validate(){
	var flag = true;

	if(username.value.trim().length<3){
		flag = false;
		username.className = 'fld invalid';
	}
	
	if(!(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/.test(email.value))){
		flag = false;
		email.className = 'fld invalid';
	}	

	if(!(/^[a-zA-Z]\w{5,11}$/.test(password.value))){
		flag = false;
		password.className = 'fld invalid';
	}

	if(password.value!=repassword.value){
		flag = false;
		repassword.className = 'fld invalid';
	}

	if(address.value.trim().length<20){
		flag = false;
		address.className = 'fld invalid';
	}

	if(city_id.value.trim().length==0){
		flag = false;
		city_id.className = 'fld invalid';
	}

	return flag;
}



//**************************************************************
var sreq;
function searchCity(){
	if(city_id.value.length>=3){
		sreq = new XMLHttpRequest();

		sreq.open('get','searchcity.do?city='+city_id.value,true);
		sreq.onreadystatechange = showCities;
		sreq.send(null);
	}else{
		recs.innerHTML = '';
		recs.style.display = 'none';
	}
}

function showCities(){
	if(sreq.readyState==4&&sreq.status==200){
		recs.innerHTML = '';

		//alert(sreq.responseText);
		var resp = eval(sreq.responseText);
		//alert(resp)

		for(i=0;i<resp.length;i++){
			var obj = resp[i];
			var div = document.createElement('div');
			div.innerHTML = obj.cityName;
			ctid.value = obj.cityId;
			div.onclick = function(){
							city_id.value = this.innerHTML;
							recs.innerHTML = '';		
							recs.style.display = 'none';
						  };
			
			recs.appendChild(div);
			recs.style.display = 'block';
		}

	}
}