package com.heytap.sports.move.treadmill.ui.treadmill;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.sports.move.treadmill.manager.RunData;
import com.oplus.aiunit.vision.c9k;
import com.oplus.aiunit.vision.ebk;
import com.oplus.aiunit.vision.hh1;
import com.oplus.aiunit.vision.qg1;
import com.oplus.aiunit.vision.rbk;

/* JADX INFO: loaded from: classes2.dex */
public class SportDeviceConnectViewModel extends BaseViewModel {
    public static final int STATUS_HAS_START = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rbk f7916j = rbk.u();
    public MutableLiveData<Integer> k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7917l = -1;
    public final String m = "SportDeviceConnectViewModel";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Observer<Integer> f7918n = new Observer() { // from class: com.oplus.aiunit.vision.qai
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.E((Integer) obj);
        }
    };
    public Observer<ebk> o = new Observer() { // from class: com.oplus.aiunit.vision.rai
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.i.F((ebk) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Integer num) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("treadmillStatus: ");
        sb.append(num);
        if (num.intValue() == 1 && ((i = this.f7917l) == 13 || i == 14)) {
            this.k.postValue(1000);
        } else {
            this.k.postValue(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ebk ebkVar) {
        int i = this.f7917l;
        if (i == 13 || i == 14) {
            RunData value = this.f7916j.v().getValue();
            StringBuilder sb = new StringBuilder();
            sb.append("treadmillData: ");
            sb.append(value);
            if (D(value)) {
                this.k.postValue(1000);
            }
        }
    }

    public LiveData<Integer> A() {
        this.f7916j.w().observeForever(this.f7918n);
        return this.k;
    }

    public boolean B(String str) {
        return this.f7916j.y(str);
    }

    public boolean C(String str) {
        return B(str) && this.f7916j.A();
    }

    public final boolean D(RunData runData) {
        StringBuilder sb = new StringBuilder();
        sb.append("isTreadmillStart: ");
        sb.append(runData);
        if (runData == null || runData.elapsedTime <= 0) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("treadmill data time:");
        sb2.append(runData.elapsedTime);
        return true;
    }

    public final void G(hh1 hh1Var) {
        RunData value;
        if (hh1Var.c()) {
            this.f7917l = new c9k(hh1Var.b()).e();
            StringBuilder sb = new StringBuilder();
            sb.append("readTrainingStatus---mTrainingStatus: ");
            sb.append(this.f7917l);
            if (this.f7917l == 13 && (value = this.f7916j.v().getValue()) != null && value.elapsedTime > 0) {
                this.k.postValue(1000);
                this.f7916j.Q();
                return;
            }
        }
        this.f7916j.w().observeForever(this.f7918n);
    }

    public void H() {
        this.f7916j.P();
    }

    public void I() {
        this.f7916j.R(new qg1() { // from class: com.oplus.aiunit.vision.sai
            @Override // com.oplus.aiunit.vision.qg1
            public final void a(hh1 hh1Var) {
                this.a.G(hh1Var);
            }
        });
    }

    public void J() {
        this.f7916j.S();
    }

    @Override // com.heytap.health.base.base.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f7916j.w().removeObserver(this.f7918n);
    }

    public final LiveData<Integer> y(String str, boolean z) {
        MutableLiveData<Integer> mutableLiveDataT = this.f7916j.t();
        if (z) {
            this.f7916j.B(str);
        } else {
            this.f7916j.q(str);
        }
        return mutableLiveDataT;
    }

    public LiveData<Integer> z(String str) {
        return y(str, true);
    }
}
