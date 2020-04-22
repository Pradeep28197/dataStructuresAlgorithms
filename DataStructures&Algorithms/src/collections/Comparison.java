package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class MarksComparator implements Comparator<Comparison>{
	@Override
	public int compare(Comparison comp1, Comparison comp2) {
		return (comp1.getTotalMarks()-comp2.getTotalMarks());
	}
}

public class Comparison implements Comparable<Comparison>{
	private String name;
	private int rollNumber;
	private int totalMarks;
	

    public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
		public Comparison(String name, int rollNumber, int totalMarks) {
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
	public int compareTo(Comparison comp) {
		
		return(this.name.compareTo(comp.name));
	}
	@Override
    public String toString() {
		return(this.name+this.rollNumber);//add toString() method
	}
	@Override
    public boolean equals(Object obj) {
		Comparison std = (Comparison) obj;
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
		Comparison set1 = new Comparison("Pradeep",1, 30);
		Comparison set2 = new Comparison("Arthika",7,50);
		Comparison set3 = new Comparison("Manivel",8,56);
		Comparison set4 = new Comparison("Ramani",9,88);
		Comparison set5 = new Comparison("Raji",9,88);
//		String ss1 = new String("Pradeep");
//		String ss2 = new String("Arthika");
//		String ss3 = new String("Maanivela");
//		String ss4 = new String("Raji");
//		String ss5 = new String("Ramani");
		List<Comparison> hash1 = new ArrayList<Comparison>();
//		TreeSet<String> hash2 = new TreeSet<String>();
		hash1.add(set1);
		hash1.add(set2);
		hash1.add(set3);
		hash1.add(set4);
		hash1.add(set5);
//		for (Comparison comparison : hash1) {
//			System.out.println(comparison.toString());
//		}
		Collections.sort(hash1, new MarksComparator());
		System.out.println(hash1);
//		Map<Integer,String> gradeMap= new java.util.TreeMap<Integer, String>();
//		for(Comparison s1:hash1) {
//			if(s1.getTotalMarks()>=60) {
//				gradeMap.put(s1.getRollNumber(), "A");
//			}
//			else if(s1.getTotalMarks()<60 && s1.getTotalMarks()>40){
//				gradeMap.put(s1.getRollNumber(), "B");
//			}
//			else if(s1.getTotalMarks()<=40) {
//				gradeMap.put(s1.getRollNumber(), "C");
//			}
//		}
//		Set<Integer> entries = gradeMap.keySet();
//		for (Integer integer : entries) {
//			System.out.println(integer +" "+gradeMap.get(integer));
//		}
		
	}

}
