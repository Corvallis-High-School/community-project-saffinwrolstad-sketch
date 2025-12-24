class Main {

  public static void main(String[] args) {
    // Construct 2 objects of your class using the constructor with different values
        Athletics game1 = new Athletics("Football", "CHS", "7:00pm");
        Athletics game2 = new Athletics("Track & Field", "Central High", "10:00am");
       


        // call all of the objects methods to test them
        game1.getSport();
        game1.getLocation();
        game1.getTime();
        game1.print();
        game1.setSport("Soccer");
        game1.setLocation("Crystal Lake");
        game1.setTime("5:00pm");
        game1.toString();
        game1.print(1);
        game2.getSport();
        game2.getLocation();
        game2.getTime();
        game2.print();
        game2.setSport("XC");
        game2.setLocation("Crystal Lake");
        game2.setTime("2:00pm");
        game2.toString();
        game2.print(1);
        // Everything above from Unit 3
  }
}