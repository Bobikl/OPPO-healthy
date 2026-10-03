package com.oplus.aiunit.vision;

import com.heytap.health.home.homecard.CardNetBean;
import com.heytap.health.home.homecard.CardUploadBean;
import com.heytap.health.homecard.recycle.CardMsg;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class j03 {
    public String a(List<CardMsg> list) {
        StringBuilder sb = new StringBuilder();
        if (lza.a(list)) {
            sb.append("List<CardMsg> is null or size == 0");
            return sb.toString();
        }
        while (true) {
            int i = 0;
            for (CardMsg cardMsg : list) {
                if (cardMsg == null) {
                    sb.append("msg == null#");
                } else {
                    i++;
                    sb.append(cardMsg.getDataType());
                    sb.append(",");
                    sb.append(cardMsg.getCardUiMode());
                    sb.append("  #");
                    if (i >= 3) {
                        sb.append(Weather.SEPARATOR);
                    }
                }
            }
            return sb.toString();
        }
    }

    public String b(List<CardNetBean> list) {
        if (list == null || list.size() <= 0) {
            return "CardNetBean == null || CardNetBean.size() == 0";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<CardNetBean> it = list.iterator();
        while (true) {
            int i = 0;
            while (it.hasNext()) {
                i++;
                sb.append(it.next());
                sb.append("#");
                if (i >= 3) {
                    sb.append(Weather.SEPARATOR);
                }
            }
            return sb.toString();
        }
    }

    public String c(List<HealthBaseCard> list) {
        StringBuilder sb = new StringBuilder();
        if (lza.a(list)) {
            sb.append("printHealthBaseCard baseCards == null || size == 0");
            return sb.toString();
        }
        for (HealthBaseCard healthBaseCard : list) {
            if (healthBaseCard == null) {
                sb.append("card == null#");
            } else {
                sb.append("dataType:");
                sb.append(healthBaseCard.t());
                sb.append(",cardType:");
                sb.append(healthBaseCard.q());
                sb.append("#");
            }
        }
        return sb.toString();
    }

    public String d(List<CardUploadBean> list) {
        if (list == null || list.size() <= 0) {
            return "uploadbeans == null || uploadBeans.size() == 0";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<CardUploadBean> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("#");
        }
        return sb.toString();
    }
}
