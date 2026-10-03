package com.heytap.health.esim.bean;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/esim/bean/AcCodeBlacklist;", "", "blacklist", "", "", "(Ljava/util/List;)V", "getBlacklist", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AcCodeBlacklist {
    public static final int $stable = 8;

    @NotNull
    private final List<String> blacklist;

    /* JADX WARN: Multi-variable type inference failed */
    public AcCodeBlacklist() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcCodeBlacklist copy$default(AcCodeBlacklist acCodeBlacklist, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = acCodeBlacklist.blacklist;
        }
        return acCodeBlacklist.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.blacklist;
    }

    @NotNull
    public final AcCodeBlacklist copy(@NotNull List<String> blacklist) {
        Intrinsics.checkNotNullParameter(blacklist, "blacklist");
        return new AcCodeBlacklist(blacklist);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AcCodeBlacklist) && Intrinsics.areEqual(this.blacklist, ((AcCodeBlacklist) other).blacklist);
    }

    @NotNull
    public final List<String> getBlacklist() {
        return this.blacklist;
    }

    public int hashCode() {
        return this.blacklist.hashCode();
    }

    @NotNull
    public String toString() {
        return "AcCodeBlacklist(blacklist=" + this.blacklist + ")";
    }

    public AcCodeBlacklist(@NotNull List<String> blacklist) {
        Intrinsics.checkNotNullParameter(blacklist, "blacklist");
        this.blacklist = blacklist;
    }

    public /* synthetic */ AcCodeBlacklist(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
