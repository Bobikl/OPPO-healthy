package com.heytap.store.homemodule.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import com.heytap.store.home.R;
import com.oplus.anim.EffectiveAnimationView;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"addOnWindowAttachListener", "", "Landroidx/appcompat/app/AlertDialog;", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class NearAlertDialogktxKt {
    public static final void addOnWindowAttachListener(@Nullable AlertDialog alertDialog) {
        Window window;
        View decorView;
        if (alertDialog == null || (window = alertDialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        final EffectiveAnimationView effectiveAnimationView = (EffectiveAnimationView) decorView.findViewById(R.id.progress);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver == null) {
            return;
        }
        viewTreeObserver.addOnWindowAttachListener(new ViewTreeObserver.OnWindowAttachListener() { // from class: com.heytap.store.homemodule.utils.NearAlertDialogktxKt$addOnWindowAttachListener$1$1
            @Override // android.view.ViewTreeObserver.OnWindowAttachListener
            public void onWindowAttached() {
                EffectiveAnimationView effectiveAnimationView2 = effectiveAnimationView;
                if (effectiveAnimationView2 == null) {
                    return;
                }
                effectiveAnimationView2.playAnimation();
            }

            @Override // android.view.ViewTreeObserver.OnWindowAttachListener
            public void onWindowDetached() {
                effectiveAnimationView.pauseAnimation();
            }
        });
    }
}
