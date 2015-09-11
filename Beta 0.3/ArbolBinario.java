/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carn3: 14012
Pedro Joaquin. Carnet:14
10/09/2015
Hoja de Trabajo 7
*/

/**
 * Clase ArbolBinario: Esta clase tiene como objetivo crear un Arbol Binario
 * utilizando Nodos los cuales guardaran los datos y referencias a los nodos 
 * hijos
 * 
 * @author PedroJoaquin
 * @author Diego Morales
 *
 * @param <E>	
 */
/**
 * @author PedroJoaquin
 *
 * @param <E>
 */
/**
 * @author PedroJoaquin
 *
 * @param <E>
 */
/**
 * @author PedroJoaquin
 *
 * @param <E>
 */
public class ArbolBinario<E> {
	
	private NodoArbol<E> raiz; 
	
	/**
	 *Constructor del Arbol Binario: Se crea un nuevo objeto nodo
	 *y se asigna como la raiz del Arbol Binario  
	 */
	public ArbolBinario(){
		setRaiz(new NodoArbol<E>("","",null,null));
	}
	
	/**
	 * Permite obtener el Nodo Raiz del Arbol 
	 * @return Nodo Raiz del Arbol 
	 */
	public NodoArbol<E> getRaiz() {
		return raiz;
	}

	/**
	 * Permite asignar un nuevo Nodo a la raiz 
	 * @param raiz Nodo que sera raiz del arbol 
	 */
	public void setRaiz(NodoArbol<E> raiz) {
		this.raiz = raiz;
	}
	
	/**
	 * Permite agregar un elemento al arbol en el lugar correspondiente
	 * @param raiz Nodo en el cual se desea insertar el valor 
	 * @param ingles	Palabra en ingles 
	 * @param espanol	Palabra en espanol 
	 */
	public void addElement(NodoArbol<E> raiz,String ingles, String espanol){
		//Si aun no hay ninguna palabra en el arbol se agregan al principio 
		if(raiz.getIngles().equals("") && raiz.getEspanol().equals("")){
			raiz.setIngles(ingles);
			raiz.setEspanol(espanol);
		}
		//Si ya hay una palabra se verifica en que lado del arbol se debe asignar
		//LADO IZQUIERDO
		else if(raiz.getIngles().compareTo(ingles)>0){
			if(raiz.getIzquierdo()==null){
				raiz.setIzquierdo(new NodoArbol<E>(espanol,ingles,null,null));
				System.out.println("palabras Agregadas:" + raiz.getIzquierdo().getEspanol()  + "," + raiz.getDerecho().getIngles());
			}
			else{
				addElement(raiz.getIzquierdo(),ingles,espanol);
			}		
		}
		//LADO DERECHO 
		else{
			if(raiz.getDerecho()==null){
				raiz.setDerecho(new NodoArbol<E>(espanol,ingles,null,null));
				System.out.println("Palabras Agregadas:" + raiz.getDerecho().getEspanol() + "," +raiz.getDerecho().getIngles());
			}
			else{
				addElement(raiz.getDerecho(),ingles,espanol);			
			}
		}
	}
	
	/**
	 * Permite obtener la traduccion de una palabra en ingles 
	 * @param raiz Nodo en el cual se desea realizar la busqueda 
	 * @param palabraIngles	Palabra en ingles que se desea traducir 
	 * @return	Palabra traducida en espanol 
	 */
	public String getTraduccion(NodoArbol<E> raiz, String palabraIngles){
		if(raiz.getIngles().equalsIgnoreCase(palabraIngles)){
			return raiz.getEspanol();
		}
		else if(raiz.getIngles().compareTo(palabraIngles)>0){
			if(raiz.getIzquierdo().getIngles().equalsIgnoreCase(palabraIngles)){
				return raiz.getEspanol();
			}
			else
				getTraduccion(raiz.getIzquierdo(),palabraIngles);
		}
		else{
			if(raiz.getDerecho().getIngles().equalsIgnoreCase(palabraIngles)){
				return raiz.getEspanol();
			}
			else
				getTraduccion(raiz.getDerecho(),palabraIngles);
		}
		return "";
	}
}





