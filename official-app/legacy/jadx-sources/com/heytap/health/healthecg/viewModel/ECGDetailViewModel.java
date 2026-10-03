package com.heytap.health.healthecg.viewModel;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.databaseengine.model.ECGRecord;
import com.oplus.aiunit.vision.fa6;
import com.oplus.aiunit.vision.kde;
import com.oplus.aiunit.vision.u96;

/* JADX INFO: loaded from: classes16.dex */
public class ECGDetailViewModel extends ViewModel {
    public final u96 i = new u96();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableLiveData<ECGRecord> f4628j = new MutableLiveData<>();
    public final MutableLiveData<kde> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableLiveData<Boolean> f4629l = new MutableLiveData<>();
    public int m = 10;

    public void A(String str, String str2) {
        this.i.l(str, str2);
    }

    public void u(String str) {
        this.i.f(str, this.f4629l);
    }

    public void v(String str, String str2) {
        this.i.g(str, str2, this.f4628j);
    }

    public MutableLiveData<Boolean> w() {
        return this.f4629l;
    }

    public MutableLiveData<ECGRecord> x() {
        return this.f4628j;
    }

    public MutableLiveData<kde> y() {
        return this.k;
    }

    public void z(Context context, ECGRecord eCGRecord, int i) {
        if (this.m != i) {
            fa6.d().a();
            this.m = i;
        }
        if (fa6.d().c()) {
            this.k.postValue(fa6.d().e());
        } else {
            this.i.k(this.k, context, eCGRecord, i);
        }
    }
}
