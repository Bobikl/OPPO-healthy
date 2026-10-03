package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ze4, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/ze4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "c", "(I)V", "enumId", "", "Lcom/oplus/aiunit/vision/dj3;", "b", "Ljava/util/List;", "()Ljava/util/List;", "list", "<init>", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CurrentCloudStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int enumId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<CloudStatus> list = fj3.a().subList(1, 7);

    public CurrentCloudStatus(int i) {
        this.enumId = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEnumId() {
        return this.enumId;
    }

    @NotNull
    public final List<CloudStatus> b() {
        return this.list;
    }

    public final void c(int i) {
        this.enumId = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CurrentCloudStatus) && this.enumId == ((CurrentCloudStatus) other).enumId;
    }

    public int hashCode() {
        return Integer.hashCode(this.enumId);
    }

    @NotNull
    public String toString() {
        return "CurrentCloudStatus(enumId=" + this.enumId + ")";
    }
}
