/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carn3: 14012
Pedro Joaquin. Carnet:14
10/09/2015
Hoja de Trabajo 7
*/

public class Association <K, V>{
	protected K Key;
	protected V Value;

	public Association(K key, V value){
		Key = key;
		Value = value;
	}
	public V getValue(){
		return Value;
	}
	public K getKey(){
		return Key;
	}
	public V setValue(V value){
		V oldValue = Value;
		Value = value;
		return oldValue;
	}
}