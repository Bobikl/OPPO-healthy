package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public final class ksb {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13395c;
    public final int d;

    public static final class a {
        public static final int i = 1;
        public final Context a;
        public ActivityManager b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f13396c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f13397e;
        public float d = 2.0f;
        public float f = 0.4f;
        public float g = 0.33f;
        public int h = 4194304;

        public a(Context context) {
            this.f13397e = i;
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.f13396c = new b(context.getResources().getDisplayMetrics());
            if (ksb.e(this.b)) {
                this.f13397e = 0.0f;
            }
        }

        public ksb a() {
            return new ksb(this);
        }
    }

    public static final class b implements c {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.oplus.aiunit.vision.ksb.c
        public int a() {
            return this.a.heightPixels;
        }

        @Override // com.oplus.aiunit.vision.ksb.c
        public int b() {
            return this.a.widthPixels;
        }
    }

    public interface c {
        int a();

        int b();
    }

    public ksb(a aVar) {
        this.f13395c = aVar.a;
        int i = e(aVar.b) ? aVar.h / 2 : aVar.h;
        this.d = i;
        int iC = c(aVar.b, aVar.f, aVar.g);
        float fB = aVar.f13396c.b() * aVar.f13396c.a() * 4;
        int iRound = Math.round(aVar.f13397e * fB);
        int iRound2 = Math.round(fB * aVar.d);
        int i2 = iC - i;
        int i3 = iRound2 + iRound;
        if (i3 <= i2) {
            this.b = iRound2;
            this.a = iRound;
        } else {
            float f = i2;
            float f2 = aVar.f13397e;
            float f3 = aVar.d;
            float f4 = f / (f2 + f3);
            this.b = Math.round(f3 * f4);
            this.a = Math.round(f4 * aVar.f13397e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.b));
            sb.append(", pool size: ");
            sb.append(f(this.a));
            sb.append(", byte array size: ");
            sb.append(f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iC);
            sb.append(", max size: ");
            sb.append(f(iC));
            sb.append(", memoryClass: ");
            sb.append(aVar.b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    public static int c(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public final String f(int i) {
        return Formatter.formatFileSize(this.f13395c, i);
    }
}
