package com.heytap.health.core.provider.auth.struct;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.health.core.provider.auth.struct.PackageAccessBody, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/core/provider/auth/struct/PackageAccessBody;", "", "clientId", "", "clientName", "clientLogo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getClientLogo", "setClientLogo", "getClientName", "setClientName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PackageClientBody {

    @NotNull
    private String clientId;

    @NotNull
    private String clientLogo;

    @NotNull
    private String clientName;

    public PackageClientBody(@NotNull String clientId, @NotNull String clientName, @NotNull String clientLogo) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(clientLogo, "clientLogo");
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientLogo = clientLogo;
    }

    public static /* synthetic */ PackageClientBody copy$default(PackageClientBody packageClientBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packageClientBody.clientId;
        }
        if ((i & 2) != 0) {
            str2 = packageClientBody.clientName;
        }
        if ((i & 4) != 0) {
            str3 = packageClientBody.clientLogo;
        }
        return packageClientBody.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientLogo() {
        return this.clientLogo;
    }

    @NotNull
    public final PackageClientBody copy(@NotNull String clientId, @NotNull String clientName, @NotNull String clientLogo) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(clientLogo, "clientLogo");
        return new PackageClientBody(clientId, clientName, clientLogo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageClientBody)) {
            return false;
        }
        PackageClientBody packageClientBody = (PackageClientBody) other;
        return Intrinsics.areEqual(this.clientId, packageClientBody.clientId) && Intrinsics.areEqual(this.clientName, packageClientBody.clientName) && Intrinsics.areEqual(this.clientLogo, packageClientBody.clientLogo);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getClientLogo() {
        return this.clientLogo;
    }

    @NotNull
    public final String getClientName() {
        return this.clientName;
    }

    public int hashCode() {
        return (((this.clientId.hashCode() * 31) + this.clientName.hashCode()) * 31) + this.clientLogo.hashCode();
    }

    public final void setClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientId = str;
    }

    public final void setClientLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientLogo = str;
    }

    public final void setClientName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientName = str;
    }

    @NotNull
    public String toString() {
        return "PackageClientBody(clientId='" + this.clientId + "', clientName='" + this.clientName + "', clientLogo='" + this.clientLogo + "')";
    }
}
