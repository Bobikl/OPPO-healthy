package com.oplus.aiunit.vision;

import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.health.familymode.request.RemoveRequest;
import com.heytap.health.health.familymode.request.SharedDataTypeListRequest;
import com.heytap.health.health.familymode.request.UpdateFriendInfoRequest;
import com.heytap.health.health.familymode.request.UpdateShareDataTypeRequest;
import com.heytap.health.health.familymode.response.FriendSharedDataTypeList;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class a77 {

    public class a extends ao0<BaseResponse<FriendSharedDataTypeList>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OLiveData f9223j;

        public a(OLiveData oLiveData) {
            this.f9223j = oLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BaseResponse<FriendSharedDataTypeList> baseResponse) {
            if (baseResponse != null && baseResponse.isSuccess() && baseResponse.getBody() != null) {
                this.f9223j.postValue(baseResponse.getBody());
            } else {
                s47.c("FamilyShareSettingRepository", "getFriendShareList error ");
                this.f9223j.postValue(null);
            }
        }
    }

    public class b extends ao0<BaseResponse> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OLiveData f9224j;

        public b(OLiveData oLiveData) {
            this.f9224j = oLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BaseResponse baseResponse) {
            if (baseResponse != null) {
                s47.c("FamilyShareSettingRepository", "updateFriendInfo error code = " + baseResponse.getErrorCode());
                this.f9224j.postValue(Integer.valueOf(baseResponse.getErrorCode()));
            }
        }
    }

    public class c extends ao0<BaseResponse> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OLiveData f9225j;

        public c(OLiveData oLiveData) {
            this.f9225j = oLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BaseResponse baseResponse) {
            if (baseResponse != null) {
                s47.c("FamilyShareSettingRepository", "updateShareSetting error code = " + baseResponse.getErrorCode());
                this.f9225j.postValue(Integer.valueOf(baseResponse.getErrorCode()));
            }
        }
    }

    public class d extends ao0<BaseResponse> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OLiveData f9226j;

        public d(OLiveData oLiveData) {
            this.f9226j = oLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(BaseResponse baseResponse) {
            if (baseResponse != null) {
                s47.c("FamilyShareSettingRepository", "removeFriend error code = " + baseResponse.getErrorCode());
                this.f9226j.postValue(Integer.valueOf(baseResponse.getErrorCode()));
            }
        }
    }

    public void a(OLiveData<FriendSharedDataTypeList> oLiveData, String str) {
        SharedDataTypeListRequest sharedDataTypeListRequest = new SharedDataTypeListRequest();
        sharedDataTypeListRequest.setFriendSsoid(str);
        sharedDataTypeListRequest.setGroupType(1);
        sharedDataTypeListRequest.setQueryDefault(SpeechConstant.FALSE_STR);
        ((x47) com.heytap.health.network.core.a.l(x47.class)).b(sharedDataTypeListRequest).L0(su8.c()).subscribe(new a(oLiveData));
    }

    public void b(OLiveData<Integer> oLiveData, String str) {
        RemoveRequest removeRequest = new RemoveRequest();
        removeRequest.setGroupType(1);
        removeRequest.setFriendSsoid(str);
        ((x47) com.heytap.health.network.core.a.l(x47.class)).h(removeRequest).L0(su8.c()).subscribe(new d(oLiveData));
    }

    public void c(OLiveData<Integer> oLiveData, String str, String str2) {
        UpdateFriendInfoRequest updateFriendInfoRequest = new UpdateFriendInfoRequest();
        updateFriendInfoRequest.setGroupType(1);
        updateFriendInfoRequest.setFriendSsoid(str);
        updateFriendInfoRequest.setFriendNickname(str2);
        ((x47) com.heytap.health.network.core.a.l(x47.class)).j(updateFriendInfoRequest).L0(su8.c()).subscribe(new b(oLiveData));
    }

    public void d(OLiveData<Integer> oLiveData, String str, ArrayList<Integer> arrayList) {
        UpdateShareDataTypeRequest updateShareDataTypeRequest = new UpdateShareDataTypeRequest();
        updateShareDataTypeRequest.setGroupType(1);
        updateShareDataTypeRequest.setFriendSsoid(str);
        updateShareDataTypeRequest.setSharedDataTypeList(arrayList);
        ((x47) com.heytap.health.network.core.a.l(x47.class)).e(updateShareDataTypeRequest).L0(su8.c()).subscribe(new c(oLiveData));
    }
}
