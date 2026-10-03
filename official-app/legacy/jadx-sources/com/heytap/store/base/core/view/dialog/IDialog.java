package com.heytap.store.base.core.view.dialog;

import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes3.dex */
public interface IDialog {

    public interface CallBack {
        void onDismiss();
    }

    int getDialogHeight();

    void hideDialog();

    boolean isShowing();

    IDialog setCallBack(CallBack callBack);

    void showDialog(FragmentActivity fragmentActivity);
}
