package assignment3;
//Parent class or Superclass
class ParentClass 
{
	int num;		//parent or super class variable
	ParentClass(int x)		//ParentClass Constructor
	{
	    System.out.println("Constructor of Parent class");
	}
	void display()		//Overridden method
	{
		System.out.println("Parent class method");
	}
}
	
//Child class or subclass
class Assignment3_2 extends ParentClass
{
	int num,num2;	//subclass variable
	
	Assignment3_2(int x,int y)
	{
		super(x);		//calls ParentClass class constructor
		this.num=y;		//assign y to variable num of subclass
		super.num=x;	//assign x to variable num of superclass
		System.out.println("Constructor of Child Class");
	}
	Assignment3_2(int x,int y,int z)
	{
		this(x,y);
		num2=z;
		System.out.println("Child Class Constructor");
	}
	//Overriding method
	void display()
	{
		
		System.out.println("Child class method");
	}
	void printNumber()
	{
		System.out.println("print parent class num variable value");
		System.out.println(super.num);
		System.out.println("print child class num variable value");
		System.out.println(this.num);
		System.out.println(this.num2);
		super.display();		//This would call Overridden method
		this.display();		//This would call Overriding method
	}
	public static void main(String args[])
	{ 
		Assignment3_2 obj= new Assignment3_2(3,4);
		obj.printNumber();	
		Assignment3_2 obj1= new Assignment3_2(3,4,2);
		obj1.printNumber();
	}
}