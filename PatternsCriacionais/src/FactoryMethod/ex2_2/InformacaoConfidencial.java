package FactoryMethod.ex2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InformacaoConfidencial implements Informacao {

	@Override
	public String informacao() {

		String local = "C:\\Users\\Administrador\\Documents\\git\\java-test\\PatternsCriacionais\\src\\FactoryMethod\\ex2_2\\confidencial.txt";
		File arquivo = new File(local);

		StringBuffer buffer = new StringBuffer();

		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileReader(arquivo));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanner.hasNextLine()) {
			buffer.append(scanner.nextLine());
			buffer.append("\n");
		}
		scanner.close();

		return buffer.toString();
	}

}