package com.oplus.aiunit.vision;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import coil.size.Size;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/ih8;", "", "Lcoil/size/e;", "size", "", "a", "b", "Lcom/oplus/aiunit/vision/n5a;", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface ih8 {
    @MainThread
    boolean a(@NotNull Size size);

    @WorkerThread
    boolean b();
}
