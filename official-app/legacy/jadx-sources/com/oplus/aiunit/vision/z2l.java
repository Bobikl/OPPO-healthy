package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class z2l implements cm9<IInterface> {
    public y2l i;

    public static class a implements uo5 {
        @Override // com.oplus.aiunit.vision.c01
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(com.heytap.health.device_manager_base.b bVar) {
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NonNull Context context) {
        y2l y2lVar = this.i;
        if (y2lVar != null) {
            y2lVar.j();
            this.i = null;
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NonNull Context context) {
        if (v3d.j() || v3d.i()) {
            y2l y2lVar = new y2l();
            this.i = y2lVar;
            y2lVar.d();
            gl4.deviceMultiple.nodeApi.e(this.i);
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NonNull
    public IInterface d() {
        return null;
    }
}
