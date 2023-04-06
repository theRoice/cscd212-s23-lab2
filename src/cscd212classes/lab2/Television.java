package cscd212classes.lab2;

import java.util.Objects;
import java.lang.Object;

public class Television{

    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;
    private final boolean fourk;

    public Television(final String make,
                      final String model,
                      final boolean smart,
                      final int screenSize,
                      final int resolution){
        if(model == null || model.isEmpty() || (screenSize < 32) || (resolution < 720)){
            new IllegalArgumentException("Parameters not acceptable");
        }
        this.make = make;
        this.model = model;
        this.smart = smart;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.fourk = this.resolution >= 2160;
    }

    public Television(final String model,
                      final boolean smart,
                      final int screenSize,
                      final int resolution,
                      final String make)
    {
        if(model == null || model.isEmpty() || (screenSize < 32) || (resolution < 720)){
           new IllegalArgumentException("Parameters not acceptable");
        }

        this.model = model;
        this.smart = smart;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.make = make;
        this.fourk = this.resolution >= 2160;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return fourk == that.fourk && resolution == that.resolution && screenSize == that.screenSize && smart == that.smart && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fourk, make, model, resolution, screenSize, smart);
    }

    @Override
    public String toString() {
        return "Television{" +
                "fourk=" + fourk +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", resolution=" + resolution +
                ", screenSize=" + screenSize +
                ", smart=" + smart +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public int compareTo(Television another) {


        //TODO Write compareTo() method
    }
}
