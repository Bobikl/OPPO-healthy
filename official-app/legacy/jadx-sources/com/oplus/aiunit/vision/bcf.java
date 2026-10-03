package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import com.heytap.health.watchface.business.legacy.creation.outfits.transfor.algorithm.StripeSVMClassifier;

/* JADX INFO: loaded from: classes19.dex */
public class bcf extends p81 {
    public StripeSVMClassifier a;

    @Override // com.oplus.aiunit.vision.p81
    public int a(Context context) {
        StripeSVMClassifier stripeSVMClassifierB = StripeSVMClassifier.b();
        this.a = stripeSVMClassifierB;
        return stripeSVMClassifierB.d(context, kvi.WATCH_FACE_MANAGER_STRIPE_MODEL_DIR);
    }

    @Override // com.oplus.aiunit.vision.p81
    public int b(Bitmap bitmap) {
        return this.a.e(bitmap);
    }
}
