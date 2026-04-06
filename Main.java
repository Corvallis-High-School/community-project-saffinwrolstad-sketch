class Main {

  public static void main(String[] args) {

        Athletics game1 = new Athletics("Football", "CHS", "7:00pm");
        Athletics game2 = new TrackAndField("Track & Field", "Central High", "10:00am", 9);
        Athletics game3 = new Football("Football", "CHS", "5:00pm", "Spartans || Raiders");
        game1.print();
        game2.print();
        game3.print();
      

  }
}