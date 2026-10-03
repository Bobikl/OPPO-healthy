package com.heytap.omas.a.e;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final String b = "TimeSynManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7596c = "diff_time_file";
    private static final String d = "diff_time";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f7597e = (long) (Math.pow(2.0d, 63.0d) - 1.0d);
    private volatile long a;

    public static final class b {
        private static l a = new l();

        private b() {
        }
    }

    private l() {
        this.a = f7597e;
    }

    private long b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f7596c, 0);
        long j2 = f7597e;
        long j3 = sharedPreferences.getLong(d, j2);
        if (j3 != j2) {
            return j3;
        }
        i.c(b, "loadDiffTime: diffTime not record,will return 0 for default diff time.");
        return 0L;
    }

    public long a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("getDiffTime: Context cannot be null.");
        }
        if (this.a == f7597e) {
            i.b(b, "getDiffTime: would load diff time from sp file.");
            this.a = b(context);
        }
        return this.a;
    }

    public long a(@NonNull Context context, long j2, long j3, long j4) {
        if (context == null || j3 < 0 || j4 < 0 || j3 > j4) {
            i.b(b, "genDiffTime: parameters invalid.context=" + context + ",localtime0=" + j3 + ",localTime1=" + j4);
        } else {
            long j5 = j2 - ((j4 + j3) / 2);
            i.c(b, "genDiffTime: old_diff_time:" + this.a + ",newer_diff_time:" + j5);
            if (this.a == j5) {
                return j5;
            }
            this.a = j5;
            i.c(b, "genDiffTime: diff_time:" + j5);
            a(context, j5);
        }
        return this.a;
    }

    public static l a() {
        return b.a;
    }

    private void a(Context context, long j2) {
        if (context == null) {
            throw new IllegalArgumentException("saveDiffTime: Parameters invalid.");
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f7596c, 0).edit();
        editorEdit.putLong(d, j2);
        i.c(b, "saveDiffTime: commit_result:" + editorEdit.commit());
    }
}
