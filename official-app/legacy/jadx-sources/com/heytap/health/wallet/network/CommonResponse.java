package com.heytap.health.wallet.network;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ika;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class CommonResponse<T> {
    public T data;
    public ErrorResp error;
    private boolean success;

    @Keep
    public static class ErrorResp {
        public String code;
        public String msg;

        public static ErrorResp fromGson(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (ErrorResp) ika.c().b(str, ErrorResp.class);
        }
    }

    public static CommonResponse fromJson(String str, Type type) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (CommonResponse) ika.c().b(str, type);
    }

    public String getCode() {
        ErrorResp errorResp = this.error;
        return errorResp != null ? errorResp.code : "0";
    }

    public String getMessage() {
        ErrorResp errorResp = this.error;
        if (errorResp != null) {
            return errorResp.msg;
        }
        return null;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public static CommonResponse fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (CommonResponse) ika.c().b(str, CommonResponse.class);
    }
}
