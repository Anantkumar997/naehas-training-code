package TreeSet;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		
		ts.add(5);
		ts.add(0);
		ts.add(10);
		ts.add(15);
		ts.add(20);
		
		System.out.println(ts);

	}

}

class MyComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
//		return (int)o2 > (int)o1 ? +1:-1;  //[20,15,10,5,0]
//		return (int)o2-(int)o1;				//[20,15,10,5,0]
		
//		return -((Integer) o1).compareTo((Integer)o2);			//[20,15,10,5,0]
//		return ((Integer) o2).compareTo((Integer)o1);			//[20,15,10,5,0]
		
		return +1;					//[5,0,10,15,20]
		
//		return 0;				//[5] all other elements not inserted because they are consider as duplicates
	}
}
