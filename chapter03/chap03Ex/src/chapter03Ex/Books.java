package chapter03Ex;
import chapter03Ex.BooksTestDrive;

class Books{
	public static void main(String[] args) {
		
	BooksTestDrive[] myBooks = new BooksTestDrive[3];
	myBooks[0] = new BooksTestDrive();
	myBooks[1] = new BooksTestDrive();
	myBooks[2] = new BooksTestDrive();
	
	int x = 0;		
	myBooks[0].title = "The Grape of Java";
	myBooks[1].title = "The Java Gatsby";
	myBooks[2].title = "The Java Cookbook";
		
	myBooks[0].author = "Liam";
	myBooks[1].author = "Harold";
	myBooks[2].author = "Quinn";
		
	while(x<3) {
		System.out.print(myBooks[x].title);
		System.out.print(" by ");
		System.out.println(myBooks[x].author);
		x++;
		}		
	}

}




