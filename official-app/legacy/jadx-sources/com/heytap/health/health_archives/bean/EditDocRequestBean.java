package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/bean/EditDocRequestBean;", "", "structDataModified", "", "structureInfo", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "(ZLcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;)V", "getStructDataModified", "()Z", "setStructDataModified", "(Z)V", "getStructureInfo", "()Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "setStructureInfo", "(Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EditDocRequestBean {
    private boolean structDataModified;

    @Nullable
    private HealthArchiveRecord structureInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public EditDocRequestBean() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EditDocRequestBean copy$default(EditDocRequestBean editDocRequestBean, boolean z, HealthArchiveRecord healthArchiveRecord, int i, Object obj) {
        if ((i & 1) != 0) {
            z = editDocRequestBean.structDataModified;
        }
        if ((i & 2) != 0) {
            healthArchiveRecord = editDocRequestBean.structureInfo;
        }
        return editDocRequestBean.copy(z, healthArchiveRecord);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getStructDataModified() {
        return this.structDataModified;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthArchiveRecord getStructureInfo() {
        return this.structureInfo;
    }

    @NotNull
    public final EditDocRequestBean copy(boolean structDataModified, @Nullable HealthArchiveRecord structureInfo) {
        return new EditDocRequestBean(structDataModified, structureInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditDocRequestBean)) {
            return false;
        }
        EditDocRequestBean editDocRequestBean = (EditDocRequestBean) other;
        return this.structDataModified == editDocRequestBean.structDataModified && Intrinsics.areEqual(this.structureInfo, editDocRequestBean.structureInfo);
    }

    public final boolean getStructDataModified() {
        return this.structDataModified;
    }

    @Nullable
    public final HealthArchiveRecord getStructureInfo() {
        return this.structureInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.structDataModified;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        HealthArchiveRecord healthArchiveRecord = this.structureInfo;
        return i + (healthArchiveRecord == null ? 0 : healthArchiveRecord.hashCode());
    }

    public final void setStructDataModified(boolean z) {
        this.structDataModified = z;
    }

    public final void setStructureInfo(@Nullable HealthArchiveRecord healthArchiveRecord) {
        this.structureInfo = healthArchiveRecord;
    }

    @NotNull
    public String toString() {
        return "EditDocRequestBean(structDataModified=" + this.structDataModified + ", structureInfo=" + this.structureInfo + ")";
    }

    public EditDocRequestBean(boolean z, @Nullable HealthArchiveRecord healthArchiveRecord) {
        this.structDataModified = z;
        this.structureInfo = healthArchiveRecord;
    }

    public /* synthetic */ EditDocRequestBean(boolean z, HealthArchiveRecord healthArchiveRecord, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : healthArchiveRecord);
    }
}
