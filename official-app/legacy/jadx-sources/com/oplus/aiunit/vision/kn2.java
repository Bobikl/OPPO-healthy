package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.oplus.dynamicframerate.DynamicFrameRateManager;

/* JADX INFO: loaded from: classes13.dex */
public class kn2 {
    public static final int ANIMATION_TYPE_LIST_SCROLL = 10102;
    public static final int FRAME_RATE_MIN_SUB_SDK = 10;
    public static final String TAG = "COUlFrameRateHelper";
    public boolean a;
    public boolean b = false;

    public kn2(boolean z) {
        a(z);
    }

    public final void a(boolean z) {
        if (!z || !bn2.b(34, 10)) {
            this.a = false;
            return;
        }
        int dynamicFrameRateType = DynamicFrameRateManager.getDynamicFrameRateType();
        if (dynamicFrameRateType == 1 || dynamicFrameRateType == 2) {
            this.a = true;
        }
    }

    public void b(boolean z) {
        if (!this.a) {
            bj2.a(TAG, "SetFrameRate not success, mSupportRateVSdk is false");
            return;
        }
        if (this.b != z) {
            DynamicFrameRateManager.setFrameRate(this, 10102, z ? -1 : -2, (Bundle) null);
            bj2.a(TAG, "setFrameRate isStart:" + z);
            this.b = z;
        }
    }
}
