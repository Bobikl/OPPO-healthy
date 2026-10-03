package com.heytap.health.settings.watch.schoolmode.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.health.settings.watch.schoolmode.SchoolModeSpHelper;
import com.heytap.health.settings.watch.schoolmode.bean.SchoolModeConfig;
import com.oplus.aiunit.vision.huf;
import com.oplus.aiunit.vision.lhg;
import com.oplus.aiunit.vision.nhg;

/* JADX INFO: loaded from: classes18.dex */
public class TimeSettingViewModel extends ViewModel {
    public SchoolModeConfig i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f5480j;
    public MutableLiveData<huf<SchoolModeConfig>> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public lhg f5481l = new a();

    public class a implements lhg {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.lhg
        public void a(huf hufVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("SchoolModeMessageCallback:");
            sb.append(hufVar);
            if (hufVar.a() == 0) {
                TimeSettingViewModel.this.i = (SchoolModeConfig) hufVar.b();
            }
            TimeSettingViewModel.this.k.postValue(hufVar);
        }
    }

    public void A(int i) {
        w();
        this.i.setAmEndTime(i);
    }

    public void B(int i) {
        w();
        this.i.setAmStartTime(i);
    }

    public void C(int i) {
        w();
        this.i.setPmEndTime(i);
    }

    public void D(int i) {
        w();
        this.i.setPmStartTime(i);
    }

    public void E(int i) {
        w();
        this.i.setRepeatTime(i);
    }

    public void F() {
        nhg.F().a0(this.i, 15000, 1);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        nhg.F().V(this.f5481l);
    }

    public SchoolModeConfig w() {
        if (this.i == null) {
            this.i = SchoolModeSpHelper.f(this.f5480j);
            StringBuilder sb = new StringBuilder();
            sb.append("getSchoolModeConfig:");
            sb.append(this.i);
        }
        return this.i;
    }

    public MutableLiveData<huf<SchoolModeConfig>> x() {
        return this.k;
    }

    public void y(String str) {
        this.f5480j = str;
        nhg.F().Y(this.f5480j);
        nhg.F().E(this.f5481l);
    }

    public SchoolModeConfig z() {
        SchoolModeConfig schoolModeConfigF = SchoolModeSpHelper.f(this.f5480j);
        this.i = schoolModeConfigF;
        return schoolModeConfigF;
    }
}
