package com.heytap.health.device.flexadapter.diff;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.heytap.health.device.flexadapter.a;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J2\u0010\u000e\u001a\u00020\u00002\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\n2\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\nR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/device/flexadapter/diff/FlexAdapterDiff;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lcom/heytap/health/device/flexadapter/a;", "oldList", "newList", "a", "", "Ljava/lang/String;", "TAG", "", "b", "Ljava/util/List;", "oldViews", "c", "newViews", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class FlexAdapterDiff extends DiffUtil.Callback {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "FlexAdapterDiff";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<a<?, ?>> oldViews = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<a<?, ?>> newViews = new ArrayList();

    @NotNull
    public final FlexAdapterDiff a(@NotNull List<? extends a<?, ?>> oldList, @NotNull List<? extends a<?, ?>> newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        StringBuilder sb = new StringBuilder();
        sb.append("updateList\noldList:");
        sb.append(oldList);
        sb.append("\nnewList:");
        sb.append(newList);
        this.oldViews.clear();
        this.oldViews.addAll(oldList);
        this.newViews.clear();
        this.newViews.addAll(newList);
        return this;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return this.oldViews.get(oldItemPosition).G() == this.newViews.get(newItemPosition).G();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.newViews.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.oldViews.size();
    }
}
