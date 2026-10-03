package com.oplus.aiunit.vision;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.cardiovascular.R$drawable;
import com.heytap.health.cardiovascular.R$id;
import com.heytap.health.cardiovascular.R$layout;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/rif;", "Lcom/oplus/aiunit/vision/v01;", "Lcom/oplus/aiunit/vision/sif;", "", "a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "itemModel", "", "c", "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class rif extends v01<sif> {
    public static final int $stable = 0;

    @Override // com.oplus.aiunit.vision.v01
    public int a() {
        return R$layout.health_cardiovascular_item_records_header;
    }

    @Override // com.oplus.aiunit.vision.v01
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull sif itemModel) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(itemModel, "itemModel");
        ImageView imageView = (ImageView) viewHolder.itemView.findViewById(R$id.icon);
        int i = itemModel.getIsLargeImg() ? R$drawable.health_cardiovascular_guide_wider : R$drawable.health_cardiovascular_guide;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }
}
