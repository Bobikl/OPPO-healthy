package com.heytap.health.wallet.bus.ui.adapter;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.heytap.health.wallet.bus.R$id;
import com.heytap.health.wallet.network.common.rsp.QrCodeCardInfo;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import com.oplus.aiunit.vision.kfg;
import com.oppo.lib.common.R$drawable;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes18.dex */
public class TransitBatchMigrateCardContentHolder extends BaseRecyclerViewHolder<QrCodeCardInfo> {
    public CircleNetworkImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f6205j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6206l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public QrCodeCardInfo f6207n;
    public TextView o;
    public TextView p;
    public ImageView q;

    public TransitBatchMigrateCardContentHolder(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        super(viewGroup, i);
        this.k = i2;
        this.f6206l = i3;
        this.m = i4;
    }

    @Override // com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder
    public void d() {
        this.i = (CircleNetworkImageView) a(R$id.migrate_card_img);
        this.o = (TextView) a(R$id.card_name);
        this.f6205j = (TextView) a(R$id.tv_fail_reason);
        this.p = (TextView) a(R$id.source);
        this.q = (ImageView) a(R$id.right_icon);
    }

    @Override // com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void setData(QrCodeCardInfo qrCodeCardInfo) {
        if (qrCodeCardInfo == null) {
            return;
        }
        this.f6207n = qrCodeCardInfo;
        this.i.setImageUrl(qrCodeCardInfo.getCardImg());
        this.o.setText(qrCodeCardInfo.getCardName());
        this.p.setText(c(R$string.wallet_src_of_card, qrCodeCardInfo.getDeviceName()));
        if (!TextUtils.isEmpty(qrCodeCardInfo.getFailReason())) {
            this.f6205j.setVisibility(0);
            this.f6205j.setText(c(R$string.wallet_fail_reason, qrCodeCardInfo.getFailReason()));
            if (this.k == 0) {
                this.q.setVisibility(8);
                return;
            } else {
                this.q.setVisibility(0);
                this.q.setImageResource(R$drawable.icon_fail_big);
                return;
            }
        }
        if (5 != this.m || !kfg.CARD_TYPE_ENTRANCE_2.equals(qrCodeCardInfo.getCardType())) {
            this.f6205j.setVisibility(8);
            return;
        }
        this.f6205j.setVisibility(8);
        if (this.f6206l == 0) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
            this.q.setImageResource(R$drawable.icon_finish_big);
        }
    }
}
