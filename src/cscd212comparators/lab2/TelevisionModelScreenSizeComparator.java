package cscd212comparators.lab2;

import java.lang.Object;
import java.util.Comparator;
import cscd212classes.lab2.Television;


public class TelevisionModelScreenSizeComparator {
    public int compare(Television t1, Television t2) {
        int model = t1.getModel().compareTo(t2.getModel());
        int screenSize = t1.getScreenSize() - t2.getScreenSize();
        if (model != 0) {
            return model;
        } else if (screenSize != 0) {
            return screenSize;
        }
        else{
            return 0;
        }
    }
}
