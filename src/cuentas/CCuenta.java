/**
 *Proyecto Deposito que sirve de pr�ctica para ED04
 * 
 */
package cuentas;

/**
 * 
 * Clase CCuenta que tiene 4 atributos privados de la clase
 * 2 m�todos constructores, 1 con par�metros y otro sin ellos,
 * 3 m�todos, 1 para obtener el saldo de la cuenta
 * otro para ingresar dinero y otro para extraerlo,
 * 1 m�todos get/set privados para establecer el valor de los atributos
 *   
 * @author Rodolfo Villena Lapaz
 * @version 1.0
 * 
 */
public class CCuenta {


    /**
     * Par�metro que guarda el nombre del due�o de la cuenta
     */
	private String nombre;
	
	/**
     * Par�metro que guarda el n�mero de la cuenta
     */
    private String cuenta;
    
    /**
     * Par�metro que guarda el saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Par�metro que guarda el tipo de inter�s de la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor vac�o de la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con par�metros de la clase CCuenta
     * @param nom tipo String que contiene el nombre del due�o de la cuenta
     * @param cue tipo String que contiene el n�mero de la cuenta
     * @param sal tipo double que contiene el saldo de la cuenta
     * @param tipo tipo double que contiene el tipo de inetr�s de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }

    /**
     * M�todo que devuelve el saldo de la cuenta
     * @return saldo tipo double
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * M�todo que ingresa dinero en la cuenta
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * M�todo que retira dinero de la cuenta
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
     * M�todos get/set de los atributos de la clase
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
	 * @return the tipoInter�s
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInter�s the tipoInter�s to set
	 */
	private void setTipoInteres(double tipoInter�s) {
		this.tipoInteres = tipoInteres;
	}
}