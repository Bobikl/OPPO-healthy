package com.heytap.health.sleep.snore.viewmodel;

import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;

/* JADX INFO: loaded from: classes18.dex */
public class SnoreStatusViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OLiveData<Boolean> f5912j = new OLiveData<>(Boolean.FALSE);
    public final OLiveData<Integer> k = new OLiveData<>();

    public OLiveData<Integer> v() {
        return this.k;
    }

    public OLiveData<Boolean> w() {
        return this.f5912j;
    }
}
