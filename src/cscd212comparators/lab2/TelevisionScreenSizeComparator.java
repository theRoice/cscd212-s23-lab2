package cscd212comparators.lab2;
import java.lang.Object;
import java.util.Comparator;
import cscd212classes.lab2.Television;

public class TelevisionScreenSizeComparator extends Object implements Comparator<Television>{
    public int compare(Television t1, Television t2){
        if(t1 == null || t2 == null) {
            new IllegalArgumentException("null parameter in TelevisionScreenSizeComparator");
        }
        int sizeDifference = t1.getScreenSize() - t2.getScreenSize();
        return sizeDifference;
    }
}
