package com.platform.account.third.api.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.nearx.tangramconfig.stat.Const;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class ThirdOauthResponse<T> {
    private int code;
    private T data;
    private String message;

    public ThirdOauthResponse(int i, String str, T t) {
        this.code = i;
        this.message = str;
        this.data = t;
    }

    public static <T> ThirdOauthResponse<T> cancel() {
        return new ThirdOauthResponse<>(-2050000, "cancel", null);
    }

    public static <T> ThirdOauthResponse<T> error(int i, String str) {
        return new ThirdOauthResponse<>(i, str, null);
    }

    public static boolean isCanceled(int i) {
        return i == -2050000;
    }

    public static boolean isSuccess(int i) {
        return i == -200;
    }

    public static <T> ThirdOauthResponse<T> success(T t) {
        return new ThirdOauthResponse<>(Const.ERROR_CODE_NON_EXIST, "succeed", t);
    }

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyBean{code=");
        sb.append(this.code);
        sb.append(", message= ");
        sb.append(this.message);
        sb.append(", hasData=");
        sb.append(this.data != null);
        sb.append(", dataType=");
        T t = this.data;
        sb.append(t == null ? null : t.getClass().getSimpleName());
        sb.append('}');
        return sb.toString();
    }
}
