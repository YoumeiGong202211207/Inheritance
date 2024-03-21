public class MusicConcertEvent extends Event {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                             double eventCost, int totalParticipants, int totalEventDays,
                             boolean merchandiseRequired, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    @Override
    public double calculateEventCost() {
        double eventCost = super.calculateEventCost();

        if (merchandiseRequired) {
            eventCost += merchandiseCost;
        }

        return eventCost;
    }

    @Override
    public String toString() {
        String eventDetails = super.toString();

        eventDetails += "Merchandise Required: " + merchandiseRequired + "\n";
        eventDetails += "Merchandise Cost: " + merchandiseCost + "\n";

        return eventDetails;
    }
}
