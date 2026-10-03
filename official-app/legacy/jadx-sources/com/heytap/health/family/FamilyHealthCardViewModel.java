package com.heytap.health.family;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.health.health.familymode.response.FriendList;
import com.oplus.aiunit.vision.o37;

/* JADX INFO: loaded from: classes16.dex */
public class FamilyHealthCardViewModel extends ViewModel {
    public final o37 i = new o37();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableLiveData<FriendList> f4211j = new MutableLiveData<>();

    public MutableLiveData<FriendList> u() {
        return this.f4211j;
    }

    public void v() {
        this.i.a(this.f4211j);
    }
}
