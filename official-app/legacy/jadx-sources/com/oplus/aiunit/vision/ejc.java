package com.oplus.aiunit.vision;

import android.util.Log;
import com.heytap.nearx.uikit.widget.NearLockPatternView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ejc {
    public static String a(List<NearLockPatternView.Cell> list) {
        if (list == null) {
            return "";
        }
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            NearLockPatternView.Cell cell = list.get(i);
            bArr[i] = (byte) ((cell.getRow() * 3) + cell.getColumn() + 49);
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            Log.e("NearLockPatternUtils", "patternToString e:" + e2.getMessage());
            e2.printStackTrace();
            return null;
        }
    }

    public static List<NearLockPatternView.Cell> b(String str) {
        byte[] bytes = null;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            Log.e("NearLockPatternUtils", "stringToPattern e:" + e2.getMessage());
            e2.printStackTrace();
        }
        for (byte b : bytes) {
            byte b2 = (byte) (b - 49);
            arrayList.add(NearLockPatternView.Cell.of(b2 / 3, b2 % 3));
        }
        return arrayList;
    }
}
