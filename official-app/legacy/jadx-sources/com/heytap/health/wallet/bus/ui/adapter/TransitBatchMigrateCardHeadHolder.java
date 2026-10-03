package com.heytap.health.wallet.bus.ui.adapter;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.heytap.health.wallet.bus.R$id;
import com.heytap.health.wallet.network.common.rsp.QrCodeCardInfo;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.qz0;
import com.oppo.lib.common.R$color;
import com.oppo.lib.common.R$drawable;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes18.dex */
public class TransitBatchMigrateCardHeadHolder extends BaseRecyclerViewHolder<QrCodeCardInfo> {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6208j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6209l;
    public LottieAnimationView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f6210n;
    public TextView o;

    public TransitBatchMigrateCardHeadHolder(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        super(viewGroup, i);
        this.i = i2;
        this.f6208j = i3;
        this.k = i4;
        this.f6209l = i2 + i3;
    }

    @Override // com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder
    public void d() {
        this.m = (LottieAnimationView) a(R$id.lottie_logo);
        this.f6210n = (TextView) a(R$id.tv_title);
        this.o = (TextView) a(R$id.tv_subtitle);
    }

    @Override // com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void setData(QrCodeCardInfo qrCodeCardInfo) {
        int i = this.i;
        int i2 = this.f6209l;
        if (i == i2) {
            this.m.setImageResource(R$drawable.icon_finish_big);
            this.m.setVisibility(0);
        } else if (this.f6208j == i2) {
            this.m.setImageResource(R$drawable.icon_fail_big);
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
        f(R$string.wallet_traffic_card_move_in_suc, R$string.wallet_migrate_in_success_subhint, R$string.wallet_migrate_in_fail, R$string.wallet_all_move_in_fail);
    }

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.i;
        if (i5 > 0 && i5 == this.f6209l) {
            this.f6210n.setText(b(i));
            this.o.setText(String.format(b(i2), String.valueOf(this.i)));
            this.o.setTextColor(ContextCompat.getColor(qz0.mContext, R$color.color_4D000000));
            this.o.setVisibility(8);
            return;
        }
        int i6 = this.f6208j;
        if (i6 > 0 && i6 == this.f6209l) {
            this.f6210n.setText(b(i3));
            this.o.setVisibility(8);
        } else {
            if (i5 <= 0 || i6 <= 0) {
                return;
            }
            this.f6210n.setText(String.format(b(i2), String.valueOf(this.i)));
            this.o.setText(String.format(b(i4), String.valueOf(this.f6208j)));
            this.o.setTextColor(ContextCompat.getColor(qz0.mContext, com.heytap.health.base.R$color.lib_base_black_55alpha));
            this.o.setVisibility(0);
        }
    }
}
