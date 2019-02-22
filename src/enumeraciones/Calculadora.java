package enumeraciones;

public class Calculadora {
    private Operaciones operacion;

    public Calculadora(){
        super();
    }

    public Operaciones getOperacion() {
        return operacion;
    }

    public void setOperacion(Operaciones operacion) {
        this.operacion = operacion;
    }

    public double resultado(double ope1, double ope2){
        return operacion.resultado(ope1,ope2);
    }
}
