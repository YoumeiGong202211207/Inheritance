public class Main {
    public static void main(String[] args) {
        Event event = new Event("E123", "Annual Conference", "City Convention Center",
                "John Doe", 5000.0, 200, 3);

        System.out.println(event.toString());
        System.out.println("Total Event Cost: " + event.calculateEventCost());


        ConferenceEvent conferenceEvent = new ConferenceEvent("E123", "Annual Conference", "City Convention Center",
                "John Doe", 5000.0, 200, 3,
                true, 10.0,
                true, 20.0,
                false, 0.0);

        System.out.println(conferenceEvent.toString());
        System.out.println("Total Conference Event Cost: " + conferenceEvent.calculateEventCost());


        MusicConcertEvent concertEvent = new MusicConcertEvent("E456", "Rock Concert", "Stadium",
        "Jane Smith", 10000.0, 1000, 1,
        true, 500.0);

        System.out.println(concertEvent.toString());
        System.out.println("Total Concert Event Cost: " + concertEvent.calculateEventCost());
    }
}
