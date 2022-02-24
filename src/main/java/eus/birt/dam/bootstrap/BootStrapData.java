package eus.birt.dam.bootstrap;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//Simport org.springframework.boot.autoconfigure.data.redis.RedisProperties.Lettuce.Cluster.Refresh;
import org.springframework.stereotype.Component;

import eus.birt.dam.domain.Address;
import eus.birt.dam.domain.Student;
import eus.birt.dam.repository.StudentRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Transactional
	@Override
	public void run (String...arg0) throws Exception {
		

		/* Tarea a
		Address address1 = new Address("calle1","calle2","Bilbao","01013");		
		Student estudiante1 = new Student(1,"Aitor", "Perez","aiper@gmail.com",address1);		
		
		studentRepository.save(estudiante1);
		*/
		
		/* Tarea b
		Address address1 = new Address("calle1","calle2","Bilbao","01013");		
		Student estudiante1 = new Student(1,"Aitor", "Perez","aiper@gmail.com",address1);
		estudiante1.getPhones().add("712123456");
		estudiante1.getPhones().add("712123457");
		
		studentRepository.save(estudiante1);
		*/
		
		//Tarea c
		
		Address address1 = new Address("calle1","calle2","Bilbao","01013");	
		Student estudiante1 = new Student(1,"Aitor", "Perez","aiper@gmail.com",address1);
		estudiante1.getPhones().add("712123456");
		estudiante1.getPhones().add("712123457");
		estudiante1.setBirthdate(LocalDate.parse("1989-04-04"));
		
		
		studentRepository.save(estudiante1);
		
	}
}
