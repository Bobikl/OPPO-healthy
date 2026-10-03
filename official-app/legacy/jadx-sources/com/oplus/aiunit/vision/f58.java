package com.oplus.aiunit.vision;

import android.content.Context;
import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes12.dex */
public final class f58 {
    public static final String AMAP = "autonavi";
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";
    public static final String GPS = "gps";
    public kq9 a;

    public interface a {
        void a(e58 e58Var, int i);

        void b(vkf vkfVar, int i);
    }

    public f58(Context context) throws AMapException {
        if (this.a == null) {
            try {
                this.a = new com.amap.api.col.p0003sl.b0(context);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (e2 instanceof AMapException) {
                    throw ((AMapException) e2);
                }
            }
        }
    }

    public final void a(ukf ukfVar) {
        kq9 kq9Var = this.a;
        if (kq9Var != null) {
            kq9Var.a(ukfVar);
        }
    }

    public final void setOnGeocodeSearchListener(a aVar) {
        kq9 kq9Var = this.a;
        if (kq9Var != null) {
            kq9Var.setOnGeocodeSearchListener(aVar);
        }
    }
}
