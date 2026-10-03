package com.heytap.health.family.detail.detailcard;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.databaseengine.model.ECGRecord;
import com.oplus.aiunit.vision.a96;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ECGDataCardViewModel extends ViewModel {
    public MutableLiveData<ECGRecord> i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MutableLiveData<List<ECGRecord>> f4227j = new MutableLiveData<>();
    public a96 k = new a96();

    public void u(String str, long j2, long j3) {
        this.k.c(this.f4227j, str, j2, j3);
    }

    public void v(MutableLiveData<ECGRecord> mutableLiveData, String str, String str2) {
        this.k.b(str, str2, mutableLiveData);
    }

    public MutableLiveData<List<ECGRecord>> w() {
        return this.f4227j;
    }

    public MutableLiveData<ECGRecord> x() {
        return this.i;
    }
}
