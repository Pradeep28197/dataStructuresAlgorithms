package collections;

import java.util.HashSet;



public class SetInterface {
		private String name;
		private int rollNumber;
	
	        public SetInterface(String name, int rollNumber) {
			this.name = name;
			this.rollNumber = rollNumber;
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
			SetInterface std = (SetInterface) obj;
			//System.out.println(this.name.equals(std.name));
	    	if(this.rollNumber == std.rollNumber || this.name==std.name) {
	    		return true;// add appropriate method for avoiding duplicate Student
	    	}return false;
	    }
		@Override
		public int hashCode() {
			return this.rollNumber;
		}
		public static void main(String[] args) {
			SetInterface set1 = new SetInterface("Pradeep",1);
			SetInterface set2 = new SetInterface("Pradeep",8);
			HashSet<SetInterface> hash1 = new HashSet<SetInterface>();
			hash1.add(set1);
			hash1.add(set2);
			for(SetInterface s1:hash1) {
				System.out.println(s1.toString());
			}
		}
}
