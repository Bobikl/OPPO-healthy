package com.heytap.nearx.uikit.widget.snackbar.container;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public interface NearSnackBarInterface {

    public interface OnDismissAnimListener {
        void onAnimEnd(NearSnackBarInterface nearSnackBarInterface, Animator animator);

        void onAnimStart(NearSnackBarInterface nearSnackBarInterface, Animator animator);
    }

    public interface OnDismissListener {
        void onDismiss(NearSnackBarInterface nearSnackBarInterface);
    }

    public interface OnShowAnimListener {
        void onAnimEnd(NearSnackBarInterface nearSnackBarInterface, Animator animator);

        void onAnimStart(NearSnackBarInterface nearSnackBarInterface, Animator animator);
    }

    public interface OnShowListener {
        void onShow(NearSnackBarInterface nearSnackBarInterface);
    }

    void dismiss();

    View getCustomView();

    void show();
}
