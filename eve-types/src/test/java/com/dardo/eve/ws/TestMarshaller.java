package com.dardo.eve.ws;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.jdom2.transform.JDOMSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dardo.jaxb.CharacterSheetApiType;
import com.dardo.jaxb.CharactersApiType;
import com.dardo.jaxb.IndustryJobApiType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/test/resources/spring/test-applicationContext.xml")
public class TestMarshaller {

	@Autowired
	private Jaxb2Marshaller marshaller;
		
	@Test
	public void testInject()
	{
		assertNotNull(marshaller);
	}
	
	@Test
	public void testMarshalIndustryJob() throws JDOMException, IOException
	{
		SAXBuilder builder = new SAXBuilder();
		Document retVal = builder.build(new ClassPathResource("responseXml/IndustryJobs.xml").getInputStream());
		retVal.getRootElement().setNamespace(Namespace.getNamespace("http://dardo.com/eve-api/industryJob"));
		IndustryJobApiType unmarshalledObj = (IndustryJobApiType)marshaller.unmarshal(new JDOMSource(retVal));
		assertNotNull(unmarshalledObj);
		assertEquals((Integer)37051255, unmarshalledObj.getResult().getRowset().getRow().get(0).getJobID());
	}

	@Test
	public void testMarshalCharacterSheet() throws JDOMException, IOException
	{
		SAXBuilder builder = new SAXBuilder();
		Document retVal = builder.build(new ClassPathResource("responseXml/CharacterSheet.xml").getInputStream());
		retVal.getRootElement().setNamespace(Namespace.getNamespace("http://dardo.com/eve-api/characterSheet"));
		CharacterSheetApiType unmarshalledObj = (CharacterSheetApiType)marshaller.unmarshal(new JDOMSource(retVal));
		assertNotNull(unmarshalledObj);
		assertEquals("Gummi Test1", unmarshalledObj.getResult().getName());
	}
	
	@Test
	public void testMarshalCharacters() throws JDOMException, IOException
	{
		SAXBuilder builder = new SAXBuilder();
		Document retVal = builder.build(new ClassPathResource("responseXml/Characters.xml").getInputStream());
		retVal.getRootElement().setNamespace(Namespace.getNamespace("http://dardo.com/eve-api/characters"));
		CharactersApiType unmarshalledObj = (CharactersApiType)marshaller.unmarshal(new JDOMSource(retVal));
		assertNotNull(unmarshalledObj);
	}
}
