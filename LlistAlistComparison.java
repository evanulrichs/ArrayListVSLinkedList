package data;

import java.util.ArrayList;
import java.util.LinkedList;

public class LlistAlistComparison {

	public static ArrayList<Integer> Alist = new ArrayList<>();
	public static LinkedList<Integer> Llist = new LinkedList<>();

	public static double time1, time2, Atime, Ltime;

	public static void AverageTimeArrayAdd(ArrayList<Integer> list, int location) {

		for (int i = 0; i < 1000; i++) { // Times the "add" function at specified location 1000 times and takes the average.
			time1 = System.nanoTime();
			list.add(location, 1);
			time2 = System.nanoTime();
			Atime = time2 - time1;
			Average.average(Atime);
			list.remove(999999); // Keeps the list at 1000000 length.
		}
		Atime = Average.average; 
		Average.average_clr();

	}

	public static void AverageTimeLinkedAdd(LinkedList<Integer> list, int location) {

		for (int i = 0; i < 1000; i++) { // Same as before but with linked list.
			time1 = System.nanoTime();
			list.add(location, 1);
			time2 = System.nanoTime();
			Ltime = time2 - time1;
			Average.average(Ltime);
			list.remove(999999);
		}
		Ltime = Average.average;
		Average.average_clr();

	}

	public static void AverageTimeArrayRemove(ArrayList<Integer> list, int location) {

		for (int i = 0; i < 1000; i++) { // Times the "remove" function at specified location 1000 times and takes the average.
			time1 = System.nanoTime();
			list.remove(location);
			time2 = System.nanoTime();
			Atime = time2 - time1;
			Average.average(Atime);
			list.add(1); // Keeps the list at 1000000 length.
		}
		Atime = Average.average;
		Average.average_clr();

	}

	public static void AverageTimeLinkedRemove(LinkedList<Integer> list, int location) {

		for (int i = 0; i < 1000; i++) { // Same as before but with linked list.
			time1 = System.nanoTime();
			list.remove(location);
			time2 = System.nanoTime();
			Ltime = time2 - time1;
			Average.average(Ltime);
			list.add(1);
		}
		Ltime = Average.average;
		Average.average_clr();

	}

	public static void main(String[] args) {

		for (int j = 0; j < 1000000; j++) { // Creates a large array list and a large linked list.
			Alist.add(j);
			Llist.add(j);
		}

//------tests the "add" function----------------------------------------------------------------------------------------------------------
		System.out.println("-----------Add Function----------");

		// Beginning of array
		AverageTimeArrayAdd(Alist, 0);
		System.out.println("ArrayList Beginning: " + Atime);

		AverageTimeLinkedAdd(Llist, 0);
		System.out.println("LinkedList Beginning: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		// 1/4 through the array
		AverageTimeArrayAdd(Alist, 250000);
		System.out.println("ArrayList 1/4: " + Atime);

		AverageTimeLinkedAdd(Llist, 250000);
		System.out.println("LinkedList 1/4: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		// 1/2 through the array
		AverageTimeArrayAdd(Alist, 500000);
		System.out.println("ArrayList 1/2: " + Atime);

		AverageTimeLinkedAdd(Llist, 500000);
		System.out.println("LinkedList 1/2: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		// 3/4 through the array
		AverageTimeArrayAdd(Alist, 750000);
		System.out.println("ArrayList 3/4: " + Atime);

		AverageTimeLinkedAdd(Llist, 750000);
		System.out.println("LinkedList 3/4: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		// End of the array
		AverageTimeArrayAdd(Alist, 999999);
		System.out.println("ArrayList End: " + Atime);

		AverageTimeLinkedAdd(Llist, 999999);
		System.out.println("LinkedList End: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

//------tests the "remove" function-------------------------------------------------------------------------------------------------------
		System.out.println("----------Remove Function----------");

		// Beginning of array
		AverageTimeArrayRemove(Alist, 0);
		System.out.println("ArrayList Beginning: " + Atime);

		AverageTimeLinkedRemove(Llist, 0);
		System.out.println("LinkedList Beginning: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		// 1/4 through the array
		AverageTimeArrayRemove(Alist, 250000);
		System.out.println("ArrayList 1/4: " + Atime);

		AverageTimeLinkedRemove(Llist, 250000);
		System.out.println("LinkedList 1/4: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		// 1/2 through the array
		AverageTimeArrayRemove(Alist, 500000);
		System.out.println("ArrayList 1/2: " + Atime);

		AverageTimeLinkedRemove(Llist, 500000);
		System.out.println("LinkedList 1/2: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		// 3/4 through the array
		AverageTimeArrayRemove(Alist, 750000);
		System.out.println("ArrayList 3/4: " + Atime);

		AverageTimeLinkedRemove(Llist, 750000);
		System.out.println("LinkedList 3/4: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		// End of the array
		AverageTimeArrayRemove(Alist, 999999);
		System.out.println("ArrayList End: " + Atime);

		AverageTimeLinkedRemove(Llist, 999999);
		System.out.println("LinkedList End: " + Ltime);

		System.out.println("Difference: " + (Atime - Ltime));
		System.out.println();

		Alist.clear();
		Llist.clear();
	}
}
