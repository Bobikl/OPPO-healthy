package com.oplus.aiunit.vision;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR$\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/ia3;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "scrollY", "", "b", "", "a", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "scrolledFragment", "<set-?>", "I", "getLastScrollY", "()I", "lastScrollY", "<init>", "()V", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0})
public final class ia3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public WeakReference<Fragment> scrolledFragment = new WeakReference<>(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int lastScrollY;

    public final boolean a(@Nullable Fragment fragment) {
        return fragment != null && this.scrolledFragment.get() == fragment;
    }

    public final void b(@NotNull Fragment fragment, int scrollY) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.lastScrollY = scrollY;
        if (a(fragment)) {
            return;
        }
        this.scrolledFragment = new WeakReference<>(fragment);
    }
}
