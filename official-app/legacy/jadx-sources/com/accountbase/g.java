package com.accountbase;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import com.heytap.usercenter.accountsdk.http.AccountBasicParam;
import com.heytap.usercenter.accountsdk.http.UCServiceApi;
import com.heytap.usercenter.accountsdk.model.BasicUserInfo;
import com.platform.usercenter.basic.core.mvvm.ApiResponse;
import com.platform.usercenter.basic.core.mvvm.BaseApiResponse;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;

/* JADX INFO: loaded from: classes12.dex */
class g {
    private final UCServiceApi a;

    public class a extends BaseApiResponse<BasicUserInfo> {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.platform.usercenter.basic.core.mvvm.BaseApiResponse
        @NonNull
        public LiveData<ApiResponse<CoreResponse<BasicUserInfo>>> createCall() {
            return g.this.a.queryUserBasicInfo(new AccountBasicParam(this.a));
        }
    }

    public g(@NonNull UCServiceApi uCServiceApi) {
        this.a = uCServiceApi;
    }

    public LiveData<CoreResponse<BasicUserInfo>> a(String str) {
        return new a(str).asLiveData();
    }
}
