package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.reflect.TypeToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;

/* JADX INFO: loaded from: classes6.dex */
public class sa {

    public interface a {
        void a(String str);
    }

    @NonNull
    public static <T> AcApiResponse<T> a(@NonNull Class<T> cls, @NonNull AcIpcResponse acIpcResponse) {
        return b(cls, acIpcResponse, null);
    }

    @NonNull
    public static <T> AcApiResponse<T> b(@NonNull Class<T> cls, @NonNull AcIpcResponse acIpcResponse, tj.a aVar) {
        Object objC = null;
        if (acIpcResponse.getData() == null) {
            return new AcApiResponse<>(acIpcResponse.getCode(), acIpcResponse.getMsg(), null);
        }
        String configJson = acIpcResponse.getData().getConfigJson();
        String responseJson = acIpcResponse.getData().getResponseJson();
        if (aVar != null) {
            aVar.c("SP_KEY_SDK_CONFIG", configJson);
        }
        if (TextUtils.isEmpty(responseJson)) {
            AcLogUtil.w("AcIpcResultUtil", "responseJson is empty, returning null data");
        } else {
            objC = xa.c(responseJson, cls);
        }
        return new AcApiResponse<>(acIpcResponse.getCode(), acIpcResponse.getMsg(), objC);
    }

    @NonNull
    public static <T> AcApiResponse<T> c(@NonNull TypeToken<T> typeToken, @NonNull AcIpcResponse acIpcResponse, @Nullable a aVar) {
        Object objB = null;
        if (acIpcResponse.getData() == null) {
            return new AcApiResponse<>(acIpcResponse.getCode(), acIpcResponse.getMsg(), null);
        }
        String configJson = acIpcResponse.getData().getConfigJson();
        String responseJson = acIpcResponse.getData().getResponseJson();
        if (aVar != null) {
            aVar.a(configJson);
        }
        if (TextUtils.isEmpty(responseJson)) {
            AcLogUtil.w("AcIpcResultUtil", "responseJson is empty, returning null data");
        } else {
            objB = xa.b(responseJson, typeToken);
        }
        return new AcApiResponse<>(acIpcResponse.getCode(), acIpcResponse.getMsg(), objB);
    }
}
