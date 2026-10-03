package com.heytap.accessory.misc.constants;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public enum a {
    b((byte) 0),
    c((byte) 1),
    d((byte) 2);

    public byte a;

    a(byte b2) {
        this.a = b2;
    }

    public static a a(byte b2) {
        for (a aVar : values()) {
            if (aVar.a == b2) {
                return aVar;
            }
        }
        return b;
    }

    public byte a() {
        return this.a;
    }
}
