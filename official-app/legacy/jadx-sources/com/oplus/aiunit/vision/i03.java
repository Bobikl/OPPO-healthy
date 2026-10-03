package com.oplus.aiunit.vision;

import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.homecard.constant.HomeCardDataEnum$SpanNum;
import com.heytap.health.homecard.constant.HomeCardDataEnum$TextOneSpanStyle;
import com.heytap.health.homecard.recycle.CardMsg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes16.dex */
public class i03 {
    public static /* synthetic */ int i(CardMsg cardMsg) {
        return cardMsg.getDataType().unbindSort;
    }

    public List<CardMsg> b(List<CardMsg> list, List<CardMsg> list2) {
        if (list == null || list.size() <= 0) {
            return list2 != null ? list2 : new ArrayList();
        }
        if (list2 == null || list2.size() <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        arrayList.add(list.get(0));
        list.remove(0);
        for (CardMsg cardMsg : list2) {
            if (cardMsg.getCardUiMode().followed || z) {
                arrayList.add(cardMsg);
            } else {
                if (!lza.a(list)) {
                    arrayList.addAll(list);
                }
                arrayList.add(cardMsg);
                z = true;
            }
        }
        if (!z && !lza.a(list)) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public List<CardMsg> c() {
        ArrayList arrayList = new ArrayList();
        HomeCardDataEnum$DataType homeCardDataEnum$DataType = HomeCardDataEnum$DataType.NOT_VALID_DATA;
        HomeCardDataEnum$CardUiMode homeCardDataEnum$CardUiMode = HomeCardDataEnum$CardUiMode.TEXT_ONE_LINE;
        arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.TITLE, 0, ""));
        arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.TIPS, 0, ""));
        arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.SECOND_TITLE, 0, ""));
        return arrayList;
    }

    public List<CardMsg> d(List<CardMsg> list) {
        if (lza.a(list)) {
            return c();
        }
        List<CardMsg> listH = h(list, true);
        List<CardMsg> listH2 = h(list, false);
        if (!lza.a(listH) && !lza.a(listH2)) {
            return c();
        }
        ArrayList arrayList = new ArrayList();
        HomeCardDataEnum$DataType homeCardDataEnum$DataType = HomeCardDataEnum$DataType.NOT_VALID_DATA;
        HomeCardDataEnum$CardUiMode homeCardDataEnum$CardUiMode = HomeCardDataEnum$CardUiMode.TEXT_ONE_LINE;
        arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.TITLE, 0, ""));
        if (lza.a(listH)) {
            arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.CONTENT, 0, ""));
            arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.TIPS, 0, ""));
            arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.SECOND_TITLE, 0, ""));
        } else if (lza.a(listH2)) {
            arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.TIPS, 0, ""));
            arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.SECOND_TITLE, 0, ""));
            arrayList.add(new CardMsg(homeCardDataEnum$DataType, homeCardDataEnum$CardUiMode, HomeCardDataEnum$TextOneSpanStyle.SECOND_CONTENT, 0, ""));
        }
        return lza.a(arrayList) ? c() : arrayList;
    }

    public List<CardMsg> e() {
        List<CardMsg> listF = f();
        Collections.sort(listF, Comparator.comparingInt(new ToIntFunction() { // from class: com.oplus.aiunit.vision.h03
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return i03.i((CardMsg) obj);
            }
        }));
        for (CardMsg cardMsg : listF) {
            cardMsg.setCardUiMode(g(cardMsg, cardMsg.getDataType().noDeviceFollowed));
        }
        new wz2().e(listF);
        return j(listF);
    }

    public final List<CardMsg> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.FAMILY));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.WEIGHT));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.RANK));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.SLEEP));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.RELAX));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.STRESS));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.HEART_RATE));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.GOAL));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.DAILY_ACTIVITY));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.CALORIE));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.BLOOD_PRESSURE));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.BLOOD_OX));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.STEP));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.ECG));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.HEARING_HEALTH));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.CARDIOVASCULAR));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.WRIST_TEMPERATURE));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.BLOOD_SUGAR));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.CERVICAL_SPINE));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.MENSTRUAL_PERIOD));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.HRV));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.HEALTH_ARCHIVES));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.SNORE));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.HEALTH_TREND));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.TIMELINE));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.AI_HEALTH_ASSISTANT));
        arrayList.add(new CardMsg(HomeCardDataEnum$DataType.SUNSHINE));
        return arrayList;
    }

    public HomeCardDataEnum$CardUiMode g(CardMsg cardMsg, boolean z) {
        if (cardMsg.getDataType().spanNum == HomeCardDataEnum$SpanNum.ONE_LINE) {
            return z ? HomeCardDataEnum$CardUiMode.CARD_ONE_LINE_FOLLOWED : HomeCardDataEnum$CardUiMode.CARD_ONE_LINE_NOT_FOLLOWED;
        }
        return z ? HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED : HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_NOT_FOLLOWED;
    }

    public final List<CardMsg> h(List<CardMsg> list, boolean z) {
        if (lza.a(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CardMsg cardMsg : list) {
            if (cardMsg != null && cardMsg.getCardUiMode().followed == z) {
                arrayList.add(cardMsg);
            }
        }
        return arrayList;
    }

    public List<CardMsg> j(List<CardMsg> list) {
        try {
            List<CardMsg> listH = h(list, true);
            listH.addAll(h(list, false));
            return listH;
        } catch (UnsupportedOperationException unused) {
            return list;
        }
    }
}
