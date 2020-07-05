package kitchen;

class Cup {
	
 private String liquidName; //Name
 private int liquidVolume;  //volume/mll
Cup() {
}

Cup( String liquidName, int liquidVolume ){
	setLiquidName(liquidName);
	setLiquidVolume(liquidVolume);
 }

public String getLiquidName() {
	return liquidName;
}
public void setLiquidName(String liquidName) {
	// limits
	if(liquidName.trim().equals("Water") || liquidName.trim().equals("Milk") || liquidName.trim().equals("Tea"))
	this.liquidName = liquidName;
}

public int getLiquidVolume() {
	return liquidVolume;
}

public void setLiquidVolume(int liquidVolume) {
	//limits
	//if(liquidVolume >= 0 && liquidVolume <= 600) 
	this.liquidVolume = liquidVolume;
}
}
class SmallCup extends Cup {
   //override
SmallCup( String liquidName, int liquidVolume ){
	super(liquidName, liquidVolume);
	 }
public void setLiquidVolume(int liquidVolume) {
	if(liquidVolume >= 0 && liquidVolume <= 250)
    super.setLiquidVolume(liquidVolume);
    }

	}
class BigCup extends Cup {
	BigCup( String liquidName, int liquidVolume ){
	super(liquidName, liquidVolume);
	
	 }
public void setLiquidVolume(int liquidVolume) {
	if(liquidVolume >= 0 && liquidVolume <= 1000)
	super.setLiquidVolume(liquidVolume);
}
}