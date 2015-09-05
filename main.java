import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main{
	public static void main(String[] args) {
		Association ass = new Association("Hi", "Hola");

		try{
			BufferedReader file = new BufferedReader(new FileReader("diccionario.txt"));
			String line;
			while((line = file.readLine()) != null ){
				String english=" ",  spanish=" ";
				boolean readenglish, readspanish = false;
				System.out.println(line);
				for(int i=0; i<line.length(); i++){
					if(line.charAt(i)=='(')
						readenglish = true;
					if(line.charAt(i)==')')
						read = false;
					if(line.charAt(i)==',')
						read = false;
					if(read==true)
						english+= line.charAt(i);
				}
			}
			file.close();
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