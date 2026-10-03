package com.heytap.accessory.sdp.service.protocol;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public List<a> a = new ArrayList();
    public List<C0257b> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2659c;
    public byte d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2660e;
    public byte f;

    public static class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<c> f2661c = new ArrayList();

        public String toString() {
            return "AleInfo{appName='" + this.a + "', appHash='" + this.b + "', serviceRecords=" + this.f2661c + '}';
        }
    }

    /* JADX INFO: renamed from: com.heytap.accessory.sdp.service.protocol.b$b, reason: collision with other inner class name */
    public static class C0257b {
        public String a;

        public String toString() {
            return "AspFilter{profileId='" + this.a + "'}";
        }
    }

    public static class c {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2662c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f2663e;

        public String toString() {
            return "ServiceInfo{profileVersion=" + this.a + ", agentId=" + this.b + ", connTimeOut=" + this.f2662c + ", profileId='" + this.d + "', role=" + ((int) this.f2663e) + '}';
        }
    }

    public String toString() {
        return "ServiceDiscoveryMessageParams{mAleRecords=" + this.a + ", mAspFilters=" + this.b + ", mChecksum=" + this.f2659c + ", mMessageType=" + ((int) this.d) + ", mNoOfRecords=" + this.f2660e + ", mQueryType=" + ((int) this.f) + '}';
    }
}
