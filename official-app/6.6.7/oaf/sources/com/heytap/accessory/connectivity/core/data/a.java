package com.heytap.accessory.connectivity.core.data;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public int a;
    public String b;
    public int c;

    public String toString() {
        StringBuilder sbA = com.heytap.accessory.base.objectpool.a.a();
        try {
            sbA.append(",Connectivity: ");
            sbA.append(this.a);
            sbA.append(",Retry: ");
            sbA.append(this.c);
            sbA.append(",Package: ");
            sbA.append(this.b);
            return sbA.toString();
        } finally {
            com.heytap.accessory.base.objectpool.a.a(sbA);
        }
    }
}
