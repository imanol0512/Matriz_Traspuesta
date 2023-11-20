/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz_transpuesta;

import java.util.Scanner;

/**
 *
 * @author tanei
 */
public class Matriz_transpuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //se declara e inicializa  una matriz bidimesional  de 3x3
        int matriz[][] = new int[3][3];

       for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print("Matriz[" + i + "][" + j + "]:");
        matriz[i][j] = entrada.nextInt();
    }
}

       //imprimimos la matriz original 
        System.out.println("\nMatriz Original:");
        for (int  i = 0; i < 3;i++ ){
        for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
 // Trasponiendo la matriz
 
int aux;//declaramos una variable pare evitar error ya que vamos a utilizar la misma
//variable para otra matriz
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < i; j++) {//le quitamos 3 por que queremos que sea lo pouesto no lo igual
        aux = matriz[i][j];//almacena temporalmente la posicion 
        matriz[i][j] = matriz[j][i];
        matriz[j][i] = aux;
    }
}
        System.out.println("\nLa Matriz traspuestas es:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz [i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
    }
}