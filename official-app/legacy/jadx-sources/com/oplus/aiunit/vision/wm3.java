package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = "call")
public class wm3 implements mr9 {
    public final void a(or9 or9Var, String str) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
        intent.setFlags(268435456);
        or9Var.getActivity().startActivity(intent);
    }

    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        String strC = kjaVar.c("number");
        if (TextUtils.isEmpty(strC)) {
            JsApiResponse.invokeIllegal(lr9Var);
        } else {
            a(or9Var, strC);
            lr9Var.success();
        }
    }
}
