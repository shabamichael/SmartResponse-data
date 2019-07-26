package com.smart.response;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.smart.response.database.DBConnection;
import com.smart.response.hospital.HospitalService;
import com.smart.response.hospital.Hospitals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmartResponseDataApplicationTests {

	@Test
	public void contextLoads() {
		//DBConnection dbconn = new DBConnection();
		HospitalService hs = new HospitalService();
		
		System.out.println(hs.FindAllHospitals());
		
	}

}
