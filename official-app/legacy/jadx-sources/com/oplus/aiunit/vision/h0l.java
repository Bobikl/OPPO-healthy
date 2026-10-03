package com.oplus.aiunit.vision;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.heytap.health.base.R$color;

/* JADX INFO: loaded from: classes18.dex */
public class h0l {

    public class a extends ClickableSpan {
        public final /* synthetic */ TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f11956j;

        public a(TextView textView, View.OnClickListener onClickListener) {
            this.i = textView;
            this.f11956j = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f11956j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(this.i.getContext(), R$color.lib_base_colorPrimary));
            textPaint.setUnderlineText(false);
        }
    }

    public static void a(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    public static void b(TextView textView, String str, String str2, View.OnClickListener onClickListener) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        SpannableString spannableString = new SpannableString(str + str2);
        int length = str.length();
        spannableString.setSpan(new a(textView, onClickListener), length, str2.length() + length, 33);
        textView.setText(spannableString);
        textView.setHighlightColor(0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
