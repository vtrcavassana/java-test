package AbstractFactory.ex1_1;

public class PrintFactory implements HelloWorldFactory{

	@Override
	public HelloWorld getInstance() {
		
		int num = (int) Math.ceil((Math.random() * 100));
		
		switch(num%2) {
		case 0: return new ScreenPrint();
		case 1: return new FilePrint();
		}
		return null;
	}

}