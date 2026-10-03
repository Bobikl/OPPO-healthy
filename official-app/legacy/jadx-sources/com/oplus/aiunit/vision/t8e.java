package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.heytap.health.step.R$style;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class t8e {
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16923c;
    public Typeface d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16924e;
    public Context f;

    public static class a {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16925c;
        public Typeface d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16926e = 0;
        public Context f;

        public a(Context context, String str) {
            this.f16925c = str;
            this.f = context;
        }

        public t8e g() {
            return new t8e(this);
        }

        public a h(int i) {
            this.a = i;
            return this;
        }

        public a i(int i) {
            this.f16926e = i;
            return this;
        }

        public a j(int i) {
            this.b = i;
            return this;
        }

        public a k(Typeface typeface) {
            this.d = typeface;
            return this;
        }
    }

    public Spannable a() {
        Pattern patternCompile;
        int iStart;
        int iEnd;
        int i = this.f16924e;
        if (i == 1) {
            patternCompile = Pattern.compile("\\*?(\\d+.\\d+).*");
        } else if (i == 2) {
            patternCompile = Pattern.compile("([0-9]+).*");
        } else {
            patternCompile = i == 3 ? Pattern.compile("([0-9]+\\-[0-9]+).*") : Pattern.compile("\\D+(\\d+).*");
        }
        Matcher matcher = patternCompile.matcher(this.a);
        if (!matcher.find() || matcher.groupCount() < 1) {
            iStart = 0;
            iEnd = 0;
        } else {
            iStart = matcher.start(1);
            iEnd = matcher.end(1);
        }
        SpannableString spannableString = new SpannableString(this.a);
        c(spannableString, iStart, iEnd);
        d(spannableString, iStart, iEnd);
        b(spannableString, iStart, iEnd);
        return spannableString;
    }

    public final void b(Spannable spannable, int i, int i2) {
        spannable.setSpan(new ForegroundColorSpan(this.b), i, i2, 33);
    }

    public final void c(Spannable spannable, int i, int i2) {
        if (this.f16923c != -1) {
            spannable.setSpan(new AbsoluteSizeSpan(this.f16923c), i, i2, 33);
        }
    }

    public final void d(Spannable spannable, int i, int i2) {
        if (this.d != null) {
            spannable.setSpan(new TextAppearanceSpan(this.f, R$style.step_card_ex_font), i, i2, 33);
        }
    }

    public t8e(a aVar) {
        this.b = -16777216;
        this.f16923c = -1;
        this.f16924e = 0;
        this.a = aVar.f16925c;
        this.b = aVar.a;
        this.f16923c = aVar.b;
        this.d = aVar.d;
        this.f16924e = aVar.f16926e;
        this.f = aVar.f;
    }
}
