package elementos;

import java.util.ArrayList;

public class Carrito{
    private final static double PORCENTAJE_IMPUESTOS = 0.15;
    private ArrayList<Producto> producto;
    private ArrayList<int> numeroElementos;
    private double subtotal;
    private double total;
    private double impuestos;
    public Carrito(){
        this.producto = new ArrayList<Producto>();
        this.numeroElementos = new ArrayList<int>();
        this.subtotal = 0.00;
        this.total = 0.00;
        this.impuestos = 0.00;
    }
    public double getSubtotal(){
        return this.subtotal;
    }
    public double getTotal(){
        return this.total;
    }
    public double getImpuestos(){
        return this.impuestos;
    }
    public void agregarProducto(Producto productoAgregado, int numeroElementos){
        if (this.producto.contains(productoAgregado)){
            int posicionProducto,numeroElementosAnt,numeroElementosDes;
            posicionProducto = this.producto.indexOf(producto);
            numeroElementosAnt = this.numeroElementos.get(posicionProducto);
            numeroElementosDes = numeroElementosAnt + numeroElementos;
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
    public void sumarSubtotal(){
        int i ;
        for(i=0;i<this.producto.size();i++){
            this.subtotal = this.subtotal + (this.producto.get(i).getPrecio() * this.numeroElementos.get(i));
        }
    }
    public void calcularTotal(){
        this.impuestos = this.subtotal * PORCENTAJE_IMPUESTOS;
        this.total = this.subtotal + this.impuestos;
    }
}
