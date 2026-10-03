package com.heytap.health.operation.medal.viewmodel;

import android.content.Intent;
import android.text.TextUtils;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operations.bean.MedalListBean;
import com.oplus.aiunit.vision.krb;
import com.oplus.aiunit.vision.oqb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class MedalDetailsViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<MedalListBean> f5205j = new ArrayList();

    public List<MedalListBean> v(Intent intent) {
        this.f5205j.clear();
        try {
            if (intent == null) {
                return this.f5205j;
            }
            MedalListBean medalListBeanT = (MedalListBean) intent.getSerializableExtra("singleMedal");
            String stringExtra = intent.getStringExtra("code");
            oqb.a("MedalDetailsViewModel > intent extra code:", stringExtra, "singleMedal:", medalListBeanT);
            if (medalListBeanT == null && !TextUtils.isEmpty(stringExtra)) {
                medalListBeanT = MedalUploadSaveManager.r().t(stringExtra);
            }
            if (medalListBeanT != null) {
                MedalListBean medalListBeanT2 = MedalUploadSaveManager.r().t(medalListBeanT.getCode());
                if (medalListBeanT2 != null) {
                    medalListBeanT.setFlag(medalListBeanT2.getFlag());
                    medalListBeanT.setVideoLoaclUri(medalListBeanT2.getVideoLoaclUri());
                    medalListBeanT.setVideoUrl(medalListBeanT2.getVideoUrl());
                    medalListBeanT.setSort(medalListBeanT2.getSort());
                    medalListBeanT.setDisplay(medalListBeanT2.getDisplay());
                    medalListBeanT.setRecordDuration(medalListBeanT.getRecordDuration() == 0 ? medalListBeanT2.getRecordDuration() : medalListBeanT.getRecordDuration());
                    medalListBeanT.setBreakRecordTimes(medalListBeanT.getBreakRecordTimes() == 0 ? medalListBeanT2.getBreakRecordTimes() : medalListBeanT.getBreakRecordTimes());
                    medalListBeanT.setRemark(TextUtils.isEmpty(medalListBeanT.getRemark()) ? medalListBeanT2.getRemark() : medalListBeanT.getRemark());
                }
                if (medalListBeanT2 != null && medalListBeanT2.getGetResult() != 1 && medalListBeanT.getGetResult() == 1) {
                    medalListBeanT2.setGetResult(1);
                    medalListBeanT2.setAckStatus(1);
                    medalListBeanT2.setAcquisitionDate(medalListBeanT.getAcquisitionDate());
                }
                this.f5205j.add(medalListBeanT);
            } else {
                ArrayList arrayList = (ArrayList) intent.getSerializableExtra(krb.MEDALDETAILLIST);
                if (arrayList != null) {
                    this.f5205j.addAll(arrayList);
                }
            }
            return this.f5205j;
        } catch (Exception e2) {
            oqb.d(e2);
        }
    }
}
