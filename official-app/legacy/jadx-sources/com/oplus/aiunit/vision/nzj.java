package com.oplus.aiunit.vision;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes19.dex */
public class nzj {
    public static Calendar a(byte[] bArr) {
        int i = (bArr[3] & 255) | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(((long) i) * 1000);
        return gregorianCalendar;
    }
}
