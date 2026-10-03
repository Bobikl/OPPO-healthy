package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.network.door.params.EditCardParam;
import com.heytap.health.wallet.network.door.params.ICCOAEditCardParam;

/* JADX INFO: loaded from: classes18.dex */
public class rz2 {
    public void a(String str, String str2, String str3, String str4, Boolean bool, ie7<Boolean> ie7Var) {
        if (ie7Var == null) {
            return;
        }
        EditCardParam editCardParam = new EditCardParam(str, str4);
        if (!TextUtils.isEmpty(str2)) {
            editCardParam.setAppCode(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            editCardParam.setCardThemeId(Long.valueOf(str3));
        }
        if (bool != null) {
            editCardParam.setFinish(bool);
        }
        ((k06) e7l.INSTANCE.a(k06.class)).m(editCardParam).L0(su8.c()).n0(f30.c()).subscribe(ie7Var);
    }

    public void b(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, ie7<Boolean> ie7Var) {
        if (ie7Var == null) {
            return;
        }
        EditCardParam editCardParam = new EditCardParam(str, str4);
        if (!TextUtils.isEmpty(str2)) {
            editCardParam.setAppCode(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            editCardParam.setCardThemeId(Long.valueOf(str3));
        }
        if (bool != null) {
            editCardParam.setFinish(bool);
        }
        if (str5 != null) {
            editCardParam.setCardType(str5);
        }
        if (str6 != null) {
            editCardParam.setAid(str6);
        }
        ((k06) e7l.INSTANCE.a(k06.class)).m(editCardParam).L0(su8.c()).n0(f30.c()).subscribe(ie7Var);
    }

    public void c(String str, String str2, String str3, ie7<Boolean> ie7Var) {
        if (ie7Var == null) {
            return;
        }
        ((vy2) e7l.INSTANCE.a(vy2.class)).c(new ICCOAEditCardParam(str, str2, str3)).L0(su8.c()).n0(f30.c()).subscribe(ie7Var);
    }
}
