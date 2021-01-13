import java.util.Scanner;

public class iva{

	/*Este programa calcula el precio de un artículo conociendo la base
	imponible, el tipo de iba y el código promocional*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Declaramos los tipos de iva, si cambia el iva sustituye los valores

		double ivaGeneral = 21;
		ivaGeneral /= 100;
		double ivaReducido = 0.1;
		double ivaSuper = 4;
		ivaSuper /= 100;

		//Declaramos los propios códigos promocionales

		double mitad = 0.5;
		double meno5 = 5;
		double porc = 5;
		porc /= 100; 

		//Estas variables son las que usaremos como final del cálculo. NO CAMBIAR

		double ivaPago = 0;

		double promoPago = 0;

		double precioIva = 0;

		double total = 0;

		//Pedimos al usuario los datos

		System.out.println("Introduzca la base imponible:");
		double baseCliente = sc.nextDouble();

		System.out.println("Introduzca el tipo de IVA (general, reducido, superreducido):");
		String ivaCliente = sc.next();

		System.out.println("Introduzca el código promicional (nopro, mitad, meno5, porc):");
		String promoCliente = sc.next();

		/*Aquí comienza el programa de cálculo, primeramente verificamos que los datos
		insertados sean correctos*/

		if(baseCliente<=0){
			System.out.println("Introduzca un precio real");
		}else{
			if(ivaCliente.equalsIgnoreCase("general") || ivaCliente.equalsIgnoreCase("reducido") || ivaCliente.equalsIgnoreCase("superreducido")){

				if(promoCliente.equalsIgnoreCase("nopro") || promoCliente.equalsIgnoreCase("mitad") || promoCliente.equalsIgnoreCase("meno5") || promoCliente.equalsIgnoreCase("porc")){

					//Aquí termina el proceso de detección de fallos

					if(ivaCliente.equalsIgnoreCase("general")){

						/*Este primer IF servirá para cuando el iva que se utilice
						sea de tipo general*/

						if(promoCliente.equalsIgnoreCase("nopro")){

							/*Este IF sirve para cuando no se usa una promoción*/

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaGeneral*baseCliente;
							System.out.println("IVA (" + ivaGeneral + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + 0);
							total = precioIva;
							System.out.println("TOTAL " + total);

						}else if(promoCliente.equalsIgnoreCase("mitad")){

							/*Este IF sirve para el caso en el que la promoción es de
							tipo MITAD*/

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaGeneral*baseCliente;
							System.out.println("IVA (" + ivaGeneral + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							promoPago = precioIva*mitad;
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + promoPago);
							total = precioIva-promoPago;
							System.out.println("TOTAL " + total);

						}else if(promoCliente.equalsIgnoreCase("meno5")){

							/*Este IF sirve para aplicar la promoción meno5*/	

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaGeneral*baseCliente;
							System.out.println("IVA (" + ivaGeneral + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + 5);
							total = precioIva-5;
							System.out.println("TOTAL " + total);

						}else{

							/*Este IF sirve para el caso en que la promoción sea 5porc*/	

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaGeneral*baseCliente;
							System.out.println("IVA (" + ivaGeneral + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							promoPago = precioIva*porc;
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + promoPago);
							total = precioIva-promoPago;
							System.out.println("TOTAL " + total);

						}
					}else if(ivaCliente.equalsIgnoreCase("reducido")){

						/*Este IF se utilizará en caso de que el iva sea reducido*/

						if(promoCliente.equalsIgnoreCase("nopro")){

							/*Este IF sirve para cuando no se usa una promoción*/

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaReducido*baseCliente;
							System.out.println("IVA (" + ivaReducido + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + 0);
							total = precioIva;
							System.out.println("TOTAL " + total);

						}else if(promoCliente.equalsIgnoreCase("mitad")){

							/*Este IF sirve para el caso en el que la promoción es de
							tipo MITAD*/

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaReducido*baseCliente;
							System.out.println("IVA (" + ivaReducido + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							promoPago = precioIva*mitad;
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + promoPago);
							total = precioIva-promoPago;
							System.out.println("TOTAL " + total);

						}else if(promoCliente.equalsIgnoreCase("meno5")){

							/*Este IF sirve para aplicar la promoción meno5*/	

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaReducido*baseCliente;
							System.out.println("IVA (" + ivaReducido + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + 5);
							total = precioIva-5;
							System.out.println("TOTAL " + total);

						}else{

							/*Este IF sirve para el caso en que la promoción sea 5porc*/	

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaReducido*baseCliente;
							System.out.println("IVA (" + ivaReducido + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							promoPago = precioIva*porc;
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + promoPago);
							total = precioIva-promoPago;
							System.out.println("TOTAL " + total);

						}

					}else if(ivaCliente.equalsIgnoreCase("superreducido")){

						if(promoCliente.equalsIgnoreCase("nopro")){

							/*Este IF sirve para cuando no se usa una promoción*/

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaSuper*baseCliente;
							System.out.println("IVA (" + ivaSuper + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + 0);
							total = precioIva;
							System.out.println("TOTAL " + total);

						}else if(promoCliente.equalsIgnoreCase("mitad")){

							/*Este IF sirve para el caso en el que la promoción es de
							tipo MITAD*/

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaSuper*baseCliente;
							System.out.println("IVA (" + ivaSuper + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							promoPago = precioIva*mitad;
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + promoPago);
							total = precioIva-promoPago;
							System.out.println("TOTAL " + total);

						}else if(promoCliente.equalsIgnoreCase("meno5")){

							/*Este IF sirve para aplicar la promoción meno5*/	

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaSuper*baseCliente;
							System.out.println("IVA (" + ivaSuper + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + 5);
							total = precioIva-5;
							System.out.println("TOTAL " + total);

						}else{

							/*Este IF sirve para el caso en que la promoción sea 5porc*/	

							System.out.println("Base imponible " +baseCliente);
							ivaPago = ivaSuper*baseCliente;
							System.out.println("IVA (" + ivaSuper + ") " + ivaPago);
							precioIva = ivaPago+baseCliente;
							System.out.println("Precio con IVA " +precioIva);
							promoPago = precioIva*porc;
							System.out.println("Cód. promo. ("+ promoCliente + "): -" + promoPago);
							total = precioIva-promoPago;
							System.out.println("TOTAL " + total);

						}

					}
				}else{
					System.out.println("El código promocional insertado es incorrecto");
				}
			}else{
				System.out.println("El tipo de iva insertado es incorrecto");
			}
		}
	}
}