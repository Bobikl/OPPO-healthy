package com.heytap.health.operation.medalv2.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.operations.bean.MedalListBean;
import com.oplus.aiunit.vision.yqb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class MedalViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<ArrayList<MedalListBean>> f5218j;

    public final MutableLiveData<ArrayList<MedalListBean>> v() {
        if (this.f5218j == null) {
            this.f5218j = new MutableLiveData<>();
        }
        return this.f5218j;
    }

    public ArrayList<MedalListBean> w() {
        return yqb.f().g();
    }

    public MutableLiveData<List<MedalListBean>> x() {
        return yqb.f().k();
    }

    public MutableLiveData<ArrayList<MedalListBean>> y() {
        u(yqb.f().l(v()));
        return this.f5218j;
    }
}
