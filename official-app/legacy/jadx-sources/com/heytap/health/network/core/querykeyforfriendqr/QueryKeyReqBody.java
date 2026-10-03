package com.heytap.health.network.core.querykeyforfriendqr;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/network/core/querykeyforfriendqr/QueryKeyReqBody;", "", "appId", "", "version", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getVersion", "()Ljava/lang/Long;", "setVersion", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "toString", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryKeyReqBody {

    @Nullable
    private String appId;

    @Nullable
    private Long version;

    public QueryKeyReqBody(@Nullable String str, @Nullable Long l2) {
        this.appId = str;
        this.version = l2;
    }

    @Nullable
    public final Long getVersion() {
        return this.version;
    }

    public final void setVersion(@Nullable Long l2) {
        this.version = l2;
    }

    @NotNull
    public String toString() {
        return "QueryKeyReqBody(appId=" + this.appId + ", version=" + this.version + ")";
    }
}
