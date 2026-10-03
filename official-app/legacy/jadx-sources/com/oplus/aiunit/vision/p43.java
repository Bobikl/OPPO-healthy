package com.oplus.aiunit.vision;

import java.util.Random;

/* JADX INFO: loaded from: classes19.dex */
public class p43 {
    public static final int CATEGORY_COMPLEX = 4;
    public static final int CATEGORY_PURE = 6;
    public static final int CATEGORY_SQUARE = 2;

    public static int a(int i) {
        if (i == 6 || i == 7) {
            return 2;
        }
        return i != 8 ? 4 : 6;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 9;
            case 1:
            case 2:
            case 3:
            case 4:
                return 8;
            case 5:
                return 1;
            case 6:
                return 7;
            case 7:
                return 4;
            case 8:
                return 3;
            case 9:
                return 5;
            case 10:
                return 2;
            case 11:
                return 6;
            default:
                return 0;
        }
    }

    public static int c() {
        return b(new Random().nextInt(13));
    }
}
