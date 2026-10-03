package com.heytap.store.business.component.utils;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.heytap.store.business.component.dialog.IntegralExpDialog;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/business/component/utils/IntegralExpDialogHelper;", "", "()V", ShowDialogExecutor.SHOW_DIALOG, "", "context", "Landroid/content/Context;", "integralNum", "", "jumpLink", "", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IntegralExpDialogHelper {

    @NotNull
    public static final IntegralExpDialogHelper INSTANCE = new IntegralExpDialogHelper();

    private IntegralExpDialogHelper() {
    }

    public static /* synthetic */ void showDialog$default(IntegralExpDialogHelper integralExpDialogHelper, Context context, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = "";
        }
        integralExpDialogHelper.showDialog(context, i, str);
    }

    public final void showDialog(@NotNull Context context, int integralNum, @Nullable String jumpLink) {
        Intrinsics.checkNotNullParameter(context, "context");
        IntegralExpDialog integralExpDialog = new IntegralExpDialog(context, integralNum, jumpLink);
        Window window = integralExpDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        integralExpDialog.show();
    }
}
