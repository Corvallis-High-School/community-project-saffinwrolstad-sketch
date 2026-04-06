public class Athletics         // Add your class name here!
{
    // 1. write 3 instance variables for class: private type variableName;
    private String sport;
    private String location;
    private String time;

    // 2. Add a constructor with 3 parameters to set all of the instance variables to the given parameters.
    public Athletics(String jsport, String jlocation, String jtime)
    {
        sport = jsport;
        location = jlocation;
        time = jtime;
    }

    public Athletics()
    {
        sport = "Sport";
        location = "Location";
        time = "Time";
    }
    
    // 3. Write a print() method that uses System.out.println to print out all the instance variables.
    public void print()
    {
        System.out.println("Sport: " + sport + ", Location: " + location + ", Time: " + time);
    }

    // 4. Create accessor (get) methods for each of the instance variables.
    public String getSport()
    {
        return sport;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public String getTime()
    {
        return time;
    }

    // 5. Create mutator (set) methods for each of the instance variables.
    public void setSport(String newSport)
    {
        sport = newSport;
    }
    
    public void setLocation(String newLocation)
    {
        location = newLocation;
    }
    
    public void setTime(String newTime)
    {
        time = newTime;
    }



    // 6. Create a toString() method that returns all the information in the instance variables.
    public String toString()
    {
        return "Sport: " + sport + ", Location: " + location + ", Time: " + time;
    }
    
    // 7. Write an additional method for your class that takes a parameter.
    // For example, there could be a print method with arguments that indicate how you want to print out
    // the information, e.g. print(format) could print the data according to an argument that is "plain"
    // or "table" where the data is printed in a table drawn with dashes and lines (|).
    public void print(int format)
    {
        if (format <= 0)
        {
            System.out.println("Sport: " + sport + ", Location: " + location + ", Time: " + time);
        }
        else if (format == 1)
        {
            System.out.println("|" + sport + "|" + location + "|" + time + "|");
        }
        else 
        {
            System.out.println(sport);
            System.out.println(location);
            System.out.println(time);
        }
    }

}

// everything above is previous units everything below is unit 5

class TrackAndField extends Athletics 
{
    private int events;

    public TrackAndField()
    {
        super();
        events = 0;
    }
    
    public TrackAndField(String sport, String loc, String time, int jevents)
    {
        super(sport, loc, time);
        events = jevents;
    }

    public int getEvents()
    {
        return events;
    }

    public void setEvents(int newEvents)
    {
        events = newEvents;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Number of Events: " + events;
    }
    
    @Override
    public void print()
    {
        System.out.println(toString());
    }
}
class CrossCountry extends Athletics 
{
    private int races;

    public CrossCountry()
    {
        super();
        races = 0;
    }

    public CrossCountry(String sport, String loc, String time, int jraces)
    {
        super(sport, loc, time);
        races = jraces;
    }

    public int getRaces()
    {
        return races;
    }

    public void setRaces(int newRaces)
    {
        races = newRaces;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Number of Races: " + races;
    }
    
    @Override
    public void print()
    {
        System.out.println(toString());
    }
}
class Football extends Athletics
{
    private String teams;

    public Football()
    {
        super();
        teams = "";
    }

    public Football(String sport, String loc, String time, String jteams)
    {
        super(sport, loc, time);
        teams = jteams;
    }

    public String getTeams()
    {
        return teams;
    }

    public void setTeams(String newTeams)
    {
        teams = newTeams;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Teams: " + teams;
    }
    
    @Override
    public void print()
    {
        System.out.println(toString());
    }
}
class Baseball extends Athletics
{
    private String teams;

    public Baseball()
    {
        super();
        teams = "";
    }

    public Baseball(String sport, String loc, String time, String jteams)
    {
        super(sport, loc, time);
        teams = jteams;
    }

    public String getTeams()
    {
        return teams;
    }

    public void setTeams(String newTeams)
    {
        teams = newTeams;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Teams: " + teams;
    }
    
    @Override
    public void print()
    {
        System.out.println(toString());
    }
}