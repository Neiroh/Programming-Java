//Este programa simula el lanzamiento de un dado 5 veces consecutivas//
public class Fordados{
	public static void main(String args[]){
		int i;

		for (i=0; i<6; i++){
			int n = (int)(Math.random()*6+1);
			System.out.println(+n);
		}
	}
}