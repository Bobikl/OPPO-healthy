package com.heytap.health.settings.watch.unbindclause;

import android.content.Context;
import android.content.DialogInterface;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.interconnection.esim.DeleteEsimService;
import com.oplus.aiunit.vision.c93;
import com.oplus.aiunit.vision.p85;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/device_settings/DeleteEsimServiceImplEx")
public class DeleteEsimServiceImplEx implements DeleteEsimService {
    public c93 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p85 f5648j;

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void Da() {
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void H5(p85 p85Var) {
        this.f5648j = null;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public int O8(int i) {
        return i;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void Oa(String str) {
        p85 p85Var = this.f5648j;
        if (p85Var != null) {
            p85Var.d();
        }
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public COUIAlertDialogBuilder P8(COUIAlertDialogBuilder cOUIAlertDialogBuilder, DialogInterface.OnClickListener onClickListener) {
        return cOUIAlertDialogBuilder;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void R2(p85 p85Var) {
        this.f5648j = p85Var;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void X9(c93 c93Var) {
        this.i = null;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void ha() {
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void v3(c93 c93Var) {
        this.i = c93Var;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void v9(String str) {
        c93 c93Var = this.i;
        if (c93Var != null) {
            c93Var.a(false);
        }
    }
}
