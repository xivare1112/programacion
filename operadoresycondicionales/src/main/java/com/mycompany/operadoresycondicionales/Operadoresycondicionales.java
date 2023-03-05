/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoresycondicionales;

/**
 *
 * @author xiomaravazquezreyes
 */
public class Operadoresycondicionales {

    public static void main(String[] args) {
       
       double valordolar = 18.37;
       double iva = 0.16;
       double dolares = 200;
       double converción = valordolar * dolares;
       double Impuestos = iva * converción;
       System.out.println(" dolar equivale a: $ " + valordolar + " Pesos ");
       System.out.println(" se agregaron " + dolares + " Equivalen a " + converción + " Pesos ");
       if(converción>2000){
       System.out.println(" Aplicando los taxes con total de " + (Impuestos + converción));
       }
       
    }
}
    

