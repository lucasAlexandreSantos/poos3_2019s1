import java.util.Scanner;

public class Exercicio{

	public static void main (String [] args){
		
		int triangulo1[]= new int[3] ;
		int triangulo2[]= new int[3] ;
		int triangulo3[]= new int[3] ;
		int triangulo4[]= new int[3] ;
		int triangulo5[]= new int[3] ;
		int c=1;
		
		c=lerTriangulo(triangulo1,c);
		c=lerTriangulo(triangulo2,c);
		c=lerTriangulo(triangulo3,c);
		c=lerTriangulo(triangulo4,c);
		c=lerTriangulo(triangulo5,c);
		
		c=1;
		
		c=verificarTriangulo(triangulo1,c);
		c=verificarTriangulo(triangulo2,c);
		c=verificarTriangulo(triangulo3,c);
		c=verificarTriangulo(triangulo4,c);
		c=verificarTriangulo(triangulo5,c);
	
	
	
	}
	public static int lerTriangulo(int triangulo[],int c){
			Scanner input = new Scanner(System.in);
			for(int i=0;i<3;i++){
					do{
						System.out.println("Digite a "+(i+1)+"° medida do conjunto"+c);
						triangulo[i]=input.nextInt();
					}while(triangulo[i]<=0);	
			}
			return c+1;		
	}

	public static int verificarTriangulo(int triangulo[],int c){
		int x=triangulo[0],y=triangulo[1],z=triangulo[2];
		if(x+y>z && x+z>y && y+z>x){
			if (x==y && x==z)
				System.out.println("O "+c+"° conjunto de valores forma um triangulo equilatero");
			else if (x==y || x==z || z==y)
				System.out.println("O "+c+"° conjunto de valores forma um triangulo isoceles");
			else
				System.out.println("O "+c+"° conjunto de valores forma um triangulo escaleno");		
		}
		else
			System.out.println("O "+c+"° conjunto de valores nao forma um triangulo");	
		
		return c+1;

			
	}
	
	
}