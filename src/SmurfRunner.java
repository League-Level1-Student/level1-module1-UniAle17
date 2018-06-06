
public class SmurfRunner {
public static void main(String[] args) {
	Smurf bob = new Smurf("Bobby");
	String y =bob.getName();
	System.out.println(y);
	bob.eat();
	String x =bob.getHatColor();
	System.out.println(x);
	String z =bob.isGirlOrBoy();
	System.out.println(z);
	
	
	Smurf papa = new Smurf("Papa");
	String a = papa.getName();
	System.out.println(a);
	String b = papa.getHatColor();
	System.out.println(b);
	String c = papa.isGirlOrBoy();
	System.out.println(c);
	
	Smurf smurfette = new Smurf("smurfette");
	String d = smurfette.getName();
	System.out.println(d);
	String e = smurfette.getHatColor();
	System.out.println(e);
	String f = smurfette.isGirlOrBoy();
	System.out.println(f);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
