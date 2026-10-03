package com.heytap.store.business.component.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.heytap.nearx.uikit.widget.dialogview.NearAlertDialogBuilder;
import com.heytap.store.base.core.util.FirstInNotifyUtil;
import com.heytap.store.business.component.utils.OStoreComponentDialogKtKt;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"liveNotificationDialog", "Landroid/app/Dialog;", "activity", "Landroid/app/Activity;", "positiveClick", "Landroid/content/DialogInterface$OnClickListener;", "negativeClick", "showNotificationDialog", "", "context", "Landroid/content/Context;", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OStoreComponentDialogKtKt {
    private static final Dialog liveNotificationDialog(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        NearAlertDialogBuilder nearAlertDialogBuilder = new NearAlertDialogBuilder(activity);
        nearAlertDialogBuilder.setTitle((CharSequence) "开启通知权限？").setMessage((CharSequence) "开启后可及时收到直播开始提醒。").setPositiveButton((CharSequence) "去开启", onClickListener).setNegativeButton((CharSequence) LanUtils.CN.CANCEL, onClickListener2);
        return nearAlertDialogBuilder.show();
    }

    public static final void showNotificationDialog(@NotNull final Context context) {
        Dialog dialogLiveNotificationDialog;
        Intrinsics.checkNotNullParameter(context, "context");
        if ((context instanceof Activity) && (dialogLiveNotificationDialog = liveNotificationDialog((Activity) context, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.o4d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OStoreComponentDialogKtKt.m4840showNotificationDialog$lambda0(context, dialogInterface, i);
            }
        }, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.p4d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OStoreComponentDialogKtKt.m4841showNotificationDialog$lambda1(dialogInterface, i);
            }
        })) != null) {
            dialogLiveNotificationDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: showNotificationDialog$lambda-0, reason: not valid java name */
    public static final void m4840showNotificationDialog$lambda0(Context context, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(context, "$context");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        FirstInNotifyUtil.goToSettings(context);
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: showNotificationDialog$lambda-1, reason: not valid java name */
    public static final void m4841showNotificationDialog$lambda1(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }
}
