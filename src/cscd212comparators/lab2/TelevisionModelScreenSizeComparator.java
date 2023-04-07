package cscd212comparators.lab2;
import java.lang.Object;
import java.util.Comparator;
import cscd212classes.lab2.Television;

public class TelevisionModelScreenSizeComparator extends Object implements Comparator<Television>
{
    public int compare(final Television t1, final Television t2) {
        if (t1 == null || t2 == null)
        {
           throw new IllegalArgumentException("null parameter in TelevisionModelScreenSizeComparator");
        }
        int model = t1.getModel().compareTo(t2.getModel());
        int screenSize = t1.getScreenSize() - t2.getScreenSize();
        if (model != 0) {
            return model;
        } else if (screenSize != 0) {
            return screenSize;
        }
        else
        {
            return 0;
        }
    }
}
