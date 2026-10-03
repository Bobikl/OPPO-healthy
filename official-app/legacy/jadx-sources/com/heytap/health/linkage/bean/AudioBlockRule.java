package com.heytap.health.linkage.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.store.base.core.http.HttpConst;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001c\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B7\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006%"}, d2 = {"Lcom/heytap/health/linkage/bean/AudioBlockRule;", "", "", "watchModel", "", "matchModel", "", HttpConst.OTA_VERSION, "matchOtaVersion", "", "component1", "component2", "component3", "component4", "deviceModels", "deviceModel", "deviceOtaVersion", "blockType", "copy", "toString", "hashCode", "other", "equals", "Ljava/util/List;", "getDeviceModels", "()Ljava/util/List;", "Ljava/lang/String;", "getDeviceModel", "()Ljava/lang/String;", "I", "getDeviceOtaVersion", "()I", "getBlockType", "<init>", "(Ljava/util/List;Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "linkage_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AudioBlockRule {

    @NotNull
    public static final String BLOCK_TYPE_ALL = "ALL";

    @NotNull
    public static final String BLOCK_TYPE_NONE = "NONE";

    @NotNull
    private final String blockType;

    @NotNull
    private final String deviceModel;

    @Nullable
    private final List<String> deviceModels;
    private final int deviceOtaVersion;
    public static final int $stable = 8;

    public AudioBlockRule() {
        this(null, null, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioBlockRule copy$default(AudioBlockRule audioBlockRule, List list, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = audioBlockRule.deviceModels;
        }
        if ((i2 & 2) != 0) {
            str = audioBlockRule.deviceModel;
        }
        if ((i2 & 4) != 0) {
            i = audioBlockRule.deviceOtaVersion;
        }
        if ((i2 & 8) != 0) {
            str2 = audioBlockRule.blockType;
        }
        return audioBlockRule.copy(list, str, i, str2);
    }

    @Nullable
    public final List<String> component1() {
        return this.deviceModels;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceOtaVersion() {
        return this.deviceOtaVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBlockType() {
        return this.blockType;
    }

    @NotNull
    public final AudioBlockRule copy(@Nullable List<String> deviceModels, @NotNull String deviceModel, int deviceOtaVersion, @NotNull String blockType) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(blockType, "blockType");
        return new AudioBlockRule(deviceModels, deviceModel, deviceOtaVersion, blockType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioBlockRule)) {
            return false;
        }
        AudioBlockRule audioBlockRule = (AudioBlockRule) other;
        return Intrinsics.areEqual(this.deviceModels, audioBlockRule.deviceModels) && Intrinsics.areEqual(this.deviceModel, audioBlockRule.deviceModel) && this.deviceOtaVersion == audioBlockRule.deviceOtaVersion && Intrinsics.areEqual(this.blockType, audioBlockRule.blockType);
    }

    @NotNull
    public final String getBlockType() {
        return this.blockType;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final List<String> getDeviceModels() {
        return this.deviceModels;
    }

    public final int getDeviceOtaVersion() {
        return this.deviceOtaVersion;
    }

    public int hashCode() {
        List<String> list = this.deviceModels;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + Integer.hashCode(this.deviceOtaVersion)) * 31) + this.blockType.hashCode();
    }

    public final boolean matchModel(@NotNull String watchModel) {
        Intrinsics.checkNotNullParameter(watchModel, "watchModel");
        List<String> list = this.deviceModels;
        if (list != null) {
            return (list.isEmpty() ^ true) && this.deviceModels.contains(watchModel);
        }
        return (this.deviceModel.length() == 0) || Intrinsics.areEqual(this.deviceModel, watchModel);
    }

    public final boolean matchOtaVersion(int otaVersion) {
        return otaVersion >= this.deviceOtaVersion;
    }

    @NotNull
    public String toString() {
        return "AudioBlockRule(deviceModels=" + this.deviceModels + ", deviceModel=" + this.deviceModel + ", deviceOtaVersion=" + this.deviceOtaVersion + ", blockType=" + this.blockType + ")";
    }

    public AudioBlockRule(@Nullable List<String> list, @NotNull String deviceModel, int i, @NotNull String blockType) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(blockType, "blockType");
        this.deviceModels = list;
        this.deviceModel = deviceModel;
        this.deviceOtaVersion = i;
        this.blockType = blockType;
    }

    public /* synthetic */ AudioBlockRule(List list, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2);
    }
}
