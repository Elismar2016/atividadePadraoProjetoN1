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
    
  List<voo> listaVoador;
  private List<nado>listaNado;
  private List<grasna>listaGrasna;
  
  public ArmazenaAnimal(){
		listaVoador = new ArrayList<voo>();
                listaNado = new ArrayList<nado>();
                listaGrasna = new ArrayList<grasna>();
	}
    public void armazenar(int id, String especie, String nome) {
       
	    switch (especie){
			
	    	case "pato":            			
	      		Pato patoLocal = new Pato();
	    		patoLocal.setId(id);
                        patoLocal.setNome(nome);
                        if(patoLocal instanceof voo){
                           getListaVoador().add(patoLocal); 
                        }
                       if(patoLocal instanceof nado){
                        getListaNado().add(patoLocal);
                       }
                       if(patoLocal instanceof grasna){
                         getListaGrasna().add(patoLocal);
                       }
				break;
	    	case "ganso":
	    		Ganso gansoLocal = new Ganso();
	    		gansoLocal.setId(id);
                        gansoLocal.setNome(nome);
                        if(gansoLocal instanceof voo){
                           getListaVoador().add(gansoLocal); 
                        }
                       if(gansoLocal instanceof nado){
                        getListaNado().add(gansoLocal);
                       }
                       if(gansoLocal instanceof grasna){
                         getListaGrasna().add(gansoLocal);
                       }
                        
                        break;            	
	    } 
		
	}
	
	

	public List<voo> getListaVoador() {
		return listaVoador;
	}

    /**
     * @param listaVoador the listaVoador to set
     */
    public void setListaVoador(List<voo> listaVoador) {
        this.listaVoador = listaVoador;
    }

    /**
     * @return the listaNado
     */
    public List<nado> getListaNado() {
        return listaNado;
    }

    /**
     * @param listaNado the listaNado to set
     */
    public void setListaNado(List<nado> listaNado) {
        this.listaNado = listaNado;
    }

    /**
     * @return the listaGrasna
     */
    public List<grasna> getListaGrasna() {
        return listaGrasna;
    }

    /**
     * @param listaGrasna the listaGrasna to set
     */
    public void setListaGrasna(List<grasna> listaGrasna) {
        this.listaGrasna = listaGrasna;
    }

	
	
	
	
}
