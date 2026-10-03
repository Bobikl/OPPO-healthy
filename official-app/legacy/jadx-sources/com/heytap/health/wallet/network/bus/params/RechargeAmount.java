package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class RechargeAmount {
    int amount;
    int normalCardFee;
    int normalRechargeFee;
    int payAmount;
    int promotionCardFee;
    int promotionRechargeFee;

    public RechargeAmount(int i, int i2, int i3, int i4, int i5, int i6) {
        t6b.a("RechargeAmount constructor   normalCardFee: " + i3 + " promotionCardFee: " + i4 + "  normalRechargeFee: " + i5 + "  promotionRechargeFee: " + i6);
        this.amount = i;
        this.payAmount = i2;
        this.normalCardFee = i3;
        this.promotionCardFee = i4;
        this.normalRechargeFee = i5;
        this.promotionRechargeFee = i6;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getEncryptAmount(String str, String str2) {
        t6b.a("getEncryptAmount   normalCardFee: " + this.normalCardFee + " promotionCardFee: " + this.promotionCardFee + "  normalRechargeFee: " + this.normalRechargeFee + "  promotionRechargeFee: " + this.promotionRechargeFee);
        String json = new Gson().toJson(this);
        StringBuilder sb = new StringBuilder();
        sb.append("getEncryptAmount for ");
        sb.append(json);
        t6b.a(sb.toString());
        return u.a(json, str.getBytes(), str2.getBytes());
    }

    public int getNormalCardFee() {
        return this.normalCardFee;
    }

    public int getNormalRechargeFee() {
        return this.normalRechargeFee;
    }

    public int getPayAmount() {
        return this.payAmount;
    }

    public int getPromotionCardFee() {
        return this.promotionCardFee;
    }

    public int getPromotionRechargeFee() {
        return this.promotionRechargeFee;
    }
}
