package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseIntArray;
import com.heytap.health.watchface.business.legacy.creation.outfits.transfor.bean.ColorStatisticsBean;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class fl3 {
    public static final int ERROR = -1;
    public static final String TAG = "ColorSelectHelper";
    public static final SparseIntArray a;
    public static final SparseIntArray b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[][] f11422c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        b = sparseIntArray2;
        f11422c = new String[][]{new String[]{"#FF6E5A", "#FF6E5A", "#FF3D00", "#DB2319", "#DB2319", "#A1887F", "#A1887F", "#795548", "#4E342E"}, new String[]{"#FF9450", "#FF9450", "#FD7A00", "#E35100", "#E35100", "#A1887F", "#A1887F", "#795548", "#4E342E"}, new String[]{"#FEDF43", "#FEDF43", "#FEB407", "#FD9500", "#FD9500", "#A1887F", "#A1887F", "#795548", "#4E342E"}, new String[]{"#FFFF8D", "#FFFF8D", "#FDD15B", "#F3C610", "#F3C610", "#8A9C78", "#8A9C78", "#677A54", "#434F37"}, new String[]{"#F0FF57", "#F0FF57", "#D3F320", "#B8E100", "#B8E100", "#8A9C78", "#8A9C78", "#677A54", "#434F37"}, new String[]{"#B2FF59", "#B2FF59", "#7CF259", "#7CCC00", "#7CCC00", "#8A9C78", "#8A9C78", "#677A54", "#434F37"}, new String[]{"#74ED7C", "#74ED7C", "#1CD369", "#1AAE59", "#1AAE59", "#8A9C78", "#8A9C78", "#677A54", "#434F37"}, new String[]{"#64FFDB", "#64FFDB", "#1DE9B6", "#00BFA5", "#00BFA5", "#78909C", "#78909C", "#546E7A", "#37474F"}, new String[]{"#0EF5F5", "#0EF5F5", "#00D9FF", "#00B0FF", "#00B0FF", "#78909C", "#78909C", "#546E7A", "#37474F"}, new String[]{"#3FCCFF", "#3FCCFF", "#12B5FF", "#048BDC", "#048BDC", "#78909C", "#78909C", "#546E7A", "#37474F"}, new String[]{"#519EFF", "#519EFF", "#2978FF", "#2962FF", "#2962FF", "#78909C", "#78909C", "#546E7A", "#37474F"}, new String[]{"#6074FF", "#6074FF", "#3D5AFE", "#2140E9", "#2140E9", "#8B91AE", "#8B91AE", "#555C7A", "#2F354F"}, new String[]{"#9355FF", "#9355FF", "#651FFF", "#5900D6", "#5900D6", "#8B91AE", "#8B91AE", "#555C7A", "#2F354F"}, new String[]{"#E040FB", "#E040FB", "#C700F9", "#A200FF", "#A200FF", "#A17FA1", "#A17FA1", "#794879", "#4E2E4E"}, new String[]{"#F470BE", "#F470BE", "#E3489E", "#BF2279", "#BF2279", "#A17FA1", "#A17FA1", "#794879", "#4E2E4E"}, new String[]{"#F5618D", "#F5618D", "#E43260", "#B22843", "#B22843", "#A17FA1", "#A17FA1", "#794879", "#4E2E4E"}, new String[]{"#ECF0F1", "#6F7376", "#6F7376", "#404040", "#404040", "#A17FA1", "#A17FA1", "#794879", "#4E2E4E"}};
        sparseIntArray.put(Color.parseColor("#FF6E5A"), Color.parseColor("#EF3615"));
        sparseIntArray.put(Color.parseColor("#FF9450"), Color.parseColor("#E16400"));
        sparseIntArray.put(Color.parseColor("#FEDF43"), Color.parseColor("#F09800"));
        sparseIntArray.put(Color.parseColor("#FFFF8D"), Color.parseColor("#BBC400"));
        sparseIntArray.put(Color.parseColor("#F0FF57"), Color.parseColor("#94BC00"));
        sparseIntArray.put(Color.parseColor("#B2FF59"), Color.parseColor("#3FCB00"));
        sparseIntArray.put(Color.parseColor("#74ED7C"), Color.parseColor("#00BB86"));
        sparseIntArray.put(Color.parseColor("#64FFDB"), Color.parseColor("#00BE9C"));
        sparseIntArray.put(Color.parseColor("#0EF5F5"), Color.parseColor("#00B4C1"));
        sparseIntArray.put(Color.parseColor("#3FCCFF"), Color.parseColor("#0178D0"));
        sparseIntArray.put(Color.parseColor("#519EFF"), Color.parseColor("#0059D3"));
        sparseIntArray.put(Color.parseColor("#6074FF"), Color.parseColor("#1F3CE2"));
        sparseIntArray.put(Color.parseColor("#9355FF"), Color.parseColor("#5A0FDD"));
        sparseIntArray.put(Color.parseColor("#E040FB"), Color.parseColor("#AF00C0"));
        sparseIntArray.put(Color.parseColor("#F470BE"), Color.parseColor("#CF0059"));
        sparseIntArray.put(Color.parseColor("#F5618D"), Color.parseColor("#DB0D0D"));
        sparseIntArray.put(Color.parseColor("#FF3D00"), Color.parseColor("#9A2300"));
        sparseIntArray.put(Color.parseColor("#FD7A00"), Color.parseColor("#A55900"));
        sparseIntArray.put(Color.parseColor("#FEB407"), Color.parseColor("#ED7F00"));
        sparseIntArray.put(Color.parseColor("#FDD15B"), Color.parseColor("#A6A900"));
        sparseIntArray.put(Color.parseColor("#D3F320"), Color.parseColor("#7FC900"));
        sparseIntArray.put(Color.parseColor("#7CF259"), Color.parseColor("#32C000"));
        sparseIntArray.put(Color.parseColor("#1CD369"), Color.parseColor("#00AD4E"));
        sparseIntArray.put(Color.parseColor("#1DE9B6"), Color.parseColor("#00A083"));
        sparseIntArray.put(Color.parseColor("#00D9FF"), Color.parseColor("#009AA5"));
        sparseIntArray.put(Color.parseColor("#12B5FF"), Color.parseColor("#0066B2"));
        sparseIntArray.put(Color.parseColor("#2978FF"), Color.parseColor("#00439F"));
        sparseIntArray.put(Color.parseColor("#3D5AFE"), Color.parseColor("#0922B0"));
        sparseIntArray.put(Color.parseColor("#651FFF"), Color.parseColor("#370098"));
        sparseIntArray.put(Color.parseColor("#C700F9"), Color.parseColor("#840091"));
        sparseIntArray.put(Color.parseColor("#E3489E"), Color.parseColor("#A20046"));
        sparseIntArray.put(Color.parseColor("#E43260"), Color.parseColor("#A90029"));
        sparseIntArray.put(Color.parseColor("#DB2319"), Color.parseColor("#951E00"));
        sparseIntArray.put(Color.parseColor("#E35100"), Color.parseColor("#A53100"));
        sparseIntArray.put(Color.parseColor("#FD9500"), Color.parseColor("#B16900"));
        sparseIntArray.put(Color.parseColor("#F3C610"), Color.parseColor("#8C9A00"));
        sparseIntArray.put(Color.parseColor("#B8E100"), Color.parseColor("#649F00"));
        sparseIntArray.put(Color.parseColor("#7CCC00"), Color.parseColor("#0E9900"));
        sparseIntArray.put(Color.parseColor("#1AAE59"), Color.parseColor("#007E39"));
        sparseIntArray.put(Color.parseColor("#00BFA5"), Color.parseColor("#008481"));
        sparseIntArray.put(Color.parseColor("#00B0FF"), Color.parseColor("#006D97"));
        sparseIntArray.put(Color.parseColor("#048BDC"), Color.parseColor("#003C9C"));
        sparseIntArray.put(Color.parseColor("#2962FF"), Color.parseColor("#00329F"));
        sparseIntArray.put(Color.parseColor("#2140E9"), Color.parseColor("#00259C"));
        sparseIntArray.put(Color.parseColor("#5900D6"), Color.parseColor("#320089"));
        sparseIntArray.put(Color.parseColor("#A200FF"), Color.parseColor("#670091"));
        sparseIntArray.put(Color.parseColor("#BF2279"), Color.parseColor("#740043"));
        sparseIntArray.put(Color.parseColor("#B22843"), Color.parseColor("#870026"));
        sparseIntArray.put(Color.parseColor("#A1887F"), Color.parseColor("#795548"));
        sparseIntArray.put(Color.parseColor("#8A9C78"), Color.parseColor("#677A54"));
        sparseIntArray.put(Color.parseColor("#78909C"), Color.parseColor("#546E7A"));
        sparseIntArray.put(Color.parseColor("#8B91AE"), Color.parseColor("#555C7A"));
        sparseIntArray.put(Color.parseColor("#A17FA1"), Color.parseColor("#794879"));
        sparseIntArray.put(Color.parseColor("#ECF0F1"), Color.parseColor("#6F7376"));
        sparseIntArray.put(Color.parseColor("#795548"), Color.parseColor("#4E342E"));
        sparseIntArray.put(Color.parseColor("#677A54"), Color.parseColor("#434F37"));
        sparseIntArray.put(Color.parseColor("#546E7A"), Color.parseColor("#37474F"));
        sparseIntArray.put(Color.parseColor("#555C7A"), Color.parseColor("#2F354F"));
        sparseIntArray.put(Color.parseColor("#794879"), Color.parseColor("#4E2E4E"));
        sparseIntArray.put(Color.parseColor("#6F7376"), Color.parseColor("#404040"));
        sparseIntArray.put(Color.parseColor("#4E342E"), Color.parseColor("#795548"));
        sparseIntArray.put(Color.parseColor("#434F37"), Color.parseColor("#677A54"));
        sparseIntArray.put(Color.parseColor("#37474F"), Color.parseColor("#546E7A"));
        sparseIntArray.put(Color.parseColor("#2F354F"), Color.parseColor("#555C7A"));
        sparseIntArray.put(Color.parseColor("#4E2E4E"), Color.parseColor("#794879"));
        sparseIntArray.put(Color.parseColor("#404040"), Color.parseColor("#6F7376"));
        sparseIntArray2.put(Color.parseColor("#FF6E5A"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#FF9450"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#FEDF43"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#FFFF8D"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#F0FF57"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#B2FF59"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#74ED7C"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#64FFDB"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#0EF5F5"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#3FCCFF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#519EFF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#6074FF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#9355FF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#E040FB"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#F470BE"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#F5618D"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#FF3D00"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#FD7A00"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#FEB407"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#FDD15B"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#D3F320"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#7CF259"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#1CD369"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#1DE9B6"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#00D9FF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#12B5FF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#2978FF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#3D5AFE"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#651FFF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#C700F9"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#E3489E"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#E43260"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#DB2319"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#E35100"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#FD9500"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#F3C610"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#B8E100"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#7CCC00"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#1AAE59"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#00BFA5"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#00B0FF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#048BDC"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#2962FF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#2140E9"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#5900D6"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#A200FF"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#BF2279"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#B22843"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#A1887F"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#8A9C78"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#78909C"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#8B91AE"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#A17FA1"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#ECF0F1"), Color.parseColor("#000000"));
        sparseIntArray2.put(Color.parseColor("#795548"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#677A54"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#546E7A"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#555C7A"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#794879"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#6F7376"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#4E342E"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#434F37"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#37474F"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#2F354F"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#4E2E4E"), Color.parseColor("#FFFFFF"));
        sparseIntArray2.put(Color.parseColor("#404040"), Color.parseColor("#FFFFFF"));
    }

    public static byte[] a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = new byte[(bArrArray.length / 4) * 3];
        int length = bArrArray.length / 4;
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            int i3 = i * 4;
            bArr[i2] = bArrArray[i3];
            bArr[i2 + 1] = bArrArray[i3 + 1];
            bArr[i2 + 2] = bArrArray[i3 + 2];
        }
        return bArr;
    }

    public static int[][] b(Bitmap bitmap) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 9);
        byte[] bArrA = a(bitmap);
        if (bArrA == null) {
            return null;
        }
        for (int i = 0; i < bArrA.length / 3; i++) {
            int i2 = i * 3;
            int i3 = bArrA[i2] & 255;
            int i4 = bArrA[i2 + 1] & 255;
            int i5 = bArrA[i2 + 2] & 255;
            int i6 = (i5 > i4 ? i5 : i4) > i3 ? i5 > i4 ? i5 : i4 : i3;
            int i7 = (i5 < i4 ? i5 : i4) < i3 ? i5 < i4 ? i5 : i4 : i3;
            int i8 = i6 == i7 ? i6 + 1 : i6;
            int iM = m(l(i6), k(i6, i7, i8));
            if (iM >= 9) {
                int[] iArr2 = iArr[16];
                int i9 = iM - 9;
                iArr2[i9] = iArr2[i9] + 1;
            } else {
                int[] iArr3 = iArr[g(f(i3, i4, i5, i6, i7, i8))];
                iArr3[iM] = iArr3[iM] + 1;
            }
        }
        return iArr;
    }

    public static void c(int[][] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[0].length; i2++) {
                iArr2[i][i2] = iArr[i][i2];
            }
        }
    }

    public static int d(int i) {
        int i2 = b.get(i);
        ltl.a(TAG, "[getBCategoryConvertColor] --> originColor=" + i + " ,convert=" + i2);
        return i2;
    }

    public static int e(int i) {
        int i2 = a.get(i);
        ltl.a(TAG, "[getConvertColor] --> originColor=" + i + " ,convert=" + i2);
        return i2;
    }

    public static int f(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        if (i == i4) {
            i7 = ((i2 - i3) * 60) / (i6 - i5);
        } else if (i2 == i4) {
            i7 = (((i3 - i) * 60) / (i6 - i5)) + 120;
        } else {
            i7 = i3 == i4 ? (((i - i2) * 60) / (i6 - i5)) + 240 : 0;
        }
        return i7 < 0 ? i7 + 360 : i7;
    }

    public static int g(int i) {
        if (i >= 6 && i <= 20) {
            return 0;
        }
        if (i > 20 && i <= 30) {
            return 1;
        }
        if (i > 30 && i <= 45) {
            return 2;
        }
        if (i > 45 && i <= 60) {
            return 3;
        }
        if (i > 60 && i <= 90) {
            return 4;
        }
        if (i > 90 && i <= 120) {
            return 5;
        }
        if (i > 120 && i <= 150) {
            return 6;
        }
        if (i > 150 && i <= 170) {
            return 7;
        }
        if (i > 170 && i <= 190) {
            return 8;
        }
        if (i > 190 && i <= 200) {
            return 9;
        }
        if (i > 200 && i <= 220) {
            return 10;
        }
        if (i > 220 && i <= 240) {
            return 11;
        }
        if (i > 240 && i <= 260) {
            return 12;
        }
        if (i <= 260 || i > 280) {
            return (i <= 280 || i > 320) ? 15 : 14;
        }
        return 13;
    }

    public static List<ColorStatisticsBean> h(Bitmap bitmap) {
        int[][] iArrB = b(bitmap);
        if (iArrB == null) {
            ltl.b(TAG, "[getMatchedColor] --> colorCountArray = null");
            return null;
        }
        p(iArrB);
        return i(iArrB);
    }

    public static List<ColorStatisticsBean> i(int[][] iArr) {
        if (iArr == null || iArr[0] == null) {
            return null;
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 9);
        c(iArr, iArr2);
        y(iArr2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            x(iArr, iArr2[0][i], arrayList);
        }
        return arrayList;
    }

    public static int j(Bitmap bitmap) {
        byte[] bArrA = a(bitmap);
        if (bArrA == null) {
            return -1;
        }
        return bArrA.length / 3;
    }

    public static int k(int i, int i2, int i3) {
        if (i == 0 || i3 == 0) {
            return 0;
        }
        return ((i - i2) * 100) / i3;
    }

    public static int l(int i) {
        return (i * 100) / 255;
    }

    public static int m(int i, int i2) {
        if (i2 >= 0 && i2 <= 10 && i >= 80 && i <= 100) {
            return 9;
        }
        if (i2 >= 0 && i2 <= 10 && i > 45 && i <= 80) {
            return 10;
        }
        if (i2 >= 0 && i2 <= 20 && i > 30 && i <= 45) {
            return 11;
        }
        if (i2 >= 0 && i2 <= 20 && i > 15 && i <= 30) {
            return 12;
        }
        if (i2 >= 0 && i2 <= 100 && i >= 0 && i <= 15) {
            return 13;
        }
        if (i2 <= 20 || i2 > 40 || i <= 60 || i > 100) {
            if (i2 > 40 && i2 <= 60 && i > 60 && i <= 100) {
                return 1;
            }
            if (i2 > 60 && i2 <= 90 && i > 60 && i <= 100) {
                return 2;
            }
            if (i2 > 90 && i2 <= 100 && i > 60 && i <= 100) {
                return 3;
            }
            if (i2 > 60 && i2 <= 100 && i > 30 && i <= 60) {
                return 4;
            }
            if (i2 > 10 && i2 <= 20 && i > 45 && i <= 100) {
                return 5;
            }
            if (i2 > 20 && i2 <= 60 && i > 45 && i <= 60) {
                return 6;
            }
            if (i2 > 20 && i2 <= 60 && i > 30 && i <= 45) {
                return 7;
            }
            if (i2 > 20 && i2 <= 100 && i > 15 && i <= 30) {
                return 8;
            }
        }
        return 0;
    }

    public static boolean n(Bitmap bitmap, int i, float f) {
        int iJ;
        float f2;
        int count;
        List<ColorStatisticsBean> listH = h(bitmap);
        if (bitmap == null || listH == null || (iJ = j(bitmap)) == -1) {
            return false;
        }
        float f3 = iJ;
        if (listH.get(0).getCount() / f3 > f) {
            return true;
        }
        if (listH.size() >= 1) {
            ColorStatisticsBean colorStatisticsBean = listH.get(0);
            float[] fArr = new float[3];
            Color.colorToHSV(Color.parseColor(colorStatisticsBean.getColor()), fArr);
            f2 = fArr[0];
            count = colorStatisticsBean.getCount();
        } else {
            f2 = 0.0f;
            count = 0;
        }
        if (listH.size() >= 2) {
            ColorStatisticsBean colorStatisticsBean2 = listH.get(1);
            float[] fArr2 = new float[3];
            Color.colorToHSV(Color.parseColor(colorStatisticsBean2.getColor()), fArr2);
            if (Math.abs((int) (f2 - fArr2[0])) <= i) {
                count += colorStatisticsBean2.getCount();
            }
        }
        if (listH.size() >= 3) {
            ColorStatisticsBean colorStatisticsBean3 = listH.get(2);
            float[] fArr3 = new float[3];
            Color.colorToHSV(Color.parseColor(colorStatisticsBean3.getColor()), fArr3);
            if (Math.abs((int) (f2 - fArr3[0])) <= i) {
                count += colorStatisticsBean3.getCount();
            }
        }
        return ((float) count) / f3 >= f;
    }

    public static void o(int[][] iArr) {
        for (int i = 5; i < 9; i++) {
            q(iArr, i);
            t(iArr, i);
            r(iArr, i);
            s(iArr, i);
            u(iArr, i);
        }
        int[] iArr2 = iArr[0];
        iArr2[0] = iArr2[0] + iArr2[1];
        int[] iArr3 = iArr[3];
        iArr3[0] = iArr3[0] + iArr3[1];
        int[] iArr4 = iArr[7];
        iArr4[0] = iArr4[0] + iArr4[1];
        int[] iArr5 = iArr[11];
        iArr5[0] = iArr5[0] + iArr5[1];
        int[] iArr6 = iArr[13];
        iArr6[0] = iArr6[0] + iArr6[1];
    }

    public static void p(int[][] iArr) {
        o(iArr);
        v(iArr);
        w(iArr);
    }

    public static void q(int[][] iArr, int i) {
        int[] iArr2 = iArr[0];
        int i2 = iArr2[i];
        int[] iArr3 = iArr[1];
        int i3 = i2 + iArr3[i];
        int[] iArr4 = iArr[2];
        iArr2[i] = i3 + iArr4[i];
        iArr3[i] = 0;
        iArr4[i] = 0;
    }

    public static void r(int[][] iArr, int i) {
        int[] iArr2 = iArr[7];
        int i2 = iArr2[i];
        int[] iArr3 = iArr[8];
        int i3 = i2 + iArr3[i];
        int[] iArr4 = iArr[9];
        int i4 = i3 + iArr4[i];
        int[] iArr5 = iArr[10];
        iArr2[i] = i4 + iArr5[i];
        iArr3[i] = 0;
        iArr4[i] = 0;
        iArr5[i] = 0;
    }

    public static void s(int[][] iArr, int i) {
        int[] iArr2 = iArr[11];
        int i2 = iArr2[i];
        int[] iArr3 = iArr[12];
        iArr2[i] = i2 + iArr3[i];
        iArr3[i] = 0;
    }

    public static void t(int[][] iArr, int i) {
        int[] iArr2 = iArr[3];
        int i2 = iArr2[i];
        int[] iArr3 = iArr[4];
        int i3 = i2 + iArr3[i];
        int[] iArr4 = iArr[5];
        int i4 = i3 + iArr4[i];
        int[] iArr5 = iArr[6];
        iArr2[i] = i4 + iArr5[i];
        iArr3[i] = 0;
        iArr4[i] = 0;
        iArr5[i] = 0;
    }

    public static void u(int[][] iArr, int i) {
        int[] iArr2 = iArr[13];
        int i2 = iArr2[i];
        int[] iArr3 = iArr[14];
        int i3 = i2 + iArr3[i];
        int[] iArr4 = iArr[15];
        int i4 = i3 + iArr4[i];
        int[] iArr5 = iArr[16];
        iArr2[i] = i4 + iArr5[i];
        iArr3[i] = 0;
        iArr4[i] = 0;
        iArr5[i] = 0;
    }

    public static void v(int[][] iArr) {
        for (int i = 0; i < 16; i++) {
            int[] iArr2 = iArr[i];
            iArr2[0] = iArr2[0] + iArr2[1];
            iArr2[1] = 0;
            iArr2[3] = iArr2[3] + iArr2[4];
            iArr2[4] = 0;
        }
    }

    public static void w(int[][] iArr) {
        int[] iArr2 = iArr[16];
        iArr2[0] = iArr2[0] + iArr2[1];
        iArr2[1] = 0;
        iArr2[3] = iArr2[3] + iArr2[4];
        iArr2[4] = 0;
    }

    public static void x(int[][] iArr, int i, List<ColorStatisticsBean> list) {
        if (i == 0) {
            return;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            for (int i3 = 0; i3 < iArr[0].length; i3++) {
                if (iArr[i2][i3] == i) {
                    list.add(new ColorStatisticsBean(f11422c[i2][i3], i, i2, i3));
                }
            }
        }
    }

    public static void y(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = 0;
            while (i2 < iArr[i].length) {
                int i3 = i2 + 1;
                int i4 = i;
                int i5 = i3;
                while (i4 < iArr.length) {
                    while (true) {
                        int[] iArr2 = iArr[i];
                        if (i5 < iArr2.length) {
                            int i6 = iArr2[i2];
                            int[] iArr3 = iArr[i4];
                            int i7 = iArr3[i5];
                            if (i6 < i7) {
                                iArr3[i5] = i6;
                                iArr2[i2] = i7;
                            }
                            i5++;
                        }
                    }
                    i4++;
                    i5 = 0;
                }
                i2 = i3;
            }
        }
    }
}
