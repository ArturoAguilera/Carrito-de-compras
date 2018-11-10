package elementos;

import java.util.ArrayList;

public class Carrito{
    private ArrayList<Producto> producto;
    private ArrayList<int> numeroElementos;
    public Carrito(){
        this.producto = new ArrayList<Producto>();
        this.numeroElementos = new ArrayList<int>();
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

}
