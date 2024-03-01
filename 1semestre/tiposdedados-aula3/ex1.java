int idade;
 
Scanner grava = new Scanner(System.in);
 
System.out.println("Digite a idade");
idade = grava.nextInt();
 
if(idade >= 18){
 
System.out.println("Maior de Idade");
}else{
System.out.println("Menor de idade");
}