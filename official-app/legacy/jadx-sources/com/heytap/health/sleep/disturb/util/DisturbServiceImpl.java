package com.heytap.health.sleep.disturb.util;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.model.DisturbSleep;
import com.heytap.health.health.sleep.DisturbService;
import com.oplus.aiunit.vision.c3e;
import com.oplus.aiunit.vision.enk;
import com.oplus.aiunit.vision.lw5;
import com.oplus.aiunit.vision.v05;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/sleep/DisturbService")
public class DisturbServiceImpl implements DisturbService {
    @Override // com.heytap.health.health.sleep.DisturbService
    public List<DisturbSleep> h2(long j2, long j3) {
        if (!c3e.j()) {
            lw5.c("DisturbServiceImpl", "no permission to queryDisturbData");
            return Collections.emptyList();
        }
        long jC = c3e.c();
        lw5.c("DisturbServiceImpl", "queryDisturbData startTime = " + j2 + ", endTime = " + j3 + ", authorizeTime = " + jC);
        int hour = LocalDateTime.ofInstant(Instant.ofEpochMilli(jC), ZoneId.systemDefault()).getHour();
        if (v05.q(jC) < v05.q(j2)) {
            return enk.g(j2, j3);
        }
        long epochMilli = hour < 20 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(jC), ZoneId.systemDefault()).withHour(20).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : LocalDateTime.ofInstant(Instant.ofEpochMilli(jC), ZoneId.systemDefault()).plusDays(1L).withHour(20).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        if (j2 < epochMilli) {
            j2 = epochMilli;
        }
        return enk.g(j2, j3);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.health.health.sleep.DisturbService
    public void l4(Context context) {
        c3e.g(context);
    }
}
