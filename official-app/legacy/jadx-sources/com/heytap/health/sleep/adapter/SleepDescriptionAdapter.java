package com.heytap.health.sleep.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.adapter.SleepDescriptionAdapter;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ugh;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/heytap/health/sleep/adapter/SleepDescriptionAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/oplus/aiunit/vision/ugh;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDescriptionAdapter extends BaseRecyclerAdapter<ugh> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public static final void m(SleepDescriptionAdapter this$0, ugh item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.context.startActivity(new Intent(this$0.context, item.a()));
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.i.get(position);
        Intrinsics.checkNotNull(obj);
        final ugh ughVar = (ugh) obj;
        ConstraintLayout constraintLayout = (ConstraintLayout) holder.getView(R$id.itemView);
        ((TextView) holder.getView(R$id.tv_title)).setText(ughVar.getTitle());
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.tgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDescriptionAdapter.m(this.i, ughVar, view);
            }
        });
    }
}
