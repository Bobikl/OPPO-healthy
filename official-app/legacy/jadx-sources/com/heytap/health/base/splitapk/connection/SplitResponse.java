package com.heytap.health.base.splitapk.connection;

import androidx.annotation.Keep;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/base/splitapk/connection/SplitResponse;", "", "resultCode", "", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "(ILjava/lang/String;)V", "getResponse", "()Ljava/lang/String;", "setResponse", "(Ljava/lang/String;)V", "getResultCode", "()I", "setResultCode", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SplitResponse {

    @NotNull
    private String response;
    private int resultCode;

    public SplitResponse(int i, @NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.resultCode = i;
        this.response = response;
    }

    public static /* synthetic */ SplitResponse copy$default(SplitResponse splitResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = splitResponse.resultCode;
        }
        if ((i2 & 2) != 0) {
            str = splitResponse.response;
        }
        return splitResponse.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    @NotNull
    public final SplitResponse copy(int resultCode, @NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new SplitResponse(resultCode, response);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitResponse)) {
            return false;
        }
        SplitResponse splitResponse = (SplitResponse) other;
        return this.resultCode == splitResponse.resultCode && Intrinsics.areEqual(this.response, splitResponse.response);
    }

    @NotNull
    public final String getResponse() {
        return this.response;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.resultCode) * 31) + this.response.hashCode();
    }

    public final void setResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.response = str;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "SplitResponse(resultCode=" + this.resultCode + ", response=" + this.response + ")";
    }
}
