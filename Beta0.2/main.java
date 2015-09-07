/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carn3: 14012
Pedro Joaquin. Carnet:14
10/09/2015
Hoja de Trabajo 7
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main{
	public static void main(String[] args) {

		try{
			BufferedReader file = new BufferedReader(new FileReader("diccionario.txt"));
			String line;
			while((line = file.readLine()) != null ){
				String english=" ",  spanish=" ";
				boolean readenglish = false;
				boolean readspanish = false;
				System.out.println(line);
				int count = 0;
				while(count<line.length()){
					if(line.charAt(count)=='('){
						while(true){
							count++;
							if(line.charAt(count)==',')
								break;
							english+=line.charAt(count);
						}
					}
					if(line.charAt(count)==' ')
						while(true){
							count++;
							if(line.charAt(count)==')')
								break;
							spanish+=line.charAt(count);
						}
					count++;
				}
				/*
				Aqui se obtiene la palabra en ingles con su respectiva traduccion al español
				para posteriormente ser guardadas en una asociacion
				*/
				Association association = new Association(english, spanish);
				/*
				Luego de ser instanciadas como asocioacion se envian al binary tree para ser un nodo
				*/
				System.out.println("english:"+english);
				System.out.println("spanish:"+spanish);
			}
			file.close();
		}
		catch(FileNotFoundException file){
			System.out.println("Error 1: Archivo diccionario.txt no encontrado.");
		}
		catch(IOException io){
			System.out.println("Erro 2: Error en lectura del fichero.");
		}

		/*
		Binary Tree
		*/


		/*
		Lectura y traduccion de fichero text.txt
		*/
		String traduccion="";
		try{
			BufferedReader file = new BufferedReader(new FileReader("texto.txt"));
			String line;
			System.out.print("Texto original: ");
			while((line = file.readLine()) != null ){
				System.out.println(line);
				int count=0;
				String word="";
				while(count<line.length()){
					if(line.charAt(count)!=' ' & line.charAt(count)!='.')
						word+=line.charAt(count);
					else{
						/*
						 Proceso de busqueda de asociacion en el arbol binario
						 Retorna la traduccion, si existe, sino toma la word y la encierra
						 en asteriscos antes de agregarla al String traduccion (codigo debajo)
						*/
						//if(palabra_no_tiene_asociacion)
							word = '*'+word+"*";
						//Despues..
						word+=line.charAt(count);
						traduccion+=word;
						word="";
					}
					count++;
				}
			}
			file.close();
			System.out.println("Traduccion: "+traduccion);
		}
		catch(FileNotFoundException file){
			System.out.println("Error 1: Archivo diccionario.txt no encontrado.");
		}
		catch(IOException io){
			System.out.println("Erro 2: Error en lectura del fichero.");
		}

	}
}
/*
Referencias:
	Libro de Texto
	Multiple Catch: https://docs.oracle.com/javase/7/docs/technotes/guides/language/catch-multiple.html
	Read txt File; http://stackoverflow.com/questions/4716503/best-way-to-read-a-text-file-in-java
	String Oracle; http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
*/
