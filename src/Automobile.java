public class Automobile {
  public int year;
  public String make;
  public String model;
  public String color;
  public String name;
  public int gears;
  public int operatingCycle = 0;
  public int currentGear = 0;
  public int currentSpeed = 0;
  public int distanceTraveled = 0;

  
  public Automobile (int year, String make, String model, String color, String name, int gears){
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    this.name = name;
    this.gears = gears;
  }
  public void increaseCycle(){
    operatingCycle++;
    if( currentGear + 1 <= gears ) {
      currentGear++;
      currentSpeed = currentGear * 10;
    }
    distanceTraveled = distanceTraveled + (currentSpeed/60);
  }
  public void decreaseCycle(){
    operatingCycle--;
    if( currentGear - 1 > 0 ) {
      currentGear--;
      currentSpeed = currentGear * 10;
    }
    distanceTraveled = distanceTraveled + (currentSpeed/60);
  }
  public String toString(){
	  String details = "year: " + this.year + ";" 
			  + "Make: " + this.make + ";" 
			  + "Model: " + this.model + ";"
			  + "Color: " + this.color + ";"
			  + "Name: " + this.name + ";"
			  + "Gears: " + this.gears + ";";
	  return details;
  }
}