package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.device_settings.band.IBandReConnectService;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.devicemanager.util.BluetoothUtil;

/* JADX INFO: loaded from: classes17.dex */
public class xw0 {
    @Nullable
    public static AlertDialog c(Context context, String str, final IBandReConnectService.a aVar) {
        BluetoothUtil bluetoothUtil = BluetoothUtil.INSTANCE;
        if (!bluetoothUtil.j() || !bluetoothUtil.g() || bluetoothUtil.k(str)) {
            aVar.b();
            return null;
        }
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(context);
        healthAlertDialogBuilder.setTitle(context.getString(R$string.band_dialog_reconnect_title));
        healthAlertDialogBuilder.setMessage(context.getString(R$string.band_dialog_reconnect_msg_new));
        healthAlertDialogBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.vw0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        healthAlertDialogBuilder.setPositiveButton(context.getString(R$string.band_dialog_reconnect_action), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ww0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                xw0.e(aVar, dialogInterface, i);
            }
        });
        AlertDialog alertDialogCreate = healthAlertDialogBuilder.create();
        alertDialogCreate.show();
        return alertDialogCreate;
    }

    public static /* synthetic */ void e(IBandReConnectService.a aVar, DialogInterface dialogInterface, int i) {
        aVar.a();
        dialogInterface.dismiss();
    }
}
