package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class eg4<T> implements boj<T> {
    private final int height;

    @Nullable
    private dqf request;
    private final int width;

    public eg4() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.oplus.aiunit.vision.boj
    @Nullable
    public final dqf getRequest() {
        return this.request;
    }

    @Override // com.oplus.aiunit.vision.boj
    public final void getSize(@NonNull l7h l7hVar) {
        l7hVar.d(this.width, this.height);
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onDestroy() {
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
    public final void removeCallback(@NonNull l7h l7hVar) {
    }

    @Override // com.oplus.aiunit.vision.boj
    public final void setRequest(@Nullable dqf dqfVar) {
        this.request = dqfVar;
    }

    public eg4(int i, int i2) {
        if (uqk.v(i, i2)) {
            this.width = i;
            this.height = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
