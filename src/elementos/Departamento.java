package elementos;

import java.util.ArrayList;

public class Departamento{

    private String nombre;
    private ArrayList<Producto> productos;
    
    public Departamento(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<Producto>();
    }
    public String getNombre(){
        return this.nombre;
    }
    public Producto getProducto(int index){
        if(this.productos.isEmpty()){
            return null;
        }
        else{
            return this.productos.get(index);
        }
    }
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
}
