package com.oplus.aiunit.vision;

import android.graphics.Color;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes11.dex */
public class lk3 {
    public static final lk3 BLACK;
    public static final lk3 RED;
    public static final lk3 black;
    public static final lk3 blue;
    public static final lk3 cyan;
    public static final lk3 green;
    public static final lk3 magenta;
    public static final lk3 red;
    public static final lk3 white;
    public static final lk3 yellow;
    public final int a;

    static {
        lk3 lk3Var = new lk3(-16777216);
        black = lk3Var;
        white = new lk3(-1);
        lk3 lk3Var2 = new lk3(SupportMenu.CATEGORY_MASK);
        red = lk3Var2;
        green = new lk3(-16711936);
        blue = new lk3(-16776961);
        cyan = new lk3(Color.parseColor("cyan"));
        magenta = new lk3(Color.parseColor("magenta"));
        yellow = new lk3(Color.parseColor("yellow"));
        BLACK = lk3Var;
        RED = lk3Var2;
    }

    public lk3(int i) {
        this.a = i;
    }

    public static lk3 a(String str) {
        return new lk3(Color.parseColor(str));
    }

    public int b() {
        return this.a;
    }

    public lk3(int i, int i2, int i3) {
        this(Color.rgb(i, i2, i3));
    }

    public lk3(float f, float f2, float f3) {
        this((int) ((f * 255.0f) + 0.5f), (int) ((f2 * 255.0f) + 0.5f), (int) ((f3 * 255.0f) + 0.5f));
    }
}
