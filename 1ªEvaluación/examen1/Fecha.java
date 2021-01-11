import java.util.Scanner;

public class Fecha{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el día");
		int dia = sc.nextInt();
		System.out.println("Ingresa el mes");
		int mes = sc.nextInt();
		System.out.println("Ingresa el año");
		int año = sc.nextInt();

		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
			if (dia<=31 && dia >=1){
				System.out.println("FECHA CORRECTA");
			}else {
				System.out.println("FECHA INCORRECTA");
			}
		}else if (mes==4 || mes==6 || mes==9 || mes==11){
			if (dia<=30 && dia >=1){
				System.out.println("FECHA CORRECTA");
			}else {
				System.out.println("FECHA INCORRECTA");
			}
		}else if (mes==2){
			if ((año%4 == 0 && año%100 != 0) || año%400==0){
				if (dia<=29 && dia >= 1){
					System.out.println("FECHA CORRECTA");
				}else {
					System.out.println("FECHA INCORRECTA");
				}
			}else {
				if (dia<=28 && dia>=1){
					System.out.println("FECHA CORRECTA");
				}else {
					System.out.println("FECHA INCORRECTA");
				}
			}
		}else {
			System.out.println("FECHA INCORRECTA");
		}
	}
}