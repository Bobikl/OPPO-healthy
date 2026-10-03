package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import com.heytap.health.wallet.model.response.PayCardInfo;
import com.heytap.wallet.business.bus.router.BusOperaterService;
import com.oppo.lib.common.R$string;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class t8k implements sz2 {
    public WeakReference<Context> a;
    public List<PayCardInfo> b;

    public t8k(WeakReference<Context> weakReference, List<PayCardInfo> list) {
        this.a = weakReference;
        this.b = list;
    }

    @Override // com.oplus.aiunit.vision.sz2
    public void a() {
        WeakReference<Context> weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        vik.b(2, 1);
        ((BusOperaterService) x0.d().a(Uri.parse("heytaphealth://com.heytap.health/bus/traffic/operateService")).navigation()).v6(this.a.get());
    }

    @Override // com.oplus.aiunit.vision.sz2
    public int b() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.sz2
    public String getTitle() {
        return qz0.mContext.getString(R$string.traffic_card);
    }
}
