package com.heytap.health.family.setting.viewmodel;

import androidx.lifecycle.ViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health.familymode.response.FriendSharedDataTypeList;
import com.oplus.aiunit.vision.a77;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class FamilyShareSettingViewModel extends ViewModel {
    public final a77 i = new a77();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OLiveData<Integer> f4252j = new OLiveData<>();
    public final OLiveData<Integer> k = new OLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OLiveData<Integer> f4253l = new OLiveData<>();
    public final OLiveData<FriendSharedDataTypeList> m = new OLiveData<>();

    public void A(String str, String str2) {
        this.i.c(this.k, str, str2);
    }

    public void B(String str, ArrayList<Integer> arrayList) {
        this.i.d(this.f4253l, str, arrayList);
    }

    public OLiveData<Integer> u() {
        return this.f4252j;
    }

    public OLiveData<FriendSharedDataTypeList> v() {
        return this.m;
    }

    public OLiveData<Integer> w() {
        return this.k;
    }

    public OLiveData<Integer> x() {
        return this.f4253l;
    }

    public void y(String str) {
        this.i.a(this.m, str);
    }

    public void z(String str) {
        this.i.b(this.f4252j, str);
    }
}
