Scanner grava = new Scanner(System.in);

String valor;
 
System.out.println("Digite um valor");
valor = grava.nextLine();

porcentagem = valor * 0.10;

System.out.println("10% de " + valor + "é " + porcentagem);
