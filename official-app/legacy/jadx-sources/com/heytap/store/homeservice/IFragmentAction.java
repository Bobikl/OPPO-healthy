package com.heytap.store.homeservice;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/heytap/store/homeservice/IFragmentAction;", "", "canScrollChangeAppbarAlpha", "", "onFragmentSelected", "", "onFragmentUnSelected", "scrollToTop", "com.heytap.store.business.home-service"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IFragmentAction {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean canScrollChangeAppbarAlpha(@NotNull IFragmentAction iFragmentAction) {
            Intrinsics.checkNotNullParameter(iFragmentAction, "this");
            return false;
        }

        public static void onFragmentSelected(@NotNull IFragmentAction iFragmentAction) {
            Intrinsics.checkNotNullParameter(iFragmentAction, "this");
        }

        public static void onFragmentUnSelected(@NotNull IFragmentAction iFragmentAction) {
            Intrinsics.checkNotNullParameter(iFragmentAction, "this");
        }

        public static void scrollToTop(@NotNull IFragmentAction iFragmentAction) {
            Intrinsics.checkNotNullParameter(iFragmentAction, "this");
        }
    }

    boolean canScrollChangeAppbarAlpha();

    void onFragmentSelected();

    void onFragmentUnSelected();

    void scrollToTop();
}
