package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.webview.extension.jsapi.common.CommonApiMethod;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = CommonApiMethod.SYSTEM_SETTING)
public class gp3 implements mr9 {
    public final boolean a(String str) {
        return "android.settings.APPLICATION_DETAILS_SETTINGS".equals(str);
    }

    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        String strC = kjaVar.c("action");
        if (TextUtils.isEmpty(strC)) {
            JsApiResponse.invokeIllegal(lr9Var);
            return;
        }
        String str = Const.Arguments.Setting.Prefix.SETTING_PREFIX + strC;
        Intent intent = !a(str) ? new Intent(str) : new Intent(str, Uri.fromParts("package", kjaVar.d("package_name", or9Var.getActivity().getPackageName()), null));
        if (or9Var.getActivity().getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            JsApiResponse.invokeUnsupported(lr9Var);
        } else {
            or9Var.getActivity().startActivity(intent);
            lr9Var.success();
        }
    }
}
