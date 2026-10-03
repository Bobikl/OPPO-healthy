package com.heytap.accessory.sdp.endpoint;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.XmlReader;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public d a;
    public int b;

    public a(int i) {
        this.a = new d(i);
        this.b = i;
    }

    public final String a(int i) {
        if (i == 1) {
            return XmlReader.TRANSPORT_WIFI;
        }
        if (i != 2) {
            return i != 4 ? "default" : XmlReader.TRANSPORT_BLE;
        }
        return XmlReader.TRANSPORT_BT;
    }

    public final void b(XmlPullParser xmlPullParser) {
        String strA = a(this.b);
        String name = xmlPullParser.getName();
        if ("endpoint".equals(name)) {
            a(xmlPullParser);
        } else if ("apduSize".equals(name)) {
            a(strA, xmlPullParser);
        } else if ("ssduSize".equals(name)) {
            c(strA, xmlPullParser);
        }
    }

    public final void c(String str, XmlPullParser xmlPullParser) {
        Integer numB = b(str, xmlPullParser);
        if (numB == null) {
            com.heytap.accessory.base.logging.a.e("EndpointBuilder - epitrack", "ssdu for " + str + " is empty, apply the default value.");
            return;
        }
        if (!XmlReader.TRANSPORT_BLE.toLowerCase().equals(str.toLowerCase()) || numB.intValue() <= 243) {
            this.a.f(numB.intValue());
            return;
        }
        com.heytap.accessory.base.logging.a.b("EndpointBuilder - epitrack", "BLE ssdu max size(" + numB + ") should be less than 243");
    }

    @Nullable
    public synchronized d a(byte[] bArr) throws ResourceParserException {
        synchronized (a.class) {
            String str = new String(bArr, 0, bArr.length);
            try {
                XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                xmlPullParserFactoryNewInstance.setNamespaceAware(true);
                XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                if (xmlPullParserNewPullParser != null) {
                    xmlPullParserNewPullParser.setInput(new StringReader(str));
                }
                if (xmlPullParserNewPullParser == null) {
                    return null;
                }
                try {
                    for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                        if (eventType == 3 && "endpoint".equals(xmlPullParserNewPullParser.getName())) {
                            return this.a;
                        }
                        if (eventType == 2) {
                            b(xmlPullParserNewPullParser);
                        }
                    }
                    throw new ResourceParserException("Unable to parse the accessory services configuration file");
                } catch (IOException | XmlPullParserException e) {
                    throw new ResourceParserException(e);
                }
            } catch (XmlPullParserException unused) {
                throw new ResourceParserException("XmlPullParserFactory Exception endpoint XML file");
            }
        }
    }

    @Nullable
    public final Integer b(String str, XmlPullParser xmlPullParser) {
        if (str == null || xmlPullParser == null) {
            return null;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, str.toLowerCase());
        if (attributeValue == null) {
            attributeValue = xmlPullParser.getAttributeValue(null, "default");
        }
        return a(attributeValue);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(XmlPullParser xmlPullParser) {
        Integer numA = a(xmlPullParser.getAttributeValue(null, "deviceMajor"));
        if (numA != null) {
            this.a.b(numA.byteValue());
        }
        Boolean boolA = a(this.b, xmlPullParser.getAttributeValue(null, "crcEnable"));
        if (boolA != null) {
            this.a.a(boolA.booleanValue() ? (byte) 1 : (byte) 0);
        }
        Boolean boolA2 = a(this.b, xmlPullParser.getAttributeValue(null, "ackEnable"));
        if (boolA2 != null) {
            if (boolA2.booleanValue()) {
                this.a.f((byte) 2);
            } else {
                this.a.f((byte) 1);
            }
        }
        Boolean boolA3 = a(this.b, xmlPullParser.getAttributeValue(null, "compression"));
        if (boolA3 != null) {
            if (boolA3.booleanValue()) {
                this.a.b(1);
            } else {
                this.a.b(2);
            }
        }
        Integer numA2 = a(xmlPullParser.getAttributeValue(null, "maxSessions"));
        if (numA2 != null) {
            this.a.c(numA2.intValue());
        }
        Integer numA3 = a(xmlPullParser.getAttributeValue(null, "serviceTimeout"));
        if (numA3 != null) {
            this.a.e(numA3.intValue());
        }
        Integer numA4 = a(xmlPullParser.getAttributeValue(null, "ackWindowSize"));
        if (numA4 != null) {
            this.a.h(numA4.intValue());
        }
        Boolean boolA4 = a(this.b, xmlPullParser.getAttributeValue(null, "multiChannel"));
        if (boolA4 != null) {
            this.a.d(boolA4.booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public final Integer a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Boolean a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (XmlReader.VALUE_ENABLE.equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if (XmlReader.VALUE_DISABLE.equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        int iCheckTransportType = XmlReader.checkTransportType(str);
        if (iCheckTransportType == 0) {
            return null;
        }
        return Boolean.valueOf((iCheckTransportType & i) == i);
    }

    public final void a(String str, XmlPullParser xmlPullParser) {
        Integer numB = b(str, xmlPullParser);
        if (numB == null) {
            com.heytap.accessory.base.logging.a.e("EndpointBuilder - epitrack", "apdu for " + str + " is empty, apply the default value.");
            return;
        }
        this.a.a(numB.intValue());
    }
}
