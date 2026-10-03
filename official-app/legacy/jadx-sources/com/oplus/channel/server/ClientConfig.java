package com.oplus.channel.server;

import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.gd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\b\u0010!\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, d2 = {"Lcom/oplus/channel/server/ClientConfig;", "", HttpConst.CLIENT_PACKAGE, "", "providerAuthority", "serviceComponent", "aliveType", "", gd.STR_ISHOST, "", "needNotify", "needKeepAlive", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZ)V", "getAliveType", "()I", "getClientPackage", "()Ljava/lang/String;", "()Z", "getNeedKeepAlive", "getNeedNotify", "getProviderAuthority", "getServiceComponent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Companion", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ClientConfig {
    public static final int ALIVE_TYPE_ALWAYS = 2;
    public static final int ALIVE_TYPE_ALWAYS_IMPORTANT = 3;
    public static final int ALIVE_TYPE_CALL = 1;
    public static final int ALIVE_TYPE_DEFAULT = 0;
    private final int aliveType;

    @NotNull
    private final String clientPackage;
    private final boolean isHost;
    private final boolean needKeepAlive;
    private final boolean needNotify;

    @NotNull
    private final String providerAuthority;

    @NotNull
    private final String serviceComponent;

    public ClientConfig() {
        this(null, null, null, 0, false, false, false, 127, null);
    }

    public static /* synthetic */ ClientConfig copy$default(ClientConfig clientConfig, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = clientConfig.clientPackage;
        }
        if ((i2 & 2) != 0) {
            str2 = clientConfig.providerAuthority;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = clientConfig.serviceComponent;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = clientConfig.aliveType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = clientConfig.isHost;
        }
        boolean z4 = z;
        if ((i2 & 32) != 0) {
            z2 = clientConfig.needNotify;
        }
        boolean z5 = z2;
        if ((i2 & 64) != 0) {
            z3 = clientConfig.needKeepAlive;
        }
        return clientConfig.copy(str, str4, str5, i3, z4, z5, z3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientPackage() {
        return this.clientPackage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProviderAuthority() {
        return this.providerAuthority;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServiceComponent() {
        return this.serviceComponent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAliveType() {
        return this.aliveType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsHost() {
        return this.isHost;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNeedNotify() {
        return this.needNotify;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getNeedKeepAlive() {
        return this.needKeepAlive;
    }

    @NotNull
    public final ClientConfig copy(@NotNull String clientPackage, @NotNull String providerAuthority, @NotNull String serviceComponent, int aliveType, boolean isHost, boolean needNotify, boolean needKeepAlive) {
        Intrinsics.checkNotNullParameter(clientPackage, "clientPackage");
        Intrinsics.checkNotNullParameter(providerAuthority, "providerAuthority");
        Intrinsics.checkNotNullParameter(serviceComponent, "serviceComponent");
        return new ClientConfig(clientPackage, providerAuthority, serviceComponent, aliveType, isHost, needNotify, needKeepAlive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientConfig)) {
            return false;
        }
        ClientConfig clientConfig = (ClientConfig) other;
        return Intrinsics.areEqual(this.clientPackage, clientConfig.clientPackage) && Intrinsics.areEqual(this.providerAuthority, clientConfig.providerAuthority) && Intrinsics.areEqual(this.serviceComponent, clientConfig.serviceComponent) && this.aliveType == clientConfig.aliveType && this.isHost == clientConfig.isHost && this.needNotify == clientConfig.needNotify && this.needKeepAlive == clientConfig.needKeepAlive;
    }

    public final int getAliveType() {
        return this.aliveType;
    }

    @NotNull
    public final String getClientPackage() {
        return this.clientPackage;
    }

    public final boolean getNeedKeepAlive() {
        return this.needKeepAlive;
    }

    public final boolean getNeedNotify() {
        return this.needNotify;
    }

    @NotNull
    public final String getProviderAuthority() {
        return this.providerAuthority;
    }

    @NotNull
    public final String getServiceComponent() {
        return this.serviceComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((this.clientPackage.hashCode() * 31) + this.providerAuthority.hashCode()) * 31) + this.serviceComponent.hashCode()) * 31) + Integer.hashCode(this.aliveType)) * 31;
        boolean z = this.isHost;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.needNotify;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.needKeepAlive;
        return i2 + (z3 ? 1 : z3);
    }

    public final boolean isHost() {
        return this.isHost;
    }

    @NotNull
    public String toString() {
        return "ClientConfig(clientPackage='" + this.clientPackage + "', providerAuthority='" + this.providerAuthority + "', serviceComponent='" + this.serviceComponent + "', aliveType=" + this.aliveType + ", needNotify=" + this.needNotify + ')';
    }

    public ClientConfig(@NotNull String clientPackage, @NotNull String providerAuthority, @NotNull String serviceComponent, int i, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(clientPackage, "clientPackage");
        Intrinsics.checkNotNullParameter(providerAuthority, "providerAuthority");
        Intrinsics.checkNotNullParameter(serviceComponent, "serviceComponent");
        this.clientPackage = clientPackage;
        this.providerAuthority = providerAuthority;
        this.serviceComponent = serviceComponent;
        this.aliveType = i;
        this.isHost = z;
        this.needNotify = z2;
        this.needKeepAlive = z3;
    }

    public /* synthetic */ ClientConfig(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? true : z3);
    }
}
