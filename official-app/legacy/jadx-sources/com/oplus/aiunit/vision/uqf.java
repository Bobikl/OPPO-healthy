package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;

/* JADX INFO: loaded from: classes13.dex */
public interface uqf<R> {
    boolean onLoadFailed(@Nullable GlideException glideException, @Nullable Object obj, @NonNull boj<R> bojVar, boolean z);

    boolean onResourceReady(@NonNull R r, @NonNull Object obj, boj<R> bojVar, @NonNull DataSource dataSource, boolean z);
}
