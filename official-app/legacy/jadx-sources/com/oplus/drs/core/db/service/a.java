package com.oplus.drs.core.db.service;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import com.oplus.aiunit.vision.bi8;
import com.oplus.aiunit.vision.bt6;
import com.oplus.aiunit.vision.co3;
import com.oplus.aiunit.vision.jo3;
import com.oplus.aiunit.vision.q7a;
import com.oplus.aiunit.vision.u56;
import com.oplus.aiunit.vision.wn3;
import com.oplus.aiunit.vision.x56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.aiunit.vision.zs6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public final jo3 a;
    public final jo3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wn3 f19734c;
    public final x56 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f19735e = ConcurrentHashMap.newKeySet();
    public volatile boolean f = false;
    public volatile n g;
    public volatile o h;

    /* JADX INFO: renamed from: com.oplus.drs.core.db.service.a$a, reason: collision with other inner class name */
    public class CallableC0957a implements Callable<Object[]> {
        public final /* synthetic */ long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f19736j;
        public final /* synthetic */ boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f19737l;
        public final /* synthetic */ Set m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int[] f19738n;

        public CallableC0957a(long j2, long j3, boolean z, boolean z2, Set set, int[] iArr) {
            this.i = j2;
            this.f19736j = j3;
            this.k = z;
            this.f19737l = z2;
            this.m = set;
            this.f19738n = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] call() {
            return a.this.a.j(this.i, this.f19736j, this.k, this.f19737l, this.m, this.f19738n);
        }
    }

    public class b implements Callable<List<co3>> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f19739j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f19740l;
        public final /* synthetic */ int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f19741n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ int[] p;

        public b(String str, long j2, long j3, long j4, int i, boolean z, boolean z2, int[] iArr) {
            this.i = str;
            this.f19739j = j2;
            this.k = j3;
            this.f19740l = j4;
            this.m = i;
            this.f19741n = z;
            this.o = z2;
            this.p = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<co3> call() {
            return a.this.a.i(this.i, this.f19739j, this.k, this.f19740l, this.m, this.f19741n, this.o, this.p);
        }
    }

    public class c implements Callable<long[]> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f19742j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f19743l;
        public final /* synthetic */ boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f19744n;
        public final /* synthetic */ int[] o;

        public c(String str, long j2, long j3, long j4, boolean z, boolean z2, int[] iArr) {
            this.i = str;
            this.f19742j = j2;
            this.k = j3;
            this.f19743l = j4;
            this.m = z;
            this.f19744n = z2;
            this.o = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public long[] call() {
            return a.this.a.p(this.i, this.f19742j, this.k, this.f19743l, this.m, this.f19744n, this.o);
        }
    }

    public class d implements Callable<Object[]> {
        public final /* synthetic */ long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f19745j;
        public final /* synthetic */ boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f19746l;
        public final /* synthetic */ Set m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int[] f19747n;

        public d(long j2, long j3, boolean z, boolean z2, Set set, int[] iArr) {
            this.i = j2;
            this.f19745j = j3;
            this.k = z;
            this.f19746l = z2;
            this.m = set;
            this.f19747n = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] call() {
            return a.this.a.m(this.i, this.f19745j, this.k, this.f19746l, this.m, this.f19747n);
        }
    }

    public class e implements Callable<List<co3>> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f19748j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f19749l;
        public final /* synthetic */ boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f19750n;
        public final /* synthetic */ int[] o;

        public e(String str, long j2, long j3, int i, boolean z, boolean z2, int[] iArr) {
            this.i = str;
            this.f19748j = j2;
            this.k = j3;
            this.f19749l = i;
            this.m = z;
            this.f19750n = z2;
            this.o = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<co3> call() {
            return a.this.a.n(this.i, this.f19748j, this.k, this.f19749l, this.m, this.f19750n, this.o);
        }
    }

    public class f implements Callable<long[]> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f19751j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f19752l;
        public final /* synthetic */ boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int[] f19753n;

        public f(String str, long j2, long j3, boolean z, boolean z2, int[] iArr) {
            this.i = str;
            this.f19751j = j2;
            this.k = j3;
            this.f19752l = z;
            this.m = z2;
            this.f19753n = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public long[] call() {
            return a.this.a.k(this.i, this.f19751j, this.k, this.f19752l, this.m, this.f19753n);
        }
    }

    public class g implements Callable<Object[]> {
        public final /* synthetic */ long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f19754j;
        public final /* synthetic */ boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f19755l;
        public final /* synthetic */ boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Set f19756n;
        public final /* synthetic */ int[] o;

        public g(long j2, long j3, boolean z, boolean z2, boolean z3, Set set, int[] iArr) {
            this.i = j2;
            this.f19754j = j3;
            this.k = z;
            this.f19755l = z2;
            this.m = z3;
            this.f19756n = set;
            this.o = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] call() {
            return a.this.f19734c.h(this.i, this.f19754j, this.k, this.f19755l, this.m, this.f19756n, this.o);
        }
    }

    public class h implements Callable<List<co3>> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f19757j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f19758l;
        public final /* synthetic */ long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f19759n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ boolean p;
        public final /* synthetic */ int[] q;

        public h(String str, int i, long j2, long j3, long j4, int i2, boolean z, boolean z2, int[] iArr) {
            this.i = str;
            this.f19757j = i;
            this.k = j2;
            this.f19758l = j3;
            this.m = j4;
            this.f19759n = i2;
            this.o = z;
            this.p = z2;
            this.q = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<co3> call() {
            return a.this.f19734c.j(this.i, this.f19757j, this.k, this.f19758l, this.m, this.f19759n, this.o, this.p, this.q);
        }
    }

    public class i implements Callable<long[]> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f19760j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f19761l;
        public final /* synthetic */ long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f19762n;
        public final /* synthetic */ boolean o;
        public final /* synthetic */ int[] p;

        public i(String str, int i, long j2, long j3, long j4, boolean z, boolean z2, int[] iArr) {
            this.i = str;
            this.f19760j = i;
            this.k = j2;
            this.f19761l = j3;
            this.m = j4;
            this.f19762n = z;
            this.o = z2;
            this.p = iArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public long[] call() {
            return a.this.f19734c.k(this.i, this.f19760j, this.k, this.f19761l, this.m, this.f19762n, this.o, this.p);
        }
    }

    public class j implements Callable<List<String>> {
        public j() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call() {
            List<String> listG = a.this.a.g();
            List<String> listG2 = a.this.f19734c.g();
            HashSet hashSet = new HashSet();
            if (listG != null) {
                hashSet.addAll(listG);
            }
            if (listG2 != null) {
                hashSet.addAll(listG2);
            }
            return new ArrayList(hashSet);
        }
    }

    public class k implements Callable<List<co3>> {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f19763j;

        public k(int i, boolean z) {
            this.i = i;
            this.f19763j = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<co3> call() {
            return a.this.b.l(this.i, this.f19763j);
        }
    }

    public class l implements Callable<Void> {
        public final /* synthetic */ List i;

        public l(List list) {
            this.i = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            SQLiteDatabase writableDatabase = a.this.d.getWritableDatabase();
            HashSet hashSet = new HashSet();
            for (zs6 zs6Var : this.i) {
                if (zs6Var != null && zs6Var.c() != null) {
                    hashSet.add(zs6Var.c());
                }
            }
            if (!hashSet.isEmpty()) {
                writableDatabase.beginTransaction();
                try {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        a.A(writableDatabase, (String) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            HashSet hashSet2 = new HashSet();
            for (zs6 zs6Var2 : this.i) {
                if (zs6Var2 != null) {
                    String strC = zs6Var2.c();
                    String strD = zs6Var2.d();
                    String strE = zs6Var2.e();
                    if (strC != null && strD != null && strE != null) {
                        writableDatabase.beginTransaction();
                        try {
                            boolean z = false;
                            if (zs6Var2.i() == 4 && q7a.f(zs6Var2.f19537j)) {
                                a.this.a.a(writableDatabase, zs6Var2);
                                a.this.f19734c.a(writableDatabase, zs6Var2);
                                if ((zs6Var2.j() == 2 || zs6Var2.j() == 1) && a.n(writableDatabase, zs6Var2) > 0) {
                                    z = true;
                                }
                            } else {
                                a.this.a.e(writableDatabase, zs6Var2);
                                a.this.f19734c.e(writableDatabase, zs6Var2);
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            if (z) {
                                hashSet2.add(strC);
                            }
                        } catch (Throwable th2) {
                            writableDatabase.endTransaction();
                            throw th2;
                        }
                    }
                }
            }
            n nVar = a.this.g;
            if (nVar == null || hashSet2.isEmpty()) {
                return null;
            }
            nVar.a(2);
            return null;
        }
    }

    public class m implements Callable<List<co3>> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f19765j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f19766l;
        public final /* synthetic */ boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f19767n;

        public m(String str, int i, long j2, int i2, boolean z, boolean z2) {
            this.i = str;
            this.f19765j = i;
            this.k = j2;
            this.f19766l = i2;
            this.m = z;
            this.f19767n = z2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<co3> call() {
            return a.this.a.h(this.i, this.f19765j, this.k, this.f19766l, this.m, this.f19767n);
        }
    }

    public interface n {
        void a(int i);
    }

    public interface o {
        void a(SQLiteFullException sQLiteFullException);
    }

    public a(jo3 jo3Var, jo3 jo3Var2, wn3 wn3Var, bt6 bt6Var, bi8 bi8Var, x56 x56Var) {
        this.a = jo3Var;
        this.b = jo3Var2;
        this.f19734c = wn3Var;
        this.d = x56Var;
    }

    public static void A(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase == null || str == null) {
            return;
        }
        sQLiteDatabase.execSQL("INSERT INTO common_info_nr (event_key_long, header_index, common_header, body_blob, sequence_id, common_appid, common_logtag, common_eventid, head_switch, event_level, network_type, upload_type, event_time, cache_flag, event_source, raw_size) SELECT 0, header_index, common_header, body_blob, sequence_id, common_appid, common_logtag, common_eventid, head_switch, 1, 0, ?, event_time, ?, event_source, raw_size FROM common_info_rt WHERE common_appid=? AND event_key_long=0 AND cache_flag=? AND event_source IN (?, ?)", new Object[]{0, 1, str, 0, 1, 2});
        sQLiteDatabase.execSQL("DELETE FROM common_info_rt WHERE common_appid=? AND event_key_long=0 AND cache_flag=? AND event_source IN (?, ?)", new Object[]{str, 0, 1, 2});
        sQLiteDatabase.execSQL("UPDATE common_info_nr SET event_key_long=0, upload_type=?, cache_flag=?, event_level=?, network_type=? WHERE common_appid=? AND event_key_long=0 AND cache_flag=? AND event_source IN (?, ?)", new Object[]{0, 1, 1, 0, str, 0, 1, 2});
    }

    public static <T> T B(Callable<T> callable) {
        try {
            return u56.c().submit(callable).get();
        } catch (Exception e2) {
            z6b.p("IngestRepository", "runRead() execute error", e2);
            return null;
        }
    }

    public static int n(SQLiteDatabase sQLiteDatabase, zs6 zs6Var) {
        if (sQLiteDatabase != null && zs6Var != null) {
            String strC = zs6Var.c();
            String strD = zs6Var.d();
            String strE = zs6Var.e();
            if (strC != null && strD != null && strE != null) {
                Object[] objArr = {strC, strD, strE, 1, 2};
                sQLiteDatabase.execSQL("INSERT INTO common_info_rt (event_key_long, header_index, common_header, body_blob, sequence_id, common_appid, common_logtag, common_eventid, head_switch, event_level, network_type, upload_type, event_time, cache_flag, event_source, raw_size) SELECT event_key_long, header_index, common_header, body_blob, sequence_id, common_appid, common_logtag, common_eventid, head_switch, event_level, network_type, upload_type, event_time, cache_flag, event_source, raw_size FROM common_info_nr WHERE cache_flag=0 AND common_appid=? AND common_logtag=? AND common_eventid=? AND upload_type IN (?, ?)", objArr);
                int iLongForQuery = (int) DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
                if (iLongForQuery <= 0) {
                    return 0;
                }
                sQLiteDatabase.execSQL("DELETE FROM common_info_nr WHERE cache_flag=0 AND common_appid=? AND common_logtag=? AND common_eventid=? AND upload_type IN (?, ?)", objArr);
                return iLongForQuery;
            }
        }
        return 0;
    }

    public void C(n nVar) {
        this.g = nVar;
    }

    public void D(o oVar) {
        this.h = oVar;
    }

    public int h(List<Long> list) {
        if (this.b != null && list != null && !list.isEmpty()) {
            try {
                return this.b.d(list);
            } catch (Exception e2) {
                z6b.p("IngestRepository", "deleteLegacyRtByIdsDirect failed", e2);
            }
        }
        return 0;
    }

    public int i(List<Long> list) {
        if (list != null && !list.isEmpty()) {
            try {
                return this.f19734c.d(list);
            } catch (Exception e2) {
                z6b.p("IngestRepository", "deleteNrByIdsDirect failed", e2);
            }
        }
        return 0;
    }

    public int j(List<Long> list) {
        if (list != null && !list.isEmpty()) {
            try {
                return this.a.d(list);
            } catch (Exception e2) {
                z6b.p("IngestRepository", "deleteRtByIdsDirect failed", e2);
            }
        }
        return 0;
    }

    public List<String> k() {
        if (!this.f) {
            synchronized (this.f19735e) {
                if (!this.f) {
                    List list = (List) B(new j());
                    if (list != null) {
                        this.f19735e.addAll(list);
                    }
                    this.f = true;
                }
            }
        }
        return new ArrayList(this.f19735e);
    }

    public int l(List<co3> list) throws SQLiteFullException {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        try {
            return this.f19734c.f(list);
        } catch (SQLiteFullException e2) {
            z6b.v("IngestRepository", "SQLiteFullException during insertNrBatchDirect, triggering capacity cleanup", e2);
            o oVar = this.h;
            if (oVar != null) {
                oVar.a(e2);
            }
            throw e2;
        }
    }

    public int m(List<co3> list) throws SQLiteFullException {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        try {
            return this.a.f(list);
        } catch (SQLiteFullException e2) {
            z6b.v("IngestRepository", "SQLiteFullException during insertRtBatchDirect, triggering capacity cleanup", e2);
            o oVar = this.h;
            if (oVar != null) {
                oVar.a(e2);
            }
            throw e2;
        }
    }

    public List<co3> o(int i2, boolean z) {
        return this.b == null ? Collections.emptyList() : (List) B(new k(i2, z));
    }

    public List<co3> p(String str, int i2, long j2, long j3, long j4, int i3, boolean z, boolean z2, int... iArr) {
        return (List) B(new h(str, i2, j2, j3, j4, i3, z, z2, iArr));
    }

    public long[] q(String str, int i2, long j2, long j3, long j4, boolean z, boolean z2, int... iArr) {
        return (long[]) B(new i(str, i2, j2, j3, j4, z, z2, iArr));
    }

    public Object[] r(long j2, long j3, boolean z, boolean z2, boolean z3, Set<String> set, int... iArr) {
        return (Object[]) B(new g(j2, j3, z, z2, z3, set, iArr));
    }

    public List<co3> s(String str, long j2, long j3, int i2, boolean z, boolean z2, int... iArr) {
        return (List) B(new e(str, j2, j3, i2, z, z2, iArr));
    }

    public List<co3> t(String str, long j2, long j3, long j4, int i2, boolean z, boolean z2, int... iArr) {
        return (List) B(new b(str, j2, j3, j4, i2, z, z2, iArr));
    }

    public List<co3> u(String str, int i2, long j2, int i3, boolean z, boolean z2) {
        return (List) B(new m(str, i2, j2, i3, z, z2));
    }

    public long[] v(String str, long j2, long j3, boolean z, boolean z2, int... iArr) {
        return (long[]) B(new f(str, j2, j3, z, z2, iArr));
    }

    public long[] w(String str, long j2, long j3, long j4, boolean z, boolean z2, int... iArr) {
        return (long[]) B(new c(str, j2, j3, j4, z, z2, iArr));
    }

    public Object[] x(long j2, long j3, boolean z, boolean z2, Set<String> set, int... iArr) {
        return (Object[]) B(new CallableC0957a(j2, j3, z, z2, set, iArr));
    }

    public Object[] y(long j2, long j3, boolean z, boolean z2, Set<String> set, int... iArr) {
        return (Object[]) B(new d(j2, j3, z, z2, set, iArr));
    }

    public void z(List<zs6> list) {
        if (this.d == null || list == null || list.isEmpty()) {
            return;
        }
        u56.p(new l(list));
    }
}
