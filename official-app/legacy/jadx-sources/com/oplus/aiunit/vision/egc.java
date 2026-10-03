package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import com.heytap.nearx.uikit.utils.NearDeviceUtil;

/* JADX INFO: loaded from: classes18.dex */
public class egc implements fgc {
    public fgc a;

    public egc(Context context, com.heytap.nearx.uikit.internal.utils.blur.a aVar) {
        if (NearDeviceUtil.b() < 11 || vhc.a(context)) {
            return;
        }
        this.a = new ikc(context, aVar);
    }

    @Override // com.oplus.aiunit.vision.fgc
    public Bitmap a(Bitmap bitmap, boolean z, int i) {
        fgc fgcVar = this.a;
        if (fgcVar != null) {
            return fgcVar.a(bitmap, z, i);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.fgc
    public void destroy() {
        fgc fgcVar = this.a;
        if (fgcVar != null) {
            fgcVar.destroy();
        }
    }
}
