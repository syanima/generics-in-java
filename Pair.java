class Pair<T>{
	private T name;

	public Pair(T name){
		this.name = name;
	}

	public String toString(){
		return (this.name+" ");
	}

	public static void main(String[] args) {
		Pair<String> name = new Pair<String>("Akku");
		System.out.println(name);
	}
}