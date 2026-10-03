package com.heytap.health.thirdservice.safeurl;

import androidx.annotation.Keep;
import com.heytap.health.network.core.BaseResponse;
import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.fkj;
import com.oplus.aiunit.vision.m1e;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\n\u000bJ1\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/heytap/health/thirdservice/safeurl/ThirdPartyApiService;", "", "", "", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/thirdservice/safeurl/ThirdPartyApiService$ConfigResult;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConfigResult", "SafeUrlConfig", "thirdservice_impl_release"}, k = 1, mv = {1, 8, 0})
public interface ThirdPartyApiService {

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/thirdservice/safeurl/ThirdPartyApiService$ConfigResult;", "", fkj.PARAM_SWITCH_STATUS, "", "config", "", "(ILjava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "getSwitchStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "thirdservice_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ConfigResult {

        @Nullable
        private final String config;
        private final int switchStatus;

        public ConfigResult(int i, @Nullable String str) {
            this.switchStatus = i;
            this.config = str;
        }

        public static /* synthetic */ ConfigResult copy$default(ConfigResult configResult, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = configResult.switchStatus;
            }
            if ((i2 & 2) != 0) {
                str = configResult.config;
            }
            return configResult.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSwitchStatus() {
            return this.switchStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConfig() {
            return this.config;
        }

        @NotNull
        public final ConfigResult copy(int switchStatus, @Nullable String config) {
            return new ConfigResult(switchStatus, config);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfigResult)) {
                return false;
            }
            ConfigResult configResult = (ConfigResult) other;
            return this.switchStatus == configResult.switchStatus && Intrinsics.areEqual(this.config, configResult.config);
        }

        @Nullable
        public final String getConfig() {
            return this.config;
        }

        public final int getSwitchStatus() {
            return this.switchStatus;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.switchStatus) * 31;
            String str = this.config;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "ConfigResult(switchStatus=" + this.switchStatus + ", config=" + this.config + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/thirdservice/safeurl/ThirdPartyApiService$SafeUrlConfig;", "", "whiteList", "", "", "(Ljava/util/List;)V", "getWhiteList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "thirdservice_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SafeUrlConfig {

        @Nullable
        private final List<String> whiteList;

        public SafeUrlConfig(@Nullable List<String> list) {
            this.whiteList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SafeUrlConfig copy$default(SafeUrlConfig safeUrlConfig, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = safeUrlConfig.whiteList;
            }
            return safeUrlConfig.copy(list);
        }

        @Nullable
        public final List<String> component1() {
            return this.whiteList;
        }

        @NotNull
        public final SafeUrlConfig copy(@Nullable List<String> whiteList) {
            return new SafeUrlConfig(whiteList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SafeUrlConfig) && Intrinsics.areEqual(this.whiteList, ((SafeUrlConfig) other).whiteList);
        }

        @Nullable
        public final List<String> getWhiteList() {
            return this.whiteList;
        }

        public int hashCode() {
            List<String> list = this.whiteList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "SafeUrlConfig(whiteList=" + this.whiteList + ")";
        }
    }

    @m1e("v1/c2s/switch/querySwitchStatus")
    @Nullable
    Object a(@av1 @NotNull Map<String, Integer> map, @NotNull Continuation<? super BaseResponse<ConfigResult>> continuation);
}
