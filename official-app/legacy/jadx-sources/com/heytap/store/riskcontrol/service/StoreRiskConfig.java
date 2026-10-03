package com.heytap.store.riskcontrol.service;

import com.oplus.aiunit.vision.jla;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B1\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/riskcontrol/service/StoreRiskConfig;", "", "builder", "Lcom/heytap/store/riskcontrol/service/StoreRiskConfig$Builder;", "(Lcom/heytap/store/riskcontrol/service/StoreRiskConfig$Builder;)V", "appId", "", "channel", "isNeedOfflineData", "", "optionConfig", "Lcom/heytap/store/riskcontrol/service/OptionConfig;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/heytap/store/riskcontrol/service/OptionConfig;)V", "getAppId", "()Ljava/lang/String;", "getChannel", "setChannel", "(Ljava/lang/String;)V", "()Z", "setNeedOfflineData", "(Z)V", "getOptionConfig", "()Lcom/heytap/store/riskcontrol/service/OptionConfig;", "setOptionConfig", "(Lcom/heytap/store/riskcontrol/service/OptionConfig;)V", "Builder", "riskcontrol-service_release"}, k = 1, mv = {1, 4, 2})
public final class StoreRiskConfig {

    @NotNull
    private final String appId;

    @Nullable
    private String channel;
    private boolean isNeedOfflineData;

    @Nullable
    private OptionConfig optionConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000bJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\"\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/riskcontrol/service/StoreRiskConfig$Builder;", "", "appId", "", "(Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "<set-?>", "channel", "getChannel", "", "isNeedOffLineData", "()Z", "Lcom/heytap/store/riskcontrol/service/OptionConfig;", "optionConfig", "getOptionConfig", "()Lcom/heytap/store/riskcontrol/service/OptionConfig;", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/store/riskcontrol/service/StoreRiskConfig;", "isNeedOfflineData", "isNeed", "setChannel", "inputChannel", "setOptionConfig", "inputOptionConfig", "riskcontrol-service_release"}, k = 1, mv = {1, 4, 2})
    public static final class Builder {

        @NotNull
        private String appId;

        @Nullable
        private String channel;
        private boolean isNeedOffLineData;

        @Nullable
        private OptionConfig optionConfig;

        public Builder(@NotNull String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.appId = appId;
        }

        @NotNull
        public final StoreRiskConfig build() {
            return new StoreRiskConfig(this, null);
        }

        @NotNull
        public final String getAppId() {
            return this.appId;
        }

        @Nullable
        public final String getChannel() {
            return this.channel;
        }

        @Nullable
        public final OptionConfig getOptionConfig() {
            return this.optionConfig;
        }

        /* JADX INFO: renamed from: isNeedOffLineData, reason: from getter */
        public final boolean getIsNeedOffLineData() {
            return this.isNeedOffLineData;
        }

        @NotNull
        public final Builder isNeedOfflineData(boolean isNeed) {
            this.isNeedOffLineData = isNeed;
            return this;
        }

        public final void setAppId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.appId = str;
        }

        @NotNull
        public final Builder setChannel(@Nullable String inputChannel) {
            this.channel = inputChannel;
            return this;
        }

        @NotNull
        public final Builder setOptionConfig(@Nullable OptionConfig inputOptionConfig) {
            this.optionConfig = inputOptionConfig;
            return this;
        }
    }

    public /* synthetic */ StoreRiskConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final OptionConfig getOptionConfig() {
        return this.optionConfig;
    }

    /* JADX INFO: renamed from: isNeedOfflineData, reason: from getter */
    public final boolean getIsNeedOfflineData() {
        return this.isNeedOfflineData;
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setNeedOfflineData(boolean z) {
        this.isNeedOfflineData = z;
    }

    public final void setOptionConfig(@Nullable OptionConfig optionConfig) {
        this.optionConfig = optionConfig;
    }

    private StoreRiskConfig(String str, String str2, boolean z, OptionConfig optionConfig) {
        this.appId = str;
        this.channel = str2;
        this.isNeedOfflineData = z;
        this.optionConfig = optionConfig;
    }

    public /* synthetic */ StoreRiskConfig(String str, String str2, boolean z, OptionConfig optionConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : optionConfig);
    }

    private StoreRiskConfig(Builder builder) {
        this(builder.getAppId(), builder.getChannel(), builder.getIsNeedOffLineData(), builder.getOptionConfig());
    }
}
