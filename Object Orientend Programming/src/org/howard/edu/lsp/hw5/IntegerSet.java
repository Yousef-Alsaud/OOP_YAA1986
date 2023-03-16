package org.howard.edu.lsp.hw5;

import java.util.ArrayList;


public class IntegerSet {
	
	ArrayList<Integer> List = new ArrayList<Integer>();
	
	public IntegerSet() {
		
	}
	public void clear() {
		List.clear();
	};
	public int length() {
	
		return List.size();
	}; 
	
	

	public boolean equals(Driver intSetb) {
		int t=0;
		ArrayList<Integer> Temp = new ArrayList<Integer>();	
		Temp= Driver.List;
		for (int i=0; i< List.size();i++)
		{
			for (int j=0; j < Temp.size();j++)
		{
			if(List.get(i)==Temp.get(j))
			{
				t=t+1;
			}
		}
		
		}
		if (t==List.size())
		{
			return true;
		
		}
		return false;
		
	};
	
	
	public boolean contains(int value) {
		
		if (List.contains(value)== true)
		{
			return true;
		}
		
		return false;
		
	};
	
	
	public int largest() throws IntegerSetException {
		
		int large=999999;
		try {
			
			if (List.isEmpty()== true)
				{
				throw new IntegerSetException("");
				}else {
					large=List.get(0);
					for (int i = 0; i < List.size(); i++) {
			            if (large < List.get(i))
			                large = List.get(i);
			        }
					return large;	
					
					
				}
			
		}catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		return large;
		
	};
		
	
	
	public int smallest() throws IntegerSetException{
		int min =0;
		try {
			
			if (List.isEmpty()== true)
				{
				throw new IntegerSetException("");
				}else {
					min=List.get(0);
					for (int i = 0; i < List.size(); i++) {
			            if (min > List.get(i))
			                min = List.get(i);
			        }
					return min;
				}
			
		}catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		return min;
		
	};
	
	
	public void add(int item) throws IntegerSetException{
		try {
			
			if (List.contains(item)== true)
				{
				throw new IntegerSetException("");
				}else {
					List.add(item);
				}
			
		}catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
	}; 
	
	

	public void remove(int item)throws IntegerSetException{
		try {
			
		if (List.contains(item)== false)
			{
			throw new IntegerSetException("");
			}
		else 
			{
			for (int i =0; i<List.size();i++)
			{
				if (List.get(i)== item)
				{
					List.remove(i);
				}
			}
				
			}
		}catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	};  
	
	
	public void union(IntegerSet set2) {
		ArrayList<Integer> Temp = new ArrayList<Integer>();
		Temp = set2.List;
		for (int i = 0; i < Temp.size(); i++) {
			for (int j=1 ; j< List.size();j++ )
			{ if (Temp.get(i)== List.get(j))
				
			{	List.remove(j);
				
			}else {
				List.add(Temp.get(i));
			}
			
        }
			}
		System.out.println(List.toString());
		
	};

	
	
	public void intersect(IntegerSet set2) {
		
		ArrayList<Integer> Temp = new ArrayList<Integer>();
		Temp = set2.List;
		for (int i = 0; i < Temp.size(); i++) {
			for (int j=1 ; j< List.size();j++ )
            if (List.get(j)== Temp.get(i))
            {
            	System.out.println(List.get(j));
            }
			
        }
			
		
	}; 
	
	
	public void diff(IntegerSet set1) {
		
		ArrayList<Integer> Temp = new ArrayList<Integer>();
		Temp = set1.List;
		List.removeAll(Temp);
		
		for (int i=0; i < List.size() ;i++)
		{
		System.out.println(List.get(i));
		}
	
	
	};
	
	
	public boolean isEmpty() {
		if (List.isEmpty() == true)
		{
			return true;
		}
		return false;
	};
	public String toString() {
		
		return List.toString();
	};

}
