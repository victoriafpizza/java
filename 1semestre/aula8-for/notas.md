Estrutura do comando FOR
Para usar o for precisamos entender seu funcionamento. E para isso vou montar o comando aos poucos
até que se tenha ele por completo.
O comando for (comando para) ficará assim no portugol:
? [Copy to clipboard]View Code PORTUGOL
para (Variavel_de_Controle_1; condição_2; atribuiçãoDaVariavel_4)
{comandos_3}
fimpara;

em java a estrutura ficará assim
? [Copy to clipboard]View Code JAVA
for (variavelDeControle; condiçãoDeControle;AtribuiçãodaVariavel){
//comandos
}

Primeiro o comando for vai declarar¹ e atribuir um valor inicial a sua variável de controle independente
do que já foi declarado antes nesta variável.
¹não é necessário declarar diretamente no comando for a váriavel, ela pode ser declarada anteriormente.
Abaixo é declarado e inicializado a variável com o valor 0 (zero):
? [Copy to clipboard]View Code JAVA
for (int variavel=0;_____;_____){
//comandos
}

Depois o comando vai verificar se a condição estipulada por você é verdadeira.
Abaixo verificará se a sua variável é menor que 10 (dez):
? [Copy to clipboard]View Code JAVA
for (_________; variavel&lt;10; _____){
//comandos
}

Em seguida pulará para o bloco de comando:
Veja abaixo:
? [Copy to clipboard]View Code JAVA
for (variavel=0;variavel&lt;10;______){

//comandos
}
Após ter executado seus comandos, o for irá atribuir o valor da variável,
Abaixo é atribuído 1 inteiro a variável:
? [Copy to clipboard]View Code JAVA
for (_________;_________;variavel++){
//comandos
}

Agora o for irá verificar sua condição e atribuir +1 até que se termine as condições.
? [Copy to clipboard]View Code JAVA
for (int variavel=0;variavel&lt;10;variavel++){
//comandos
}

Veja o  Exemplo abaixo como é simples, tente aplicar o for para os programas que você já utiliza o while.
? [Copy to clipboard]View Code JAVA
public class usandoofor {
public static void main(String[] args) {
int variavel=10;
for (variavel=0;variavel&lt;10;variavel++){
System.out.println(variavel+1);
}
}
}