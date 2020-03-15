package com.example.demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.model.LocationStats;

@Service
public class DataService {

private static String path = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_19-covid-Confirmed.csv";
	
	List<LocationStats> stats = new ArrayList<>();
	
	@PostConstruct
	@Scheduled(cron ="* * 1 * * *")
	 public void fecthData() {
		System.out.println("Came here");
		List<LocationStats> newStats = new ArrayList<>();
		 try {
			URL url = new URL(path);
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(url.openStream()));
			
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
            
			for(CSVRecord record: records) {
				LocationStats l = new LocationStats();
				l.setState(record.get("Province/State"));
				l.setRegion(record.get("Country/Region"));
				int latestCases = Integer.parseInt(record.get(record.size()-1));
				l.setTotalCases(latestCases);
				int prevCases = Integer.parseInt(record.get(record.size()-2));
				l.setDiffFromPrevDay(prevCases);
				newStats.add(l);
			}
//			newStats.forEach(System.out::println);
			stats = newStats;
		 } catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }

	public List<LocationStats> getAllStats() {
		return stats;
	}
}
