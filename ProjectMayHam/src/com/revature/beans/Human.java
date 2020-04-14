package com.revature.beans;

// Packages are just very fancy folders. Namespace (Tue, 4/14/20)

/*
* Naming Convention
* Classes & Projects: Pascal casing, capitalize the 1st letter
* of each word. Ex: ProjectMayhem
* 
* Method and variables: Camel casing, start with lower-case
* Ex: firstSecondThird  
* 
* Packages: lowercase & delimited by periods
* 
* Constants: ALL_CAPS, typically delimited by underscores
*/

public class Human {
	
	/*
	 * Members of a class - couple of forms
	 * Instance variables - property of a specific object (humans name)
	 * Static variable - property of the class shared by all of its instances
	 * Instance methods - behavior relative to a specific object
	 * Static methods - behavior relative to entire class
	 * Constructor - instantiates the class using the keyword "new"
	 */

		 public String name;
		private int age;
		private int weight;
		
		public String getName() {
			return name;
		}
		public void setName (String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
		}
		

}
