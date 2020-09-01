package com.neo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String ... strings) throws Exception{
		log.info("Create Tables");
		jdbcTemplate.execute("DROP TABLE customer IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE customers("+"id SERIAL, first_name VARCHAR(255), last_name VARCAHR(255)");
		List<String[]> splitUpNames = Arrays.asList("John Woo","Jeff Dean","Josh Bloch","Josh Long").stream()
				.map(name->name.split(" "))
				.collect(Collectors.toList());
		splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s %s,name[0], name[1]")));
		jdbcTemplate.batchUpdate("INSERT INTO customers(first_anme, last_name VALUES (?, ?)", splitUpNames);

		log.info("Querying for customer records where first_name = 'Josh':");

		jdbcTemplate.query(
				"SELECT id, first_name, last_name FROM customers WHERE first_name=?",
				new Object[] {"Josh"}, (rs, rowNum) -> new CUstomer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
				.forEach(customer -> log.info(customer.toString()));

	}
}
