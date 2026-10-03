package com.accountbase;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import com.heytap.usercenter.accountsdk.helper.AccountPrefUtils;
import com.heytap.usercenter.accountsdk.model.BasicUserInfo;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.core.mvvm.ComputableLiveData;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes12.dex */
class f {

    public class a extends ComputableLiveData<BasicUserInfo> {
        final /* synthetic */ IpcAccountEntity a;

        public a(IpcAccountEntity ipcAccountEntity) {
            this.a = ipcAccountEntity;
        }

        @Override // com.platform.usercenter.basic.core.mvvm.ComputableLiveData
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BasicUserInfo compute() {
            IpcAccountEntity ipcAccountEntity = this.a;
            if (ipcAccountEntity == null) {
                return null;
            }
            String str = !TextUtils.isEmpty(ipcAccountEntity.accountName) ? this.a.accountName : null;
            if (!TextUtils.isEmpty(this.a.ssoid)) {
                str = this.a.ssoid;
            }
            if (!TextUtils.isEmpty(str)) {
                return AccountPrefUtils.getUserInfo(BaseApp.mContext, str);
            }
            UCLogUtil.i("LocalUserInfoDataSourcecacheKey is null");
            return null;
        }
    }

    public LiveData<BasicUserInfo> a(IpcAccountEntity ipcAccountEntity) {
        return new a(ipcAccountEntity).getLiveData();
    }

    public void a(@NonNull IpcAccountEntity ipcAccountEntity, BasicUserInfo basicUserInfo) {
        if (basicUserInfo == null) {
            return;
        }
        String str = !TextUtils.isEmpty(ipcAccountEntity.accountName) ? ipcAccountEntity.accountName : null;
        if (!TextUtils.isEmpty(ipcAccountEntity.ssoid)) {
            str = ipcAccountEntity.ssoid;
        }
        if (TextUtils.isEmpty(str)) {
            UCLogUtil.i("LocalUserInfoDataSourcecacheKey is null");
            return;
        }
        UCLogUtil.i("LocalUserInfoDataSourcesave data success");
        basicUserInfo.validTime = System.currentTimeMillis() + 600000;
        AccountPrefUtils.saveUserInfo(BaseApp.mContext, str, basicUserInfo);
    }
}
