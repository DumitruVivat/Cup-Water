package kitchen;

public class Application {

	public static void main(String[] args) {
		Cup cupA = new Cup("Milk", 300);
		Cup cupB = new Cup("Water", 500);
		
		SmallCup cupC = new SmallCup("Tea", 200);
		BigCup cupD = new BigCup("Water", 200);
		
		//arithmetical operation
		cupA.setLiquidVolume(cupA.getLiquidVolume() - 50);
		cupB.setLiquidVolume(cupB.getLiquidVolume() + 50);
		cupB.setLiquidVolume(cupB.getLiquidVolume() - 550);
		cupD.setLiquidVolume(cupD.getLiquidVolume() + 550);
		
		//print result
		System.out.println(cupA.getLiquidName() + " " + cupA.getLiquidVolume() + " mll");
		System.out.println(cupB.getLiquidName() + " " + cupB.getLiquidVolume() + " mll");
		System.out.println(cupC.getLiquidName() + " " + cupC.getLiquidVolume() + " mll");
		System.out.println(cupD.getLiquidName() + " " + cupD.getLiquidVolume() + " mll");
		
		
		
	}

}