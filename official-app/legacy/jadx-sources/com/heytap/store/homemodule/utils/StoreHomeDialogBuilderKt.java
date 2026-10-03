package com.heytap.store.homemodule.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.heytap.nearx.uikit.widget.dialogview.NearAlertDialogBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a:\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\r"}, d2 = {"liveNotificationDialog", "Landroid/app/Dialog;", "activity", "Landroid/app/Activity;", "positiveClick", "Landroid/content/DialogInterface$OnClickListener;", "negativeClick", "liveSubscribeSuccessDialog", "multimediaSubscribeSuccessDialog", "message", "", "positiveText", "negativeText", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StoreHomeDialogBuilderKt {
    @Nullable
    public static final Dialog liveNotificationDialog(@NotNull Activity activity, @NotNull DialogInterface.OnClickListener positiveClick, @NotNull DialogInterface.OnClickListener negativeClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(positiveClick, "positiveClick");
        Intrinsics.checkNotNullParameter(negativeClick, "negativeClick");
        NearAlertDialogBuilder nearAlertDialogBuilder = new NearAlertDialogBuilder(activity);
        nearAlertDialogBuilder.setTitle((CharSequence) "开启通知权限？").setMessage((CharSequence) "开启后可及时收到直播开始提醒。").setPositiveButton((CharSequence) "去开启", positiveClick).setNegativeButton((CharSequence) LanUtils.CN.CANCEL, negativeClick);
        return nearAlertDialogBuilder.show();
    }

    @Nullable
    public static final Dialog liveSubscribeSuccessDialog(@NotNull Activity activity, @NotNull DialogInterface.OnClickListener positiveClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(positiveClick, "positiveClick");
        NearAlertDialogBuilder nearAlertDialogBuilder = new NearAlertDialogBuilder(activity);
        nearAlertDialogBuilder.setTitle((CharSequence) "预约成功").setMessage((CharSequence) "直播开始后，会以通知的方式告知您。").setPositiveButton((CharSequence) "确定", positiveClick);
        return nearAlertDialogBuilder.show();
    }

    @Nullable
    public static final Dialog multimediaSubscribeSuccessDialog(@NotNull Activity activity, @NotNull String message, @NotNull String positiveText, @NotNull DialogInterface.OnClickListener positiveClick, @Nullable String str, @NotNull DialogInterface.OnClickListener negativeClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        Intrinsics.checkNotNullParameter(positiveClick, "positiveClick");
        Intrinsics.checkNotNullParameter(negativeClick, "negativeClick");
        NearAlertDialogBuilder nearAlertDialogBuilder = new NearAlertDialogBuilder(activity);
        nearAlertDialogBuilder.setTitle((CharSequence) "预约成功").setMessage((CharSequence) message).setPositiveButton((CharSequence) positiveText, positiveClick);
        if (!TextUtils.isEmpty(str)) {
            nearAlertDialogBuilder.setNegativeButton((CharSequence) str, negativeClick);
        }
        return nearAlertDialogBuilder.show();
    }
}
