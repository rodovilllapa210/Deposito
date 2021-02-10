/**
 *Proyecto Deposito que sirve de práctica para ED04
 */
package cuentas;

/**
 * 
 * Clase Principal del proyecto desde la que se crea y gestiona una cuenta bancaria 
 *   
 * @author Rodolfo Villena Lapaz
 * @version 1.0
 * 
 */
public class Main {

    public static void main(String[] args) {
        
    	/**
    	 * Desde el método Main se crea una cuenta, se inicializa en el método
    	 * operativa_cuenta con unos valores prefijados
    	 * y se intenta ejecutar una retirada y un ingreso en la cuenta
    	 * 
    	 */
    	
    	CCuenta cuenta1;
        double saldoActual;

        cuenta1 = operativa_cuenta(0);
		
        /**
         * Llamadas a los métodos de la clase CCuenta para efectuar ingresos y retiradas de dinero
         * @throws avisa de fallos al ingresar o retirar dinero
         */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	/**
	 * Método de clase que crea una cuenta, la inicializa llamando a la clase CCuenta
	 * con unos parámetros prefijados y muestra el saldo actual de la cuenta creada
	 * Muestra por pantalla el saldo a la creación de la cuenta
	 * @param cantidad para inicializar el saldo de la cuenta
	 * @return tipo CCuenta con la cuenta creada
	 */
	private static CCuenta operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,cantidad);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: "+ saldoActual+"€");
		return cuenta1;
	}
}