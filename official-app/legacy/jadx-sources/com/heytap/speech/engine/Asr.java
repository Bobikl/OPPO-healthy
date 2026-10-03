package com.heytap.speech.engine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/Asr;", "", "cloud", "Lcom/heytap/speech/engine/Cloud;", "enable", "", "local", "Lcom/heytap/speech/engine/Local;", "visible", "(Lcom/heytap/speech/engine/Cloud;Ljava/lang/Boolean;Lcom/heytap/speech/engine/Local;Ljava/lang/Boolean;)V", "getCloud", "()Lcom/heytap/speech/engine/Cloud;", "setCloud", "(Lcom/heytap/speech/engine/Cloud;)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLocal", "()Lcom/heytap/speech/engine/Local;", "setLocal", "(Lcom/heytap/speech/engine/Local;)V", "getVisible", "setVisible", "component1", "component2", "component3", "component4", "copy", "(Lcom/heytap/speech/engine/Cloud;Ljava/lang/Boolean;Lcom/heytap/speech/engine/Local;Ljava/lang/Boolean;)Lcom/heytap/speech/engine/Asr;", "equals", "other", "hashCode", "", "toString", "", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Asr {

    @Nullable
    private Cloud cloud;

    @Nullable
    private Boolean enable;

    @Nullable
    private Local local;

    @Nullable
    private Boolean visible;

    public Asr() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Asr copy$default(Asr asr, Cloud cloud, Boolean bool, Local local, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            cloud = asr.cloud;
        }
        if ((i & 2) != 0) {
            bool = asr.enable;
        }
        if ((i & 4) != 0) {
            local = asr.local;
        }
        if ((i & 8) != 0) {
            bool2 = asr.visible;
        }
        return asr.copy(cloud, bool, local, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Cloud getCloud() {
        return this.cloud;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Local getLocal() {
        return this.local;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @NotNull
    public final Asr copy(@Nullable Cloud cloud, @Nullable Boolean enable, @Nullable Local local, @Nullable Boolean visible) {
        return new Asr(cloud, enable, local, visible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Asr)) {
            return false;
        }
        Asr asr = (Asr) other;
        return Intrinsics.areEqual(this.cloud, asr.cloud) && Intrinsics.areEqual(this.enable, asr.enable) && Intrinsics.areEqual(this.local, asr.local) && Intrinsics.areEqual(this.visible, asr.visible);
    }

    @Nullable
    public final Cloud getCloud() {
        return this.cloud;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Local getLocal() {
        return this.local;
    }

    @Nullable
    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Cloud cloud = this.cloud;
        int iHashCode = (cloud == null ? 0 : cloud.hashCode()) * 31;
        Boolean bool = this.enable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Local local = this.local;
        int iHashCode3 = (iHashCode2 + (local == null ? 0 : local.hashCode())) * 31;
        Boolean bool2 = this.visible;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setCloud(@Nullable Cloud cloud) {
        this.cloud = cloud;
    }

    public final void setEnable(@Nullable Boolean bool) {
        this.enable = bool;
    }

    public final void setLocal(@Nullable Local local) {
        this.local = local;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.visible = bool;
    }

    @NotNull
    public String toString() {
        return "Asr(cloud=" + this.cloud + ", enable=" + this.enable + ", local=" + this.local + ", visible=" + this.visible + ')';
    }

    public Asr(@Nullable Cloud cloud, @Nullable Boolean bool, @Nullable Local local, @Nullable Boolean bool2) {
        this.cloud = cloud;
        this.enable = bool;
        this.local = local;
        this.visible = bool2;
    }

    public /* synthetic */ Asr(Cloud cloud, Boolean bool, Local local, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cloud, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : local, (i & 8) != 0 ? null : bool2);
    }
}
