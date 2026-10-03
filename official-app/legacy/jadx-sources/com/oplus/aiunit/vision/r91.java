package com.oplus.aiunit.vision;

import com.chad.library.adapter.base.BaseQuickAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001c\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/r91;", "Lcom/oplus/aiunit/vision/fjk;", "", "position", "", "a", "(I)V", "Lcom/oplus/aiunit/vision/gjd;", "listener", "setOnUpFetchListener", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "b", "I", "getStartUpFetchPosition", "()I", "setStartUpFetchPosition", "startUpFetchPosition", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public class r91 implements fjk {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BaseQuickAdapter<?, ?> baseQuickAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int startUpFetchPosition;

    public r91(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        this.baseQuickAdapter = baseQuickAdapter;
        this.startUpFetchPosition = 1;
    }

    public final void a(int position) {
    }

    @Override // com.oplus.aiunit.vision.fjk
    public void setOnUpFetchListener(@Nullable gjd listener) {
    }
}
