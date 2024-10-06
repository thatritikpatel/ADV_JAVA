window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var fld,records;
var recs;
function getAllElements(){
	fld = document.getElementById('fld');
	records = document.getElementById('records');	
}

function setAllActions(){
	fld.onkeyup = collectRecords;
}

var req;
function collectRecords(){
	if(fld.value.length>2){
		req = new XMLHttpRequest();

		req.open('get','collect_records.do?city='+fld.value,true);
		req.onreadystatechange = showRecords;
		req.send(null);
	}else{
		records.innerHTML = '';
		records.style.display = 'none';
	}
}

function showRecords(){
	if(req.readyState==4&&req.status==200){
		records.innerHTML = '';
		records.style.display = 'block';
		//alert(req.responseText);

		var arr = eval(req.responseText);
		
		var len = arr.length;
		for(i=0;i<len;i++){
			var elm = document.createElement('div');
			elm.className = 'rec';
			elm.innerHTML = arr[i]['city'];

			records.appendChild(elm)
		}
	
		recs = document.getElementsByClassName('rec');
		//alert(recs.length);
		len = recs.length;
		for(i=0;i<len;i++){
			recs[i].onmouseover = function(){ this.className = 'rec over'; }; 
			recs[i].onmouseout = function(){ this.className = 'rec out'; };
			recs[i].onclick = showDetails;
		}
	}
}