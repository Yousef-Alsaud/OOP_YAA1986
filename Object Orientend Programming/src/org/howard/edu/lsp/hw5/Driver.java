
package org.howard.edu.lsp.hw5;

import java.util.ArrayList;

public class Driver {

		public static final ArrayList<Integer> List = null;

		public static void main(String[] args) throws IntegerSetException {
			IntegerSet set1 = new IntegerSet();
			set1.add(1);
			set1.add(2);
			set1.add(3);
			System.out.println("Value of Set1 is:" + set1.toString());
			System.out.println("Smallest value in Set1 is:"+ set1.smallest());
			System.out.println("Largest value in Set1 is:"+ set1.largest());
			System.out.println("3 is in Set1 ? "+ set1.contains(3));
			System.out.println("Is Set1 empty ? "+ set1.isEmpty());
			System.out.println("---------------------------");

		
			IntegerSet set2 = new IntegerSet();
			set2.add(3);
			set2.add(4);
			set2.add(5);
			System.out.println("Value of Set2 is:" + set2.toString());
			System.out.println("Smallest value in Set2 is:"+ set2.smallest());
			System.out.println("Largest value in Set2 is:"+ set2.largest());
			System.out.println("6 is in Set2 ? "+ set2.contains(6));
			System.out.println("Is Set2 empty ? "+ set2.isEmpty());
			System.out.println("---------------------------");
			System.out.println("Intersection Set1 and Set 2: ");
			set1.intersect(set2);
			System.out.println("Union of Set1 and Set2");
			set1.union(set2);
			System.out.println("Difference of Set1 and Set2");
			set1.diff(set2);
			
			
		}

	}
