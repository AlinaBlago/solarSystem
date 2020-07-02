public class PlanetReporter {

    public String getPlanetInfo(PlanetServiceImpl planet){
        return "Name = " + planet.getClass().getName() + "\nG = " + planet.G + "\nWeight = " + planet.weightOfPlanet + "\nRadius = " + planet.radiusOfPlanet + "\nAcceleration = " + planet.GetAccelerationOfGravity();
    }
}
