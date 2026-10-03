package com.heytap.usercenter.accountsdk.imageload;

import android.graphics.Bitmap;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface ImageLoadCallback {
    boolean onLoadFailed();

    boolean onResourceReady(Bitmap bitmap);
}
