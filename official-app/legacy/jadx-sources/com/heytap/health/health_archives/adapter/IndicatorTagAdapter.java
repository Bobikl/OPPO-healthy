package com.heytap.health.health_archives.adapter;

import android.widget.TextView;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.health_archives.bean.IndicatorTagBean;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/health/health_archives/adapter/IndicatorTagAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/heytap/health/health_archives/bean/IndicatorTagBean;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "", "data", "<init>", "(Ljava/util/List;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class IndicatorTagAdapter extends BaseRecyclerAdapter<IndicatorTagBean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorTagAdapter(@NotNull List<IndicatorTagBean> data) {
        super(data, R$layout.health_archives_indicator_tag_item);
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        IndicatorTagBean indicatorTagBean = getData().get(position);
        TextView textView = (TextView) holder.getView(R$id.indicator_tag_item_tv);
        textView.setText(indicatorTagBean.getTagText());
        textView.setBackground(indicatorTagBean.getBackground());
    }
}
