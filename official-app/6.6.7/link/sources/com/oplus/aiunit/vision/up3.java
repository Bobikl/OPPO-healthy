package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "system_setting")
public class up3 implements ss9 {
    public final boolean a(String str) {
        return "android.settings.APPLICATION_DETAILS_SETTINGS".equals(str);
    }

    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        String strC = skaVar.c(ParserTag.TAG_ACTION);
        if (TextUtils.isEmpty(strC)) {
            JsApiResponse.invokeIllegal(rs9Var);
            return;
        }
        String str = "android.settings." + strC;
        Intent intent = !a(str) ? new Intent(str) : new Intent(str, Uri.fromParts("package", skaVar.d("package_name", us9Var.getActivity().getPackageName()), null));
        if (us9Var.getActivity().getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            JsApiResponse.invokeUnsupported(rs9Var);
        } else {
            us9Var.getActivity().startActivity(intent);
            rs9Var.success();
        }
    }
}
