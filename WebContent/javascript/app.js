/**
 * 
 */
function validateForm(){
	var form=document.getElementById("myForm");
	var x=form["year"].value;
	if(x==""){
		alert("year field can't be blank");
		return false;
	}
}