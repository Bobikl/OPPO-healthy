package com.heytap.health.settings.watch.sporthealthsettings.utils.research;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/SyncProjectResponse;", "", "code", "", "data", "", "Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/SyncProjectResponseItem;", "message", "", "serverTime", "", "(ILjava/util/List;Ljava/lang/String;J)V", "getCode", "()I", "getData", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getServerTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncProjectResponse {
    public static final int $stable = 8;
    private final int code;

    @NotNull
    private final List<SyncProjectResponseItem> data;

    @NotNull
    private final String message;
    private final long serverTime;

    public SyncProjectResponse(int i, @NotNull List<SyncProjectResponseItem> data, @NotNull String message, long j2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.data = data;
        this.message = message;
        this.serverTime = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncProjectResponse copy$default(SyncProjectResponse syncProjectResponse, int i, List list, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = syncProjectResponse.code;
        }
        if ((i2 & 2) != 0) {
            list = syncProjectResponse.data;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            str = syncProjectResponse.message;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            j2 = syncProjectResponse.serverTime;
        }
        return syncProjectResponse.copy(i, list2, str2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final List<SyncProjectResponseItem> component2() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    @NotNull
    public final SyncProjectResponse copy(int code, @NotNull List<SyncProjectResponseItem> data, @NotNull String message, long serverTime) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        return new SyncProjectResponse(code, data, message, serverTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncProjectResponse)) {
            return false;
        }
        SyncProjectResponse syncProjectResponse = (SyncProjectResponse) other;
        return this.code == syncProjectResponse.code && Intrinsics.areEqual(this.data, syncProjectResponse.data) && Intrinsics.areEqual(this.message, syncProjectResponse.message) && this.serverTime == syncProjectResponse.serverTime;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final List<SyncProjectResponseItem> getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.data.hashCode()) * 31) + this.message.hashCode()) * 31) + Long.hashCode(this.serverTime);
    }

    @NotNull
    public String toString() {
        return "SyncProjectResponse(code=" + this.code + ", data=" + this.data + ", message=" + this.message + ", serverTime=" + this.serverTime + ")";
    }
}
