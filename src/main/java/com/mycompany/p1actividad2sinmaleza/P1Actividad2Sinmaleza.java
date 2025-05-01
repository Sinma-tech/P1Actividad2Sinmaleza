package com.mycompany.p1actividad2sinmaleza;
import java.util.Scanner;
public class P1Actividad2Sinmaleza {

   public static class BadNames {

    // Arreglo donde guardaremos hasta 10 números
    private int[] num = new int[10];   // ¿qué es “n”?//  num = numero
    private int numIngresados = 0;               // índice actual… ¿“i” de qué? / i remplazado por numIngresados

    // Método “a”: agrega un número al arreglo // a remplzado por agregarNum
    public void agregarNum(int num2) {   //  v remplzado por num2
        num[numIngresados++] = num2;                  // “v” tampoco dice mucho
    }

    // Método “b”: calcula la suma // Remplzado por calcularSuma
    public int calcularSuma() {
        int suma = 0;                   // “s” -> ¿suma? ¿salario?
        for (int j = 0; j < numIngresados; j++) {
            suma += num[j];
        }
        return suma; // S remplzado por suma 
    }

    // Método “c”: promedio de los números guardados
    public double calcularPromedio() {
        return numIngresados == 0 ? 0 : (double) calcularSuma() / numIngresados;
    
    }
    // Pequeña interfaz de consola para ejecutar y probar
    public static void main(String[] args) {
        BadNames calcular = new BadNames();               // ¿por qué “x”?
        Scanner scanner  = new Scanner(System.in);

        System.out.print("¿Cuántos números ingresará? ");
        int totalNum = scanner .nextInt();                      // “t” -> ¿total?

        for (int indiceEntrada = 0; indiceEntrada < totalNum; indiceEntrada++) {              // “k” -> contador genérico
            System.out.print("Número: ");
            calcular.agregarNum(scanner .nextInt());
        }

        System.out.println("Suma = " + calcular.calcularSuma());
        System.out.println("Promedio = " + calcular.calcularPromedio());
        scanner .close();
    }
   }
}

