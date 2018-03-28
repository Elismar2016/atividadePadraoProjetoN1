
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
			 
			private int id =0, cont=0; 
			 private String especie, nome;
			 private linha = buff.readLine();	  
			 ArmazenaAnimal armazenaAnimal ;
			 while (linha != null) {
			 
				switch (cont){
					case 0:
						 id=Integer.parseInt(linha);
						 cont++; 
						break;
					 
									 
						   
					case 1:
						   especie=linha;
						   cont++; 
						   break;
					case 2:
						
						 nome=linha;
						  cont=0;
						   /*seta o objeto abstrato imagem objeto com id, nome, animal*/ 
						  armazenaAnimal = new ArmazenaAnimal();
						  armazenaAnimal.armazenar(id, especie, nome);
						  break;
							 }
					}
				 }
				   
				 }
			 
			 
		 
		 
			
