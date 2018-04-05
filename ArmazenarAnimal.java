/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class ArmazenaAnimal {

    List<voo> listaVoador = new ArrayList<voo>();
    List<nado> listaNadador = new ArrayList<nado>();
    List<grasna> listaGrasnador = new ArrayList<grasna>();

    public ArmazenaAnimal() {
    }

    public void armazenar(int id, String especie, String nome) {

        switch (especie) {

            case "pato":
                Pato patoLocal = new Pato();
                patoLocal.setId(id);
                patoLocal.setNome(nome);
                if (patoLocal instanceof voo) {
                    listaVoador.add(patoLocal);
                }
                if (patoLocal instanceof nado) {
                    listaNadador.add(patoLocal);
                }
                if (patoLocal instanceof grasna) {
                    listaGrasnador.add(patoLocal);
                }
                break;
            case "ganso":
                Ganso gansoLocal = new Ganso();
                gansoLocal.setId(id);
                gansoLocal.setNome(nome);
                if (gansoLocal instanceof voo) {
                    listaVoador.add(gansoLocal);
                }
                if (gansoLocal instanceof nado) {
                    listaNadador.add((nado) gansoLocal);
                }
                if (gansoLocal instanceof grasna) {
                    listaGrasnador.add(gansoLocal);
                }

                break;
        }

    }

}
