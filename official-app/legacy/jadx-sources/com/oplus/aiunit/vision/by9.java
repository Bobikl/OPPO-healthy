package com.oplus.aiunit.vision;

import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface by9 {
    String checkIssueConditions(Map map);

    String checkServiceStatus(Map map);

    String deleteCard(Map map);

    String issueCard(Map map);

    String preIssueCard(Map map);

    String queryCplc();

    String queryTrafficCardInfo(String str, int i);

    String recharge(Map map);
}
