public class Banana implements Ripening{
	private int numOfSeeds;
	private String name,color;

	public Banana(String name,String color,int numOfSeeds ){
		this.name = name;
		this.color = color;
		this.numOfSeeds = numOfSeeds; 
	}

	public void pealUsage(){
		System.out.println("Peal of "+name+" banana is edible");
	}

	public void organicRipe(){
		System.out.println("Organic Ripening is possible in "+name);
	}


}