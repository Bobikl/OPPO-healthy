package com.oplus.aiunit.vision;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.scilab.forge.jlatexmath.ResourceParseException;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes11.dex */
public class w78 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u78[] f18149c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Element f18150e;
    public final Map<String, Integer> a = new HashMap();
    public final Map<String, Integer> b = new HashMap();
    public final Map<String, Integer> d = new HashMap();

    public w78() throws ResourceParseException {
        try {
            h();
            g();
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.f18150e = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(pha.b("GlueSettings.xml")).getDocumentElement();
            f();
        } catch (Exception e2) {
            throw new XMLResourceParseException("GlueSettings.xml", e2);
        }
    }

    public static void a(Object obj, String str, String str2, String str3) throws ResourceParseException {
        if (obj != null) {
            return;
        }
        throw new XMLResourceParseException("GlueSettings.xml", str, str2, "has an unknown value '" + str3 + "'!");
    }

    public static String d(String str, Element element) throws ResourceParseException {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException("GlueSettings.xml", element.getTagName(), str, null);
        }
        return attribute;
    }

    public final u78 b(Element element, String str) throws ResourceParseException {
        String[] strArr = {"space", "stretch", "shrink"};
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            try {
                String attribute = element.getAttribute(strArr[i]);
                fArr[i] = (float) (!attribute.equals("") ? Double.parseDouble(attribute) : 0.0d);
            } catch (NumberFormatException unused) {
                throw new XMLResourceParseException("GlueSettings.xml", "GlueType", strArr[i], "has an invalid real value '" + ((String) null) + "'!");
            }
        }
        return new u78(fArr[0], fArr[1], fArr[2], str);
    }

    public int[][][] c() throws ResourceParseException {
        int size = this.a.size();
        int[][][] iArr = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, size, size, this.d.size());
        int i = 0;
        Element element = (Element) this.f18150e.getElementsByTagName("GlueTable").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Glue");
            int i2 = 0;
            while (i2 < elementsByTagName.getLength()) {
                Element element2 = (Element) elementsByTagName.item(i2);
                String strD = d("lefttype", element2);
                String strD2 = d("righttype", element2);
                String strD3 = d("gluetype", element2);
                NodeList elementsByTagName2 = element2.getElementsByTagName("Style");
                int i3 = i;
                while (i3 < elementsByTagName2.getLength()) {
                    String strD4 = d("name", (Element) elementsByTagName2.item(i3));
                    NodeList nodeList = elementsByTagName;
                    Integer num = this.a.get(strD);
                    NodeList nodeList2 = elementsByTagName2;
                    Integer num2 = this.a.get(strD2);
                    int i4 = i2;
                    Integer num3 = this.d.get(strD4);
                    int i5 = i3;
                    Integer num4 = this.b.get(strD3);
                    a(num, "Glue", "lefttype", strD);
                    a(num2, "Glue", "righttype", strD2);
                    a(num4, "Glue", "gluetype", strD3);
                    a(num3, "Style", "name", strD4);
                    iArr[num.intValue()][num2.intValue()][num3.intValue()] = num4.intValue();
                    i3 = i5 + 1;
                    elementsByTagName = nodeList;
                    elementsByTagName2 = nodeList2;
                    i2 = i4;
                }
                i2++;
                i = 0;
            }
        }
        return iArr;
    }

    public u78[] e() {
        return this.f18149c;
    }

    public final void f() throws ResourceParseException {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Element element = (Element) this.f18150e.getElementsByTagName("GlueTypes").item(0);
        int i3 = -1;
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("GlueType");
            i = 0;
            for (int i4 = 0; i4 < elementsByTagName.getLength(); i4++) {
                Element element2 = (Element) elementsByTagName.item(i4);
                String strD = d("name", element2);
                u78 u78VarB = b(element2, strD);
                if (strD.equalsIgnoreCase("default")) {
                    i3 = i;
                }
                arrayList.add(u78VarB);
                i++;
            }
        } else {
            i = 0;
        }
        if (i3 < 0) {
            arrayList.add(new u78(0.0f, 0.0f, 0.0f, "default"));
            i3 = i;
        }
        u78[] u78VarArr = (u78[]) arrayList.toArray(new u78[arrayList.size()]);
        this.f18149c = u78VarArr;
        if (i3 > 0) {
            u78 u78Var = u78VarArr[i3];
            u78VarArr[i3] = u78VarArr[0];
            u78VarArr[0] = u78Var;
        }
        while (true) {
            u78[] u78VarArr2 = this.f18149c;
            if (i2 >= u78VarArr2.length) {
                return;
            }
            this.b.put(u78VarArr2[i2].c(), Integer.valueOf(i2));
            i2++;
        }
    }

    public final void g() {
        this.d.put("display", 0);
        this.d.put("text", 1);
        this.d.put("script", 2);
        this.d.put("script_script", 3);
    }

    public final void h() {
        this.a.put("ord", 0);
        this.a.put("op", 1);
        this.a.put("bin", 2);
        this.a.put("rel", 3);
        this.a.put("open", 4);
        this.a.put("close", 5);
        this.a.put("punct", 6);
        this.a.put("inner", 7);
    }
}
