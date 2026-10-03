package com.oplus.aiunit.vision;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.oplus.anim.EffectiveAnimationView;
import com.oplus.sauaar.R$id;
import com.oplus.sauaar.R$style;

/* JADX INFO: loaded from: classes2.dex */
public class zcg extends pfa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlertDialog f19369c;
    public COUIAlertDialogBuilder d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f19370e;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ EffectiveAnimationView i;

        public a(EffectiveAnimationView effectiveAnimationView) {
            this.i = effectiveAnimationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.i.playAnimation();
        }
    }

    public zcg(Context context) {
        super(context);
    }

    @Override // com.oplus.aiunit.vision.pfa
    public void a(int i, String str) {
        this.f19370e = str;
        if (i == 0) {
            this.d = new COUIAlertDialogBuilder(this.a, R$style.COUIAlertDialog_Rotating);
        } else {
            this.d = new COUIAlertDialogBuilder(this.a, i, R$style.COUIAlertDialog_Rotating);
        }
        if (!mp3.c(this.a, mp3.b)) {
            this.d.setTitle(str);
        }
        AlertDialog alertDialogCreate = this.d.setIconAttribute(R.attr.alertDialogIcon).setCancelable(false).create();
        this.f19369c = alertDialogCreate;
        this.b = alertDialogCreate;
    }

    @Override // com.oplus.aiunit.vision.pfa
    public void b() {
        AlertDialog alertDialog = this.f19369c;
        if (alertDialog == null || this.d == null) {
            return;
        }
        alertDialog.show();
        this.d.updateViewAfterShown();
        if (mp3.c(this.a, mp3.b)) {
            c();
        }
        EffectiveAnimationView effectiveAnimationView = (EffectiveAnimationView) this.f19369c.findViewById(R$id.progress);
        if (effectiveAnimationView != null) {
            effectiveAnimationView.playAnimation();
            effectiveAnimationView.addAnimatorListener(new a(effectiveAnimationView));
        }
    }

    public final void c() {
        TextView textView;
        if (mp3.c(this.a, mp3.f14150c)) {
            try {
                textView = (TextView) this.f19369c.findViewById(com.support.dialog.R$id.progress_tips);
            } catch (Exception e2) {
                e7b.f("SauWaitProgressDialog", "dialog.id.progress_tips view find fail, ex: " + e2);
                textView = null;
            } catch (NoClassDefFoundError | NoSuchFieldError e3) {
                e7b.f("SauWaitProgressDialog", "dialog.id.progress_tips not found, error: " + e3);
                textView = null;
            }
        } else {
            int iA = mp3.a(this.a, "progress_tips", "id");
            if (iA > 0) {
                textView = (TextView) this.f19369c.findViewById(iA);
            } else {
                e7b.e("SauWaitProgressDialog", "appcompat.id.progress_tips is invalid");
                textView = null;
            }
        }
        if (textView == null) {
            e7b.f("SauWaitProgressDialog", "progress_tips view is null");
        } else {
            textView.setText(this.f19370e);
        }
    }
}
