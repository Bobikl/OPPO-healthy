package com.heytap.health.watch.notification.impl.module;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/watch/notification/impl/module/IgnoreIcon;", "", "version", "", "list", "", "", "(ILjava/util/List;)V", "getList", "()Ljava/util/List;", "getVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IgnoreIcon {

    @NotNull
    private final List<String> list;
    private final int version;

    public IgnoreIcon(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.version = i;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IgnoreIcon copy$default(IgnoreIcon ignoreIcon, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ignoreIcon.version;
        }
        if ((i2 & 2) != 0) {
            list = ignoreIcon.list;
        }
        return ignoreIcon.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final List<String> component2() {
        return this.list;
    }

    @NotNull
    public final IgnoreIcon copy(int version, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new IgnoreIcon(version, list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IgnoreIcon)) {
            return false;
        }
        IgnoreIcon ignoreIcon = (IgnoreIcon) other;
        return this.version == ignoreIcon.version && Intrinsics.areEqual(this.list, ignoreIcon.list);
    }

    @NotNull
    public final List<String> getList() {
        return this.list;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + this.list.hashCode();
    }

    @NotNull
    public String toString() {
        return "IgnoreIcon(version=" + this.version + ", list=" + this.list + ")";
    }
}
