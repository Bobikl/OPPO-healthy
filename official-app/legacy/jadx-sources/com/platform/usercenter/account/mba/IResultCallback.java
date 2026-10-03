package com.platform.usercenter.account.mba;

/* JADX INFO: loaded from: classes9.dex */
public interface IResultCallback {
    @Deprecated
    default void err(int i) {
    }

    default void onFail(int i, String str) {
        err(i, str);
    }

    default void onLoading(int i, String str) {
    }

    @Deprecated
    default void onOpenView() {
    }

    default void onSuccess() {
        onOpenView();
    }

    @Deprecated
    default void err(int i, String str) {
        err(i);
    }
}
