# AL_FROGS
Team Frogs (Ruby Friedman, Samantha Hua, Ivina Wang)


#### ALTester
ALTester determines if an ArrayList is sorted or not. It uses a compareTo method to determine whether an interger a is greater, less than or equal to an integer b.
sortedOrNot uses the compareTo method as a helper method to iterate through each item in the array to check that the next value is greater than the previous.


#### OrderedArrayList

* default constructor: initializes _data by setting it equal to a new instance of ArrayList<Integer>
  
* toString(): uses the ArrayList method to return the String value of _data
  
* remove(int i): uses the ArrayList method to remove a value at the given index i
  
* size(): uses the ArrayList method to return the size of _data
  
* get(int i): uses the ArrayList method to return the value at the given index i
  
* addLinear(Integer newVal): iterates through the array from left to right, and compared that value to the input to add the given value newVal so that the array is still in ascending order. It does this by using the compareTo method and if newVal is less than the value at the current index in the array, then it adds the value there.  The method is stopped because true is return. However, if the code runs through the for loop, newVal is added to the end of the array because this means that newVal is greater than the other values in the array, and true is returned.
  
* addBinary(Integer newVal): If the _data.size() is equal to 0, then we add newVal because there are no other values to compare it to, and true is returned. If _data.size() is equal to 1, then newVal is compared to the singular value in the array. Depending on their relation to one another, newVal is added to the beginning or end of the array, and true is returned. Else, variables are created to store the min, max, and mid of the indexes of the array. While min is less than or equal to max, mid takes the value of (min + max)/2. If newVal is greater than the value at index mid, then min takes the value of mid + 1. If newval is less than the value at the index mid, then max takes the value of min - 1. If newVal is equal to mid, then newVal is added at the index mid, and true is returned to end the loop. Once the while loop is finished running, if true has not been returned, then newVal is added at index min, and true is returned.
  
* main: creates an OrderedArrayList Franz, and tests the methods addLinear and addBineary.
