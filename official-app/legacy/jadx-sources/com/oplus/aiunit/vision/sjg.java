package com.oplus.aiunit.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.drs.core.model.OTrackEvent;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class sjg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f16611e;
    public static final long f;
    public static final long g;
    public static final ScheduledExecutorService h;
    public final ConcurrentHashMap<String, h> a;
    public final AtomicBoolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16612c;
    public final BroadcastReceiver d;

    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "drs-sdk-rule-sync");
            thread.setDaemon(true);
            return thread;
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("com.oplus.framework.network.drs.action.EVENT_RULES_UPDATED".equals(action)) {
                sjg.this.u(intent);
            } else if ("com.oplus.framework.network.drs.action.DEBUG_MODE_CHANGED".equals(action)) {
                sjg.this.t(intent);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ h i;

        public c(h hVar) {
            this.i = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strQ = sjg.this.q(this.i);
            TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "initialSync requesting, appId=%s, duid=%s, duidSource=%s", this.i.a, sjg.A(strQ), sjg.this.p(this.i, strQ));
            sjg.this.G(this.i, strQ, false, "init");
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ h i;

        public d(h hVar) {
            this.i = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            sjg sjgVar = sjg.this;
            h hVar = this.i;
            sjgVar.G(hVar, sjgVar.q(hVar), false, "periodic");
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ h i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16615j;
        public final /* synthetic */ boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f16616l;

        public e(h hVar, String str, boolean z, String str2) {
            this.i = hVar;
            this.f16615j = str;
            this.k = z;
            this.f16616l = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            sjg.this.H(this.i, this.f16615j, this.k, this.f16616l);
        }
    }

    public class f implements ju9<String> {
        public final /* synthetic */ h a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f16617c;

        public f(h hVar, String str, String str2) {
            this.a = hVar;
            this.b = str;
            this.f16617c = str2;
        }

        @Override // com.oplus.aiunit.vision.ju9
        public void a(int i, String str, Throwable th) {
            TrackLogger.o("DRS_SDK_COMMON_SdkRuleManager", "sync rules failed, appId=%s, reason=%s, code=%s, msg=%s", this.a.a, this.f16617c, Integer.valueOf(i), str);
            sjg.this.B(this.a);
        }

        @Override // com.oplus.aiunit.vision.ju9
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    TrackLogger.o("DRS_SDK_COMMON_SdkRuleManager", "sync rules: empty result, appId=%s, reason=%s", this.a.a, this.f16617c);
                } else {
                    sjg.this.m(this.a, this.b, str);
                    int size = this.a.f16620j.size();
                    int iO = sjg.this.o();
                    h hVar = this.a;
                    TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "sync rules success, appId=%s, reason=%s, eventVersion=%s, sampleVersion=%s, prefilterEnabled=%s, debugMode=%s, ruleCount=%s, appStateCount=%s, totalRuleCount=%s, lastSyncedDuid=%s, requestDuid=%s", hVar.a, this.f16617c, Integer.valueOf(hVar.d), Integer.valueOf(this.a.f16619e), Boolean.valueOf(this.a.f), Boolean.valueOf(this.a.g), Integer.valueOf(size), Integer.valueOf(sjg.this.a.size()), Integer.valueOf(iO), sjg.A(this.a.h), sjg.A(this.b));
                }
            } catch (Throwable th) {
                try {
                    TrackLogger.d("DRS_SDK_COMMON_SdkRuleManager", "apply rule snapshot failed, appId=%s, reason=%s", th, this.a.a, this.f16617c);
                } finally {
                    sjg.this.B(this.a);
                }
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            sjg.this.D();
        }
    }

    public static final class h {
        public final String a;
        public volatile int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile int f16619e;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile boolean f16621l;
        public volatile boolean m;
        public volatile boolean o;
        public volatile ScheduledFuture<?> q;
        public int s;
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f16618c = new AtomicBoolean(false);
        public volatile boolean f = true;
        public volatile boolean g = false;
        public volatile String h = "";
        public volatile String i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile Map<String, j> f16620j = Collections.emptyMap();
        public volatile boolean k = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public volatile String f16622n = "";
        public volatile String p = "unknown";
        public long r = System.currentTimeMillis();
        public final AtomicInteger t = new AtomicInteger(0);
        public final AtomicInteger u = new AtomicInteger(0);

        public h(String str) {
            this.a = str;
        }
    }

    public static final class i {
        public static final sjg a = new sjg(null);
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f16611e = timeUnit.toMillis(30L);
        f = TimeUnit.HOURS.toMillis(2L);
        g = timeUnit.toMillis(1L);
        h = Executors.newSingleThreadScheduledExecutor(new a());
    }

    public /* synthetic */ sjg(a aVar) {
        this();
    }

    public static String A(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "(empty)";
        }
        if (str.length() <= 8) {
            return str;
        }
        return "***" + str.substring(str.length() - 8);
    }

    public static String n(String str, String str2) {
        return str + "#" + str2;
    }

    public static sjg r() {
        return i.a;
    }

    public static boolean z(@Nullable String str) {
        return (TextUtils.isEmpty(str) || OpenIdUtils.DEFAULT_VALUE.equals(str)) ? false : true;
    }

    public final void B(h hVar) {
        boolean z;
        synchronized (hVar) {
            if (hVar.m) {
                z = true;
            } else {
                z = false;
                hVar.f16621l = false;
            }
        }
        if (z) {
            K(hVar);
        }
    }

    public final void C(Context context) {
        if (context == null || !this.b.compareAndSet(false, true)) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.oplus.framework.network.drs.action.EVENT_RULES_UPDATED");
        intentFilter.addAction("com.oplus.framework.network.drs.action.DEBUG_MODE_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this.d, intentFilter, 2);
        } else {
            context.registerReceiver(this.d, intentFilter);
        }
    }

    public final void D() {
        for (h hVar : this.a.values()) {
            if (hVar != null) {
                int andSet = hVar.t.getAndSet(0);
                int andSet2 = hVar.u.getAndSet(0);
                if (andSet > 0) {
                    E(hVar.a, "client_prefilter_status_drop", andSet);
                }
                if (andSet2 > 0) {
                    E(hVar.a, "client_prefilter_sample_drop", andSet2);
                }
            }
        }
    }

    public final void E(String str, String str2, int i2) {
        try {
            ku9.f().m(new au6(str, "sdk_prefilter", str2, System.currentTimeMillis(), str2 + "|" + i2));
            TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "reportFiltered: appId=%s, reason=%s, count=%s", str, str2, Integer.valueOf(i2));
        } catch (Throwable th) {
            TrackLogger.o("DRS_SDK_COMMON_SdkRuleManager", "reportFiltered failed: appId=%s, reason=%s, error=%s", str, str2, th.getMessage());
        }
    }

    public void F(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        G(s(str), str2, z, str3);
    }

    public final void G(h hVar, @Nullable String str, boolean z, String str2) {
        boolean z2;
        if (hVar == null || TextUtils.isEmpty(hVar.a)) {
            return;
        }
        synchronized (hVar) {
            hVar.f16622n = str;
            z2 = false;
            hVar.o = hVar.o || z;
            hVar.p = str2;
            if (hVar.f16621l) {
                hVar.m = true;
            } else {
                hVar.f16621l = true;
                z2 = true;
            }
        }
        if (z2) {
            K(hVar);
        }
    }

    public final void H(h hVar, @Nullable String str, boolean z, String str2) {
        TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "requestRulesInternal, appId=%s, reason=%s, duid=%s, forceFull=%s, eventVersion=%s, sampleVersion=%s", hVar.a, str2, A(str), Boolean.valueOf(z), Integer.valueOf(hVar.d), Integer.valueOf(hVar.f16619e));
        try {
            ku9.f().e(hVar.a, hVar.d, hVar.f16619e, str, z, new f(hVar, str, str2));
        } catch (Throwable th) {
            TrackLogger.d("DRS_SDK_COMMON_SdkRuleManager", "requestRules exception, appId=%s, reason=%s", th, hVar.a, str2);
            B(hVar);
        }
    }

    public final void I() {
        if (this.f16612c.compareAndSet(false, true)) {
            ScheduledExecutorService scheduledExecutorService = h;
            g gVar = new g();
            long j2 = g;
            scheduledExecutorService.scheduleWithFixedDelay(gVar, j2, j2, TimeUnit.MILLISECONDS);
        }
    }

    public final void J(h hVar) {
        if (hVar.f16618c.compareAndSet(false, true)) {
            h.execute(new c(hVar));
        }
    }

    public final void K(h hVar) {
        String str;
        boolean z;
        String str2;
        synchronized (hVar) {
            str = hVar.f16622n;
            z = hVar.o;
            str2 = hVar.p;
            hVar.m = false;
            hVar.o = false;
        }
        h.execute(new e(hVar, str, z, str2));
    }

    public final void L(h hVar) {
        if (hVar.q != null) {
            return;
        }
        synchronized (hVar) {
            if (hVar.q != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorService = h;
            d dVar = new d(hVar);
            long j2 = f16611e;
            hVar.q = scheduledExecutorService.scheduleWithFixedDelay(dVar, j2, j2, TimeUnit.MILLISECONDS);
        }
    }

    public boolean M(@Nullable OTrackEvent oTrackEvent) {
        if (oTrackEvent == null) {
            return true;
        }
        return N(oTrackEvent.app_id, oTrackEvent.event_group, oTrackEvent.event_id, oTrackEvent.duid);
    }

    public boolean N(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, empty params, appId=%s, group=%s, eventId=%s", str, str2, str3);
            return true;
        }
        h hVar = this.a.get(str);
        if (hVar == null) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, no state for appId=%s", str);
            return true;
        }
        if (z(str4)) {
            hVar.i = str4;
        }
        if (hVar.g) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, DRS debugMode active, appId=%s, group=%s, eventId=%s", str, str2, str3);
            return true;
        }
        if (!hVar.f) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, prefilter disabled, appId=%s, group=%s, eventId=%s", str, str2, str3);
            return true;
        }
        Map<String, j> map = hVar.f16620j;
        j jVar = map.get(n(str2, str3));
        if (jVar == null) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, rule not found, appId=%s, group=%s, eventId=%s, ruleMapSize=%s, duid=%s, lastSyncedDuid=%s", str, str2, str3, Integer.valueOf(map.size()), A(str4), A(hVar.h));
            return true;
        }
        if (jVar.a) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: DROP by statusDecision, appId=%s, group=%s, eventId=%s", str, str2, str3);
            hVar.t.incrementAndGet();
            return false;
        }
        if (w(hVar)) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, duid sampling suppressed, appId=%s, group=%s, eventId=%s", str, str2, str3);
            return true;
        }
        if (!z(str4)) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, duid is empty or invalid, appId=%s, group=%s, eventId=%s, duid=%s, dropBySampling=%s", str, str2, str3, A(str4), Boolean.valueOf(jVar.b));
            return true;
        }
        if (!TextUtils.equals(str4, hVar.h)) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, duid mismatch, appId=%s, group=%s, eventId=%s, duid=%s, lastSyncedDuid=%s", str, str2, str3, A(str4), A(hVar.h));
            if (!O(hVar, str4)) {
                return true;
            }
            F(str, str4, true, "duid_changed");
            return true;
        }
        if (!jVar.b) {
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: pass, rule allows, appId=%s, group=%s, eventId=%s", str, str2, str3);
            return true;
        }
        TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "shouldUpload: DROP by samplingDecision, appId=%s, group=%s, eventId=%s, duid=%s", str, str2, str3, A(str4));
        hVar.u.incrementAndGet();
        return false;
    }

    public final boolean O(h hVar, @Nullable String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (hVar) {
            long j2 = jCurrentTimeMillis - hVar.r;
            long j3 = f;
            if (j2 >= j3) {
                hVar.r = jCurrentTimeMillis;
                hVar.s = 0;
            }
            int i2 = hVar.s;
            if (i2 >= 3) {
                TrackLogger.o("DRS_SDK_COMMON_SdkRuleManager", "duid change full sync suppressed, appId=%s, duid=%s, syncCount=%s, windowMs=%s", hVar.a, str, Integer.valueOf(i2), Long.valueOf(j3));
                return false;
            }
            int i3 = i2 + 1;
            hVar.s = i3;
            TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "duid change full sync granted, appId=%s, duid=%s, syncCount=%s, windowMs=%s", hVar.a, str, Integer.valueOf(i3), Long.valueOf(j3));
            return true;
        }
    }

    public final void m(h hVar, @Nullable String str, String str2) throws Exception {
        int i2;
        JSONObject jSONObject = new JSONObject(str2);
        hVar.f = jSONObject.optBoolean("prefilterEnabled", true);
        hVar.g = jSONObject.optBoolean("debugMode", false);
        hVar.d = jSONObject.optInt("eventVersion", 0);
        hVar.f16619e = jSONObject.optInt("sampleVersion", 0);
        if (!hVar.f) {
            hVar.f16620j = Collections.emptyMap();
            boolean z = !TextUtils.isEmpty(str);
            if (z) {
                hVar.h = str;
            }
            hVar.k = true;
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "applySnapshot: prefilter disabled, appId=%s, duidUpdated=%s", hVar.a, Boolean.valueOf(z));
            return;
        }
        if (jSONObject.optBoolean("notModified", false)) {
            boolean z2 = !TextUtils.isEmpty(str);
            if (z2) {
                hVar.h = str;
            }
            hVar.k = true;
            TrackLogger.c("DRS_SDK_COMMON_SdkRuleManager", "applySnapshot: notModified, appId=%s, duidUpdated=%s, lastSyncedDuid=%s", hVar.a, Boolean.valueOf(z2), A(hVar.h));
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rules");
        int length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
        HashMap map = new HashMap(length);
        if (jSONArrayOptJSONArray != null) {
            int i3 = 0;
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("eventGroup", "");
                    String strOptString2 = jSONObjectOptJSONObject.optString("eventId", "");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        int iOptInt = jSONObjectOptJSONObject.optInt("statusDecision", 1);
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("samplingDecision", 1);
                        int iOptInt3 = jSONObjectOptJSONObject.optInt("uploadType", -1);
                        if (iOptInt == 1 && iOptInt2 == 1 && iOptInt3 < 0) {
                            i3++;
                        } else {
                            j jVar = new j(null);
                            jVar.a = iOptInt == 0;
                            jVar.b = iOptInt2 == 0;
                            jVar.f16623c = iOptInt3;
                            map.put(n(strOptString, strOptString2), jVar);
                        }
                    }
                }
            }
            i2 = i3;
        } else {
            i2 = 0;
        }
        hVar.f16620j = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(map);
        boolean z3 = !TextUtils.isEmpty(str);
        if (z3) {
            hVar.h = str;
        }
        hVar.k = true;
        TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "applySnapshot: appId=%s, totalFromServer=%s, loadedRules=%s, skippedAllAllow=%s, requestDuid=%s, duidUpdated=%s, lastSyncedDuid=%s", hVar.a, Integer.valueOf(length), Integer.valueOf(map.size()), Integer.valueOf(i2), A(str), Boolean.valueOf(z3), A(hVar.h));
    }

    public final int o() {
        int size = 0;
        for (h hVar : this.a.values()) {
            if (hVar != null && hVar.f16620j != null) {
                size += hVar.f16620j.size();
            }
        }
        return size;
    }

    public final String p(h hVar, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return SpeechConstant.ENGINE_TYPE_NONE;
        }
        if (TextUtils.isEmpty(hVar.i) || !str.equals(hVar.i)) {
            return (TextUtils.isEmpty(hVar.h) || !str.equals(hVar.h)) ? "OpenIdUtils_fallback" : "lastSyncedDuid";
        }
        return "latestObservedDuid";
    }

    @Nullable
    public final String q(h hVar) {
        if (hVar == null) {
            return null;
        }
        if (z(hVar.i)) {
            return hVar.i;
        }
        if (z(hVar.h)) {
            return hVar.h;
        }
        try {
            Context contextB = c90.b();
            if (contextB != null) {
                String strK = OpenIdUtils.k(contextB);
                if (z(strK)) {
                    return strK;
                }
            }
        } catch (Throwable th) {
            TrackLogger.o("DRS_SDK_COMMON_SdkRuleManager", "getBestEffortDuid fallback failed: %s", th.getMessage());
        }
        return null;
    }

    public final h s(String str) {
        h hVar = this.a.get(str);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(str);
        h hVarPutIfAbsent = this.a.putIfAbsent(str, hVar2);
        return hVarPutIfAbsent != null ? hVarPutIfAbsent : hVar2;
    }

    public final void t(Intent intent) {
        h hVar;
        String stringExtra = intent.getStringExtra("extra_debug_mode_app_id");
        boolean booleanExtra = intent.getBooleanExtra("extra_debug_mode_active", false);
        TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "debugMode broadcast received, targetAppId=%s, active=%s", stringExtra, Boolean.valueOf(booleanExtra));
        if (!TextUtils.isEmpty(stringExtra) && (hVar = this.a.get(stringExtra)) != null) {
            hVar.g = booleanExtra;
            TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "debugMode updated immediately, appId=%s, active=%s", stringExtra, Boolean.valueOf(booleanExtra));
            return;
        }
        for (h hVar2 : this.a.values()) {
            hVar2.g = booleanExtra;
            TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "debugMode updated (fallback), appId=%s, active=%s", hVar2.a, Boolean.valueOf(booleanExtra));
        }
    }

    public final void u(Intent intent) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("extra_app_ids");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            for (h hVar : this.a.values()) {
                G(hVar, q(hVar), false, "broadcast_all");
            }
            return;
        }
        Iterator<String> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            h hVar2 = this.a.get(it.next());
            if (hVar2 != null) {
                G(hVar2, q(hVar2), false, "broadcast");
            }
        }
    }

    public void v(@Nullable Context context, @Nullable String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        C(context.getApplicationContext());
        h hVarS = s(str);
        if (hVarS.b.compareAndSet(false, true)) {
            TrackLogger.h("DRS_SDK_COMMON_SdkRuleManager", "init rule manager state, appId=%s, appStateCount=%s", str, Integer.valueOf(this.a.size()));
            J(hVarS);
            L(hVarS);
            I();
        }
    }

    public final boolean w(h hVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (hVar) {
            if (jCurrentTimeMillis - hVar.r < f) {
                return hVar.s >= 3;
            }
            hVar.r = jCurrentTimeMillis;
            hVar.s = 0;
            return false;
        }
    }

    public boolean x(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        h hVar;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || (hVar = this.a.get(str)) == null || hVar.f16620j == null) {
            return false;
        }
        j jVar = hVar.f16620j.get(n(str2, str3));
        return jVar != null && jVar.f16623c == 2;
    }

    public boolean y(@Nullable String str) {
        h hVar;
        return (TextUtils.isEmpty(str) || (hVar = this.a.get(str)) == null || !hVar.k) ? false : true;
    }

    public static final class j {
        public boolean a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16623c;

        public j() {
            this.f16623c = -1;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public sjg() {
        this.a = new ConcurrentHashMap<>();
        this.b = new AtomicBoolean(false);
        this.f16612c = new AtomicBoolean(false);
        this.d = new b();
    }
}
