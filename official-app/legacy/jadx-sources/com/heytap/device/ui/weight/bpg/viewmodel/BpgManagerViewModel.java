package com.heytap.device.ui.weight.bpg.viewmodel;

import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.device.third.bgp.BpgBean;
import com.heytap.health.device.third.bgp.IBpgService;
import com.oplus.aiunit.vision.x0;

/* JADX INFO: loaded from: classes15.dex */
public class BpgManagerViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBpgService f3043j = (IBpgService) x0.d().b("/device/BpgServiceImpl").navigation();

    public void v(BpgBean bpgBean, IBpgService.b bVar) {
        this.f3043j.O6(bpgBean, bVar);
    }
}
