package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/esim/nec/bean/MultiSIMServiceRequestResponse;", "", "ManageUrl", "", "PostData", "Timer2", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getManageUrl", "()Ljava/lang/String;", "getPostData", "getTimer2", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MultiSIMServiceRequestResponse {
    public static final int $stable = 0;

    @NotNull
    private final String ManageUrl;

    @NotNull
    private final String PostData;
    private final int Timer2;

    public MultiSIMServiceRequestResponse(@NotNull String ManageUrl, @NotNull String PostData, int i) {
        Intrinsics.checkNotNullParameter(ManageUrl, "ManageUrl");
        Intrinsics.checkNotNullParameter(PostData, "PostData");
        this.ManageUrl = ManageUrl;
        this.PostData = PostData;
        this.Timer2 = i;
    }

    public static /* synthetic */ MultiSIMServiceRequestResponse copy$default(MultiSIMServiceRequestResponse multiSIMServiceRequestResponse, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = multiSIMServiceRequestResponse.ManageUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = multiSIMServiceRequestResponse.PostData;
        }
        if ((i2 & 4) != 0) {
            i = multiSIMServiceRequestResponse.Timer2;
        }
        return multiSIMServiceRequestResponse.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getManageUrl() {
        return this.ManageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPostData() {
        return this.PostData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimer2() {
        return this.Timer2;
    }

    @NotNull
    public final MultiSIMServiceRequestResponse copy(@NotNull String ManageUrl, @NotNull String PostData, int Timer2) {
        Intrinsics.checkNotNullParameter(ManageUrl, "ManageUrl");
        Intrinsics.checkNotNullParameter(PostData, "PostData");
        return new MultiSIMServiceRequestResponse(ManageUrl, PostData, Timer2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiSIMServiceRequestResponse)) {
            return false;
        }
        MultiSIMServiceRequestResponse multiSIMServiceRequestResponse = (MultiSIMServiceRequestResponse) other;
        return Intrinsics.areEqual(this.ManageUrl, multiSIMServiceRequestResponse.ManageUrl) && Intrinsics.areEqual(this.PostData, multiSIMServiceRequestResponse.PostData) && this.Timer2 == multiSIMServiceRequestResponse.Timer2;
    }

    @NotNull
    public final String getManageUrl() {
        return this.ManageUrl;
    }

    @NotNull
    public final String getPostData() {
        return this.PostData;
    }

    public final int getTimer2() {
        return this.Timer2;
    }

    public int hashCode() {
        return (((this.ManageUrl.hashCode() * 31) + this.PostData.hashCode()) * 31) + Integer.hashCode(this.Timer2);
    }

    @NotNull
    public String toString() {
        return "MultiSIMServiceRequestResponse(ManageUrl=" + this.ManageUrl + ", PostData=" + this.PostData + ", Timer2=" + this.Timer2 + ")";
    }
}
