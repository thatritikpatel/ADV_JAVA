window.onload = initAll;

var inst_pic,dphd,instid;
function initAll(){
	inst_pic = document.getElementById('inst_pic');
	instid = document.getElementById('instid');
	dphd = document.getElementById('dphd');

	if(dphd.value=='yes'){
		inst_pic.src = 'showdp.do?instid='+instid.value;
	}
}