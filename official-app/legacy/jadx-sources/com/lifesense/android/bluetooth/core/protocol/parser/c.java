package com.lifesense.android.bluetooth.core.protocol.parser;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceData;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static Map<PacketProfile, a> a = new ConcurrentHashMap();

    public static class a {
        public String a;
        public Class<? extends BaseDeviceData> b;

        public Class<? extends BaseDeviceData> a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            Class<? extends BaseDeviceData> clsA = a();
            Class<? extends BaseDeviceData> clsA2 = aVar.a();
            return clsA != null ? clsA.equals(clsA2) : clsA2 == null;
        }

        public int hashCode() {
            String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            Class<? extends BaseDeviceData> clsA = a();
            return ((iHashCode + 59) * 59) + (clsA != null ? clsA.hashCode() : 43);
        }

        public String toString() {
            return "PackageDecoderHandler.PackageDefine(type=" + b() + ", clazz=" + a() + ")";
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }
    }

    public static a a(PacketProfile packetProfile) {
        if (a.containsKey(packetProfile)) {
            return a.get(packetProfile);
        }
        return null;
    }
}
