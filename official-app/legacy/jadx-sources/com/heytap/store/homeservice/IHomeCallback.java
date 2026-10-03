package com.heytap.store.homeservice;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/homeservice/IHomeCallback;", "", "onChildViewScrolled", "", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "subFragment", "scrollY", "", "com.heytap.store.business.home-service"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IHomeCallback {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onChildViewScrolled(@NotNull IHomeCallback iHomeCallback, @NotNull Activity activity, @NotNull Fragment fragment, @NotNull Fragment subFragment, int i) {
            Intrinsics.checkNotNullParameter(iHomeCallback, "this");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(subFragment, "subFragment");
        }
    }

    void onChildViewScrolled(@NotNull Activity activity, @NotNull Fragment fragment, @NotNull Fragment subFragment, int scrollY);
}
