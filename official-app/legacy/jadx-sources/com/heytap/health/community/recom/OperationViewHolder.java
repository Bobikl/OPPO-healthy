package com.heytap.health.community.recom;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.community.impl.R$id;
import com.heytap.health.core.operation.space.SpaceView;
import com.oplus.aiunit.vision.a7b;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\b\u001a\u00020\u00072\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/community/recom/OperationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "", "", "Lcom/heytap/databaseengine/model/SpaceInfo;", "spaceData", "", "a", "Lcom/heytap/health/core/operation/space/SpaceView;", "i", "Lcom/heytap/health/core/operation/space/SpaceView;", "spaceView", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Companion", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class OperationViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final SpaceView spaceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.community_recom_space_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.community_recom_space_view)");
        SpaceView spaceView = (SpaceView) viewFindViewById;
        this.spaceView = spaceView;
        spaceView.setCardCode("01");
    }

    public final void a(@Nullable Map<String, ? extends List<? extends SpaceInfo>> spaceData) {
        if (spaceData != null) {
            this.spaceView.setData(spaceData);
        } else {
            a7b.m("OperationViewHolder", "setData spaceData is null");
        }
    }
}
