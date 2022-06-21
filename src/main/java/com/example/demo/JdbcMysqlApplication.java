package com.example.demo;




import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;




@SpringBootApplication
public class JdbcMysqlApplication implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(JdbcMysqlApplication.class, args);
		System.out.println("Hello");
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*String sql="Insert into student (Rollno,name) values (?,?)";
		int result = jdbcTemplate.update(sql,"2","Gayatri");
		if(result > 0)
		{
			System.out.println("A row is inserted");
		}*/
		List<Student> list=getAllEmployeesRowMapper();  
	     
	    for(Student e:list)  
	        System.out.println(e);  
	}
	public List<Student> getAllEmployeesRowMapper(){  
		 return jdbcTemplate.query("select * from student",new RowMapper<Student>(){  
		   
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student e=new Student();  
		        e.setRollno(rs.getInt("Rollno"));  
		        e.setName(rs.getString("name"));  
		       
				return e;
			}  
		    });  
	
}
}