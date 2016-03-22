package service;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.Company;
import model.Feedback;
import model.User;
import model.XmlDatabase;

public class ReadXMLFile {

	private static final String BOOKSTORE_XML = "./feedback-jaxb.xml";
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

 

		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		
		Company company1 = new Company();
		Company company2= new Company();
		Company company3= new Company();
		Company company4 = new Company();
		
		Feedback feedback = new Feedback();
		XmlDatabase xmlDatabase = new XmlDatabase();

		List<User> users = new LinkedList<User>();
		List<Company> companies = new LinkedList<Company>();
		List<Feedback> feedbacks = new LinkedList<Feedback>();

		// Create XML
		
		// add users to MS
		
		/*
		user1.setUsername("7053");
		user1.setUserRole("student");
		user1.setUserBranch("COMPS");
		user1.setFeedback("very good");
		users.add(user1);

		user2.setUsername("7059");
		user2.setUserRole("student");
		user2.setUserBranch("COMPS");
		user2.setFeedback("Not that good");
		users.add(user2);

		company1.setCompanyId("001");
		company1.setCompanyName("MS");
		company1.setUsers(users);
		companies.add(company1);

		// add users to JP
		user3.setUsername("7058");
		user3.setUserRole("student");
		user3.setUserBranch("COMPS");
		user3.setFeedback("very good");
		users.add(user3);

		user4.setUsername("7059");
		user4.setUserRole("student");
		user4.setUserBranch("IT");
		user4.setFeedback(" that good");
		users.add(user4);

		company2.setCompanyId("002");
		company2.setCompanyName("JP");
		company2.setUsers(users);
		companies.add(company2);

		feedback.setYear(2016);
		feedback.setCompanies(companies);
		feedbacks.add(feedback);

		xmlDatabase.setFeedbacks(feedbacks);

		// create JAXB context and instantiate marshaller
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(XmlDatabase.class);
		
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write to System.out
		m.marshal(xmlDatabase, System.out);

		// Write to File
		m.marshal(xmlDatabase, new File(BOOKSTORE_XML));
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//*/
		
		// Modify XML
				
		user1.setUsername("7053");
		user1.setUserRole("student");
		user1.setUserBranch("COMPS");
		user1.setFeedback("very good");
		users.add(user1);

		user2.setUsername("7059");
		user2.setUserRole("student");
		user2.setUserBranch("COMPS");
		user2.setFeedback("Not that good");
		users.add(user2);

		company1.setCompanyId("001");
		company1.setCompanyName("MS");
		company1.setUsers(users);
		companies.add(company1);

		// add users to JP
		user3.setUsername("7058");
		user3.setUserRole("student");
		user3.setUserBranch("COMPS");
		user3.setFeedback("very good");
		users.add(user3);

		user4.setUsername("7059");
		user4.setUserRole("student");
		user4.setUserBranch("IT");
		user4.setFeedback(" that good");
		users.add(user4);

		company2.setCompanyId("002");
		company2.setCompanyName("JP");
		company2.setUsers(users);
		companies.add(company2);

		feedback.setYear(2016);
		feedback.setCompanies(companies);
		feedbacks.add(feedback);

		xmlDatabase.setFeedbacks(feedbacks);

		// create JAXB context and instantiate marshaller
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(XmlDatabase.class);
		
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write to System.out
		m.marshal(xmlDatabase, System.out);

		// Write to File
		m.marshal(xmlDatabase, new File(BOOKSTORE_XML));
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	

}
