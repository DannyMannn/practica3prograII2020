public abstract class Boleto {
	protected String nombrePasajero;
	protected int edadPasajero;
	protected String generoPasajero;
	protected EnumClase clasePasajero;
	protected int numAsiento;
	protected int numVuelo;
	protected String aerolinea;
	protected String destino;
	protected EnumVuelo tipoVuelo;

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
	 */
	public Boleto(String nombrePasajero,
			int edadPasajero,
			String generoPasajero,
			EnumClase clasePasajero,
			int numAsiento,
			int numVuelo,
			String aerolinea,
			String destino) {
		this.nombrePasajero = nombrePasajero;
		this.edadPasajero = edadPasajero;
		this.generoPasajero = generoPasajero;
		this.clasePasajero = clasePasajero;
		this.numAsiento = numAsiento;
		this.numVuelo = numVuelo;
		this.aerolinea = aerolinea;
		this.destino = destino;
	}

	/**
	 * Da formato a los datos del boleto para su impresión.
	 *
	 * @return una cadena con formato conteniendo los datos a mostrar.
	 */
	public abstract String mostrar();
}

