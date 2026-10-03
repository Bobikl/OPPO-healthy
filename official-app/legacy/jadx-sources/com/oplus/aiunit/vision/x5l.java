package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.bandface.R$string;
import com.support.dialog.R$style;

/* JADX INFO: loaded from: classes15.dex */
public class x5l {
    public static AlertDialog a(Context context) {
        return new COUIAlertDialogBuilder(context, R$style.COUIAlertDialog_Rotating).setTitle(R$string.band_network_loading).setCancelable(false).create();
    }
}
