package C210;

import java.util.Scanner;


public class Resumebuilder {

	public static void main (String [] args) {
	
Scanner sc=new Scanner(System.in);

instructionsForName(); 
String name= getName(sc);
instructionsforContactInf();
String contactInfo= getContactInfo(sc);
instructionsForEduc();
String education=getEducation(sc);
String work=getWorkExperience(sc);
String skills=getSkills(sc);
buildResume(name, contactInfo , education, skills, work);

sc.close();
}

static void instructionsForName () {
	System.out.println("please enter your first and last name");


}
static String getName(Scanner sc) {
	System.out.println("First name:  ");
	String first = sc.nextLine();
	System.out.println("Last name: ");
	String last = sc.nextLine();
	System.out.println( first + " " + last);
	return first+""+ last;

}
static void instructionsforContactInf() {
	System.out.println("Please type your Phone number, Email and Address");
}



static String getContactInfo(Scanner sc) {
	System.out.println("Phone number:  ");
	String first = sc.nextLine();
	System.out.println("Email:  ");
	String second = sc.nextLine();
	System.out.println("Address:  ");
	String last = sc.nextLine();
	return first+" / "+ second+" / "+ last;
	
}
static void instructionsForEduc() {
	System.out.println(" Please, provide your school education, major and graduation year");	
}
static String getEducation(Scanner sc) {

	System.out.println(" Eduaction school:  ");
	String first = sc.nextLine();
	System.out.println( "Major:  ");
	String second= sc.nextLine();
	System.out.println("Graduation year:  ");
	String last= sc.nextLine();
	System.out.println("The user typed  " + first + "" + second + "" + last);
	return first+ " / " + second + " / " + last;
}

static String getWorkExperience(Scanner sc) {
	System.out.println("Experience:   ");
	String first= sc.nextLine();
	return first;
}
static String getSkills(Scanner sc) {
	System.out.println("Skills:  ");
	String first=sc.nextLine();
	return first;
}

static void buildResume(String name, String contactInfo, String education, String skills, String work) {
	System.out.print("=====================RESUME===================");
	System.out.println(" ");
	System.out.println("Name: " + name);
	System.out.println(" ");
	System.out.println("Contatc Info: " + contactInfo);
	System.out.println(" ");
	System.out.println("--------------------------------------------");
	System.out.println(" ");
	System.out.println("Education: " + education);
	System.out.println(" ");
	System.out.println("---------------------------------------------");
	System.out.println(" ");
	System.out.println("Skills: "+ skills);
	System.out.println(" ");
	System.out.println("----------------------------------------------");
	System.out.println("Work experience: " + work);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("===================Resume Builder by Anthony Cortez================== ");
	
	
}
}
	