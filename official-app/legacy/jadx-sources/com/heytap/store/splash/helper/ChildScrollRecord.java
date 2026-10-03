package com.heytap.store.splash.helper;

import androidx.fragment.app.Fragment;
import com.oplus.aiunit.vision.a8i;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bJ\"\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/splash/helper/ChildScrollRecord;", "", "()V", "lastScrollY", "", "getLastScrollY", "()I", "setLastScrollY", "(I)V", "scrolledFragment", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/Fragment;", "getScrolledFragment", "()Ljava/lang/ref/WeakReference;", "setScrolledFragment", "(Ljava/lang/ref/WeakReference;)V", "scrolledSubFragment", "getScrolledSubFragment", "setScrolledSubFragment", "isScrollInSameFragments", "", "fragment", "subFragment", a8i.UPDATE, "", "scrollY", "homeCompent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ChildScrollRecord {
    private int lastScrollY;

    @NotNull
    private WeakReference<Fragment> scrolledFragment = new WeakReference<>(null);

    @NotNull
    private WeakReference<Fragment> scrolledSubFragment = new WeakReference<>(null);

    public final int getLastScrollY() {
        return this.lastScrollY;
    }

    @NotNull
    public final WeakReference<Fragment> getScrolledFragment() {
        return this.scrolledFragment;
    }

    @NotNull
    public final WeakReference<Fragment> getScrolledSubFragment() {
        return this.scrolledSubFragment;
    }

    public final boolean isScrollInSameFragments(@Nullable Fragment fragment, @Nullable Fragment subFragment) {
        if (fragment == null || this.scrolledFragment.get() != fragment || subFragment == null || this.scrolledSubFragment.get() != subFragment) {
            return fragment != null && this.scrolledFragment.get() == fragment && subFragment == null && this.scrolledSubFragment.get() == null;
        }
        return true;
    }

    public final void setLastScrollY(int i) {
        this.lastScrollY = i;
    }

    public final void setScrolledFragment(@NotNull WeakReference<Fragment> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.scrolledFragment = weakReference;
    }

    public final void setScrolledSubFragment(@NotNull WeakReference<Fragment> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.scrolledSubFragment = weakReference;
    }

    public final void update(@Nullable Fragment fragment, @Nullable Fragment subFragment, int scrollY) {
        this.lastScrollY = scrollY;
        if (isScrollInSameFragments(fragment, subFragment)) {
            return;
        }
        this.scrolledFragment = new WeakReference<>(fragment);
        this.scrolledSubFragment = new WeakReference<>(subFragment);
    }
}
