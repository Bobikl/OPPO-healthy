package com.oplus.aiunit.vision;

import pantanal.app.CardKt;

/* JADX INFO: loaded from: classes13.dex */
public class mk3 {
    public static final mk3 BLACK;
    public static final mk3 BLUE;
    public static final mk3 BROWN;
    public static final mk3 CHARTREUSE;
    public static final mk3 CLEAR;
    public static final mk3 CLEAR_WHITE;
    public static final mk3 CORAL;
    public static final mk3 CYAN;
    public static final mk3 DARK_GRAY;
    public static final mk3 FIREBRICK;
    public static final mk3 FOREST;
    public static final mk3 GOLD;
    public static final mk3 GOLDENROD;
    public static final mk3 GRAY;
    public static final mk3 GREEN;
    public static final mk3 LIGHT_GRAY;
    public static final mk3 LIME;
    public static final mk3 MAGENTA;
    public static final mk3 MAROON;
    public static final mk3 NAVY;
    public static final mk3 OLIVE;
    public static final mk3 ORANGE;
    public static final mk3 PINK;
    public static final mk3 PURPLE;
    public static final mk3 RED;
    public static final mk3 ROYAL;
    public static final mk3 SALMON;
    public static final mk3 SCARLET;
    public static final mk3 SKY;
    public static final mk3 SLATE;
    public static final mk3 TAN;
    public static final mk3 TEAL;
    public static final mk3 VIOLET;
    public static final mk3 WHITE;
    public static final float WHITE_FLOAT_BITS;
    public static final mk3 YELLOW;
    public float a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14109c;
    public float d;

    static {
        mk3 mk3Var = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
        WHITE = mk3Var;
        LIGHT_GRAY = new mk3(-1077952513);
        GRAY = new mk3(2139062271);
        DARK_GRAY = new mk3(1061109759);
        BLACK = new mk3(0.0f, 0.0f, 0.0f, 1.0f);
        WHITE_FLOAT_BITS = mk3Var.f();
        CLEAR = new mk3(0.0f, 0.0f, 0.0f, 0.0f);
        CLEAR_WHITE = new mk3(1.0f, 1.0f, 1.0f, 0.0f);
        BLUE = new mk3(0.0f, 0.0f, 1.0f, 1.0f);
        NAVY = new mk3(0.0f, 0.0f, 0.5f, 1.0f);
        ROYAL = new mk3(1097458175);
        SLATE = new mk3(1887473919);
        SKY = new mk3(-2016482305);
        CYAN = new mk3(0.0f, 1.0f, 1.0f, 1.0f);
        TEAL = new mk3(0.0f, 0.5f, 0.5f, 1.0f);
        GREEN = new mk3(16711935);
        CHARTREUSE = new mk3(CardKt.KEY_CARD_UNIQUE_IDENTIFIER_VIEW_TAG);
        LIME = new mk3(852308735);
        FOREST = new mk3(579543807);
        OLIVE = new mk3(1804477439);
        YELLOW = new mk3(-65281);
        GOLD = new mk3(-2686721);
        GOLDENROD = new mk3(-626712321);
        ORANGE = new mk3(-5963521);
        BROWN = new mk3(-1958407169);
        TAN = new mk3(-759919361);
        FIREBRICK = new mk3(-1306385665);
        RED = new mk3(-16776961);
        SCARLET = new mk3(-13361921);
        CORAL = new mk3(-8433409);
        SALMON = new mk3(-92245249);
        PINK = new mk3(-9849601);
        MAGENTA = new mk3(1.0f, 0.0f, 1.0f, 1.0f);
        PURPLE = new mk3(-1608453889);
        VIOLET = new mk3(-293409025);
        MAROON = new mk3(-1339006721);
    }

    public mk3() {
    }

    public static int b(float f, float f2, float f3, float f4) {
        return (((int) (f * 255.0f)) << 24) | (((int) (f2 * 255.0f)) << 16) | (((int) (f3 * 255.0f)) << 8) | ((int) (f4 * 255.0f));
    }

