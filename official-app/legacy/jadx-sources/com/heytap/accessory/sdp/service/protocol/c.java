package com.heytap.accessory.sdp.service.protocol;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public List<a> a = new ArrayList();
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f2664c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f2665e;

    public static class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<b> f2666c = new ArrayList();
        public byte d;

        public String toString() {
            return "AleRecord{appName='" + this.a + "', appHash='" + this.b + "', serviceRecords=" + this.f2666c + ", updateType=" + ((int) this.d) + '}';
        }
    }

    public static class b {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2667c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f2668e;

        public String toString() {
            return "ServiceAgentRecord{aspVersion=" + this.a + ", componentId=" + this.b + ", connTimeOut=" + this.f2667c + ", profileId='" + this.d + "', role=" + ((int) this.f2668e) + '}';
        }
    }

    public String toString() {
        return "ServiceDiscoveryUpdateParams{mAleRecords=" + this.a + ", mCheckSum=" + this.b + ", mMessageType=" + ((int) this.f2664c) + ", mNoOfRecords=" + this.d + ", mQueryType=" + ((int) this.f2665e) + '}';
    }
}
