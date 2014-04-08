import java.util.ArrayList;



public class MergeSort{

public static void main(String[] args) {
ArrayList<Integer> a = new ArrayList<Integer>();
ArrayList<Integer> b = new ArrayList<Integer>();
  a.add(7);
  a.add(4);
  a.add(3);
  a.add(1);

  //System.out.println(split(a));
  System.out.println(mergeSort(a));
}
public static ArrayList<Integer> split(ArrayList<Integer> a) {
	ArrayList<Integer> b = new ArrayList<Integer>();
	ArrayList<Integer> c = new ArrayList<Integer>();
	int middle = a.size()/2;
	for (int i=middle; i<a.size(); i++) {
		b.add(a.get(i));
	}
	for (int i=a.size()-1; i>=middle; i--) {
		a.remove(i);
	}
	
	System.out.println(a);

return b;
}

public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	ArrayList<Integer> result = new ArrayList<Integer>();
	int aSpot = 0;
	int bSpot = 0;

	while(result.size() <= a.size() + b.size() - 1) {
		if(bSpot == b.size()) {
			result.add(a.get(aSpot));
			aSpot++;
		} else if(aSpot == a.size()) {
			result.add(b.get(bSpot));
			bSpot++;	
		} else if(b.get(bSpot) >= a.get(aSpot)) {
			result.add(a.get(aSpot));
			aSpot++;
		} else  {
			result.add(b.get(bSpot));
			bSpot++;
		}
	}
	return result;
}
public static ArrayList<Integer> mergeSort(ArrayList<Integer> a) {
	ArrayList<Integer> b = new ArrayList<Integer>();

	if(b.size()==2) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		c = split(b);
		return merge(b,c);
	}
	b =split(a);
	if(a.size() == 1) {
		return merge(a,b);
	}

	return merge(mergeSort(a), mergeSort(b));
	
	}
	

}