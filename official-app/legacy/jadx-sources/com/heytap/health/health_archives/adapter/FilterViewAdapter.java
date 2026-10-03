package com.heytap.health.health_archives.adapter;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.health_archives.R$color;
import com.heytap.health.health_archives.R$drawable;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.health_archives.adapter.FilterViewAdapter;
import com.heytap.health.health_archives.bean.FilterAdapterBean;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ghd;
import com.oplus.aiunit.vision.qtf;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/health_archives/adapter/FilterViewAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/heytap/health/health_archives/bean/FilterAdapterBean;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/ghd;", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/ghd;", "mFilterListener", "", "data", "listener", "<init>", "(Ljava/util/List;Lcom/oplus/aiunit/vision/ghd;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class FilterViewAdapter extends BaseRecyclerAdapter<FilterAdapterBean> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public ghd mFilterListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterViewAdapter(@NotNull List<FilterAdapterBean> data, @Nullable ghd ghdVar) {
        super(data, R$layout.health_archives_filter_view_item);
        Intrinsics.checkNotNullParameter(data, "data");
        this.mFilterListener = ghdVar;
    }

    public static final void m(FilterViewAdapter this$0, FilterAdapterBean filterAdapterBean, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ghd ghdVar = this$0.mFilterListener;
        if (ghdVar != null) {
            ghdVar.a(filterAdapterBean, i);
        }
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final FilterAdapterBean filterAdapterBean = getData().get(position);
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getView(R$id.filter_item);
        appCompatTextView.setText(filterAdapterBean.getValue());
        if (filterAdapterBean.isCheck()) {
            appCompatTextView.setTextColor(qtf.d().getColor(R$color.health_archives_90_white));
            appCompatTextView.setBackgroundResource(R$drawable.health_archives_0066ff_solid_radius_15);
        } else {
            appCompatTextView.setTextColor(qtf.d().getColor(R$color.health_archives_90_black));
            appCompatTextView.setBackgroundResource(R$drawable.health_archives_14000000_solid_radius_15);
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.he7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterViewAdapter.m(this.i, filterAdapterBean, position, view);
            }
        });
    }
}
