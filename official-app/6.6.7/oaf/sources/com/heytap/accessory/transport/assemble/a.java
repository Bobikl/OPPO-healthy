package com.heytap.accessory.transport.assemble;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String e = "a";
    public final int a;
    public boolean b;
    public long c;
    public int d;

    public a(int i, int i2, int i3) {
        this.b = false;
        com.heytap.accessory.base.logging.a.a(e, "AFFragmenter maxSize=" + i + " ,procedure=" + i2 + ", connectivityType=" + i3);
        this.a = i;
        this.d = i3;
        a(i2);
        if (i2 == 0) {
            this.c = 0L;
        } else {
            this.b = true;
            this.c = 1L;
        }
    }

    public final boolean a(int i) {
        return (i & 1) == 1;
    }

    public List<com.heytap.accessory.message.b> b(long j, com.heytap.accessory.message.a aVar) {
        if (b(aVar.g())) {
            com.heytap.accessory.base.logging.a.d(e, "Fragmentation is required, size = " + aVar.g());
            return a(j, aVar);
        }
        aVar.a(this.c);
        if (!a(aVar, (byte) 0, this.b)) {
            com.heytap.accessory.base.logging.a.b(e, "Error failed to compose the protocol frame!");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.heytap.accessory.message.b bVar = new com.heytap.accessory.message.b(j, aVar.j());
        bVar.a(aVar);
        bVar.a(UUID.randomUUID().toString());
        arrayList.add(bVar);
        b();
        return arrayList;
    }

    public final List<com.heytap.accessory.message.b> a(long j, com.heytap.accessory.message.a aVar) {
        byte b;
        String str = e;
        com.heytap.accessory.base.logging.a.d(str, "mMaxFragmentSize size = " + this.a + ", rawData:");
        ArrayList arrayList = new ArrayList();
        List<com.heytap.accessory.message.a> listA = aVar.a(j, this.a, this.d);
        int size = listA.size();
        com.heytap.accessory.base.logging.a.d(str, "Total number of fragments : " + size);
        for (int i = 0; i < size; i++) {
            com.heytap.accessory.message.a aVar2 = listA.get(i);
            String str2 = e;
            com.heytap.accessory.base.logging.a.a(str2, "fragment before msg:" + aVar2.h());
            if (i == 0) {
                com.heytap.accessory.base.logging.a.d(str2, "Processing first fragment");
                b = 1;
            } else if (i == size - 1) {
                com.heytap.accessory.base.logging.a.d(str2, "Processing last fragment");
                b = 3;
            } else {
                com.heytap.accessory.base.logging.a.d(str2, "Processing middle fragment");
                b = 2;
            }
            aVar2.a(this.c);
            if (!a(aVar2, b, this.b)) {
                com.heytap.accessory.base.logging.a.b(str2, "Error failed to compose the protocol frame!");
                return null;
            }
            com.heytap.accessory.message.b bVar = new com.heytap.accessory.message.b(j, aVar2.j());
            bVar.a(UUID.randomUUID().toString());
            bVar.a(aVar2);
            arrayList.add(bVar);
            b();
            com.heytap.accessory.base.logging.a.a(str2, "fragment after msg:" + bVar.d());
        }
        aVar.f().recycle();
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final void b() {
        if (this.b) {
            long j = this.c + 1;
            this.c = j;
            if (j > 65535) {
                this.c = j % 65535;
            }
        }
    }

    public final boolean b(int i) {
        return i > this.a;
    }

    public boolean a() {
        return this.b;
    }

    public final boolean a(com.heytap.accessory.message.a aVar, byte b, boolean z) {
        return com.heytap.accessory.transport.c.a(aVar, b, z);
    }
}
