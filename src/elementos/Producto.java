package elementos;

public class Producto{

    private final static String DIRECCION_IMAGENES = "./src/imagenes";
    private String nombre;
    private float precio;
    private String descripcion;
    private String direccionImagen;
    
    public Producto(String nombre,float precio, String descripcion,String direccionImagen){
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.imagen = DIRECCION_IMAGENES + direccionImagen;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public float getPrecio(){
        return this.precio;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public String getDireccionImagen(){
        return this.direccionImagen;
    }

}
