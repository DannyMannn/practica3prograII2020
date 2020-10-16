import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("¿Emitir boleto?(S/N): ");
			String opc = scanner.nextLine();

			if(opc.toLowerCase().equals("n"))
				break;

			System.out.print("Tipo de vuelo: ");
			String vuelo = scanner.nextLine();
			EnumVuelo tipoDeVuelo = EnumVuelo.valueOf(vuelo);

			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();

			System.out.print("Edad: ");
			int edad = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Genero: ");
			String genero = scanner.nextLine();

			System.out.print("Clase de vuelo: ");
			String claseVuelo = scanner.nextLine().toUpperCase();
			EnumClase claseDeVuelo = EnumClase.valueOf(claseVuelo);
			
			System.out.print("Numero de asiento: ");
			int numAsiento = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Aerolinea: ");
			String aerolinea = scanner.nextLine();

			System.out.print("Destino: ");
			String destino = scanner.nextLine();

			Boleto boleto = getBoleto("dan",20,
					"m",EnumVuelo.INTERNACIONAL,EnumClase.TURISTA,
					21,322,"jets","hell");
			System.out.println(boleto.mostrar());

		}
	}


	public static Boleto getBoleto(String nombrePasajero,
								   int edadPasajero,
								   String generoPasajero,
								   EnumVuelo tipoVuelo,
								   EnumClase clasePasajero,
								   int numAsiento,
								   int numVuelo,
								   String aerolinea,
								   String destino
								   ){
		Boleto boleto = null;
		Scanner scanner = new Scanner(System.in);
		switch(tipoVuelo){
			case NACIONAL:
				System.out.print("Ingresa CURP: ");
				String CURP = scanner.nextLine();
				boleto = new BoletoNacional(nombrePasajero,
											edadPasajero,
											generoPasajero,
											clasePasajero,
											numAsiento,
											numVuelo,
											aerolinea,
											destino,
											CURP
											);
				return boleto;
			case INTERNACIONAL:
				System.out.println("Ingresa numero de pasaporte: ");
				int numPasaporte = scanner.nextInt();
				scanner.nextLine();

				EnumVisa tipoVisa = null;
				int añosVigencia = 0;
				try{
					System.out.println("Ingresa tipo de visa: ");
					tipoVisa = EnumVisa.valueOf(scanner.nextLine().toUpperCase());
				}catch(Exception e){
					System.out.println("Error: entrada invalida");
				}

				try{
					System.out.println("Años de vigencia de la visa: ");
					añosVigencia = scanner.nextInt();
				}catch(Exception e){
					System.out.println("Error: Entrada invalida");
				}

				boleto = new BoletoInternacional(nombrePasajero,
						edadPasajero,
						generoPasajero,
						clasePasajero,
						numAsiento,
						numVuelo,
						aerolinea,
						destino,
						numPasaporte,
						tipoVisa,
						añosVigencia);
				return boleto;
		}
		return boleto;
	}

}
