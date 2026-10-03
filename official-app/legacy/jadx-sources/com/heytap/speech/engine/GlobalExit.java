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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/GlobalExit;", "", "globalExitUtterances", "", "", "globalExitWords", "visible", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "getGlobalExitUtterances", "()Ljava/util/List;", "setGlobalExitUtterances", "(Ljava/util/List;)V", "getGlobalExitWords", "setGlobalExitWords", "getVisible", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)Lcom/heytap/speech/engine/GlobalExit;", "equals", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GlobalExit {

    @Nullable
    private List<String> globalExitUtterances;

    @Nullable
    private List<String> globalExitWords;

    @Nullable
    private Boolean visible;

    public GlobalExit() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlobalExit copy$default(GlobalExit globalExit, List list, List list2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = globalExit.globalExitUtterances;
        }
        if ((i & 2) != 0) {
            list2 = globalExit.globalExitWords;
        }
        if ((i & 4) != 0) {
            bool = globalExit.visible;
        }
        return globalExit.copy(list, list2, bool);
    }

    @Nullable
    public final List<String> component1() {
        return this.globalExitUtterances;
    }

    @Nullable
    public final List<String> component2() {
        return this.globalExitWords;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @NotNull
    public final GlobalExit copy(@Nullable List<String> globalExitUtterances, @Nullable List<String> globalExitWords, @Nullable Boolean visible) {
        return new GlobalExit(globalExitUtterances, globalExitWords, visible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalExit)) {
            return false;
        }
        GlobalExit globalExit = (GlobalExit) other;
        return Intrinsics.areEqual(this.globalExitUtterances, globalExit.globalExitUtterances) && Intrinsics.areEqual(this.globalExitWords, globalExit.globalExitWords) && Intrinsics.areEqual(this.visible, globalExit.visible);
    }

    @Nullable
    public final List<String> getGlobalExitUtterances() {
        return this.globalExitUtterances;
    }

    @Nullable
    public final List<String> getGlobalExitWords() {
        return this.globalExitWords;
    }

    @Nullable
    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        List<String> list = this.globalExitUtterances;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.globalExitWords;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.visible;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setGlobalExitUtterances(@Nullable List<String> list) {
        this.globalExitUtterances = list;
    }

    public final void setGlobalExitWords(@Nullable List<String> list) {
        this.globalExitWords = list;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.visible = bool;
    }

    @NotNull
    public String toString() {
        return "GlobalExit(globalExitUtterances=" + this.globalExitUtterances + ", globalExitWords=" + this.globalExitWords + ", visible=" + this.visible + ')';
    }

    public GlobalExit(@Nullable List<String> list, @Nullable List<String> list2, @Nullable Boolean bool) {
        this.globalExitUtterances = list;
        this.globalExitWords = list2;
        this.visible = bool;
    }

    public /* synthetic */ GlobalExit(List list, List list2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : bool);
    }
}
