package com.oplus.smartenginehelper.entity.appusage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\"J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0010J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0010J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0010J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013J\u000e\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\rJ\u000e\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0010J\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0010J\u000e\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/oplus/smartenginehelper/entity/appusage/DrawInfo;", "", "()V", "mDrawDataArray", "Lorg/json/JSONArray;", "mDrawJsonObject", "Lorg/json/JSONObject;", "addData", "drawData", "Lcom/oplus/smartenginehelper/entity/appusage/DrawData;", "getJsonObject", "removeData", "index", "", "setBackgroundColor", "backgroundColor", "", "setChartBottomMargin", "chartBottomMargin", "", "(Ljava/lang/Float;)Lcom/oplus/smartenginehelper/entity/appusage/DrawInfo;", "setChartEndMargin", "chartEndMargin", "setChartStartMargin", "chartStartMargin", "setData", "setDefaultColor", "defaultColor", "setMaxValue", "maxValue", "setRectWidth", "rectWidth", "setShowAnim", "showAnim", "", "setShowDashLine", "showDashLine", "setTop1Color", "top1Color", "setTop2Color", "top2Color", "setTop3Color", "top3Color", "setTop4Color", "top4Color", "setTopPadding", "topPadding", "setType", "type", "setYMaxString", "yMaxString", "setYMediumString", "yMediumString", "setYMinString", "yMinString", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class DrawInfo {
    private final JSONObject mDrawJsonObject = new JSONObject();
    private final JSONArray mDrawDataArray = new JSONArray();

    @NotNull
    public final DrawInfo addData(@NotNull DrawData drawData) {
        Intrinsics.checkNotNullParameter(drawData, "drawData");
        this.mDrawDataArray.put(drawData.getMJSONObject());
        return this;
    }

    @NotNull
    public final JSONObject getJsonObject() throws JSONException {
        if (this.mDrawDataArray.length() > 0) {
            this.mDrawJsonObject.put("data", this.mDrawDataArray);
        }
        return this.mDrawJsonObject;
    }

    @NotNull
    public final DrawInfo removeData(int index) {
        this.mDrawDataArray.remove(index);
        return this;
    }

    @NotNull
    public final DrawInfo setBackgroundColor(@NotNull String backgroundColor) throws JSONException {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.mDrawJsonObject.put("backgroundColor", backgroundColor);
        return this;
    }

    @NotNull
    public final DrawInfo setChartBottomMargin(@Nullable Float chartBottomMargin) throws JSONException {
        if (chartBottomMargin == null) {
            this.mDrawJsonObject.remove("chartBottomMargin");
        } else {
            this.mDrawJsonObject.put("chartBottomMargin", chartBottomMargin);
        }
        return this;
    }

    @NotNull
    public final DrawInfo setChartEndMargin(@Nullable Float chartEndMargin) throws JSONException {
        if (chartEndMargin == null) {
            this.mDrawJsonObject.remove("chartEndMargin");
        } else {
            this.mDrawJsonObject.put("chartEndMargin", chartEndMargin);
        }
        return this;
    }

    @NotNull
    public final DrawInfo setChartStartMargin(@Nullable Float chartStartMargin) throws JSONException {
        if (chartStartMargin == null) {
            this.mDrawJsonObject.remove("chartStartMargin");
        } else {
            this.mDrawJsonObject.put("chartStartMargin", chartStartMargin);
        }
        return this;
    }

    @NotNull
    public final DrawInfo setData(int index, @NotNull DrawData drawData) throws JSONException {
        Intrinsics.checkNotNullParameter(drawData, "drawData");
        this.mDrawDataArray.put(index, drawData.getMJSONObject());
        return this;
    }

    @NotNull
    public final DrawInfo setDefaultColor(@NotNull String defaultColor) throws JSONException {
        Intrinsics.checkNotNullParameter(defaultColor, "defaultColor");
        this.mDrawJsonObject.put("defaultColor", defaultColor);
        return this;
    }

    @NotNull
    public final DrawInfo setMaxValue(float maxValue) throws JSONException {
        this.mDrawJsonObject.put("maxValue", Float.valueOf(maxValue));
        return this;
    }

    @NotNull
    public final DrawInfo setRectWidth(float rectWidth) throws JSONException {
        this.mDrawJsonObject.put("rectWidth", Float.valueOf(rectWidth));
        return this;
    }

    @NotNull
    public final DrawInfo setShowAnim(boolean showAnim) throws JSONException {
        this.mDrawJsonObject.put("showAnim", showAnim);
        return this;
    }

    @NotNull
    public final DrawInfo setShowDashLine(boolean showDashLine) throws JSONException {
        this.mDrawJsonObject.put("showDashLine", showDashLine);
        return this;
    }

    @NotNull
    public final DrawInfo setTop1Color(@NotNull String top1Color) throws JSONException {
        Intrinsics.checkNotNullParameter(top1Color, "top1Color");
        this.mDrawJsonObject.put("top1Color", top1Color);
        return this;
    }

    @NotNull
    public final DrawInfo setTop2Color(@NotNull String top2Color) throws JSONException {
        Intrinsics.checkNotNullParameter(top2Color, "top2Color");
        this.mDrawJsonObject.put("top2Color", top2Color);
        return this;
    }

    @NotNull
    public final DrawInfo setTop3Color(@NotNull String top3Color) throws JSONException {
        Intrinsics.checkNotNullParameter(top3Color, "top3Color");
        this.mDrawJsonObject.put("top3Color", top3Color);
        return this;
    }

    @NotNull
    public final DrawInfo setTop4Color(@NotNull String top4Color) throws JSONException {
        Intrinsics.checkNotNullParameter(top4Color, "top4Color");
        this.mDrawJsonObject.put("top4Color", top4Color);
        return this;
    }

    @NotNull
    public final DrawInfo setTopPadding(float topPadding) throws JSONException {
        this.mDrawJsonObject.put("topPadding", Float.valueOf(topPadding));
        return this;
    }

    @NotNull
    public final DrawInfo setType(int type) throws JSONException {
        this.mDrawJsonObject.put("type", type);
        return this;
    }

    @NotNull
    public final DrawInfo setYMaxString(@NotNull String yMaxString) throws JSONException {
        Intrinsics.checkNotNullParameter(yMaxString, "yMaxString");
        this.mDrawJsonObject.put("yMaxString", yMaxString);
        return this;
    }

    @NotNull
    public final DrawInfo setYMediumString(@NotNull String yMediumString) throws JSONException {
        Intrinsics.checkNotNullParameter(yMediumString, "yMediumString");
        this.mDrawJsonObject.put("yMediumString", yMediumString);
        return this;
    }

    @NotNull
    public final DrawInfo setYMinString(@NotNull String yMinString) throws JSONException {
        Intrinsics.checkNotNullParameter(yMinString, "yMinString");
        this.mDrawJsonObject.put("yMinString", yMinString);
        return this;
    }
}
