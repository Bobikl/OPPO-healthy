package com.oplus.aiunit.vision;

import com.heytap.health.operations.bean.MedalListBean;
import java.util.Comparator;

/* JADX INFO: loaded from: classes17.dex */
public class aqb implements Comparator<MedalListBean> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(MedalListBean medalListBean, MedalListBean medalListBean2) {
        if (medalListBean == null || medalListBean2 == null) {
            return -1;
        }
        int sort = medalListBean.getSort();
        int sort2 = medalListBean2.getSort();
        int status = medalListBean.getStatus();
        int status2 = medalListBean2.getStatus();
        int getResult = medalListBean.getGetResult();
        int getResult2 = medalListBean2.getGetResult();
        if (sort >= sort2) {
            return (getResult2 == 0 && status2 == 2) ? -1 : 1;
        }
        return (getResult == 0 && status == 2) ? 1 : -1;
    }
}
