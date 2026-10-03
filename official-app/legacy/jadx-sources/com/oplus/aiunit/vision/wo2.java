package com.oplus.aiunit.vision;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes17.dex */
public class wo2 {
    public static String a(long j2) {
        String str;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        if (j2 == 0) {
            return "0B";
        }
        if (j2 < 1024) {
            str = decimalFormat.format(j2) + c8l.KEY_B;
        } else if (j2 < 1048576) {
            str = decimalFormat.format(j2 / 1024.0d) + "K";
        } else if (j2 < 1073741824) {
            str = decimalFormat.format(j2 / 1048576.0d) + "M";
        } else {
            str = decimalFormat.format(j2 / 1.073741824E9d) + "G";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fileSizeString = ");
        sb.append(str);
        return str;
    }
}
