package modelos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.menu();
    }

    private Integer numero1;
    private Integer numero2;


    public int sumar(int num1, int num2){

        int resultado;
        resultado = num1+num2;
        System.out.println("El resultado de la suma es: " + resultado);
        return resultado;
    }

    public int restar(int num1, int num2){

        int resultado;
        resultado = num1-num2;
        System.out.println("El resultado de la resta es: " + resultado);
        return resultado;
    }

    public int multiplicar(int num1, int num2){

        int resultado;
        resultado = num1*num2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
        return resultado;
    }

    public double dividir(double num1, double num2){

        double resultado;
        resultado = num1/num2;
        System.out.println("El resultado de la division es: " + resultado);
        return resultado;
    }

    public String menu(){
        Calculadora calculadora = new Calculadora();
        System.out.println("Ingrese la operacion que desea realizar: [+] [-] [*] [/]");
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
        System.out.println("Ingrese el primer numero: ");
        Scanner num1 = new Scanner(System.in);
        Integer n1 = num1.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        Scanner num2 = new Scanner(System.in);
        Integer n2 = num2.nextInt();

        if (opcion.equals("+")){
            calculadora.sumar(n1, n2);
        }else if (opcion.equals("-")){
            calculadora.restar(n1,n2);
        } else if (opcion.equals("*")) {
            calculadora.multiplicar(n1,n2);
        }else if (opcion.equals("/")) {
            calculadora.dividir(n1, n2);
        }
        return opcion;
    }
}