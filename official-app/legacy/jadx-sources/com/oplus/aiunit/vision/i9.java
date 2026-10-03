package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import com.oplus.account.netrequest.bean.AcGetInitHostResponse;
import com.oplus.account.netrequest.bean.AcHostUrlConfig;
import com.oplus.account.netrequest.service.AcInnerRequestService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class i9 {
    public ConcurrentHashMap<String, AcHostUrlConfig> a;
    public volatile String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12431c;

    public static class b {
        public static i9 INSTANCE = new i9();
    }

    public static i9 c() {
        return b.INSTANCE;
    }

    public String a() {
        return !this.a.containsKey(this.b) ? "" : this.a.get(this.b).a(this.f12431c);
    }

    public boolean b(Context context, String str, cj cjVar) {
        if (this.a.containsKey(str)) {
            return true;
        }
        long jC = ob.b(context).c();
        long jD = ob.b(context).d();
        long jD2 = ck.d() - jC;
        if (jD2 <= 0 || jD2 > jD) {
            return d(context, str, cjVar);
        }
        this.a.put(str, AcHostUrlConfig.c(ob.b(context).a(str)));
        this.f12431c = ob.b(context).f();
        return true;
    }

    public final boolean d(Context context, String str, cj cjVar) {
        AcGetInitHostResponse acGetInitHostResponse;
        AcGetInitHostResponse acGetInitHostResponse2;
        Map<String, String> map;
        try {
            ztf<h8<AcGetInitHostResponse, Object>> ztfVarExecute = ((AcInnerRequestService) cjVar.c(AcInnerRequestService.class)).requestInitHostConfig().execute();
            if (200 != ztfVarExecute.b() || ztfVarExecute.a() == null) {
                return false;
            }
            h8<AcGetInitHostResponse, Object> h8VarA = ztfVarExecute.a();
            if (200 == h8VarA.b && (acGetInitHostResponse = h8VarA.f12046c) != null && (map = (acGetInitHostResponse2 = acGetInitHostResponse).hostUrlMap) != null && !map.isEmpty()) {
                f(context, str, acGetInitHostResponse2.region, acGetInitHostResponse2.hostUrlMap);
                ob.b(context).i(acGetInitHostResponse2.refreshInterval);
                return true;
            }
            return false;
        } catch (Exception e2) {
            Log.e("AcHostConfigMgr", e2.getMessage());
            return false;
        }
    }

    public void e(String str) {
        this.b = str;
    }

    public void f(Context context, String str, String str2, Map<String, String> map) {
        AcHostUrlConfig acHostUrlConfig = new AcHostUrlConfig();
        acHostUrlConfig.e(map);
        this.a.put(str, acHostUrlConfig);
        this.f12431c = str2;
        ob.b(context).h(ck.d());
        ob.b(context).g(str, AcHostUrlConfig.d(map));
        ob.b(context).k(this.f12431c);
    }

    public i9() {
        this.a = new ConcurrentHashMap<>();
    }
}
