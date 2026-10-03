package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.oppo.lib.common.R$dimen;

/* JADX INFO: loaded from: classes18.dex */
public class s0k {
    public Activity a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16428c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16429e;
    public DialogInterface.OnClickListener f;
    public DialogInterface.OnClickListener g;
    public boolean h;
    public int i;

    public static class a {
        public Activity a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16430c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16431e;
        public DialogInterface.OnClickListener f;
        public DialogInterface.OnClickListener g;
        public boolean h = true;
        public int i = 3;

        public a j(DialogInterface.OnClickListener onClickListener) {
            this.g = onClickListener;
            return this;
        }

        public a k(Activity activity) {
            this.a = activity;
            return this;
        }

        public s0k l() {
            return new s0k(this);
        }

        public a m(boolean z) {
            this.h = z;
            return this;
        }

        public a n(DialogInterface.OnClickListener onClickListener) {
            this.f = onClickListener;
            return this;
        }

        public a o(String str) {
            this.f16430c = str;
            return this;
        }

        public a p(int i) {
            this.i = i;
            return this;
        }

        public a q(String str) {
            this.d = str;
            return this;
        }

        public a r(String str) {
            this.f16431e = str;
            return this;
        }
    }

    public s0k(a aVar) {
        if (aVar == null) {
            return;
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.f16428c = aVar.f16430c;
        this.d = aVar.d;
        this.f16429e = aVar.f16431e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
    }

    public void a() {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        TextView textView = null;
        if (!TextUtils.isEmpty(this.f16428c)) {
            SpannableString spannableString = new SpannableString(this.f16428c);
            spannableString.setSpan(null, 0, 0, 33);
            textView = new TextView(this.a);
            textView.setText(spannableString);
            textView.setVisibility(0);
            textView.setHighlightColor(0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setTextColor(-16777216);
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R$dimen.len_30);
            textView.setPadding(dimensionPixelSize, this.a.getResources().getDimensionPixelSize(R$dimen.len_21), dimensionPixelSize, this.a.getResources().getDimensionPixelSize(R$dimen.len_15));
            textView.setTextSize(2, 16.0f);
            textView.setGravity(this.i);
        }
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(this.a);
        healthAlertDialogBuilder.setCancelable(this.h);
        if (!TextUtils.isEmpty(this.b)) {
            healthAlertDialogBuilder.setTitle(this.b);
        }
        if (textView != null) {
            healthAlertDialogBuilder.setView(textView);
        }
        if (!TextUtils.isEmpty(this.d) && (onClickListener2 = this.f) != null) {
            healthAlertDialogBuilder.setNegativeButton(this.d, onClickListener2);
        }
        if (!TextUtils.isEmpty(this.f16429e) && (onClickListener = this.g) != null) {
            healthAlertDialogBuilder.setPositiveButton(this.f16429e, onClickListener);
        }
        if (a94.a(this.a)) {
            healthAlertDialogBuilder.show();
        }
    }
}
