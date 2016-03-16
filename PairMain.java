public class PairMain {
	public static void main(String[] args) {
		Banana b = new Banana("Kannan","yellow",0);
		PairOfPoly<Banana,Integer> myPair = new PairOfPoly<Banana,Integer>(b,22);
		Banana banana = myPair.something();
		banana.organicRipe();
		banana.pealUsage();
		System.out.println(myPair.toString());
		myPair.pealUsage();
	}
}