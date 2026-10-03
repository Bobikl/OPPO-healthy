package com.oplus.aiunit.vision;

import com.heytap.health.operation.medal.bean.MedalAllListBean;
import java.util.Comparator;

/* JADX INFO: loaded from: classes17.dex */
public class crb implements Comparator<MedalAllListBean> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(MedalAllListBean medalAllListBean, MedalAllListBean medalAllListBean2) {
        if (medalAllListBean == null || medalAllListBean2 == null) {
            return -1;
        }
        int medalSort = medalAllListBean.getMedalSort();
        int medalSort2 = medalAllListBean2.getMedalSort();
        if (medalSort > medalSort2) {
            return 1;
        }
        return medalSort < medalSort2 ? -1 : 0;
    }
}
