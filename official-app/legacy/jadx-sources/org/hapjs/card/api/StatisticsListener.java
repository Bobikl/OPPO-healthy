package org.hapjs.card.api;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface StatisticsListener {
    void onClickEvent(String str, String str2, String str3);

    void onStatisticsEvent(String str, String str2, Map<String, String> map, String str3);
}
