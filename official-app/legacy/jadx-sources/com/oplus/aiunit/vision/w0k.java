package com.oplus.aiunit.vision;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.platform.account.webview.constant.Constants;

/* JADX INFO: loaded from: classes3.dex */
public class w0k extends q51 {
    public w0k() {
        super("vip", Constants.JsbConstants.METHOD_MAKE_TOAST);
    }

    @Override // com.oplus.aiunit.vision.rr9
    public boolean intercept(@NonNull pr9 pr9Var, @NonNull jja jjaVar, @NonNull kr9 kr9Var) throws Throwable {
        makeToast(pr9Var.getActivity().getApplicationContext(), jjaVar.d("content"));
        onSuccess(kr9Var);
        return true;
    }

    public void makeToast(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }
}
