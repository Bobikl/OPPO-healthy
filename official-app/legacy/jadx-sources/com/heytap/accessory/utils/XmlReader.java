package com.heytap.accessory.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.heytap.accessory.logging.SdkLog;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes14.dex */
public class XmlReader {
    private static final String ASSET_FILE_PREFIX = "/assets/";
    private static final String ATTRIBUTE_TEMPLATE = "%s=\"%s\"";
    private static final String END_TAG_TEMPLATE = "</%s>";
    private static final String FILE_EXTENSION_SEPARATOR = ".";
    private static final int MAX_XML_LENGTH = 65529;
    private static final String RESOURCE_FILE_PREFIX = "/res";
    public static final String SEPERATOR = "\\|";
    private static final String START_TAG_BEGIN_TEMPLATE = "<%s ";
    private static final String START_TAG_END_TEMPLATE = ">";
    private static final String TAG = "XmlReader";
    public static final String TRANSPORT_ALL = "ALL";
    public static final String TRANSPORT_BLE = "BLE";
    public static final String TRANSPORT_BT = "BT";
    public static final String TRANSPORT_DEFAULT = "default";
    public static final String TRANSPORT_WIFI = "WIFI";
    public static final String VALUE_DISABLE = "disable";
    public static final String VALUE_ENABLE = "enable";
    private static final String XML_RESOURCE_TYPE = "xml";

    public static int checkTransportType(String str) {
        int i = 0;
        for (String str2 : str.split("\\|")) {
            if (TRANSPORT_BLE.equalsIgnoreCase(str2)) {
                i |= 4;
            }
            if (TRANSPORT_BT.equalsIgnoreCase(str2)) {
                i |= 2;
            }
            if ("WIFI".equalsIgnoreCase(str2)) {
                i |= 1;
            }
            if ("ALL".equalsIgnoreCase(str2)) {
                i |= 255;
            }
        }
        return i;
    }

    public static String getMetaDataLocation(Context context, String str, String str2) throws ResourceParserException {
        String str3 = "Unable to fetch metadata: " + str2 + ", did you forget to add " + str2 + " in manifest?";
        try {
            Bundle bundle = context.getApplicationContext().getPackageManager().getApplicationInfo(str, 128).metaData;
            if (bundle == null) {
                SdkLog.e(TAG, str3);
                throw new ResourceParserException(str3);
            }
            String string = bundle.getString(str2, null);
            if (string == null) {
                SdkLog.e(TAG, "No meta data found with key: " + str2 + " in " + str);
            }
            return string;
        } catch (PackageManager.NameNotFoundException e2) {
            SdkLog.e(TAG, str3);
            throw new ResourceParserException(str3, e2);
        }
    }

    public static Resources getResources(Context context, String str) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getResourcesForApplication(str);
    }

    public static synchronized byte[] preProcessXml(XmlPullParser xmlPullParser) throws ResourceParserException {
        StringBuilder sb;
        sb = new StringBuilder();
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    SdkLog.v(TAG, "Start document");
                } else if (eventType == 2) {
                    sb.append(String.format(START_TAG_BEGIN_TEMPLATE, xmlPullParser.getName().trim()));
                    int attributeCount = xmlPullParser.getAttributeCount();
                    if (attributeCount > 0) {
                        for (int i = 0; i < attributeCount; i++) {
                            sb.append(String.format(ATTRIBUTE_TEMPLATE, xmlPullParser.getAttributeName(i).trim(), xmlPullParser.getAttributeValue(i).trim()));
                        }
                    }
                    sb.append(START_TAG_END_TEMPLATE);
                } else if (eventType == 3) {
                    sb.append(String.format(END_TAG_TEMPLATE, xmlPullParser.getName()));
                } else if (eventType == 4) {
                    sb.append(xmlPullParser.getText().trim());
                }
                if (sb.length() >= MAX_XML_LENGTH) {
                    throw new ResourceParserException("Accessory Service XML is too long! Services XML cannot be more than 64k in size");
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException e2) {
            throw new ResourceParserException(e2);
        }
        return sb.toString().getBytes(SdkConfig.getStringEncoding());
    }

    public static synchronized byte[] readResOrAssertXml(Context context, String str, String str2) throws ResourceParserException {
        byte[] bArrPreProcessXml;
        if (str2.startsWith(RESOURCE_FILE_PREFIX)) {
            String strSubstring = str2.substring(str2.lastIndexOf(File.separator) + 1, str2.lastIndexOf("."));
            SdkLog.d(TAG, "Fetching xml from /res/xml/" + strSubstring);
            XmlResourceParser xml = null;
            try {
                try {
                    Resources resources = getResources(context, str);
                    xml = resources.getXml(resources.getIdentifier(strSubstring, "xml", str));
                    bArrPreProcessXml = preProcessXml(xml);
                    if (xml != null) {
                        xml.close();
                    }
                } catch (Resources.NotFoundException e2) {
                    throw new ResourceParserException("configuration XML file not found at:" + str2 + ", pkg:" + str, e2);
                } catch (Exception e3) {
                    throw new ResourceParserException("configuration XML file parse failed:" + str2 + ", pkg:" + str, e3);
                }
            } catch (Throwable th) {
                if (xml != null) {
                    xml.close();
                }
                throw th;
            }
        } else {
            if (!str2.startsWith(ASSET_FILE_PREFIX)) {
                throw new ResourceParserException("Endpoint profile xml must be in /res or /assets directory.");
            }
            SdkLog.d(TAG, "Fetching xml from /assets");
            try {
                InputStream inputStreamOpen = context.getAssets().open(str2.substring(8));
                try {
                    XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                    xmlPullParserFactoryNewInstance.setNamespaceAware(true);
                    XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                    xmlPullParserNewPullParser.setInput(inputStreamOpen, SdkConfig.getStringEncoding());
                    bArrPreProcessXml = preProcessXml(xmlPullParserNewPullParser);
                } catch (XmlPullParserException e4) {
                    throw new ResourceParserException("Parsing Accessory service configuration failed from:" + str2, e4);
                }
            } catch (IOException e5) {
                throw new ResourceParserException("Unable to read the service XML file from:" + str2, e5);
            }
        }
        return bArrPreProcessXml;
    }
}
