public class BoletoInternacional extends Boleto {
	private int numPasaporte;
	private EnumVisa tipoVisa;
	private int añosVigenciaVisa;

	/**
	 * Constructor de la clase.
	 *
	 * @param nombrePasajero	el nombre del pasajero.
	 * @param edadPasajero	la edad del pasajero.
	 * @param generoPasajero	el género del pasajero.
	 * @param clasePasajero		la clase en la que vuela el pasajero.
	 * @param numAsiento	el asiento asignado al pasajero.
	 * @param numVuelo	el número de vuelo.
	 * @param aerolinea		la aerolínea.
	 * @param destino	el destino del pasajero.
	 * @param numPasaporte	el número de pasaporte del pasajero.
	 * @param tipoVisa	el tipo de visa del pasajero.
	 * @param añosVigenciaVisa	la vigencia en años de la visa del pasajero.
	 */
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

	/**
	 * Da formato a los datos del boleto para su impresión.
	 *
	 * @return una cadena con formato conteniendo los datos a mostrar.
	 */
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

