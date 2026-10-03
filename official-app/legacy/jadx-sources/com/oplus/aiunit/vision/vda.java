package com.oplus.aiunit.vision;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class vda {
    public static boolean a(Intent intent, String str, boolean z) {
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    @Nullable
    public static Bundle b(Intent intent, String str) {
        try {
            return intent.getBundleExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static byte[] c(Intent intent, String str) {
        try {
            return intent.getByteArrayExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static Bundle d(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static float e(Intent intent, String str, float f) {
        try {
            return intent.getFloatExtra(str, f);
        } catch (Exception unused) {
            return f;
        }
    }

    public static int f(Intent intent, String str, int i) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    public static long g(Intent intent, String str, long j2) {
        try {
            return intent.getLongExtra(str, j2);
        } catch (Exception unused) {
            return j2;
        }
    }

    public static <T extends Parcelable> T h(Intent intent, String str) {
        try {
            return (T) intent.getParcelableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static Serializable i(Intent intent, String str) {
        try {
            return intent.getSerializableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Serializable j(Intent intent, String str) {
        try {
            return intent.getSerializableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static String k(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String l(Intent intent, String str, @NotNull String str2) {
        String stringExtra;
        try {
            stringExtra = intent.getStringExtra(str);
        } catch (Exception unused) {
            stringExtra = null;
        }
        return TextUtils.isEmpty(stringExtra) ? str2 : stringExtra;
    }
}
