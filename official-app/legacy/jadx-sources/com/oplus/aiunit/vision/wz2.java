package com.oplus.aiunit.vision;

import com.heytap.health.health.hearing.HearingService;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.homecard.recycle.CardMsg;
import com.heytap.health.main.card.common.HealthBaseCard;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
public class wz2 {
    public static EnumMap<HomeCardDataEnum$DataType, Integer> f(List<CardMsg> list) {
        if (lza.a(list)) {
            return null;
        }
        EnumMap<HomeCardDataEnum$DataType, Integer> enumMap = new EnumMap<>(HomeCardDataEnum$DataType.class);
        for (CardMsg cardMsg : list) {
            if (cardMsg.getDataType() != null) {
                if (enumMap.containsKey(cardMsg.getDataType())) {
                    Integer num = enumMap.get(cardMsg.getDataType());
                    enumMap.put(cardMsg.getDataType(), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                } else {
                    enumMap.put(cardMsg.getDataType(), 1);
                }
            }
        }
        return enumMap;
    }

    public final void a(List<CardMsg> list) {
        Iterator<CardMsg> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getDataType() == HomeCardDataEnum$DataType.AI_HEALTH_ASSISTANT) {
                it.remove();
            }
        }
    }

    public final void b(List<CardMsg> list) {
        a7b.f("HomeCardFilterWorker", "filterCervicalSpineCard");
        if (ilj.B()) {
            return;
        }
        a7b.f("HomeCardFilterWorker", "filterUnusedCard notOppoBrand");
        int iIndexOf = list.indexOf(new CardMsg(HomeCardDataEnum$DataType.CERVICAL_SPINE));
        if (iIndexOf != -1) {
            a7b.f("HomeCardFilterWorker", "filterUnusedCard remove CERVICAL_SPINE");
            list.remove(iIndexOf);
        }
    }

    public final void c(List<CardMsg> list) {
        Iterator<CardMsg> it = list.iterator();
        while (it.hasNext()) {
            CardMsg next = it.next();
            if (next.getDataType() == HomeCardDataEnum$DataType.PWV) {
                a7b.f("HomeCardFilterWorker", "filterCommonUnusedCard :" + next.getDataType());
                it.remove();
            }
        }
    }

    public List<CardMsg> d(List<CardMsg> list) {
        Integer num;
        EnumMap<HomeCardDataEnum$DataType, Integer> enumMapF = f(list);
        if (enumMapF == null) {
            return list;
        }
        ListIterator<CardMsg> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            CardMsg cardMsgPrevious = listIterator.previous();
            if (enumMapF.containsKey(cardMsgPrevious.getDataType()) && (num = enumMapF.get(cardMsgPrevious.getDataType())) != null && num.intValue() > 1) {
                listIterator.remove();
                enumMapF.put(cardMsgPrevious.getDataType(), Integer.valueOf(num.intValue() - 1));
            }
        }
        return list;
    }

    public void e(List<CardMsg> list) {
        a7b.f("HomeCardFilterWorker", "filterUnusedCard");
        b(list);
        i(list);
        c(list);
        if (j()) {
            return;
        }
        a(list);
    }

    public List<HealthBaseCard> g(List<HealthBaseCard> list, boolean z) {
        if (list == null || list.size() <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (HealthBaseCard healthBaseCard : list) {
            if (z && healthBaseCard.q().followed) {
                arrayList.add(healthBaseCard);
            } else if (!z && !healthBaseCard.q().followed && healthBaseCard.t() != HomeCardDataEnum$DataType.NOT_VALID_DATA) {
                arrayList.add(healthBaseCard);
            }
        }
        return arrayList;
    }

    public List<CardMsg> h(List<CardMsg> list, boolean z) {
        if (list == null || list.size() <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CardMsg cardMsg : list) {
            if (cardMsg == null || cardMsg.getCardUiMode() == null) {
                a7b.f("HomeCardFilterWorker", "getFollowedMsg item card data is null");
            } else if (z && cardMsg.getCardUiMode().followed) {
                arrayList.add(cardMsg);
            } else if (!z && !cardMsg.getCardUiMode().followed && cardMsg.getDataType() != HomeCardDataEnum$DataType.NOT_VALID_DATA) {
                arrayList.add(cardMsg);
            }
        }
        return arrayList;
    }

    public final void i(List<CardMsg> list) {
        HearingService hearingService = (HearingService) x0.d().b("/hearing/HearingService").navigation();
        boolean z = false;
        boolean z2 = hearingService.z6() || hearingService.k8();
        Iterator<CardMsg> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getDataType() == HomeCardDataEnum$DataType.HEARING_HEALTH) {
                z = true;
                break;
            }
        }
        if (z2 && !z) {
            list.add(new CardMsg(HomeCardDataEnum$DataType.HEARING_HEALTH, HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_NOT_FOLLOWED, null, 0, ""));
            return;
        }
        if (z2 || !z) {
            return;
        }
        Iterator<CardMsg> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().getDataType() == HomeCardDataEnum$DataType.HEARING_HEALTH) {
                it2.remove();
                return;
            }
        }
    }

    public final boolean j() {
        if (m3k.d()) {
            a7b.f("HomeCardFilterWorker", "in TouristMode");
            return false;
        }
        return !um.d().e(um.c().getSsoid());
    }
}
