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