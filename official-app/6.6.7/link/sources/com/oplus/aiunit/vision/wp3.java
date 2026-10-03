package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.widget.Toast;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "toast")
public class wp3 implements ss9 {
    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        String strC = skaVar.c("message");
        if (TextUtils.isEmpty(strC)) {
            JsApiResponse.invokeIllegal(rs9Var, "message is empty!");
            return;
        }
        String strD = skaVar.d("duration", "SHORT");
        int i = 0;
        if (!"SHORT".equals(strD) && ("LONG".equals(strD) || erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE.equals(strD))) {
            i = 1;
        }
        Toast.makeText(us9Var.getActivity().getApplicationContext(), strC, i).show();
        rs9Var.success();
    }
}
