package com.heytap.speech.engine;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014¨\u0006/"}, d2 = {"Lcom/heytap/speech/engine/SpeechConfig;", "", "globalConfig", "Lcom/heytap/speech/engine/GlobalConfig;", "platform", "", Fields.PRODUCT_ID, "resTime", "", "ui", "Lcom/heytap/speech/engine/Ui;", "version", "(Lcom/heytap/speech/engine/GlobalConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/heytap/speech/engine/Ui;Ljava/lang/String;)V", "getGlobalConfig", "()Lcom/heytap/speech/engine/GlobalConfig;", "setGlobalConfig", "(Lcom/heytap/speech/engine/GlobalConfig;)V", "getPlatform", "()Ljava/lang/String;", "setPlatform", "(Ljava/lang/String;)V", "getProductId", "setProductId", "getResTime", "()Ljava/lang/Integer;", "setResTime", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUi", "()Lcom/heytap/speech/engine/Ui;", "setUi", "(Lcom/heytap/speech/engine/Ui;)V", "getVersion", "setVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/heytap/speech/engine/GlobalConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/heytap/speech/engine/Ui;Ljava/lang/String;)Lcom/heytap/speech/engine/SpeechConfig;", "equals", "", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SpeechConfig {

    @Nullable
    private GlobalConfig globalConfig;

    @Nullable
    private String platform;

    @Nullable
    private String productId;

    @Nullable
    private Integer resTime;

    @Nullable
    private Ui ui;

    @Nullable
    private String version;

    public SpeechConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SpeechConfig copy$default(SpeechConfig speechConfig, GlobalConfig globalConfig, String str, String str2, Integer num, Ui ui, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            globalConfig = speechConfig.globalConfig;
        }
        if ((i & 2) != 0) {
            str = speechConfig.platform;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = speechConfig.productId;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            num = speechConfig.resTime;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            ui = speechConfig.ui;
        }
        Ui ui2 = ui;
        if ((i & 32) != 0) {
            str3 = speechConfig.version;
        }
        return speechConfig.copy(globalConfig, str4, str5, num2, ui2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getResTime() {
        return this.resTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Ui getUi() {
        return this.ui;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final SpeechConfig copy(@Nullable GlobalConfig globalConfig, @Nullable String platform, @Nullable String productId, @Nullable Integer resTime, @Nullable Ui ui, @Nullable String version) {
        return new SpeechConfig(globalConfig, platform, productId, resTime, ui, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechConfig)) {
            return false;
        }
        SpeechConfig speechConfig = (SpeechConfig) other;
        return Intrinsics.areEqual(this.globalConfig, speechConfig.globalConfig) && Intrinsics.areEqual(this.platform, speechConfig.platform) && Intrinsics.areEqual(this.productId, speechConfig.productId) && Intrinsics.areEqual(this.resTime, speechConfig.resTime) && Intrinsics.areEqual(this.ui, speechConfig.ui) && Intrinsics.areEqual(this.version, speechConfig.version);
    }

    @Nullable
    public final GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final Integer getResTime() {
        return this.resTime;
    }

    @Nullable
    public final Ui getUi() {
        return this.ui;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        GlobalConfig globalConfig = this.globalConfig;
        int iHashCode = (globalConfig == null ? 0 : globalConfig.hashCode()) * 31;
        String str = this.platform;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.resTime;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Ui ui = this.ui;
        int iHashCode5 = (iHashCode4 + (ui == null ? 0 : ui.hashCode())) * 31;
        String str3 = this.version;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setGlobalConfig(@Nullable GlobalConfig globalConfig) {
        this.globalConfig = globalConfig;
    }

    public final void setPlatform(@Nullable String str) {
        this.platform = str;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setResTime(@Nullable Integer num) {
        this.resTime = num;
    }

    public final void setUi(@Nullable Ui ui) {
        this.ui = ui;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "SpeechConfig(globalConfig=" + this.globalConfig + ", platform=" + ((Object) this.platform) + ", productId=" + ((Object) this.productId) + ", resTime=" + this.resTime + ", ui=" + this.ui + ", version=" + ((Object) this.version) + ')';
    }

    public SpeechConfig(@Nullable GlobalConfig globalConfig, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Ui ui, @Nullable String str3) {
        this.globalConfig = globalConfig;
        this.platform = str;
        this.productId = str2;
        this.resTime = num;
        this.ui = ui;
        this.version = str3;
    }

    public /* synthetic */ SpeechConfig(GlobalConfig globalConfig, String str, String str2, Integer num, Ui ui, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : globalConfig, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : ui, (i & 32) != 0 ? null : str3);
    }
}
