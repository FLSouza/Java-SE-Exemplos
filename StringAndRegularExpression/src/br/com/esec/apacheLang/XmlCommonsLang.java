package br.com.esec.apacheLang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.lang3.StringUtils;

public class XmlCommonsLang {
	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		StringBuilder content = null;
		List<String> parents = new ArrayList<>();
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("food.xml"));

		while (reader.hasNext()) {
			int event = reader.next();

			switch (event) {
			case XMLStreamConstants.START_ELEMENT:
				content = new StringBuilder();
				if (!"config".equalsIgnoreCase(reader.getLocalName())) {
					parents.add(reader.getLocalName());
				}
				break;

			case XMLStreamConstants.CHARACTERS:
				if (content != null) {
					content.append(reader.getText().trim());
				}
				break;

			case XMLStreamConstants.END_ELEMENT:
				if (content != null) {
					System.out.println(StringUtils.join(parents, '.') + "=" + content.toString());
				}
				parents.remove(reader.getLocalName());
				content = null;
				break;

			case XMLStreamConstants.START_DOCUMENT:
				break;
			}

		}
	}

}
