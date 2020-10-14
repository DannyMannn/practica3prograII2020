public class BoletoInternacional extends Boleto {
	private int numPasaporte;
	private EnumVisa tipoVisa;
	private int añosVigenciaVisa;

	public BoletoInternacional(String nombrePasajero,
			int edadPasajero,
			String generoPasajero,
			EnumClase clasePasajero,
			int numAsiento,
			int numVuelo,
			String aerolinea,
			String destino,
			int numPasaporte,
			EnumVisa tipoVisa,
			int añosVigenciaVisa) {
		super(nombrePasajero,
				edadPasajero,
				generoPasajero,
				clasePasajero,
				numAsiento,
				numVuelo,
				aerolinea,
				destino);
		this.numPasaporte = numPasaporte;
		this.tipoVisa = tipoVisa;
		this.añosVigenciaVisa = añosVigenciaVisa;
		this.tipoVuelo = EnumVuelo.INTERNACIONAL;
	}

	public String mostrar() {
		String linea = "-------------------------------------------------------------------------------------------------------------------------------------------------\n";
		String encabezado = "\t\t\t\t\t\t\t\t\tBoleto\n";
		String datosFormato = "%10s%10s%10s%10s%15s%10s%10s%10s%15s%15s%20s\n";
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
				"No. Pasaporte",
				"Tipo de VISA",
				"Vigencia de VISA",
				this.nombrePasajero,
				this.edadPasajero,
				this.generoPasajero,
				this.clasePasajero,
				this.numAsiento,
				this.numVuelo,
				this.aerolinea,
				this.destino,
				this.numPasaporte,
				this.tipoVisa,
				this.añosVigenciaVisa);
	}
}

