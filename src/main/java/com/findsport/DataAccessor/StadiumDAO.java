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

	public static int insertStadiumAddress(StadiumAddress stadiumAddress){
		int addressId = -1;
		try{
			Properties prop = new Properties();
			InputStream input = new FileInputStream(propertiesFile);

			prop.load(input);
			String insert_stadium_address = prop.getProperty("insert_stadium_address");
			int status =template.update(insert_stadium_address,stadiumAddress.getStreetName(),stadiumAddress.getCityname(),stadiumAddress.getLandMark(),stadiumAddress.getState(),stadiumAddress.getCountry());
			System.out.print("Status : "+status);
			if(status ==1) {
				addressId = template.queryForObject(prop.getProperty("get_addressId"), Integer.class);
			}

		}catch(Exception e){
			System.out.println(e.getMessage());
			return -1;
		}
		return addressId;
	}
	public static boolean insertData(Stadium stadiumDataObject, int addressId) {

		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream(propertiesFile);

			prop.load(input);
			String insert_stadium_details = prop.getProperty("insert_stadium_details");
			int status = template.update(insert_stadium_details, stadiumDataObject.getStadiumName(),
					stadiumDataObject.getStadiumLongitude(), stadiumDataObject.getStadiumLatitude(),
					stadiumDataObject.getStadiumPhoneNo(),addressId);
			System.out.print("status : "+ status);
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;	
	}


}
