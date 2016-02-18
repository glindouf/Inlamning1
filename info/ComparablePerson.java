/*
Using the java.util.Comparator Class

Implementing the Comparable interface enables you to define one way to compare instances of your class. 
However, objects are sometimes comparable in many ways. For example, two Person objects may need to be compared by age or by last/first name. 
In cases like this, create a Comparator that defines how to compare two objects. To make objects comparable in two ways, then you need two comparators.



To create a comparator, write a class that implements the java.util.Comparator interface--the compare method. This method has the following signature:

public int compare(Object o1, Object o2)
The compare method returns zero if o1 and o2 are equal, a negative integer if o1 is less than o2, and a positive integer if o1 is greater than o2. 
Just as in the compareTo method of Comparable, you define what makes an object equal or less/greater than another object.

As an example, let's write two comparators for the Person class. This example consists of four classes, all of which reside in the comparable.ex02 package. 
The Person class is similar to the one in the previous example, and is reprinted in Listing 6 for reading convenience. 
Listings 7 and 8 present two comparators of Person objects (by last name and by first name), and Listing 9 offers the class that instantiates the Person class and the two comparators.
*/

package comparable.ex02;

class Person implements Comparable {

  private String firstName;
  private String lastName;
  private int age;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int compareTo(Object anotherPerson) throws ClassCastException {
    if (!(anotherPerson instanceof Person))
      throw new ClassCastException("A Person object expected.");
    int anotherPersonAge = ((Person) anotherPerson).getAge();  
    return this.age - anotherPersonAge;    
  }
}