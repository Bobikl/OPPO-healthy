package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "network_state")
public class jo3 implements ss9 {
    public final String a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NO";
        }
        String upperCase = activeNetworkInfo.getTypeName().toUpperCase();
        if (!"MOBILE".equalsIgnoreCase(upperCase)) {
            return upperCase;
        }
        String extraInfo = activeNetworkInfo.getExtraInfo();
        return !TextUtils.isEmpty(extraInfo) ? extraInfo.toUpperCase() : upperCase;
    }

    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        try {
            rs9Var.success(new JSONObject().put("network_state", a(us9Var.getActivity().getApplicationContext())));
        } catch (JSONException e) {
            y8b.g(e.getMessage(), new Throwable[0]);
        }
    }
}
