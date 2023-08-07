//En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
//entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
//que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
//de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
//de todos sus atributos

package ejercicio.pkg1.guia.pkg1;

public class Producto {
    private String descripcion;
    private int codigo;
    private double precio;
    private int stock;

 public Producto (String descripcion, int codigo, double precio, int stock) {
    this.descripcion=descripcion;
    this.precio=precio;
    this.stock=stock;
    this.codigo=codigo;
     }

       public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
           
    
 public void mostrar(){
            System.out.println("stock es: "+stock);
            System.out.println("descripcion: "+descripcion); 
            System.out.println("precio es: "+precio);
             System.out.println("codigo es: "+codigo);
 }
}