    public static void c(mk3 mk3Var, int i) {
        mk3Var.a = (((-16777216) & i) >>> 24) / 255.0f;
        mk3Var.b = ((16711680 & i) >>> 16) / 255.0f;
        mk3Var.f14109c = ((65280 & i) >>> 8) / 255.0f;
        mk3Var.d = (i & 255) / 255.0f;
    }

    public static mk3 h(String str) {
        return i(str, new mk3());
    }

    public static mk3 i(String str, mk3 mk3Var) {
        if (str.charAt(0) == '#') {
            str = str.substring(1);
        }
        mk3Var.a = Integer.parseInt(str.substring(0, 2), 16) / 255.0f;
        mk3Var.b = Integer.parseInt(str.substring(2, 4), 16) / 255.0f;
        mk3Var.f14109c = Integer.parseInt(str.substring(4, 6), 16) / 255.0f;
        mk3Var.d = str.length() != 8 ? 1.0f : Integer.parseInt(str.substring(6, 8), 16) / 255.0f;
        return mk3Var;
    }

    public mk3 a() {
        float f = this.a;
        if (f < 0.0f) {
            this.a = 0.0f;
        } else if (f > 1.0f) {
            this.a = 1.0f;
        }
        float f2 = this.b;
        if (f2 < 0.0f) {
            this.b = 0.0f;
        } else if (f2 > 1.0f) {
            this.b = 1.0f;
        }
        float f3 = this.f14109c;
        if (f3 < 0.0f) {
            this.f14109c = 0.0f;
        } else if (f3 > 1.0f) {
            this.f14109c = 1.0f;
        }
        float f4 = this.d;
        if (f4 < 0.0f) {
            this.d = 0.0f;
        } else if (f4 > 1.0f) {
            this.d = 1.0f;
        }
        return this;
    }

    public mk3 d(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.f14109c = f3;
        this.d = f4;
        return a();
    }

    public mk3 e(mk3 mk3Var) {
        this.a = mk3Var.a;
        this.b = mk3Var.b;
        this.f14109c = mk3Var.f14109c;
        this.d = mk3Var.d;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && g() == ((mk3) obj).g();
    }

    public float f() {
        return rzc.c(((int) (this.a * 255.0f)) | (((int) (this.d * 255.0f)) << 24) | (((int) (this.f14109c * 255.0f)) << 16) | (((int) (this.b * 255.0f)) << 8));
    }

    public int g() {
        return ((int) (this.a * 255.0f)) | (((int) (this.d * 255.0f)) << 24) | (((int) (this.f14109c * 255.0f)) << 16) | (((int) (this.b * 255.0f)) << 8);
    }

    public int hashCode() {
        float f = this.a;
        int iA = (f != 0.0f ? rzc.a(f) : 0) * 31;
        float f2 = this.b;
        int iA2 = (iA + (f2 != 0.0f ? rzc.a(f2) : 0)) * 31;
        float f3 = this.f14109c;
        int iA3 = (iA2 + (f3 != 0.0f ? rzc.a(f3) : 0)) * 31;
        float f4 = this.d;
        return iA3 + (f4 != 0.0f ? rzc.a(f4) : 0);
    }

    public String toString() {
        String hexString = Integer.toHexString(((int) (this.d * 255.0f)) | (((int) (this.a * 255.0f)) << 24) | (((int) (this.b * 255.0f)) << 16) | (((int) (this.f14109c * 255.0f)) << 8));
        while (hexString.length() < 8) {
            hexString = "0" + hexString;
        }
        return hexString;
    }

    public mk3(int i) {
        c(this, i);
    }

    public mk3(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.f14109c = f3;
        this.d = f4;
        a();
    }

    public mk3(mk3 mk3Var) {
        e(mk3Var);
    }
}
