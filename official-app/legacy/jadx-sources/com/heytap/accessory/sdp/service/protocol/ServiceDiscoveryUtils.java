package com.heytap.accessory.sdp.service.protocol;

import com.heytap.accessory.base.bean.FrameworkServiceChannelDescription;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.utils.AFArraysUtils;
import com.oplus.aiunit.vision.n04;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes14.dex */
public class ServiceDiscoveryUtils {
    public static final int AF_ERROR_CAPABILITY_QUERY_FAILURE = 1;
    public static final int AF_ERROR_CONNECTION_CLOSED = 2;
    public static final int AF_ERROR_NO_DATABASE_RECORD = 3;
    public static final int AF_NO_ERROR = 0;
    public static final int AF_SERVICE_CAPABILITY_EXCHANGE_PRIORITY = 1;
    public static final String AF_SERVICE_CAPABILITY_EXCHANGE_PROFILE_ID = "/System/Reserved/ServiceCapabilityDiscovery";
    public static final int AF_SERVICE_CAPABILITY_EXCHANGE_QOS_CLASS = 3;
    public static final int AF_SERVICE_CAPABILITY_EXCHANGE_QOS_TYPE = 3;
    public static final int AF_SERVICE_CAPABILITY_EXCHANGE_SERVICE_CONNECTION_TIMEOUT = 0;
    public static final long AF_SERVICE_COMPONENT_ID_USABLE_LIMIT = 65279;
    public static final int ATTEMPT_INTERVAL = 500;
    public static final int CAPEX_RESERVED_SESSION_ID = 1020;
    public static final int CAPEX_STATE_INVALID = 0;
    public static final int CAPEX_STATE_NOT_STARTED = 2;
    public static final int CAPEX_STATE_STARTED = 1;
    public static final long CAPEX_SYNC_QUERY_TIMEOUT_INTERVAL = 10000;
    public static final long CAPEX_SYNC_RESPONSE_TIMEOUT_INTERVAL = 10000;
    public static final int CAPEX_SYNC_RETRY_ATTEMPTS_COUNT = 2;
    public static final String DUMMY_APP_NAME = "65535";
    public static final String DUMMY_ASP_VERSION = "1.0";
    public static final int LEGACY_DEVICE_CHECKSUM = -1;
    public static final String LOCAL_ADDRESS = "0.0.0.0";
    public static final int MATCH_RESULT_MATCH = 0;
    public static final int MATCH_RESULT_PROFILE_NOT_FOUND = 1;
    public static final int MATCH_RESULT_PROFILE_NOT_MATCH = 2;
    public static final int MAX_RETRIES_SERVICE_CONNECTION_CAPABILITY_DISCOVERY = 5;
    public static final int ONPEERINSTALLED = 1;
    public static final int ONPEERUNINSTALLED = 2;
    public static final int RECORD_ADDED = 1;
    public static final int RECORD_ALREADY_PRESENT = 2;
    public static final int RECORD_CHANGED = 3;
    public static final int RECORD_NOT_PRESENT = 1;
    public static final int RECORD_SAME = 2;
    public static final int RECORD_UPDATED = 3;
    public static final Charset CHARSET_TYPE = Charset.forName("UTF-8");
    private static final String TAG = ServiceDiscoveryUtils.class.getSimpleName() + " - SLPTrack";

    public static FrameworkServiceDescription createDummyRecord(String str, int i) {
        return new FrameworkServiceDescription(DUMMY_APP_NAME, "", null, i, 2, String.valueOf(65280), str, "1.0", 1, 0, 0, 0, 0, 1, null, 0);
    }

