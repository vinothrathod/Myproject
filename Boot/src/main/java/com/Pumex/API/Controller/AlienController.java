package com.Pumex.API.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Pumex.API.dao.AlienRepo;
import com.Pumex.API.model.Alien;

//@Controller
@RestController
public class AlienController {

	@Autowired
	 AlienRepo repo;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	
	
	
	
	
	//--------- http://localhost:8080/h2-console run file-------------
	
	
	
	
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien)
//	{
//		repo.save(alien);
//		return "home.jsp";
//	}
//	------------- http://localhost:8080/alien  GreaterThan datas-----------------
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid)
//	{
//		ModelAndView mv=new ModelAndView("showAlien.jsp");
//		Alien alien =repo.findById(aid).orElse(new Alien());
//	
//		System.out.println(repo.findByTech("Java"));
//		System.out.println(repo.findByAidGreaterThan(102));
//		System.out.println(repo.findByTechSorted("Java"));
//		
//		mv.addObject(alien);
//		return mv;
//	}
	
	
	
//	---------------rest  api all the data for http://localhost:8080/aliens-------------
	
//	@RequestMapping("/aliens")
//	@ResponseBody
//	public String getAliens () {
//		
//		return repo.findAll().toString();
//	}
	
	
//	 only one data  we can store http://localhost:8080/alien/102
	
//	@RequestMapping("/alien/102")
//	@ResponseBody
//	public String getAlien () {
//		
//		return repo.findById(102).toString();
//	}
//	
	
//	all the values http://localhost:8080/alien/101,http://localhost:8080/alien/102
	
	
//	@RequestMapping("/alien/{aid}")
//	@ResponseBody
//	public String getAlien(@PathVariable("aid") int aid) {
//		
//		return repo.findById(aid).toString();
//	}
	
//	-----same format will be come-{"aid":104,"aname":"Komal","tech":"Html"}-------------
//	@RequestMapping("/aliens")
//	@ResponseBody
//	public List<Alien> getAliens() {
//		
//		return repo.findAll();
//	}
//	
//	@RequestMapping("/alien/{aid}")
//	@ResponseBody
//	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
//		
//		return repo.findById(aid);
//	
//	}
	
//	-------postman--------
	
//	-------------postman xml file  Get link -------------
//	@RequestMapping(path="/aliens", produces= {"application/xml"})
//	@ResponseBody
//	public List<Alien> getAliens() {
//		
//		return repo.findAll();
//	}
//	
//	@RequestMapping("/alien/{aid}")
//	@ResponseBody
//	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
//		
//		return repo.findById(aid);
//	
//	}
	
	
	
	

	
//			--------------------POST method------------------
	
//	@PostMapping("/alien")
//	public Alien addAlien(@RequestBody Alien alien)
//	{
//		repo.save(alien);
//		return alien;
//	}
	
//	-------------postman json file  Get link -------------
	
//	@PostMapping(path="/alien",consumes= {"application/json"})
//	public Alien addAlien(@RequestBody Alien alien)
//	{
//		repo.save(alien);
//		return alien;
//	}
//	
//	@GetMapping(path="/aliens")
//	public List<Alien> getAliens() {
//		
//		return repo.findAll();
//	}
//	
//	@RequestMapping("/alien/{aid}")
//	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
//		
//		return repo.findById(aid);
//	
//	}
	
	
	
	
//	------------DELETE method-------------
	
	
//	@DeleteMapping("/alien/{aid}")
//	public String deleteAlien(@PathVariable int aid)
//	{
//		Alien a = repo.getOne(aid);
//		
//		repo.delete(a);
//		
//		return "delete";
//	}
//	
//	
//	@PostMapping(path="/alien",consumes= {"application/json"})
//	public Alien addAlien(@RequestBody Alien alien)
//	{
//		repo.save(alien);
//		return alien;
//	}
//	
//	@GetMapping(path="/aliens")
//	public List<Alien> getAliens() {
//		
//		return repo.findAll();
//	}
//	
//	@RequestMapping("/alien/{aid}")
//	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
//		
//		return repo.findById(aid);
//	
//	}
	
//	--------PUT method-------
	
	
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid)
	{
		Alien a = repo.getOne(aid);
		
		repo.delete(a);
		
		return "delete";
	}
	
	@PostMapping(path="/alien",consumes= {"application/json"})
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	
	@GetMapping(path="/aliens")
	public List<Alien> getAliens() {
		
		return repo.findAll();
	}
	
	
	@PutMapping(path="/alien",consumes= {"application/json"})
	public Alien saveOrUpdateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		
		return repo.findById(aid);
	
	}
}
