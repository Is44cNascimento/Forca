package Forca;


import java.util.Arrays;
import java.util.Random;

public class ListaPaises {
    Random Aleatorio = new Random(19);

    public String Paises(){

        int Escolha = Aleatorio.nextInt(19);

        String[] Paises = new String[20];


        Paises[0] = "Brasil.";
        Paises[1] = "Argentina.";
        Paises[2] = "França.";
        Paises[3] = "Espanha.";
        Paises[4] = "Itália.";
        Paises[5] = "Alemanha.";
        Paises[6] = "Japão.";
        Paises[7] = "Estados Unidos.";
        Paises[8] = "Canadá.";
        Paises[9] = "México.";
        Paises[10] = "China.";
        Paises[11] = "Índia.";
        Paises[12] = "Reino Unido.";
        Paises[13] = "Rússia.";
        Paises[14] = "Austrália.";
        Paises[15] = "Egito.";
        Paises[16] = "África do Sul.";
        Paises[17] = "Coreia do Sul.";
        Paises[18] = "Arábia Saudita.";
        Paises[19] = "Suécia.";

        System.out.println(Arrays.deepToString(Paises));
        return "";
    }

}
