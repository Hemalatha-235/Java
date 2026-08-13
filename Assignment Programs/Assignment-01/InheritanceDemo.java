package javacore;

//Beginner-friendly program showing Single, Multilevel, Hierarchical, and Hybrid Inheritance

//--- Single Inheritance ---
class ParentSingle {
 void parentMethod() {
     System.out.println("Single Inheritance: Parent method");
 }
}
class ChildSingle extends ParentSingle {
 void childMethod() {
     System.out.println("Single Inheritance: Child method");
 }
}

//--- Multilevel Inheritance ---
class Grandparent {
 void grandMethod() {
     System.out.println("Multilevel Inheritance: Grandparent method");
 }
}
class ParentMulti extends Grandparent {
 void parentMethod() {
     System.out.println("Multilevel Inheritance: Parent method");
 }
}
class ChildMulti extends ParentMulti {
 void childMethod() {
     System.out.println("Multilevel Inheritance: Child method");
 }
}

//--- Hierarchical Inheritance ---
class ParentHier {
 void commonMethod() {
     System.out.println("Hierarchical Inheritance: Parent method");
 }
}
class Child1 extends ParentHier {
 void child1Method() {
     System.out.println("Hierarchical Inheritance: Child1 method");
 }
}
class Child2 extends ParentHier {
 void child2Method() {
     System.out.println("Hierarchical Inheritance: Child2 method");
 }
}

//--- Hybrid Inheritance (mix of multilevel + hierarchical) ---
class Animal {
 void eat() {
     System.out.println("Hybrid Inheritance: Animal eats");
 }
}
class Dog extends Animal {
 void bark() {
     System.out.println("Hybrid Inheritance: Dog barks");
 }
}
class Puppy extends Dog {
 void weep() {
     System.out.println("Hybrid Inheritance: Puppy weeps");
 }
}
class Cat extends Animal {
 void meow() {
     System.out.println("Hybrid Inheritance: Cat meows");
 }
}

//--- Main Program ---
public class InheritanceDemo {
 public static void main(String[] args) {
     // Single Inheritance
     ChildSingle cs = new ChildSingle();
     cs.parentMethod();
     cs.childMethod();

     // Multilevel Inheritance
     ChildMulti cm = new ChildMulti();
     cm.grandMethod();
     cm.parentMethod();
     cm.childMethod();

     // Hierarchical Inheritance
     Child1 c1 = new Child1();
     c1.commonMethod();
     c1.child1Method();

     Child2 c2 = new Child2();
     c2.commonMethod();
     c2.child2Method();

     // Hybrid Inheritance
     Puppy p = new Puppy();
     p.eat();
     p.bark();
     p.weep();

     Cat cat = new Cat();
     cat.eat();
     cat.meow();
 }
}
//output:
// Single Inheritance: Parent method
// Single Inheritance: Child method

// Multilevel Inheritance: Grandparent method
// Multilevel Inheritance: Parent method
// Multilevel Inheritance: Child method

// Hierarchical Inheritance: Parent method
// Hierarchical Inheritance: Child1 method
// Hierarchical Inheritance: Parent method
// Hierarchical Inheritance: Child2 method

// Hybrid Inheritance: Animal eats
// Hybrid Inheritance: Dog barks
// Hybrid Inheritance: Puppy weeps
// Hybrid Inheritance: Animal eats
// Hybrid Inheritance: Cat meows
