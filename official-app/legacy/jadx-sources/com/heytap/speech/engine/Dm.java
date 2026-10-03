package com.heytap.speech.engine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/heytap/speech/engine/Dm;", "", "enable", "", "errorHandle", "Lcom/heytap/speech/engine/ErrorHandle;", "globalExit", "Lcom/heytap/speech/engine/GlobalExit;", "oneShot", "Lcom/heytap/speech/engine/OneShot;", "(Ljava/lang/Boolean;Lcom/heytap/speech/engine/ErrorHandle;Lcom/heytap/speech/engine/GlobalExit;Lcom/heytap/speech/engine/OneShot;)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getErrorHandle", "()Lcom/heytap/speech/engine/ErrorHandle;", "setErrorHandle", "(Lcom/heytap/speech/engine/ErrorHandle;)V", "getGlobalExit", "()Lcom/heytap/speech/engine/GlobalExit;", "setGlobalExit", "(Lcom/heytap/speech/engine/GlobalExit;)V", "getOneShot", "()Lcom/heytap/speech/engine/OneShot;", "setOneShot", "(Lcom/heytap/speech/engine/OneShot;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Lcom/heytap/speech/engine/ErrorHandle;Lcom/heytap/speech/engine/GlobalExit;Lcom/heytap/speech/engine/OneShot;)Lcom/heytap/speech/engine/Dm;", "equals", "other", "hashCode", "", "toString", "", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Dm {

    @Nullable
    private Boolean enable;

    @Nullable
    private ErrorHandle errorHandle;

    @Nullable
    private GlobalExit globalExit;

    @Nullable
    private OneShot oneShot;

    public Dm() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Dm copy$default(Dm dm, Boolean bool, ErrorHandle errorHandle, GlobalExit globalExit, OneShot oneShot, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = dm.enable;
        }
        if ((i & 2) != 0) {
            errorHandle = dm.errorHandle;
        }
        if ((i & 4) != 0) {
            globalExit = dm.globalExit;
        }
        if ((i & 8) != 0) {
            oneShot = dm.oneShot;
        }
        return dm.copy(bool, errorHandle, globalExit, oneShot);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ErrorHandle getErrorHandle() {
        return this.errorHandle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GlobalExit getGlobalExit() {
        return this.globalExit;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OneShot getOneShot() {
        return this.oneShot;
    }

    @NotNull
    public final Dm copy(@Nullable Boolean enable, @Nullable ErrorHandle errorHandle, @Nullable GlobalExit globalExit, @Nullable OneShot oneShot) {
        return new Dm(enable, errorHandle, globalExit, oneShot);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dm)) {
            return false;
        }
        Dm dm = (Dm) other;
        return Intrinsics.areEqual(this.enable, dm.enable) && Intrinsics.areEqual(this.errorHandle, dm.errorHandle) && Intrinsics.areEqual(this.globalExit, dm.globalExit) && Intrinsics.areEqual(this.oneShot, dm.oneShot);
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final ErrorHandle getErrorHandle() {
        return this.errorHandle;
    }

    @Nullable
    public final GlobalExit getGlobalExit() {
        return this.globalExit;
    }

    @Nullable
    public final OneShot getOneShot() {
        return this.oneShot;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ErrorHandle errorHandle = this.errorHandle;
        int iHashCode2 = (iHashCode + (errorHandle == null ? 0 : errorHandle.hashCode())) * 31;
        GlobalExit globalExit = this.globalExit;
        int iHashCode3 = (iHashCode2 + (globalExit == null ? 0 : globalExit.hashCode())) * 31;
        OneShot oneShot = this.oneShot;
        return iHashCode3 + (oneShot != null ? oneShot.hashCode() : 0);
    }

    public final void setEnable(@Nullable Boolean bool) {
        this.enable = bool;
    }

    public final void setErrorHandle(@Nullable ErrorHandle errorHandle) {
        this.errorHandle = errorHandle;
    }

    public final void setGlobalExit(@Nullable GlobalExit globalExit) {
        this.globalExit = globalExit;
    }

    public final void setOneShot(@Nullable OneShot oneShot) {
        this.oneShot = oneShot;
    }

    @NotNull
    public String toString() {
        return "Dm(enable=" + this.enable + ", errorHandle=" + this.errorHandle + ", globalExit=" + this.globalExit + ", oneShot=" + this.oneShot + ')';
    }

    public Dm(@Nullable Boolean bool, @Nullable ErrorHandle errorHandle, @Nullable GlobalExit globalExit, @Nullable OneShot oneShot) {
        this.enable = bool;
        this.errorHandle = errorHandle;
        this.globalExit = globalExit;
        this.oneShot = oneShot;
    }

    public /* synthetic */ Dm(Boolean bool, ErrorHandle errorHandle, GlobalExit globalExit, OneShot oneShot, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : errorHandle, (i & 4) != 0 ? null : globalExit, (i & 8) != 0 ? null : oneShot);
    }
}
