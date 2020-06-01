package AbstractFactory.ex1_1;

public final class HelloWorldFactoryProducer {

	private HelloWorldFactoryProducer() {
		throw new AssertionError();
	}

	public static HelloWorldFactory getFactory(String factoryType) {
		
		switch(factoryType) {
		case "PrintFactory": return new PrintFactory();
		}
		
		return null;
	}

}