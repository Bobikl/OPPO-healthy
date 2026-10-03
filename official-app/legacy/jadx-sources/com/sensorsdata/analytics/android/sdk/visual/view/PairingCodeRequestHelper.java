package com.sensorsdata.analytics.android.sdk.visual.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.health.esim.nec.NecBrowserActivity;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class PairingCodeRequestHelper {
    private static final String TAG = "SA.ParingCodeHttpRequest";
    private static final String URL_VERIFY_SUFFIX = "api/sdk/heat_maps/scanning/pairing_code";

    public interface IApiCallback {
        void onFailure(String str);

        void onSuccess();
    }

    public void verifyPairingCodeRequest(final Context context, String str, final IApiCallback iApiCallback) {
        try {
            if (TextUtils.isEmpty(SensorsDataAPI.sharedInstance().getServerUrl())) {
                SALog.i(TAG, "verifyParingCodeRequest | server url is null and return");
                return;
            }
            Uri uri = Uri.parse(SensorsDataAPI.sharedInstance().getServerUrl());
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme()).encodedAuthority(uri.getAuthority());
            HashMap map = new HashMap();
            map.put("pairing_code", str);
            HashMap map2 = new HashMap();
            map2.put("sensorsdata-project", uri.getQueryParameter("project"));
            new RequestHelper.Builder(HttpMethod.GET, builder.appendEncodedPath(URL_VERIFY_SUFFIX).toString()).params(map).header(map2).callback(new HttpCallback.JsonCallback() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeRequestHelper.1
                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback.JsonCallback, com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onAfter() {
                }

                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onFailure(int i, String str2) {
                    IApiCallback iApiCallback2 = iApiCallback;
                    if (iApiCallback2 != null) {
                        iApiCallback2.onFailure(str2);
                    }
                }

                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onResponse(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        return;
                    }
                    SALog.i(PairingCodeRequestHelper.TAG, "verifyParingCodeRequest onResponse | response: " + jSONObject.toString());
                    if (!jSONObject.optBoolean("is_success")) {
                        IApiCallback iApiCallback2 = iApiCallback;
                        if (iApiCallback2 != null) {
                            iApiCallback2.onFailure(jSONObject.optString(NecBrowserActivity.ERROR_MSG));
                            return;
                        }
                        return;
                    }
                    String strOptString = jSONObject.optString("url");
                    SALog.i(PairingCodeRequestHelper.TAG, "verifyParingCodeRequest onResponse | url: " + strOptString);
                    if (!TextUtils.isEmpty(strOptString)) {
                        SensorsDataUtils.handleSchemeUrl((Activity) context, new Intent().setData(Uri.parse(strOptString)));
                    }
                    IApiCallback iApiCallback3 = iApiCallback;
                    if (iApiCallback3 != null) {
                        iApiCallback3.onSuccess();
                    }
                }
            }).execute();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }
}
