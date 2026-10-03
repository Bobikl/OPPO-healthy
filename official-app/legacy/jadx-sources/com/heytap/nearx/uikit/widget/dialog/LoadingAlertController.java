package com.heytap.nearx.uikit.widget.dialog;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialog;
import com.heytap.nearx.uikit.R$layout;
import com.oplus.aiunit.vision.gjc;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "已过时")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/uikit/widget/dialog/LoadingAlertController;", "Lcom/heytap/nearx/uikit/widget/dialog/AlertController;", "context", "Landroid/content/Context;", "di", "Landroidx/appcompat/app/AppCompatDialog;", "window", "Landroid/view/Window;", "(Landroid/content/Context;Landroidx/appcompat/app/AppCompatDialog;Landroid/view/Window;)V", "installContent", "", "selectContentView", "", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LoadingAlertController extends AlertController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingAlertController(@NotNull Context context, @NotNull AppCompatDialog di, @NotNull Window window) {
        super(context, di, window);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(di, "di");
        Intrinsics.checkNotNullParameter(window, "window");
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.AlertController
    public void installContent() {
        super.installContent();
        if (gjc.c()) {
            WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
            attributes.width = -1;
            this.mWindow.setAttributes(attributes);
        }
    }

    @Override // com.heytap.nearx.uikit.widget.dialog.AlertController
    public int selectContentView() {
        return R$layout.nx_color_spinner_alert_dialog_theme1;
    }
}
