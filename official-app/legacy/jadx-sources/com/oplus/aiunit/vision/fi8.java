package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fi8 extends q51 {
    public static final String TAG = "HeaderInterceptor";

    public fi8() {
        super("vip", AcCommonApiMethod.GET_HEADER_JSON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$intercept$0(pr9 pr9Var, kr9 kr9Var) {
        try {
            onSuccess(kr9Var, getH5HeaderInfo(pr9Var.getActivity(), pr9Var.getProductId()));
        } catch (Throwable th) {
            q7b.f(TAG, "intercept header info failed!", th);
            onFailed(kr9Var, 5001, "getH5HeaderInfo not impl, return null");
        }
    }

    public abstract JSONObject getH5HeaderInfo(Context context, String str) throws Throwable;

    @Override // com.oplus.aiunit.vision.rr9
    public boolean intercept(@NonNull final pr9 pr9Var, @NonNull jja jjaVar, @NonNull final kr9 kr9Var) throws Throwable {
        lwj.k(new Runnable() { // from class: com.oplus.aiunit.vision.ei8
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$intercept$0(pr9Var, kr9Var);
            }
        });
        return true;
    }
}
