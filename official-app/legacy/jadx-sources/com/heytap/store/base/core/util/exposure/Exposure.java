package com.heytap.store.base.core.util.exposure;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/base/core/util/exposure/Exposure;", "", "exposureEvent", "", "exposureProperties", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getExposureEvent", "()Ljava/lang/String;", "getExposureProperties", "()Lorg/json/JSONObject;", "equals", "", "obj", "hashCode", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Exposure {

    @NotNull
    private final String exposureEvent;

    @NotNull
    private final JSONObject exposureProperties;

    public Exposure(@NotNull String exposureEvent, @NotNull JSONObject exposureProperties) {
        Intrinsics.checkNotNullParameter(exposureEvent, "exposureEvent");
        Intrinsics.checkNotNullParameter(exposureProperties, "exposureProperties");
        this.exposureEvent = exposureEvent;
        this.exposureProperties = exposureProperties;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Exposure)) {
            return false;
        }
        Exposure exposure = (Exposure) obj;
        if (Intrinsics.areEqual(this.exposureEvent, exposure.exposureEvent)) {
            return Intrinsics.areEqual(this.exposureProperties.toString(), exposure.exposureProperties.toString());
        }
        return false;
    }

    @NotNull
    public final String getExposureEvent() {
        return this.exposureEvent;
    }

    @NotNull
    public final JSONObject getExposureProperties() {
        return this.exposureProperties;
    }

    public int hashCode() {
        return ((527 + this.exposureEvent.hashCode()) * 31) + this.exposureProperties.toString().hashCode();
    }
}
