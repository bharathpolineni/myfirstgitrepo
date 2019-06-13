/**
 * 
 */
function validateForm(){
	var x=document.forms["myForm"]["year"].value;
	var y=document.forms["myForm"]["season"].value;
	if(x=""|| x<=2019){
		alert("Enter a valid year");
		return false;
	}
	if(y=""){
		alert("enter a valid season");
		return false;
	}
	
	
}
