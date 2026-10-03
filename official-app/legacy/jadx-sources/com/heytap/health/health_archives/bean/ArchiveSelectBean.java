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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/bean/ArchiveSelectBean;", "", "archiveRecord", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "selected", "", "(Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;Z)V", "getArchiveRecord", "()Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "setArchiveRecord", "(Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;)V", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchiveSelectBean {

    @Nullable
    private HealthArchiveRecord archiveRecord;
    private boolean selected;

    /* JADX WARN: Multi-variable type inference failed */
    public ArchiveSelectBean() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ArchiveSelectBean copy$default(ArchiveSelectBean archiveSelectBean, HealthArchiveRecord healthArchiveRecord, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            healthArchiveRecord = archiveSelectBean.archiveRecord;
        }
        if ((i & 2) != 0) {
            z = archiveSelectBean.selected;
        }
        return archiveSelectBean.copy(healthArchiveRecord, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HealthArchiveRecord getArchiveRecord() {
        return this.archiveRecord;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final ArchiveSelectBean copy(@Nullable HealthArchiveRecord archiveRecord, boolean selected) {
        return new ArchiveSelectBean(archiveRecord, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchiveSelectBean)) {
            return false;
        }
        ArchiveSelectBean archiveSelectBean = (ArchiveSelectBean) other;
        return Intrinsics.areEqual(this.archiveRecord, archiveSelectBean.archiveRecord) && this.selected == archiveSelectBean.selected;
    }

    @Nullable
    public final HealthArchiveRecord getArchiveRecord() {
        return this.archiveRecord;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        HealthArchiveRecord healthArchiveRecord = this.archiveRecord;
        int iHashCode = (healthArchiveRecord == null ? 0 : healthArchiveRecord.hashCode()) * 31;
        boolean z = this.selected;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setArchiveRecord(@Nullable HealthArchiveRecord healthArchiveRecord) {
        this.archiveRecord = healthArchiveRecord;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "ArchiveSelectBean(archiveRecord=" + this.archiveRecord + ", selected=" + this.selected + ")";
    }

    public ArchiveSelectBean(@Nullable HealthArchiveRecord healthArchiveRecord, boolean z) {
        this.archiveRecord = healthArchiveRecord;
        this.selected = z;
    }

    public /* synthetic */ ArchiveSelectBean(HealthArchiveRecord healthArchiveRecord, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : healthArchiveRecord, (i & 2) != 0 ? false : z);
    }
}
