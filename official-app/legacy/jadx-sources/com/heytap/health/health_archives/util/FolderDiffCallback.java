package com.heytap.health.health_archives.util;

import androidx.recyclerview.widget.DiffUtil;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/health_archives/util/FolderDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "a", "Ljava/util/List;", "oldList", "b", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class FolderDiffCallback extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<HealthArchiveRecord> oldList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<HealthArchiveRecord> newList;

    public FolderDiffCallback(@NotNull List<HealthArchiveRecord> oldList, @NotNull List<HealthArchiveRecord> newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return this.oldList.get(oldItemPosition).getAbnormalNumber() == this.newList.get(newItemPosition).getAbnormalNumber() && Intrinsics.areEqual(this.oldList.get(oldItemPosition).getName(), this.newList.get(newItemPosition).getName()) && Intrinsics.areEqual(this.oldList.get(oldItemPosition).getOwner(), this.newList.get(newItemPosition).getOwner()) && Intrinsics.areEqual(this.oldList.get(oldItemPosition).getInstitute(), this.newList.get(newItemPosition).getInstitute()) && this.oldList.get(oldItemPosition).getDataCreatedTimestamp() == this.newList.get(newItemPosition).getDataCreatedTimestamp() && this.oldList.get(oldItemPosition).getTag() == this.newList.get(newItemPosition).getTag() && Intrinsics.areEqual(this.oldList.get(oldItemPosition).getStructData(), this.newList.get(newItemPosition).getStructData());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return Intrinsics.areEqual(this.oldList.get(oldItemPosition).getDocId(), this.newList.get(newItemPosition).getDocId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.newList.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.oldList.size();
    }
}
