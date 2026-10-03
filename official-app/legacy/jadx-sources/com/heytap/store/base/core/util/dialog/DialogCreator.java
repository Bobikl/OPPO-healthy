package com.heytap.store.base.core.util.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.heytap.nearx.uikit.widget.dialog.AlertDialog;

/* JADX INFO: loaded from: classes3.dex */
public class DialogCreator {
    public static AlertDialog createSupportMessageDialog(Context context, boolean z, boolean z2, View view, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
        if (context == null) {
            return null;
        }
        CustomAlertDialog.CustomBuilder customBuilder = new CustomAlertDialog.CustomBuilder(context);
        customBuilder.setCancelable(z);
        customBuilder.setIsShowSoftInput(z2);
        if (z && onCancelListener != null) {
            customBuilder.setOnCancelListener(onCancelListener);
        }
        if (!TextUtils.isEmpty(str)) {
            customBuilder.setIsHasTitle(true);
            customBuilder.setTitle(str);
        }
        if (view != null) {
            customBuilder.setView(view);
        } else if (!TextUtils.isEmpty(str2)) {
            customBuilder.setMessage(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            customBuilder.setPositiveButton(str3, onClickListener);
        }
        if (!TextUtils.isEmpty(str4)) {
            customBuilder.setNegativeButton(str4, onClickListener2);
        }
        return customBuilder.create();
    }
}
