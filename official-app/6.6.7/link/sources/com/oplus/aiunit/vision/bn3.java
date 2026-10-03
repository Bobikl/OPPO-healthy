package com.oplus.aiunit.vision;

import android.content.pm.PackageInfo;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "app_info")
public class bn3 implements ss9 {
    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        try {
            String strD = skaVar.d("package_name", us9Var.getActivity().getPackageName());
            PackageInfo packageInfo = us9Var.getActivity().getPackageManager().getPackageInfo(strD, 16384);
            rs9Var.success(new JSONObject().put("version_code", packageInfo.versionCode).put("version_name", packageInfo.versionName).put("package_name", strD));
        } catch (Exception unused) {
            JsApiResponse.invokeIllegal(rs9Var);
        }
    }
}
