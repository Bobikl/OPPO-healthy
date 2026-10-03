package com.oplus.aiunit.vision;

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.scilab.forge.jlatexmath.ResourceParseException;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes11.dex */
public class upj {
    public static final String CHARTODEL_MAPPING_EL = "Map";
    public static final String RESOURCE_NAME = "TeXFormulaSettings.xml";
    public Element a;

    public upj() throws ResourceParseException {
        this(pha.b(RESOURCE_NAME), RESOURCE_NAME);
    }

    public static void a(NodeList nodeList, String[] strArr, String[] strArr2) throws ResourceParseException {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String attribute = element.getAttribute("char");
            String attribute2 = element.getAttribute("formula");
            String attribute3 = element.getAttribute("text");
            if (attribute.equals("")) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "char", null);
            }
            if (attribute2.equals("")) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "formula", null);
            }
            if (attribute.length() != 1) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "char", "must have a value that contains exactly 1 character!");
            }
            strArr[attribute.charAt(0)] = attribute2;
            if (strArr2 != null && !attribute3.equals("")) {
                strArr2[attribute.charAt(0)] = attribute3;
            }
        }
    }

    public static void b(NodeList nodeList, String[] strArr, String[] strArr2) throws ResourceParseException {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String attribute = element.getAttribute("char");
            String attribute2 = element.getAttribute("symbol");
            String attribute3 = element.getAttribute("text");
            if (attribute.equals("")) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "char", null);
            }
            if (attribute2.equals("")) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "symbol", null);
            }
            if (attribute.length() != 1) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "char", "must have a value that contains exactly 1 character!");
            }
            strArr[attribute.charAt(0)] = attribute2;
            if (strArr2 != null && !attribute3.equals("")) {
                strArr2[attribute.charAt(0)] = attribute3;
            }
        }
    }

    public void c(String[] strArr, String[] strArr2) throws ResourceParseException {
        Element element = (Element) this.a.getElementsByTagName("CharacterToSymbolMappings").item(0);
        if (element != null) {
            b(element.getElementsByTagName(CHARTODEL_MAPPING_EL), strArr, strArr2);
        }
    }

    public void d(String[] strArr, String[] strArr2) throws ResourceParseException {
        Element element = (Element) this.a.getElementsByTagName("CharacterToFormulaMappings").item(0);
        if (element != null) {
            a(element.getElementsByTagName(CHARTODEL_MAPPING_EL), strArr, strArr2);
        }
    }

    public upj(InputStream inputStream, String str) throws ResourceParseException {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.a = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e2) {
            throw new XMLResourceParseException(str, e2);
        }
    }
}
