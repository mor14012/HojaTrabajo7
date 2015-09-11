/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carn3: 14012
Pedro Castillo Carnet:14224
10/09/2015
Hoja de Trabajo 7
*/
/**
 * Clase Nodo: Esta clase permite crear un objeto que almacene un objeto de
 * tipo Association para almacenar las asociaciones de palabra ingles - espanol
 * además de guardar referencias a otros nodos (padre, izquierdo, derecho)
 * para poder realizar enlaces entre ellos.
 * 
 * @author PedroJoaquin
 * @author Diego Morales 
 *
 * @param <E> Generico de tipo Elemento que permite utilizar esta clase con 
 * diferentes tipos de Objetos 
 */
public class NodoArbol<E>{
	
	private Association<String,String> ass; 
	private NodoArbol<E> izquierdo;
	private NodoArbol<E> derecho; 
	
	/**
	 * @param espanol Palabra en espanol que se desea guardar en el nodo 
	 * @param ingles Palabra en ingles que se desea guardar en el nodo 
	 * @param padre	Nodo padre al cual se hace referencia 
	 * @param izquierdo	Nodo hijo izquierdo al que se hace referencia
	 * @param derecho	Nodo hijo derecho al que se hace referencia 
	 */
	public NodoArbol(String espanol,String ingles, NodoArbol<E> izquierdo, NodoArbol<E> derecho){
		ass = new Association<String,String>(ingles, espanol);
		this.izquierdo = izquierdo; 
		this.derecho = derecho; 
	}
	
	/**
	 * Retorna el objeto Association del nodo 
	 * @return Objeto Association 
	 */
	public Association<String,String> getAss(){
		return ass; 
	}
	
	/**
	 * Retorna el Nodo Hijo Izquierdo 
	 * @return Nodo Hijo Izquierdo 
	 */
	public NodoArbol<E> getIzquierdo(){
		return izquierdo; 
	}
	
	/**
	 * Retorna el Nodo Hijo derecho 
	 * @return Nodo Hijo Derecho 
	 */
	public NodoArbol<E> getDerecho(){
		return derecho; 
	}
	
	/**
	 * Permite asignar una nueva referencia del Nodo Hijo Izquierdo 
	 * @param nuevoIzquierdo Nodo que sera el nuevo hijo Izquierdo 
	 */
	public void setIzquierdo(NodoArbol<E> nuevoIzquierdo){
		izquierdo = nuevoIzquierdo;
	}
	
	/**
	 * Permite asignar una nueva referencia del Nodo Hijo Derecho 
	 * @param nuevoDerecho Nodo que sera el nuevo hijo derecho 
	 */
	public void setDerecho(NodoArbol<E> nuevoDerecho){
		derecho = nuevoDerecho; 
	}
	
	public String getEspanol(){
		return ass.getValue();
	}
	
	public String getIngles(){
		return ass.getKey();
	}
	
	public void setEspanol(String espanol){
		ass.setValue(espanol);
	}
	
	public void setIngles(String ingles){
		ass.setKey(ingles);
	}
}
