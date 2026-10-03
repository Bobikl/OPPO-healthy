package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.scilab.forge.jlatexmath.ResourceParseException;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes11.dex */
public class xpj {
    public static final String DELIMITER_ATTR = "del";
    public static final String RESOURCE_NAME = "TeXSymbols.xml";
    public static final String TYPE_ATTR = "type";
    public static Map<String, Integer> b = new HashMap();
    public Element a;

    public xpj() throws ResourceParseException {
        this(pha.b(RESOURCE_NAME), RESOURCE_NAME);
    }

    public static String a(String str, Element element) throws ResourceParseException {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), str, null);
        }
        return attribute;
    }

    public Map<String, t6j> b() throws ResourceParseException {
        HashMap map = new HashMap();
        NodeList elementsByTagName = this.a.getElementsByTagName("Symbol");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
            String strA = a("name", element);
            String strA2 = a("type", element);
            String attribute = element.getAttribute("del");
            boolean z = attribute != null && attribute.equals(SpeechConstant.TRUE_STR);
            Integer num = b.get(strA2);
            if (num == null) {
                throw new XMLResourceParseException(RESOURCE_NAME, "Symbol", "type", "has an unknown value '" + strA2 + "'!");
            }
            map.put(strA, new t6j(strA, num.intValue(), z));
        }
        return map;
    }

    public final void c() {
        b.put("ord", 0);
        b.put("op", 1);
        b.put("bin", 2);
        b.put("rel", 3);
        b.put("open", 4);
        b.put("close", 5);
        b.put("punct", 6);
        b.put("acc", 10);
    }

    public xpj(InputStream inputStream, String str) throws ResourceParseException {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.a = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
            c();
        } catch (Exception e2) {
            throw new XMLResourceParseException(str, e2);
        }
    }
}
