package com.megatech.logics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MainLogics {

	// private static final Logger log =
	// LoggerFactory.getLogger(MainLogics.class);
	
	@Value("${resource.url}")
	private String url;

	RestTemplate restTemplate = new RestTemplate();
	
	
	public List<EnergyTimeData> findAll() {
	    return Arrays.stream(restTemplate.getForObject(url, EnergyTimeData[].class)).collect(Collectors.toList());
	}

	public void getAverage(Integer no) {
		String getUrl = "https://energyiotcassandra.mybluemix.net/tags/gettag/" + no;
		String getResponse = restTemplate.getForObject(getUrl, String.class);
		System.out.println("Response for Get Request: " + getResponse);
	}

}
