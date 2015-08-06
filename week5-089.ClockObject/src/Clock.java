public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        // Clock advances by one second
    }
    
    public String toString() {
        // returns the string representation
        return "";
    }
}
