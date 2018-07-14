package Lessons2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Mylocal {
	public static void main(String[] args) {
		String language="en";
		String country="US";
		Locale currentLocale=new Locale(language,country);
		ResourceBundle massages=	ResourceBundle.getBundle("resource.MassagesBundle", currentLocale);
		System.out.println(massages.getString("q"));
	}
}
