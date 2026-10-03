package com.platform.sdk.center.sdk.image;

import android.graphics.Bitmap;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface ImageLoadCallback {
    boolean onLoadFailed();

    boolean onResourceReady(Bitmap bitmap);
}
