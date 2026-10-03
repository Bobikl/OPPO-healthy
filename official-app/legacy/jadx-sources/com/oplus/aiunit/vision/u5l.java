package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.device_settings.impl.R$string;
import com.support.dialog.R$style;

/* JADX INFO: loaded from: classes17.dex */
public class u5l {
    public static AlertDialog a(Context context) {
        return new COUIAlertDialogBuilder(context, R$style.COUIAlertDialog_Rotating).setTitle(R$string.band_settings_moresettings_wait_setting).setCancelable(false).create();
    }
}
