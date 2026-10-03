package com.heytap.accessory.misc.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.ArrayMap;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.mla;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2610c = "b";
    public static Map<String, List<String>> d = new ArrayMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Map<String, List<String>> f2611e = new ArrayMap();
    public static b f;
    public final Context a;
    public String b;

    public static class a {
        public final char a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char f2612c;

        public a(String str, char c2, char c3) {
            this.b = str;
            this.f2612c = c2;
            this.a = c3;
        }

        public String a() {
            String str = this.b;
            return str.substring(str.lastIndexOf(this.f2612c) + 1, this.b.lastIndexOf(this.a));
        }
    }

    public b(Context context) {
        this.a = context;
        try {
            Bundle bundle = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128).metaData;
            if (bundle == null) {
                com.heytap.accessory.base.logging.a.e(f2610c, "No meta data present in the manifest");
            } else {
                this.b = bundle.getString("FrameworkPoliciesLocation");
                c();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            com.heytap.accessory.base.logging.a.b(f2610c, e2.getMessage());
        }
    }

    public XmlResourceParser a(XmlResourceParser xmlResourceParser) {
        if (xmlResourceParser != null) {
            try {
                xmlResourceParser.next();
            } catch (IOException | XmlPullParserException e2) {
                com.heytap.accessory.base.logging.a.e(f2610c, "moveParser error," + e2);
            }
        }
        return xmlResourceParser;
    }

    public final Map<String, List<String>> b(XmlResourceParser xmlResourceParser) {
        ArrayMap arrayMap = new ArrayMap();
        XmlResourceParser xmlResourceParserA = a(xmlResourceParser);
        String name = xmlResourceParserA.getName();
        while ("application".equals(name)) {
            XmlResourceParser xmlResourceParserA2 = a(xmlResourceParserA);
            if ("package".equals(xmlResourceParserA2.getName())) {
                String attributeValue = xmlResourceParserA2.getAttributeValue(null, "name");
                xmlResourceParserA2 = a(xmlResourceParserA2);
                String name2 = xmlResourceParserA2.getName();
                ArrayList arrayList = new ArrayList();
                while ("ASP_ID".equals(name2)) {
                    arrayList.add(xmlResourceParserA2.getAttributeValue(null, "name"));
                    xmlResourceParserA2 = a(a(xmlResourceParserA2));
                    name2 = xmlResourceParserA2.getName();
                }
                arrayMap.put(attributeValue, arrayList);
            }
            xmlResourceParserA = a(a(xmlResourceParserA2));
            name = xmlResourceParserA.getName();
        }
        return arrayMap;
    }

    public boolean c() {
        XmlResourceParser xml;
        try {
            try {
                try {
                    xml = this.a.getResources().getXml(this.a.getResources().getIdentifier(new a(this.b, mla.SEPARATOR, '.').a(), SpeechConstant.RESULT_TYPE_XML, this.a.getPackageName()));
                    try {
                        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                            if (eventType == 2) {
                                String name = xml.getName();
                                if (name == null) {
                                    com.heytap.accessory.base.logging.a.e(f2610c, "Name cannot be parsed in XML. Please check");
                                    return false;
                                }
                                if ("framework-policies".equals(name)) {
                                    XmlResourceParser xmlResourceParserA = a(xml);
                                    if ("privileged".equals(xmlResourceParserA.getName())) {
                                        d = b(xmlResourceParserA);
                                    }
                                    xml = a(xmlResourceParserA);
                                    if ("delegated".equals(xml.getName())) {
                                        f2611e = b(xml);
                                    }
                                }
                            } else if (eventType == 4 && xml.getText() == null) {
                                com.heytap.accessory.base.logging.a.e(f2610c, "Text cannot be parsed in XML. Please check");
                                return false;
                            }
                        }
                        xml.close();
                        return true;
                    } catch (Throwable unused) {
                        if (xml != null) {
                            xml.close();
                        }
                        return false;
                    }
                } catch (IOException | XmlPullParserException unused2) {
                    com.heytap.accessory.base.logging.a.e(f2610c, "Unable to parse the accessory services configuration file");
                    return false;
                }
            } catch (Throwable unused3) {
                xml = null;
            }
        } catch (Resources.NotFoundException unused4) {
            com.heytap.accessory.base.logging.a.e(f2610c, "framework policies configuration file not found at /res/xml.");
            return false;
        }
    }

    public static b a(Context context) {
        b bVar = f;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(context);
        f = bVar2;
        return bVar2;
    }

    public Map<String, List<String>> a() {
        return f2611e;
    }

    public Map<String, List<String>> b() {
        return d;
    }
}
