package com.ying.mybatis.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.InputStream;

public class DocumentUtils {

	public static Document loadDocument(InputStream inputStream) {
		try {
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(inputStream);
			return document;
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return null;
	}

}
