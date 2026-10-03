package com.heytap.health.base.splitapk;

import android.content.DialogInterface;
import android.os.Bundle;
import com.heytap.health.base.R$string;
import com.heytap.health.base.splitapk.connection.SplitBusiness;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.oplus.aiunit.vision.a7b;
import com.oplus.oms.split.full.core.ObtainUserConfirmationDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class PluginConfirmActivity extends ObtainUserConfirmationDialog {
    public static final String TAG = "PluginConfirmActivity";

    public PluginConfirmActivity() {
        a7b.f(TAG, "init PluginConfirmActivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        onUserConfirm();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(DialogInterface dialogInterface, int i) {
        onUserCancel();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(DialogInterface dialogInterface) {
        finish();
    }

    @Override // com.oplus.oms.split.full.core.ObtainUserConfirmationDialog
    public boolean checkInternParametersIllegal() {
        a7b.f(TAG, "checkInternParametersIllegal");
        return super.checkInternParametersIllegal();
    }

    public final List<String> d() {
        List<String> moduleNames = getModuleNames();
        ArrayList arrayList = new ArrayList(moduleNames.size());
        for (String str : moduleNames) {
            boolean z = false;
            for (SplitBusiness splitBusiness : SplitBusiness.values()) {
                if (Objects.equals(str, splitBusiness.getSplitName())) {
                    arrayList.add(getString(splitBusiness.getBusinessTextId()));
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // com.oplus.oms.split.full.core.ObtainUserConfirmationDialog
    public List<String> getModuleNames() {
        a7b.f(TAG, "getModuleNames");
        return super.getModuleNames();
    }

    @Override // com.oplus.oms.split.full.core.ObtainUserConfirmationDialog
    public long getRealTotalBytesNeedToDownload() {
        a7b.f(TAG, "getRealTotalBytesNeedToDownload");
        return super.getRealTotalBytesNeedToDownload() / 1048576;
    }

    @Override // com.oplus.oms.split.full.core.ObtainUserConfirmationDialog, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a7b.f(TAG, "onCreate");
        String string = getString(R$string.lib_base_update_plugin_or_not, d().toString(), Long.toString(getRealTotalBytesNeedToDownload()));
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(this);
        healthAlertDialogBuilder.X(17);
        healthAlertDialogBuilder.setTitle(R$string.lib_base_plugin_update);
        healthAlertDialogBuilder.setMessage(string);
        healthAlertDialogBuilder.setPositiveButton(R$string.lib_base_plugin_update_confirm, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ime
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.e(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.setNegativeButton(R$string.lib_base_plugin_update_cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.jme
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.f(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.kme
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.i.g(dialogInterface);
            }
        });
        healthAlertDialogBuilder.show();
    }

    @Override // com.oplus.oms.split.full.core.ObtainUserConfirmationDialog
    public void onUserCancel() {
        super.onUserCancel();
        a7b.f(TAG, "onUserCancel");
    }

    @Override // com.oplus.oms.split.full.core.ObtainUserConfirmationDialog
    public void onUserConfirm() {
        super.onUserConfirm();
        a7b.f(TAG, "onUserConfirm");
    }
}
