package tryouts;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}

// Serialization --> Converting Object to Byte Stream. 
public class Serialization {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student(1, "Pradeep");
		
		FileOutputStream fout = new FileOutputStream("mySerialized.txt");// Creating filepath to store the serialized content 
		ObjectOutputStream oout = new ObjectOutputStream(fout); //Instaniating Object
		oout.writeObject(s1); //Writing our object
		oout.flush(); // To send the content from the buffer to output stream
		oout.close(); //else there will be memory leak
		System.out.println("Success");
	}

}
