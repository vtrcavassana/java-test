package AbstractFactory.ex1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilePrint implements HelloWorld {
		public static void main(String[] args) {

			File file = new File("C:\\Users\\Administrador\\Documents\\git\\java_PatternsCriacionais\\PatternsCriacionais\\src\\AbstractFactory\\ex1_1\\output.txt");
			String content = "This is the text content";

			try (FileOutputStream fop = new FileOutputStream(file)) {

				// if file doesn't exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				// get the content in bytes
				byte[] contentInBytes = content.getBytes();

				fop.write(contentInBytes);
				fop.flush();
				fop.close();

				System.out.println("Done");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public String print() {
			// TODO Auto-generated method stub
			return null;
		}
	}