package com.inheritance;
class Players{
	 String name;
	 int age;
	 int mom ;
	 int best_score;
	 String country;
	 String team;
}

class Fb extends Players{
	int goals;
	int assists;
		public void disp() {
			System.out.println("Name : " + name);
			System.out.println("Age : " + age);
			System.out.println("country : " + country);
			System.out.println("Team : " + team);
			System.out.println("Goals : " + goals);
			System.out.println("Assist : " + assists);
			System.out.println("MOM : " + mom);
		}

}
public class Football {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fb f1 = new Fb();
		f1.name = "Abc";
		f1.age = 21;
		f1.assists =105;
		f1.country = "India";
		f1.team = "FC Goa";
		f1.goals = 100;
		f1.mom = 5;
		f1.disp();
		
		

	}

}
