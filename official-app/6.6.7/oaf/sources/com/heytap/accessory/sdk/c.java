package com.heytap.accessory.sdk;

import com.heytap.accessory.base.bean.FrameworkServiceChannelDescription;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.bean.ServiceChannel;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.ServiceXmlReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static final String a = "c";

    public static synchronized Set<FrameworkServiceDescription> a(String str, int i, byte[] bArr) throws ResourceParserException {
        HashSet hashSet;
        hashSet = new HashSet();
        String strA = com.heytap.accessory.authcode.a.a(PlatformUtils.getContext(), str);
        List<ServiceProfile> servicesXML = ServiceXmlReader.parseServicesXML(bArr);
        if (servicesXML == null) {
            com.heytap.accessory.base.logging.a.e(a, "xml parse can't be empty!");
            throw new ResourceParserException("xml parse can't be empty!");
        }
        for (ServiceProfile serviceProfile : servicesXML) {
            ArrayList arrayList = new ArrayList();
            for (ServiceChannel serviceChannel : serviceProfile.getServiceChannelList()) {
                if (serviceChannel != null && !arrayList.add(new FrameworkServiceChannelDescription(serviceChannel.getChannelId(), serviceChannel.getPriority(), serviceChannel.getReliability(), serviceChannel.getClassType()))) {
                    throw new RuntimeException("Duplicate Service channel description for channel ID:" + serviceChannel.getChannelId());
                }
            }
            hashSet.add(new FrameworkServiceDescription(str, strA, arrayList, serviceProfile.getTransportType(), 0, null, serviceProfile.getId(), serviceProfile.getVersion(), serviceProfile.getRole(), serviceProfile.isMexSupported(), serviceProfile.isSocketSupported(), serviceProfile.getServiceLimit(), serviceProfile.getServiceTimeout(), i, serviceProfile.getServiceImpl(), serviceProfile.isAwakenable()));
        }
        if (hashSet.isEmpty()) {
            throw new ResourceParserException("No service descriptions found in Accessory Service configuration XML");
        }
        return hashSet;
    }
}
