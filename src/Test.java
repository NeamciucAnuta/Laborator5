
public class Test {
	
	public static void main(String []args) throws Exception {
		{
			
			Paragraf p1= new Paragraf("Paragraf 1");
			p1.setAlignStrategy(new RightAlign());
			Paragraf p2= new Paragraf("Paragraf 2");
			p2.setAlignStrategy(new CenterAlign());
			Sectiune s =new Sectiune(null);
			s.add(p1);
			s.add(p2);
			s.print();
			
			
		}
	} 
	
	
	

}

