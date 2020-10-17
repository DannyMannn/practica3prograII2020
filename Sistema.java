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

			System.out.print("Tipo de vuelo (Internacional/Nacinoal): ");
			String vuelo = scanner.nextLine().toUpperCase();
			EnumVuelo tipoDeVuelo = EnumVuelo.valueOf(vuelo);

			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();

			System.out.print("Edad: ");
			int edad = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Genero: ");
			String genero = scanner.nextLine();

			System.out.print("Clase de vuelo (Primera_Clase/Ejecutivo/Turista): ");
			String claseVuelo = scanner.nextLine().toUpperCase();
			EnumClase claseDeVuelo = EnumClase.valueOf(claseVuelo);

			System.out.print("Numero de asiento: ");
			int numAsiento = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Numero de vuelo: ");
			int numVuelo = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Aerolinea: ");
			String aerolinea = scanner.nextLine();

			System.out.print("Destino: ");
			String destino = scanner.nextLine();

			Boleto boleto = getBoleto(nombre,edad,
									genero,tipoDeVuelo,claseDeVuelo,
									numAsiento,numVuelo,aerolinea,destino);
			Pasajero pasajero = getPasajero(boleto);
			//System.out.println(boleto.mostrar());
			System.out.println(pasajero.getBoleto().mostrar());

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

	public static Pasajero getPasajero(Boleto boleto){
		Pasajero pasajero = null;
		switch(boleto.clasePasajero) {
			case PRIMERA_CLASE:
				pasajero = new PasajeroPrimeraClase(boleto);
				return pasajero;
			case EJECUTIVO:
				pasajero = new PasajeroEjecutivo(boleto);
				return pasajero;
			case TURISTA:
				pasajero = new PasajeroTurista(boleto);
				return pasajero;
		}
		return pasajero;
	}

}
