package io.anush.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.anush.model.Person;
import io.anush.repository.PersonRepository;

@Component
public class DBWriter implements ItemWriter<Person> {
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void write(List<? extends Person> persons) throws Exception {

		System.out.println("Data Saved for Persons: " + persons);
		personRepository.saveAll(persons);

	}

}