package com.heytap.accessory.utils;

import android.content.Context;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.logging.SdkLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ConfigUtil {
    public static final int SESSION_TRAFFIC_CLASS_CONTROL = 3;
    public static final int SESSION_TRAFFIC_CLASS_DEFAULT = 1;
    public static final int SESSION_TRAFFIC_CLASS_FILETRANSFER = 0;
    public static final int SESSION_TRAFFIC_CLASS_STREAMING = 2;
    private static final String TAG = "ConfigUtil";
    private static ConfigUtil sOnlyInstance;
    private final Context mContext;
    private HashMap<String, ServiceProfile> mServiceEndpointsMap;

    private ConfigUtil(Context context) {
        this.mContext = context;
    }

    public static synchronized ConfigUtil getDefaultInstance(Context context) {
        if (sOnlyInstance == null) {
            sOnlyInstance = new ConfigUtil(context);
        }
        return sOnlyInstance;
    }

    private synchronized boolean parseServicesXML() throws ResourceParserException {
        synchronized (ConfigUtil.class) {
            byte[][] xml = ServiceXmlReader.getInstance(this.mContext).readXml(this.mContext.getPackageName());
            ArrayList<ServiceProfile> arrayList = new ArrayList();
            for (byte[] bArr : xml) {
                try {
                    List<ServiceProfile> servicesXML = ServiceXmlReader.parseServicesXML(bArr);
                    if (servicesXML != null && !servicesXML.isEmpty()) {
                        arrayList.addAll(servicesXML);
                    }
                } catch (ResourceParserException e) {
                    throw new ResourceParserException(e);
                }
            }
            for (ServiceProfile serviceProfile : arrayList) {
                if (this.mServiceEndpointsMap == null) {
                    this.mServiceEndpointsMap = new HashMap<>();
                }
                this.mServiceEndpointsMap.put(serviceProfile.getServiceImpl(), serviceProfile);
            }
        }
        String str = TAG;
        SdkLog.i(str, "End document");
        if (this.mServiceEndpointsMap == null) {
            throw new ResourceParserException("Unable to parse the accessory services configuration file");
        }
        SdkLog.d(str, "parse the accessory services size:" + this.mServiceEndpointsMap.size());
        return true;
    }

    public synchronized ServiceProfile fetchServicesDescription(String str) {
        if (this.mServiceEndpointsMap == null) {
            try {
                parseServicesXML();
            } catch (ResourceParserException e) {
                SdkLog.e(TAG, e);
            }
        }
        if (this.mServiceEndpointsMap.get(str) != null) {
            return this.mServiceEndpointsMap.get(str);
        }
        SdkLog.e(TAG, "fetchServicesDescription: Class not found in registered list" + str);
        return null;
    }
}
