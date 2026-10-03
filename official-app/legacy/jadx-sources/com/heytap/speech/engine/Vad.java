package com.heytap.speech.engine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\f¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/Vad;", "", "enable", "", "pausetime", "", "timeout", "visible", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPausetime", "()Ljava/lang/Integer;", "setPausetime", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTimeout", "setTimeout", "getVisible", "setVisible", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/heytap/speech/engine/Vad;", "equals", "other", "hashCode", "toString", "", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Vad {

    @Nullable
    private Boolean enable;

    @Nullable
    private Integer pausetime;

    @Nullable
    private Integer timeout;

    @Nullable
    private Boolean visible;

    public Vad() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Vad copy$default(Vad vad, Boolean bool, Integer num, Integer num2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = vad.enable;
        }
        if ((i & 2) != 0) {
            num = vad.pausetime;
        }
        if ((i & 4) != 0) {
            num2 = vad.timeout;
        }
        if ((i & 8) != 0) {
            bool2 = vad.visible;
        }
        return vad.copy(bool, num, num2, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPausetime() {
        return this.pausetime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @NotNull
    public final Vad copy(@Nullable Boolean enable, @Nullable Integer pausetime, @Nullable Integer timeout, @Nullable Boolean visible) {
        return new Vad(enable, pausetime, timeout, visible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vad)) {
            return false;
        }
        Vad vad = (Vad) other;
        return Intrinsics.areEqual(this.enable, vad.enable) && Intrinsics.areEqual(this.pausetime, vad.pausetime) && Intrinsics.areEqual(this.timeout, vad.timeout) && Intrinsics.areEqual(this.visible, vad.visible);
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Integer getPausetime() {
        return this.pausetime;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.pausetime;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeout;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.visible;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setEnable(@Nullable Boolean bool) {
        this.enable = bool;
    }

    public final void setPausetime(@Nullable Integer num) {
        this.pausetime = num;
    }

    public final void setTimeout(@Nullable Integer num) {
        this.timeout = num;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.visible = bool;
    }

    @NotNull
    public String toString() {
        return "Vad(enable=" + this.enable + ", pausetime=" + this.pausetime + ", timeout=" + this.timeout + ", visible=" + this.visible + ')';
    }

    public Vad(@Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool2) {
        this.enable = bool;
        this.pausetime = num;
        this.timeout = num2;
        this.visible = bool2;
    }

    public /* synthetic */ Vad(Boolean bool, Integer num, Integer num2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : bool2);
    }
}
