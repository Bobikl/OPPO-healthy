package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.wearable.watch.R$string;
import com.support.dialog.R$style;

/* JADX INFO: loaded from: classes3.dex */
public class w5l {
    public static AlertDialog a(Context context) {
        return new COUIAlertDialogBuilder(context, R$style.COUIAlertDialog_Rotating).setTitle(R$string.band_network_loading).setCancelable(false).create();
    }

    public static AlertDialog b(Context context) {
        return new COUIAlertDialogBuilder(context, R$style.COUIAlertDialog_Rotating).setTitle(R$string.band_dialog_setting).setCancelable(true).create();
    }
}
