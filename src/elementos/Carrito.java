package elementos;

import java.util.ArrayList;

public class Carrito{
    private final static float PORCENTAJE_IMPUESTOS = 0.15;
    private ArrayList<Producto> producto;
    private ArrayList<int> numeroElementos;
    private float subTotal;
    private 
    public Carrito(){
        this.producto = new ArrayList<Producto>();
        this.numeroElementos = new ArrayList<int>();
        this.subTotal = 0.00;
    }
    public void agregarProducto(Producto productoAgregado, int numeroElementos){
        if (this.producto.contains(productoAgregado){
            int posicionProducto,numeroElementosAnt,numeroElementosDes;
            posicionProducto = this.producto.indexOf(producto);
            numeroElementosAnt = this.numeroElementos.get(posicionProducto);
            numeroElementosDes = numeroElementosAlm + numeroElementos;
            this.numeroElementos.set(posicionProducto,numeroElementosDes);
        }
        else{
            this.producto.add(productoAgregado);
            this.numeroElementos.add(numeroElementos);
        }
    }
    public void eliminarProducto(Producto producto){
        int posicionProducto;
        posicionProducto = this.producto.indexOf(producto);
        this.producto.remove(producto);
        this.numeroElementos.remove(posicionProducto);
    }
    public void sumarSubTotal(){
        int i ;
        for(i=0;i<this.producto.size();i++){
        
        }
    }

}
