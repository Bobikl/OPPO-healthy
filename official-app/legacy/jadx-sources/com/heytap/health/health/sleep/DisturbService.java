package com.heytap.health.health.sleep;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.DisturbSleep;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface DisturbService extends IProvider {
    List<DisturbSleep> h2(long j2, long j3);

    void l4(Context context);
}
