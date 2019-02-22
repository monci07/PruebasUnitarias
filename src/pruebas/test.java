package pruebas;

import enumeraciones.Calculadora;
import enumeraciones.Operaciones;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora c=new Calculadora();
        System.out.println("Seleccione operacion: ");
        String operacion = entrada.nextLine().toUpperCase();

        System.out.println("Escribe operador 1: "); double ope1=entrada.nextDouble();
        System.out.println("Escribe operador 2: "); double ope2=entrada.nextDouble();

        c.setOperacion(Operaciones.valueOf(operacion));
        System.out.println(c.resultado(ope1,ope2));
    }
}
