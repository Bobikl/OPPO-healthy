package com.heytap.store.business.rn.service;

import android.content.Context;
import android.os.Bundle;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/business/rn/service/FragmentLifecycleListener;", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onDetach", "onHiddenChanged", Action.EXPOSED_STATE_VALUE_HIDDEN, "", "onPause", "onResume", "onStart", "onStop", "rn-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface FragmentLifecycleListener {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAttach(@NotNull FragmentLifecycleListener fragmentLifecycleListener, @Nullable Context context) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onCreate(@NotNull FragmentLifecycleListener fragmentLifecycleListener, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onDestroy(@NotNull FragmentLifecycleListener fragmentLifecycleListener) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onDestroyView(@NotNull FragmentLifecycleListener fragmentLifecycleListener) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onDetach(@NotNull FragmentLifecycleListener fragmentLifecycleListener) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onHiddenChanged(@NotNull FragmentLifecycleListener fragmentLifecycleListener, boolean z) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onPause(@NotNull FragmentLifecycleListener fragmentLifecycleListener) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onResume(@NotNull FragmentLifecycleListener fragmentLifecycleListener) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onStart(@NotNull FragmentLifecycleListener fragmentLifecycleListener) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }

        public static void onStop(@NotNull FragmentLifecycleListener fragmentLifecycleListener) {
            Intrinsics.checkNotNullParameter(fragmentLifecycleListener, "this");
        }
    }

    void onAttach(@Nullable Context context);

    void onCreate(@Nullable Bundle savedInstanceState);

    void onDestroy();

    void onDestroyView();

    void onDetach();

    void onHiddenChanged(boolean hidden);

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
