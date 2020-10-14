public class BoletoNacional extends Boleto {
	private String curpPasajero;

	public BoletoNacional(String nombrePasajero,
			int edadPasajero,
			String generoPasajero,
			EnumClase clasePasajero,
			int numAsiento,
			int numVuelo,
			String aerolinea,
			String destino,
			String curpPasajero) {
		super(nombrePasajero,
				edadPasajero,
				generoPasajero,
				clasePasajero,
				numAsiento,
				numVuelo,
				aerolinea,
				destino);
		this.curpPasajero = curpPasajero;
		this.tipoVuelo = EnumVuelo.NACIONAL;
	}

	public String mostrar() {
		String linea = "-------------------------------------------------------------------------------------------------------------------------------------------------\n";
		String encabezado = "\t\t\t\t\t\t\t\t\tBoleto\n";
		String datosFormato = "%10s%10s%10s%10s%15s%10s%10s%10s%25s\n";
		return String.format(
				linea + encabezado + linea + datosFormato + datosFormato,
				"Nombre",
				"Edad",
				"Genero",
				"Clase",
				"No. Asiento",
				"No. Vuelo",
				"Aerolínea",
				"Destino",
				"CURP",
				this.nombrePasajero,
				this.edadPasajero,
				this.generoPasajero,
				this.clasePasajero,
				this.numAsiento,
				this.numVuelo,
				this.aerolinea,
				this.destino,
				this.curpPasajero);
	}
}

