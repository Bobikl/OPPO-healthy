package com.oplus.aiunit.vision;

import android.util.SparseIntArray;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/bj5;", "", "", "c", "", "type", "a", "I", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "Landroid/util/SparseIntArray;", "b", "Landroid/util/SparseIntArray;", "()Landroid/util/SparseIntArray;", "setMSort", "(Landroid/util/SparseIntArray;)V", "mSort", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class bj5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int off;

    @NotNull
    public static final bj5 INSTANCE = new bj5();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static SparseIntArray mSort = new SparseIntArray();
    public static final int $stable = 8;

    public final void a(int type) {
        SparseIntArray sparseIntArray = mSort;
        int i = off;
        off = i + 1;
        sparseIntArray.put(type, i);
    }

    @NotNull
    public final SparseIntArray b() {
        return mSort;
    }

    public final void c() {
        off = 0;
        mSort.clear();
    }
}
