package com.felix.config.confixplay;

import com.felix.config.confixplay.config.GlobalConfiguration;
import com.felix.config.confixplay.controller.HelloController;
import com.felix.config.confixplay.model.ExampleObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.Response;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ConfixplayApplicationTests {


	@Autowired
	GlobalConfiguration myConfig;

	@Test
	public void testTimeout(){
		System.out.println(myConfig.getConnectionTimeout());
		TestRestTemplate testRestTemplate = new TestRestTemplate();
		ResponseEntity<ExampleObject[]> response = testRestTemplate.getForEntity("http://localhost:8086/hello",ExampleObject[].class);
		Assert.assertEquals(response.getStatusCode(), (HttpStatus.OK));
	}

}

