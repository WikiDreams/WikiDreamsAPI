package org.wikidreams.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WDDate {

	public static String getSystemDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

}
