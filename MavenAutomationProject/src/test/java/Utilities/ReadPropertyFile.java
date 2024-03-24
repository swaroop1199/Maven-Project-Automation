package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("F:\\QA\\Selenium Project\\MavenAutomationProject\\src\\test\\resources\\Configfile\\config.properties");

		Properties p = new Properties();

		p.load(file);

		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl2"));

	}

}
