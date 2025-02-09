/** Driver program for CS 113 HW 10, Fall 2024.
 *  Your goal for this assignment is
 *  to get this driver to compile and run correctly.
 */
public class HW10Driver {
   
   /** Main driver method.
    * @param args the arguments (not used)
    */
   public static void main(String[] args) {
      Vet avet = new Vet(12, "Pets R Us");

      System.out.printf("avet is a type of database: %b\n",avet instanceof Database);
      Pet p;
   
      p = new Pet("Rudolph", "Santa Claus", 350);
      p.visit(1);
      avet.add(p);
      avet.add(new Pet("Tweetie Bird", "Looney Tunes", 1.75));
      System.out.println("visit1: " + p.visit(1));
      System.out.println();
      show(avet);
   
      String petString = new String("pet");
      System.out.printf("Adding a string should return false: %b", 
         avet.add(petString));


      p = new Cat("Tiger", "Some Body", 8);
      avet.add(p);
      System.out.println("visit0: " + p.visit(0));
      
      Cat c = new Cat("Sylvester", "Looney Tunes", 15.5);
      System.out.println("inside visit1: " + c.visit(1));
      c.goOutside();
      System.out.println("outside visit1: " + c.visit(1));
      System.out.println("c is " + c);
      avet.add(c);
   
      System.out.println();
      show(avet);
   
      Dog d = new Dog("Fido", "Some Body", 32.2, "medium");
      System.out.println("med visit3: " + d.visit(3));
      avet.add(d);
   
      p = new Dog("Dino", "Flintstones", 150, "large");
      avet.add(p);
      System.out.println("lg visit3: " + p.visit(3));
      System.out.println();
      show(avet);
   
      avet.add(new Dog("Benji", "Joe Camp", 10, "small"));
      p = new Cat("Tony", "Kellogg", 20);
      avet.add(p);
      System.out.println();
      show(avet);
   
      System.out.println("\na few more tests...");
      System.out.println("find p: " + avet.find(p));
      p = (Pet) avet.find(new Pet("Tweetie Bird", "Looney Tunes", 1.5));
      System.out.println("Tweetie 5 shots: " + p.visit(5));
      System.out.println("found Tweetie: " + p);
   
      System.out.println("find Fido: "
         + avet.find(new Dog("Fido", "some body", 32.2, "medium")));
   
      System.out.println("adding string to Vet: " + avet.add("not a pet"));
      System.out.println("deleting string: " + avet.delete("just a string"));
   
      System.out.println();
      System.out.println("\ndeleting pets:");
      System.out.println(avet.delete(p));
      System.out.println(avet.delete(d));
      System.out.println(avet.delete(c));
      show(avet);

      avet.add(new Pet("Happy", "Some Body", 13.5));
      show(avet);
   }
   
   /** Output the current state of things to the screen.
    *  @param myvet the vet records to display
    */
   public static void show(Vet myvet) {
      System.out.println("--- Vet has " + myvet.size() + " clients");
      myvet.display();
      System.out.println(">> average client weight: " + myvet.averageWeight());
   }
}
