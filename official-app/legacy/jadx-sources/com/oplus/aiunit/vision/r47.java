package com.oplus.aiunit.vision;

import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health.familymode.request.FriendListRequest;
import com.heytap.health.health.familymode.request.InviteRequest;
import com.heytap.health.health.familymode.request.ReplyInvitationRequest;
import com.heytap.health.health.familymode.response.FriendList;
import com.heytap.health.health.familymode.response.InviteResponse;
import com.heytap.health.network.core.BaseResponse;

/* JADX INFO: loaded from: classes16.dex */
public class r47 {

    public class a extends u61<FriendList> {
        public final /* synthetic */ OLiveData i;

        public a(OLiveData oLiveData) {
            this.i = oLiveData;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            this.i.postValue(null);
            s47.b("FamilyHealthSettingRepository", "getFriendList onFailure" + str);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(FriendList friendList) {
            this.i.postValue(friendList);
        }
    }

    public class b extends ao0<BaseResponse<InviteResponse>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OLiveData f16056j;

        public b(OLiveData oLiveData) {
            this.f16056j = oLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BaseResponse<InviteResponse> baseResponse) {
            InviteResponse inviteResponse;
            if (baseResponse.getBody() != null) {
                inviteResponse = baseResponse.getBody();
                this.f16056j.postValue(baseResponse.getBody());
            } else {
                inviteResponse = new InviteResponse();
                s47.b("FamilyHealthSettingRepository", "getFriendList onFailure" + baseResponse.getMessage());
                this.f16056j.postValue(null);
            }
            inviteResponse.setErrorCode(baseResponse.getErrorCode());
            this.f16056j.postValue(inviteResponse);
        }
    }

    public class c extends ao0<BaseResponse> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OLiveData f16057j;

        public c(OLiveData oLiveData) {
            this.f16057j = oLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BaseResponse baseResponse) {
            if (baseResponse.getErrorCode() == 0) {
                this.f16057j.postValue(Integer.valueOf(baseResponse.getErrorCode()));
                return;
            }
            this.f16057j.postValue(Integer.valueOf(baseResponse.getErrorCode()));
            s47.b("FamilyHealthSettingRepository", "getFriendList onFailure" + baseResponse.getMessage());
        }
    }

    public void a(OLiveData<FriendList> oLiveData) {
        FriendListRequest friendListRequest = new FriendListRequest();
        friendListRequest.setGroupType(1);
        friendListRequest.setIncludeInviting(true);
        friendListRequest.setIncludeVirtualAccount(true);
        ((x47) com.heytap.health.network.core.a.l(x47.class)).l(friendListRequest).L0(su8.c()).subscribe(new a(oLiveData));
    }

    public void b(OLiveData<Integer> oLiveData, ReplyInvitationRequest replyInvitationRequest) {
        ((x47) com.heytap.health.network.core.a.l(x47.class)).f(replyInvitationRequest).L0(su8.c()).subscribe(new c(oLiveData));
    }

    public void c(OLiveData<InviteResponse> oLiveData, InviteRequest inviteRequest) {
        ((x47) com.heytap.health.network.core.a.l(x47.class)).k(inviteRequest).L0(su8.c()).subscribe(new b(oLiveData));
    }
}
