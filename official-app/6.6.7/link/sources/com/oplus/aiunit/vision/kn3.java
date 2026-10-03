package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import com.oplusos.sau.common.utils.SauAarConstants;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "call")
public class kn3 implements ss9 {
    public final void a(us9 us9Var, String str) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
        intent.setFlags(SauAarConstants.L);
        us9Var.getActivity().startActivity(intent);
    }

    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        String strC = skaVar.c(ParserTag.TAG_NUMBER);
        if (TextUtils.isEmpty(strC)) {
            JsApiResponse.invokeIllegal(rs9Var);
        } else {
            a(us9Var, strC);
            rs9Var.success();
        }
    }
}
