//En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
//entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
//que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
//de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
//de todos sus atributos

package ejercicio.pkg1.guia.pkg1;


public class Ejercicio1Guia1 {


    
    public static void main(String[] args) {
        Producto pan = new Producto ("Pan Flauta",11236478,50.2, 5);
        pan.mostrar();
//        solo para probar mostrar con get:
        System.out.println("el stock es :"+pan.getStock());
    }
    
}
