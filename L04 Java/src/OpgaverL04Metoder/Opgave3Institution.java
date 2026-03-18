package OpgaverL04Metoder;

public class Opgave3Institution {
    void main() {
        String alderPrompt = IO.readln("Age: ");
        int alder = Integer.parseInt(alderPrompt);

        IO.println("You probably go to: " + institution(alder));
    }

    public String institution(int alder) {
        String place;
        if (alder < 1) {
            place = "Home";
        } else if (alder < 2) {
            place = "Nursery";
        } else if (alder < 5) {
            place = "Kindergarden";
        } else if (alder < 16) {
            place = "School";
        } else place = "Out of school";

        return place;

    }


}

