package com.heytap.health.settings.watch.unbindclause;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_wallet.NfcCardService;
import com.oplus.aiunit.vision.m93;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.w85;
import com.oplus.aiunit.vision.xzb;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/device_settings/NfcCardServiceImplEx")
public class NfcCardServiceImplEx implements NfcCardService {
    public m93 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w85 f5649j;
    public w85 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xzb f5650l;

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void Ka(w85 w85Var) {
        this.k = w85Var;
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void L0(m93 m93Var) {
        this.i = m93Var;
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void L3(xzb xzbVar) {
        this.f5650l = null;
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void P0(String str) {
        w85 w85Var = this.k;
        if (w85Var != null) {
            w85Var.onSuccess();
        }
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public List<String> i1() {
        return null;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ml4.a("NfcCardServiceImplEx", "not support nfc");
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void j2(String str) {
        m93 m93Var = this.i;
        if (m93Var != null) {
            m93Var.a(2);
        }
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void k3(w85 w85Var) {
        this.f5649j = w85Var;
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void l2(w85 w85Var) {
        this.f5649j = null;
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void na(String str) {
        xzb xzbVar = this.f5650l;
        if (xzbVar != null) {
            xzbVar.onSuccess();
        }
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void r3(w85 w85Var) {
        this.k = null;
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void s1(String str) {
        w85 w85Var = this.f5649j;
        if (w85Var != null) {
            w85Var.onSuccess();
        }
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void t4(xzb xzbVar) {
        this.f5650l = xzbVar;
    }

    @Override // com.heytap.health.device_wallet.NfcCardService
    public void w6(m93 m93Var) {
        this.i = null;
    }
}
