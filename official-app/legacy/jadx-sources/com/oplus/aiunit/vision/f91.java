package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.health.storemodel.DataModel;

/* JADX INFO: loaded from: classes16.dex */
public abstract class f91 {
    public DataModel a = DataModel.NOW;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11267c;

    public f91() {
        a();
    }

    public void a() {
        boolean zC = msg.a().c();
        this.b = zC;
        if (zC) {
            this.a = DataModel.LAST;
        }
    }

    public abstract void b(@NonNull rvi rviVar);
}
