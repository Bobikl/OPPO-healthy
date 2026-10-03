package com.heytap.health.wallet.bus.impl;

import android.app.Activity;
import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.wallet.bus.ui.activities.NfcRechargeDetailActivity;
import com.heytap.wallet.business.bus.router.BusOperaterService;
import com.oplus.aiunit.vision.d04;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.mfg;
import com.oplus.aiunit.vision.v13;
import com.oplus.aiunit.vision.x81;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/bus/traffic/operateService")
public class BusOperaterServiceImp implements BusOperaterService {
    public static boolean gotoSwipeActivity = true;

    @Override // com.heytap.wallet.business.bus.router.BusOperaterService
    public void I(Activity activity, String str, String str2, int i, String str3, String str4) {
        if ("SUC".equalsIgnoreCase(str)) {
            h1(activity, str2);
            return;
        }
        if (d04.CARD_STATUS_OPENING.equalsIgnoreCase(str)) {
            Q2(activity, str2, str4, str, str3);
            return;
        }
        if (d04.CARD_STATUS_SHIFT_OUTING.equalsIgnoreCase(str)) {
            mfg.c(activity, str2, str4, "", str3, true, false, "shiftout", "", "", 0);
            return;
        }
        if (d04.CARD_STATUS_SHIFT_INING.equalsIgnoreCase(str)) {
            mfg.c(activity, str2, str4, "", str3, true, false, "shiftin", "", "", 0);
            return;
        }
        if (d04.CARD_STATUS_SHIFT_IN.equalsIgnoreCase(str) && c(i, activity)) {
            if (v13.g(str4)) {
                mfg.k(activity, "shiftin", str, str2, i);
            } else {
                mfg.c(activity, str2, str4, "", str3, false, true, "shiftin", "", "", i);
            }
        }
    }

    @Override // com.heytap.wallet.business.bus.router.BusOperaterService
    public void M3(Activity activity, String str, String str2, String str3, String str4) {
        NfcRechargeDetailActivity.f8(activity, str, str2, str3, str4);
    }

    public final void Q2(Activity activity, String str, String str2, String str3, String str4) {
        mfg.f(activity, str, str2, str3, str4);
    }

    public final boolean c(int i, Context context) {
        if (i < 5) {
            return true;
        }
        new HealthAlertDialogBuilder(context).setTitle(R$string.wallet_dialog_no_title).setMessage(R$string.cards_list_limit_title).setPositiveButton(R$string.sure, null).show();
        return false;
    }

    public final void h1(Activity activity, String str) {
        mfg.h(activity, str);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.wallet.business.bus.router.BusOperaterService
    public void v6(Context context) {
        if (k7l.a()) {
            x81.c(context, "/bus/chooseCard");
        }
    }
}
