package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.webpro.common.exception.ParamException;

/* JADX INFO: loaded from: classes3.dex */
public class h6b extends q51 {
    public h6b() {
        super("vip", "printLog");
    }

    @Override // com.oplus.aiunit.vision.rr9
    public boolean intercept(@NonNull pr9 pr9Var, @NonNull jja jjaVar, @NonNull kr9 kr9Var) throws Throwable {
        String strE = jjaVar.e("log", "");
        if (TextUtils.isEmpty(strE)) {
            throw new ParamException("param log is empty");
        }
        printLog(strE);
        onSuccess(kr9Var);
        return true;
    }

    public void printLog(String str) {
        q7b.i(h6b.class.getSimpleName(), str);
    }
}
