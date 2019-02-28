import java.util.Scanner;

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