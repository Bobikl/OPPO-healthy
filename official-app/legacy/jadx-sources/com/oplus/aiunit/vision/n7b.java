package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes11.dex */
public interface n7b {

    public static class a implements n7b {
        public static final boolean b;
        public final String a;

        static {
            boolean z;
            try {
                Class.forName("android.util.Log");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            b = z;
        }

        public a(String str) {
            this.a = str;
        }

        public static boolean c() {
            return b;
        }

        @Override // com.oplus.aiunit.vision.n7b
        public void a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(d(level), this.a, str);
            }
        }

        @Override // com.oplus.aiunit.vision.n7b
        public void b(Level level, String str, Throwable th) {
            if (level != Level.OFF) {
                Log.println(d(level), this.a, str + Weather.SEPARATOR + Log.getStackTraceString(th));
            }
        }

        public int d(Level level) {
            int iIntValue = level.intValue();
            if (iIntValue < 800) {
                return iIntValue < 500 ? 2 : 3;
            }
            if (iIntValue < 900) {
                return 4;
            }
            return iIntValue < 1000 ? 5 : 6;
        }
    }

    public static class b implements n7b {
        @Override // com.oplus.aiunit.vision.n7b
        public void a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // com.oplus.aiunit.vision.n7b
        public void b(Level level, String str, Throwable th) {
            System.out.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th);
}
