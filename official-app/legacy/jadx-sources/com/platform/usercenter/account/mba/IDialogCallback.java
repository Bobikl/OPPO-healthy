package com.platform.usercenter.account.mba;

/* JADX INFO: loaded from: classes9.dex */
public interface IDialogCallback {
    default void onDialog() {
    }

    default void onDialog(String str, String str2) {
        onDialog();
    }
}
