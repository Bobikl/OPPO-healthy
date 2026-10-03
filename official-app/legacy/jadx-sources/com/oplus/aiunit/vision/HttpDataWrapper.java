package com.oplus.aiunit.vision;

import com.heytap.wearable.btnet.proto.HttpDataProto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.kj9, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/kj9;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/wearable/btnet/proto/HttpDataProto;", "a", "Lcom/heytap/wearable/btnet/proto/HttpDataProto;", "()Lcom/heytap/wearable/btnet/proto/HttpDataProto;", "httpDta", "b", "I", "()I", "transportType", "<init>", "(Lcom/heytap/wearable/btnet/proto/HttpDataProto;I)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HttpDataWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final HttpDataProto httpDta;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int transportType;

    public HttpDataWrapper(@NotNull HttpDataProto httpDta, int i) {
        Intrinsics.checkNotNullParameter(httpDta, "httpDta");
        this.httpDta = httpDta;
        this.transportType = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final HttpDataProto getHttpDta() {
        return this.httpDta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTransportType() {
        return this.transportType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpDataWrapper)) {
            return false;
        }
        HttpDataWrapper httpDataWrapper = (HttpDataWrapper) other;
        return Intrinsics.areEqual(this.httpDta, httpDataWrapper.httpDta) && this.transportType == httpDataWrapper.transportType;
    }

    public int hashCode() {
        return (this.httpDta.hashCode() * 31) + Integer.hashCode(this.transportType);
    }

    @NotNull
    public String toString() {
        return "HttpDataWrapper(httpDta=" + this.httpDta + ", transportType=" + this.transportType + ")";
    }
}
