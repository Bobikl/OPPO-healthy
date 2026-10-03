package com.heytap.health.watchpair.family;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_pair.FamilyAccoutManagerApi;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.oplus.aiunit.vision.m17;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/device_pair/FamilyAccoutManager")
public class FamilyAccountManagerImpl implements FamilyAccoutManagerApi {
    @Override // com.heytap.health.device_pair.FamilyAccoutManagerApi
    public void Sa(@NonNull VirtualAccountData virtualAccountData, @NonNull FamilyAccoutManagerApi.b<VirtualAccountData> bVar) {
        m17.l().u(virtualAccountData, bVar);
    }

    @Override // com.heytap.health.device_pair.FamilyAccoutManagerApi
    public void X7(@NonNull String str, @NonNull FamilyAccoutManagerApi.b<Object> bVar) {
        m17.l().j(str, bVar);
    }

    @Override // com.heytap.health.device_pair.FamilyAccoutManagerApi
    public void f2(@NonNull String str, @NonNull FamilyAccoutManagerApi.b<Object> bVar) {
        m17.l().v(str, bVar);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }
}
