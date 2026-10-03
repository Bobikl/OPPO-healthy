package com.oplus.aiunit.vision;

import com.heytap.health.core.provider.auth.struct.AuthCallerBody;
import com.heytap.health.core.provider.auth.struct.PackageInfoBody;
import com.heytap.health.core.provider.auth.struct.WhiteCallerBody;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes16.dex */
public class tuj {
    public static void A(String str, List<AuthCallerBody.ScopeBean> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("saveCallerGrantScope: ");
        sb.append(str);
        AuthCallerBody authCallerBody = y().get(str);
        if (authCallerBody == null || authCallerBody.getClientId() == null) {
            a7b.b("ThirdAuthScopeList", "authCallerBody or clientId is null");
            return;
        }
        authCallerBody.setScope(new ArrayList(list));
        authCallerBody.setUpdateTimestamp(System.currentTimeMillis());
        new y2e().l(Collections.singletonList(authCallerBody), true);
    }

    public static Map<String, AuthCallerBody> i() {
        return y();
    }

    public static List<AuthCallerBody.ScopeBean> j(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("getCallerGrantScope: ");
        sb.append(str);
        AuthCallerBody authCallerBody = y().get(str);
        if (authCallerBody == null) {
            return new ArrayList();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("scopes:");
        sb2.append(authCallerBody.getScope());
        return authCallerBody.getScope();
    }

    public static long k(long j2) {
        v9g v9gVarX = v9g.x("health_share_preference_scope");
        if (v9gVarX.B("SYNC_OFFSET_DAY_EVENING", 0L) == j2) {
            return v9gVarX.B("SYNC_OFFSET_MS_EVENING", 0L);
        }
        long jNextInt = new Random().nextInt(7200000);
        v9gVarX.T("SYNC_OFFSET_DAY_EVENING", j2);
        v9gVarX.T("SYNC_OFFSET_MS_EVENING", jNextInt);
        return jNextInt;
    }

    public static long l(long j2) {
        v9g v9gVarX = v9g.x("health_share_preference_scope");
        if (v9gVarX.B("SYNC_OFFSET_DAY", 0L) == j2) {
            return v9gVarX.B("SYNC_OFFSET_MS", 0L);
        }
        long jNextInt = new Random().nextInt(7200000);
        v9gVarX.T("SYNC_OFFSET_DAY", j2);
        v9gVarX.T("SYNC_OFFSET_MS", jNextInt);
        return jNextInt;
    }

    public static long m() {
        return LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static Map<String, WhiteCallerBody.ConfigBean> n() {
        return new rvl().d();
    }

    public static void o() {
        p(false).j();
    }

    public static xnb<Boolean> p(boolean z) {
        final String ssoid = um.c().getSsoid();
        final v9g v9gVarX = v9g.x("health_share_preference_scope");
        long jM = m();
        long jL = l(jM);
        long jK = k(jM);
        StringBuilder sb = new StringBuilder();
        sb.append("SYNC_TIME");
        sb.append(ssoid);
        xnb<Boolean> xnbVarI = z(v9gVarX.B(sb.toString(), 0L), jM, jL, jK, z) ? new rvl().e().b(new o14() { // from class: com.oplus.aiunit.vision.luj
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                tuj.q(v9gVarX, ssoid, (Boolean) obj);
            }
        }).i(new d08() { // from class: com.oplus.aiunit.vision.muj
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return tuj.r((Throwable) obj);
            }
        }) : null;
        long jB = v9gVarX.B("SYNC_TIME_AUTH" + ssoid, 0L);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ssoid: ");
        sb2.append(ssoid);
        sb2.append(" time2: ");
        sb2.append(jB);
        sb2.append(" todayStart: ");
        sb2.append(jM);
        sb2.append(" morningOffsetMs: ");
        sb2.append(jL);
        sb2.append(" eveningOffsetMs: ");
        sb2.append(jK);
        xnb<Boolean> xnbVar = xnbVarI;
        xnb xnbVarI2 = z(jB, jM, jL, jK, z) ? new o2e().d().d(new mpe() { // from class: com.oplus.aiunit.vision.nuj
            @Override // com.oplus.aiunit.vision.mpe
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        }).e(new d08() { // from class: com.oplus.aiunit.vision.ouj
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return tuj.t((Boolean) obj);
            }
        }).d(new mpe() { // from class: com.oplus.aiunit.vision.puj
            @Override // com.oplus.aiunit.vision.mpe
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        }).b(new o14() { // from class: com.oplus.aiunit.vision.quj
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                tuj.v(v9gVarX, ssoid, (Boolean) obj);
            }
        }).i(new d08() { // from class: com.oplus.aiunit.vision.ruj
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return tuj.w((Throwable) obj);
            }
        }) : null;
        return (xnbVar == null || xnbVarI2 == null) ? xnb.g(Boolean.FALSE) : xnb.n(xnbVar, xnbVarI2, new md1() { // from class: com.oplus.aiunit.vision.suj
            @Override // com.oplus.aiunit.vision.md1
            public final Object apply(Object obj, Object obj2) {
                return tuj.x(v9gVarX, ssoid, (Boolean) obj, (Boolean) obj2);
            }
        });
    }

    public static /* synthetic */ void q(v9g v9gVar, String str, Boolean bool) throws Throwable {
        v9gVar.T("SYNC_TIME" + str, System.currentTimeMillis());
    }

    public static /* synthetic */ Boolean r(Throwable th) throws Throwable {
        a7b.b("ThirdAuthScopeList", "WhitePackageStore initWhitePackageInfo error: " + th.getMessage());
        return Boolean.FALSE;
    }

    public static /* synthetic */ pob t(Boolean bool) throws Throwable {
        return new y2e().e();
    }

    public static /* synthetic */ void v(v9g v9gVar, String str, Boolean bool) throws Throwable {
        v9gVar.T("SYNC_TIME_AUTH" + str, System.currentTimeMillis());
    }

    public static /* synthetic */ Boolean w(Throwable th) throws Throwable {
        a7b.b("ThirdAuthScopeList", "Third auth init error: " + th.getMessage());
        return Boolean.FALSE;
    }

    public static /* synthetic */ Boolean x(v9g v9gVar, String str, Boolean bool, Boolean bool2) throws Throwable {
        if (!bool.booleanValue() || !bool2.booleanValue()) {
            a7b.f("ThirdAuthScopeList", "update info fail");
            return Boolean.FALSE;
        }
        a7b.f("ThirdAuthScopeList", "update info success");
        long jCurrentTimeMillis = System.currentTimeMillis();
        v9gVar.T("SYNC_TIME" + str, jCurrentTimeMillis);
        v9gVar.T("SYNC_TIME_AUTH" + str, jCurrentTimeMillis);
        return Boolean.TRUE;
    }

    public static Map<String, AuthCallerBody> y() {
        PackageInfoBody packageInfoBody;
        HashMap map = new HashMap();
        String ssoid = um.c().getSsoid();
        a7b.f("ThirdAuthScopeList", "load auth list start.");
        String[] strArrP = v9g.x("health_scopes_completed_list" + ssoid).p();
        StringBuilder sb = new StringBuilder();
        sb.append("keySets: ");
        sb.append(Arrays.toString(strArrP));
        sb.append("ssoid: ");
        sb.append(ssoid);
        for (String str : strArrP) {
            if (!str.equals(v9g.w().C()) && (packageInfoBody = (PackageInfoBody) sc8.a(v9g.x("sdkCallerClientIdList").D(str), PackageInfoBody.class)) != null) {
                AuthCallerBody authCallerBody = (AuthCallerBody) sc8.a(v9g.x("health_scopes_completed_list" + ssoid).D(str), AuthCallerBody.class);
                if (authCallerBody != null) {
                    authCallerBody.setClientUrl(packageInfoBody.getClientUrl());
                    authCallerBody.setClientOrder(packageInfoBody.getClientOrder());
                    map.put(packageInfoBody.getAppPackage(), authCallerBody);
                }
            }
        }
        return map;
    }

    public static boolean z(long j2, long j3, long j4, long j5, boolean z) {
        if (z) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = j4 + j3;
        long j7 = j3 + 68400000 + j5;
        if (jCurrentTimeMillis >= j7) {
            return j2 < j7;
        }
        return jCurrentTimeMillis >= j6 && j2 < j6;
    }
}
