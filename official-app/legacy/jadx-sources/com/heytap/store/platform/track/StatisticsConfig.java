package com.heytap.store.platform.track;

import com.oplus.aiunit.vision.jla;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\rB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/platform/track/StatisticsConfig;", "", "saStatisticsConfig", "Lcom/heytap/store/platform/track/SAStatisticsConfig;", "oBusStaticsConfig", "Lcom/heytap/store/platform/track/OBusStaticsConfig;", "(Lcom/heytap/store/platform/track/SAStatisticsConfig;Lcom/heytap/store/platform/track/OBusStaticsConfig;)V", "getOBusStaticsConfig", "()Lcom/heytap/store/platform/track/OBusStaticsConfig;", "setOBusStaticsConfig", "(Lcom/heytap/store/platform/track/OBusStaticsConfig;)V", "getSaStatisticsConfig", "()Lcom/heytap/store/platform/track/SAStatisticsConfig;", "Builder", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StatisticsConfig {

    @Nullable
    private OBusStaticsConfig oBusStaticsConfig;

    @Nullable
    private final SAStatisticsConfig saStatisticsConfig;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/track/StatisticsConfig$Builder;", "", "()V", "oBusStaticsConfig", "Lcom/heytap/store/platform/track/OBusStaticsConfig;", "saStatisticsConfig", "Lcom/heytap/store/platform/track/SAStatisticsConfig;", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/store/platform/track/StatisticsConfig;", "setOBusStaticsConfig", "setSAStatisticsConfig", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private OBusStaticsConfig oBusStaticsConfig;

        @Nullable
        private SAStatisticsConfig saStatisticsConfig;

        public static /* synthetic */ Builder setOBusStaticsConfig$default(Builder builder, OBusStaticsConfig oBusStaticsConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                oBusStaticsConfig = null;
            }
            return builder.setOBusStaticsConfig(oBusStaticsConfig);
        }

        public static /* synthetic */ Builder setSAStatisticsConfig$default(Builder builder, SAStatisticsConfig sAStatisticsConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                sAStatisticsConfig = null;
            }
            return builder.setSAStatisticsConfig(sAStatisticsConfig);
        }

        @NotNull
        public final StatisticsConfig build() {
            return new StatisticsConfig(this.saStatisticsConfig, this.oBusStaticsConfig);
        }

        @NotNull
        public final Builder setOBusStaticsConfig(@Nullable OBusStaticsConfig oBusStaticsConfig) {
            this.oBusStaticsConfig = oBusStaticsConfig;
            return this;
        }

        @NotNull
        public final Builder setSAStatisticsConfig(@Nullable SAStatisticsConfig saStatisticsConfig) {
            this.saStatisticsConfig = saStatisticsConfig;
            return this;
        }
    }

    public StatisticsConfig(@Nullable SAStatisticsConfig sAStatisticsConfig, @Nullable OBusStaticsConfig oBusStaticsConfig) {
        this.saStatisticsConfig = sAStatisticsConfig;
        this.oBusStaticsConfig = oBusStaticsConfig;
    }

    @Nullable
    public final OBusStaticsConfig getOBusStaticsConfig() {
        return this.oBusStaticsConfig;
    }

    @Nullable
    public final SAStatisticsConfig getSaStatisticsConfig() {
        return this.saStatisticsConfig;
    }

    public final void setOBusStaticsConfig(@Nullable OBusStaticsConfig oBusStaticsConfig) {
        this.oBusStaticsConfig = oBusStaticsConfig;
    }
}
