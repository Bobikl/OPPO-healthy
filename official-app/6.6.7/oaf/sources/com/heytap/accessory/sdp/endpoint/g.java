package com.heytap.accessory.sdp.endpoint;

import android.content.Context;
import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.XmlReader;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class g {
    public static synchronized byte[] a(Context context) throws ResourceParserException {
        try {
            if (context == null) {
                throw new ResourceParserException("epitrack, endpoint resource parse failed, because context is null, returning...");
            }
            String metaDataLocation = XmlReader.getMetaDataLocation(context, context.getPackageName(), "EndpointInfoConfigLocation");
            if (metaDataLocation == null) {
                return null;
            }
            return XmlReader.readResOrAssertXml(context, context.getPackageName(), metaDataLocation);
        } catch (Throwable th) {
            throw th;
        }
    }
}
