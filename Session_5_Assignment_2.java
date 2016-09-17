class Build{
	 //n is number of floors
	int no_of_rooms;
	int portions; //number of portions per floor
	protected String buildername;//name of builder
}

class Duplex extends Build{
	
		
	public Duplex(int n,int p){
		this.buildername="sasha";
		this.no_of_rooms=n;
		this.portions=p;
	}
	
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("Buildername is \n"+this.buildername);
			System.out.println("Number of floors are \t"+this.no_of_rooms);
			System.out.println("Number of portions allotted to each floor is \t"+this.portions);
		
		}
}
class Apartments extends Build{
	
		public Apartments(int n,int p){
			this.buildername="Akshay";
			this.no_of_rooms=n;
			this.portions=p;
		}
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Buildername is \n"+this.buildername);
				System.out.println("Number of floors are \t"+this.no_of_rooms);
				System.out.println("Number of portions allotted to each floor is \t"+this.portions);
			
			}
		
}
	
public class Session_5_Assignment_2 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Duplex house");
Duplex d = new Duplex(4,5);
Duplex du = new Duplex(2,4);
Apartments apa = new Apartments(10,4);
Apartments ap = new Apartments(20,6);
d.display();
du.display();
System.out.println("This is Apartments");
apa.display();
ap.display();
	}
}
