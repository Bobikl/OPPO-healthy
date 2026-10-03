package com.heytap.health.watchpair.family.personalInfo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.oplus.aiunit.vision.tge;

/* JADX INFO: loaded from: classes19.dex */
public class PersonalInfoViewModel extends ViewModel {
    public MutableLiveData<tge> i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public tge f7165j;

    public void A() {
        tge tgeVar = new tge();
        this.f7165j = tgeVar;
        tgeVar.g(-1);
        this.i.postValue(this.f7165j);
    }

    public void B(String str) {
        this.f7165j.f(str);
        this.i.postValue(this.f7165j);
    }

    public void C(boolean z) {
        this.f7165j.h(z ? tge.TYPE_MALE : tge.TYPE_FEMALE);
        this.i.postValue(this.f7165j);
    }

    public void D(int i) {
        this.f7165j.i(i);
        this.i.postValue(this.f7165j);
    }

    public void E(int i) {
        this.f7165j.j(i);
        this.i.postValue(this.f7165j);
    }

    public void u() {
        this.f7165j.g(1);
        this.i.postValue(this.f7165j);
    }

    public void v() {
        this.f7165j.g(0);
        this.f7165j.h(tge.TYPE_MALE);
        this.i.postValue(this.f7165j);
    }

    public void w() {
        this.f7165j.g(2);
        this.i.postValue(this.f7165j);
    }

    public void x() {
        this.f7165j.g(3);
        this.i.postValue(this.f7165j);
    }

    public MutableLiveData<tge> y() {
        return this.i;
    }

    public tge z() {
        return this.f7165j;
    }
}
