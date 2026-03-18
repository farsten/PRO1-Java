package OpgaverL03;

//Nedenstående algoritme beskriver årstiden på en given dato (ikke Danmark):
//Hvis måned er 12, 1 eller 2 er årstid = ”Vinter”
//ellers hvis måned er 3, 4 eller 5 er årstid = ”Forår”
//ellers hvis måned er 6, 7 eller 8 er årstid = ”Sommer”
//ellers årstid = ”Efterår”
//Hvis måned er 2, 5, 8 eller 11 og dagen >= 21:
//Hvis årstid er ”Vinter”, så ændres årstid til ”Forår”
//ellers hvis årstid er ”Forår”, så ændres årstid til ”Sommer”
//ellers hvis årstid er ”Sommer”, så ændres årstid til ”Efterår”
//ellers ændres årstid til ”Vinter”
//Skriv et program, der indlæser to heltal (måned og dag) og udskriver en String, der
//beskriver årstiden.
//String værdier sammenlignes med equals(), f.eks. season.equals(”Vinter”)
public class Opgave5Seasons {
    void main() {
        String monthPrompt = IO.readln("Hvilken måned er det? ");
        int month = Integer.parseInt(monthPrompt);

        String dayPrompt = IO.readln("Hvilken dag er det? ");
        int day = Integer.parseInt(dayPrompt);

        String season;

        if (month == 1 || month == 2 || month == 12) {
            season = "Vinter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Forår";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Sommer";
        } else {
            season = "Efterår";
        }

        if (day >= 21 && (month == 2 || month == 5 || month == 8 || month == 11)) {
            if (season.equals("Vinter")) season = "Forår";
            else if (season.equals("Forår")) season = "Sommer";
            else if (season.equals("Sommer")) season = "Efterår";
            else season = "Vinter";
        }

        IO.println("Sæsonen er nu: " + season);

    }

}

