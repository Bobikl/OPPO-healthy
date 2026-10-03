package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface boj<R> extends bwa {
    public static final int SIZE_ORIGINAL = Integer.MIN_VALUE;

    @Nullable
    dqf getRequest();

    void getSize(@NonNull l7h l7hVar);

    void onLoadCleared(@Nullable Drawable drawable);

    void onLoadFailed(@Nullable Drawable drawable);

    void onLoadStarted(@Nullable Drawable drawable);

    void onResourceReady(@NonNull R r, @Nullable oak<? super R> oakVar);

    void removeCallback(@NonNull l7h l7hVar);

    void setRequest(@Nullable dqf dqfVar);
}
