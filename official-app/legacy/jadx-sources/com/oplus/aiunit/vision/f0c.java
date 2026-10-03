package com.oplus.aiunit.vision;

import androidx.lifecycle.MutableLiveData;
import com.heytap.health.health.familymode.request.FriendListRequest;
import com.heytap.health.health.familymode.response.FriendList;

/* JADX INFO: loaded from: classes17.dex */
public class f0c {

    public class a extends u61<FriendList> {
        public final /* synthetic */ MutableLiveData i;

        public a(MutableLiveData mutableLiveData) {
            this.i = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b("MineRepository", "getFriendList onFailure" + str);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(FriendList friendList) {
            if (friendList == null || ((friendList.getInviterList() == null || friendList.getInviterList().size() <= 0) && ((friendList.getFriendList() == null || friendList.getFriendList().size() <= 0) && (friendList.getInviteeList() == null || friendList.getInviteeList().size() <= 0)))) {
                this.i.postValue(-1);
            } else {
                this.i.postValue(0);
            }
        }
    }

    public void a(MutableLiveData<Integer> mutableLiveData) {
        FriendListRequest friendListRequest = new FriendListRequest();
        friendListRequest.setGroupType(1);
        friendListRequest.setIncludeInviting(true);
        friendListRequest.setIncludeVirtualAccount(true);
        ((x47) com.heytap.health.network.core.a.l(x47.class)).l(friendListRequest).L0(su8.c()).subscribe(new a(mutableLiveData));
    }
}
