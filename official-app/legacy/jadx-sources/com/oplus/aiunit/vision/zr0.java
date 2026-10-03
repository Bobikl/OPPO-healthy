package com.oplus.aiunit.vision;

import com.heytap.health.home.sp.HomeSpConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class zr0 {
    public static String[] BACKUP_SP_NAMES = {HomeSpConfig.DEFAULT_SP_NAME, "health_oobe_protocol", "privacy_sync_data_state"};
    public static Map<String, Map<String, Boolean>> BACKUP_SP_KEYS = new HashMap();

    static {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("tourist_mode", bool);
        map.put("login_granted", bool);
        BACKUP_SP_KEYS.put(HomeSpConfig.DEFAULT_SP_NAME, map);
        HashMap map2 = new HashMap();
        Boolean bool2 = Boolean.TRUE;
        map2.put("privacy_version", bool2);
        map2.put("protocol_version", bool2);
        map2.put("net_privacy_version", bool2);
        map2.put("net_protocol_version", bool2);
        map2.put("tourist_proto_health", bool2);
        map2.put("isHaveInternet", bool2);
        map2.put("needShowProto", bool2);
        map2.put("isAgreeTouristProtocol", bool2);
        map2.put("isAgreeProtocol", bool2);
        BACKUP_SP_KEYS.put("health_oobe_protocol", map2);
        HashMap map3 = new HashMap();
        map3.put("privacy_data_sync_state", bool);
        map3.put("personalized_data_sync_state", bool);
        BACKUP_SP_KEYS.put("privacy_sync_data_state", map3);
    }

    public static Map<String, Boolean> a(String str) {
        return BACKUP_SP_KEYS.get(str);
    }

    public static boolean b(String str) {
        for (String str2 : BACKUP_SP_NAMES) {
            if (Objects.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        Map<String, Boolean> mapA = a(str);
        if (mapA == null || mapA.isEmpty()) {
            return false;
        }
        return mapA.containsKey(str2);
    }

    public static boolean d(String str, String str2) {
        Map<String, Boolean> mapA = a(str);
        return mapA != null && !mapA.isEmpty() && mapA.containsKey(str2) && Boolean.FALSE.equals(mapA.get(str2));
    }
}
