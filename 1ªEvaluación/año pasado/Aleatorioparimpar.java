public class Aleatorioparimpar{
	public static void main(String args[]){
		int n = (int)(Math.random()*100+100);

		if (n%2==0){
			System.out.println(n+ " es par");
		}else{
			System.out.println(n+ " es impar");
		}
	}
}