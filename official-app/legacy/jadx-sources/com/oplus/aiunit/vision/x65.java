package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.deviceui.BatteryView;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.scilab.forge.jlatexmath.FontAlreadyLoadedException;
import org.scilab.forge.jlatexmath.ResourceParseException;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes11.dex */
public class x65 {
    public static final String GEN_SET_EL = "GeneralSettings";
    public static final String MUFONTID_ATTR = "mufontid";
    public static final String RESOURCE_NAME = "DefaultTeXFont.xml";
    public static final String SPACEFONTID_ATTR = "spacefontid";
    public static final String STYLE_MAPPING_EL = "TextStyleMapping";
    public static final String SYMBOL_MAPPING_EL = "SymbolMapping";
    public static DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ArrayList<String> f18509e = new ArrayList<>();
    public static Map<String, Integer> f = new HashMap();
    public static Map<String, a> g = new HashMap();
    public Map<String, x73[]> a;
    public Element b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18510c;

    public interface a {
        void a(Element element, char c2, lw7 lw7Var) throws XMLResourceParseException;
    }

    public static class b implements a {
        @Override // com.oplus.aiunit.vision.x65.a
        public void a(Element element, char c2, lw7 lw7Var) throws ResourceParseException {
            lw7Var.u(c2, new int[]{x65.g("top", element, -1), x65.g("mid", element, -1), x65.e("rep", element), x65.g("bot", element, -1)});
        }
    }

    public static class c implements a {
        @Override // com.oplus.aiunit.vision.x65.a
        public void a(Element element, char c2, lw7 lw7Var) throws ResourceParseException {
            lw7Var.a(c2, (char) x65.e("code", element), x65.d("val", element));
        }
    }

    public static class d implements a {
        @Override // com.oplus.aiunit.vision.x65.a
        public void a(Element element, char c2, lw7 lw7Var) throws ResourceParseException {
            lw7Var.b(c2, (char) x65.e("code", element), (char) x65.e("ligCode", element));
        }
    }

    public static class e implements a {
        @Override // com.oplus.aiunit.vision.x65.a
        public void a(Element element, char c2, lw7 lw7Var) throws ResourceParseException {
            lw7Var.x(c2, (char) x65.e("code", element), x65.f18509e.indexOf(x65.c("fontId", element)));
        }
    }

    static {
        s();
        r();
    }

    public x65() throws ResourceParseException {
        this(pha.b(RESOURCE_NAME), RESOURCE_NAME);
    }

    public static bw7 b(@NonNull String str) {
        return bw7.b(pha.d(str), tpj.PIXELS_PER_POINT * tpj.FONT_SCALE_FACTOR);
    }

