package com.oplus.aiunit.core.protocol.common;

/* JADX INFO: loaded from: classes3.dex */
public enum ImageFormat {
    UNKNOWN(-1),
    YUV_NV21(0),
    YUV_NV12(1),
    BGR(2),
    RGB(3),
    RGBA(4),
    YUV_YU12(5),
    YUV_YV12(6),
    RGB565(7),
    YUV_444(10),
    YUV_420_888(35),
    GRAY(40),
    HARDWARE(50),
    IGNORED(100),
    YUV_NV21_10B(1000),
    YUV_NV12_10B(1001),
    BGR_10B(1002),
    RGB_10B(1003),
    RGBA_10B(1004),
    YUV_YU12_10B(1005),
    YUV_YV12_10B(1006),
    END(2000);

    private int value;

    ImageFormat(int i) {
        this.value = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static ImageFormat find(int i) {
        ImageFormat imageFormat;
        for (int i2 = 0; i2 < values().length; i2++) {
            if (values()[i2].equals(i)) {
                imageFormat = values()[i2];
                if (imageFormat == null) {
                    return UNKNOWN;
                }
                return imageFormat;
            }
        }
        imageFormat = null;
        if (imageFormat == null) {
            return UNKNOWN;
        }
        return imageFormat;
    }

    public static boolean isYUV(int i) {
        return i == YUV_NV21.value() || i == YUV_NV12.value() || i == YUV_YU12.value() || i == YUV_YV12.value() || i == YUV_444.value() || i == YUV_420_888.value();
    }

    public boolean equals(int i) {
        return this.value == i;
    }

    public int value() {
        return this.value;
    }
}
