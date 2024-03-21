public class ConferenceEvent extends Event {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,double eventCost, int totalParticipants, int totalEventDays,boolean breakfastRequired, double breakfastCost,boolean lunchRequired, double lunchCost,boolean dinnerRequired, double dinnerCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    @Override
    public double calculateEventCost() {
        double eventCost = super.calculateEventCost();

        if (breakfastRequired) {
            eventCost += breakfastCost;
        }

        if (lunchRequired) {
            eventCost += lunchCost;
        }

        if (dinnerRequired) {
            eventCost += dinnerCost;
        }

        return eventCost;
    }

    @Override
    public String toString() {
        String eventDetails = super.toString();

        eventDetails += "Breakfast Required: " + breakfastRequired + "\n";
        eventDetails += "Breakfast Cost: " + breakfastCost + "\n";
        eventDetails += "Lunch Required: " + lunchRequired + "\n";
        eventDetails += "Lunch Cost: " + lunchCost + "\n";
        eventDetails += "Dinner Required: " + dinnerRequired + "\n";
        eventDetails += "Dinner Cost: " + dinnerCost + "\n";

        return eventDetails;
    }
}
