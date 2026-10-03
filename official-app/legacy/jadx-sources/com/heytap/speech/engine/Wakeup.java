package com.heytap.speech.engine;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010JD\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006&"}, d2 = {"Lcom/heytap/speech/engine/Wakeup;", "", "cmdword", "Lcom/heytap/speech/engine/Cmdword;", "enable", "", "majorword", "", "Lcom/heytap/speech/engine/Majorword;", "visible", "(Lcom/heytap/speech/engine/Cmdword;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V", "getCmdword", "()Lcom/heytap/speech/engine/Cmdword;", "setCmdword", "(Lcom/heytap/speech/engine/Cmdword;)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMajorword", "()Ljava/util/List;", "setMajorword", "(Ljava/util/List;)V", "getVisible", "setVisible", "component1", "component2", "component3", "component4", "copy", "(Lcom/heytap/speech/engine/Cmdword;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)Lcom/heytap/speech/engine/Wakeup;", "equals", "other", "hashCode", "", "toString", "", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Wakeup {

    @Nullable
    private Cmdword cmdword;

    @Nullable
    private Boolean enable;

    @Nullable
    private List<Majorword> majorword;

    @Nullable
    private Boolean visible;

    public Wakeup() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Wakeup copy$default(Wakeup wakeup, Cmdword cmdword, Boolean bool, List list, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            cmdword = wakeup.cmdword;
        }
        if ((i & 2) != 0) {
            bool = wakeup.enable;
        }
        if ((i & 4) != 0) {
            list = wakeup.majorword;
        }
        if ((i & 8) != 0) {
            bool2 = wakeup.visible;
        }
        return wakeup.copy(cmdword, bool, list, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Cmdword getCmdword() {
        return this.cmdword;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final List<Majorword> component3() {
        return this.majorword;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @NotNull
    public final Wakeup copy(@Nullable Cmdword cmdword, @Nullable Boolean enable, @Nullable List<Majorword> majorword, @Nullable Boolean visible) {
        return new Wakeup(cmdword, enable, majorword, visible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Wakeup)) {
            return false;
        }
        Wakeup wakeup = (Wakeup) other;
        return Intrinsics.areEqual(this.cmdword, wakeup.cmdword) && Intrinsics.areEqual(this.enable, wakeup.enable) && Intrinsics.areEqual(this.majorword, wakeup.majorword) && Intrinsics.areEqual(this.visible, wakeup.visible);
    }

    @Nullable
    public final Cmdword getCmdword() {
        return this.cmdword;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final List<Majorword> getMajorword() {
        return this.majorword;
    }

    @Nullable
    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Cmdword cmdword = this.cmdword;
        int iHashCode = (cmdword == null ? 0 : cmdword.hashCode()) * 31;
        Boolean bool = this.enable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Majorword> list = this.majorword;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.visible;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setCmdword(@Nullable Cmdword cmdword) {
        this.cmdword = cmdword;
    }

    public final void setEnable(@Nullable Boolean bool) {
        this.enable = bool;
    }

    public final void setMajorword(@Nullable List<Majorword> list) {
        this.majorword = list;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.visible = bool;
    }

    @NotNull
    public String toString() {
        return "Wakeup(cmdword=" + this.cmdword + ", enable=" + this.enable + ", majorword=" + this.majorword + ", visible=" + this.visible + ')';
    }

    public Wakeup(@Nullable Cmdword cmdword, @Nullable Boolean bool, @Nullable List<Majorword> list, @Nullable Boolean bool2) {
        this.cmdword = cmdword;
        this.enable = bool;
        this.majorword = list;
        this.visible = bool2;
    }

    public /* synthetic */ Wakeup(Cmdword cmdword, Boolean bool, List list, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cmdword, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool2);
    }
}
