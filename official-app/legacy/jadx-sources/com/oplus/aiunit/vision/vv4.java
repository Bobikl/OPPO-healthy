package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.heytap.connect.TapConst;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.core.reconciliation.ClearReason;
import com.oplus.drs.core.reconciliation.FilterReason;
import com.oplus.drs.core.reconciliation.FlowControlReason;
import com.oplus.drs.core.reconciliation.ReconciliationStage;
import com.oplus.drs.core.reconciliation.UploadFailReason;
import com.oplus.drs.core.reconciliation.ValidationReason;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class vv4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile vv4 f17991l;
    public final Context a;
    public final rv4 b;
    public HandlerThread d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f17993e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f17994j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f17992c = new a();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final Object h = new Object();
    public volatile long i = 0;
    public final Runnable k = new g();

    public class a implements Executor {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.vv4$a$a, reason: collision with other inner class name */
        public class RunnableC0938a implements Runnable {
            public final /* synthetic */ Runnable i;

            public RunnableC0938a(Runnable runnable) {
                this.i = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (e25.a()) {
                    this.i.run();
                }
            }
        }

        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            u56.m(new RunnableC0938a(runnable));
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ uv4 f17996j;

        public b(String str, uv4 uv4Var) {
            this.i = str;
            this.f17996j = uv4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    vv4.this.A(this.i, this.f17996j);
                } catch (Exception e2) {
                    z6b.p("DataReconciliationManager", "processEvent error: appId=" + this.i + ", " + e2.getMessage(), e2);
                }
            } finally {
                this.f17996j.o();
            }
        }
    }

    public class c implements n {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.vv4.n
        public boolean run() throws Exception {
            try {
                z6b.q("DataReconciliationManager", "==== Start uploading reconciliation data (all appIds) ====");
                vv4.this.o();
                List<tv4> listD = vv4.this.b.d();
                if (listD != null && !listD.isEmpty()) {
                    z6b.q("DataReconciliationManager", "Found " + listD.size() + " reconciliation records to upload (all appIds)");
                    List<co3> listI = vv4.this.i(listD);
                    if (listI.isEmpty()) {
                        z6b.u("DataReconciliationManager", "No valid records after conversion");
                        return true;
                    }
                    z6b.q("DataReconciliationManager", "Converted " + listI.size() + " records, writing to ingest...");
                    r7a r7aVar = t56.ingestPipeline;
                    if (r7aVar != null) {
                        r7aVar.h(listI);
                        z6b.q("DataReconciliationManager", "Successfully wrote " + listI.size() + " reconciliation records to ingest");
                    } else {
                        z6b.o("DataReconciliationManager", "IngestPipeline not initialized, skip reconciliation ingest");
                    }
                    z6b.q("DataReconciliationManager", "==== Upload reconciliation data completed (all appIds) ====");
                    return true;
                }
                z6b.q("DataReconciliationManager", "No reconciliation data to upload");
                return true;
            } catch (Throwable th) {
                z6b.p("DataReconciliationManager", "Error uploading reconciliation data", th);
                return false;
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ CountDownLatch i;

        public d(CountDownLatch countDownLatch) {
            this.i = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i.countDown();
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ List i;

        public e(List list) {
            this.i = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = this.i.size();
                String string = "";
                try {
                    string = this.i.subList(0, Math.min(3, size)).toString();
                } catch (Exception unused) {
                }
                z6b.q("DataReconciliationManager", "removeUploadedReconciliationData begin, count=" + size + ", sample=" + string);
                vv4.this.b.b(this.i);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 < 0) {
                    jCurrentTimeMillis2 = 0;
                }
                z6b.q("DataReconciliationManager", "removeUploadedReconciliationData done, count=" + size + ", costMs=" + jCurrentTimeMillis2 + " (see dao log for deleted rows)");
            } catch (Exception e2) {
                z6b.p("DataReconciliationManager", "Failed to remove uploaded reconciliation data", e2);
            }
        }
    }

    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReconciliationStage.values().length];
            a = iArr;
            try {
                iArr[ReconciliationStage.RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReconciliationStage.VALIDATION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReconciliationStage.FILTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ReconciliationStage.CACHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ReconciliationStage.RATE_LIMITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ReconciliationStage.UPLOAD_ATTEMPT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ReconciliationStage.UPLOAD_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ReconciliationStage.UPLOADED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ReconciliationStage.EXPIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.util.concurrent.atomic.AtomicBoolean] */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    vv4.this.p();
                } catch (Exception e2) {
                    z6b.p("DataReconciliationManager", "Reconciliation upload exception", e2);
                }
            } finally {
                vv4.this.f.set(false);
            }
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Map f17999j;
        public final /* synthetic */ ValidationReason k;

        public h(String str, Map map, ValidationReason validationReason) {
            this.i = str;
            this.f17999j = map;
            this.k = validationReason;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vv4.this.b.f(this.i, this.f17999j, this.k);
            } catch (Exception e2) {
                z6b.p("DataReconciliationManager", "recordValidationFailedBatch error: appId=" + this.i, e2);
            }
            vv4.this.V();
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Map f18001j;
        public final /* synthetic */ int k;

        public i(String str, Map map, int i) {
            this.i = str;
            this.f18001j = map;
            this.k = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vv4.this.b.g(this.i, this.f18001j, this.k);
            } catch (Exception e2) {
                z6b.p("DataReconciliationManager", "recordCachedBatch error: appId=" + this.i, e2);
            }
            vv4.this.V();
        }
    }

    public class j implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Map f18003j;

        public j(String str, Map map) {
            this.i = str;
            this.f18003j = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vv4.this.b.r(this.i, this.f18003j);
            } catch (Exception e2) {
                z6b.p("DataReconciliationManager", "recordUploadAttemptBatch error: appId=" + this.i, e2);
            }
            vv4.this.V();
        }
    }

    public class k implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Map f18004j;

        public k(String str, Map map) {
            this.i = str;
            this.f18004j = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vv4.this.b.i(this.i, this.f18004j);
            } catch (Exception e2) {
                z6b.p("DataReconciliationManager", "recordUploadRequestBatch error: appId=" + this.i, e2);
            }
            vv4.this.V();
        }
    }

    public class l implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Map f18005j;
        public final /* synthetic */ UploadFailReason k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f18006l;

        public l(String str, Map map, UploadFailReason uploadFailReason, int i) {
            this.i = str;
            this.f18005j = map;
            this.k = uploadFailReason;
            this.f18006l = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vv4.this.b.o(this.i, this.f18005j, this.k, this.f18006l);
            } catch (Exception e2) {
                z6b.p("DataReconciliationManager", "recordUploadFailedBatch error: appId=" + this.i, e2);
            }
            vv4.this.V();
        }
    }

    public class m implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Map f18007j;
        public final /* synthetic */ int k;

        public m(String str, Map map, int i) {
            this.i = str;
            this.f18007j = map;
            this.k = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vv4.this.b.l(this.i, this.f18007j, this.k);
            } catch (Exception e2) {
                z6b.p("DataReconciliationManager", "recordUploadedBatch error: appId=" + this.i, e2);
            }
            vv4.this.V();
        }
    }

    public interface n {
        boolean run() throws Exception;
    }

    public vv4(Context context) {
        this.f17994j = 0L;
        this.a = context.getApplicationContext();
        this.b = new sv4(context);
        x();
        this.f17994j = w().getLong("data_reconciliation_last_upload_time", 0L);
        V();
    }

    public static vv4 t(@NonNull Context context) {
        if (f17991l == null) {
            synchronized (vv4.class) {
                if (f17991l == null) {
                    f17991l = new vv4(context);
                }
            }
        }
        return f17991l;
    }

    public final void A(String str, uv4 uv4Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (uv4Var.e() == null || uv4Var.j() != ReconciliationStage.UPLOADED) {
            B(str, jCurrentTimeMillis, uv4Var);
        } else {
            C(str, uv4Var.e(), jCurrentTimeMillis, uv4Var.k());
        }
        V();
    }

    public final void B(String str, long j2, uv4 uv4Var) {
        if (uv4Var.d() > 0) {
            j2 = uv4Var.d();
        }
        long jC = hgf.c(j2);
        switch (f.a[uv4Var.j().ordinal()]) {
            case 1:
                this.b.h(str, jC, uv4Var.c());
                break;
            case 2:
                this.b.n(str, jC, uv4Var.c(), uv4Var.m());
                break;
            case 3:
                this.b.j(str, jC, uv4Var.c(), uv4Var.f());
                break;
            case 4:
                this.b.q(str, jC, uv4Var.c(), uv4Var.a());
                break;
            case 5:
                this.b.a(str, jC, uv4Var.c(), uv4Var.g());
                break;
            case 6:
                this.b.m(str, jC, uv4Var.c());
                break;
            case 7:
                this.b.c(str, jC, uv4Var.c(), uv4Var.l(), uv4Var.i());
                break;
            case 8:
                this.b.k(str, jC, uv4Var.c());
                break;
            case 9:
                this.b.e(str, jC, uv4Var.c(), uv4Var.b());
                break;
        }
        z6b.k("DataReconciliationManager", "record: stage=" + uv4Var.j().getDescription() + ", count=" + uv4Var.c());
    }

    public final void C(String str, List<Long> list, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        for (Long l2 : list) {
            if (j2 - l2.longValue() < 604800000) {
                arrayList.add(l2);
            }
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jC = hgf.c(((Long) it.next()).longValue());
            Long l3 = (Long) concurrentHashMap.get(Long.valueOf(jC));
            if (l3 == null) {
                concurrentHashMap.put(Long.valueOf(jC), 1L);
            } else {
                concurrentHashMap.put(Long.valueOf(jC), Long.valueOf(l3.longValue() + 1));
            }
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            this.b.k(str, ((Long) entry.getKey()).longValue(), ((Long) entry.getValue()).longValue());
        }
        z6b.k("DataReconciliationManager", String.format("recordUploadedBatch: total=%d, valid=%d, windows=%d", Integer.valueOf(list.size()), Integer.valueOf(arrayList.size()), Integer.valueOf(concurrentHashMap.size())));
    }

    public void D(String str, long j2, agf.b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            synchronized (e25.a()) {
                this.b.p(str, j2, bVar);
            }
        } catch (Exception e2) {
            z6b.p("DataReconciliationManager", "recordAllMetricsBatch error: appId=" + str, e2);
        }
        V();
    }

    public void E(String str, Map<Long, Integer> map, int i2) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f17992c.execute(new i(str, map, i2));
    }

    public void F(String str, int i2, long j2, ClearReason clearReason) {
        if (i2 <= 0) {
            return;
        }
        uv4 uv4VarN = uv4.n();
        uv4VarN.w(ReconciliationStage.EXPIRED);
        uv4VarN.s(i2);
        uv4VarN.t(j2);
        uv4VarN.r(clearReason);
        g(str, uv4VarN);
    }

    public void G(String str, int i2, long j2, FilterReason filterReason) {
        if (i2 <= 0) {
            return;
        }
        uv4 uv4VarN = uv4.n();
        uv4VarN.w(ReconciliationStage.FILTERED);
        uv4VarN.s(i2);
        uv4VarN.t(j2);
        uv4VarN.u(filterReason);
        g(str, uv4VarN);
    }

    public void H(String str, int i2, long j2, FlowControlReason flowControlReason) {
        if (i2 <= 0) {
            return;
        }
        uv4 uv4VarN = uv4.n();
        uv4VarN.w(ReconciliationStage.RATE_LIMITED);
        uv4VarN.s(i2);
        uv4VarN.t(j2);
        uv4VarN.v(flowControlReason);
        g(str, uv4VarN);
    }

    public void I(String str, int i2, long j2) {
        if (i2 <= 0) {
            return;
        }
        uv4 uv4VarN = uv4.n();
        uv4VarN.w(ReconciliationStage.RECEIVED);
        uv4VarN.s(i2);
        uv4VarN.t(j2);
        g(str, uv4VarN);
    }

    public void J(String str, Map<Long, Integer> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f17992c.execute(new j(str, map));
    }

    public void K(String str, Map<Long, Integer> map, UploadFailReason uploadFailReason, int i2) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f17992c.execute(new l(str, map, uploadFailReason, i2));
    }

    public void L(String str, Map<Long, Integer> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f17992c.execute(new k(str, map));
    }

    public void M(String str, List<Long> list, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        for (Long l2 : list) {
            if (l2 != null) {
                long jC = hgf.c(l2.longValue());
                Integer num = (Integer) map.get(Long.valueOf(jC));
                map.put(Long.valueOf(jC), Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
            }
        }
        this.f17992c.execute(new m(str, map, i2));
    }

    public void N(String str, int i2, long j2, ValidationReason validationReason) {
        if (i2 <= 0) {
            return;
        }
        uv4 uv4VarN = uv4.n();
        uv4VarN.w(ReconciliationStage.VALIDATION_FAILED);
        uv4VarN.s(i2);
        uv4VarN.t(j2);
        uv4VarN.x(validationReason);
        g(str, uv4VarN);
    }

    public void O(String str, Map<Long, Integer> map, ValidationReason validationReason) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f17992c.execute(new h(str, map, validationReason));
    }

    public void P(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f17992c.execute(new e(list));
    }

    public final long Q(long j2) {
        String strE;
        String strF;
        String str;
        String str2 = "";
        try {
            strE = tpe.e(v());
            try {
                strF = tpe.f(v());
            } catch (Throwable unused) {
                strF = "";
            }
        } catch (Throwable unused2) {
            strE = "";
        }
        if (!TextUtils.isEmpty(strE)) {
            str2 = strE;
        } else if (!TextUtils.isEmpty(strF)) {
            str2 = strF;
        }
        if (TextUtils.isEmpty(strE)) {
            str = !TextUtils.isEmpty(strF) ? "ouid" : SpeechConstant.ENGINE_TYPE_NONE;
        } else {
            str = "duid";
        }
        if (TextUtils.isEmpty(str2)) {
            long j3 = w().getLong("data_reconciliation_fallback_device_offset_ms", -1L);
            if (j2 <= 0) {
                j2 = 86400000;
            }
            if (j3 >= 0 && j3 < j2) {
                return j3;
            }
            long jAbs = ((long) Math.abs(UUID.randomUUID().toString().hashCode())) % j2;
            w().putLong("data_reconciliation_fallback_device_offset_ms", jAbs);
            if (y()) {
                z6b.q("DataReconciliationManager", "resolveDeviceOffsetMs(debug): idType=fallback_random, periodMs=" + j2 + "(" + r(j2) + "), offsetMs=" + jAbs + "(" + r(jAbs) + ")");
            }
            return jAbs;
        }
        long j4 = j(str2);
        if (j2 <= 0) {
            j2 = 86400000;
        }
        long j5 = ((j4 % j2) + j2) % j2;
        if (y()) {
            z6b.q("DataReconciliationManager", "resolveDeviceOffsetMs(debug): idType=" + str + ", idHash=" + j4 + ", periodMs=" + j2 + "(" + r(j2) + "), offsetMs=" + j5 + "(" + r(j5) + ")");
        }
        return j5;
    }

    public final String R() {
        try {
            String strE = tpe.e(v());
            if (!TextUtils.isEmpty(strE)) {
                return "duid:" + strE;
            }
            String strF = tpe.f(v());
            if (!TextUtils.isEmpty(strF)) {
                return "ouid:" + strF;
            }
            return "pkg:" + v().getPackageName();
        } catch (Throwable unused) {
        }
    }

    public final long S() {
        return y() ? 300000L : 86400000L;
    }

    public final void T(long j2) {
        if (this.f17993e == null) {
            return;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + j2;
        synchronized (this.h) {
            if (this.i <= 0 || this.i > jCurrentTimeMillis) {
                this.f17993e.removeCallbacks(this.k);
                this.f17993e.postDelayed(this.k, j2);
                this.i = jCurrentTimeMillis;
                this.f.set(true);
                z6b.k("DataReconciliationManager", "Reconciliation upload scheduled in " + (j2 / 1000) + " seconds, targetAt=" + jCurrentTimeMillis);
            }
        }
    }

    public final long U(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public void V() {
        T(h(System.currentTimeMillis()));
    }

    public void W(Context context) {
        z6b.q("DataReconciliationManager", "[Manual] Manually triggering reconciliation data upload (ignoring interval)");
        if (this.f17993e != null) {
            T(0L);
        } else {
            m();
        }
    }

    public final boolean X(n nVar) {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        FileLock fileLock = null;
        try {
            randomAccessFile = new RandomAccessFile(new File(v().getFilesDir(), "drs_reconciliation.lock"), "rw");
            try {
                channel = randomAccessFile.getChannel();
                try {
                    FileLock fileLockTryLock = channel.tryLock();
                    if (fileLockTryLock != null) {
                        boolean zRun = nVar.run();
                        try {
                            fileLockTryLock.release();
                        } catch (Throwable unused) {
                        }
                        try {
                            channel.close();
                        } catch (Throwable unused2) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (Throwable unused3) {
                        }
                        return zRun;
                    }
                    z6b.u("DataReconciliationManager", "withReconciliationLock: another task holds the lock, skip");
                    if (fileLockTryLock != null) {
                        try {
                            fileLockTryLock.release();
                        } catch (Throwable unused4) {
                        }
                    }
                    try {
                        channel.close();
                    } catch (Throwable unused5) {
                    }
                    try {
                        randomAccessFile.close();
                        return true;
                    } catch (Throwable unused6) {
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        z6b.p("DataReconciliationManager", "withReconciliationLock error", th);
                        if (randomAccessFile == null) {
                            return false;
                        }
                        try {
                            return false;
                        } catch (Throwable unused7) {
                            return false;
                        }
                    } finally {
                        if (0 != 0) {
                            try {
                                fileLock.release();
                            } catch (Throwable unused8) {
                            }
                        }
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable unused9) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Throwable unused10) {
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                channel = null;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            channel = null;
        }
    }

    public final void g(String str, uv4 uv4Var) {
        this.f17992c.execute(new b(str, uv4Var));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0113  */
    /* JADX WARN: Code duplicated, block: B:24:0x0119  */
    /* JADX WARN: Code duplicated, block: B:27:0x0122  */
    /* JADX WARN: Code duplicated, block: B:29:0x0124  */
    /* JADX WARN: Code duplicated, block: B:31:0x012b  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0146  */
    /* JADX WARN: Code duplicated, block: B:42:0x014b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public final long h(long j2) {
        long jQ;
        boolean z;
        long j3;
        long j4;
        long j5;
        long j6 = w().getLong("data_reconciliation_last_upload_time", 0L);
        this.f17994j = j6;
        long jS = S();
        long jK = k(j2, jS);
        long jQ2 = Q(jS);
        long j7 = jK + jQ2;
        long j8 = jK + jS + jQ2;
        long j9 = w().getLong("data_reconciliation_last_upload_window_start", 0L);
        if (j9 <= 0) {
            jQ = w().getLong("data_reconciliation_last_upload_day_start", 0L);
            if (jQ <= 0) {
                if (j6 > 0) {
                    jQ = y() ? q(j6, jS) : U(j6);
                }
            }
            if (jQ == jK) {
                z = true;
            } else {
                z = false;
            }
            if (y()) {
                StringBuilder sb = new StringBuilder();
                sb.append("computeNextDelayMs(debug): periodMs=");
                sb.append(jS);
                sb.append("(");
                sb.append(r(jS));
                sb.append("), windowStart=");
                sb.append(jK);
                sb.append("(");
                sb.append(s(jK));
                sb.append("), lastWindowStart=");
                sb.append(jQ);
                sb.append("(");
                sb.append(s(jQ));
                sb.append("), offsetMs=");
                sb.append(jQ2);
                sb.append("(");
                sb.append(r(jQ2));
                sb.append("), target=");
                sb.append(j7);
                sb.append("(");
                sb.append(s(j7));
                sb.append("), nextTarget=");
                j4 = j8;
                sb.append(j4);
                sb.append("(");
                sb.append(s(j4));
                sb.append("), alreadyRan=");
                sb.append(z);
                sb.append(", now=");
                j3 = j2;
                sb.append(j3);
                sb.append("(");
                sb.append(s(j2));
                sb.append("), mode=");
                sb.append(w56.a());
                z6b.q("DataReconciliationManager", sb.toString());
            } else {
                j3 = j2;
                j4 = j8;
            }
            if (z) {
                j5 = j4 - j3;
                if (j5 < 0) {
                    return jS;
                }
                return j5;
            }
            if (j3 < j7) {
                long j10 = j7 - j3;
                return (w56.a() == ChannelMode.STANDALONE || j10 <= 120000) ? j10 : l(j3, 120000L);
            }
            if (w56.a() == ChannelMode.STANDALONE) {
                return l(j3, 120000L);
            }
            return 0L;
        }
        jQ = j9;
        if (jQ == jK) {
            z = true;
        } else {
            z = false;
        }
        if (y()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("computeNextDelayMs(debug): periodMs=");
            sb2.append(jS);
            sb2.append("(");
            sb2.append(r(jS));
            sb2.append("), windowStart=");
            sb2.append(jK);
            sb2.append("(");
            sb2.append(s(jK));
            sb2.append("), lastWindowStart=");
            sb2.append(jQ);
            sb2.append("(");
            sb2.append(s(jQ));
            sb2.append("), offsetMs=");
            sb2.append(jQ2);
            sb2.append("(");
            sb2.append(r(jQ2));
            sb2.append("), target=");
            sb2.append(j7);
            sb2.append("(");
            sb2.append(s(j7));
            sb2.append("), nextTarget=");
            j4 = j8;
            sb2.append(j4);
            sb2.append("(");
            sb2.append(s(j4));
            sb2.append("), alreadyRan=");
            sb2.append(z);
            sb2.append(", now=");
            j3 = j2;
            sb2.append(j3);
            sb2.append("(");
            sb2.append(s(j2));
            sb2.append("), mode=");
            sb2.append(w56.a());
            z6b.q("DataReconciliationManager", sb2.toString());
        } else {
            j3 = j2;
            j4 = j8;
        }
        if (z) {
            j5 = j4 - j3;
            if (j5 < 0) {
                return jS;
            }
            return j5;
        }
        if (j3 < j7) {
            long j11 = j7 - j3;
            if (w56.a() == ChannelMode.STANDALONE) {
            }
        }
        if (w56.a() == ChannelMode.STANDALONE) {
            return l(j3, 120000L);
        }
        return 0L;
    }

    public final List<co3> i(List<tv4> list) {
        String str;
        String strN;
        Object obj;
        String str2 = "sequence_id";
        ArrayList arrayList = new ArrayList();
        Iterator<tv4> it = list.iterator();
        while (it.hasNext()) {
            tv4 next = it.next();
            if (next != null) {
                try {
                    strN = next.n();
                } catch (Exception e2) {
                    e = e2;
                    str = str2;
                    z6b.p("DataReconciliationManager", "Failed to convert entity to CommonRecord", e);
                    str2 = str;
                }
            } else {
                strN = null;
            }
            String str3 = strN;
            if (str3 == null || str3.isEmpty() || "0".equals(str3)) {
                str = str2;
                StringBuilder sb = new StringBuilder();
                sb.append("Skip reconciliation entity due to invalid sequenceId, id=");
                sb.append(next != null ? next.j() : -1L);
                sb.append(", appId=");
                sb.append(next != null ? next.a() : -1);
                sb.append(", eventTime=");
                sb.append(next != null ? next.g() : -1L);
                sb.append(", sequenceId=");
                sb.append(str3);
                z6b.o("DataReconciliationManager", sb.toString());
            } else {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("_id", String.valueOf(next.j()));
                jSONObject2.put("app_id", String.valueOf(next.a()));
                jSONObject2.put("event_time", String.valueOf(next.g()));
                jSONObject2.put("source_process", String.valueOf(next.o()));
                jSONObject2.put("upload_type", 0);
                jSONObject2.put("received_count", String.valueOf(next.l()));
                jSONObject2.put("validation_failed_reasons", next.w());
                jSONObject2.put("filtered_reasons", next.h());
                jSONObject2.put("cached_count", String.valueOf(next.b()));
                jSONObject2.put("cached_pending_count", String.valueOf(next.c()));
                jSONObject2.put("flow_control_reasons", next.i());
                jSONObject2.put("upload_attempt_count", String.valueOf(next.r()));
                jSONObject2.put("upload_request_count", String.valueOf(next.t()));
                jSONObject2.put("upload_failed_reasons", next.s());
                jSONObject2.put("upload_retry_distribution", next.u());
                jSONObject2.put("uploaded_count", String.valueOf(next.v()));
                jSONObject2.put("clear_reasons", next.d());
                jSONObject2.put(str2, next.n());
                jSONObject2.put("record_date", String.valueOf(next.m()));
                jSONObject2.put("create_time", String.valueOf(next.f()));
                jSONObject2.put("update_time", String.valueOf(next.q()));
                Pair<Long, Integer> pairI = com.oplus.drs.core.ntp.b.f().i();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (pairI != null && (obj = pairI.first) != null) {
                    jCurrentTimeMillis = ((Long) obj).longValue();
                }
                int i2 = (pairI == null || pairI.first == null) ? 2 : 1;
                jSONObject.put("event_time", jCurrentTimeMillis);
                jSONObject.put("event_time_type", i2);
                jSONObject.put(str2, str3);
                jSONObject.put("event_info", jSONObject2);
                str = str2;
                try {
                    co3 co3VarA = v56.a.a("149700", "reconciliation", "reconciliation_data", jSONObject.toString(), str3, jCurrentTimeMillis, null, null, 1);
                    co3VarA.b = 865432L;
                    co3VarA.q = 0;
                    co3VarA.o = 0;
                    co3VarA.m = 1;
                    arrayList.add(co3VarA);
                    z6b.k("DataReconciliationManager", "Converted entity: sequenceId=" + next.n() + ", eventTime=" + next.g() + ", appId=" + next.a());
                } catch (Exception e3) {
                    e = e3;
                    z6b.p("DataReconciliationManager", "Failed to convert entity to CommonRecord", e);
                }
            }
            str2 = str;
        }
        return arrayList;
    }

    public final long j(String str) {
        try {
            CRC32 crc32 = new CRC32();
            byte[] bytes = str.getBytes("UTF-8");
            crc32.update(bytes, 0, bytes.length);
            return crc32.getValue();
        } catch (Throwable unused) {
            if (str != null) {
                return str.hashCode();
            }
            return 0L;
        }
    }

    public final long k(long j2, long j3) {
        return !y() ? U(j2) : q(j2, j3);
    }

    public final long l(long j2, long j3) {
        if (j3 <= 0) {
            return 0L;
        }
        return Math.abs(j(R() + "_" + (y() ? q(j2, S()) : U(j2)) + "_" + j3)) % j3;
    }

    public final boolean m() {
        return X(new c());
    }

    public final void n() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        u56.m(new d(countDownLatch));
        try {
            countDownLatch.await(30L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z6b.u("DataReconciliationManager", "drainHandlerThread interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public final void o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            n();
            z6b.q("DataReconciliationManager", "drainPendingReconciliationWrites completed in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        } catch (Exception e2) {
            z6b.u("DataReconciliationManager", "drainPendingReconciliationWrites timeout/error after " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms: " + e2.getMessage());
        }
    }

    public final void p() {
        if (!this.g.compareAndSet(false, true)) {
            z6b.k("DataReconciliationManager", "Reconciliation upload already in progress, skip");
            return;
        }
        try {
            z6b.q("DataReconciliationManager", "[Scheduled] Executing scheduled reconciliation data upload...");
            boolean zM = m();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f17994j = jCurrentTimeMillis;
            w().putLong("data_reconciliation_last_upload_time", jCurrentTimeMillis);
            w().putLong("data_reconciliation_last_upload_window_start", k(jCurrentTimeMillis, S()));
            w().putLong("data_reconciliation_last_upload_day_start", U(jCurrentTimeMillis));
            z6b.q("DataReconciliationManager", "Reconciliation data upload completed(ok=" + zM + "), next run will be scheduled.");
            this.g.set(false);
            synchronized (this.h) {
                this.f.set(false);
                this.i = 0L;
            }
        } finally {
            this.g.set(false);
            synchronized (this.h) {
                this.f.set(false);
                this.i = 0L;
                V();
            }
        }
    }

    public final long q(long j2, long j3) {
        if (j3 <= 0) {
            return 0L;
        }
        return (j2 / j3) * j3;
    }

    public final String r(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        long j4 = j2 % 1000;
        long j5 = j3 % 60;
        long j6 = (j3 / 60) % 60;
        long j7 = j3 / TapConst.IP_TTL_DEFAULT;
        return j7 > 0 ? String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j7), Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)) : String.format(Locale.US, "%02d:%02d.%03d", Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4));
    }

    public final String s(long j2) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(j2));
        } catch (Throwable unused) {
            return String.valueOf(j2);
        }
    }

    @SuppressLint({"DefaultLocale"})
    public String u(String str) {
        List<tv4> listD = this.b.d();
        ArrayList arrayList = new ArrayList();
        for (tv4 tv4Var : listD) {
            if (str != null && str.equals(tv4Var.a())) {
                arrayList.add(tv4Var);
            }
        }
        if (arrayList.isEmpty()) {
            return "No reconciliation data available";
        }
        Iterator it = arrayList.iterator();
        long jL = 0;
        long j2 = 0;
        long jV = 0;
        long jD = 0;
        long jD2 = 0;
        long jB = 0;
        long jD3 = 0;
        long jR = 0;
        long jD4 = 0;
        while (it.hasNext()) {
            tv4 tv4Var2 = (tv4) it.next();
            jL += tv4Var2.l();
            jD += hgf.d(tv4Var2.w());
            jD2 += hgf.d(tv4Var2.h());
            jB += tv4Var2.b();
            jD3 += hgf.d(tv4Var2.i());
            jR += tv4Var2.r();
            long jD5 = j2 + hgf.d(tv4Var2.s());
            jV += tv4Var2.v();
            jD4 += hgf.d(tv4Var2.d());
            it = it;
            j2 = jD5;
        }
        long j3 = j2;
        long j4 = jL - jV;
        return String.format("========== Reconciliation Statistics Report V3 ==========\nNumber of Data Windows: %d\n\nTotal Received: %d\nTotal Validation Failed: %d (%s%%)\nTotal Filtered: %d (%s%%)\nTotal Cached: %d (%s%%)\nTotal Rate Limited: %d (%s%%)\nTotal Upload Attempt: %d\nTotal Upload Failed: %d (%s%%)\nTotal Uploaded: %d (%s%%)\nTotal Expired: %d (%s%%)\nTotal Lost: %d (%s%%)\nCompleteness Rate: %s%%\n==================================================", Integer.valueOf(arrayList.size()), Long.valueOf(jL), Long.valueOf(jD), z(jD, jL), Long.valueOf(jD2), z(jD2, jL), Long.valueOf(jB), z(jB, jL), Long.valueOf(jD3), z(jD3, jL), Long.valueOf(jR), Long.valueOf(j3), z(j3, jL), Long.valueOf(jV), z(jV, jL), Long.valueOf(jD4), z(jD4, jL), Long.valueOf(j4), z(j4, jL), z(jV, jL));
    }

    public final Context v() {
        try {
            Context contextH = w56.h();
            return contextH != null ? contextH : this.a;
        } catch (Throwable unused) {
            return this.a;
        }
    }

    public final opa w() {
        return tpe.h(v(), "drs_app_storage");
    }

    public final void x() {
        HandlerThread handlerThread = new HandlerThread("ReconciliationUploadThread");
        this.d = handlerThread;
        handlerThread.start();
        this.f17993e = new Handler(this.d.getLooper());
        z6b.q("DataReconciliationManager", "ReconciliationUploadThread started, upload interval: " + ((S() / 1000) / 60) + " minutes, debug=" + y() + ", channelMode=" + w56.a());
    }

    public final boolean y() {
        return false;
    }

    public final String z(long j2, long j3) {
        return j3 == 0 ? "0.00" : String.format("%.2f", Double.valueOf((j2 * 100.0d) / j3));
    }
}
