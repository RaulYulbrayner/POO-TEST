package co.edu.uniquindio.poo;

public class Ejercicio2 {

    //Sumar los primeros numeros naturales
    public static  int sumarNumeros(int numero){
        int i = 1;
        int suma = 0;
        while (i<=numero){
            suma += i;
            i++;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(sumarNumeros(10));
    }
}
