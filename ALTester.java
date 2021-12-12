import java.util.ArrayList;

public class ALTester {
  public static int compareTo(int a, int b) {
		if (a > b) {
			return -1;
		} else {
      return 1;
    }
	}

  public static boolean sortedOrNot(ArrayList<Integer> a) {
    for (int i=0; i<a.size()-1; i++) {
      if (compareTo(a.get(i),a.get(i+1)) == -1) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ALTester boop = new ALTester();
    ArrayList<Integer> hewwo = new ArrayList<Integer>();
    for (int i=0; i<23; i++) {
      hewwo.add((int) (10*Math.random()));
    }
    System.out.println(sortedOrNot(hewwo));

    ArrayList<Integer> increasing = new ArrayList<Integer>();
    for (int i=0; i<23; i++) {
      increasing.add(i);
    }
    System.out.println(sortedOrNot(increasing));
  }

}
