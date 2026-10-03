package com.heytap.sports.move.treadmill.ui.treadmill;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.sports.move.treadmill.manager.RunData;
import com.oplus.aiunit.vision.f2g;
import com.oplus.aiunit.vision.rbk;
import com.oplus.aiunit.vision.vbb;

/* JADX INFO: loaded from: classes2.dex */
public class TreadmillRunningViewModel extends BaseViewModel {
    public static final String TAG = "TreadmillRunningViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rbk f7923j = rbk.u();
    public f2g k;

    public LiveData<RunData> A() {
        return this.f7923j.v();
    }

    public LiveData<Integer> B() {
        return this.f7923j.w();
    }

    public boolean C() {
        f2g f2gVar = this.k;
        if (f2gVar == null) {
            return false;
        }
        int iG = f2gVar.f().g();
        StringBuilder sb = new StringBuilder();
        sb.append("needSaveDataForDistance--->totalDistance:");
        sb.append(iG);
        return iG >= 200;
    }

    public void D() {
        this.f7923j.S();
    }

    public void E() {
        f2g f2gVar = this.k;
        if (f2gVar != null) {
            f2gVar.h();
        }
    }

    public LiveData<OneTimeSport> F() {
        f2g f2gVar = this.k;
        if (f2gVar != null) {
            return f2gVar.i();
        }
        return null;
    }

    public void G(String str) {
        this.k.j(str);
    }

    public void start() {
        if (this.k == null) {
            this.k = new f2g();
            String strS = this.f7923j.s();
            StringBuilder sb = new StringBuilder();
            sb.append("treadmillManager.getBleMac(): ");
            sb.append(strS);
            if (!TextUtils.isEmpty(strS)) {
                this.k.k(vbb.b(strS));
            }
        }
        this.f7923j.n(this.k);
    }

    public LiveData<Integer> v(String str) {
        MutableLiveData<Integer> mutableLiveDataT = this.f7923j.t();
        this.f7923j.p(str, false);
        return mutableLiveDataT;
    }

    public void w() {
        f2g f2gVar = this.k;
        if (f2gVar != null) {
            f2gVar.c();
        }
    }

    public void x() {
        this.k.d();
    }

    public LiveData<Integer> y() {
        return this.f7923j.t();
    }

    public float z() {
        f2g f2gVar = this.k;
        if (f2gVar != null) {
            return f2gVar.e();
        }
        return 0.0f;
    }
}
