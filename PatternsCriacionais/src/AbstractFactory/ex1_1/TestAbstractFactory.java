package AbstractFactory.ex1_1;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		HelloWorldFactory factory = HelloWorldFactoryProducer.getFactory("PrintFactory");
		
		HelloWorld printMessage = factory.getInstance();
		
		String msg = "";
		msg = printMessage.print();
		
		System.out.println(msg);

	}

}