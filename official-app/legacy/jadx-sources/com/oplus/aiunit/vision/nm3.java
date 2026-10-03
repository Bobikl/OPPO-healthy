package com.oplus.aiunit.vision;

import android.content.pm.PackageInfo;
import com.heytap.webview.extension.jsapi.common.CommonApiMethod;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = CommonApiMethod.APP_INFO)
public class nm3 implements mr9 {
    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        try {
            String strD = kjaVar.d("package_name", or9Var.getActivity().getPackageName());
            PackageInfo packageInfo = or9Var.getActivity().getPackageManager().getPackageInfo(strD, 16384);
            lr9Var.success(new JSONObject().put("version_code", packageInfo.versionCode).put(Const.Callback.AppInfo.VERSION_NAME, packageInfo.versionName).put("package_name", strD));
        } catch (Exception unused) {
            JsApiResponse.invokeIllegal(lr9Var);
        }
    }
}
