package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class waa {
    public static long A(String str, long j2) {
        String str2 = "insight_config_hrvLastShowTime";
        if (str != null) {
            str2 = "insight_config_hrvLastShowTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static void A0(int i) {
        B0(i, null);
    }

    public static String B() {
        return C("");
    }

    public static void B0(int i, String str) {
        String str2 = "insight_config_calorieLastShow";
        if (str != null) {
            str2 = "insight_config_calorieLastShow_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Integer.valueOf(i));
    }

    public static String C(String str) {
        return D(null, str);
    }

    public static void C0(long j2) {
        D0(j2, null);
    }

    public static String D(String str, String str2) {
        String str3 = "insight_config_insightFeedback";
        if (str != null) {
            str3 = "insight_config_insightFeedback_" + str;
        }
        return (String) x0h.b("heytap_health_healthImpl.xml", str3, str2);
    }

    public static void D0(long j2, String str) {
        String str2 = "insight_config_calorieLastShowTime";
        if (str != null) {
            str2 = "insight_config_calorieLastShowTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }

    public static boolean E() {
        return G(false);
    }

    public static void E0(long j2) {
        F0(j2, null);
    }

    public static boolean F(String str, boolean z) {
        String str2 = "insight_config_notifyConsumptionTrend";
        if (str != null) {
            str2 = "insight_config_notifyConsumptionTrend_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void F0(long j2, String str) {
        String str2 = "insight_config_crossAnaLastModifiedTime";
        if (str != null) {
            str2 = "insight_config_crossAnaLastModifiedTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }

    public static boolean G(boolean z) {
        return F(null, z);
    }

    public static void G0(String str) {
        H0(str, null);
    }

    public static boolean H() {
        return J(true);
    }

    public static void H0(String str, String str2) {
        String str3 = "insight_config_crossAnaNotifyFreq";
        if (str2 != null) {
            str3 = "insight_config_crossAnaNotifyFreq_" + str2;
        }
        x0h.d("heytap_health_healthImpl.xml", str3, str);
    }

    public static boolean I(String str, boolean z) {
        String str2 = "insight_config_notifyHeartRateTrend";
        if (str != null) {
            str2 = "insight_config_notifyHeartRateTrend_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void I0(int i) {
        J0(i, null);
    }

    public static boolean J(boolean z) {
        return I(null, z);
    }

    public static void J0(int i, String str) {
        String str2 = "insight_config_hrLastShow";
        if (str != null) {
            str2 = "insight_config_hrLastShow_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Integer.valueOf(i));
    }

    public static boolean K() {
        return M(true);
    }

    public static void K0(long j2) {
        L0(j2, null);
    }

    public static boolean L(String str, boolean z) {
        String str2 = "insight_config_notifyPhysicalMentalState";
        if (str != null) {
            str2 = "insight_config_notifyPhysicalMentalState_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void L0(long j2, String str) {
        String str2 = "insight_config_hrLastShowTime";
        if (str != null) {
            str2 = "insight_config_hrLastShowTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }

    public static boolean M(boolean z) {
        return L(null, z);
    }

    public static void M0(int i) {
        N0(i, null);
    }

    public static boolean N() {
        return P(true);
    }

    public static void N0(int i, String str) {
        String str2 = "insight_config_hrvLastShow";
        if (str != null) {
            str2 = "insight_config_hrvLastShow_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Integer.valueOf(i));
    }

    public static boolean O(String str, boolean z) {
        String str2 = "insight_config_notifySleepTrend";
        if (str != null) {
            str2 = "insight_config_notifySleepTrend_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void O0(long j2) {
        P0(j2, null);
    }

    public static boolean P(boolean z) {
        return O(null, z);
    }

    public static void P0(long j2, String str) {
        String str2 = "insight_config_hrvLastShowTime";
        if (str != null) {
            str2 = "insight_config_hrvLastShowTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }

    public static boolean Q() {
        return S(true);
    }

    public static void Q0(String str) {
        R0(str, null);
    }

    public static boolean R(String str, boolean z) {
        String str2 = "insight_config_notifySleepVitalSigns";
        if (str != null) {
            str2 = "insight_config_notifySleepVitalSigns_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void R0(String str, String str2) {
        String str3 = "insight_config_insightFeedback";
        if (str2 != null) {
            str3 = "insight_config_insightFeedback_" + str2;
        }
        x0h.d("heytap_health_healthImpl.xml", str3, str);
    }

    public static boolean S(boolean z) {
        return R(null, z);
    }

    public static void S0(boolean z) {
        T0(z, null);
    }

    public static boolean T() {
        return V(false);
    }

    public static void T0(boolean z, String str) {
        String str2 = "insight_config_notifyConsumptionTrend";
        if (str != null) {
            str2 = "insight_config_notifyConsumptionTrend_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z));
    }

    public static boolean U(String str, boolean z) {
        String str2 = "insight_config_notifyStepTrend";
        if (str != null) {
            str2 = "insight_config_notifyStepTrend_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void U0(boolean z) {
        V0(z, null);
    }

    public static boolean V(boolean z) {
        return U(null, z);
    }

    public static void V0(boolean z, String str) {
        String str2 = "insight_config_notifyHeartRateTrend";
        if (str != null) {
            str2 = "insight_config_notifyHeartRateTrend_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z));
    }

    public static boolean W() {
        return Y(true);
    }

    public static void W0(boolean z) {
        X0(z, null);
    }

    public static boolean X(String str, boolean z) {
        String str2 = "insight_config_notifyWristTemperature";
        if (str != null) {
            str2 = "insight_config_notifyWristTemperature_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void X0(boolean z, String str) {
        String str2 = "insight_config_notifyPhysicalMentalState";
        if (str != null) {
            str2 = "insight_config_notifyPhysicalMentalState_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z));
    }

    public static boolean Y(boolean z) {
        return X(null, z);
    }

    public static void Y0(boolean z) {
        Z0(z, null);
    }

    public static String Z() {
        return a0("");
    }

    public static void Z0(boolean z, String str) {
        String str2 = "insight_config_notifySleepTrend";
        if (str != null) {
            str2 = "insight_config_notifySleepTrend_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z));
    }

    public static long a() {
        return b(-1L);
    }

    public static String a0(String str) {
        return b0(null, str);
    }

    public static void a1(boolean z) {
        b1(z, null);
    }

    public static long b(long j2) {
        return c(null, j2);
    }

    public static String b0(String str, String str2) {
        String str3 = "insight_config_signsFeverUnBase";
        if (str != null) {
            str3 = "insight_config_signsFeverUnBase_" + str;
        }
        return (String) x0h.b("heytap_health_healthImpl.xml", str3, str2);
    }

    public static void b1(boolean z, String str) {
        String str2 = "insight_config_notifySleepVitalSigns";
        if (str != null) {
            str2 = "insight_config_notifySleepVitalSigns_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z));
    }

    public static long c(String str, long j2) {
        String str2 = "insight_config_bedTime";
        if (str != null) {
            str2 = "insight_config_bedTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static long c0(String str, long j2) {
        String str2 = "insight_config_signsLastModifiedTime";
        if (str != null) {
            str2 = "insight_config_signsLastModifiedTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static void c1(boolean z) {
        d1(z, null);
    }

    public static int d() {
        return e(-1);
    }

    public static String d0() {
        return e0("");
    }

    public static void d1(boolean z, String str) {
        String str2 = "insight_config_notifyStepTrend";
        if (str != null) {
            str2 = "insight_config_notifyStepTrend_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z));
    }

    public static int e(int i) {
        return f(null, i);
    }

    public static String e0(String str) {
        return f0(null, str);
    }

    public static void e1(boolean z) {
        f1(z, null);
    }

    public static int f(String str, int i) {
        String str2 = "insight_config_calorieLastShow";
        if (str != null) {
            str2 = "insight_config_calorieLastShow_" + str;
        }
        return ((Integer) x0h.b("heytap_health_healthImpl.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static String f0(String str, String str2) {
        String str3 = "insight_config_singleDimenNotifyFreq";
        if (str != null) {
            str3 = "insight_config_singleDimenNotifyFreq_" + str;
        }
        return (String) x0h.b("heytap_health_healthImpl.xml", str3, str2);
    }

    public static void f1(boolean z, String str) {
        String str2 = "insight_config_notifyWristTemperature";
        if (str != null) {
            str2 = "insight_config_notifyWristTemperature_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Boolean.valueOf(z));
    }

    public static long g() {
        return h(-1L);
    }

    public static int g0() {
        return h0(-1);
    }

    public static void g1(String str) {
        h1(str, null);
    }

    public static long h(long j2) {
        return i(null, j2);
    }

    public static int h0(int i) {
        return i0(null, i);
    }

    public static void h1(String str, String str2) {
        String str3 = "insight_config_signsFeverUnBase";
        if (str2 != null) {
            str3 = "insight_config_signsFeverUnBase_" + str2;
        }
        x0h.d("heytap_health_healthImpl.xml", str3, str);
    }

    public static long i(String str, long j2) {
        String str2 = "insight_config_calorieLastShowTime";
        if (str != null) {
            str2 = "insight_config_calorieLastShowTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static int i0(String str, int i) {
        String str2 = "insight_config_sleepLastShow";
        if (str != null) {
            str2 = "insight_config_sleepLastShow_" + str;
        }
        return ((Integer) x0h.b("heytap_health_healthImpl.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void i1(long j2, String str) {
        String str2 = "insight_config_signsLastModifiedTime";
        if (str != null) {
            str2 = "insight_config_signsLastModifiedTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }

    public static long j() {
        return k(0L);
    }

    public static long j0() {
        return k0(-1L);
    }

    public static void j1(String str) {
        k1(str, null);
    }

    public static long k(long j2) {
        return l(null, j2);
    }

    public static long k0(long j2) {
        return l0(null, j2);
    }

    public static void k1(String str, String str2) {
        String str3 = "insight_config_singleDimenNotifyFreq";
        if (str2 != null) {
            str3 = "insight_config_singleDimenNotifyFreq_" + str2;
        }
        x0h.d("heytap_health_healthImpl.xml", str3, str);
    }

    public static long l(String str, long j2) {
        String str2 = "insight_config_crossAnaLastModifiedTime";
        if (str != null) {
            str2 = "insight_config_crossAnaLastModifiedTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static long l0(String str, long j2) {
        String str2 = "insight_config_sleepLastShowTime";
        if (str != null) {
            str2 = "insight_config_sleepLastShowTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static void l1(int i) {
        m1(i, null);
    }

    public static String m() {
        return n("");
    }

    public static int m0() {
        return n0(-1);
    }

    public static void m1(int i, String str) {
        String str2 = "insight_config_sleepLastShow";
        if (str != null) {
            str2 = "insight_config_sleepLastShow_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Integer.valueOf(i));
    }

    public static String n(String str) {
        return o(null, str);
    }

    public static int n0(int i) {
        return o0(null, i);
    }

    public static void n1(long j2) {
        o1(j2, null);
    }

    public static String o(String str, String str2) {
        String str3 = "insight_config_crossAnaNotifyFreq";
        if (str != null) {
            str3 = "insight_config_crossAnaNotifyFreq_" + str;
        }
        return (String) x0h.b("heytap_health_healthImpl.xml", str3, str2);
    }

    public static int o0(String str, int i) {
        String str2 = "insight_config_snoreLastShow";
        if (str != null) {
            str2 = "insight_config_snoreLastShow_" + str;
        }
        return ((Integer) x0h.b("heytap_health_healthImpl.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void o1(long j2, String str) {
        String str2 = "insight_config_sleepLastShowTime";
        if (str != null) {
            str2 = "insight_config_sleepLastShowTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }

    public static int p() {
        return q(-1);
    }

    public static long p0() {
        return q0(-1L);
    }

    public static void p1(int i) {
        q1(i, null);
    }

    public static int q(int i) {
        return r(null, i);
    }

    public static long q0(long j2) {
        return r0(null, j2);
    }

    public static void q1(int i, String str) {
        String str2 = "insight_config_snoreLastShow";
        if (str != null) {
            str2 = "insight_config_snoreLastShow_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Integer.valueOf(i));
    }

    public static int r(String str, int i) {
        String str2 = "insight_config_hrLastShow";
        if (str != null) {
            str2 = "insight_config_hrLastShow_" + str;
        }
        return ((Integer) x0h.b("heytap_health_healthImpl.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static long r0(String str, long j2) {
        String str2 = "insight_config_snoreLastShowTime";
        if (str != null) {
            str2 = "insight_config_snoreLastShowTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static void r1(long j2) {
        s1(j2, null);
    }

    public static long s() {
        return t(-1L);
    }

    public static int s0() {
        return t0(-1);
    }

    public static void s1(long j2, String str) {
        String str2 = "insight_config_snoreLastShowTime";
        if (str != null) {
            str2 = "insight_config_snoreLastShowTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }

    public static long t(long j2) {
        return u(null, j2);
    }

    public static int t0(int i) {
        return u0(null, i);
    }

    public static void t1(int i) {
        u1(i, null);
    }

    public static long u(String str, long j2) {
        String str2 = "insight_config_hrLastShowTime";
        if (str != null) {
            str2 = "insight_config_hrLastShowTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static int u0(String str, int i) {
        String str2 = "insight_config_stepLastShow";
        if (str != null) {
            str2 = "insight_config_stepLastShow_" + str;
        }
        return ((Integer) x0h.b("heytap_health_healthImpl.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void u1(int i, String str) {
        String str2 = "insight_config_stepLastShow";
        if (str != null) {
            str2 = "insight_config_stepLastShow_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Integer.valueOf(i));
    }

    public static int v() {
        return w(-1);
    }

    public static long v0() {
        return w0(-1L);
    }

    public static void v1(long j2) {
        w1(j2, null);
    }

    public static int w(int i) {
        return x(null, i);
    }

    public static long w0(long j2) {
        return x0(null, j2);
    }

    public static void w1(long j2, String str) {
        String str2 = "insight_config_stepLastShowTime";
        if (str != null) {
            str2 = "insight_config_stepLastShowTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }

    public static int x(String str, int i) {
        String str2 = "insight_config_hrvLastShow";
        if (str != null) {
            str2 = "insight_config_hrvLastShow_" + str;
        }
        return ((Integer) x0h.b("heytap_health_healthImpl.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static long x0(String str, long j2) {
        String str2 = "insight_config_stepLastShowTime";
        if (str != null) {
            str2 = "insight_config_stepLastShowTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_healthImpl.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static long y() {
        return z(-1L);
    }

    public static void y0(long j2) {
        z0(j2, null);
    }

    public static long z(long j2) {
        return A(null, j2);
    }

    public static void z0(long j2, String str) {
        String str2 = "insight_config_bedTime";
        if (str != null) {
            str2 = "insight_config_bedTime_" + str;
        }
        x0h.d("heytap_health_healthImpl.xml", str2, Long.valueOf(j2));
    }
}
