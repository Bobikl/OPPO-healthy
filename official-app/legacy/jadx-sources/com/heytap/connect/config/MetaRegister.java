package com.heytap.connect.config;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004JL\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001c\u0010\u0004R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001d\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001e\u0010\u0004R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001f\u0010\u0004R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b \u0010\u0004¨\u0006#"}, d2 = {"Lcom/heytap/connect/config/MetaRegister;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "registerPath", ConnectIdLogic.PARAM_SECRET_ID, "source", ConnectIdLogic.PARAM_ALGORITHM, "secretKey", "type", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/connect/config/MetaRegister;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSecretKey", "getRegisterPath", "getSecretId", "getAlgorithm", "getSource", "getType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MetaRegister {

    @NotNull
    private final String algorithm;

    @NotNull
    private final String registerPath;

    @NotNull
    private final String secretId;

    @NotNull
    private final String secretKey;

    @NotNull
    private final String source;

    @NotNull
    private final String type;

    public MetaRegister() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ MetaRegister copy$default(MetaRegister metaRegister, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metaRegister.registerPath;
        }
        if ((i & 2) != 0) {
            str2 = metaRegister.secretId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = metaRegister.source;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = metaRegister.algorithm;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = metaRegister.secretKey;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = metaRegister.type;
        }
        return metaRegister.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegisterPath() {
        return this.registerPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecretId() {
        return this.secretId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecretKey() {
        return this.secretKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final MetaRegister copy(@NotNull String registerPath, @NotNull String secretId, @NotNull String source, @NotNull String algorithm, @NotNull String secretKey, @NotNull String type) {
        Intrinsics.checkNotNullParameter(registerPath, "registerPath");
        Intrinsics.checkNotNullParameter(secretId, "secretId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(type, "type");
        return new MetaRegister(registerPath, secretId, source, algorithm, secretKey, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetaRegister)) {
            return false;
        }
        MetaRegister metaRegister = (MetaRegister) other;
        return Intrinsics.areEqual(this.registerPath, metaRegister.registerPath) && Intrinsics.areEqual(this.secretId, metaRegister.secretId) && Intrinsics.areEqual(this.source, metaRegister.source) && Intrinsics.areEqual(this.algorithm, metaRegister.algorithm) && Intrinsics.areEqual(this.secretKey, metaRegister.secretKey) && Intrinsics.areEqual(this.type, metaRegister.type);
    }

    @NotNull
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    public final String getRegisterPath() {
        return this.registerPath;
    }

    @NotNull
    public final String getSecretId() {
        return this.secretId;
    }

    @NotNull
    public final String getSecretKey() {
        return this.secretKey;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.registerPath.hashCode() * 31) + this.secretId.hashCode()) * 31) + this.source.hashCode()) * 31) + this.algorithm.hashCode()) * 31) + this.secretKey.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "MetaRegister(registerPath=" + this.registerPath + ", secretId=" + this.secretId + ", source=" + this.source + ", algorithm=" + this.algorithm + ", secretKey=" + this.secretKey + ", type=" + this.type + ')';
    }

    public MetaRegister(@NotNull String registerPath, @NotNull String secretId, @NotNull String source, @NotNull String algorithm, @NotNull String secretKey, @NotNull String type) {
        Intrinsics.checkNotNullParameter(registerPath, "registerPath");
        Intrinsics.checkNotNullParameter(secretId, "secretId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(type, "type");
        this.registerPath = registerPath;
        this.secretId = secretId;
        this.source = source;
        this.algorithm = algorithm;
        this.secretKey = secretKey;
        this.type = type;
    }

    public /* synthetic */ MetaRegister(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
