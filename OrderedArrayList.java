// Team Frogs (Ruby Friedman, Ivina Wang, Samantha Hua)
// APCS pd07
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList {

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList() {
    _data = new ArrayList<Integer>();
  }

  public String toString() {
    String foo = "[";
    for( int i = 0; i < _data.size(); i++ ) {
      foo += _data.get(i) + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }

  public Integer remove( int i ) {
    return _data.remove(i);
  }

  public int size() {
    return _data.size();
  }

  public Integer get( int i ) {
    return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public boolean addLinear(Integer newVal) {
    for (int i = 0; i < _data.size(); i++) {
      if (newVal.compareTo(_data.get(i)) < 0) {
        _data.add(i, newVal);
        return true;
      }
    }
    _data.add(newVal);
    return true;
  }
  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public boolean addBinary(Integer newVal) {
    if (_data.size() == 0) {
       _data.add(newVal);
       return true;
     }
     else if (_data.size() == 1) {
       if (_data.get(0) > newVal) {
         _data.add(0, newVal);
       }
       else {
         _data.add(newVal);
       }
       return true;
    }
    else {
    int min = 0;
    int max = _data.size()-1;
    int mid = 0;
    while (min <= max){
      mid = (min + max)/2;
      if (newVal.compareTo(_data.get(mid)) > 0) {
        min = mid + 1;
      }
      else if (newVal.compareTo(_data.get(mid)) < 0) {
        max = mid - 1;
      }
      else {
        _data.add(mid, newVal);
        return true;
      }
    }
    _data.add(min, newVal);
    return true;

  }
 }

  // main method solely for testing purposes
  public static void main( String[] args ) {

    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ ) {
      Franz.addLinear( (int)( 50 * Math.random() ) );
    }
    System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

  }//end main()

}//end class OrderedArrayList
