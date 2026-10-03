package com.heytap.accessory.transport.credit;

import com.heytap.accessory.base.AccessoryManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final String b = "b";
    public static b c;
    public Map<Integer, Map<Integer, a>> a = new HashMap();

    public b() {
        b();
    }

    public static synchronized b a() {
        if (c == null) {
            synchronized (b.class) {
                c = new b();
            }
        }
        return c;
    }

    public final void b() {
        a(2);
        a(1);
        a(4);
    }

    public synchronized void c(long j, int i, int i2) {
        b(j, i, i2).a(i);
    }

    public final a b(long j, int i, int i2) {
        List<Integer> listA = com.heytap.accessory.connectivity.negotiation.b.b().a(j);
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        if (bVarA == null || bVarA.o() == 0 || (i2 != 1 && (listA == null || !listA.contains(Integer.valueOf(i2))))) {
            i2 = 1;
        }
        Map<Integer, a> map = this.a.get(Integer.valueOf(i));
        if (map == null) {
            return null;
        }
        a aVar = map.get(Integer.valueOf(i2));
        return aVar == null ? map.get(1) : aVar;
    }

    public synchronized boolean a(long j, int i, int i2, int i3, int i4, boolean z) {
        return b(j, i, i2).a(i, i3, i4, z);
    }

    public synchronized boolean a(long j, int i, int i2, int i3, int i4) {
        return b(j, i, i2).a(i, i3, i4);
    }

    public synchronized boolean a(long j, int i, int i2, int i3) {
        return b(j, i, i2).a(i, i3);
    }

    public synchronized void a(long j, int i) {
        com.heytap.accessory.base.logging.a.a(b, "reset " + i);
        Map<Integer, a> map = this.a.get(Integer.valueOf(i));
        if (map == null) {
            return;
        }
        Iterator<a> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().a(i);
        }
    }

    public synchronized boolean a(long j, int i, int i2) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        if (bVarA != null && bVarA.o() == 0) {
            com.heytap.accessory.base.logging.a.e(b, "add credit error, acc not support");
            return false;
        }
        Map<Integer, a> map = this.a.get(Integer.valueOf(i));
        if (map == null) {
            return false;
        }
        if (map.get(Integer.valueOf(i2)) != null) {
            com.heytap.accessory.base.logging.a.e(b, "add credit error, exist");
            return false;
        }
        map.put(Integer.valueOf(i2), new d(i, i2));
        return true;
    }

    public final void a(int i) {
        c cVar = new c();
        d dVar = new d(i, 0);
        d dVar2 = new d(i, 2);
        HashMap map = new HashMap(3);
        map.put(1, cVar);
        map.put(0, dVar);
        map.put(2, dVar2);
        this.a.put(Integer.valueOf(i), map);
    }
}
