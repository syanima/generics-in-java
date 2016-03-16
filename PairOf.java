class PairOf<T,A>{
	private T name;
	private A age;

	public PairOf(T name,A age){
		this.name = name;
		this.age = age;
		// System.out.println(name,age);
	}

	public String toString(){
		return (this.name+" "+this.age+" ");
	}

	public static void main(String[] args) {
		PairOf<String,Integer> myPair = new PairOf<String,Integer>("Akku",22);
		System.out.println(myPair);
	}
}