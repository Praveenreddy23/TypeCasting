package classtypeCasting;
/*If a method has been  overridden and if we invoke a method
  with the upcasted reference or Downcasted reference. always 
  Overridden implementation will get executed*/

public class Test  {
public static void main(String[] args) {
	Father f = new Son();//Upcasting
	f.bike();
	Son s = (Son) f;//Downcasting
	s.bike();

//	Son s = new Son();
//	s.bike();

	
}
}
