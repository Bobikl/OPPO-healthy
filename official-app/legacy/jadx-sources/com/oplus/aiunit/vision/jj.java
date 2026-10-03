package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import com.oplus.accountsdk.base.common.net.data.AcGetInitHostResponse;
import com.oplus.accountsdk.base.common.net.data.AcHostUrlConfig;
import com.oplus.accountsdk.base.common.net.service.AcInnerRequestService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class jj {
    public ConcurrentHashMap<String, AcHostUrlConfig> a;
    public volatile String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12923c;

    public static class b {
        public static jj INSTANCE = new jj();
    }

    public static jj c() {
        return b.INSTANCE;
    }

    public String a() {
        return !this.a.containsKey(this.b) ? "" : this.a.get(this.b).a(this.f12923c);
    }

    public boolean b(Context context, String str, s7 s7Var) {
        if (this.a.containsKey(str)) {
            return true;
        }
        long jD = qj.c(context).d();
        long jE = qj.c(context).e();
        long jD2 = ck.d() - jD;
        if (jD2 <= 0 || jD2 > jE) {
            return e(context, str, s7Var);
        }
        this.a.put(str, AcHostUrlConfig.c(qj.c(context).b(str)));
        this.f12923c = qj.c(context).g();
        return true;
    }

    public String d() {
        return this.f12923c;
    }

    public final boolean e(Context context, String str, s7 s7Var) {
        AcGetInitHostResponse acGetInitHostResponse;
        AcGetInitHostResponse acGetInitHostResponse2;
        Map<String, String> map;
        try {
            ztf<h8<AcGetInitHostResponse, Object>> ztfVarExecute = ((AcInnerRequestService) s7Var.getAcNetRequestService(AcInnerRequestService.class)).requestInitHostConfig().execute();
            if (200 != ztfVarExecute.b() || ztfVarExecute.a() == null) {
                return false;
            }
            h8<AcGetInitHostResponse, Object> h8VarA = ztfVarExecute.a();
            if (200 == h8VarA.b && (acGetInitHostResponse = h8VarA.f12046c) != null && (map = (acGetInitHostResponse2 = acGetInitHostResponse).hostUrlMap) != null && !map.isEmpty()) {
                h(context, str, acGetInitHostResponse2.region, acGetInitHostResponse2.hostUrlMap);
                qj.c(context).l(acGetInitHostResponse2.refreshInterval);
                return true;
            }
            return false;
        } catch (Exception e2) {
            Log.e("AcSdkHostConfigMgr", e2.getMessage());
            return false;
        }
    }

    public void f(String str) {
        this.b = str;
    }

    public void g(String str) {
        this.f12923c = str;
    }

    public void h(Context context, String str, String str2, Map<String, String> map) {
        AcHostUrlConfig acHostUrlConfig = new AcHostUrlConfig();
        acHostUrlConfig.e(map);
        this.a.put(str, acHostUrlConfig);
        this.f12923c = str2;
        qj.c(context).k(ck.d());
        qj.c(context).j(str, AcHostUrlConfig.d(map));
        qj.c(context).m(this.f12923c);
    }

    public jj() {
        this.a = new ConcurrentHashMap<>();
    }
}
