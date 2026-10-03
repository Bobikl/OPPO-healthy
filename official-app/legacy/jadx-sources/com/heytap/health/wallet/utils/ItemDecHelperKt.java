package com.heytap.health.wallet.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.yu5;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"otherDevCardDecor", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "commonlib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ItemDecHelperKt {

    @JvmField
    @NotNull
    public static final RecyclerView.ItemDecoration otherDevCardDecor = new RecyclerView.ItemDecoration() { // from class: com.heytap.health.wallet.utils.ItemDecHelperKt$otherDevCardDecor$1
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childLayoutPosition = parent.getChildLayoutPosition(view);
            if (childLayoutPosition == 0) {
                outRect.top = yu5.a(qz0.mContext, 10.0f);
                return;
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            Objects.requireNonNull(adapter);
            if (childLayoutPosition == adapter.getItemCount() - 1) {
                outRect.bottom = yu5.a(qz0.mContext, 10.0f);
            }
        }
    };
}
