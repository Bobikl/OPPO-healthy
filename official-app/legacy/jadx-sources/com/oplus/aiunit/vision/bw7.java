package com.oplus.aiunit.vision;

import android.graphics.Typeface;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class bw7 {
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int PLAIN = 0;
    public final Typeface a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9873c;

    public bw7(String str, int i, int i2) {
        this(c(str, i), i, i2);
    }

    @NonNull
    public static Typeface a(@NonNull Typeface typeface, int i) {
        if (((typeface.isBold() ? 1 : 0) | (typeface.isItalic() ? 2 : 0)) != i) {
            return Typeface.create(typeface, ((i & 1) != 0 ? 1 : 0) | ((i & 2) == 0 ? 0 : 2));
        }
        return typeface;
    }

    @NonNull
    public static bw7 b(@NonNull Typeface typeface, float f) {
        return new bw7(typeface, 0, f);
    }

    @NonNull
    public static Typeface c(@NonNull String str, int i) {
        Typeface typefaceCreate = Typeface.create(str.toLowerCase(Locale.US), f(i));
        return typefaceCreate == null ? Typeface.DEFAULT : typefaceCreate;
    }

    public static int f(int i) {
        if (i == 0) {
            return 0;
        }
        return ((i & 1) != 0 ? 1 : 0) | ((i & 2) != 0 ? 2 : 0);
    }

    public bw7 d(int i) {
        return new bw7(this.a, i, this.f9873c);
    }

    public float e() {
        return this.f9873c;
    }

    public Typeface g() {
        return this.a;
    }

    public bw7(@NonNull Typeface typeface, int i, float f) {
        this.a = a(typeface, i);
        this.b = i;
        this.f9873c = f;
    }
}
