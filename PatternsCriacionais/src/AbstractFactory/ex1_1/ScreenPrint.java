package AbstractFactory.ex1_1;

import javax.swing.JOptionPane;

public class ScreenPrint implements HelloWorld{

	@Override
	public String print() {
		System.out.println("Print");
		JOptionPane.showMessageDialog(null, "Hello World");
		return "Printado";
	}

}