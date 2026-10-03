package com.heytap.speech.engine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/Far;", "", "enable", "", "module", "Lcom/heytap/speech/engine/Module;", "wakeup", "Lcom/heytap/speech/engine/Wakeup;", "(Ljava/lang/Boolean;Lcom/heytap/speech/engine/Module;Lcom/heytap/speech/engine/Wakeup;)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getModule", "()Lcom/heytap/speech/engine/Module;", "setModule", "(Lcom/heytap/speech/engine/Module;)V", "getWakeup", "()Lcom/heytap/speech/engine/Wakeup;", "setWakeup", "(Lcom/heytap/speech/engine/Wakeup;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lcom/heytap/speech/engine/Module;Lcom/heytap/speech/engine/Wakeup;)Lcom/heytap/speech/engine/Far;", "equals", "other", "hashCode", "", "toString", "", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Far {

    @Nullable
    private Boolean enable;

    @Nullable
    private Module module;

    @Nullable
    private Wakeup wakeup;

    public Far() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Far copy$default(Far far, Boolean bool, Module module, Wakeup wakeup, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = far.enable;
        }
        if ((i & 2) != 0) {
            module = far.module;
        }
        if ((i & 4) != 0) {
            wakeup = far.wakeup;
        }
        return far.copy(bool, module, wakeup);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Module getModule() {
        return this.module;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    @NotNull
    public final Far copy(@Nullable Boolean enable, @Nullable Module module, @Nullable Wakeup wakeup) {
        return new Far(enable, module, wakeup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Far)) {
            return false;
        }
        Far far = (Far) other;
        return Intrinsics.areEqual(this.enable, far.enable) && Intrinsics.areEqual(this.module, far.module) && Intrinsics.areEqual(this.wakeup, far.wakeup);
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Module getModule() {
        return this.module;
    }

    @Nullable
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Module module = this.module;
        int iHashCode2 = (iHashCode + (module == null ? 0 : module.hashCode())) * 31;
        Wakeup wakeup = this.wakeup;
        return iHashCode2 + (wakeup != null ? wakeup.hashCode() : 0);
    }

    public final void setEnable(@Nullable Boolean bool) {
        this.enable = bool;
    }

    public final void setModule(@Nullable Module module) {
        this.module = module;
    }

    public final void setWakeup(@Nullable Wakeup wakeup) {
        this.wakeup = wakeup;
    }

    @NotNull
    public String toString() {
        return "Far(enable=" + this.enable + ", module=" + this.module + ", wakeup=" + this.wakeup + ')';
    }

    public Far(@Nullable Boolean bool, @Nullable Module module, @Nullable Wakeup wakeup) {
        this.enable = bool;
        this.module = module;
        this.wakeup = wakeup;
    }

    public /* synthetic */ Far(Boolean bool, Module module, Wakeup wakeup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : module, (i & 4) != 0 ? null : wakeup);
    }
}
