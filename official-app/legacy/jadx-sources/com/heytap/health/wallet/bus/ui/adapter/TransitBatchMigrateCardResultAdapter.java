package com.heytap.health.wallet.bus.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.heytap.health.wallet.bus.R$layout;
import com.heytap.health.wallet.network.common.rsp.QrCodeCardInfo;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.drk;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class TransitBatchMigrateCardResultAdapter extends BaseRecyclerViewAdapter<QrCodeCardInfo> {
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6211l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TransitBatchMigrateCardContentHolder f6212n;

    public TransitBatchMigrateCardResultAdapter(Context context, List<QrCodeCardInfo> list, int i, int i2, int i3) {
        super(context, list);
        this.k = i;
        this.f6211l = i2;
        this.m = i3;
    }

    @Override // com.heytap.health.wallet.bus.ui.adapter.BaseRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public BaseRecyclerViewHolder<QrCodeCardInfo> onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new TransitBatchMigrateCardHeadHolder(viewGroup, R$layout.item_batch_migrate_card_result_head, this.k, this.f6211l, this.m);
        }
        if (i == 1) {
            TransitBatchMigrateCardContentHolder transitBatchMigrateCardContentHolder = new TransitBatchMigrateCardContentHolder(viewGroup, R$layout.item_batch_migrate_card_content, this.k, this.f6211l, this.m);
            this.f6212n = transitBatchMigrateCardContentHolder;
            return transitBatchMigrateCardContentHolder;
        }
        if (i == 2) {
            return new TransitBatchMigrateCardFootHolder(viewGroup, R$layout.item_batch_migrate_card_foot);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (drk.e(this.f6182j)) {
            return 0;
        }
        return ((QrCodeCardInfo) this.f6182j.get(i)).getType();
    }
}
