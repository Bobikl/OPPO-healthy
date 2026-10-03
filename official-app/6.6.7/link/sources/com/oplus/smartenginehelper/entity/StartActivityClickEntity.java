package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/oplus/smartenginehelper/entity/StartActivityClickEntity;", "Lcom/oplus/smartenginehelper/entity/ClickEntity;", "()V", "mParamsJSONObject", "Lorg/json/JSONObject;", "addFlag", "", ParserTag.TAG_FLAG, "", "setAction", ParserTag.TAG_ACTION, "", "setCategory", ParserTag.TAG_CATEGORY, "setData", "data", "setIntentType", ParserTag.TAG_INTENT_TYPE, "setPackageName", "packageName", "setParams", Node.I_KEY, "value", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class StartActivityClickEntity extends ClickEntity {
    private JSONObject mParamsJSONObject;

    public StartActivityClickEntity() throws JSONException {
        getMJSONObject().put("type", ParserTag.TAG_ACTIVITY);
    }

    public final void addFlag(int flag) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_FLAG, flag | getMJSONObject().optInt(ParserTag.TAG_FLAG, 0));
    }

    public final void setAction(@NotNull String action) throws JSONException {
        Intrinsics.checkNotNullParameter(action, ParserTag.TAG_ACTION);
        getMJSONObject().put(ParserTag.TAG_ACTION, action);
    }

    public final void setCategory(@NotNull String category) throws JSONException {
        Intrinsics.checkNotNullParameter(category, ParserTag.TAG_CATEGORY);
        getMJSONObject().put(ParserTag.TAG_CATEGORY, category);
    }

    public final void setData(@NotNull String data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        getMJSONObject().put("data", data);
    }

    public final void setIntentType(@NotNull String intentType) throws JSONException {
        Intrinsics.checkNotNullParameter(intentType, ParserTag.TAG_INTENT_TYPE);
        getMJSONObject().put(ParserTag.TAG_INTENT_TYPE, intentType);
    }

    public final void setPackageName(@NotNull String packageName) throws JSONException {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        getMJSONObject().put("packageName", packageName);
    }

    public final void setParams(@NotNull String key, @NotNull String value) throws JSONException {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
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
}
