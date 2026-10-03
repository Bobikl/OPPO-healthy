package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.heytap.health.base.R$style;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
public class q8e {
    public static final int REGREX_TYPE_FLOAT = 1;
    public static final int REGREX_TYPE_INT = 0;
    public static final int REGREX_TYPE_INT_START = 2;
    public static final int REGREX_TYPE_INT_START_END = 3;
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15670c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Typeface f15671e;
    public int f;
    public Context g;

    public static class a {
        public int a;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Typeface f15673e;
        public Context g;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15672c = -1;
        public int f = 0;
        public int h = -1;
        public int i = -1;

        public a(Context context, String str) {
            this.d = str;
            this.g = context;
        }

        public q8e h() {
            return new q8e(this);
        }

        public a i(int i) {
            this.a = i;
            return this;
        }

        public a j(int i) {
            this.f = i;
            return this;
        }

        public a k(int i) {
            this.f15672c = i;
            return this;
        }

        public a l(int i) {
            this.b = i;
            return this;
        }

        public a m(Typeface typeface) {
            this.f15673e = typeface;
            return this;
        }
    }

    public Spannable a() {
        Pattern patternCompile;
        int iStart;
        int iEnd;
        int i = this.f;
        if (i == 1) {
            patternCompile = Pattern.compile("(\\d+.\\d+).*");
        } else if (i == 2) {
            patternCompile = Pattern.compile("([0-9]+).*");
        } else {
            patternCompile = i == 3 ? Pattern.compile("(\\d+.\\d+).*") : Pattern.compile("\\D+(\\d+).*");
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
        d(spannableString, iStart, iEnd);
        b(spannableString, this.a, iStart, iEnd);
        e(spannableString, iStart, iEnd);
        c(spannableString, iStart, iEnd);
        return spannableString;
    }

    public final void b(Spannable spannable, String str, int i, int i2) {
        if (this.d != -1) {
            spannable.setSpan(new AbsoluteSizeSpan(this.d), 0, i, 33);
            spannable.setSpan(new AbsoluteSizeSpan(this.d), i2, str.length(), 33);
        }
    }

    public final void c(Spannable spannable, int i, int i2) {
        spannable.setSpan(new ForegroundColorSpan(this.b), i, i2, 33);
    }

    public final void d(Spannable spannable, int i, int i2) {
        if (this.f15670c != -1) {
            spannable.setSpan(new AbsoluteSizeSpan(this.f15670c), i, i2, 33);
        }
    }

    public final void e(Spannable spannable, int i, int i2) {
        if (this.f15671e != null) {
            spannable.setSpan(new TextAppearanceSpan(this.g, R$style.lib_base_big_number_ex_font), i, i2, 33);
        }
    }

    public q8e(a aVar) {
        this.b = -16777216;
        this.f15670c = -1;
        this.d = -1;
        this.f = 0;
        this.a = aVar.d;
        this.b = aVar.a;
        this.f15670c = aVar.b;
        this.d = aVar.f15672c;
        this.f15671e = aVar.f15673e;
        this.f = aVar.f;
        this.g = aVar.g;
    }
}
