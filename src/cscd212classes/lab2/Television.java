package cscd212classes.lab2;

import java.util.Objects;
import java.lang.Object;

public class Television extends Object implements Comparable<Television>
{

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
                      final int resolution)
    {
        if (model == null || model.isEmpty() || (screenSize < 32) || (resolution < 720))
        {
           throw  new IllegalArgumentException("Parameters not acceptable");
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
        if (model == null || model.isEmpty() || (screenSize < 32) || (resolution < 720))
        {
          throw new IllegalArgumentException("Parameters not acceptable");
        }

        this.model = model;
        this.smart = smart;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.make = make;
        this.fourk = this.resolution >= 2160;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Television that = (Television) o;
        return this.fourk == that.fourk && this.resolution == that.resolution && this.screenSize == that.screenSize && this.smart
                == that.smart && Objects.equals(this.make, that.make) && Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.fourk, this.make, this.model, this.resolution, this.screenSize, this.smart);
    }

    @Override
    public String toString()
    {
        return "Television{" +
                "fourk=" + this.fourk +
                ", make='" + this.make + '\'' +
                ", model='" + this.model + '\'' +
                ", resolution=" + this.resolution +
                ", screenSize=" + this.screenSize +
                ", smart=" + this.smart +
                '}';
    }

    public String getMake()
    {
        return this.make;
    }

    public String getModel()
    {
        return this.model;
    }

    public int getResolution()
    {
        return this.resolution;
    }

    public int getScreenSize()
    {
        return this.screenSize;
    }

    @Override
    public int compareTo(final Television another)
    {
        if (another == null)
        {
            throw new IllegalArgumentException("The argument provided is null./n");
        }
        int sameMake = this.getMake().compareTo(another.getMake());
        int sameModel = this.getModel().compareTo(another.getModel());
        int sameSize = this.getScreenSize() - another.getScreenSize();

        if(sameMake != 0)
        {
            return sameMake;
        }
        else if (sameModel != 0) {
            return sameModel;
        }
        else
        {
            return 0;
        }
    }
}
