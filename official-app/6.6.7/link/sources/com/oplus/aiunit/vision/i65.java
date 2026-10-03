package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.pay.opensdk.model.CashierHost;
import com.oplus.pay.opensdk.model.CashierType;
import com.oplus.pay.opensdk.model.response.RouterConfigResponse;
import com.oplus.pay.opensdk.router.RouterHelper;
import com.oplus.pay.opensdk.statistic.helper.BrandHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class i65 {
    public static String a(Context context) {
        RouterConfigResponse routerConfigResponse = new RouterConfigResponse();
        String strN = RouterHelper.n(vde.e(context, CashierHost.MSP.getPkgName(), "PAY_VERSION_NAME"));
        String strN2 = RouterHelper.n(vde.e(context, vde.f(context), "PAY_VERSION_NAME"));
        String strN3 = RouterHelper.n(vde.e(context, context.getPackageName(), "PAY_VERSION_NAME"));
        int i = RouterHelper.i(strN);
        int i2 = RouterHelper.i(strN2);
        if (i <= i2) {
            i = i2;
        }
        int i3 = RouterHelper.i(strN3);
        if (i <= i3) {
            i = i3;
        }
        pce.f("maxKitVersion:" + i);
        routerConfigResponse.generalRules = new ArrayList();
        routerConfigResponse.generalRules.addAll(b(context, i));
        return routerConfigResponse.toJson();
    }

    public static List<RouterConfigResponse.RouterRule> b(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        CashierType cashierType = CashierType.APP;
        RouterConfigResponse.RouterRule routerRuleE = RouterHelper.e(cashierType, CashierHost.MSP, i, 0);
        RouterConfigResponse.RouterRule routerRuleE2 = RouterHelper.e(cashierType, CashierHost.SECURE_APP, i, 1);
        if (BrandHelper.f(context)) {
            arrayList.add(routerRuleE2);
        } else {
            arrayList.add(routerRuleE);
        }
        return arrayList;
    }
}
