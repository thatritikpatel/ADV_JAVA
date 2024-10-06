window.onload = initAll;


function initAll(){
	getAllElements();

	setAllActions();
}

var add_cat,categories,inst_cats,all_cats,save_btn;
function getAllElements(){
	add_cat = document.getElementById('add_cat');
	save_btn = document.getElementById('save_btn');
	inst_cats = document.getElementById('inst_cats');
	all_cats = document.getElementById('all_cats');

	categories = document.getElementsByClassName('category');
} 

var curCat;
function setAllActions(){
	//collectCategories();
	collectInstituteCategories();
	
	save_btn.onclick = saveCategories;  

	add_cat.onclick = addCategory;
	
	
	var catLen = categories.length;
	for(i=0;i<catLen;i++){
		/*
		categories[i].onclick = function(){
									curCat = this.innerHTML;
									for(j=0;j<catLen;j++){
										categories[j].className = 'category cat_desel_style';	
										//alert(categories[j].innerHTML)
									}
									this.className = 'category cat_sel_style';
								};
		*/
		categories[i].onclick = function(){
									inst_cats.appendChild(this);									
								};
	}
}

function addCategory(){
	var ul = document.createElement('li');
	
	ul.innerHTML = curCat;

	inst_cats.appendChild(ul);
}

var cat_req;
function collectCategories(){
	cat_req = new XMLHttpRequest();
	cat_req.open('get','allcats.do',true);
	cat_req.onreadystatechange = showCats;
	cat_req.send(null);
}


var new_cats = new Array();
var k = 0;
function showCats(){
	if(cat_req.readyState==4&&cat_req.status==200){
		var res = eval(cat_req.responseText);
		for(i=0;i<res.length;i++){
			if(!instCats.includes(res[i].category)){
				var li = document.createElement('li');
				li.innerHTML = res[i].category;
				li.className = 'category';
				li.li_id = res[i].categoryId;
				li.onclick = function(){
										inst_cats.appendChild(this);
										save_btn.disabled = false; 
										new_cats[k++] = this;
									};
				all_cats.appendChild(li);
			}
		}
	}
}

var save_req;
function saveCategories(){
	var str;

	for(i=0;i<new_cats.length;i++){
		if(i==0){
			str = 'li_id='; 
		}else{
			str = str + '&li_id=';
		}		
		str = str + new_cats[i].li_id;
	}

	alert(str)
	save_req = new XMLHttpRequest();
	save_req.open('get','save_cats.do?'+str,true);
	save_req.onreadystatechange = afterSave;
	save_req.send(null);
}

function afterSave(){
	save_btn.disabled = true;
	new_cats = new Array();
	k = 0;

	if(save_req.readyState==4&&save_req.status==200){
		var resp = save_req.responseText;

		if(resp=='true'){
			alert('saved');
		}else{
			window.location = 'login.jsp?iam=0';
		}
	}
}

var instcatreq = null;
function collectInstituteCategories(){
	instcatreq = new XMLHttpRequest();

	instcatreq.open('get','institute_categories.do',true);
	instcatreq.onreadystatechange = showInstCategories;
	instcatreq.send(null);
}

var instCats = new Array();
function showInstCategories(){
	if(instcatreq.readyState==4&&instcatreq.status==200){
		var resp = eval(instcatreq.responseText);
		
		for(i=0;i<resp.length;i++){
			var li = document.createElement('li');
			li.innerHTML = resp[i].category;
			instCats[i] = resp[i].category;
			li.li_id = resp[i].categoryId;
			inst_cats.appendChild(li);
		}

		collectCategories();
	}
}