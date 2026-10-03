package com.heytap.device.data.api;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/device/data/api/SleepStateRequest;", "", "event", "", "params", "Lcom/heytap/device/data/api/SleepStateParams;", "(Ljava/lang/String;Lcom/heytap/device/data/api/SleepStateParams;)V", "getEvent", "()Ljava/lang/String;", "getParams", "()Lcom/heytap/device/data/api/SleepStateParams;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepStateRequest {

    @NotNull
    private final String event;

    @NotNull
    private final SleepStateParams params;

    public SleepStateRequest(@NotNull String event, @NotNull SleepStateParams params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        this.event = event;
        this.params = params;
    }

    public static /* synthetic */ SleepStateRequest copy$default(SleepStateRequest sleepStateRequest, String str, SleepStateParams sleepStateParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepStateRequest.event;
        }
        if ((i & 2) != 0) {
            sleepStateParams = sleepStateRequest.params;
        }
        return sleepStateRequest.copy(str, sleepStateParams);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SleepStateParams getParams() {
        return this.params;
    }

    @NotNull
    public final SleepStateRequest copy(@NotNull String event, @NotNull SleepStateParams params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        return new SleepStateRequest(event, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepStateRequest)) {
            return false;
        }
        SleepStateRequest sleepStateRequest = (SleepStateRequest) other;
        return Intrinsics.areEqual(this.event, sleepStateRequest.event) && Intrinsics.areEqual(this.params, sleepStateRequest.params);
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final SleepStateParams getParams() {
        return this.params;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.params.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepStateRequest(event=" + this.event + ", params=" + this.params + ")";
    }
}
