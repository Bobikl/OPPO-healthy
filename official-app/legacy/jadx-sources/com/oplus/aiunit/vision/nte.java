package com.oplus.aiunit.vision;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import com.heytap.store.platform.barcode.util.LogUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class nte implements Camera.PreviewCallback {
    public final tv2 a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14634c;

    public nte(tv2 tv2Var) {
        this.a = tv2Var;
    }

    public void a(Handler handler, int i) {
        this.b = handler;
        this.f14634c = i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point pointB = this.a.b();
        Handler handler = this.b;
        if (pointB == null || handler == null) {
            LogUtils.d("Got preview callback, but no handler or resolution available");
        } else {
            handler.obtainMessage(this.f14634c, pointB.x, pointB.y, bArr).sendToTarget();
            this.b = null;
        }
    }
}
