class Animal
{
String name;
Animal() 
{
System.out.println("An animal");
}
Animal(String name) 
{
this.name = name;
System.out.println("An animal named " + name + " is ");
}
}
class Dog extends Animal 
{
String breed;
Dog() 
{
super();
System.out.println("A dog ");
}
Dog(String name, String breed) 
{
super(name);
this.breed = breed;
System.out.println("A dog named " + name + " of breed " + breed + " is created.");
}
}
class Puppy extends Dog 
{
int age;
Puppy() {
super();
System.out.println("A puppy ");
}
Puppy(String name, String breed, int age) 
{
super(name, breed);
this.age = age;
System.out.println("A puppy named " + name + " of breed " + breed + " aged " + age + " months");
}
}
class Mainanimalmulinh
{
public static void main(String[] args) 
{
Puppy puppy1 = new Puppy();
Puppy puppy2 = new Puppy("Bruno", "Pug", 3);
}
}