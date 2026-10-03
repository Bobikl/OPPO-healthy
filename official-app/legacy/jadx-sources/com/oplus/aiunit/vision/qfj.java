package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/qfj;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "macAddress", "b", "syncAction", "", "c", "I", "()I", "syncReason", "d", "syncType", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class qfj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String macAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String syncAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int syncReason;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int syncType;

    public qfj(@NotNull String macAddress, @NotNull String syncAction, int i, int i2) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(syncAction, "syncAction");
        this.macAddress = macAddress;
        this.syncAction = syncAction;
        this.syncReason = i;
        this.syncType = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSyncAction() {
        return this.syncAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSyncReason() {
        return this.syncReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSyncType() {
        return this.syncType;
    }
}
