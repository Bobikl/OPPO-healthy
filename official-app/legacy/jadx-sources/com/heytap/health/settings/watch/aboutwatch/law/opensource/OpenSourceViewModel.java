package com.heytap.health.settings.watch.aboutwatch.law.opensource;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.oplus.aiunit.vision.aqf;
import com.oplus.aiunit.vision.kc7;
import com.oplus.aiunit.vision.orf;
import com.oplus.aiunit.vision.ub0;
import com.oplus.aiunit.vision.xld;
import com.oplus.aiunit.vision.yrf;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class OpenSourceViewModel extends ViewModel {
    public MutableLiveData<ub0> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<yrf> f5437j;
    public MutableLiveData<yrf> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MutableLiveData<orf> f5438l;
    public MutableLiveData<kc7> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public xld f5439n = new xld();

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f5439n.f();
    }

    public MutableLiveData<orf> u(List<aqf> list) {
        if (this.f5438l == null) {
            this.f5438l = new MutableLiveData<>();
        }
        this.f5439n.e(list, this.f5438l);
        return this.f5438l;
    }

    public MutableLiveData<kc7> v(String str) {
        if (this.m == null) {
            this.m = new MutableLiveData<>();
        }
        this.f5439n.g(str, this.m);
        return this.m;
    }

    public MutableLiveData<yrf> w(String str, int i) {
        if (this.k == null) {
            this.k = new MutableLiveData<>();
        }
        this.f5439n.h(str, i, this.k);
        return this.k;
    }

    public MutableLiveData<ub0> x() {
        if (this.i == null) {
            this.i = new MutableLiveData<>();
        }
        this.f5439n.i(this.i);
        return this.i;
    }

    public MutableLiveData<yrf> y(String str, String str2) {
        if (this.f5437j == null) {
            this.f5437j = new MutableLiveData<>();
        }
        this.f5439n.j(str, str2, this.f5437j);
        return this.f5437j;
    }

    public void z(String str) {
    }
}
