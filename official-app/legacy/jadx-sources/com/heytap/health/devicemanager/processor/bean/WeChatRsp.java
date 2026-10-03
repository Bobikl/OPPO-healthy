package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.d9f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/WeChatRsp;", "", "version", "", d9f.PRIVATE_KEY, "", "pubKey", "(JLjava/lang/String;Ljava/lang/String;)V", "getPrivateKey", "()Ljava/lang/String;", "getPubKey", "getVersion", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeChatRsp {

    @NotNull
    private final String privateKey;

    @NotNull
    private final String pubKey;
    private final long version;

    public WeChatRsp(long j2, @NotNull String privateKey, @NotNull String pubKey) {
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        this.version = j2;
        this.privateKey = privateKey;
        this.pubKey = pubKey;
    }

    public static /* synthetic */ WeChatRsp copy$default(WeChatRsp weChatRsp, long j2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = weChatRsp.version;
        }
        if ((i & 2) != 0) {
            str = weChatRsp.privateKey;
        }
        if ((i & 4) != 0) {
            str2 = weChatRsp.pubKey;
        }
        return weChatRsp.copy(j2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPubKey() {
        return this.pubKey;
    }

    @NotNull
    public final WeChatRsp copy(long version, @NotNull String privateKey, @NotNull String pubKey) {
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        return new WeChatRsp(version, privateKey, pubKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeChatRsp)) {
            return false;
        }
        WeChatRsp weChatRsp = (WeChatRsp) other;
        return this.version == weChatRsp.version && Intrinsics.areEqual(this.privateKey, weChatRsp.privateKey) && Intrinsics.areEqual(this.pubKey, weChatRsp.pubKey);
    }

    @NotNull
    public final String getPrivateKey() {
        return this.privateKey;
    }

    @NotNull
    public final String getPubKey() {
        return this.pubKey;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((Long.hashCode(this.version) * 31) + this.privateKey.hashCode()) * 31) + this.pubKey.hashCode();
    }

    @NotNull
    public String toString() {
        return "WeChatRsp(version=" + this.version + ", privateKey=" + this.privateKey + ", pubKey=" + this.pubKey + ")";
    }
}
