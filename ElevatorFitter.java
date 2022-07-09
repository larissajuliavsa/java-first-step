public class ElevatorFitter {
  public static void main(String args[]) {
    int weightOfAPerson;
    int elevatorWeightLimit;
    int numberOfPeople;

    weightOfAPerson = 150;
    elevatorWeightLimit = 1400;
    numberOfPeople = elevatorWeightLimit / weightOfAPerson;

    System.out.println("You can fit");
    System.out.println(numberOfPeople);
    System.out.println("people on the elevator.");
  }
}
