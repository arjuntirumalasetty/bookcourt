package com.findsport.DataAccessor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.findsport.DataObjects.StadiumAddress;
import org.springframework.jdbc.core.JdbcTemplate;
import com.findsport.DataObjects.Stadium;
import com.findsport.Main.StartService;

/**
 * Created by Arjun on 12/27/2016.
 */
public class StadiumDAO {

	private static final String propertiesFile = "src/main/resources/query.properties";
	private static JdbcTemplate template = StartService.getJdbcTemplate();

	public static boolean insertData(Stadium stadiumDataObject) {

		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream(propertiesFile);

			prop.load(input);
			String insert_stadium_details = prop.getProperty("insert_stadium_details");
			int status = template.update(insert_stadium_details, stadiumDataObject.getStadiumName(),
					stadiumDataObject.getStadiumLongitude(), stadiumDataObject.getStadiumLatitude(),
					stadiumDataObject.getStadiumPhoneNo(),stadiumDataObject.getStreetName(),
					stadiumDataObject.getCityName(),stadiumDataObject.getLandMark(),stadiumDataObject.getState(),
					stadiumDataObject.getCountry());
			System.out.print("status : "+ status);
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;	
	}


}
