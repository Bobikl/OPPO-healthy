package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class k91<Z> implements boj<Z> {
    private dqf request;

    @Override // com.oplus.aiunit.vision.boj
    @Nullable
    public dqf getRequest() {
        return this.request;
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onDestroy() {
    }

    @Override // com.oplus.aiunit.vision.boj
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.oplus.aiunit.vision.boj
    public void onLoadFailed(@Nullable Drawable drawable) {
    }

    @Override // com.oplus.aiunit.vision.boj
    public void onLoadStarted(@Nullable Drawable drawable) {
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStart() {
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStop() {
    }

    @Override // com.oplus.aiunit.vision.boj
    public void setRequest(@Nullable dqf dqfVar) {
        this.request = dqfVar;
    }
}
