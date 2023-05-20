package com.mycompany.atividade1;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);   
       
        int i;
        int maior = 0;
        int pergunta;
        for(i = 0; i <= 9;i++){
      
            System.out.printf("digite %d° valor: \n",i + 1);
            pergunta = teclado.nextInt();
            
            if(pergunta > maior){
                maior = pergunta;
            }
           
            
        }
        System.out.printf("O numero maior e:%d \n",maior);
    }
}
