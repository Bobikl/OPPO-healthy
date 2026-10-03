package com.unionpay.tsmservice.mini.result.wrapper;

import android.os.Bundle;
import com.unionpay.tsmservice.mini.ITsmCallback;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseResultCallbackWrapper extends ITsmCallback.Stub {
    protected int interfaceId;
    protected ITsmCallback target;

    public BaseResultCallbackWrapper(int i, ITsmCallback iTsmCallback) {
        this.target = iTsmCallback;
        this.interfaceId = i;
    }

    public abstract Bundle convertResult(Bundle bundle);

    @Override // com.unionpay.tsmservice.mini.ITsmCallback
    public void onError(String str, String str2) {
        ITsmCallback iTsmCallback = this.target;
        if (iTsmCallback != null) {
            iTsmCallback.onError(str, str2);
        }
    }

    @Override // com.unionpay.tsmservice.mini.ITsmCallback
    public void onResult(Bundle bundle) {
        try {
            convertResult(bundle);
            bundle.remove("interfaceId");
        } catch (JSONException e2) {
            e2.printStackTrace();
            bundle.putString("errorCode", this.interfaceId + "00001");
        }
        boolean zEqualsIgnoreCase = "10000".equalsIgnoreCase(bundle.getString("errorCode"));
        ITsmCallback iTsmCallback = this.target;
        if (zEqualsIgnoreCase) {
            if (iTsmCallback != null) {
                iTsmCallback.onResult(bundle);
            }
        } else if (iTsmCallback != null) {
            iTsmCallback.onError(bundle.getString("errorCode"), bundle.getString("errorDesc"));
        }
    }
}
