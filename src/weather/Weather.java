package weather;

/*
    Weather hat nur die "Business Logic",
    d.h. nur die Fachlogik und keine Nutzerinteraktionen
 */
public class Weather {
                                    // die Temperatur wird übergeben
                                    // d.h. die kommt von "Außen"
    public String evaluateWeather(double temperature) {
        if(temperature>22) {
            return "schönes Wetter";
        } else {
            return "schlechtes Wetter";
        }
    }
}
