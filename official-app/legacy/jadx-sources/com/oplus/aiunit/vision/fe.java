package com.oplus.aiunit.vision;

import androidx.fragment.app.FragmentActivity;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.oplus.accountsdk.open.core.trace.AcOpenCoreSourceInfo;

/* JADX INFO: loaded from: classes6.dex */
public class fe {
    public static AcOpenCoreSourceInfo a(IJsApiFragmentInterface iJsApiFragmentInterface) {
        FragmentActivity activity = iJsApiFragmentInterface.getActivity();
        if (activity == null) {
            bn.c("AcOpenExecutorHelper", "getSourceInfo error: activity is null");
            return new AcOpenCoreSourceInfo("", "", "");
        }
        AcOpenCoreSourceInfo acOpenCoreSourceInfo = (AcOpenCoreSourceInfo) xa.c(activity.getIntent().getStringExtra(gd.EXTRA_KEY_SOURCE_INFO), AcOpenCoreSourceInfo.class);
        if (acOpenCoreSourceInfo != null) {
            return acOpenCoreSourceInfo;
        }
        bn.c("AcOpenExecutorHelper", "getSourceInfo error: sourceInfo parse error");
        return new AcOpenCoreSourceInfo("", "", "");
    }
}
