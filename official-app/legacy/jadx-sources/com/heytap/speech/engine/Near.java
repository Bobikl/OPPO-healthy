package com.heytap.speech.engine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/Near;", "", "enable", "", "module", "Lcom/heytap/speech/engine/Module;", "wakeup", "Lcom/heytap/speech/engine/Wakeup;", "(ZLcom/heytap/speech/engine/Module;Lcom/heytap/speech/engine/Wakeup;)V", "getEnable", "()Z", "setEnable", "(Z)V", "getModule", "()Lcom/heytap/speech/engine/Module;", "setModule", "(Lcom/heytap/speech/engine/Module;)V", "getWakeup", "()Lcom/heytap/speech/engine/Wakeup;", "setWakeup", "(Lcom/heytap/speech/engine/Wakeup;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Near {
    private boolean enable;

    @Nullable
    private Module module;

    @Nullable
    private Wakeup wakeup;

    public Near() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ Near copy$default(Near near, boolean z, Module module, Wakeup wakeup, int i, Object obj) {
        if ((i & 1) != 0) {
            z = near.enable;
        }
        if ((i & 2) != 0) {
            module = near.module;
        }
        if ((i & 4) != 0) {
            wakeup = near.wakeup;
        }
        return near.copy(z, module, wakeup);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
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
    public final Near copy(boolean enable, @Nullable Module module, @Nullable Wakeup wakeup) {
        return new Near(enable, module, wakeup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Near)) {
            return false;
        }
        Near near = (Near) other;
        return this.enable == near.enable && Intrinsics.areEqual(this.module, near.module) && Intrinsics.areEqual(this.wakeup, near.wakeup);
    }

    public final boolean getEnable() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Module module = this.module;
        int iHashCode = (i + (module == null ? 0 : module.hashCode())) * 31;
        Wakeup wakeup = this.wakeup;
        return iHashCode + (wakeup != null ? wakeup.hashCode() : 0);
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setModule(@Nullable Module module) {
        this.module = module;
    }

    public final void setWakeup(@Nullable Wakeup wakeup) {
        this.wakeup = wakeup;
    }

    @NotNull
    public String toString() {
        return "Near(enable=" + this.enable + ", module=" + this.module + ", wakeup=" + this.wakeup + ')';
    }

    public Near(boolean z, @Nullable Module module, @Nullable Wakeup wakeup) {
        this.enable = z;
        this.module = module;
        this.wakeup = wakeup;
    }

    public /* synthetic */ Near(boolean z, Module module, Wakeup wakeup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : module, (i & 4) != 0 ? null : wakeup);
    }
}
