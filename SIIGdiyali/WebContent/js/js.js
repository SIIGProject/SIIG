/**
 * 
 */
function afficher(){
if(document.getElementById("form:radio:0").checked==true)
document.getElementById("zonedetexte").display='none';
else
document.getElementById("zonedetexte").display='block';
}


function verifier(Form){
	
	if(document.getElementById("Form:pass1").value!= document.getElementById("Form:pass2").value){
		alert('votre password et incorect');
	}
	
	Form.submit();	
}

function verifier(Form2){
	
	
	re = /^\d{4}\-\d{1,2}\-\d{1,2}$/;

    if(document.getElementById("Form2:date").value != '' && !document.getElementById("Form2:date").value.match(re)) {
      alert("Ce format de date n'est pas valide: " + document.getElementById("Form2:date").value);
      document.getElementById("Form2:date").focus();
     
    }
    if(document.getElementById("Form2:date").value == '') {
        alert("Vous devez saisir une date de naissance");
        document.getElementById("Form2:date").focus();
       
      }
	
	Form2.submit();	
}

function message(){
	
	
		alert('vous n\'avez pas le droit de modifier');
	
}
function messageA(){
	
	
	alert('vous n\'avez pas le droit d\'ajouter');
}
	function messageS(){
		
		
		alert('vous n\'avez pas le droit de supprimer');
	}
	function messageC(){
		
		
		alert('vous n\'avez pas le droit de consulter');
	}
	
	function bascule(elem)
	   {
	   etat=document.getElementById(elem).style.display;
	   if(etat=="none"){
	   document.getElementById(elem).style.display="block";
	   }
	   else{
	   document.getElementById(elem).style.display="none";
	   }
	   }
	
	function activer(){
		document.getElementById('lien1').disabled=false;
		document.getElementById('lien').disabled=true;
	}
	function desactiver(){
		document.getElementById('lien').disabled=false;
		document.getElementById('lien1').disabled=true;
	}
function envoyer(){
	if(document.getElementById('lien').value=null || document.getElementById('n').value==null || document.getElementById('photo').value==null){
		alert('Tout les champs sont obligatoire');
		return false;
	}
	else{
		return true;
	}
}

function activer1(){
	
	document.getElementById('Form:oui1').disabled=false;
	document.getElementById('Form:non1').disabled=true;
}
function desactiver1(){
	
	document.getElementById('Form:non1').disabled=false;
	document.getElementById('Form:oui1').disabled=true;
}

function confirmDelete()   
{  
    return confirm('Voulez-vous vraiment supprimer définitivement cet élément ? ');  
}
