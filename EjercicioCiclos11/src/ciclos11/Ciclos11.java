/*
Andrea Llavel.Asistencia Octubre.Leccion2.Fecha:14/10/2022.Encrypted Code..Materia Programacion
Ejercicio 11:Diseñar un programa que muestre el producto de los 10 primeros numeros impares 
Hacelo con JOptionPane
*/
package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        long producto =1;
        for(int i= 1; i<=20;i+=2){
            producto *=i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los numeros impares es: "+producto);
    }
}//La segunda parteLa realiza Rocio Pulitta
