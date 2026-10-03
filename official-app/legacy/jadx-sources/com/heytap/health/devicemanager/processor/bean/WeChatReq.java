package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/WeChatReq;", "", "model", "", "(Ljava/lang/String;)V", "getModel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeChatReq {

    @NotNull
    private final String model;

    public WeChatReq(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
    }

    public static /* synthetic */ WeChatReq copy$default(WeChatReq weChatReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weChatReq.model;
        }
        return weChatReq.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final WeChatReq copy(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new WeChatReq(model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WeChatReq) && Intrinsics.areEqual(this.model, ((WeChatReq) other).model);
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return this.model.hashCode();
    }

    @NotNull
    public String toString() {
        return "WeChatReq(model=" + this.model + ")";
    }
}
