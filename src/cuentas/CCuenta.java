/**
 *Proyecto Deposito que sirve de práctica para ED04
 * 
 */
package cuentas;

/**
 * 
 * Clase CCuenta que tiene 4 atributos privados de la clase
 * 2 métodos constructores, 1 con parámetros y otro sin ellos,
 * 3 métodos, 1 para obtener el saldo de la cuenta
 * otro para ingresar dinero y otro para extraerlo,
 * 1 métodos get/set privados para establecer el valor de los atributos
 *   
 * @author Rodolfo Villena Lapaz
 * @version 1.0
 * 
 */
public class CCuenta {


    /**
     * Parámetro que guarda el nombre del dueño de la cuenta
     */
	private String nombre;
	
	/**
     * Parámetro que guarda el número de la cuenta
     */
    private String cuenta;
    
    /**
     * Parámetro que guarda el saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Parámetro que guarda el tipo de interés de la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor vacío de la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros de la clase CCuenta
     * @param nom tipo String que contiene el nombre del dueño de la cuenta
     * @param cue tipo String que contiene el número de la cuenta
     * @param sal tipo double que contiene el saldo de la cuenta
     * @param tipo tipo double que contiene el tipo de inetrés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }

    /**
     * Método que devuelve el saldo de la cuenta
     * @return saldo tipo double
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que ingresa dinero en la cuenta
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que retira dinero de la cuenta
     * @param cantidad tipo double saldo que se pasa al constructor de la cuenta para inicializarla
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Métodos get/set de los atributos de la clase
     */
    
    /**
	 * @return the nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipoInterés
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInterés the tipoInterés to set
	 */
	private void setTipoInteres(double tipoInterés) {
		this.tipoInteres = tipoInteres;
	}
}