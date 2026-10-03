package com.heytap.device.ui.weight.bpg.viewmodel;

import androidx.lifecycle.LiveData;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.device.third.bgp.BpgBean;
import com.heytap.health.device.third.bgp.IBpgService;
import com.oplus.aiunit.vision.x0;

/* JADX INFO: loaded from: classes15.dex */
public class BpgSearchBindViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBpgService f3044j = (IBpgService) x0.d().b("/device/BpgServiceImpl").navigation();

    public void v() {
        this.f3044j.O0();
    }

    public LiveData<BpgBean> w(String str) {
        return this.f3044j.M6(str);
    }
}
