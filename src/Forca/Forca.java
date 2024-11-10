package Forca;

//ISAAC NASCIMENTO DE JESUS


import java.util.*;

import static java.util.Arrays.deepToString;

public class Forca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaAnimais ListaAnimais = new ListaAnimais();
        ListaPaises[] ListaPaises = new ListaPaises[20];




        System.out.println("Bem vindo ao jogo da forca");

        System.out.println("Regras ....");

        System.out.println("Escolha o modo de jogo: \n Animais  \n Paises");

        String Modo = sc.nextLine();


        System.out.println(ListaAnimais.getAnimais());








    }

}