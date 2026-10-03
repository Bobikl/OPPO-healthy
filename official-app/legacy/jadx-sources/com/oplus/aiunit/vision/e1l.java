package com.oplus.aiunit.vision;

import android.view.View;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/e1l;", "Lcom/oplus/aiunit/vision/dv5;", "Landroid/view/View;", "a", "Landroid/view/View;", "view", "Lkotlinx/coroutines/Deferred;", "Lcom/oplus/aiunit/vision/m4a;", "b", "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "(Lkotlinx/coroutines/Deferred;)V", "job", "<init>", "(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class e1l implements dv5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile Deferred<? extends m4a> job;

    public e1l(@NotNull View view, @NotNull Deferred<? extends m4a> deferred) {
        this.view = view;
        this.job = deferred;
    }

    public void a(@NotNull Deferred<? extends m4a> deferred) {
        this.job = deferred;
    }
}
