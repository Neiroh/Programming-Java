//Este programa muestra los multiplos de 5 entre 5 y el número dado por el usuario//
public class Multiplocinco{
	public static void main (String args[]){
		int n = Integer.parseInt(args[0]);
		int c = 5;

		while (c<=n && c%5==0){
			System.out.println(+c);
			c++; c++; c++; c++; c++;
		}
	}
}