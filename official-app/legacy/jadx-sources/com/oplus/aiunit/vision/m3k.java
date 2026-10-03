package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes15.dex */
public class m3k {
    public static final String STORE_PROTO_KEY = "KEY_AGREE_STORE";
    public static final String STORE_TAB_NAME = "SCHEME_FILE_NAME";
    public static final String STORE_USER_KEY = "KEY_USER_AGREEMENT";
    public static boolean a = false;
    public static MutableLiveData<Boolean> b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f13941c = false;
    public static volatile int d = -1;

    static {
        l();
    }

    public static String a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (i > 1 && i <= 5) {
                sb.append("(");
                sb.append(stackTraceElement.getClassName());
                sb.append(",");
                sb.append(stackTraceElement.getMethodName());
                sb.append("),");
            }
            if (i > 4) {
                break;
            }
            i++;
        }
        return sb.toString();
    }

    public static MutableLiveData<Boolean> b() {
        if (b.getValue() == null) {
            b.postValue(Boolean.valueOf(h()));
        }
        return b;
    }

    public static boolean c() {
        return !d() && v9g.w().r("child_mode", false);
    }

    public static boolean d() {
        if (gxe.f(b78.a()) && d != -1) {
            return d == 1;
        }
        boolean zR = v9g.w().r("tourist_mode", true);
        d = zR ? 1 : 0;
        return zR;
    }

    public static boolean e() {
        return a;
    }

    public static boolean f() {
        return v9g.w().r("login_granted", false);
    }

    public static boolean g() {
        boolean zR = v9g.x("health_oobe_protocol").r("isAgreeProtocol", false);
        if (zR) {
            n(true);
        }
        return zR;
    }

    public static boolean h() {
        if (f13941c) {
            return f13941c;
        }
        f13941c = v9g.x("health_oobe_protocol").r("tourist_proto_health", false) || g();
        return f13941c;
    }

    public static boolean i() {
        boolean zR = v9g.x("health_oobe_protocol").r("isHaveInternet", false);
        if (zR) {
            return zR;
        }
        if (!h() && !k()) {
            return zR;
        }
        a7b.f("TouristStatus", "hasAgreeHealth or tourist proto,set agree internet true");
        o(true);
        return true;
    }

    public static boolean j() {
        return v9g.x(STORE_TAB_NAME).r(STORE_PROTO_KEY, false) && v9g.x(STORE_TAB_NAME).r(STORE_USER_KEY, false);
    }

    public static boolean k() {
        return v9g.x("health_oobe_protocol").r("isAgreeTouristProtocol", false);
    }

    public static void l() {
        v9g v9gVarX = v9g.x("health_oobe_protocol");
        if (v9gVarX.t() <= 1) {
            v9g v9gVarX2 = v9g.x("health_share_preference_oobe");
            boolean zQ = v9gVarX2.q("tourist_proto_health");
            boolean zQ2 = v9gVarX2.q("isAgreeProtocol");
            boolean zQ3 = v9gVarX2.q("isHaveInternet");
            boolean zQ4 = v9gVarX2.q("needShowProto");
            boolean zQ5 = v9gVarX2.q("isAgreeTouristProtocol");
            if (zQ) {
                v9gVarX.W("tourist_proto_health", zQ);
            }
            if (zQ2) {
                v9gVarX.W("isAgreeProtocol", zQ2);
            }
            if (zQ3) {
                v9gVarX.W("isHaveInternet", zQ3);
            }
            if (zQ4) {
                v9gVarX.W("needShowProto", zQ4);
            }
            if (zQ5) {
                v9gVarX.W("isAgreeTouristProtocol", zQ5);
            }
        }
    }

    public static void m(boolean z) {
        boolean zR = v9g.x("health_oobe_protocol").r("isAgreeProtocol", false);
        a7b.f("TouristStatus", "setHasAgreeAllProto:" + z + ",agree sp:" + zR + ",caller:" + a());
        if (z != zR) {
            v9g.x("health_oobe_protocol").W("isAgreeProtocol", z);
        }
        if (!z) {
            q(false);
            r(true);
        }
        n(z);
    }

    public static void n(boolean z) {
        boolean zR = v9g.x("health_oobe_protocol").r("tourist_proto_health", false);
        a7b.f("TouristStatus", "setAgreeHealth:" + z + ",agreeSp:" + zR + ",caller:" + a());
        if (z != zR) {
            a7b.f("TouristStatus", "setAgreeHealth doRealHealth:" + z + ",caller:" + a());
            v9g.x("health_oobe_protocol").W("tourist_proto_health", z);
            MutableLiveData<Boolean> mutableLiveData = b;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(Boolean.valueOf(z));
            }
        }
        if (z || d()) {
            return;
        }
        a7b.f("TouristStatus", "setAgreeHealth false, resetTouristMode");
        r(true);
    }

    public static void o(boolean z) {
        a7b.f("TouristStatus", "setAgreeInternet:" + z + ",getCaller:" + a());
        v9g.x("health_oobe_protocol").W("isHaveInternet", z);
    }

    public static void p(boolean z) {
        a7b.f("TouristStatus", "setAgreeStore:" + z + ",caller:" + a());
        v9g.x(STORE_TAB_NAME).W(STORE_PROTO_KEY, z);
        v9g.x(STORE_TAB_NAME).W(STORE_USER_KEY, z);
    }

    public static void q(boolean z) {
        v9g.x("health_oobe_protocol").W("isAgreeTouristProtocol", z);
    }

    public static void r(boolean z) {
        a7b.f("TouristStatus", "setIsInTouristMode:" + z + ",caller:" + a());
        d = z ? 1 : 0;
        v9g.w().W("tourist_mode", z);
    }

    public static void s(boolean z) {
        a = z;
    }

    public static void t(boolean z) {
        a7b.f("TouristStatus", "setUserHasGranted:" + z + ",caller:" + a());
        v9g.w().W("login_granted", z);
        if (z || d()) {
            return;
        }
        a7b.f("TouristStatus", "setUserHasGranted false,put tourist mode true");
        r(true);
    }
}
