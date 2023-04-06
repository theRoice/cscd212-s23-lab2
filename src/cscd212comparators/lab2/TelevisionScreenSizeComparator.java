package cscd212comparators.lab2;
import java.lang.Object;
import java.util.Comparator;
import cscd212classes.lab2.Television;

public class TelevisionScreenSizeComparator {
    public int compare(Television t1, Television t2){
        int sizeDifference = t1.getScreenSize() - t2.getScreenSize();
        return sizeDifference;
    }
}
