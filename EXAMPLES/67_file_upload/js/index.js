window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}


var upload_box,add;
function getAllElements(){
	upload_box = document.getElementById('upload_box');
	add = document.getElementById('add');
}

function setAllActions(){
	add.onclick = addNewUploadField;
}

var i = 2;
function addNewUploadField(){
	var obj = document.createElement('input');
	obj.setAttribute('type','file');
	obj.setAttribute('name','fl'+i);
	i++;
	obj.className = 'upfld';
	upload_box.appendChild(obj);
	var nl = document.createElement('br');
	upload_box.appendChild(nl);
}

