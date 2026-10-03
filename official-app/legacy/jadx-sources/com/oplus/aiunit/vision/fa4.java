package com.oplus.aiunit.vision;

import com.oppo.obus.common.configmetadata.core.entity.event.EventInfo;
import com.oppo.obus.common.configmetadata.core.entity.event.MinAppEventConfig;
import com.oppo.obus.common.configmetadata.core.entity.host.AppHost;
import com.oppo.obus.common.configmetadata.core.entity.host.MinHostConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class fa4 {
    public static List<cf9> a(MinHostConfig minHostConfig, String str) {
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cf9 cf9Var = new cf9();
        cf9Var.a = "GLOBAL";
        cf9Var.b = null;
        cf9Var.f10059c = minHostConfig.getBizHost();
        cf9Var.d = minHostConfig.getTechHost();
        cf9Var.f10060e = minHostConfig.getV().intValue();
        cf9Var.f = 0;
        cf9Var.g = jCurrentTimeMillis;
        cf9Var.h = str;
        arrayList.add(cf9Var);
        if (minHostConfig.getApp() != null && !minHostConfig.getApp().isEmpty()) {
            for (AppHost appHost : minHostConfig.getApp()) {
                cf9 cf9Var2 = new cf9();
                cf9Var2.a = "APP";
                cf9Var2.b = String.valueOf(appHost.getAppId());
                cf9Var2.f10059c = appHost.getBizHost();
                cf9Var2.d = appHost.getTechHost();
                cf9Var2.f10060e = minHostConfig.getV().intValue();
                cf9Var2.f = 0;
                cf9Var2.g = jCurrentTimeMillis;
                cf9Var2.h = str;
                arrayList.add(cf9Var2);
            }
        }
        return arrayList;
    }

    public static List<zs6> b(MinAppEventConfig minAppEventConfig) {
        if (minAppEventConfig == null || minAppEventConfig.getEvents() == null || minAppEventConfig.getEvents().isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(minAppEventConfig.getEvents().size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf = String.valueOf(minAppEventConfig.getAppId());
        for (EventInfo eventInfo : minAppEventConfig.getEvents()) {
            String group = eventInfo.getGroup();
            String name = eventInfo.getName();
            long jIntValue = eventInfo.getCode().intValue();
            if (group != null && name != null && jIntValue != 0) {
                zs6 zs6VarA = zs6.a(strValueOf, group, name, jIntValue);
                zs6VarA.f19536e = eventInfo.getNetworkType().intValue();
                zs6VarA.g = eventInfo.getGrade().intValue();
                zs6VarA.h = eventInfo.getUploadType().intValue();
                zs6VarA.i = eventInfo.getStatus().intValue();
                zs6VarA.k = minAppEventConfig.getV().intValue();
                zs6VarA.f19538l = jCurrentTimeMillis;
                zs6VarA.f19537j = 100000;
                zs6VarA.f = 0;
                arrayList.add(zs6VarA);
            }
        }
        return arrayList;
    }
}
