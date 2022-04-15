<!--
!1. Introduction
* Arrays are the simplest form of linear data structures, It is used to store multiple items of same data type together at one place and these items are stored at contiguous memory locations.

* Array elements are generally accessed using the indexes, Index begins with 0.

* In Java arrays are objects

!2. Advantages of Array
*1. Random Access -> Since elements are stored at contiguous memory locations we can get the ith element in O(1).

*2. Cache Friendliness ->  Usually processors while accessing the data they preFetch the data which are at near by locations. So in the arrays because of the contiguous memory locations next elements are preFetched. So if we are accessing the next element its already present in the cache making the arrays cache Friendly. This preFetching does not works with any other data structures.

* Cache is the memory which is the closest to CPU and is the fastest (Cache > RAM > SSD). So we want all our running programs to be in cache.

!3. Types of Arrays
*1. Fixed sized -> It can not be resized after defining the capacity.
*2. Dynamic sized -> It can automatically resize itself when you add more elements beyond it's current capacity.

? How to declare Fixed sized array?
!Syntax
dataType[] arrayName;
int[] arr = new int[5];

where:
dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
arrayName - it is an identifier

In java arrays are always allocated in Heap.

? How to declare Dynamic sized array?
* In Java Dynamic sized array are called arrayList.
!Syntax
import java.util.ArrayList;

ArrayList<dataType> arrayName = new ArrayList<dataType>();

where:
dataType - it should be non primitive data types like int, char, double, byte.
arrayName - it is an identifier


arrayName.push(10);
arrayName.push(11);
arrayName.pop(10);
.
.
.


* Usually we should always use Dynamic sized array.
? Advantages of arrayList over arrays
*1. Dynamic sized -> Wastage of allocated memory may take place in normal arrays
*2. Rich library functions -> There are many more built in functions available for arrayList than arrays.

!4. Operations on Arrays
? Searching
* If the array is not sorted then we can use linear search O(n)
* If the array is sorted then we can use binary search O(log(n))

? Insertion
* Arrays has O(n)
* ArrayList has O(n) time complexity for arbitrary indices of add/remove, but O(1) for the operation at the end of the list

? Deletion
* O(n)

-->
