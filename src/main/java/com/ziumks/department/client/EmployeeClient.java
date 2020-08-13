package com.ziumks.department.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ziumks.department.model.Employee;

@Service
public class EmployeeClient {

	public List<Employee> findByDepartment(Long departemntId)  {

		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:" + 8082 + "/employee/department/" + departemntId;

		ResponseEntity<Employee[]> response = restTemplate.getForEntity(baseUrl, Employee[].class);
		return Arrays.asList(response.getBody());
	}
}