    public static String c(String str, Element element) throws ResourceParseException {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), str, null);
        }
        return attribute;
    }

    public static float d(String str, Element element) throws ResourceParseException {
        try {
            return (float) Double.parseDouble(c(str, element));
        } catch (NumberFormatException unused) {
            throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), str, "has an invalid real value!");
        }
    }

    public static int e(String str, Element element) throws ResourceParseException {
        try {
            return Integer.parseInt(c(str, element));
        } catch (NumberFormatException unused) {
            throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), str, "has an invalid integer value!");
        }
    }

    public static float f(String str, Element element, float f2) throws ResourceParseException {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            return f2;
        }
        try {
            return (float) Double.parseDouble(attribute);
        } catch (NumberFormatException unused) {
            throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), str, "has an invalid float value!");
        }
    }

    public static int g(String str, Element element, int i) throws ResourceParseException {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            return i;
        }
        try {
            return Integer.parseInt(attribute);
        } catch (NumberFormatException unused) {
            throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), str, "has an invalid integer value!");
        }
    }

    public static void q(Element element, lw7 lw7Var) throws ResourceParseException {
        char cE = (char) e("code", element);
        lw7Var.w(cE, new float[]{f(Fields.WIDTH_FIELD, element, 0.0f), f(Fields.HEIGHT_FIELD, element, 0.0f), f("depth", element, 0.0f), f(TextEntity.TYPEFACE_STYLE_ITALIC, element, 0.0f)});
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() != 3) {
                Element element2 = (Element) nodeItem;
                a aVar = g.get(element2.getTagName());
                if (aVar == null) {
                    throw new XMLResourceParseException("DefaultTeXFont.xml: a <Char>-element has an unknown child element '" + element2.getTagName() + "'!");
                }
                aVar.a(element2, cE, lw7Var);
            }
        }
    }

    public static void r() {
        g.put("Kern", new c());
        g.put("Lig", new d());
        g.put("NextLarger", new e());
        g.put("Extension", new b());
    }

    public static void s() {
        f.put("numbers", 0);
        f.put("capitals", 1);
        f.put(BatteryView.STYLE_SMALL, 2);
        f.put("unicode", 3);
    }

    public String[] h() throws ResourceParseException {
        String[] strArr = new String[4];
        Element element = (Element) this.b.getElementsByTagName("DefaultTextStyleMapping").item(0);
        if (element == null) {
            return strArr;
        }
        NodeList elementsByTagName = element.getElementsByTagName("MapStyle");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element2 = (Element) elementsByTagName.item(i);
            String strC = c("code", element2);
            Integer num = f.get(strC);
            if (num == null) {
                throw new XMLResourceParseException(RESOURCE_NAME, "MapStyle", "code", "contains an unknown \"range name\" '" + strC + "'!");
            }
            String strC2 = c(ParserTag.TAG_TEXT_STYLE, element2);
            if (this.a.get(strC2) == null) {
                throw new XMLResourceParseException(RESOURCE_NAME, "MapStyle", ParserTag.TAG_TEXT_STYLE, "contains an unknown text style '" + strC2 + "'!");
            }
            x73[] x73VarArr = this.a.get(strC2);
            int iIntValue = num.intValue();
            if (x73VarArr[iIntValue] == null) {
                throw new XMLResourceParseException("DefaultTeXFont.xml: the default text style mapping '" + strC2 + "' for the range '" + strC + "' contains no mapping for that range!");
            }
            strArr[iIntValue] = strC2;
        }
        return strArr;
    }

    public void i() throws ResourceParseException {
        Element element = (Element) this.b.getElementsByTagName("TeXSymbols").item(0);
        if (element != null) {
            String strC = c("include", element);
            t6j.m(pha.b(strC), strC);
        }
        Element element2 = (Element) this.b.getElementsByTagName("FormulaSettings").item(0);
        if (element2 != null) {
            String strC2 = c("include", element2);
            tpj.g(pha.b(strC2), strC2);
        }
    }

    public lw7[] j(lw7[] lw7VarArr) throws ResourceParseException {
        Element element = (Element) this.b.getElementsByTagName("FontDescriptions").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Metrics");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                String strC = c("include", (Element) elementsByTagName.item(i));
                lw7VarArr = this.f18510c == null ? k(lw7VarArr, pha.b(strC), strC) : k(lw7VarArr, pha.b(strC), strC);
            }
        }
        return lw7VarArr;
    }

    public lw7[] k(lw7[] lw7VarArr, InputStream inputStream, String str) throws ResourceParseException {
        String strC;
        String strC2;
        String strC3;
        String strC4;
        if (inputStream == null) {
            return lw7VarArr;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(lw7VarArr));
        try {
            Element documentElement = d.newDocumentBuilder().parse(inputStream).getDocumentElement();
            String strC5 = c("name", documentElement);
            String strC6 = c("id", documentElement);
            if (f18509e.indexOf(strC6) >= 0) {
                throw new FontAlreadyLoadedException("Font " + strC6 + " is already loaded !");
            }
            f18509e.add(strC6);
            float fD = d("space", documentElement);
            float fD2 = d("xHeight", documentElement);
            float fD3 = d("quad", documentElement);
            int iG = g("skewChar", documentElement, -1);
            int iG2 = g("unicode", documentElement, 0);
            String strC7 = null;
            try {
                strC = c("boldVersion", documentElement);
            } catch (ResourceParseException unused) {
                strC = null;
            }
            try {
                strC2 = c("romanVersion", documentElement);
            } catch (ResourceParseException unused2) {
                strC2 = null;
            }
            try {
                strC3 = c("ssVersion", documentElement);
            } catch (ResourceParseException unused3) {
                strC3 = null;
            }
            try {
                strC4 = c("ttVersion", documentElement);
            } catch (ResourceParseException unused4) {
                strC4 = null;
            }
            try {
                strC7 = c("itVersion", documentElement);
            } catch (ResourceParseException unused5) {
            }
            lw7 lw7Var = new lw7(f18509e.indexOf(strC6), this.f18510c, str.substring(0, str.lastIndexOf("/") + 1) + strC5, strC5, iG2, fD2, fD, fD3, strC, strC2, strC3, strC4, strC7);
            if (iG != -1) {
                lw7Var.z((char) iG);
            }
            NodeList elementsByTagName = documentElement.getElementsByTagName("Char");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                q((Element) elementsByTagName.item(i), lw7Var);
            }
            arrayList.add(lw7Var);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                lw7 lw7Var2 = (lw7) arrayList.get(i2);
                lw7Var2.t(f18509e.indexOf(lw7Var2.u));
                lw7Var2.y(f18509e.indexOf(lw7Var2.v));
                lw7Var2.A(f18509e.indexOf(lw7Var2.w));
                lw7Var2.B(f18509e.indexOf(lw7Var2.x));
                lw7Var2.v(f18509e.indexOf(lw7Var2.y));
            }
            this.a = n();
            return (lw7[]) arrayList.toArray(lw7VarArr);
        } catch (Exception e2) {
            throw new XMLResourceParseException("Cannot find the file " + str + "!" + e2.toString());
        }
    }

    public Map<String, Number> l() throws ResourceParseException {
        HashMap map = new HashMap();
        Element element = (Element) this.b.getElementsByTagName(GEN_SET_EL).item(0);
        if (element == null) {
            throw new XMLResourceParseException(RESOURCE_NAME, GEN_SET_EL);
        }
        map.put(MUFONTID_ATTR, Integer.valueOf(f18509e.indexOf(c(MUFONTID_ATTR, element))));
        map.put(SPACEFONTID_ATTR, Integer.valueOf(f18509e.indexOf(c(SPACEFONTID_ATTR, element))));
        map.put("scriptfactor", Float.valueOf(d("scriptfactor", element)));
        map.put("scriptscriptfactor", Float.valueOf(d("scriptscriptfactor", element)));
        return map;
    }

    public Map<String, Float> m() throws ResourceParseException {
        HashMap map = new HashMap();
        Element element = (Element) this.b.getElementsByTagName("Parameters").item(0);
        if (element == null) {
            throw new XMLResourceParseException(RESOURCE_NAME, "Parameters");
        }
        NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            String name = ((Attr) attributes.item(i)).getName();
            map.put(name, new Float(d(name, element)));
        }
        return map;
    }

    public final Map<String, x73[]> n() throws ResourceParseException {
        String strC;
        HashMap map = new HashMap();
        Element element = (Element) this.b.getElementsByTagName("TextStyleMappings").item(0);
        if (element == null) {
            return map;
        }
        NodeList elementsByTagName = element.getElementsByTagName(STYLE_MAPPING_EL);
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element2 = (Element) elementsByTagName.item(i);
            String strC2 = c("name", element2);
            try {
                strC = c(TextEntity.TYPEFACE_STYLE_BOLD, element2);
            } catch (ResourceParseException unused) {
                strC = null;
            }
            NodeList elementsByTagName2 = element2.getElementsByTagName("MapRange");
            x73[] x73VarArr = new x73[4];
            for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                Element element3 = (Element) elementsByTagName2.item(i2);
                String strC3 = c("fontId", element3);
                int iE = e("start", element3);
                String strC4 = c("code", element3);
                Integer num = f.get(strC4);
                if (num == null) {
                    throw new XMLResourceParseException(RESOURCE_NAME, "MapRange", "code", "contains an unknown \"range name\" '" + strC4 + "'!");
                }
                if (strC == null) {
                    x73VarArr[num.intValue()] = new x73((char) iE, f18509e.indexOf(strC3));
                } else {
                    x73VarArr[num.intValue()] = new x73((char) iE, f18509e.indexOf(strC3), f18509e.indexOf(strC));
                }
            }
            map.put(strC2, x73VarArr);
        }
        return map;
    }

    public Map<String, x73> o() throws ResourceParseException {
        String strC;
        HashMap map = new HashMap();
        Element element = (Element) this.b.getElementsByTagName("SymbolMappings").item(0);
        if (element == null) {
            throw new XMLResourceParseException(RESOURCE_NAME, "SymbolMappings");
        }
        NodeList elementsByTagName = element.getElementsByTagName("Mapping");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            String strC2 = c("include", (Element) elementsByTagName.item(i));
            try {
                NodeList elementsByTagName2 = (this.f18510c == null ? d.newDocumentBuilder().parse(pha.b(strC2)).getDocumentElement() : d.newDocumentBuilder().parse(pha.b(strC2)).getDocumentElement()).getElementsByTagName(SYMBOL_MAPPING_EL);
                for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                    Element element2 = (Element) elementsByTagName2.item(i2);
                    String strC3 = c("name", element2);
                    int iE = e(dj8.CHANNEL, element2);
                    String strC4 = c("fontId", element2);
                    try {
                        strC = c("boldId", element2);
                    } catch (ResourceParseException unused) {
                        strC = null;
                    }
                    if (strC == null) {
                        map.put(strC3, new x73((char) iE, f18509e.indexOf(strC4)));
                    } else {
                        map.put(strC3, new x73((char) iE, f18509e.indexOf(strC4), f18509e.indexOf(strC)));
                    }
                }
            } catch (Exception unused2) {
                throw new XMLResourceParseException("Cannot find the file " + strC2 + "!");
            }
        }
        return map;
    }

    public Map<String, x73[]> p() {
        return this.a;
    }

    public x65(InputStream inputStream, String str) throws ResourceParseException {
        this.f18510c = null;
        d.setIgnoringElementContentWhitespace(true);
        d.setIgnoringComments(true);
        try {
            this.b = d.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e2) {
            throw new XMLResourceParseException(str, e2);
        }
    }

    public x65(Object obj, InputStream inputStream, String str) throws ResourceParseException {
        this.f18510c = obj;
        d.setIgnoringElementContentWhitespace(true);
        d.setIgnoringComments(true);
        try {
            this.b = d.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e2) {
            throw new XMLResourceParseException(str, e2);
        }
    }
}
