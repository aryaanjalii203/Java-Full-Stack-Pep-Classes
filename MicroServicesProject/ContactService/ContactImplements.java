package com.Contact.ContactService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class ContactImplements implements ContactServiceInterface{
	List<Contact> list=List.of(
			new Contact(201L, "IssarSingh08@gmail.com","Anjali", 101L),
			new Contact(202L, "aryasanjay2032gmail.com","Arya", 102L),
			new Contact(203L, "Aryaanjali203@gmail.com","xyz", 103L),
			new Contact(204L, "rdarya203@gmail.com","abc", 104L)
			);

	@Override
	public List<Contact> getContactofUser(Long id) {
		return list.stream().filter(contact->contact.getUserId().equals(id)).collect(Collectors.toList());
	}
	
	
}
