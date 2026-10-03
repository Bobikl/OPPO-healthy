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
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class lgg extends xga {
    public AlertDialog c;
    public COUIAlertDialogBuilder d;
    public String e;

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

    public lgg(Context context) {
        super(context);
    }

    @Override // com.oplus.aiunit.vision.xga
    public void a(int i, String str) {
        this.e = str;
        if (i == 0) {
            this.d = new COUIAlertDialogBuilder(this.a, R$style.COUIAlertDialog_Rotating);
        } else {
            this.d = new COUIAlertDialogBuilder(this.a, i, R$style.COUIAlertDialog_Rotating);
        }
        if (!aq3.c(this.a, aq3.b)) {
            this.d.W(str);
        }
        AlertDialog alertDialogCreate = this.d.setIconAttribute(R.attr.alertDialogIcon).setCancelable(false).create();
        this.c = alertDialogCreate;
        this.b = alertDialogCreate;
    }

    @Override // com.oplus.aiunit.vision.xga
    public void b() {
        AlertDialog alertDialog = this.c;
        if (alertDialog == null || this.d == null) {
            return;
        }
        alertDialog.show();
        this.d.updateViewAfterShown();
        if (aq3.c(this.a, aq3.b)) {
            c();
        }
        EffectiveAnimationView effectiveAnimationViewFindViewById = this.c.findViewById(R$id.progress);
        if (effectiveAnimationViewFindViewById != null) {
            effectiveAnimationViewFindViewById.playAnimation();
            effectiveAnimationViewFindViewById.addAnimatorListener(new a(effectiveAnimationViewFindViewById));
        }
    }

    public final void c() {
        TextView textView;
        if (aq3.c(this.a, aq3.c)) {
            try {
                textView = (TextView) this.c.findViewById(com.support.dialog.R.id.progress_tips);
            } catch (Exception e) {
                q8b.f("SauWaitProgressDialog", "dialog.id.progress_tips view find fail, ex: " + e);
                textView = null;
            } catch (NoClassDefFoundError | NoSuchFieldError e2) {
                q8b.f("SauWaitProgressDialog", "dialog.id.progress_tips not found, error: " + e2);
                textView = null;
            }
        } else {
            int iA = aq3.a(this.a, "progress_tips", ParserTag.TAG_ID);
            if (iA > 0) {
                textView = (TextView) this.c.findViewById(iA);
            } else {
                q8b.e("SauWaitProgressDialog", "appcompat.id.progress_tips is invalid");
                textView = null;
            }
        }
        if (textView == null) {
            q8b.f("SauWaitProgressDialog", "progress_tips view is null");
        } else {
            textView.setText(this.e);
        }
    }
}
