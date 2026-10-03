package com.heytap.accessory.misc.utils;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class e {
    public static final String a = "e";
    public static Map<String, com.heytap.accessory.sdp.endpoint.d.a> b = new ConcurrentHashMap();

    public static void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.sdp.endpoint.d.a aVar) {
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.e(a, "NULL peerParams received! ");
        } else {
            if (aVar.a() == null) {
                com.heytap.accessory.base.logging.a.e(a, "Invalid peerId received! ");
                return;
            }
            String strA = a(bVar.d(), bVar.h(), bVar.F());
            a(strA, aVar);
            b.put(strA, aVar);
        }
    }

    public static void b() {
        b = a();
    }

    public static com.heytap.accessory.sdp.endpoint.d.a b(String str, int i, int i2) {
        return b.get(a(str, i, i2));
    }

    public static void a(String str, com.heytap.accessory.sdp.endpoint.d.a aVar) {
        String strA;
        int i;
        if (PlatformUtils.getContext() != null && aVar != null) {
            char c = 0;
            SharedPreferences sharedPreferences = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0);
            String string = sharedPreferences.getString("PeerIdStringMap", null);
            HashMap map = new HashMap();
            if (string != null) {
                String[] strArrSplit = string.split("/");
                int length = strArrSplit.length;
                int i2 = 0;
                while (i2 < length) {
                    String[] strArrSplit2 = strArrSplit[i2].split(";");
                    if (strArrSplit2.length == 3) {
                        String[] strArrSplit3 = strArrSplit2[c].split("_");
                        if (strArrSplit3.length <= 0) {
                            com.heytap.accessory.base.logging.a.e(a, "cachePeerParams invalid!");
                            return;
                        }
                        String str2 = strArrSplit3[c];
                        com.heytap.accessory.base.logging.a.c(a, "cache PeerParams <address: " + PlatformUtils.getAddrforLog(str2) + ", PeerVersion: " + strArrSplit2[2] + ">");
                        try {
                            i = Integer.parseInt(strArrSplit2[2]);
                        } catch (NumberFormatException unused) {
                            com.heytap.accessory.base.logging.a.e(a, "params error:" + strArrSplit2[2]);
                            i = 0;
                        }
                        map.put(strArrSplit2[0], new com.heytap.accessory.sdp.endpoint.d.a(strArrSplit2[1], i));
                    }
                    i2++;
                    strArrSplit = strArrSplit;
                    c = 0;
                }
            }
            String strA2 = aVar.a();
            String strValueOf = String.valueOf(aVar.b());
            com.heytap.accessory.sdp.endpoint.d.a aVar2 = (com.heytap.accessory.sdp.endpoint.d.a) map.get(str);
            if (aVar2 == null || (strA = aVar2.a()) == null || !strA.equalsIgnoreCase(strA2)) {
                map.put(str, aVar);
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            StringBuilder sbA = com.heytap.accessory.base.objectpool.a.a();
            for (Map.Entry entry : map.entrySet()) {
                sbA.append((String) entry.getKey());
                sbA.append(";");
                sbA.append(((com.heytap.accessory.sdp.endpoint.d.a) entry.getValue()).a());
                sbA.append(";");
                sbA.append(((com.heytap.accessory.sdp.endpoint.d.a) entry.getValue()).b());
                sbA.append("/");
            }
            editorEdit.putString("PeerIdStringMap", sbA.toString());
            String[] strArrSplit4 = str.split("_");
            if (strArrSplit4.length <= 0) {
                return;
            }
            String str3 = strArrSplit4[0];
            if (editorEdit.commit()) {
                com.heytap.accessory.base.logging.a.c(a, "PeerId cached successfully: <" + PlatformUtils.getAddrforLog(str3) + "; " + strValueOf + ">");
            } else {
                com.heytap.accessory.base.logging.a.e(a, "Failed to cache the peerId <" + PlatformUtils.getAddrforLog(str3) + "; " + strValueOf + "> !!!");
            }
            com.heytap.accessory.base.logging.a.c(a, "Num of Cached PeerId: " + map.size());
            com.heytap.accessory.base.objectpool.a.a(sbA);
            return;
        }
        com.heytap.accessory.base.logging.a.e(a, "Failed to cache the peer parameters! Context/PeerParams not assigned!");
    }

    public static HashMap<String, com.heytap.accessory.sdp.endpoint.d.a> a() {
        int i;
        HashMap<String, com.heytap.accessory.sdp.endpoint.d.a> map = null;
        if (PlatformUtils.getContext() == null) {
            com.heytap.accessory.base.logging.a.e(a, "Failed to get cached peer ids! Context not assigned!");
        } else {
            String string = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).getString("PeerIdStringMap", null);
            map = new HashMap<>();
            if (string == null) {
                com.heytap.accessory.base.logging.a.e(a, "No cached Peer Ids found!");
            } else {
                for (String str : string.split("/")) {
                    String[] strArrSplit = str.split(";");
                    if (strArrSplit.length == 3) {
                        String[] strArrSplit2 = strArrSplit[0].split("_");
                        if (strArrSplit2.length <= 0) {
                            com.heytap.accessory.base.logging.a.e(a, "peerParams error");
                            return map;
                        }
                        com.heytap.accessory.base.logging.a.c(a, "Loaded PeerParams <address: " + PlatformUtils.getAddrforLog(strArrSplit2[0]) + ", PeerVersion: " + strArrSplit[2] + ">");
                        try {
                            i = Integer.parseInt(strArrSplit[2]);
                        } catch (NumberFormatException unused) {
                            com.heytap.accessory.base.logging.a.e(a, "params error:" + strArrSplit[2]);
                            i = 0;
                        }
                        map.put(strArrSplit[0], new com.heytap.accessory.sdp.endpoint.d.a(strArrSplit[1], i));
                    }
                }
                com.heytap.accessory.base.logging.a.c(a, "Num of Cached PeerId: " + map.size());
            }
        }
        return map;
    }

    public static String a(String str, int i, int i2) {
        return g.c(str) + "_" + i + "_" + i2;
    }
}
