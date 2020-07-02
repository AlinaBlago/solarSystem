public abstract class PlanetServiceImpl implements PlanetService {
    public double weightOfPlanet;
    public double radiusOfPlanet;
    public final double G = 6.67;

    @Override
    public double GetAccelerationOfGravity() {
        return Math.ceil(G * (weightOfPlanet/ (radiusOfPlanet * radiusOfPlanet)));
    }
}