    public static List<Integer> findCommonChannel(FrameworkServiceDescription frameworkServiceDescription, List<com.heytap.accessory.session.params.a.C0262a> list) {
        ArrayList arrayList = new ArrayList();
        if (frameworkServiceDescription != null && list != null && list.size() != 0) {
            for (FrameworkServiceChannelDescription frameworkServiceChannelDescription : frameworkServiceDescription.f()) {
                if (frameworkServiceChannelDescription != null) {
                    for (com.heytap.accessory.session.params.a.C0262a c0262a : list) {
                        if (c0262a != null && c0262a.a == frameworkServiceChannelDescription.a()) {
                            arrayList.add(Integer.valueOf(frameworkServiceChannelDescription.a()));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static b formServiceCapabilityParams(List<FrameworkServiceDescription> list, int i, long j2, com.heytap.accessory.base.bean.b bVar) {
        b bVar2 = new b();
        bVar2.d = (byte) i;
        bVar2.f = (byte) 3;
        bVar2.f2659c = (int) j2;
        HashMap map = new HashMap();
        for (FrameworkServiceDescription frameworkServiceDescription : list) {
            int i2 = Integer.parseInt(frameworkServiceDescription.a());
            byte bO = (byte) frameworkServiceDescription.o();
            byte bJ = (byte) frameworkServiceDescription.j();
            byte bR = (byte) frameworkServiceDescription.r();
            byte bE = (byte) frameworkServiceDescription.e();
            String strM = frameworkServiceDescription.m();
            String[] strArrSplit = frameworkServiceDescription.n().split("\\.");
            b.c cVar = new b.c();
            cVar.b = i2;
            byte b = (byte) (bO & 3);
            cVar.f2663e = b;
            if (bR == 1) {
                cVar.f2663e = (byte) (b | 4);
            }
            if (bJ == 1) {
                cVar.f2663e = (byte) (cVar.f2663e | 8);
            }
            if (bE == 1) {
                cVar.f2663e = (byte) (cVar.f2663e | 16);
            }
            cVar.d = strM;
            if (strArrSplit.length == 1) {
                cVar.a = (Integer.parseInt(strArrSplit[0]) & 255) << 8;
            } else {
                cVar.a = ((Integer.parseInt(strArrSplit[0]) & 255) << 8) | Integer.parseInt(strArrSplit[1]);
            }
            cVar.f2662c = frameworkServiceDescription.h();
            String strD = frameworkServiceDescription.d();
            String strC = frameworkServiceDescription.c();
            if (map.containsKey(strD)) {
                ((b.a) map.get(strD)).f2661c.add(cVar);
            } else {
                b.a aVar = new b.a();
                aVar.a = strD;
                aVar.b = strC;
                aVar.f2661c.add(cVar);
                map.put(strD, aVar);
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            bVar2.a.add((b.a) ((Map.Entry) it.next()).getValue());
        }
        bVar2.f2660e = bVar2.a.size();
        com.heytap.accessory.base.logging.a.a(TAG, "formUpdateServiceCapabilityParams:" + bVar2);
        return bVar2;
    }

    public static c formUpdateServiceCapabilityParams(List<FrameworkServiceDescription> list, int i, long j2, com.heytap.accessory.base.bean.b bVar) {
        c cVar = new c();
        cVar.f2665e = (byte) 3;
        cVar.b = (int) j2;
        cVar.f2664c = (byte) 3;
        HashMap map = new HashMap();
        for (FrameworkServiceDescription frameworkServiceDescription : list) {
            String strD = frameworkServiceDescription.d();
            String strC = frameworkServiceDescription.c();
            int i2 = Integer.parseInt(frameworkServiceDescription.a());
            byte bO = (byte) frameworkServiceDescription.o();
            byte bJ = (byte) frameworkServiceDescription.j();
            byte bR = (byte) frameworkServiceDescription.r();
            byte bE = (byte) frameworkServiceDescription.e();
            String strM = frameworkServiceDescription.m();
            String[] strArrSplit = frameworkServiceDescription.n().split("\\.");
            c.b bVar2 = new c.b();
            bVar2.b = i2;
            byte b = (byte) (bO & 3);
            bVar2.f2668e = b;
            if (bR == 1) {
                bVar2.f2668e = (byte) (b | 4);
            }
            if (bJ == 1) {
                bVar2.f2668e = (byte) (bVar2.f2668e | 8);
            }
            if (bE == 1) {
                bVar2.f2668e = (byte) (bVar2.f2668e | 16);
            }
            bVar2.d = strM;
            bVar2.a = ((Integer.parseInt(strArrSplit[0]) & 255) << 8) | Integer.parseInt(strArrSplit[1]);
            bVar2.f2667c = frameworkServiceDescription.h();
            if (map.containsKey(frameworkServiceDescription.d())) {
                ((c.a) map.get(frameworkServiceDescription.d())).f2666c.add(bVar2);
            } else {
                c.a aVar = new c.a();
                aVar.d = (byte) i;
                aVar.a = strD;
                aVar.b = strC;
                aVar.f2666c.add(bVar2);
                map.put(frameworkServiceDescription.d(), aVar);
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            cVar.a.add((c.a) ((Map.Entry) it.next()).getValue());
        }
        cVar.d = cVar.a.size();
        com.heytap.accessory.base.logging.a.a(TAG + " - SLPTrack", "formUpdateServiceCapabilityParams:" + cVar);
        return cVar;
    }

    public static int generateCheckSum(List<FrameworkServiceDescription> list, List<String> list2) {
        ArrayList<FrameworkServiceDescription> arrayList = new ArrayList();
        for (FrameworkServiceDescription frameworkServiceDescription : list) {
            if (list2.contains(frameworkServiceDescription.m())) {
                arrayList.add(frameworkServiceDescription);
            }
        }
        StringBuilder sbB = com.heytap.accessory.base.objectpool.a.b();
        Collections.sort(arrayList);
        Collections.sort(list2);
        for (FrameworkServiceDescription frameworkServiceDescription2 : arrayList) {
            sbB.append(frameworkServiceDescription2.d());
            sbB.append(frameworkServiceDescription2.m());
            sbB.append(frameworkServiceDescription2.a());
            sbB.append(frameworkServiceDescription2.o());
            sbB.append(frameworkServiceDescription2.n());
            sbB.append(frameworkServiceDescription2.i());
            sbB.append(frameworkServiceDescription2.q());
            sbB.append(frameworkServiceDescription2.h());
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            sbB.append(it.next());
        }
        CRC32 crc32 = new CRC32();
        crc32.update(sbB.toString().getBytes(CHARSET_TYPE));
        long value = crc32.getValue();
        com.heytap.accessory.base.objectpool.a.b(sbB);
        return (int) value;
    }

    public static b getServiceCapabilityParams(List<String> list, int i, int i2, long j2) {
        b bVar = new b();
        bVar.d = (byte) i2;
        bVar.f = (byte) i;
        bVar.f2659c = (int) j2;
        bVar.f2660e = list.size();
        for (String str : list) {
            b.C0257b c0257b = new b.C0257b();
            c0257b.a = str;
            bVar.b.add(c0257b);
        }
        return bVar;
    }

    public static String getSimpleLogString(List<FrameworkServiceDescription> list) {
        if (AFArraysUtils.isEmpty(list)) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        for (FrameworkServiceDescription frameworkServiceDescription : list) {
            if (frameworkServiceDescription == null) {
                sb.append("null;");
            } else {
                sb.append(n04.OPEN_BRACE_REGEX);
                sb.append(frameworkServiceDescription.m());
                sb.append(",");
                sb.append(frameworkServiceDescription.o());
                sb.append(",");
                sb.append(frameworkServiceDescription.a());
                sb.append("}");
            }
        }
        return sb.toString();
    }

    public static int getUniqueKeyForCapabilityDiscovery(String str, String str2) {
        int iHashCode = str.hashCode();
        int iHashCode2 = str2.hashCode();
        return iHashCode == iHashCode2 ? iHashCode : iHashCode ^ iHashCode2;
    }

    public static boolean matchLocalServiceDesc(FrameworkServiceDescription frameworkServiceDescription, FrameworkServiceDescription frameworkServiceDescription2) {
        if (!frameworkServiceDescription.d().equals(frameworkServiceDescription2.d()) || !frameworkServiceDescription.n().equals(frameworkServiceDescription2.n()) || !frameworkServiceDescription.c().equals(frameworkServiceDescription2.c())) {
            return false;
        }
        if (frameworkServiceDescription.b() == null && frameworkServiceDescription2.b() != null) {
            return false;
        }
        if ((frameworkServiceDescription.b() == null || frameworkServiceDescription.b().equals(frameworkServiceDescription2.b())) && frameworkServiceDescription.j() == frameworkServiceDescription2.j() && frameworkServiceDescription.r() == frameworkServiceDescription2.r() && frameworkServiceDescription.o() == frameworkServiceDescription2.o() && frameworkServiceDescription.i() == frameworkServiceDescription2.i() && frameworkServiceDescription.h() == frameworkServiceDescription2.h() && frameworkServiceDescription.p() == frameworkServiceDescription2.p() && frameworkServiceDescription.q() == frameworkServiceDescription2.q() && frameworkServiceDescription.f().size() == frameworkServiceDescription2.f().size() && frameworkServiceDescription.e() == frameworkServiceDescription2.e()) {
            for (FrameworkServiceChannelDescription frameworkServiceChannelDescription : frameworkServiceDescription.f()) {
                boolean z = false;
                for (FrameworkServiceChannelDescription frameworkServiceChannelDescription2 : frameworkServiceDescription2.f()) {
                    if (frameworkServiceChannelDescription.a() == frameworkServiceChannelDescription2.a()) {
                        if (frameworkServiceChannelDescription.c() != frameworkServiceChannelDescription2.c() || frameworkServiceChannelDescription.d() != frameworkServiceChannelDescription2.d() || frameworkServiceChannelDescription.b() != frameworkServiceChannelDescription2.b()) {
                            return false;
                        }
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static int matchRemoteServiceDesc(FrameworkServiceDescription frameworkServiceDescription, FrameworkServiceDescription frameworkServiceDescription2) {
        boolean z = (frameworkServiceDescription.i() & frameworkServiceDescription2.i()) != 0;
        boolean zEqualsIgnoreCase = frameworkServiceDescription.m().equalsIgnoreCase(frameworkServiceDescription2.m());
        boolean z2 = frameworkServiceDescription.o() == frameworkServiceDescription2.o();
        if (z && zEqualsIgnoreCase && !z2) {
            return 0;
        }
        return zEqualsIgnoreCase ? 2 : 1;
    }
}
