class Animal{
  void eat(){
    System.out.println("Eating.....");}
  class Dog extends Animal{
    void bark(){
      System.out.println("Barking....";}
    class SingleInheritance{
      public static void main(String args[]){
        Animal a=new Animal();
        a.eat();
        Dog d=new Dog();
        d.bark();
        d.eat();}}}
