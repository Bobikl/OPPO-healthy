package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;
import com.heytap.health.health.familymode.request.FriendListRequest;
import com.heytap.health.health.familymode.response.FriendList;

/* JADX INFO: loaded from: classes16.dex */
public class o37 {
    public static final String TAG = "FamilyHealthCardRepository";

    public class a extends u61<FriendList> {
        public final /* synthetic */ MutableLiveData i;

        public a(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b(o37.TAG, "getFriendList onFailure" + str);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(FriendList friendList) {
            this.i.postValue(friendList);
        }
    }

    public void a(MutableLiveData<FriendList> mutableLiveData) {
        FriendListRequest friendListRequest = new FriendListRequest();
        friendListRequest.setGroupType(1);
        friendListRequest.setIncludeInviting(true);
        friendListRequest.setIncludeVirtualAccount(true);
        ((x47) com.heytap.health.network.core.a.l(x47.class)).l(friendListRequest).L0(su8.c()).subscribe(new a(mutableLiveData));
    }
}
