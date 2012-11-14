package com.dardo.eve.ws;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Namespace;
import org.jdom2.transform.JDOMSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.dardo.jaxb.CharacterSheetApiType;
import com.dardo.jaxb.CharactersApiType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/test/resources/spring/test-applicationContext.xml")
public class IntegrationTestWebServiceCalls {
	
	@Autowired
	private RestTemplate template;

	@Autowired
	private Jaxb2Marshaller marshaller;
	
	@Test
	public void testInject()
	{
		assertNotNull(template);
	}
	
	@Test
	public void testQueryWebService_Characters()
	{
		Map<String, String> urlVariables = new HashMap<String, String>();
		urlVariables.put("keyID", "1474555");
		urlVariables.put("vCode", "vLFuBzZtp0AMy3V8kiCkErrxFVRHRsYTbR58ZC5vV1z9k6G5k7OYaQs1W1kjKenH");
		ResponseEntity<Document> response = template.getForEntity("https://api.eveonline.com/account/Characters.xml.aspx?keyID={keyID}&vCode={vCode}", Document.class, urlVariables);
		Document docResponse = response.getBody();
		docResponse.getRootElement().setNamespace(Namespace.getNamespace("http://dardo.com/eve-api/characters"));
		CharactersApiType characters = (CharactersApiType)marshaller.unmarshal(new JDOMSource(docResponse));
		assertNotNull(characters);
	}
	
	@Test
	public void testQueryWebService_CharacterSheet()
	{
		String url = "https://api.eveonline.com/char/CharacterSheet.xml.aspx?keyID={keyID}&vCode={vCode}&characterID{characterID}";
		Map<String, String> urlVariables = new HashMap<String, String>();
		urlVariables.put("keyID", "1474555");
		urlVariables.put("vCode", "vLFuBzZtp0AMy3V8kiCkErrxFVRHRsYTbR58ZC5vV1z9k6G5k7OYaQs1W1kjKenH");
		urlVariables.put("characterID", "92596673");
		ResponseEntity<Document> response = template.getForEntity(url, Document.class, urlVariables);
		Document docResponse = response.getBody();
		docResponse.getRootElement().setNamespace(Namespace.getNamespace("http://dardo.com/eve-api/characterSheet"));
		CharacterSheetApiType sheet = (CharacterSheetApiType)marshaller.unmarshal(new JDOMSource(docResponse));
		assertNotNull(sheet);
	}
}
