package com.oplus.aiunit.vision;

import android.text.format.Time;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class vxm {
    public static final vxm a = new vxm();

    public final String a(int i) {
        if (i == 1) {
            return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
        }
        if (i == 2) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i == 8) {
            return ExifInterface.LONGITUDE_WEST;
        }
        if (i != 16) {
            return i != 32 ? "-" : "A";
        }
        return ExifInterface.LONGITUDE_EAST;
    }

    public String b(int i, Thread thread, long j2, String str, String str2, Throwable th) {
        long j3 = j2 % 1000;
        Time time = new Time();
        time.set(j2);
        StringBuilder sb = new StringBuilder();
        sb.append(a(i));
        sb.append(mla.SEPARATOR);
        sb.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb.append('.');
        if (j3 < 10) {
            sb.append("00");
        } else if (j3 < 100) {
            sb.append('0');
        }
        sb.append(j3);
        sb.append(StringUtil.SPACE);
        sb.append('[');
        if (thread == null) {
            sb.append("N/A");
        } else {
            sb.append(thread.getName());
        }
        sb.append(']');
        sb.append('[');
        sb.append(str);
        sb.append(']');
        sb.append(StringUtil.SPACE);
        sb.append(str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        return sb.toString();
    }
}
