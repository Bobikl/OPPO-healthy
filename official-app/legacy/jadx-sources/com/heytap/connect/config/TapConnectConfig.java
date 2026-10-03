package com.heytap.connect.config;

import com.heytap.connect.api.IKv;
import com.heytap.connect.api.message.MessageCipher;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010%\u001a\u00020\u001e¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JH\u0010&\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010%\u001a\u00020\u001eHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010\u0013J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u0010#\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00101\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00100R\u001b\u0010$\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u00106\u001a\u0004\b7\u0010\u001dR\u0019\u0010%\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b9\u0010 R$\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00101\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u00104R\u0018\u0010<\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00100¨\u0006?"}, d2 = {"Lcom/heytap/connect/config/TapConnectConfig;", "", "Lcom/heytap/connect/api/message/MessageCipher;", "component1", "()Lcom/heytap/connect/api/message/MessageCipher;", "", "hasUser", "()Z", "hasAesKey", "hasApiKey", "hasApiSecret", f04.JSON_KEY_RKE_IS_ENCRYPT, "", "getAesKey", "(Z)Ljava/lang/String;", "getApiKey", "getApiSecret", "", "getConnectRetryCount", "()I", "str", "encryptStr", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/heytap/connect/config/CommonConfig;", "component2", "()Lcom/heytap/connect/config/CommonConfig;", "component3", "Lcom/heytap/connect/config/MetaConfig;", "component4", "()Lcom/heytap/connect/config/MetaConfig;", "Lcom/heytap/connect/api/IKv;", "component5", "()Lcom/heytap/connect/api/IKv;", "cipher", "tcpConfig", "quicConfig", ConnectIdLogic.PARAM_META, "kvConfig", "copy", "(Lcom/heytap/connect/api/message/MessageCipher;Lcom/heytap/connect/config/CommonConfig;Lcom/heytap/connect/config/CommonConfig;Lcom/heytap/connect/config/MetaConfig;Lcom/heytap/connect/api/IKv;)Lcom/heytap/connect/config/TapConnectConfig;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/heytap/connect/api/message/MessageCipher;", "apiKey", "Ljava/lang/String;", "Lcom/heytap/connect/config/CommonConfig;", "getQuicConfig", "setQuicConfig", "(Lcom/heytap/connect/config/CommonConfig;)V", "apiSecret", "Lcom/heytap/connect/config/MetaConfig;", "getMeta", "Lcom/heytap/connect/api/IKv;", "getKvConfig", "getTcpConfig", "setTcpConfig", "aesKey", "<init>", "(Lcom/heytap/connect/api/message/MessageCipher;Lcom/heytap/connect/config/CommonConfig;Lcom/heytap/connect/config/CommonConfig;Lcom/heytap/connect/config/MetaConfig;Lcom/heytap/connect/api/IKv;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TapConnectConfig {

    @Nullable
    private final String aesKey;

    @Nullable
    private final String apiKey;

    @Nullable
    private final String apiSecret;

    @NotNull
    private final MessageCipher cipher;

    @NotNull
    private final IKv kvConfig;

    @Nullable
    private final MetaConfig meta;

    @Nullable
    private CommonConfig quicConfig;

    @Nullable
    private CommonConfig tcpConfig;

    @JvmOverloads
    public TapConnectConfig() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final MessageCipher getCipher() {
        return this.cipher;
    }

    public static /* synthetic */ TapConnectConfig copy$default(TapConnectConfig tapConnectConfig, MessageCipher messageCipher, CommonConfig commonConfig, CommonConfig commonConfig2, MetaConfig metaConfig, IKv iKv, int i, Object obj) {
        if ((i & 1) != 0) {
            messageCipher = tapConnectConfig.cipher;
        }
        if ((i & 2) != 0) {
            commonConfig = tapConnectConfig.tcpConfig;
        }
        CommonConfig commonConfig3 = commonConfig;
        if ((i & 4) != 0) {
            commonConfig2 = tapConnectConfig.quicConfig;
        }
        CommonConfig commonConfig4 = commonConfig2;
        if ((i & 8) != 0) {
            metaConfig = tapConnectConfig.meta;
        }
        MetaConfig metaConfig2 = metaConfig;
        if ((i & 16) != 0) {
            iKv = tapConnectConfig.kvConfig;
        }
        return tapConnectConfig.copy(messageCipher, commonConfig3, commonConfig4, metaConfig2, iKv);
    }

    public static /* synthetic */ String getAesKey$default(TapConnectConfig tapConnectConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return tapConnectConfig.getAesKey(z);
    }

    public static /* synthetic */ String getApiKey$default(TapConnectConfig tapConnectConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return tapConnectConfig.getApiKey(z);
    }

    public static /* synthetic */ String getApiSecret$default(TapConnectConfig tapConnectConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return tapConnectConfig.getApiSecret(z);
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CommonConfig getTcpConfig() {
        return this.tcpConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CommonConfig getQuicConfig() {
        return this.quicConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MetaConfig getMeta() {
        return this.meta;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final IKv getKvConfig() {
        return this.kvConfig;
    }

    @NotNull
    public final TapConnectConfig copy(@NotNull MessageCipher cipher, @Nullable CommonConfig tcpConfig, @Nullable CommonConfig quicConfig, @Nullable MetaConfig meta, @NotNull IKv kvConfig) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(kvConfig, "kvConfig");
        return new TapConnectConfig(cipher, tcpConfig, quicConfig, meta, kvConfig);
    }

    @NotNull
    public final String encryptStr(@Nullable String str) {
        MessageCipher messageCipher = this.cipher;
        if (str == null) {
            str = "";
        }
        return (String) messageCipher.encrypt(str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapConnectConfig)) {
            return false;
        }
        TapConnectConfig tapConnectConfig = (TapConnectConfig) other;
        return Intrinsics.areEqual(this.cipher, tapConnectConfig.cipher) && Intrinsics.areEqual(this.tcpConfig, tapConnectConfig.tcpConfig) && Intrinsics.areEqual(this.quicConfig, tapConnectConfig.quicConfig) && Intrinsics.areEqual(this.meta, tapConnectConfig.meta) && Intrinsics.areEqual(this.kvConfig, tapConnectConfig.kvConfig);
    }

    @NotNull
    public final String getAesKey(boolean encrypt) {
        return (encrypt ? this.cipher : MessageCipher.INSTANCE.getDEFAULT()).keys().getFirst();
    }

    @NotNull
    public final String getApiKey(boolean encrypt) {
        return (encrypt ? this.cipher : MessageCipher.INSTANCE.getDEFAULT()).keys().getSecond();
    }

    @NotNull
    public final String getApiSecret(boolean encrypt) {
        return (encrypt ? this.cipher : MessageCipher.INSTANCE.getDEFAULT()).keys().getThird();
    }

    public final int getConnectRetryCount() {
        return 5;
    }

    @NotNull
    public final IKv getKvConfig() {
        return this.kvConfig;
    }

    @Nullable
    public final MetaConfig getMeta() {
        return this.meta;
    }

    @Nullable
    public final CommonConfig getQuicConfig() {
        return this.quicConfig;
    }

    @Nullable
    public final CommonConfig getTcpConfig() {
        return this.tcpConfig;
    }

    public final boolean hasAesKey() {
        String str = this.aesKey;
        return !(str == null || str.length() == 0);
    }

    public final boolean hasApiKey() {
        String str = this.apiKey;
        return !(str == null || str.length() == 0);
    }

    public final boolean hasApiSecret() {
        String str = this.apiSecret;
        return !(str == null || str.length() == 0);
    }

    public final boolean hasUser() {
        return true;
    }

    public int hashCode() {
        int iHashCode = this.cipher.hashCode() * 31;
        CommonConfig commonConfig = this.tcpConfig;
        int iHashCode2 = (iHashCode + (commonConfig == null ? 0 : commonConfig.hashCode())) * 31;
        CommonConfig commonConfig2 = this.quicConfig;
        int iHashCode3 = (iHashCode2 + (commonConfig2 == null ? 0 : commonConfig2.hashCode())) * 31;
        MetaConfig metaConfig = this.meta;
        return ((iHashCode3 + (metaConfig != null ? metaConfig.hashCode() : 0)) * 31) + this.kvConfig.hashCode();
    }

    public final void setQuicConfig(@Nullable CommonConfig commonConfig) {
        this.quicConfig = commonConfig;
    }

    public final void setTcpConfig(@Nullable CommonConfig commonConfig) {
        this.tcpConfig = commonConfig;
    }

    @NotNull
    public String toString() {
        return "TapConnectConfig(cipher=" + this.cipher + ", tcpConfig=" + this.tcpConfig + ", quicConfig=" + this.quicConfig + ", meta=" + this.meta + ", kvConfig=" + this.kvConfig + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TapConnectConfig(@NotNull MessageCipher cipher) {
        this(cipher, null, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(cipher, "cipher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TapConnectConfig(@NotNull MessageCipher cipher, @Nullable CommonConfig commonConfig) {
        this(cipher, commonConfig, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(cipher, "cipher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TapConnectConfig(@NotNull MessageCipher cipher, @Nullable CommonConfig commonConfig, @Nullable CommonConfig commonConfig2) {
        this(cipher, commonConfig, commonConfig2, null, null, 24, null);
        Intrinsics.checkNotNullParameter(cipher, "cipher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TapConnectConfig(@NotNull MessageCipher cipher, @Nullable CommonConfig commonConfig, @Nullable CommonConfig commonConfig2, @Nullable MetaConfig metaConfig) {
        this(cipher, commonConfig, commonConfig2, metaConfig, null, 16, null);
        Intrinsics.checkNotNullParameter(cipher, "cipher");
    }

    @JvmOverloads
    public TapConnectConfig(@NotNull MessageCipher cipher, @Nullable CommonConfig commonConfig, @Nullable CommonConfig commonConfig2, @Nullable MetaConfig metaConfig, @NotNull IKv kvConfig) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(kvConfig, "kvConfig");
        this.cipher = cipher;
        this.tcpConfig = commonConfig;
        this.quicConfig = commonConfig2;
        this.meta = metaConfig;
        this.kvConfig = kvConfig;
        this.aesKey = cipher.keys().getFirst();
        this.apiKey = cipher.keys().getSecond();
        this.apiSecret = cipher.keys().getThird();
    }

    public /* synthetic */ TapConnectConfig(MessageCipher messageCipher, CommonConfig commonConfig, CommonConfig commonConfig2, MetaConfig metaConfig, IKv iKv, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MessageCipher.INSTANCE.getDEFAULT() : messageCipher, (i & 2) != 0 ? null : commonConfig, (i & 4) != 0 ? null : commonConfig2, (i & 8) == 0 ? metaConfig : null, (i & 16) != 0 ? IKv.INSTANCE.getDEFAULT() : iKv);
    }
}
