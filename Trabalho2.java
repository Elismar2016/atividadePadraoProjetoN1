package trabalho2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sistemas
 */
public class Trabalho2 {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        BufferedReader buff = new BufferedReader(new FileReader("C:/animais.txt"));
        ArmazenaAnimal armazenaAnimal = new ArmazenaAnimal();
        int id = 0, cont = 0;
        String especie = "", nome;
        String linha = buff.readLine();
        while (linha != null) {

            switch (cont) {
                case 0:

                    id = Integer.parseInt(linha);
                    cont++;
                    break;

                case 1:
                    especie = linha;
                    cont++;
                    break;
                case 2:

                    nome = linha;
                    cont = 0;
                    //  seta o objeto abstrato imagem objeto com id, nome, animal

                    armazenaAnimal.armazenar(id, especie, nome);
                    break;
            }
            linha = buff.readLine();
        }
        
        List listaAnimaisVoo = new ArrayList();
        listaAnimaisVoo = armazenaAnimal.listaVoador;
        for (int i = 0; i < listaAnimaisVoo.size(); i++) {
            System.out.println(listaAnimaisVoo.get(i));
        }
        
        List listaAnimaisNado = new ArrayList();
        listaAnimaisNado = armazenaAnimal.listaNadador;
        for (int i = 0; i < listaAnimaisNado.size(); i++) {
            System.out.println(listaAnimaisNado.get(i));
        }
        
        List listaAnimaisGrasna = new ArrayList();
        listaAnimaisGrasna = armazenaAnimal.listaGrasnador;
        for (int i = 0; i < listaAnimaisGrasna.size(); i++) {
            System.out.println(listaAnimaisGrasna.get(i));
        }
    }
}
