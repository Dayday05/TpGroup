package fr.formation;

import java.util.ArrayList;

public class Students {
	
	public static void main(String[] args) {
		
		ArrayList studentsName = new ArrayList();
		
		studentsName.add("Aurélien");
		studentsName.add("Pierre");
		studentsName.add("Bayrem");
		studentsName.add("Jennifer");
		studentsName.add("Héléne");
		studentsName.add("David");
		studentsName.add("Julien");
		
		ArrayList studentsGroup = new ArrayList();
		
		studentsGroup.add(3);
		studentsGroup.add(1);
		studentsGroup.add(1);
		studentsGroup.add(2);
		studentsGroup.add(3);
		studentsGroup.add(2);
		studentsGroup.add(2);
		
		ArrayList studentsIsInternal = new ArrayList();
		
		studentsIsInternal.add(false);
		studentsIsInternal.add(true);
		studentsIsInternal.add(true);
		studentsIsInternal.add(false);
		studentsIsInternal.add(true);
		studentsIsInternal.add(false);
		studentsIsInternal.add(true);
		
		ArrayList listStudents = new ArrayList();
		
		listStudents.addAll(studentsName);
		listStudents.addAll(studentsGroup);
		listStudents.addAll(studentsIsInternal);
	
		System.out.println(listStudents);
		
	}
}
