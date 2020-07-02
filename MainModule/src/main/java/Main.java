import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PlanetServiceImpl> planets = new ArrayList<PlanetServiceImpl>();
        planets.add(new Earth());
        planets.add(new Jupiter());
        planets.add(new Mars());
        planets.add(new Mercury());
        planets.add(new Neptune());
        planets.add(new Saturn());
        planets.add(new Uranus());
        planets.add(new Venus());



        PlanetReporter reporter = new PlanetReporter();
        for(PlanetServiceImpl planet : planets){
            System.out.println(reporter.getPlanetInfo(planet) + "\n\n");
        }


    }
}
