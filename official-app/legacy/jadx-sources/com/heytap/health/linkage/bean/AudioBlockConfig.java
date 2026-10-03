package com.heytap.health.linkage.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/linkage/bean/AudioBlockConfig;", "", "configVersion", "", "blockedAudioNames", "", "", "rules", "Lcom/heytap/health/linkage/bean/AudioBlockRule;", "(ILjava/util/List;Ljava/util/List;)V", "getBlockedAudioNames", "()Ljava/util/List;", "getConfigVersion", "()I", "getRules", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "linkage_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AudioBlockConfig {
    public static final int $stable = 8;

    @NotNull
    private final List<String> blockedAudioNames;
    private final int configVersion;

    @NotNull
    private final List<AudioBlockRule> rules;

    public AudioBlockConfig() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioBlockConfig copy$default(AudioBlockConfig audioBlockConfig, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = audioBlockConfig.configVersion;
        }
        if ((i2 & 2) != 0) {
            list = audioBlockConfig.blockedAudioNames;
        }
        if ((i2 & 4) != 0) {
            list2 = audioBlockConfig.rules;
        }
        return audioBlockConfig.copy(i, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConfigVersion() {
        return this.configVersion;
    }

    @NotNull
    public final List<String> component2() {
        return this.blockedAudioNames;
    }

    @NotNull
    public final List<AudioBlockRule> component3() {
        return this.rules;
    }

    @NotNull
    public final AudioBlockConfig copy(int configVersion, @NotNull List<String> blockedAudioNames, @NotNull List<AudioBlockRule> rules) {
        Intrinsics.checkNotNullParameter(blockedAudioNames, "blockedAudioNames");
        Intrinsics.checkNotNullParameter(rules, "rules");
        return new AudioBlockConfig(configVersion, blockedAudioNames, rules);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioBlockConfig)) {
            return false;
        }
        AudioBlockConfig audioBlockConfig = (AudioBlockConfig) other;
        return this.configVersion == audioBlockConfig.configVersion && Intrinsics.areEqual(this.blockedAudioNames, audioBlockConfig.blockedAudioNames) && Intrinsics.areEqual(this.rules, audioBlockConfig.rules);
    }

    @NotNull
    public final List<String> getBlockedAudioNames() {
        return this.blockedAudioNames;
    }

    public final int getConfigVersion() {
        return this.configVersion;
    }

    @NotNull
    public final List<AudioBlockRule> getRules() {
        return this.rules;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.configVersion) * 31) + this.blockedAudioNames.hashCode()) * 31) + this.rules.hashCode();
    }

    @NotNull
    public String toString() {
        return "AudioBlockConfig(configVersion=" + this.configVersion + ", blockedAudioNames=" + this.blockedAudioNames + ", rules=" + this.rules + ")";
    }

    public AudioBlockConfig(int i, @NotNull List<String> blockedAudioNames, @NotNull List<AudioBlockRule> rules) {
        Intrinsics.checkNotNullParameter(blockedAudioNames, "blockedAudioNames");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.configVersion = i;
        this.blockedAudioNames = blockedAudioNames;
        this.rules = rules;
    }

    public /* synthetic */ AudioBlockConfig(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
