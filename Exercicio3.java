import java.util.Scanner;

/*
    1. Um mesmo arquivo não pode conter duas classes públicas.
    2. Da forma como foi implementado, utiliza-se um tipo double para as operações de soma e subtração.
    3. Uso inadequado do conceito de encapsulamento.

    Esperava-se a implementação de uma classe que represente um valor monetário, objetos dessa classe 
    fariam as operações de soma e subtração considerando as características dos objetos.

    Nota: 2.

*/

public class Exercicio3{

	public static void main (String args[]){
	
		Dinheiro d = new Dinheiro();
		Scanner ler = new Scanner(System.in);
		
		double n1,n2;
		int opcao;
		
		
		
		System.out.println("Digite 1 para somar ou 2 para subtrair ");
		opcao = ler.nextInt();
		System.out.println("Digite o primeiro numero");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo numero");
		n2 = ler.nextDouble();
		
		if(opcao==1){
			d.somar(n1,n2);
		}
		else
			d.subtrair(n1,n2);	
		
		System.out.printf("O resultado foi %.2f %n",d.getResultado());	
			
	
	}


}

public class Dinheiro{

	private double resultado;
	

	
	public double getResultado(){
		
		return this.resultado;
	}
	
	
	public void somar(double x,double z){
		
		this.resultado=x+z;
		
	}
	
	public void subtrair(double x,double z){
		
		this.resultado=x-z;
		
	}

}
