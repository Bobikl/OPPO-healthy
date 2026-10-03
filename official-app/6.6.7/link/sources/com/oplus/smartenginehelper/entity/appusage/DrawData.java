package com.oplus.smartenginehelper.entity.appusage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/oplus/smartenginehelper/entity/appusage/DrawData;", "", "()V", "mJSONObject", "Lorg/json/JSONObject;", "getJsonObject", "setDefault", "default", "", "setIndexMark", "indexMark", "", "setTop1", "top1", "setTop2", "top2", "setTop3", "top3", "setTop4", "top4", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class DrawData {
    private final JSONObject mJSONObject = new JSONObject();

    @NotNull
    /* JADX INFO: renamed from: getJsonObject, reason: from getter */
    public final JSONObject getMJSONObject() {
        return this.mJSONObject;
    }

    @NotNull
    public final DrawData setDefault(float f) throws JSONException {
        this.mJSONObject.put("default", Float.valueOf(f));
        return this;
    }

    @NotNull
    public final DrawData setIndexMark(@Nullable String indexMark) throws JSONException {
        this.mJSONObject.put("indexMark", indexMark);
        return this;
    }

    @NotNull
    public final DrawData setTop1(float top1) throws JSONException {
        this.mJSONObject.put("top1", Float.valueOf(top1));
        return this;
    }

    @NotNull
    public final DrawData setTop2(float top2) throws JSONException {
        this.mJSONObject.put("top2", Float.valueOf(top2));
        return this;
    }

    @NotNull
    public final DrawData setTop3(float top3) throws JSONException {
        this.mJSONObject.put("top3", Float.valueOf(top3));
        return this;
    }

    @NotNull
    public final DrawData setTop4(float top4) throws JSONException {
        this.mJSONObject.put("top4", Float.valueOf(top4));
        return this;
    }
}
