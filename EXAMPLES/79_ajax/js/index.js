window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var box;
function getAllElements(){
	box = document.getElementById('box');
}

function setAllActions(){
	box.onscroll = getRecords;
}

var start = 0;
var req;
var scount = 0;
function getRecords(){
	scount++;
	
	if(scount%5==0&&flag){
		req = new XMLHttpRequest();

		req.open('get','get_records.do?start='+start,true);
		req.onreadystatechange = showRecords;
		req.send(null);
	}
}

var flag = true;
function showRecords(){
	if(req.readyState==4&&req.status==200){
		var resp = req.responseText;

		if(resp!='no'){
			//alert(resp);
			var rec = eval(resp);
			var len = rec.length;
			for(i=0;i<len;i++){
				var dv = document.createElement('div');
				dv.innerHTML = rec[i];
				box.appendChild(dv);
			}
		
			start+=5;
		}else{			
			if(flag)
				alert('no more records');
			
			flag = false;
		}		
	}
}
