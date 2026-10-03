package com.heytap.health.homecard.viewholder;

import android.view.View;
import androidx.annotation.NonNull;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.main.card.common.HealthBaseCard;

/* JADX INFO: loaded from: classes16.dex */
public class HomeCardViewHolder extends MultiLayoutAdapter.GeneralViewHolder {
    public HealthBaseCard i;

    public HomeCardViewHolder(@NonNull View view) {
        super(view);
    }

    public HomeCardDataEnum$CardUiMode a() {
        HealthBaseCard healthBaseCard = this.i;
        return healthBaseCard != null ? healthBaseCard.q() : HomeCardDataEnum$CardUiMode.NOT_VALID_DATA;
    }

    public HealthBaseCard b() {
        return this.i;
    }

    public void c(HealthBaseCard healthBaseCard) {
        this.i = healthBaseCard;
    }
}
