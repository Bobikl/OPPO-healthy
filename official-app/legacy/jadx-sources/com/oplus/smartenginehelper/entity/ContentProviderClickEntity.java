package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;", "Lcom/oplus/smartenginehelper/entity/ClickEntity;", "()V", "mParamsJSONObject", "Lorg/json/JSONObject;", "setMethod", "", "method", "", "setParams", "key", "value", "setUri", ParserTag.TAG_URI, "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class ContentProviderClickEntity extends ClickEntity {
    private JSONObject mParamsJSONObject;

    public ContentProviderClickEntity() throws JSONException {
        getMJSONObject().put("type", "cp");
    }

    public final void setMethod(@NotNull String method) throws JSONException {
        Intrinsics.checkNotNullParameter(method, "method");
        getMJSONObject().put("method", method);
    }

    public final void setParams(@NotNull String key, @NotNull String value) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.mParamsJSONObject == null) {
            this.mParamsJSONObject = new JSONObject();
            getMJSONObject().put("params", this.mParamsJSONObject);
        }
        JSONObject jSONObject = this.mParamsJSONObject;
        if (jSONObject != null) {
            jSONObject.put(key, value);
        }
    }

    public final void setUri(@NotNull String uri) throws JSONException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        getMJSONObject().put(ParserTag.TAG_URI, uri);
    }
}
