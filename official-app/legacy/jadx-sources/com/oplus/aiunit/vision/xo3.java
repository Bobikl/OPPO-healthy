package com.oplus.aiunit.vision;

import com.heytap.webview.extension.jsapi.common.CommonApiMethod;
import com.heytap.webview.extension.protocol.Const;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = CommonApiMethod.STATUS_BAR)
public class xo3 implements mr9 {
    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        aoi.c(or9Var.getActivity(), kjaVar.b(Const.Arguments.StatusBar.Dark_MODEL, false));
        lr9Var.success();
    }
}
