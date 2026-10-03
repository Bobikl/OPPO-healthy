package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.oplus.drs.core.model.OTrackEvent;
import com.oplus.drs.rom.sdk.comm.db.ClientDataEntity;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class lf3 {
    public final Context a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final flk f13668c;
    public final bf3 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mf3 f13669e;
    public final o7h f;
    public final tt6 g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HandlerThread f13671l;
    public Handler m;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f13670j = new AtomicLong(0);
    public final AtomicLong k = new AtomicLong(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f13672n = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TrackLogger.c("DRS_SDK_COMMON_ClientDataCacheManager", "Starting periodic cleanup task...", new Object[0]);
                lf3.this.m();
                TrackLogger.c("DRS_SDK_COMMON_ClientDataCacheManager", "Periodic cleanup task completed", new Object[0]);
            } catch (Exception e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Periodic cleanup task exception", e2, new Object[0]);
            } finally {
                if (lf3.this.m != null && !lf3.this.i.get()) {
                    lf3.this.m.postDelayed(lf3.this.f13672n, 3600000L);
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                lf3.this.u();
                lf3.this.v();
                TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "DataCacheManager initialization completed", new Object[0]);
            } catch (Exception e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "DataCacheManager initialization failed", e2, new Object[0]);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            try {
                long jK = lf3.this.f13669e.k();
                if (jK > lf3.this.f13668c.c()) {
                    TrackLogger.o("DRS_SDK_COMMON_ClientDataCacheManager", "Cache size exceeded: %s > %s", Long.valueOf(jK), Long.valueOf(lf3.this.f13668c.c()));
                    i = 1;
                    i2 = 2;
                    lf3.this.g.f(lf3.this.b, jK, lf3.this.f13668c.c(), lf3.this.f13669e.j(), lf3.this.f13668c.b());
                    if (lf3.this.d != null) {
                        lf3.this.d.f(jK, lf3.this.f13668c.c());
                    }
                    int iB = (int) (((double) lf3.this.f13668c.b()) * 0.1d);
                    if (iB > 0) {
                        int iD = lf3.this.f13669e.d(iB);
                        TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "Cleaned oldest data (size exceeded): %s records", Integer.valueOf(iD));
                        if (iD > 0) {
                            lf3.this.g.a(lf3.this.b, iD, "cache_size_exceeded", jK, lf3.this.f13669e.j(), System.currentTimeMillis());
                        }
                    }
                } else {
                    i = 1;
                    i2 = 2;
                }
                int iJ = lf3.this.f13669e.j();
                if (iJ > lf3.this.f13668c.b()) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = Integer.valueOf(iJ);
                    objArr[i] = Integer.valueOf(lf3.this.f13668c.b());
                    TrackLogger.o("DRS_SDK_COMMON_ClientDataCacheManager", "Cache count exceeded: %s > %s", objArr);
                    if (lf3.this.d != null) {
                        lf3.this.d.e(iJ, lf3.this.f13668c.b());
                    }
                    int iB2 = (int) (((double) lf3.this.f13668c.b()) * 0.1d);
                    if (iB2 > 0) {
                        int iD2 = lf3.this.f13669e.d(iB2);
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = Integer.valueOf(iD2);
                        TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "Cleaned oldest data (count exceeded): %s records", objArr2);
                        if (iD2 > 0) {
                            lf3.this.g.a(lf3.this.b, iD2, "cache_count_exceeded", lf3.this.f13669e.k(), iJ, System.currentTimeMillis());
                        }
                    }
                }
            } catch (Exception e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to check cache limits", e2, new Object[0]);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "Starting to recover abnormal status data...", new Object[0]);
                TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "Abnormal status data recovery completed: %s records", Integer.valueOf(lf3.this.f13669e.r()));
            } catch (Exception e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to recover abnormal status data", e2, new Object[0]);
            }
        }
    }

    public lf3(Context context, String str, flk flkVar, bf3 bf3Var, df3 df3Var) {
        if (context == null) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "Context cannot be null", new Object[0]);
            throw new IllegalArgumentException("Context cannot be null");
        }
        if (flkVar == null) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "UploadConfig cannot be null", new Object[0]);
            throw new IllegalArgumentException("UploadConfig cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        this.f13668c = flkVar;
        this.d = bf3Var;
        this.f13669e = kf3.a(applicationContext, str);
        this.f = new o7h(512000);
        tt6 tt6VarG = tt6.g();
        this.g = tt6VarG;
        tt6VarG.h(this, str);
        q();
    }

    public final void l() {
        if (this.f13669e == null || this.f13668c == null) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "DAO or UploadConfig is null, cannot check cache", new Object[0]);
        } else {
            owj.a(new c());
        }
    }

    public final void m() {
        if (this.f13669e == null) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "DAO is null, cannot clean orphaned data", new Object[0]);
            return;
        }
        try {
            int iE = this.f13669e.e(System.currentTimeMillis() - TimeUnit.MINUTES.toMillis(5L));
            if (iE > 0) {
                TrackLogger.o("DRS_SDK_COMMON_ClientDataCacheManager", "Found orphaned data: %s records, recovering...", Integer.valueOf(iE));
                TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "Recovered orphaned data: %s records", Integer.valueOf(this.f13669e.r()));
            }
            List<ClientDataEntity> listQ = this.f13669e.q(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(7L));
            if (listQ != null && !listQ.isEmpty()) {
                TrackLogger.o("DRS_SDK_COMMON_ClientDataCacheManager", "Found expired data: %s records", Integer.valueOf(listQ.size()));
                HashMap map = new HashMap();
                long eventTime = Long.MAX_VALUE;
                for (ClientDataEntity clientDataEntity : listQ) {
                    String strP = p(clientDataEntity.getStatus());
                    Integer num = (Integer) map.get(strP);
                    map.put(strP, Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
                    if (clientDataEntity.getEventTime() > 0 && clientDataEntity.getEventTime() < eventTime) {
                        eventTime = clientDataEntity.getEventTime();
                    }
                }
                this.g.c(this.b, listQ.size(), 7, eventTime == Long.MAX_VALUE ? System.currentTimeMillis() : eventTime, map);
                ArrayList arrayList = new ArrayList();
                Iterator<ClientDataEntity> it = listQ.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(it.next().getId()));
                }
                TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "Deleted expired data: %s records", Integer.valueOf(this.f13669e.f(arrayList)));
            }
            if (s56.g() && this.f13669e.j() == 0) {
                sli.a(this.a, this.b);
                TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "Standalone drain completed, totalCount=0, appId=%s", this.b);
            }
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to clean orphaned data", e2, new Object[0]);
        }
    }

    public int n(List<Long> list) {
        if (list == null || list.isEmpty()) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "IDs list is null or empty", new Object[0]);
            return 0;
        }
        if (this.i.get()) {
            return 0;
        }
        try {
            TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "delete size: %s", Integer.valueOf(list.size()));
            return this.f13669e.f(list);
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to delete uploaded data", e2, new Object[0]);
            return 0;
        }
    }

    public int o() {
        if (this.i.get()) {
            return 0;
        }
        try {
            return this.f13669e.h();
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to get pending data count", e2, new Object[0]);
            return 0;
        }
    }

    public final String p(int i) {
        if (i == 0) {
            return "PENDING";
        }
        if (i != 1) {
            return i != 2 ? LanConstants.OPERATOR_UNKNOWN : "FAILED";
        }
        return "UPLOADING";
    }

    public final void q() {
        if (this.h.compareAndSet(false, true)) {
            owj.a(new b());
        }
    }

    public int r(List<Long> list) {
        if (list == null || list.isEmpty()) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "IDs list is null or empty", new Object[0]);
            return -1;
        }
        if (this.i.get()) {
            return -1;
        }
        try {
            int iM = this.f13669e.m(list);
            TrackLogger.c("DRS_SDK_COMMON_ClientDataCacheManager", "Marked as pending: count=%s", Integer.valueOf(iM));
            return iM;
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to mark as pending", e2, new Object[0]);
            return -1;
        }
    }

    public int s(List<Long> list) {
        if (list == null || list.isEmpty()) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "IDs list is null or empty", new Object[0]);
            return -1;
        }
        if (this.i.get()) {
            return -1;
        }
        try {
            int iN = this.f13669e.n(list);
            TrackLogger.c("DRS_SDK_COMMON_ClientDataCacheManager", "Marked as uploading: count=%s", Integer.valueOf(iN));
            return iN;
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to mark as uploading", e2, new Object[0]);
            return -1;
        }
    }

    public List<ClientDataEntity> t(int i) {
        if (this.i.get()) {
            return Collections.emptyList();
        }
        try {
            return this.f13669e.i(i);
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to read pending data", e2, new Object[0]);
            return Collections.emptyList();
        }
    }

    public final void u() {
        if (this.f13669e == null) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "DAO is null, cannot recover abnormal data", new Object[0]);
        } else {
            owj.a(new d());
        }
    }

    public final void v() {
        HandlerThread handlerThread = new HandlerThread("DataCleanupThread");
        this.f13671l = handlerThread;
        handlerThread.start();
        this.m = new Handler(this.f13671l.getLooper());
        TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "HandlerThread cleanup scheduler started, interval: %s ms", 3600000L);
        this.m.post(this.f13672n);
    }

    public long w(OTrackEvent oTrackEvent) {
        long jLongValue;
        int i;
        if (oTrackEvent == null) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "OTrackEvent cannot be null", new Object[0]);
            return -1L;
        }
        if (this.i.get()) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "DataCacheManager has been released; cannot write data", new Object[0]);
            return -1L;
        }
        try {
            try {
                String str = oTrackEvent.ouid;
                if (str == null || str.isEmpty()) {
                    oTrackEvent.ouid = OpenIdUtils.n(this.a);
                }
                String str2 = oTrackEvent.duid;
                if (str2 == null || str2.isEmpty()) {
                    oTrackEvent.duid = OpenIdUtils.k(this.a);
                }
                String str3 = oTrackEvent.pkgName;
                if (str3 == null || str3.isEmpty()) {
                    oTrackEvent.pkgName = this.a.getPackageName();
                }
                oTrackEvent.pkgVersionName = se0.c(this.a);
                oTrackEvent.pkgVersionCode = se0.b(this.a);
                String str4 = oTrackEvent.uuid;
                if (str4 == null || str4.isEmpty()) {
                    oTrackEvent.uuid = UUID.randomUUID().toString();
                }
            } catch (Exception e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Failed to fill OTrackEvent fields", e2, new Object[0]);
            }
            long eventTime = oTrackEvent.getEventTime();
            if (eventTime <= 0) {
                eventTime = System.currentTimeMillis();
            }
            Pair<Long, Integer> pairI = com.oplus.drs.base.ntp.b.f().i();
            if (((Integer) pairI.second).intValue() != 1) {
                long j2 = this.k.get();
                jLongValue = j2 != 0 ? j2 + eventTime : eventTime;
                if (j2 == 0) {
                    i = 2;
                }
                oTrackEvent.event_time = jLongValue;
                oTrackEvent.event_time_type = i;
                if (!TextUtils.isEmpty(oTrackEvent.app_id) || TextUtils.isEmpty(oTrackEvent.event_group) || TextUtils.isEmpty(oTrackEvent.event_id)) {
                    TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "Missing required field.", new Object[0]);
                    this.g.d(this.b, oTrackEvent.event_group, oTrackEvent.event_id, oTrackEvent.event_time);
                    return -1L;
                }
                try {
                    String string = new JSONObject(oTrackEvent.toJson()).toString();
                    if (string.isEmpty()) {
                        TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "OTrackEvent JSON string is empty", new Object[0]);
                        return -1L;
                    }
                    o7h.a aVarA = this.f.a(string);
                    if (!aVarA.d()) {
                        TrackLogger.o("DRS_SDK_COMMON_ClientDataCacheManager", "Data size validation failed: %s", aVarA.c());
                        this.g.e(this.b, oTrackEvent.getEventGroup(), oTrackEvent.getEventId(), jLongValue, aVarA.a(), aVarA.b());
                        return -1L;
                    }
                    long j3 = jLongValue;
                    int iA = aVarA.a();
                    l();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jL = this.f13669e.l(new ClientDataEntity(0L, string, j3, this.b, 0, 0, jCurrentTimeMillis, jCurrentTimeMillis, iA));
                    if (jL <= 0) {
                        TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "Database insert failed", new Object[0]);
                        this.g.b(this.b, oTrackEvent.getEventGroup(), oTrackEvent.getEventId(), j3, "Database insert returned id <= 0");
                        return -1L;
                    }
                    this.f13670j.incrementAndGet();
                    TrackLogger.h("DRS_SDK_COMMON_ClientDataCacheManager", "Data write successful: id=%s, eventGroup=%s, eventId=%s, eventTimeLocal=%s, calibratedEventTime=%s, timeType=%s, size=%s", Long.valueOf(jL), oTrackEvent.getEventGroup(), oTrackEvent.getEventId(), Long.valueOf(eventTime), Long.valueOf(j3), Integer.valueOf(i), Integer.valueOf(iA));
                    return jL;
                } catch (Exception e3) {
                    TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "OTrackEvent JSON serialize with calibrated time failed", e3, new Object[0]);
                    return -1L;
                }
            }
            jLongValue = ((Long) pairI.first).longValue();
            i = 1;
            oTrackEvent.event_time = jLongValue;
            oTrackEvent.event_time_type = i;
            if (TextUtils.isEmpty(oTrackEvent.app_id)) {
            }
            TrackLogger.e("DRS_SDK_COMMON_ClientDataCacheManager", "Missing required field.", new Object[0]);
            this.g.d(this.b, oTrackEvent.event_group, oTrackEvent.event_id, oTrackEvent.event_time);
            return -1L;
        } catch (Exception e4) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataCacheManager", "Data write failed", e4, new Object[0]);
            this.g.b(this.b, oTrackEvent.getEventGroup(), oTrackEvent.getEventId(), oTrackEvent.event_time, e4.getMessage());
            return -1L;
        }
    }
}
