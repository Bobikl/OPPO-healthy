package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

/* JADX INFO: loaded from: classes9.dex */
final class Asserts {
    private Asserts() {
    }

    public static double[] assertDouble4(@Nullable double[] dArr) {
        if (dArr == null) {
            return new double[4];
        }
        if (dArr.length >= 4) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }

    public static void assertDouble4In(@NonNull double[] dArr) {
        if (dArr.length < 4) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
        }
    }

    @NonNull
    @Size(min = 3)
    public static float[] assertFloat3(@Nullable float[] fArr) {
        if (fArr == null) {
            return new float[3];
        }
        if (fArr.length >= 3) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
    }

    public static void assertFloat3In(@NonNull float[] fArr) {
        if (fArr.length < 3) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
        }
    }

    @NonNull
    @Size(min = 4)
    public static float[] assertFloat4(@Nullable float[] fArr) {
        if (fArr == null) {
            return new float[4];
        }
        if (fArr.length >= 4) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }

    public static void assertFloat4In(@NonNull float[] fArr) {
        if (fArr.length < 4) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
        }
    }

    @NonNull
    @Size(min = 9)
    public static float[] assertMat3f(@Nullable float[] fArr) {
        if (fArr == null) {
            return new float[9];
        }
        if (fArr.length >= 9) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
    }

    public static void assertMat3fIn(@NonNull @Size(min = 9) float[] fArr) {
        if (fArr.length < 9) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
        }
    }

    @NonNull
    @Size(min = 16)
    public static double[] assertMat4(@Nullable double[] dArr) {
        if (dArr == null) {
            return new double[16];
        }
        if (dArr.length >= 16) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    public static void assertMat4In(@NonNull @Size(min = 16) double[] dArr) {
        if (dArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
    }

    @NonNull
    @Size(min = 16)
    public static double[] assertMat4d(@Nullable double[] dArr) {
        if (dArr == null) {
            return new double[16];
        }
        if (dArr.length >= 16) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    public static void assertMat4dIn(@NonNull @Size(min = 16) double[] dArr) {
        if (dArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
    }

    @NonNull
    @Size(min = 16)
    public static float[] assertMat4f(@Nullable float[] fArr) {
        if (fArr == null) {
            return new float[16];
        }
        if (fArr.length >= 16) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    public static void assertMat4fIn(@NonNull @Size(min = 16) float[] fArr) {
        if (fArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
    }
}
