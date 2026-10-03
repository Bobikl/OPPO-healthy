package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.widget.Toast;
import com.heytap.webview.extension.jsapi.common.CommonApiMethod;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = CommonApiMethod.TOAST)
public class ip3 implements mr9 {
    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        String strC = kjaVar.c("message");
        if (TextUtils.isEmpty(strC)) {
            JsApiResponse.invokeIllegal(lr9Var, "message is empty!");
            return;
        }
        String strD = kjaVar.d("duration", Const.Arguments.Toast.Duration.SHORT);
        int i = 0;
        if (!Const.Arguments.Toast.Duration.SHORT.equals(strD) && (Const.Arguments.Toast.Duration.LONG.equals(strD) || "1".equals(strD))) {
            i = 1;
        }
        Toast.makeText(or9Var.getActivity().getApplicationContext(), strC, i).show();
        lr9Var.success();
    }
}
