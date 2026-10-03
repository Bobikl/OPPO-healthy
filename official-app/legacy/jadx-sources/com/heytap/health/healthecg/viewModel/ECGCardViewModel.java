package com.heytap.health.healthecg.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.health.base.switchManager.SpecialSwitchBean;
import com.oplus.aiunit.vision.u86;

/* JADX INFO: loaded from: classes16.dex */
public class ECGCardViewModel extends ViewModel {
    public final MutableLiveData<ECGRecord> i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableLiveData<ECGRecord> f4626j = new MutableLiveData<>();
    public final MutableLiveData<SpecialSwitchBean> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u86 f4627l = new u86();

    public void u() {
        this.f4627l.b(this.i);
    }

    public MutableLiveData<ECGRecord> v() {
        return this.i;
    }

    public MutableLiveData<ECGRecord> w() {
        return this.f4626j;
    }

    public MutableLiveData<SpecialSwitchBean> x() {
        return this.k;
    }

    public void y(int i) {
        this.f4627l.d(this.k, i);
    }
}
