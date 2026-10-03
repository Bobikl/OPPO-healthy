package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.heytap.webview.extension.protocol.Const;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = "network_state")
public class vn3 implements mr9 {
    public final String a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NO";
        }
        String upperCase = activeNetworkInfo.getTypeName().toUpperCase();
        if (!Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE.equalsIgnoreCase(upperCase)) {
            return upperCase;
        }
        String extraInfo = activeNetworkInfo.getExtraInfo();
        return !TextUtils.isEmpty(extraInfo) ? extraInfo.toUpperCase() : upperCase;
    }

    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        try {
            lr9Var.success(new JSONObject().put("network_state", a(or9Var.getActivity().getApplicationContext())));
        } catch (JSONException e2) {
            m7b.g(e2.getMessage(), new Throwable[0]);
        }
    }
}
