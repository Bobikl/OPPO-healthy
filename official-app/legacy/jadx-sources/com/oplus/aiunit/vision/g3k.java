package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.AlertDialog;
import com.heytap.health.base.account.IAccountService;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.task.ThreadUtils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class g3k {
    public static String DEFAULT_SSOID = "com.heytap.health";
    public static String PAGE_PRIVACY_STATEMENT = "/settings/PrivacyStatementActivity";
    public static Map<String, Runnable> featureTask = new HashMap();
    public static int a = -1;
    public static fyj b = new fyj(TimeUnit.SECONDS);

    public static boolean A(String str) {
        return !G(str);
    }

    public static /* synthetic */ void B() {
        a7b.f("TouristHelper", "checkLoginPrivacyState register request userinfo task");
        ((IAccountService) x0.d().b(IAccountService.ROUTER_PATH).navigation()).w();
    }

    public static /* synthetic */ void C() {
        Activity activityS = op.n().s();
        a7b.f("TouristHelper", "getTopAvailableActivity:" + activityS);
        if (activityS != null) {
            x0.d().b(com.heytap.health.base.tourist.a.f()).withBoolean("must_launch", true).navigation(activityS);
        }
    }

    public static /* synthetic */ void D(Activity activity, TouristLoginParam touristLoginParam) {
        AlertDialog alertDialogK = com.heytap.health.base.tourist.a.k(activity, touristLoginParam.getModuleId());
        if (alertDialogK != null) {
            J(activity, alertDialogK);
        }
    }

    public static /* synthetic */ Unit E(final TouristLoginParam touristLoginParam, final Activity activity) {
        if (!x()) {
            return null;
        }
        a7b.f("TouristHelper", "doInterceptRouter isInTouristMode: true, moduleId:" + touristLoginParam.getModuleId());
        if (h3k.f()) {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.c3k
                @Override // java.lang.Runnable
                public final void run() {
                    g3k.D(activity, touristLoginParam);
                }
            }, 100L);
            return null;
        }
        if (h3k.e()) {
            a7b.f("TouristHelper", "doInterceptRouter showInterceptTipsDialog");
            z(touristLoginParam);
            return null;
        }
        a7b.f("TouristHelper", "doInterceptRouter no need to showDialog, do something error");
        t();
        return null;
    }

    public static /* synthetic */ Boolean F() {
        return Boolean.valueOf(!h3k.f());
    }

    public static boolean G(String str) {
        return com.heytap.health.base.tourist.a.i(str);
    }

    public static boolean H(String str) {
        return m3k.d() && t3k.a(str);
    }

    public static boolean I() {
        boolean z = !PermissionRequestDialog.D(5, "android.permission.ACTIVITY_RECOGNITION");
        a7b.f("TouristHelper", "notAllowStepFunc allow:" + z);
        return z;
    }

    public static void J(Activity activity, AlertDialog alertDialog) {
        if (Build.VERSION.SDK_INT < 30 || alertDialog == null) {
            return;
        }
        if (activity == null && (activity = op.n().s()) == null) {
            return;
        }
        activity.registerActivityLifecycleCallbacks(new yr5(activity, alertDialog, new Function0() { // from class: com.oplus.aiunit.vision.f3k
            @Override // p010kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g3k.F();
            }
        }));
    }

    public static void K(int i) {
        a7b.f("TouristHelper", "protocolTrack :" + i);
        HashMap map = new HashMap();
        map.put("file_type", Integer.valueOf(i));
        map.put("app_version", Integer.valueOf(ilj.i()));
        map.put("signed_time", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        com.heytap.health.base.track.a.G(2022, map);
    }

    public static void L(String str, Runnable runnable) {
        a7b.f("TouristHelper", "registerTask page:" + str);
        featureTask.put(str, runnable);
    }

    public static void M(String str) {
        featureTask.remove(str);
    }

    public static void N(String str, String str2, String str3) {
        PAGE_PRIVACY_STATEMENT = str2;
        DEFAULT_SSOID = str3;
        com.heytap.health.base.tourist.a.j(str);
    }

    public static void O(boolean z) {
        if (!m3k.h()) {
            a7b.b("TouristHelper", "setIsInTouristMode has not agree health proto,origin set:" + z + ",set tourist mode true");
            z = true;
        }
        if (qe0.x()) {
            a7b.f("TouristHelper", "setIsInTouristMode() -- isMonkey");
            z = false;
        }
        a7b.f("TouristHelper", "setIsInTouristMode:" + z);
        m3k.r(z);
        if (z) {
            v9g.w().U("user_ssoid", DEFAULT_SSOID);
        }
    }

    public static void addClickProtoListener(bhd bhdVar) {
        com.heytap.health.base.tourist.a.addLoginDialogListener(bhdVar);
    }

    public static boolean f() {
        return g(null);
    }

    public static boolean g(Activity activity) {
        a7b.f("TouristHelper", "checkHasAgreeHealth:" + m3k.a());
        if (!x()) {
            a7b.f("TouristHelper", "checkHasAgreeHealth not in tourist mode, return true");
            return true;
        }
        if (m3k.h()) {
            a7b.f("TouristHelper", "checkHasAgreeHealth hasAgreeHealth return true");
            return true;
        }
        r(activity);
        return false;
    }

    public static boolean h(Intent intent) {
        String className;
        a7b.f("TouristHelper", "checkHasAgreeInternet intent");
        if (intent == null || intent.getComponent() == null || (className = intent.getComponent().getClassName()) == null) {
            a7b.f("TouristHelper", "checkHasAgreeInternet intent is null, do nothing");
            return true;
        }
        if (!className.endsWith("LaunchActivity") && !className.endsWith("PrivacyStatementActivity") && !className.endsWith("AgreementActivity")) {
            return p();
        }
        a7b.f("TouristHelper", "checkHasAgreeInternet is launchActivity, do nothing");
        return true;
    }

    public static boolean i(String str) {
        a7b.f("TouristHelper", "checkHasAgreeInternet routerPath");
        if (!str.equals(com.heytap.health.base.tourist.a.f()) && !str.equals("/settings/AgreementActivity") && !str.equals("/settings/PrivacyStatementActivity")) {
            return p();
        }
        a7b.f("TouristHelper", "checkHasAgreeInternet is launchActivity, do nothing");
        return true;
    }

    public static boolean j() {
        return l(new TouristLoginParam(h3k.b() ? 1 : 2, -1, ""));
    }

    public static boolean k(int i) {
        return l(new TouristLoginParam(h3k.b() ? 1 : 2, i, ""));
    }

    public static boolean l(TouristLoginParam touristLoginParam) {
        a7b.f("TouristHelper", "checkIsInTouristMode:" + x() + ",caller:" + m3k.a());
        if (!x()) {
            a7b.f("TouristHelper", "checkIsInTouristMode not tourist mode, do nothing");
            return false;
        }
        if (h3k.d()) {
            a7b.f("TouristHelper", "needInterceptByProto doInterceptRouter");
            s(null, touristLoginParam);
            return true;
        }
        t();
        a7b.f("TouristHelper", "checkIsInTouristMode no need intercept");
        return false;
    }

    public static boolean m(String str) {
        return l(new TouristLoginParam(h3k.b() ? 1 : 2, 19, str));
    }

    public static boolean n() {
        if (!h3k.f() || h3k.e()) {
            return false;
        }
        a7b.f("TouristHelper", "checkLoginPrivacyState agree,go to Launch");
        L("goLogin", new Runnable() { // from class: com.oplus.aiunit.vision.d3k
            @Override // java.lang.Runnable
            public final void run() {
                g3k.B();
            }
        });
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.e3k
            @Override // java.lang.Runnable
            public final void run() {
                g3k.C();
            }
        });
        return true;
    }

    public static boolean o(Intent intent) {
        boolean z = true;
        if (intent != null && x() && intent.getComponent() != null && G(intent.getComponent().getClassName())) {
            a7b.f("TouristHelper", "doInterceptIntent to class:" + intent.getComponent().getClassName() + ",was intercept");
            q();
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("doInterceptIntent touristMode:");
        sb.append(x());
        sb.append(",intent.getComponent() == null:");
        if (intent != null && intent.getComponent() != null) {
            z = false;
        }
        sb.append(z);
        a7b.f("TouristHelper", sb.toString());
        return false;
    }

    public static boolean p() {
        if (!h3k.g()) {
            a7b.f("TouristHelper", "checkHasAgreeInternet has agree internet, do nothing");
            return true;
        }
        a7b.f("TouristHelper", "checkHasAgreeInternet has not agree internet, go to launch");
        if (gxe.f(b78.a())) {
            a7b.f("TouristHelper", "doInterceptInternet reset.");
            m3k.t(false);
            m3k.m(false);
            x0.d().b(com.heytap.health.base.tourist.a.f()).navigation();
        }
        return false;
    }

    public static void q() {
        r(null);
    }

    public static void r(Activity activity) {
        s(activity, new TouristLoginParam(h3k.b() ? 1 : 2, -1, ""));
    }

    public static void removeClickProtoListener(bhd bhdVar) {
        com.heytap.health.base.tourist.a.removeLoginDialogListener(bhdVar);
    }

    public static void s(final Activity activity, final TouristLoginParam touristLoginParam) {
        b.a(1, new Function0() { // from class: com.oplus.aiunit.vision.b3k
            @Override // p010kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g3k.E(touristLoginParam, activity);
            }
        });
    }

    public static void t() {
        a7b.b("TouristHelper", "doSomethingOnError must be something error, tourist mode:" + x() + ",granted:" + m3k.f() + ",agree proto:" + m3k.h() + ",agreeInternet:" + m3k.i());
        if (x() && m3k.h() && m3k.f()) {
            a7b.b("TouristHelper", "set tourist false, go to Launch");
            O(false);
            x0.d().b(com.heytap.health.base.tourist.a.f()).withBoolean("must_launch", true).navigation();
        }
    }

    public static Runnable u(Object obj, String str, boolean z) {
        Runnable runnableRemove = z ? featureTask.remove(str) : featureTask.get(str);
        if (runnableRemove != null) {
            a7b.f("TouristHelper", obj.getClass().getSimpleName() + "start run task:" + str);
            runnableRemove.run();
        }
        return runnableRemove;
    }

    public static boolean v(Object obj, String str) {
        Runnable runnableRemove = featureTask.remove(str);
        if (runnableRemove == null) {
            return false;
        }
        a7b.f("TouristHelper", obj.getClass().getSimpleName() + "start run task:" + str);
        runnableRemove.run();
        return true;
    }

    public static String[] w(String[] strArr) {
        return l3k.a(strArr);
    }

    public static boolean x() {
        return m3k.d();
    }

    public static void y() {
        a7b.f("TouristHelper", "goLogin");
        z(new TouristLoginParam());
    }

    public static void z(TouristLoginParam touristLoginParam) {
        a7b.f("TouristHelper", "goLogin with ticket=" + touristLoginParam.getTicket());
        if (x()) {
            com.heytap.health.base.tourist.a.g(touristLoginParam.getCheckTouristFrom(), touristLoginParam.getTicket());
        }
    }
}
