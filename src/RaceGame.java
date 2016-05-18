import java.util.Scanner;

public class RaceGame {
  public static void main (String[] args) {
    int year;
    String make;
    String model;
    String color;
    String name;
    int gears;
    int corners;
    int laps;
    int straights;
    String trackName;
    Scanner in = new Scanner(System.in);

    System.out.println("Hello! lets make your car.");
    System.out.println("What year is your car?: ");
    year = in.nextInt();
    in.nextLine();
    System.out.println("What make is your car?: ");
    make = in.nextLine();
    System.out.println("What model is your car?: ");
    model = in.nextLine();
    System.out.println("What color is your car?: ");
    color = in.nextLine();
    System.out.println("What is the name of your car?: ");
    name = in.nextLine();
    System.out.println("How many gears does your car have?: ");
    gears = in.nextInt();
    in.nextLine();

    System.out.println("Great! Heres the info about your car: ");
    Automobile userCar = new Automobile(year, make, model, color, name, gears);

    System.out.println(userCar.toString());

    System.out.println("Now let's pick your track! How many corners should be on your track? (max 10): ");
    corners = in.nextInt();
    in.nextLine();
    straights = 10 - corners;
    System.out.println("How many laps will you go on your track?: ");
    laps = in.nextInt();
    in.nextLine();
    System.out.println("What will you name your track?: ");
    trackName = in.nextLine();

    int lapNumber = 0;
    Double yesOrNo;
    while(lapNumber < laps){
      System.out.println("Starting a new lap!");
      int lapPortionNumber = 0;
      int lapCorners = corners;
      int lapStraights = straights;
      while(lapPortionNumber < 10){
        if(lapCorners > 0 && lapStraights > 0){
          yesOrNo = Math.random();
          if(yesOrNo < 0.5){
            System.out.println("Hitting a Corner!");
            userCar.decreaseCycle();
            lapCorners = lapCorners - 1;
          } else {
            System.out.println("Hitting a Straight!");
            userCar.increaseCycle();
            lapStraights = lapStraights - 1;
          }

        } else if (lapCorners > 0) {
          System.out.println("Hitting a Corner!");
          userCar.decreaseCycle();
          lapCorners = lapCorners - 1;
        } else {
          System.out.println("Hitting a Straight!");
          userCar.increaseCycle();
          lapStraights = lapStraights - 1;
        }
        lapPortionNumber++;
      }
      lapNumber++;
    }
    System.out.println("Race Complete! Your car traveled: " + userCar.distanceTraveled);
  }
}