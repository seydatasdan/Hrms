package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController  //kullandığımız api ın controllerr i olduğunu belirtiyor
@RequestMapping("/api/jobpositions")

public class JobPosiitionsController {
	private JobPositionService jobPositionService;

	@Autowired
	public JobPosiitionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return jobPositionService.getAll();
	}

}
