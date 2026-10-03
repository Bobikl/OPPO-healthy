package com.heytap.store.base.core.util.statistics.bean;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/base/core/util/statistics/bean/OppoStoreBuriedReportBean;", "", "()V", "commonValues", "Lcom/google/gson/JsonObject;", "getCommonValues", "()Lcom/google/gson/JsonObject;", "setCommonValues", "(Lcom/google/gson/JsonObject;)V", "eventType", "", "getEventType", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "specialValues", "getSpecialValues", "setSpecialValues", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OppoStoreBuriedReportBean {

    @Nullable
    private JsonObject commonValues;

    @NotNull
    private String eventType = "";

    @Nullable
    private JsonObject specialValues;

    @Nullable
    public final JsonObject getCommonValues() {
        return this.commonValues;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final JsonObject getSpecialValues() {
        return this.specialValues;
    }

    public final void setCommonValues(@Nullable JsonObject jsonObject) {
        this.commonValues = jsonObject;
    }

    public final void setEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventType = str;
    }

    public final void setSpecialValues(@Nullable JsonObject jsonObject) {
        this.specialValues = jsonObject;
    }
}
