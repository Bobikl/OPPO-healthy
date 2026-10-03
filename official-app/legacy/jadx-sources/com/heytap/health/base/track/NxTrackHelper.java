package com.heytap.health.base.track;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.device.api.DMHeytapRouterApi;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.heytap.store.base.core.util.KeyMaps;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ax7;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cp;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.m3k;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.qv8;
import com.oplus.aiunit.vision.sj5;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.vik;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.zq8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes15.dex */
public class NxTrackHelper {
    public static final String a;
    public static String b;
    public static h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f3261j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f3262l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<String> f3259c = new ArrayList<>();
    public static Context d = b78.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, Long> f3260e = new HashMap();
    public static Map<String, String> f = new HashMap();
    public static String g = "";
    public static final ExecutorService mExecutor = zq8.a("NearxTrack");
    public static boolean h = true;
    public static volatile long k = -1;
    public static int m = 0;

    @Keep
    public static class LabId {
        public long endTimestamp;
        public String expItemId;
    }

    @Keep
    public static class Result {
        public List<LabId> body;
        public int code;
        public String message;

        public boolean isSucceed() {
            return this.code == 0;
        }
    }

    public static class ShowPageProvider extends ContentProvider {
        @Override // android.content.ContentProvider
        @Nullable
        public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ShowPageProvider --> ");
            sb.append(str2);
            Bundle bundle2 = new Bundle();
            if (Objects.equals(str, "onActivityStopped")) {
                if (Objects.equals(str2, NxTrackHelper.u())) {
                    NxTrackHelper.Y("home_other");
                }
                synchronized (NxTrackHelper.class) {
                    bundle2.putStringArrayList("NearxTrackUtil", NxTrackHelper.f3259c);
                }
                return bundle2;
            }
            synchronized (NxTrackHelper.class) {
                if (!Objects.equals(str, "onActivityResumed")) {
                    return null;
                }
                NxTrackHelper.g = str2;
                NxTrackHelper.N(Objects.toString(str2, ""), null, false);
                bundle2.putStringArrayList("NearxTrackUtil", NxTrackHelper.f3259c);
                return bundle2;
            }
        }

