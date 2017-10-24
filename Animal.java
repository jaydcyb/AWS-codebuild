
/* Assignment # 1

Create a class hierarchy : Animal
						Cat Dog Lion
Animal class will have methods like respirate () & talk()
Override method talk() from Animal class in its each subclass
Create an array of Animal references & observe dynamic polymorphism */




class lion extends Animal 
{
	@Override
	public void Talks()
	{
		System.out.println("Lion's Roar....!!!!");
	}
}
class cat extends Animal
{
	@Override
	public void Talks()
	{
		System.out.println("Cat Meow's......!!!!");
	}
}
 class Dog extends Animal
 {
	 @Override
	 public void Talks()
	 {
		System.out.println("Dog's Bark.....!!!!"); 
	 }
 }
 public class Animal 
 {
 	
 	public Animal()
 	{
 		System.out.println("New animal added");
 	}
 	public void Respiration()
 	{
 		System.out.println("Animal Inhales oxygen");
 	}
 	public void Talks()
 	{
 		System.out.println("Animals Talks");
 	}



public static void main(String [] args)
{
	cat cat1 = new cat();

	cat1.Talks();
	cat1.Respiration();
	
	Dog dog1 = new Dog();
	
	dog1.Talks();
	dog1.Respiration();
	
	lion lion1 = new lion();
	
	lion1.Talks();
	lion1.Respiration();
	
	
}
}