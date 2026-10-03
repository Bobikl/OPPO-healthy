package com.heytap.accessory.sdp.service.protocol;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public List<a> a = new ArrayList();
    public List<b> b = new ArrayList();
    public int c;
    public byte d;
    public int e;
    public byte f;

    public static class a {
        public String a;
        public String b;
        public List<c> c = new ArrayList();

        public String toString() {
            return "AleInfo{appName='" + this.a + "', appHash='" + this.b + "', serviceRecords=" + this.c + '}';
        }
    }

    public static class b {
        public String a;

        public String toString() {
            return "AspFilter{profileId='" + this.a + "'}";
        }
    }

    public static class c {
        public int a;
        public int b;
        public int c;
        public String d;
        public byte e;

        public String toString() {
            return "ServiceInfo{profileVersion=" + this.a + ", agentId=" + this.b + ", connTimeOut=" + this.c + ", profileId='" + this.d + "', role=" + ((int) this.e) + '}';
        }
    }

    public String toString() {
        return "ServiceDiscoveryMessageParams{mAleRecords=" + this.a + ", mAspFilters=" + this.b + ", mChecksum=" + this.c + ", mMessageType=" + ((int) this.d) + ", mNoOfRecords=" + this.e + ", mQueryType=" + ((int) this.f) + '}';
    }
}
