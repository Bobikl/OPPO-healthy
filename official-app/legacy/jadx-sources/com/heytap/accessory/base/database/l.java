package com.heytap.accessory.base.database;

import android.content.Context;
import com.heytap.accessory.misc.utils.PlatformUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2451e = "l";
    public Context a;
    public e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f2452c;
    public r d;

    public l() {
        Context defaultStorageContext = PlatformUtils.getDefaultStorageContext();
        this.a = defaultStorageContext;
        if (defaultStorageContext == null) {
            com.heytap.accessory.base.logging.a.b(f2451e, "Invalid context! SQLiteOpenHelper will not be initiatlized!");
            return;
        }
        AccessoryDatabase accessoryDatabaseB = AccessoryDatabase.b(defaultStorageContext);
        this.b = e.a(accessoryDatabaseB.a());
        this.f2452c = i.a(accessoryDatabaseB.b());
        this.d = r.a(accessoryDatabaseB.c());
    }

    public int a() {
        return 5;
    }

    public List<h> b(String str) {
        return !b() ? new ArrayList() : this.f2452c.a(str);
    }

    public String c(String str) {
        List<String> listA;
        return (!b() || (listA = this.d.a(str)) == null || listA.isEmpty()) ? "" : listA.get(0);
    }

    public List<q> a(int i) {
        return !b() ? new ArrayList() : this.d.a(i);
    }

    public List<h> b(String str, int i, int i2) {
        if (!b()) {
            return new ArrayList();
        }
        return this.f2452c.a(str, i, i2);
    }

    public List<d> a(long j2) {
        if (!b()) {
            return new ArrayList();
        }
        return this.b.a(j2);
    }

    public List<Long> c() {
        if (!b()) {
            return new ArrayList();
        }
        return this.d.a();
    }

    public long b(long j2) {
        if (b()) {
            return this.d.a(j2);
        }
        return -1L;
    }

    public List<h> a(String str, int i, int i2) {
        if (!b()) {
            return new ArrayList();
        }
        return this.f2452c.a(str, i, i2);
    }

    public long c(String str, int i, int i2) {
        List<h> listA;
        if (!b() || (listA = this.f2452c.a(str, i, i2)) == null || listA.isEmpty()) {
            return -1L;
        }
        return listA.get(0).a();
    }

    public int b(h hVar) {
        if (b()) {
            return this.f2452c.b(hVar);
        }
        return -1;
    }

    public long a(String str, String str2, long j2, String str3, int i) {
        if (b()) {
            return this.d.a(str, str2, j2, str3, i);
        }
        return -1L;
    }

    public long b(int i) {
        if (!b()) {
            return -1L;
        }
        com.heytap.accessory.base.logging.a.a(f2451e, "Service remove deviceId: " + i);
        return this.d.b(i);
    }

    public long a(h hVar) {
        if (!b()) {
            return -1L;
        }
        List<h> listA = this.f2452c.a(hVar.d(), hVar.e(), hVar.f());
        if (listA != null && !listA.isEmpty()) {
            return listA.get(0).c();
        }
        return this.f2452c.a(hVar);
    }

    public final boolean b() {
        return (this.a == null || this.d == null || this.f2452c == null || this.b == null) ? false : true;
    }

    public long a(q qVar) {
        if (!b()) {
            return -1L;
        }
        List<Integer> listA = this.d.a(qVar.m(), qVar.h(), qVar.d(), qVar.n());
        if (listA != null && !listA.isEmpty()) {
            com.heytap.accessory.base.logging.a.a(f2451e, "Service insert exist: " + qVar);
            return 0L;
        }
        com.heytap.accessory.base.logging.a.a(f2451e + " - SLPTrack", "insertServiceInfo, profileId:" + qVar.m() + ", awakenable:" + qVar.f());
        return this.d.a(qVar);
    }

    public String a(String str, Long l2, String str2, Integer num) {
        List<Long> listB;
        return (!b() || str == null || l2 == null || (listB = this.d.b(str, l2.longValue(), str2, num.intValue())) == null || listB.isEmpty()) ? "" : String.valueOf(listB.get(0));
    }

    public List<Long> a(List<d> list) {
        if (!b()) {
            return new ArrayList();
        }
        return this.b.a(list);
    }

    public int a(String str) {
        if (b()) {
            return this.b.a(str);
        }
        return -1;
    }

    public int a(int i, String str) {
        if (!b()) {
            return -1;
        }
        com.heytap.accessory.base.logging.a.a(f2451e, "Service removedeviceId: " + i + " agentId: " + str);
        return this.d.a(i, str);
    }

    public int a(String str, Long l2, String str2, int i) {
        List<Integer> listA;
        if (str == null || l2 == null || !b() || (listA = this.d.a(str, l2.longValue(), str2, i)) == null || listA.isEmpty()) {
            return -1;
        }
        return listA.get(0).intValue();
    }
}
