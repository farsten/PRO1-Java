package OpgaverL04Metoder;

public class Opgave4BoyGirlMetode {
    void main() {

        String alderPrompt = IO.readln("Alder: ");
        int alder = Integer.parseInt(alderPrompt);

        String genderPrompt = IO.readln("Er du en \"dreng\" eller en \"pige\"? ");
        boolean IsGirl = genderPrompt.equalsIgnoreCase("pige");

        IO.println("Dit gymnastik hold: " + team(IsGirl, alder));

        IO.println("Din institution: " + institution(alder));

    }

    public String institution(int alder) {
        String place;
        if (alder < 1) {
            place = "Home";
        } else if (alder < 2) {
            place = "Nursery";
        } else if (alder < 5) {
            place = "Kindergarten";
        } else if (alder < 16) {
            place = "School";
        } else place = "Out of school";

        return place;
    }

    public String team(boolean IsGirl, int alder) {
        String team;
        if (IsGirl) {
            if (alder >= 8) team = "Springy girls";
             else team = "Tumbling girls";
        } else if (alder >= 8) team = "Cool boys";
            else team = "Young Cubs";

        return team;
    }
}




