package com.heytap.connect_dns.impl;

import com.heytap.connect.api.message.JsonSerializer;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/heytap/connect_dns/impl/JsonParser;", "Lcom/heytap/connect/api/message/JsonSerializer;", "Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "", "content", "parseObject", "(Ljava/lang/String;)Lorg/json/JSONObject;", "parseArray", "(Ljava/lang/String;)Lorg/json/JSONArray;", "obj", "key", "defaultValue", "optValue", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "array", "", "i", "getObject", "(Lorg/json/JSONArray;I)Lorg/json/JSONObject;", "(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class JsonParser implements JsonSerializer<JSONArray, JSONObject> {
    @Override // com.heytap.connect.api.message.JsonSerializer
    @NotNull
    public String optValue(@NotNull JSONObject obj, @NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String strOptString = obj.optString(key, defaultValue);
        Intrinsics.checkNotNullExpressionValue(strOptString, "obj.optString(key, defaultValue)");
        return strOptString;
    }

    @Override // com.heytap.connect.api.message.JsonSerializer
    @NotNull
    public JSONArray parseArray(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new JSONArray(content);
    }

    @Override // com.heytap.connect.api.message.JsonSerializer
    @NotNull
    public JSONObject parseObject(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new JSONObject(content);
    }

    @Override // com.heytap.connect.api.message.JsonSerializer
    @NotNull
    public JSONObject getObject(@NotNull JSONArray array, int i) throws JSONException {
        Intrinsics.checkNotNullParameter(array, "array");
        JSONObject jSONObject = array.getJSONObject(i);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
        return jSONObject;
    }

    @Override // com.heytap.connect.api.message.JsonSerializer
    @NotNull
    public JSONObject getObject(@NotNull JSONObject obj, @NotNull String key) throws JSONException {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = obj.getJSONObject(key);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "obj.getJSONObject(key)");
        return jSONObject;
    }
}
