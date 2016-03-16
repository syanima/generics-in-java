class PairOfPoly<T extends Ripening, A >{
	private T name;
	private A age;

	public PairOfPoly(T name,A age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return "Something" + age;
	}

	public void pealUsage(){
		System.out.println("Something Something");
	}

	public T something(){
		return name;
	}
}