package com.oplus.aiunit.vision;

import com.heytap.health.homecard.recycle.CardMsg;
import com.heytap.health.main.card.common.HealthBaseCard;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class n13 {

    public static class a implements Comparator<CardMsg> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(CardMsg cardMsg, CardMsg cardMsg2) {
            return cardMsg.getDisplayPos() - cardMsg2.getDisplayPos();
        }
    }

    public static class b implements Comparator<HealthBaseCard> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(HealthBaseCard healthBaseCard, HealthBaseCard healthBaseCard2) {
            if (healthBaseCard.t() == null || healthBaseCard2.t() == null) {
                return 0;
            }
            return healthBaseCard.t().unbindSort - healthBaseCard2.t().unbindSort;
        }
    }

    public static class c implements Comparator<CardMsg> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(CardMsg cardMsg, CardMsg cardMsg2) {
            if (cardMsg.getDataType() == null || cardMsg2.getDataType() == null) {
                return 0;
            }
            return cardMsg.getDataType().unbindSort - cardMsg2.getDataType().unbindSort;
        }
    }

    public static Comparator<HealthBaseCard> a() {
        return new b();
    }

    public static Comparator<CardMsg> b() {
        return new c();
    }

    public static int c(List<HealthBaseCard> list, HealthBaseCard healthBaseCard) {
        wz2 wz2Var = new wz2();
        List<HealthBaseCard> listG = wz2Var.g(list, true);
        List<HealthBaseCard> listG2 = wz2Var.g(list, false);
        listG2.add(healthBaseCard);
        if (listG2.size() > 1) {
            Collections.sort(listG2, a());
        }
        int iBinarySearch = Collections.binarySearch(listG2, healthBaseCard, a());
        return iBinarySearch < 0 ? listG.size() + 1 : listG.size() + 2 + iBinarySearch;
    }
}
