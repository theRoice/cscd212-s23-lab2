package cscd212comparators.lab2;
import java.util.Comparator;
import cscd212classes.lab2.Television;

public class TelevisionResolutionMakeDescendingComparator extends Object implements Comparator<Television>{
    public int compare(Television t1, Television t2){
        if(t1 == null){
           new IllegalArgumentException("null parameter in TelevisionResolutionMakeDescendingComparator");
        }
        if(t2 == null){
            new IllegalArgumentException("null parameter in TelevisionResolutionMakeDescendingComparator");
        }
        int difference = t2.getResolution() - t1.getResolution();
        int sameMake = t2.getMake().compareTo(t2.getMake());
        if(difference != 0){
            return difference;
       }else if(sameMake!= 0){
           return sameMake;
        }else{
           return 0;
       }

    }
}


