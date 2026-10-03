package com.heytap.health.family.setting.viewmodel;

import androidx.lifecycle.ViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.family.QrCodeData;
import com.heytap.health.health.familymode.response.UserInfo;
import com.oplus.aiunit.vision.exg;

/* JADX INFO: loaded from: classes16.dex */
public class SettingEnterViewModel extends ViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OLiveData<QrCodeData> f4254j = new OLiveData<>();
    public final OLiveData<UserInfo> k = new OLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OLiveData<Integer> f4255l = new OLiveData<>();
    public final exg i = new exg();

    public OLiveData<QrCodeData> u() {
        return this.f4254j;
    }

    public OLiveData<Integer> v() {
        return this.f4255l;
    }

    public OLiveData<UserInfo> w() {
        return this.k;
    }

    public void x(String str) {
        this.i.a(str, this.k, this.f4255l);
    }
}
