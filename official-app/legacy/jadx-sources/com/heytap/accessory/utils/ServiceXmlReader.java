package com.heytap.accessory.utils;

import android.content.Context;
import androidx.annotation.Nullable;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.parser.ServiceProfileBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes14.dex */
public class ServiceXmlReader {
    private static final String ASSET_FILE_PREFIX = "/assets/";
    private static final String FILE_EXTENSION_SEPARATOR = ".";
    private static final String INTERNAL_SERVICE_CONFIG_FILE_LOCATION = "InternalAccessoryServicesLocation";
    private static final String RESOURCE_FILE_PREFIX = "/res";
    private static final String SERVICE_CONFIG_FILE_LOCATION = "AccessoryServicesLocation";
    private static final String TAG = "ServiceXmlReader";
    private static final String XML_RESOURCE_TYPE = "xml";
    private static byte[][] sServiceXml;
    private static ServiceXmlReader sXmlReader;
    private Context mContext;

    private ServiceXmlReader(Context context) {
        if (context != null) {
            this.mContext = context;
            return;
        }
        throw new IllegalArgumentException("Invalid context:" + ((Object) null));
    }

    private String[] getConfigFileLocation(String str) throws ResourceParserException {
        String metaDataLocation;
        String metaDataLocation2;
        try {
            metaDataLocation = XmlReader.getMetaDataLocation(this.mContext, str, INTERNAL_SERVICE_CONFIG_FILE_LOCATION);
        } catch (ResourceParserException e2) {
            SdkLog.e(TAG, "get internalServiceConfig failed", e2);
            metaDataLocation = null;
        }
        try {
            metaDataLocation2 = XmlReader.getMetaDataLocation(this.mContext, str, SERVICE_CONFIG_FILE_LOCATION);
        } catch (ResourceParserException e3) {
            SdkLog.e(TAG, "get serviceConfig failed", e3);
            metaDataLocation2 = null;
        }
        if (metaDataLocation == null && metaDataLocation2 == null) {
            SdkLog.e(TAG, "No meta data found with key:AccessoryServicesLocation");
            return null;
        }
        if (metaDataLocation != null && metaDataLocation2 == null) {
            String[] strArr = {metaDataLocation};
            SdkLog.i(TAG, "internalServiceConfig : " + metaDataLocation);
            return strArr;
        }
        if (metaDataLocation == null) {
            String[] strArr2 = {metaDataLocation2};
            SdkLog.i(TAG, "serviceConfig : " + metaDataLocation2);
            return strArr2;
        }
        String[] strArr3 = {metaDataLocation2, metaDataLocation};
        SdkLog.i(TAG, "internalServiceConfig : " + metaDataLocation + " serviceConfig : " + metaDataLocation2);
        return strArr3;
    }

    public static synchronized ServiceXmlReader getInstance(Context context) {
        if (sXmlReader == null) {
            sServiceXml = null;
            sXmlReader = new ServiceXmlReader(context.getApplicationContext());
        }
        return sXmlReader;
    }

    @Nullable
    public static synchronized List<ServiceProfile> parseServicesXML(byte[] bArr) throws ResourceParserException {
        ArrayList arrayList = new ArrayList();
        SdkLog.d(TAG, "Start parseServicesXML");
        synchronized (ServiceXmlReader.class) {
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
                ServiceProfileBuilder serviceProfileBuilder = new ServiceProfileBuilder();
                try {
                    for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                        if (eventType == 3) {
                            if (serviceProfileBuilder.isEnd(xmlPullParserNewPullParser)) {
                                arrayList.add(serviceProfileBuilder.build());
                                serviceProfileBuilder.reset();
                            }
                        } else if (eventType == 2) {
                            serviceProfileBuilder.parse(xmlPullParserNewPullParser);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        SdkLog.w(TAG, "End parse profile: Unable to parse the accessory services configuration file");
                        throw new ResourceParserException("Unable to parse the accessory services configuration file");
                    }
                    SdkLog.d(TAG, "End parse profile:" + arrayList);
                    return arrayList;
                } catch (IOException | XmlPullParserException e2) {
                    throw new ResourceParserException(e2);
                }
            } catch (XmlPullParserException unused) {
                throw new ResourceParserException("XmlPullParserFactory Exception for Accssory Service profile XML file");
            }
        }
    }

    public synchronized byte[][] readXml(String str) throws ResourceParserException {
        String[] configFileLocation = getConfigFileLocation(str);
        if (configFileLocation == null) {
            return null;
        }
        sServiceXml = new byte[configFileLocation.length][];
        for (int i = 0; i < configFileLocation.length; i++) {
            String str2 = configFileLocation[i];
            if (str2 != null) {
                sServiceXml[i] = XmlReader.readResOrAssertXml(this.mContext, str, str2);
            }
        }
        return sServiceXml;
    }
}
