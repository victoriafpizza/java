var distanciNadada =parseInt(prompt("digite quanto metros ele nadou"))
var premio
 
if(distanciNadada<800){
premio=5000
}
else if(distanciNadada<=1500){
premio=10000
}
else {
premio=15000
}
alert("seu premio é "+ premio)