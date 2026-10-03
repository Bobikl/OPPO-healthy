package com.heytap.accessory.sdk.accessorymanager;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final String a = "b";

    public static synchronized void a(Context context, byte[] bArr, String str) {
        synchronized (b.class) {
            com.heytap.accessory.base.logging.a.c(a, "Parsing CM Xml : " + bArr.length + " packageName = " + str);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                xmlPullParserFactoryNewInstance.setNamespaceAware(true);
                XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                xmlPullParserNewPullParser.setInput(byteArrayInputStream, "UTF-8");
                int eventType = xmlPullParserNewPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        com.heytap.accessory.base.logging.a.a(a, "parseXml: start tag");
                        if ("policy".equals(xmlPullParserNewPullParser.getName())) {
                            a("primary", xmlPullParserNewPullParser.getAttributeValue(null, "primary"));
                            a("secondary", xmlPullParserNewPullParser.getAttributeValue(null, "secondary"));
                            a("limit", xmlPullParserNewPullParser.getAttributeValue(null, "limit"));
                        }
                    }
                    try {
                        eventType = xmlPullParserNewPullParser.next();
                    } catch (IOException e) {
                        com.heytap.accessory.base.logging.a.e(a, "parseXml Exception:" + e);
                    }
                }
                a.a(context, "CMPolicy", (byte) 1, "1", str);
            } catch (XmlPullParserException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, String str2) {
        com.heytap.accessory.base.logging.a.a(a, "validateTextAttribute: attrName = " + str + " attrValue = " + str2);
        if (TextUtils.isEmpty(str2)) {
            throw new RuntimeException("Invalid attribute :" + str + " value:" + str2);
        }
    }
}
