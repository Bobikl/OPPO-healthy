package com.heytap.accessory.sdp.service.protocol;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public List<a> a = new ArrayList();
    public int b;
    public byte c;
    public int d;
    public byte e;

    public static class a {
        public String a;
        public String b;
        public List<b> c = new ArrayList();
        public byte d;

        public String toString() {
            return "AleRecord{appName='" + this.a + "', appHash='" + this.b + "', serviceRecords=" + this.c + ", updateType=" + ((int) this.d) + '}';
        }
    }

    public static class b {
        public int a;
        public int b;
        public int c;
        public String d;
        public byte e;

        public String toString() {
            return "ServiceAgentRecord{aspVersion=" + this.a + ", componentId=" + this.b + ", connTimeOut=" + this.c + ", profileId='" + this.d + "', role=" + ((int) this.e) + '}';
        }
    }

    public String toString() {
        return "ServiceDiscoveryUpdateParams{mAleRecords=" + this.a + ", mCheckSum=" + this.b + ", mMessageType=" + ((int) this.c) + ", mNoOfRecords=" + this.d + ", mQueryType=" + ((int) this.e) + '}';
    }
}
