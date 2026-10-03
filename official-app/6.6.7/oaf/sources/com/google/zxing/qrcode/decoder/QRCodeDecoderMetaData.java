package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class QRCodeDecoderMetaData {
    private final boolean mirrored;

    public QRCodeDecoderMetaData(boolean z) {
        this.mirrored = z;
    }

    public void applyMirroredCorrection(ResultPoint[] resultPointArr) {
        if (!this.mirrored || resultPointArr == null || resultPointArr.length < 3) {
            return;
        }
        ResultPoint resultPoint = resultPointArr[0];
        resultPointArr[0] = resultPointArr[2];
        resultPointArr[2] = resultPoint;
    }

    public boolean isMirrored() {
        return this.mirrored;
    }
}
