class A{
	void display(){
		System.out.println("in class A");
	}
}

class B extends A{
	void display(){
		System.out.println("in class B");
	}
}

class C extends A{
	void display(){
		System.out.println("in class C");
	}
}

class Polymorphism 
{
	public static void main(String[] args) 
	{
		//A obj = new A();
		//B obj = new B();
		//A obj = new B();
		A obj = new C();
		obj.display();
	}
}