        @Override // android.content.ContentProvider
        public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
            return 0;
        }

        @Override // android.content.ContentProvider
        @Nullable
        public String getType(@NonNull Uri uri) {
            return null;
        }

        @Override // android.content.ContentProvider
        @Nullable
        public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
            return null;
        }

        @Override // android.content.ContentProvider
        public boolean onCreate() {
            return false;
        }

        @Override // android.content.ContentProvider
        @Nullable
        public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
            return null;
        }

        @Override // android.content.ContentProvider
        public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
            return 0;
        }
    }

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            NxTrackHelper.f3261j = v9g.w().D("user_ssoid");
            NxTrackHelper.f3262l = v9g.x("NearxTrackUtil" + NxTrackHelper.f3261j).E("lab_ids", "");
            NxTrackHelper.k = v9g.x("NearxTrackUtil" + NxTrackHelper.f3261j).B("CACHE_QUERY_TIME", 0L);
            ((DMHeytapRouterApi) x0.d().b("/dmheytap/DBAccountDeviceProcessorApi").navigation()).u(new sj5() { // from class: com.oplus.aiunit.vision.xzc
                @Override // com.oplus.aiunit.vision.sj5
                public final void a(int i) {
                    NxTrackHelper.j(i);
                }
            });
        }
    }

    public class b implements cp {
        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            if (activity instanceof BaseActivity) {
                ((BaseActivity) activity).v3();
            } else {
                com.heytap.health.base.track.a.d();
            }
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull final Activity activity) {
            StringBuilder sb = new StringBuilder();
            sb.append(NxTrackHelper.a);
            sb.append(" : onActivityResumed--> ");
            sb.append(activity);
            synchronized (NxTrackHelper.class) {
                NxTrackHelper.g = NxTrackHelper.x(activity);
            }
            if (NxTrackHelper.A(activity)) {
                return;
            }
            NxTrackHelper.mExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.zzc
                @Override // java.lang.Runnable
                public final void run() {
                    NxTrackHelper.o(activity);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            if (NxTrackHelper.A(activity)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(NxTrackHelper.a);
            sb.append(" : onActivityStarted--> ");
            sb.append(activity);
            synchronized (NxTrackHelper.class) {
                if (activity instanceof f) {
                    a7b.b("NearxTrackUtil", "onActivityStarted--> <ignore> " + activity);
                    return;
                }
                NxTrackHelper.f3260e.put(NxTrackHelper.x(activity), Long.valueOf(System.currentTimeMillis()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(NxTrackHelper.a);
                sb2.append(" : onActivityStarted--> ");
                sb2.append(NxTrackHelper.f3260e.keySet());
            }
        }

        @Override // com.oplus.aiunit.vision.cp, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull final Activity activity) {
            StringBuilder sb = new StringBuilder();
            sb.append(NxTrackHelper.a);
            sb.append(" : onActivityStopped--> ");
            sb.append(activity);
            NxTrackHelper.mExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.yzc
                @Override // java.lang.Runnable
                public final void run() {
                    NxTrackHelper.n(activity);
                }
            });
        }
    }

    public interface c {
        String V4();
    }

    public interface d {
    }

    public interface e {
        Map<String, Object> h3();
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
        @m1e("v1/c2s/operation/queryHitExpItemList")
        lbd<Result> a();
    }

    static {
        ThreadUtils.doInBackground(new a());
        f3259c.add("home_other");
        f3259c.add("home_other");
        f3259c.add("home_other");
        a = gxe.c();
    }

    public static boolean A(Activity activity) {
        return activity instanceof d;
    }

    public static boolean B() {
        return Objects.equals(a, d.getPackageName());
    }

    public static void C(List<LabId> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (LabId labId : list) {
                long j2 = labId.endTimestamp;
                if (j2 == 0 || j2 > System.currentTimeMillis()) {
                    arrayList.add(Long.valueOf(Long.parseLong(labId.expItemId)));
                }
            }
            f3262l = t(arrayList);
        } else {
            LabId labId2 = list.get(0);
            StringBuilder sb = new StringBuilder();
            sb.append(" queryLabIds -- only one --> ");
            sb.append(labId2);
            long j3 = labId2.endTimestamp;
            if (j3 == 0 || j3 > System.currentTimeMillis()) {
                f3262l = labId2.expItemId;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" queryLabIds -- keepIds --> ");
        sb2.append(f3262l);
    }

    public static /* synthetic */ jdd D() throws Throwable {
        synchronized (NxTrackHelper.class) {
            if (k != -1 && !DateUtils.isToday(k) && !m3k.d()) {
                if (!qe0.r()) {
                    return lbd.M();
                }
                k = System.currentTimeMillis();
                a7b.f("NearxTrackUtil", " queryLabIds --> " + f3262l);
                if (i == null) {
                    i = (h) com.heytap.health.network.core.a.j(h.class);
                }
                return i.a();
            }
            return lbd.M();
        }
    }

    public static /* synthetic */ void E(Throwable th) throws Throwable {
        a7b.b("NearxTrackUtil", " queryLabIds -- keepIds from cache--> error " + th.getMessage());
    }

    public static /* synthetic */ void F(Result result) throws Throwable {
        k = 0L;
        if (!result.isSucceed()) {
            throw new RuntimeException("error " + result);
        }
        k = System.currentTimeMillis();
        List<LabId> list = result.body;
        if (list == null || list.isEmpty()) {
            a7b.f("NearxTrackUtil", " queryLabIds --> stop reset cache  " + result.code);
            f3262l = "";
            v9g.x("NearxTrackUtil" + f3261j).a0("lab_ids");
        } else {
            C(list);
            v9g.x("NearxTrackUtil" + f3261j).U("lab_ids", f3262l);
        }
        v9g.x("NearxTrackUtil" + f3261j).T("CACHE_QUERY_TIME", k);
        a7b.f("NearxTrackUtil", " queryLabIds --> succeed " + result.code);
    }

    public static /* synthetic */ void G(Throwable th) throws Throwable {
        k = 0L;
        a7b.b("NearxTrackUtil", th.getMessage());
    }

    public static /* synthetic */ void H() {
        v9g v9gVarX = v9g.x("NearxTrackUtil" + f3261j);
        int iZ = v9gVarX.z("UPDATE_REPORT", -1);
        if (iZ > 0) {
            if (qe0.m() > iZ) {
                com.heytap.health.base.track.a.G(1004, com.heytap.health.base.track.a.h("update_state", 1));
            } else {
                com.heytap.health.base.track.a.G(1004, com.heytap.health.base.track.a.h("update_state", 2));
            }
            v9gVarX.a0("UPDATE_REPORT");
        }
    }

    public static synchronized String I() {
        if (f3259c.isEmpty()) {
            a7b.b("NearxTrackUtil", a7b.e(new RuntimeException()));
            return "home_other";
        }
        if (f3259c.size() != 3) {
            return "home_other";
        }
        return f3259c.get(0);
    }

    public static synchronized String J() {
        if (f3259c.isEmpty()) {
            a7b.b("NearxTrackUtil", a7b.e(new RuntimeException()));
            return "home_other";
        }
        if (f3259c.size() != 3) {
            return "home_other";
        }
        return f3259c.get(1);
    }

    public static Map<String, Object> K(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        return map;
    }

    public static void L(String str, String str2) throws Throwable {
        a7b.f("NearxTrackUtil", str + "  notifyMainProcessShowPage --> " + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = d.getContentResolver().acquireUnstableContentProviderClient(y());
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        a7b.b("NearxTrackUtil", a + " : notifyMainProcessShowPage--> contentProviderClient = null ");
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                            return;
                        }
                        return;
                    }
                    if (str == null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                        return;
                    }
                    Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(str, str2, null);
                    if (bundleCall != null) {
                        f3259c = bundleCall.getStringArrayList("NearxTrackUtil");
                        StringBuilder sb = new StringBuilder();
                        sb.append(a);
                        sb.append(" : notifyMainProcessShowPage--> <other process> ");
                        sb.append(f3259c);
                    } else {
                        a7b.b("NearxTrackUtil", a + " : notifyMainProcessShowPage--> result = null <other process> " + f3259c);
                    }
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                } catch (Exception e2) {
                    e = e2;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    a7b.b("NearxTrackUtil", a + " : notifyMainProcessShowPage--> <other process> " + e.getMessage());
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void M(@NonNull Activity activity) {
        if (B() && (activity instanceof f)) {
            String strRemove = f.remove(x(activity));
            if (!TextUtils.isEmpty(strRemove)) {
                a7b.m("NearxTrackUtil", "onActivityResumed--> <lastshow> " + strRemove);
                Y(strRemove);
            }
            a7b.f("NearxTrackUtil", "onActivityResumed--> <ignore> " + activity);
            return;
        }
        String strX = x(activity);
        if (B()) {
            if (activity instanceof e) {
                N(strX, ((e) activity).h3(), activity instanceof g);
            } else {
                N(strX, null, activity instanceof g);
            }
            if (!strX.endsWith("LaunchActivity")) {
                Q(null);
            }
        } else {
            L("onActivityResumed", strX);
            a7b.f("NearxTrackUtil", a + " : onActivityResumed--> <other process> " + f3259c);
        }
    }

    public static void N(String str, Map<String, Object> map, boolean z) {
        Y(str);
        if (z) {
            a7b.f("NearxTrackUtil", "igonreReportKeepPage > " + str);
            return;
        }
        com.heytap.health.base.track.a.b bVarA = com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1);
        if (map != null) {
            for (String str2 : map.keySet()) {
                bVarA.a(str2, map.get(str2));
            }
        }
        bVarA.c("pageid", str);
    }

    @SuppressLint({"CheckResult"})
    public static void O() {
        StringBuilder sb = new StringBuilder();
        sb.append(" queryLabIds --> ");
        sb.append(k);
        lbd.z(new f4j() { // from class: com.oplus.aiunit.vision.szc
            @Override // com.oplus.aiunit.vision.f4j
            public final Object get() {
                return NxTrackHelper.D();
            }
        }).L0(su8.c()).H(new o14() { // from class: com.oplus.aiunit.vision.tzc
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                NxTrackHelper.E((Throwable) obj);
            }
        }).b(new o14() { // from class: com.oplus.aiunit.vision.uzc
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                NxTrackHelper.F((NxTrackHelper.Result) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.vzc
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                NxTrackHelper.G((Throwable) obj);
            }
        });
    }

    public static synchronized void P() {
        V();
        ax7.j().n(new b());
    }

    public static void Q(Map<String, Object> map) {
        if (h && B()) {
            if (map == null) {
                map = com.heytap.health.base.track.a.h("visitFrom", 1000);
            }
            com.heytap.health.base.track.a.G(1000, map);
            h = false;
        }
    }

    public static void R(Map<String, Object> map) {
        if (map == null) {
            map = com.heytap.health.base.track.a.h("visitFrom", 1000);
        }
        com.heytap.health.base.track.a.G(1001, map);
    }

    public static void S(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        com.heytap.health.base.track.a.G(5001, map);
    }

    public static void T(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        com.heytap.health.base.track.a.G(5002, map);
    }

    public static void U(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        com.heytap.health.base.track.a.G(5000, map);
    }

    public static void V() {
        if (B()) {
            new qv8(new Runnable() { // from class: com.oplus.aiunit.vision.wzc
                @Override // java.lang.Runnable
                public final void run() {
                    NxTrackHelper.H();
                }
            });
        }
    }

    public static void W() {
        v9g.x("NearxTrackUtil" + f3261j).S("UPDATE_REPORT", qe0.m());
    }

    public static boolean X(@NonNull Object obj) {
        return Y(x(obj));
    }

    public static synchronized boolean Y(@NonNull String str) {
        if (Objects.equals(str, u())) {
            return false;
        }
        O();
        f3259c.remove(0);
        f3259c.add(str);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" : showPage--> ");
        sb.append(f3259c);
        if (f3259c.size() == 3 && !f3259c.get(2).endsWith("LaunchActivity")) {
            Q(null);
        }
        if (f3259c.size() == 3 && f3259c.get(2).equals("home_other") && !f3259c.get(1).equals("home_other")) {
            h = true;
        }
        return true;
    }

    public static void Z(String str) {
        f3261j = str;
        a7b.f("NearxTrackUtil", "updateSSoid ");
        O();
    }

    public static /* bridge */ /* synthetic */ void j(int i2) {
        m = i2;
    }

    public static /* bridge */ /* synthetic */ void n(Activity activity) {
        q(activity);
    }

    public static /* bridge */ /* synthetic */ void o(Activity activity) {
        M(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void q(@NonNull Activity activity) {
        String strX = x(activity);
        if (B()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityStopped--> <check home> ");
            sb.append(g);
            if (Objects.equals(strX, g)) {
                a7b.b("NearxTrackUtil", "onActivityStopped--> <home> " + activity);
                Y("home_other");
            } else if (z(activity)) {
                f.put(strX, J());
                a7b.b("NearxTrackUtil", "onActivityStopped--> <ignore> <keeplast> " + activity);
                return;
            }
        } else if (Objects.equals(strX, g)) {
            StringBuilder sb2 = new StringBuilder();
            String str = a;
            sb2.append(str);
            sb2.append(" : activityStop--> <other process> <home> show home");
            a7b.b("NearxTrackUtil", sb2.toString());
            L("onActivityStopped", g);
            a7b.f("NearxTrackUtil", str + " : activityStop--> <other process> <home> " + f3259c);
        }
        if (activity instanceof f) {
            a7b.b("NearxTrackUtil", "onActivityStopped--> <ignore> " + activity);
            return;
        }
        Long lRemove = f3260e.remove(strX);
        if (lRemove == null) {
            a7b.b("NearxTrackUtil", "onActivityStopped--> <not fond> " + activity);
            return;
        }
        if (activity instanceof g) {
            a7b.b("NearxTrackUtil", "onActivityStopped--> <ignore report> " + activity);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - lRemove.longValue();
        com.heytap.health.base.track.a.b bVarA = com.heytap.health.base.track.a.y().a("pageid", strX).a(KeyMaps.REFERER, I());
        if (activity instanceof e) {
            v((e) activity, bVarA);
        }
        bVarA.c("duration", Long.valueOf(jCurrentTimeMillis));
    }

    public static void r(Map<String, Object> map) {
        if (TextUtils.isEmpty(f3262l)) {
            return;
        }
        map.put("abtCookies", f3262l);
    }

    public static void s(Map<String, Object> map) {
        if (TextUtils.isEmpty(f3261j)) {
            map.put("user_state", 2);
        } else {
            map.put("user_state", 1);
        }
        map.put("status", m > 0 ? "1" : "0");
        map.put("appTerminalId", w());
        if (map.get("pageid") == null) {
            map.put("pageid", u());
        }
        if (map.get(KeyMaps.REFERER) == null) {
            map.put(KeyMaps.REFERER, J());
        }
    }

    public static String t(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            try {
                if (list.size() != 0) {
                    sb.append(list.get(0));
                    sb.append("_");
                    for (int i2 = 1; i2 < list.size(); i2++) {
                        sb.append(list.get(i2).longValue() - list.get(i2 - 1).longValue());
                        sb.append("_");
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    return sb.toString();
                }
            } catch (Exception e2) {
                a7b.b("NearxTrackUtil", "compress e: " + e2.getMessage());
                return null;
            }
        }
        return sb.toString();
    }

    public static synchronized String u() {
        if (f3259c.size() != 3) {
            return "error";
        }
        return f3259c.get(2);
    }

    public static void v(@NonNull e eVar, com.heytap.health.base.track.a.b bVar) {
        Map<String, Object> mapH3 = eVar.h3();
        if (mapH3 == null) {
            return;
        }
        for (String str : mapH3.keySet()) {
            bVar.a(str, mapH3.get(str));
        }
    }

    public static String w() {
        if (b == null) {
            b = ilj.e();
        }
        return b;
    }

    public static String x(@NonNull Object obj) {
        if (obj instanceof c) {
            return ((c) obj).V4();
        }
        String name = obj.getClass().getName();
        int iIndexOf = name.indexOf(".", 11);
        return iIndexOf > 0 ? name.substring(iIndexOf + 1) : name;
    }

    public static Uri y() {
        return Uri.parse(NotificationApiService.CONTENT + d.getPackageName() + ".ShowPageProvider");
    }

    public static boolean z(Activity activity) {
        return activity instanceof f;
    }
}
