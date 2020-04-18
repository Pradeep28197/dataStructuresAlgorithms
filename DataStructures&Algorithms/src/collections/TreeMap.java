package collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TreeMap {
			private String name;
			private int rollNumber;
			private int totalMarks;
			
		
		    public int getTotalMarks() {
				return totalMarks;
			}
			public void setTotalMarks(int totalMarks) {
				this.totalMarks = totalMarks;
			}
				public TreeMap(String name, int rollNumber, int totalMarks) {
				this.name = name;
				this.rollNumber = rollNumber;
				this.totalMarks = totalMarks;
			}
			public String getName() {
				return name;
			}
		
			public void setName(String name) {
				this.name = name;
			}
		
			public int getRollNumber() {
				return rollNumber;
			}
		
			public void setRollNumber(int rollNumber) {
				this.rollNumber = rollNumber;
			}
			@Override
		    public String toString() {
				return(this.name+this.rollNumber);//add toString() method
			}
			@Override
		    public boolean equals(Object obj) {
				TreeMap std = (TreeMap) obj;
				//System.out.println(this.name.equals(std.name));
		    	if(this.rollNumber == std.rollNumber ) {
		    		return true;// add appropriate method for avoiding duplicate Student
		    	}
		    	else if(this.name.equals(std.name)){
		    		return true;
		    	}return false;
		    }
			@Override
			public int hashCode() {
				return this.rollNumber;
			}
			public static void main(String[] args) {
				TreeMap set1 = new TreeMap("Pradeep",1, 60);
				TreeMap set2 = new TreeMap("Pradeep",9,50);
				TreeMap set3 = new TreeMap("Pradeep",8,20);
				HashSet<TreeMap> hash1 = new HashSet<TreeMap>();
				hash1.add(set1);
				hash1.add(set2);
				hash1.add(set3);
				
				Map<Integer,String> gradeMap= new java.util.TreeMap<Integer, String>();
				for(TreeMap s1:hash1) {
					if(s1.getTotalMarks()>=60) {
						gradeMap.put(s1.getRollNumber(), "A");
					}
					else if(s1.getTotalMarks()<60 && s1.getTotalMarks()>40){
						gradeMap.put(s1.getRollNumber(), "B");
					}
					else if(s1.getTotalMarks()<=40) {
						gradeMap.put(s1.getRollNumber(), "C");
					}
				}
				Set<Integer> entries = gradeMap.keySet();
				for (Integer integer : entries) {
					System.out.println(integer +" "+gradeMap.get(integer));
				}
				
			}
	


}
