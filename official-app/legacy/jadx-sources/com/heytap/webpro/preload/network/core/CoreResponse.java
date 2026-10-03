package com.heytap.webpro.preload.network.core;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.q7b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class CoreResponse<T> {
    private static final String TAG = "CoreResponse";

    @SerializedName(alternate = {"result"}, value = "code")
    public int code;
    public T data;

    @SerializedName(alternate = {"msg", "resultMsg", "errMsg"}, value = "message")
    public String message;
    public boolean success;

    private CoreResponse(int i, String str, T t) {
        this.code = i;
        this.message = str;
        this.data = t;
    }

    public static <T> CoreResponse<T> error(int i, String str) {
        return new CoreResponse<>(i, str, null);
    }

    public static <T> CoreResponse<T> success(T t) {
        return new CoreResponse<>(t);
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

    public boolean isSuccess() {
        return this.success;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    @Nullable
    public JSONObject toJsonObject() {
        try {
            return new JSONObject(new Gson().toJson(this));
        } catch (JSONException e2) {
            q7b.d(TAG, "toJsonObject failed! " + e2.getMessage());
            return null;
        }
    }

    public static <T> CoreResponse<T> error(int i, String str, T t) {
        return new CoreResponse<>(i, str, t);
    }

    private CoreResponse(T t) {
        this.data = t;
    }
}
