package com.dardo.converters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class DocumentHttpMessageConverter implements
		HttpMessageConverter<Document> {

	@Override
	public boolean canRead(Class<?> clazz, MediaType mediaType) {
		if(clazz.equals(Document.class))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean canWrite(Class<?> clazz, MediaType mediaType) {
		return true;
	}

	@Override
	public List<MediaType> getSupportedMediaTypes() {
		List<MediaType> mediaTypes = new ArrayList<MediaType>();
		mediaTypes.add(MediaType.TEXT_XML);
		mediaTypes.add(MediaType.APPLICATION_XML);
		return mediaTypes;
	}

	@Override
	public Document read(Class<? extends Document> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException
	{
		SAXBuilder builder = new SAXBuilder();
		try 
		{
			return builder.build(inputMessage.getBody());
		} 
		catch (JDOMException e) 
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void write(Document t, MediaType contentType,
			HttpOutputMessage outputMessage) throws IOException,
			HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		
	}

}
