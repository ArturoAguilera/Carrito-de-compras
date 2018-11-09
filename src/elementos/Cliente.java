package elementos;
public class Cliente{
    private final static int INTENTOS_POSIBLES = 5;
    private String nombre;
    private String contrasenia;
    private Carrito carrito;
    private boolean cuentaActiva;
    private int intentosRestantes;
    
    public Cliente(String nombre,String contrasenia){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.carrito = new Carrito();
        this.cuentaActiva = True;
        this.intentosRestantes = INTENTOS_POSIBLES;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getContrasenia(){
        return this.contrasenia;
    }
    public Carrito getCarrito(){
        return this.carrito;
    }
    public boolean getCuentaActiva(){
        return this.cuentaActiva;
    }
    public int getIntentosRestantes(){
        return this.intentosRestantes;
    }
    public boolean validarCuentaActiva(){
        if(this.intentosRestantes>0)
            return True;
        else{
            this.cuentaActiva = False;
            return False;
        }
    }
    public void restarIntentos(){
        this.intentosRestantes = this.intentosRestantes - 1;   
    }
}
