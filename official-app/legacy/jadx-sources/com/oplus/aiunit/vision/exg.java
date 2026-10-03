package com.oplus.aiunit.vision;

import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health.familymode.request.UserInfoRequest;
import com.heytap.health.health.familymode.response.UserInfo;
import com.heytap.health.network.core.BaseResponse;

/* JADX INFO: loaded from: classes16.dex */
public class exg {

    public class a extends ao0<BaseResponse<UserInfo>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OLiveData f11117j;
        public final /* synthetic */ OLiveData k;

        public a(OLiveData oLiveData, OLiveData oLiveData2) {
            this.f11117j = oLiveData;
            this.k = oLiveData2;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BaseResponse<UserInfo> baseResponse) {
            if (baseResponse == null) {
                this.k.postValue(-1);
            } else if (baseResponse.isSuccess()) {
                this.f11117j.postValue(baseResponse.getBody());
            } else {
                this.k.postValue(Integer.valueOf(baseResponse.getErrorCode()));
            }
        }
    }

    public void a(String str, OLiveData<UserInfo> oLiveData, OLiveData<Integer> oLiveData2) {
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.setMobile(str);
        ((x47) com.heytap.health.network.core.a.l(x47.class)).i(userInfoRequest).L0(su8.c()).subscribe(new a(oLiveData, oLiveData2));
    }
}
