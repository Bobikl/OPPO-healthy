package com.heytap.accessory.connectivity.core.data;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public int a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2520c;

    public String toString() {
        StringBuilder sbA = com.heytap.accessory.base.objectpool.a.a();
        try {
            sbA.append(",Connectivity: ");
            sbA.append(this.a);
            sbA.append(",Retry: ");
            sbA.append(this.f2520c);
            sbA.append(",Package: ");
            sbA.append(this.b);
            return sbA.toString();
        } finally {
            com.heytap.accessory.base.objectpool.a.a(sbA);
        }
    }
}
