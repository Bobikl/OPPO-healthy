package com.oplus.aiunit.vision;

import androidx.appcompat.app.AlertDialog;
import com.oplus.anim.EffectiveAnimationView;
import com.support.dialog.R$id;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/xe2;", "", "Landroidx/appcompat/app/AlertDialog;", "alertDialog", "", "c", "b", "a", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class xe2 {

    @NotNull
    public static final xe2 INSTANCE = new xe2();

    public final void a(AlertDialog alertDialog) {
        EffectiveAnimationView effectiveAnimationView = (EffectiveAnimationView) alertDialog.findViewById(R$id.progress);
        if (effectiveAnimationView != null) {
            effectiveAnimationView.playAnimation();
        }
    }

    public final void b(@NotNull AlertDialog alertDialog) {
        Intrinsics.checkNotNullParameter(alertDialog, "alertDialog");
        alertDialog.dismiss();
        a(alertDialog);
    }

    public final void c(@NotNull AlertDialog alertDialog) {
        Intrinsics.checkNotNullParameter(alertDialog, "alertDialog");
        alertDialog.show();
        a(alertDialog);
    }
}
