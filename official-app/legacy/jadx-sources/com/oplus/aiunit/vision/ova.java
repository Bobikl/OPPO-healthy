package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oppo.obus.common.report.core.entity.v32.Body;
import com.oppo.obus.common.report.core.entity.v32.DataItem;
import com.oppo.obus.common.report.core.entity.v32.Head;
import com.oppo.obus.common.report.core.entity.v32.Message;
import io.netty.util.internal.StringUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ova {
    public static final int MAX_BATCH_COUNT = 100;
    public static final int MAX_BATCH_SIZE_BYTES = 921600;
    public static final ThreadLocal<MessageDigest> a = new a();

    public class a extends ThreadLocal<MessageDigest> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class b {
        public final Message a;
        public final Message b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Long> f15080c;
        public final boolean d;

        public b(Message message, Message message2, List<Long> list, boolean z) {
            this.a = message;
            this.b = message2;
            this.f15080c = list;
            this.d = z;
        }

        public static b a(Message message, List<Long> list) {
            return new b(message, null, list, false);
        }

        public static b b(Message message, List<Long> list) {
            return new b(null, message, list, true);
        }
    }

    public static class c {
        public final long a;
        public final JSONObject b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JSONObject f15081c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final zs6 f15082e;
        public final int f;

        public c(long j2, JSONObject jSONObject, JSONObject jSONObject2, String str, zs6 zs6Var, int i) {
            this.a = j2;
            this.b = jSONObject;
            this.f15081c = jSONObject2;
            this.d = str;
            this.f15082e = zs6Var;
            this.f = i;
        }
    }

    public static List<b> a(List<c> list, String str, long j2) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c cVar : list) {
            String str2 = cVar.d;
            List arrayList2 = (List) linkedHashMap.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str2, arrayList2);
            }
            arrayList2.add(cVar);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            if (!list2.isEmpty()) {
                boolean z = ((c) list2.get(0)).f15082e != null && ((c) list2.get(0)).f15082e.i() == 0;
                Head headC = c(((c) list2.get(0)).b, str, j2);
                if (headC == null) {
                    z6b.u("LegacyUploadJsonAdapter", "adaptBatch: failed to build common head for fingerprint group");
                } else {
                    arrayList.addAll(l(list2, headC, z, str, j2));
                }
            }
        }
        return arrayList;
    }

    public static b b(List<c> list, List<Long> list2, Head head, boolean z) {
        if (list.isEmpty()) {
            return null;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (c cVar : list) {
                DataItem dataItemE = e(cVar.b, cVar.f15081c, cVar.f15082e);
                if (dataItemE != null) {
                    arrayList.add(dataItemE);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            Message message = new Message();
            message.setCommonHead(head);
            message.setDatas(arrayList);
            return b.b(message, new ArrayList(list2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (c cVar2 : list) {
            DataItem dataItemD = d(cVar2.b, cVar2.f15081c);
            if (dataItemD != null) {
                arrayList2.add(dataItemD);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        Message message2 = new Message();
        message2.setCommonHead(head);
        message2.setDatas(arrayList2);
        return b.a(message2, new ArrayList(list2));
    }

    public static Head c(JSONObject jSONObject, String str, long j2) {
        int i;
        String strK = k(jSONObject, "$client_id", null);
        int iOptInt = jSONObject.optInt("$client_type", 0);
        k(jSONObject, "$custom_client_id", null);
        String strK2 = k(jSONObject, "$ouid", null);
        String strK3 = k(jSONObject, "$duid", null);
        String strK4 = k(jSONObject, "$brand", null);
        String strK5 = k(jSONObject, "$model", null);
        int iOptInt2 = jSONObject.optInt("$platform", 0);
        String strK6 = k(jSONObject, "$os_version", null);
        String strK7 = k(jSONObject, "$rom_version", null);
        String strK8 = k(jSONObject, "$android_version", null);
        String strK9 = k(jSONObject, "$sdk_package_name", null);
        int iOptInt3 = jSONObject.optInt("$sdk_version", 0);
        String strK10 = k(jSONObject, "$channel", null);
        int iOptInt4 = jSONObject.optInt("$carrier", 0);
        String strK11 = k(jSONObject, "$region", null);
        String strK12 = k(jSONObject, "$region_mark", null);
        String strK13 = k(jSONObject, "$multi_user_id", null);
        String strK14 = k(jSONObject, "$app_id", null);
        String strK15 = k(jSONObject, "$app_uuid", null);
        String strK16 = k(jSONObject, "$app_package", null);
        String strK17 = k(jSONObject, "$app_version", null);
        String strK18 = k(jSONObject, "$user_id", null);
        String strK19 = k(jSONObject, "$cloud_config_product_version", null);
        String strK20 = k(jSONObject, "$region_code", null);
        try {
            String strK21 = k(jSONObject, "$app_version_code", null);
            i = !TextUtils.isEmpty(strK21) ? Integer.parseInt(strK21) : 0;
        } catch (Exception unused) {
            i = 0;
        }
        return new Head(String.valueOf(iOptInt), strK, strK2, strK3, strK18, strK4, strK5, String.valueOf(iOptInt2), strK6, strK7, strK8, strK9, String.valueOf(iOptInt3), strK10, String.valueOf(iOptInt4), str, k(jSONObject, "$event_access", null), strK11, strK20, strK12, strK13, strK14, strK15, strK16, strK17, Long.valueOf(i), Integer.valueOf(jSONObject.optInt("$track_type", 0)), strK19, j2, null, null, null, null, null, 1);
    }

    public static DataItem d(JSONObject jSONObject, JSONObject jSONObject2) {
        Map<String, Object> mapH = h(jSONObject);
        String strK = k(jSONObject, "$custom_client_id", null);
        Map<String, Object> mapI = i(jSONObject2);
        String strK2 = k(jSONObject2, "$event_group", null);
        String strK3 = k(jSONObject2, "$event_id", null);
        long jOptLong = jSONObject2.optLong("$event_time", 0L);
        return new DataItem(strK, mapH, new Body(k(jSONObject2, "$sequence_id", null), jSONObject2.optInt("$event_time_type", 1), jOptLong, 0L, null, k(jSONObject2, "$session_id", null), mapI, null, strK2, strK3));
    }

    public static DataItem e(JSONObject jSONObject, JSONObject jSONObject2, zs6 zs6Var) {
        Map<String, Object> mapH = h(jSONObject);
        String strK = k(jSONObject, "$custom_client_id", null);
        int iF = (int) zs6Var.f();
        Map<String, Object> mapI = i(jSONObject2);
        mapI.remove("$event_group");
        mapI.remove("$event_id");
        mapI.remove("$app_id");
        long jOptLong = jSONObject2.optLong("$event_time", 0L);
        return new DataItem(strK, mapH, new Body(k(jSONObject2, "$sequence_id", null), jSONObject2.optInt("$event_time_type", 1), jOptLong, 0L, null, k(jSONObject2, "$session_id", null), mapI, Integer.valueOf(iF), null, null));
    }

    public static String f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add("$access");
        treeSet.add("$post_time");
        String strM = m(jSONObject, treeSet);
        return TextUtils.isEmpty(strM) ? "" : o(j(strM.getBytes(StandardCharsets.UTF_8)));
    }

    public static int g(JSONObject jSONObject, JSONObject jSONObject2) {
        int length = jSONObject != null ? 0 + jSONObject.toString().length() : 0;
        if (jSONObject2 != null) {
            length += jSONObject2.toString().length();
        }
        return (int) (((double) length) * 1.5d);
    }

    public static Map<String, Object> h(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("$custom_head")) {
            return Collections.emptyMap();
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("$custom_head");
            if (jSONObjectOptJSONObject == null) {
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.get(next));
            }
            return map;
        } catch (Exception e2) {
            z6b.p("LegacyUploadJsonAdapter", "extractCustomHead error", e2);
            return Collections.emptyMap();
        }
    }

    public static Map<String, Object> i(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("$event_info")) {
            return new HashMap();
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("$event_info");
            if (jSONObjectOptJSONObject == null) {
                return new HashMap();
            }
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, String.valueOf(jSONObjectOptJSONObject.get(next)));
            }
            return map;
        } catch (Exception e2) {
            z6b.p("LegacyUploadJsonAdapter", "extractEventInfo error", e2);
            return new HashMap();
        }
    }

    public static byte[] j(byte[] bArr) {
        MessageDigest messageDigest = a.get();
        if (messageDigest == null || bArr == null) {
            return new byte[0];
        }
        messageDigest.reset();
        return messageDigest.digest(bArr);
    }

    public static String k(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return str2;
        }
        String strOptString = jSONObject.optString(str, null);
        return TextUtils.isEmpty(strOptString) ? str2 : strOptString;
    }

    public static List<b> l(List<c> list, Head head, boolean z, String str, long j2) {
        b bVarB;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (c cVar : list) {
            boolean z2 = true;
            if (arrayList2.size() < 100 && cVar.f + i + 1000 <= 921600) {
                z2 = false;
            }
            if (z2 && !arrayList2.isEmpty()) {
                b bVarB2 = b(arrayList2, arrayList3, head, z);
                if (bVarB2 != null) {
                    arrayList.add(bVarB2);
                }
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                i = 0;
            }
            arrayList2.add(cVar);
            arrayList3.add(Long.valueOf(cVar.a));
            i += cVar.f;
        }
        if (!arrayList2.isEmpty() && (bVarB = b(arrayList2, arrayList3, head, z)) != null) {
            arrayList.add(bVarB);
        }
        return arrayList;
    }

    public static String m(JSONObject jSONObject, Set<String> set) {
        if (jSONObject == null) {
            return "";
        }
        TreeSet<String> treeSet = new TreeSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (set == null || !set.contains(next)) {
                treeSet.add(next);
            }
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append('{');
        boolean z = true;
        for (String str : treeSet) {
            Object objOpt = jSONObject.opt(str);
            if (!z) {
                sb.append(StringUtil.COMMA);
            }
            sb.append(str);
            sb.append(':');
            sb.append(n(objOpt));
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static String n(Object obj) {
        if (obj == null || obj == JSONObject.NULL) {
            return "null";
        }
        if (obj instanceof JSONObject) {
            return m((JSONObject) obj, null);
        }
        if (!(obj instanceof JSONArray)) {
            return String.valueOf(obj);
        }
        JSONArray jSONArray = (JSONArray) obj;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                sb.append(StringUtil.COMMA);
            }
            sb.append(n(jSONArray.opt(i)));
        }
        sb.append(']');
        return sb.toString();
    }

    public static String o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            int i3 = i + 1;
            cArr[i] = charArray[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = charArray[i2 & 15];
        }
        return new String(cArr);
    }
}
