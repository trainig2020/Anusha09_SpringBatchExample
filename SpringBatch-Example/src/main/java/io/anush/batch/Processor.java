package io.anush.batch;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import io.anush.model.Person;

@Component
public class Processor implements ItemProcessor<Person, Person> {

	@Override
	public Person process(Person person) throws Exception {
		person.setTime(new Date());
		System.out.println("entered into the processor");
		return person;
	}

}