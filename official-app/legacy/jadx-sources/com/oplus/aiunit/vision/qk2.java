package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.oplus.anim.EffectiveAnimationView;
import com.support.dialog.R$dimen;
import com.support.dialog.R$id;
import com.support.dialog.R$style;

/* JADX INFO: loaded from: classes13.dex */
public class qk2 {
    public COUIAlertDialogBuilder a;
    public AlertDialog b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f15826c;
    public EffectiveAnimationView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f15827e;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15828j;
    public DialogInterface.OnClickListener k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15829l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DialogInterface.OnShowListener f15830n;
    public DialogInterface.OnDismissListener o;
    public int q;
    public int f = -1;
    public int g = -1;
    public String h = null;
    public int m = 0;
    public boolean p = false;

    public class a implements DialogInterface.OnShowListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            qk2.this.d.setRepeatCount(qk2.this.f);
            qk2.this.d.playAnimation();
            if (qk2.this.f15830n != null) {
                qk2.this.f15830n.onShow(dialogInterface);
            }
        }
    }

    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            qk2.this.d.pauseAnimation();
            if (qk2.this.o != null) {
                qk2.this.o.onDismiss(dialogInterface);
            }
        }
    }

    public qk2(Context context, String str) {
        this.f15826c = context;
        this.i = str;
        this.q = context.getResources().getDimensionPixelSize(R$dimen.coui_spinner_loading_height);
    }

    public final void e(AlertDialog alertDialog) {
        View decorView = alertDialog.getWindow().getDecorView();
        this.d = (EffectiveAnimationView) decorView.findViewById(R$id.progress);
        TextView textView = (TextView) decorView.findViewById(R$id.progress_tips);
        this.f15827e = textView;
        String str = this.i;
        if (str != null) {
            textView.setText(str);
            gg2.c(this.f15827e, 4);
        }
        EffectiveAnimationView effectiveAnimationView = this.d;
        if (effectiveAnimationView != null) {
            int i = this.g;
            if (i != -1 && this.h != null) {
                throw new IllegalArgumentException("mRawResource and mFileName cannot be used at the same time. Please use only one at once.");
            }
            if (i != -1) {
                effectiveAnimationView.setAnimation(i);
                if (g()) {
                    return;
                }
                h(this.d);
                return;
            }
            String str2 = this.h;
            if (str2 != null) {
                effectiveAnimationView.setAnimation(str2);
                if (g()) {
                    return;
                }
                h(this.d);
            }
        }
    }

    public AlertDialog f() {
        if (this.a == null) {
            if (this.m == 0) {
                if (this.f15828j == null) {
                    this.m = R$style.COUIAlertDialog_Rotating;
                } else {
                    this.m = R$style.COUIAlertDialog_Rotating_Cancelable;
                }
            }
            COUIAlertDialogBuilder cOUIAlertDialogBuilder = new COUIAlertDialogBuilder(this.f15826c, this.m);
            this.a = cOUIAlertDialogBuilder;
            String str = this.f15828j;
            if (str != null) {
                cOUIAlertDialogBuilder.setNegativeButton(str, this.k);
            }
            String str2 = this.f15829l;
            if (str2 != null) {
                this.a.setTitle(str2);
            }
            this.a.y(this.p);
            AlertDialog alertDialogCreate = this.a.create();
            this.b = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new a());
            this.b.setOnDismissListener(new b());
        }
        return this.b;
    }

    public final boolean g() {
        return this.f15828j != null;
    }

    public qk2 h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.q;
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        return this;
    }

    public AlertDialog i() {
        AlertDialog alertDialogF = f();
        alertDialogF.show();
        this.a.updateViewAfterShown();
        e(alertDialogF);
        return alertDialogF;
    }
}
