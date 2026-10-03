package com.heytap.accessory.utils.parser;

import android.text.TextUtils;
import com.heytap.accessory.bean.ServiceChannel;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.XmlReader;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ServiceProfileBuilder {
    private static final String ATTR_AWAKENABLE = "awakenable";
    private static final String ATTR_CLASS = "class";
    private static final String ATTR_CONNECTION_TYPE = "connectionType";
    private static final String ATTR_ID = "id";
    private static final String ATTR_MEX = "MSGEXPY";
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PRIORITY = "priority";
    private static final String ATTR_QOS_PRIORITY = "qosPriority";
    private static final String ATTR_QOS_TYPE = "qosType";
    private static final String ATTR_RELIABILITY = "reliability";
    private static final String ATTR_SERVICE_IMPL = "impl";
    private static final String ATTR_SERVICE_LIMIT = "limit";
    private static final String ATTR_SERVICE_TIMEOUT = "timeout";
    private static final String ATTR_URN = "urn";
    private static final String CLASS_DEFAULT = "default";
    private static final String CLASS_FT = "filetransfer";
    private static final String CLASS_STREAMING = "streaming";
    private static final String PRIORITY_HIGH = "High";
    private static final String PRIORITY_LOW = "Low";
    private static final String PRIORITY_MEDIUM = "Medium";
    private static final String[] SERVICE_LIMITS = {"ANY", "ONE_ACCESSORY", "ONE_PEERAGENT"};
    public static final int SESSION_TRAFFIC_CLASS_CONTROL = 3;
    public static final int SESSION_TRAFFIC_CLASS_DEFAULT = 1;
    public static final int SESSION_TRAFFIC_CLASS_FILETRANSFER = 0;
    public static final int SESSION_TRAFFIC_CLASS_STREAMING = 2;
    private static final String TAG = "ServiceProfileBuilder";
    private static final String TAG_FEATURE_SUPPORTED = "features";
    private static final String TAG_PROFILE_CONSUMER = "consumer";
    private static final String TAG_PROFILE_PROVIDER = "provider";
    private static final String TAG_SERVICE_CHANNEL = "channel";
    private ServiceProfile mProfile = new ServiceProfile();

    private static int checkAwakenable(String str) throws ResourceParserException {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (XmlReader.VALUE_ENABLE.equalsIgnoreCase(str)) {
            return 1;
        }
        if (XmlReader.VALUE_DISABLE.equalsIgnoreCase(str)) {
            return 0;
        }
        throw new ResourceParserException("Invalid XML attribute profile / awakenable value:" + str);
    }

    private static int checkChannelId(String str) throws ResourceParserException {
        validateTextAttribute("serviceChannel/id", str);
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new ResourceParserException("Invalid XML attributeserviceChannel/id value:" + str);
        }
    }

    private static int checkClass(String str) {
        if (str == null) {
            return 1;
        }
        if ("filetransfer".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("streaming".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("default".equalsIgnoreCase(str)) {
            return 1;
        }
        int iGenerateChannelType = generateChannelType(str);
        SdkLog.i(TAG, "user defined value " + str + " , " + iGenerateChannelType);
        return iGenerateChannelType;
    }

    private static int checkPriority(String str) throws ResourceParserException {
        validateTextAttribute("serviceChannel/priority", str);
        if (PRIORITY_LOW.equalsIgnoreCase(str)) {
            return 0;
        }
        if (PRIORITY_MEDIUM.equalsIgnoreCase(str)) {
            return 1;
        }
        if (PRIORITY_HIGH.equalsIgnoreCase(str)) {
            return 2;
        }
        throw new ResourceParserException("Invalid XML attributeserviceChannel / priority value:" + str);
    }

    private static int checkReliability(String str) throws ResourceParserException {
        validateTextAttribute("serviceChannel / reliability", str);
        if (XmlReader.VALUE_ENABLE.equalsIgnoreCase(str)) {
            return 5;
        }
        if (XmlReader.VALUE_DISABLE.equalsIgnoreCase(str)) {
            return 4;
        }
        throw new ResourceParserException("Invalid XML attributeserviceChannel / reliability value:" + str);
    }

    private static int checkServiceLimit(String str) throws ResourceParserException {
        if (str == null) {
            return 0;
        }
        String[] strArr = SERVICE_LIMITS;
        if (strArr[1].equalsIgnoreCase(str)) {
            return 1;
        }
        if (strArr[2].equalsIgnoreCase(str)) {
            return 2;
        }
        if (strArr[0].equalsIgnoreCase(str)) {
            return 0;
        }
        throw new ResourceParserException("Invalid XML attributeserviceProfile / serviceLimit value:" + str);
    }

    private static int checkServiceTimeout(String str) throws ResourceParserException {
        if (str == null) {
            return 0;
        }
        try {
            int i = Integer.parseInt(str);
            if (i >= 0) {
                return i;
            }
            SdkLog.w(TAG, "Negetive service timeout:" + str + " initializing timeout to 0");
            return 0;
        } catch (NumberFormatException unused) {
            throw new ResourceParserException("Invalid XML attributeserviceProfile / serviceTimeout value:" + str);
        }
    }

    public static int generateChannelType(String str) {
        return (Math.abs(getBkdrHash(str)) % 245) + 10;
    }

    private static int getBkdrHash(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        int iCharAt = 0;
        for (int i = 0; i < lowerCase.length(); i++) {
            iCharAt = lowerCase.charAt(i) + (31 * iCharAt);
        }
        return iCharAt;
    }

    private void parseChannel(XmlPullParser xmlPullParser) throws ResourceParserException {
        int iCheckChannelId = checkChannelId(xmlPullParser.getAttributeValue(null, ATTR_ID));
        String attributeValue = xmlPullParser.getAttributeValue(null, "priority");
        if (attributeValue == null) {
            attributeValue = xmlPullParser.getAttributeValue(null, ATTR_QOS_PRIORITY);
        }
        int iCheckPriority = checkPriority(attributeValue);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, ATTR_RELIABILITY);
        if (attributeValue2 == null) {
            attributeValue2 = xmlPullParser.getAttributeValue(null, ATTR_QOS_TYPE);
        }
        int iCheckReliability = checkReliability(attributeValue2);
        int iCheckClass = checkClass(xmlPullParser.getAttributeValue(null, ATTR_CLASS));
        List<ServiceChannel> serviceChannelList = this.mProfile.getServiceChannelList();
        if (serviceChannelList == null) {
            serviceChannelList = new ArrayList<>();
            this.mProfile.setServiceChannelList(serviceChannelList);
        }
        if (serviceChannelList.add(new ServiceChannel(iCheckChannelId, iCheckPriority, iCheckReliability, iCheckClass))) {
            this.mProfile.setIsSocketSupported(1);
            return;
        }
        throw new ResourceParserException("Duplicate Service channel description for channel ID:" + iCheckChannelId);
    }

    private void parseProviderOrConsumer(XmlPullParser xmlPullParser) throws ResourceParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_SERVICE_IMPL);
        validateTextAttribute(ATTR_SERVICE_IMPL, attributeValue);
        this.mProfile.setServiceImpl(attributeValue);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, ATTR_NAME);
        validateTextAttribute("profile/name", attributeValue2);
        this.mProfile.setName(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, ATTR_URN);
        String strSubstring = attributeValue3.substring(0, attributeValue3.lastIndexOf(":"));
        validateTextAttribute("profile/id", strSubstring);
        this.mProfile.setId(strSubstring);
        String strSubstring2 = attributeValue3.substring(attributeValue3.lastIndexOf(":") + 1);
        validateTextAttribute("profile/version", strSubstring2);
        this.mProfile.setVersion(strSubstring2);
        this.mProfile.setServiceLimit(checkServiceLimit(xmlPullParser.getAttributeValue(null, ATTR_SERVICE_LIMIT)));
        this.mProfile.setServiceTimeout(checkServiceTimeout(xmlPullParser.getAttributeValue(null, ATTR_SERVICE_TIMEOUT)));
        String attributeValue4 = xmlPullParser.getAttributeValue(null, ATTR_CONNECTION_TYPE);
        validateTextAttribute("transport/type", attributeValue4);
        this.mProfile.setTransportType(XmlReader.checkTransportType(attributeValue4));
        this.mProfile.setAwakenable(checkAwakenable(xmlPullParser.getAttributeValue(null, ATTR_AWAKENABLE)));
        String attributeValue5 = xmlPullParser.getAttributeValue(null, TAG_FEATURE_SUPPORTED);
        if (attributeValue5 != null) {
            for (String str : attributeValue5.split(XmlReader.SEPERATOR)) {
                if (str.equalsIgnoreCase(ATTR_MEX)) {
                    this.mProfile.setIsMexSupported(1);
                    return;
                }
            }
        }
    }

    private static void validateTextAttribute(String str, String str2) throws ResourceParserException {
        if (TextUtils.isEmpty(str2)) {
            throw new ResourceParserException("Invalid attribute :" + str + " value:" + str2);
        }
    }

    public ServiceProfile build() {
        return this.mProfile;
    }

    public boolean isEnd(XmlPullParser xmlPullParser) {
        return TAG_PROFILE_PROVIDER.equals(xmlPullParser.getName()) || TAG_PROFILE_CONSUMER.equals(xmlPullParser.getName());
    }

    public void parse(XmlPullParser xmlPullParser) throws ResourceParserException {
        String name = xmlPullParser.getName();
        if (TAG_PROFILE_PROVIDER.equals(name)) {
            this.mProfile.setRole(0);
            parseProviderOrConsumer(xmlPullParser);
        } else if (TAG_PROFILE_CONSUMER.equals(name)) {
            this.mProfile.setRole(1);
            parseProviderOrConsumer(xmlPullParser);
        } else if (TAG_SERVICE_CHANNEL.equals(name)) {
            parseChannel(xmlPullParser);
        }
    }

    public void reset() {
        this.mProfile = new ServiceProfile();
    }
}
