package com.oplus.aiunit.vision;

import android.content.DialogInterface;
import android.content.Intent;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/wallet/entrance/ui/activities/EntranceBaseActivity;", "", "b", "d", "entrance_release"}, k = 2, mv = {1, 8, 0})
public final class a3b {
    public static final void b(@NotNull final EntranceBaseActivity entranceBaseActivity) {
        Intrinsics.checkNotNullParameter(entranceBaseActivity, "<this>");
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.z2b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                a3b.c(entranceBaseActivity, dialogInterface, i);
            }
        };
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(entranceBaseActivity);
        healthAlertDialogBuilder.setTitle(R$string.entrance_active_open_gps_title);
        healthAlertDialogBuilder.setMessage(R$string.entrance_active_open_gps_card_msg);
        healthAlertDialogBuilder.setCancelable(false);
        healthAlertDialogBuilder.setPositiveButton(com.heytap.health.base.R$string.lib_base_dialog_notify_go_open, onClickListener);
        healthAlertDialogBuilder.setNegativeButton(com.heytap.health.base.R$string.lib_base_not_yet, onClickListener);
        healthAlertDialogBuilder.show();
    }

    public static final void c(EntranceBaseActivity this_showOpenGpsDialog, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this_showOpenGpsDialog, "$this_showOpenGpsDialog");
        dialogInterface.dismiss();
        if (i == -1) {
            d(this_showOpenGpsDialog);
        }
    }

    public static final void d(EntranceBaseActivity entranceBaseActivity) {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        try {
            entranceBaseActivity.startActivity(intent);
        } catch (Exception unused) {
            intent.setAction("android.settings.SETTINGS");
            try {
                entranceBaseActivity.startActivity(intent);
            } catch (Exception unused2) {
            }
        }
    }
}
