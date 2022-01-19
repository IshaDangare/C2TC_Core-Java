package arrayprogram;
public class CFG
{
public static void main (String[] args)
{
// declares an Array of integers.
Studentprogramarray[] arr;
// allocating memory for 5 objects of type Student.
arr = new Studentprogramarray[5];
// initialize the first elements of the array
arr[0] = new Studentprogramarray(1,"aman");
// initialize the second elements of the array
arr[1] = new Studentprogramarray(2,"vaibhav");
// so on...
arr[2] = new Studentprogramarray(3,"shikar");
arr[3] = new Studentprogramarray(4,"dharmesh");
arr[4] = new Studentprogramarray(5,"mohit");
// accessing the elements of the specified array
for (int i = 0; i < arr.length; i++)
System.out.println("Element at " + i + " : " +
arr[i].roll_no +" "+ arr[i].name);
}
}

