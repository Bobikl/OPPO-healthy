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
public class el3 {
    public static final int COLUMN_11 = 11;
    public static final int ROW_20 = 20;
    public static final String TAG = "ColorSelectHelper2";
    public static final SparseIntArray a;
    public static final String[][] b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        b = new String[][]{new String[]{"#F5C6C1", "#F7ABAB", "#FA8E82", "#F05F51", "#E63939", "#D11525", "#B33F3D", "#824949", "#612D29", "#950E16", "#4A1E1E"}, new String[]{"#F2CAB8", "#F2B7A0", "#FC9C84", "#F77957", "#F06837", "#D45119", "#B05B3C", "#805447", "#61392C", "#992A0E", "#47251C"}, new String[]{"#F7D4BA", "#F2C8A7", "#FABA82", "#FF8D5C", "#F59338", "#FA8225", "#B3753E", "#82624A", "#61452C", "#A64C07", "#473119"}, new String[]{"#FAE7BB", "#F2DCB3", "#FCCB79", "#F5C34E", "#EDBC34", "#E0A50D", "#B3953D", "#857450", "#66502D", "#9E6D0B", "#47391D"}, new String[]{"#F7F1A6", "#F2ECAA", "#F2E872", "#F5E253", "#F0E43C", "#D6BF0F", "#B3A93D", "#827E4E", "#635E2F", "#A38907", "#47421D"}, new String[]{"#E7F7A6", "#E2F5A9", "#DCF07A", "#DAF558", "#D3F030", "#C7D411", "#97B342", "#7B8751", "#5A632B", "#849407", "#3D471E"}, new String[]{"#E1F7C6", "#D0F2AA", "#BFF589", "#B4F25C", "#ABF035", "#8ACF15", "#7DB53E", "#708751", "#4A612D", "#588A0E", "#344719"}, new String[]{"#CFF7C6", "#BBFBAB", "#ACF799", "#84F56E", "#5DF041", "#58C223", "#58B03F", "#58804D", "#3A5E2B", "#2C870B", "#2A4A1E"}, new String[]{"#B9F0CB", "#A8F0BD", "#84F09A", "#53E67A", "#29E678", "#26BD5B", "#3EB559", "#467D56", "#2B6136", "#0F873B", "#204D2A"}, new String[]{"#BCF7E0", "#A4F5D4", "#87F5CC", "#76EDC0", "#2BEDB9", "#30C294", "#3EB082", "#467866", "#275C44", "#008F62", "#1F4B3A"}, new String[]{"#C6F7E9", "#9EF0EA", "#81E6E0", "#72EDE7", "#35DED5", "#28C7C4", "#3AB0AA", "#45827D", "#275C55", "#03858A", "#1B4744"}, new String[]{"#C1E9F7", "#99E5F7", "#88E0F0", "#6DD3F2", "#3ECFF7", "#1FB5DE", "#3EA1B3", "#457682", "#27515C", "#0A7394", "#20444F"}, new String[]{"#C2E2F2", "#9DD8F6", "#86BDF5", "#5CB6F7", "#42A3FC", "#2394EB", "#397EB3", "#426580", "#283E5E", "#0F5594", "#1F354D"}, new String[]{"#C8D2F7", "#A7B9FC", "#7F98F5", "#618FFA", "#4083FF", "#3261FA", "#3955B3", "#49568A", "#2C3361", "#263999", "#242A54"}, new String[]{"#D1CBF7", "#B0A2F2", "#8D7FF5", "#8A76F5", "#6652FF", "#5C2EF2", "#4C3AB5", "#564A8F", "#40306B", "#3618AD", "#2D224D"}, new String[]{"#DEC8F7", "#D0A2F9", "#AE85E2", "#A972FC", "#943EF7", "#6A14CC", "#6A3DB3", "#6E4791", "#4B2B61", "#4B10B0", "#371F4D"}, new String[]{"#E7C4F5", "#EEA3FB", "#CE82F5", "#C26DDE", "#BD34EB", "#A41DD1", "#8F3CB0", "#7D428C", "#5C285E", "#711F8C", "#431F4D"}, new String[]{"#FAC8F5", "#FBA1DB", "#F27EDA", "#ED5AA6", "#DE3A84", "#AB2284", "#B33E8C", "#934A80", "#612B46", "#8C1568", "#4D1F42"}, new String[]{"#FAC8D7", "#FFA3B3", "#F7819C", "#FF6B8B", "#EB3F5A", "#BA2537", "#B33D56", "#874650", "#572831", "#820D2A", "#54222F"}, new String[]{"#F0F0F0", "#B3B3B3", "#737373", "#404040", "#000000", "#000000", "#000000", "#000000", "#000000", "#000000", "#000000"}};
        sparseIntArray.put(Color.parseColor("#F5C6C1"), Color.parseColor("#B33F3D"));
        sparseIntArray.put(Color.parseColor("#F2CAB8"), Color.parseColor("#B05B3C"));
        sparseIntArray.put(Color.parseColor("#F7D4BA"), Color.parseColor("#B3753E"));
        sparseIntArray.put(Color.parseColor("#FAE7BB"), Color.parseColor("#B3953D"));
        sparseIntArray.put(Color.parseColor("#F7F1A6"), Color.parseColor("#B3A93D"));
        sparseIntArray.put(Color.parseColor("#E7F7A6"), Color.parseColor("#97B342"));
        sparseIntArray.put(Color.parseColor("#E1F7C6"), Color.parseColor("#7DB53E"));
        sparseIntArray.put(Color.parseColor("#CFF7C6"), Color.parseColor("#58B03F"));
        sparseIntArray.put(Color.parseColor("#B9F0CB"), Color.parseColor("#3EB559"));
        sparseIntArray.put(Color.parseColor("#BCF7E0"), Color.parseColor("#3EB082"));
        sparseIntArray.put(Color.parseColor("#C6F7E9"), Color.parseColor("#3AB0AA"));
        sparseIntArray.put(Color.parseColor("#C1E9F7"), Color.parseColor("#3EA1B3"));
        sparseIntArray.put(Color.parseColor("#C2E2F2"), Color.parseColor("#397EB3"));
        sparseIntArray.put(Color.parseColor("#C8D2F7"), Color.parseColor("#3955B3"));
        sparseIntArray.put(Color.parseColor("#D1CBF7"), Color.parseColor("#4C3AB5"));
        sparseIntArray.put(Color.parseColor("#DEC8F7"), Color.parseColor("#6A3DB3"));
        sparseIntArray.put(Color.parseColor("#E7C4F5"), Color.parseColor("#8F3CB0"));
        sparseIntArray.put(Color.parseColor("#FAC8F5"), Color.parseColor("#B33E8C"));
        sparseIntArray.put(Color.parseColor("#FAC8D7"), Color.parseColor("#B33D56"));
        sparseIntArray.put(Color.parseColor("#F7ABAB"), Color.parseColor("#824949"));
        sparseIntArray.put(Color.parseColor("#F2B7A0"), Color.parseColor("#805447"));
        sparseIntArray.put(Color.parseColor("#F2C8A7"), Color.parseColor("#82624A"));
        sparseIntArray.put(Color.parseColor("#F2DCB3"), Color.parseColor("#857450"));
        sparseIntArray.put(Color.parseColor("#F2ECAA"), Color.parseColor("#827E4E"));
        sparseIntArray.put(Color.parseColor("#E2F5A9"), Color.parseColor("#7B8751"));
        sparseIntArray.put(Color.parseColor("#D0F2AA"), Color.parseColor("#708751"));
        sparseIntArray.put(Color.parseColor("#BBFBAB"), Color.parseColor("#58804D"));
        sparseIntArray.put(Color.parseColor("#A8F0BD"), Color.parseColor("#467D56"));
        sparseIntArray.put(Color.parseColor("#A4F5D4"), Color.parseColor("#467866"));
        sparseIntArray.put(Color.parseColor("#9EF0EA"), Color.parseColor("#45827D"));
        sparseIntArray.put(Color.parseColor("#99E5F7"), Color.parseColor("#457682"));
        sparseIntArray.put(Color.parseColor("#9DD8F6"), Color.parseColor("#426580"));
        sparseIntArray.put(Color.parseColor("#A7B9FC"), Color.parseColor("#49568A"));
        sparseIntArray.put(Color.parseColor("#B0A2F2"), Color.parseColor("#564A8F"));
        sparseIntArray.put(Color.parseColor("#D0A2F9"), Color.parseColor("#6E4791"));
        sparseIntArray.put(Color.parseColor("#EEA3FB"), Color.parseColor("#7D428C"));
        sparseIntArray.put(Color.parseColor("#FBA1DB"), Color.parseColor("#934A80"));
        sparseIntArray.put(Color.parseColor("#FFA3B3"), Color.parseColor("#874650"));
        sparseIntArray.put(Color.parseColor("#FA8E82"), Color.parseColor("#612D29"));
        sparseIntArray.put(Color.parseColor("#FC9C84"), Color.parseColor("#61392C"));
        sparseIntArray.put(Color.parseColor("#FABA82"), Color.parseColor("#61452C"));
        sparseIntArray.put(Color.parseColor("#FCCB79"), Color.parseColor("#66502D"));
        sparseIntArray.put(Color.parseColor("#F2E872"), Color.parseColor("#635E2F"));
        sparseIntArray.put(Color.parseColor("#DCF07A"), Color.parseColor("#5A632B"));
        sparseIntArray.put(Color.parseColor("#BFF589"), Color.parseColor("#4A612D"));
        sparseIntArray.put(Color.parseColor("#ACF799"), Color.parseColor("#3A5E2B"));
        sparseIntArray.put(Color.parseColor("#84F09A"), Color.parseColor("#2B6136"));
        sparseIntArray.put(Color.parseColor("#87F5CC"), Color.parseColor("#275C44"));
        sparseIntArray.put(Color.parseColor("#81E6E0"), Color.parseColor("#275C55"));
        sparseIntArray.put(Color.parseColor("#88E0F0"), Color.parseColor("#27515C"));
        sparseIntArray.put(Color.parseColor("#86BDF5"), Color.parseColor("#283E5E"));
        sparseIntArray.put(Color.parseColor("#7F98F5"), Color.parseColor("#2C3361"));
        sparseIntArray.put(Color.parseColor("#8D7FF5"), Color.parseColor("#40306B"));
        sparseIntArray.put(Color.parseColor("#AE85E2"), Color.parseColor("#4B2B61"));
        sparseIntArray.put(Color.parseColor("#CE82F5"), Color.parseColor("#5C285E"));
        sparseIntArray.put(Color.parseColor("#F27EDA"), Color.parseColor("#612B46"));
        sparseIntArray.put(Color.parseColor("#F7819C"), Color.parseColor("#572831"));
        sparseIntArray.put(Color.parseColor("#F05F51"), Color.parseColor("#D11525"));
        sparseIntArray.put(Color.parseColor("#E63939"), Color.parseColor("#950E16"));
        sparseIntArray.put(Color.parseColor("#D11525"), Color.parseColor("#F05F51"));
        sparseIntArray.put(Color.parseColor("#B33F3D"), Color.parseColor("#F5C6C1"));
        sparseIntArray.put(Color.parseColor("#824949"), Color.parseColor("#F7ABAB"));
        sparseIntArray.put(Color.parseColor("#612D29"), Color.parseColor("#FA8E82"));
        sparseIntArray.put(Color.parseColor("#950E16"), Color.parseColor("#E63939"));
        sparseIntArray.put(Color.parseColor("#4A1E1E"), Color.parseColor("#FA8E82"));
        sparseIntArray.put(Color.parseColor("#F77957"), Color.parseColor("#D45119"));
        sparseIntArray.put(Color.parseColor("#F06837"), Color.parseColor("#992A0E"));
        sparseIntArray.put(Color.parseColor("#D45119"), Color.parseColor("#F77957"));
        sparseIntArray.put(Color.parseColor("#B05B3C"), Color.parseColor("#F2CAB8"));
        sparseIntArray.put(Color.parseColor("#805447"), Color.parseColor("#F2B7A0"));
        sparseIntArray.put(Color.parseColor("#61392C"), Color.parseColor("#FC9C84"));
        sparseIntArray.put(Color.parseColor("#992A0E"), Color.parseColor("#F06837"));
        sparseIntArray.put(Color.parseColor("#47251C"), Color.parseColor("#FC9C84"));
        sparseIntArray.put(Color.parseColor("#FF8D5C"), Color.parseColor("#FA8225"));
        sparseIntArray.put(Color.parseColor("#F59338"), Color.parseColor("#A64C07"));
        sparseIntArray.put(Color.parseColor("#FA8225"), Color.parseColor("#FF8D5C"));
        sparseIntArray.put(Color.parseColor("#B3753E"), Color.parseColor("#F7D4BA"));
        sparseIntArray.put(Color.parseColor("#82624A"), Color.parseColor("#F2C8A7"));
        sparseIntArray.put(Color.parseColor("#61452C"), Color.parseColor("#FABA82"));
        sparseIntArray.put(Color.parseColor("#A64C07"), Color.parseColor("#F59338"));
        sparseIntArray.put(Color.parseColor("#473119"), Color.parseColor("#FABA82"));
        sparseIntArray.put(Color.parseColor("#F5C34E"), Color.parseColor("#E0A50D"));
        sparseIntArray.put(Color.parseColor("#EDBC34"), Color.parseColor("#9E6D0B"));
        sparseIntArray.put(Color.parseColor("#E0A50D"), Color.parseColor("#F5C34E"));
        sparseIntArray.put(Color.parseColor("#B3953D"), Color.parseColor("#FAE7BB"));
        sparseIntArray.put(Color.parseColor("#857450"), Color.parseColor("#F2DCB3"));
        sparseIntArray.put(Color.parseColor("#66502D"), Color.parseColor("#FCCB79"));
        sparseIntArray.put(Color.parseColor("#9E6D0B"), Color.parseColor("#EDBC34"));
        sparseIntArray.put(Color.parseColor("#47391D"), Color.parseColor("#FCCB79"));
        sparseIntArray.put(Color.parseColor("#F5E253"), Color.parseColor("#D6BF0F"));
        sparseIntArray.put(Color.parseColor("#F0E43C"), Color.parseColor("#A38907"));
        sparseIntArray.put(Color.parseColor("#D6BF0F"), Color.parseColor("#F5E253"));
        sparseIntArray.put(Color.parseColor("#B3A93D"), Color.parseColor("#F7F1A6"));
        sparseIntArray.put(Color.parseColor("#827E4E"), Color.parseColor("#F2ECAA"));
        sparseIntArray.put(Color.parseColor("#635E2F"), Color.parseColor("#F2E872"));
        sparseIntArray.put(Color.parseColor("#A38907"), Color.parseColor("#F0E43C"));
        sparseIntArray.put(Color.parseColor("#47421D"), Color.parseColor("#F2E872"));
        sparseIntArray.put(Color.parseColor("#DAF558"), Color.parseColor("#C7D411"));
        sparseIntArray.put(Color.parseColor("#D3F030"), Color.parseColor("#849407"));
        sparseIntArray.put(Color.parseColor("#C7D411"), Color.parseColor("#DAF558"));
        sparseIntArray.put(Color.parseColor("#97B342"), Color.parseColor("#E7F7A6"));
        sparseIntArray.put(Color.parseColor("#7B8751"), Color.parseColor("#E2F5A9"));
        sparseIntArray.put(Color.parseColor("#5A632B"), Color.parseColor("#DCF07A"));
        sparseIntArray.put(Color.parseColor("#849407"), Color.parseColor("#D3F030"));
        sparseIntArray.put(Color.parseColor("#3D471E"), Color.parseColor("#DCF07A"));
        sparseIntArray.put(Color.parseColor("#B4F25C"), Color.parseColor("#8ACF15"));
        sparseIntArray.put(Color.parseColor("#ABF035"), Color.parseColor("#588A0E"));
        sparseIntArray.put(Color.parseColor("#8ACF15"), Color.parseColor("#B4F25C"));
        sparseIntArray.put(Color.parseColor("#7DB53E"), Color.parseColor("#E1F7C6"));
        sparseIntArray.put(Color.parseColor("#708751"), Color.parseColor("#D0F2AA"));
        sparseIntArray.put(Color.parseColor("#4A612D"), Color.parseColor("#BFF589"));
        sparseIntArray.put(Color.parseColor("#588A0E"), Color.parseColor("#ABF035"));
        sparseIntArray.put(Color.parseColor("#344719"), Color.parseColor("#BFF589"));
        sparseIntArray.put(Color.parseColor("#84F56E"), Color.parseColor("#58C223"));
        sparseIntArray.put(Color.parseColor("#5DF041"), Color.parseColor("#2C870B"));
        sparseIntArray.put(Color.parseColor("#58C223"), Color.parseColor("#84F56E"));
        sparseIntArray.put(Color.parseColor("#58B03F"), Color.parseColor("#CFF7C6"));
        sparseIntArray.put(Color.parseColor("#58804D"), Color.parseColor("#BBFBAB"));
        sparseIntArray.put(Color.parseColor("#3A5E2B"), Color.parseColor("#ACF799"));
        sparseIntArray.put(Color.parseColor("#2C870B"), Color.parseColor("#5DF041"));
        sparseIntArray.put(Color.parseColor("#2A4A1E"), Color.parseColor("#ACF799"));
        sparseIntArray.put(Color.parseColor("#53E67A"), Color.parseColor("#26BD5B"));
        sparseIntArray.put(Color.parseColor("#29E678"), Color.parseColor("#0F873B"));
        sparseIntArray.put(Color.parseColor("#26BD5B"), Color.parseColor("#53E67A"));
        sparseIntArray.put(Color.parseColor("#3EB559"), Color.parseColor("#B9F0CB"));
        sparseIntArray.put(Color.parseColor("#467D56"), Color.parseColor("#A8F0BD"));
        sparseIntArray.put(Color.parseColor("#2B6136"), Color.parseColor("#84F09A"));
        sparseIntArray.put(Color.parseColor("#0F873B"), Color.parseColor("#29E678"));
        sparseIntArray.put(Color.parseColor("#204D2A"), Color.parseColor("#84F09A"));
        sparseIntArray.put(Color.parseColor("#76EDC0"), Color.parseColor("#30C294"));
        sparseIntArray.put(Color.parseColor("#2BEDB9"), Color.parseColor("#008F62"));
        sparseIntArray.put(Color.parseColor("#30C294"), Color.parseColor("#76EDC0"));
        sparseIntArray.put(Color.parseColor("#3EB082"), Color.parseColor("#BCF7E0"));
        sparseIntArray.put(Color.parseColor("#467866"), Color.parseColor("#A4F5D4"));
        sparseIntArray.put(Color.parseColor("#275C44"), Color.parseColor("#87F5CC"));
        sparseIntArray.put(Color.parseColor("#008F62"), Color.parseColor("#2BEDB9"));
        sparseIntArray.put(Color.parseColor("#1F4B3A"), Color.parseColor("#87F5CC"));
        sparseIntArray.put(Color.parseColor("#72EDE7"), Color.parseColor("#28C7C4"));
        sparseIntArray.put(Color.parseColor("#35DED5"), Color.parseColor("#03858A"));
        sparseIntArray.put(Color.parseColor("#28C7C4"), Color.parseColor("#72EDE7"));
        sparseIntArray.put(Color.parseColor("#3AB0AA"), Color.parseColor("#C6F7E9"));
        sparseIntArray.put(Color.parseColor("#45827D"), Color.parseColor("#9EF0EA"));
        sparseIntArray.put(Color.parseColor("#275C55"), Color.parseColor("#81E6E0"));
        sparseIntArray.put(Color.parseColor("#03858A"), Color.parseColor("#35DED5"));
        sparseIntArray.put(Color.parseColor("#1B4744"), Color.parseColor("#81E6E0"));
        sparseIntArray.put(Color.parseColor("#6DD3F2"), Color.parseColor("#1FB5DE"));
        sparseIntArray.put(Color.parseColor("#3ECFF7"), Color.parseColor("#0A7394"));
        sparseIntArray.put(Color.parseColor("#1FB5DE"), Color.parseColor("#6DD3F2"));
        sparseIntArray.put(Color.parseColor("#3EA1B3"), Color.parseColor("#C1E9F7"));
        sparseIntArray.put(Color.parseColor("#457682"), Color.parseColor("#99E5F7"));
        sparseIntArray.put(Color.parseColor("#27515C"), Color.parseColor("#88E0F0"));
        sparseIntArray.put(Color.parseColor("#0A7394"), Color.parseColor("#3ECFF7"));
        sparseIntArray.put(Color.parseColor("#20444F"), Color.parseColor("#88E0F0"));
        sparseIntArray.put(Color.parseColor("#5CB6F7"), Color.parseColor("#2394EB"));
        sparseIntArray.put(Color.parseColor("#42A3FC"), Color.parseColor("#0F5594"));
        sparseIntArray.put(Color.parseColor("#2394EB"), Color.parseColor("#5CB6F7"));
        sparseIntArray.put(Color.parseColor("#397EB3"), Color.parseColor("#C2E2F2"));
        sparseIntArray.put(Color.parseColor("#426580"), Color.parseColor("#9DD8F6"));
        sparseIntArray.put(Color.parseColor("#283E5E"), Color.parseColor("#86BDF5"));
        sparseIntArray.put(Color.parseColor("#0F5594"), Color.parseColor("#42A3FC"));
        sparseIntArray.put(Color.parseColor("#1F354D"), Color.parseColor("#86BDF5"));
        sparseIntArray.put(Color.parseColor("#618FFA"), Color.parseColor("#3261FA"));
        sparseIntArray.put(Color.parseColor("#4083FF"), Color.parseColor("#263999"));
        sparseIntArray.put(Color.parseColor("#3261FA"), Color.parseColor("#618FFA"));
        sparseIntArray.put(Color.parseColor("#3955B3"), Color.parseColor("#C8D2F7"));
        sparseIntArray.put(Color.parseColor("#49568A"), Color.parseColor("#A7B9FC"));
        sparseIntArray.put(Color.parseColor("#2C3361"), Color.parseColor("#7F98F5"));
        sparseIntArray.put(Color.parseColor("#263999"), Color.parseColor("#4083FF"));
        sparseIntArray.put(Color.parseColor("#242A54"), Color.parseColor("#7F98F5"));
        sparseIntArray.put(Color.parseColor("#8A76F5"), Color.parseColor("#5C2EF2"));
        sparseIntArray.put(Color.parseColor("#6652FF"), Color.parseColor("#3618AD"));
        sparseIntArray.put(Color.parseColor("#5C2EF2"), Color.parseColor("#8A76F5"));
        sparseIntArray.put(Color.parseColor("#4C3AB5"), Color.parseColor("#D1CBF7"));
        sparseIntArray.put(Color.parseColor("#564A8F"), Color.parseColor("#B0A2F2"));
        sparseIntArray.put(Color.parseColor("#40306B"), Color.parseColor("#8D7FF5"));
        sparseIntArray.put(Color.parseColor("#3618AD"), Color.parseColor("#6652FF"));
        sparseIntArray.put(Color.parseColor("#2D224D"), Color.parseColor("#8D7FF5"));
        sparseIntArray.put(Color.parseColor("#A972FC"), Color.parseColor("#6A14CC"));
        sparseIntArray.put(Color.parseColor("#943EF7"), Color.parseColor("#4B10B0"));
        sparseIntArray.put(Color.parseColor("#6A14CC"), Color.parseColor("#A972FC"));
        sparseIntArray.put(Color.parseColor("#6A3DB3"), Color.parseColor("#DEC8F7"));
        sparseIntArray.put(Color.parseColor("#6E4791"), Color.parseColor("#D0A2F9"));
        sparseIntArray.put(Color.parseColor("#4B2B61"), Color.parseColor("#AE85E2"));
        sparseIntArray.put(Color.parseColor("#4B10B0"), Color.parseColor("#943EF7"));
        sparseIntArray.put(Color.parseColor("#371F4D"), Color.parseColor("#AE85E2"));
        sparseIntArray.put(Color.parseColor("#C26DDE"), Color.parseColor("#A41DD1"));
        sparseIntArray.put(Color.parseColor("#BD34EB"), Color.parseColor("#711F8C"));
        sparseIntArray.put(Color.parseColor("#A41DD1"), Color.parseColor("#C26DDE"));
        sparseIntArray.put(Color.parseColor("#8F3CB0"), Color.parseColor("#E7C4F5"));
        sparseIntArray.put(Color.parseColor("#7D428C"), Color.parseColor("#EEA3FB"));
        sparseIntArray.put(Color.parseColor("#5C285E"), Color.parseColor("#CE82F5"));
        sparseIntArray.put(Color.parseColor("#711F8C"), Color.parseColor("#BD34EB"));
        sparseIntArray.put(Color.parseColor("#431F4D"), Color.parseColor("#CE82F5"));
        sparseIntArray.put(Color.parseColor("#ED5AA6"), Color.parseColor("#AB2284"));
        sparseIntArray.put(Color.parseColor("#DE3A84"), Color.parseColor("#8C1568"));
        sparseIntArray.put(Color.parseColor("#AB2284"), Color.parseColor("#ED5AA6"));
        sparseIntArray.put(Color.parseColor("#B33E8C"), Color.parseColor("#FAC8F5"));
        sparseIntArray.put(Color.parseColor("#934A80"), Color.parseColor("#FBA1DB"));
        sparseIntArray.put(Color.parseColor("#612B46"), Color.parseColor("#F27EDA"));
        sparseIntArray.put(Color.parseColor("#8C1568"), Color.parseColor("#DE3A84"));
        sparseIntArray.put(Color.parseColor("#4D1F42"), Color.parseColor("#F27EDA"));
        sparseIntArray.put(Color.parseColor("#FF6B8B"), Color.parseColor("#BA2537"));
        sparseIntArray.put(Color.parseColor("#EB3F5A"), Color.parseColor("#820D2A"));
        sparseIntArray.put(Color.parseColor("#BA2537"), Color.parseColor("#FF6B8B"));
        sparseIntArray.put(Color.parseColor("#B33D56"), Color.parseColor("#FAC8D7"));
        sparseIntArray.put(Color.parseColor("#874650"), Color.parseColor("#FFA3B3"));
        sparseIntArray.put(Color.parseColor("#572831"), Color.parseColor("#F7819C"));
        sparseIntArray.put(Color.parseColor("#820D2A"), Color.parseColor("#EB3F5A"));
        sparseIntArray.put(Color.parseColor("#54222F"), Color.parseColor("#F7819C"));
        sparseIntArray.put(Color.parseColor("#F0F0F0"), Color.parseColor("#898B8C"));
        sparseIntArray.put(Color.parseColor("#B3B3B3"), Color.parseColor("#6E7173"));
        sparseIntArray.put(Color.parseColor("#737373"), Color.parseColor("#B3B3B3"));
        sparseIntArray.put(Color.parseColor("#404040"), Color.parseColor("#C2C2C2"));
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
        int i;
        int i2;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 20, 11);
        byte[] bArrA = a(bitmap);
        if (bArrA == null) {
            return null;
        }
        int i3 = 0;
        while (true) {
            int iL = 3;
            if (i3 >= bArrA.length / 3) {
                return iArr;
            }
            int i4 = i3 * 3;
            int i5 = bArrA[i4] & 255;
            int i6 = bArrA[i4 + 1] & 255;
            int i7 = bArrA[i4 + 2] & 255;
            if ((i7 > i6 ? i7 : i6) > i5) {
                i = i7 > i6 ? i7 : i6;
            } else {
                i = i5;
            }
            if ((i7 < i6 ? i7 : i6) < i5) {
                i2 = i7 < i6 ? i7 : i6;
            } else {
                i2 = i5;
            }
            int i8 = i == i2 ? i + 1 : i;
            int iK = k(i);
            int iJ = j(i, i2, i8);
            int iF = f(i5, i6, i7, i, i2, i8);
            int iG = 19;
            if (iJ >= 0 && iJ < 10 && iK >= 80 && iK <= 100) {
                iL = 0;
            } else if (iJ >= 0 && iJ < 10 && iK >= 50 && iK < 80) {
                iL = 1;
            } else if (iJ >= 0 && iJ < 20 && iK >= 30 && iK < 45) {
                iL = 2;
            } else if ((iJ < 0 || iJ >= 20 || iK < 15 || iK >= 30) && iK > 15) {
                iG = g(iF);
                iL = l(iK, iJ);
            }
            int[] iArr2 = iArr[iG];
            iArr2[iL] = iArr2[iL] + 1;
            i3++;
        }
    }

    public static void c(int[][] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[0].length; i2++) {
                iArr2[i][i2] = iArr[i][i2];
            }
        }
    }

    public static int d(float f, int i) {
        return (Math.min(255, Math.max(0, (int) (f * 255.0f))) << 24) + (i & 16777215);
    }

    public static int e(int i) {
        return a.get(i);
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
        if (i > 10 && i <= 20) {
            return 1;
        }
        if (i > 20 && i <= 34) {
            return 2;
        }
        if (i > 34 && i <= 49) {
            return 3;
        }
        if (i > 49 && i <= 60) {
            return 4;
        }
        if (i > 60 && i <= 80) {
            return 5;
        }
        if (i > 80 && i <= 90) {
            return 6;
        }
        if (i > 90 && i <= 120) {
            return 7;
        }
        if (i > 120 && i <= 145) {
            return 8;
        }
        if (i > 145 && i <= 164) {
            return 9;
        }
        if (i > 164 && i <= 184) {
            return 10;
        }
        if (i > 184 && i <= 195) {
            return 11;
        }
        if (i > 195 && i <= 215) {
            return 12;
        }
        if (i > 215 && i <= 245) {
            return 13;
        }
        if (i > 245 && i <= 260) {
            return 14;
        }
        if (i > 260 && i <= 279) {
            return 15;
        }
        if (i > 279 && i <= 299) {
            return 16;
        }
        if (i <= 299 || i > 340) {
            return (i <= 340 || i > 354) ? 0 : 18;
        }
        return 17;
    }

    public static List<ColorStatisticsBean> h(Bitmap bitmap) {
        int[][] iArrB = b(bitmap);
        if (iArrB != null) {
            return i(iArrB);
        }
        ltl.b(TAG, "[getMatchedColor] --> originColorArray = null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[EDGE_INSN: B:50:0x00d8->B:44:0x00d8 BREAK  A[LOOP:0: B:8:0x0029->B:42:0x00cf, LOOP_LABEL: LOOP:0: B:8:0x0029->B:42:0x00cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7 A[SYNTHETIC] */
    public static List<ColorStatisticsBean> i(int[][] iArr) {
        if (iArr == null || iArr[0] == null) {
            ltl.b(TAG, "[getMaxColors] --> error=originColorArray is null");
            return null;
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 20, 11);
        c(iArr, iArr2);
        m(iArr2);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        loop0: for (int i = 0; i < 11; i++) {
            int i2 = iArr2[0][i];
            if (i2 <= 0) {
                ltl.d(TAG, "[getMaxColors] --> color count=0, break");
                break;
            }
            for (int i3 = 0; i3 < iArr.length; i3++) {
                for (int i4 = 0; i4 < iArr[0].length; i4++) {
                    if (iArr[i3][i4] == i2) {
                        if (i3 != 19) {
                            if (i4 > 2) {
                                if ((6 <= i4 && i4 <= 8) || i4 == 10) {
                                    if (!z) {
                                        z = true;
                                        arrayList.add(new ColorStatisticsBean(b[i3][i4], i2, i3, i4));
                                        if (arrayList.size() == 3) {
                                            break loop0;
                                            break loop0;
                                        }
                                    } else {
                                        ltl.a(TAG, "[getMaxColors] --> has alread has columnDark, j=" + i3 + " k=" + i4);
                                    }
                                } else {
                                    arrayList.add(new ColorStatisticsBean(b[i3][i4], i2, i3, i4));
                                    if (arrayList.size() == 3) {
                                        break loop0;
                                        break loop0;
                                    }
                                }
                            } else if (!z2) {
                                z2 = true;
                                arrayList.add(new ColorStatisticsBean(b[i3][i4], i2, i3, i4));
                                if (arrayList.size() == 3) {
                                    break loop0;
                                    break loop0;
                                }
                            } else {
                                ltl.a(TAG, "[getMaxColors] --> has alread has columnLight, j=" + i3 + " k=" + i4);
                            }
                        } else if (!z) {
                            z = true;
                            arrayList.add(new ColorStatisticsBean(b[i3][i4], i2, i3, i4));
                            if (arrayList.size() == 3) {
                                break loop0;
                            }
                        } else {
                            ltl.a(TAG, "[getMaxColors] --> has alread has gray, j=" + i3 + " k=" + i4);
                        }
                    }
                }
            }
        }
        ltl.d(TAG, "[getMaxColors] --> " + arrayList);
        return arrayList;
    }

    public static int j(int i, int i2, int i3) {
        if (i == 0 || i3 == 0) {
            return 0;
        }
        return ((i - i2) * 100) / i3;
    }

    public static int k(int i) {
        return (i * 100) / 255;
    }

    public static int l(int i, int i2) {
        if (i2 >= 20 && i2 < 40 && i >= 60 && i <= 100) {
            return 1;
        }
        if (i2 >= 40 && i2 < 50 && i >= 80 && i <= 100) {
            return 2;
        }
        if (i2 >= 50 && i2 < 70 && i >= 80 && i <= 100) {
            return 3;
        }
        if (i2 >= 70 && i2 < 80 && i >= 80 && i <= 100) {
            return 4;
        }
        if (i2 >= 80 && i2 <= 100 && i >= 60 && i <= 100) {
            return 5;
        }
        if (i2 >= 40 && i2 < 80 && i >= 60 && i < 80) {
            return 6;
        }
        if (i2 >= 20 && i2 < 60 && i >= 45 && i < 60) {
            return 7;
        }
        if (i2 >= 20 && i2 < 60 && i >= 30 && i < 45) {
            return 8;
        }
        if (i2 < 60 || i2 > 100 || i < 30 || i >= 60) {
            return (i2 < 20 || i2 > 100 || i < 15 || i >= 30) ? 0 : 10;
        }
        return 9;
    }

    public static void m(int[][] iArr) {
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
