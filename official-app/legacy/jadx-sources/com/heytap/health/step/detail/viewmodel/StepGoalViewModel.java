package com.heytap.health.step.detail.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.databaseengine.model.SportDataStat;
import com.oplus.aiunit.vision.wri;

/* JADX INFO: loaded from: classes18.dex */
public class StepGoalViewModel extends ViewModel {
    public wri i = new wri();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<String> f6023j = new MutableLiveData<>();
    public MutableLiveData<Integer> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MutableLiveData<Integer> f6024l = new MutableLiveData<>();
    public SportDataStat m = new SportDataStat();

    public MutableLiveData<String> u() {
        if (this.f6023j == null) {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
            this.f6023j = mutableLiveData;
            this.i.c(mutableLiveData);
        }
        return this.f6023j;
    }

    public MutableLiveData<String> v() {
        this.i.c(this.f6023j);
        return this.f6023j;
    }

    public MutableLiveData<String> w(int i) {
        this.i.d(i, this.k, this.f6023j);
        return this.f6023j;
    }
}
