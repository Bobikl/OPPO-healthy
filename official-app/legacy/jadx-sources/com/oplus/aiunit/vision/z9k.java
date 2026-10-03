package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes13.dex */
public final class z9k {
    public static final int PAINT_FLAGS = 6;
    public static final Paint a = new Paint(6);
    public static final Paint b = new Paint(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Paint f19332c;
    public static final Set<String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Lock f19333e;

    public class a implements c {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.oplus.aiunit.vision.z9k.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.a;
            canvas.drawRoundRect(rectF, i, i, paint);
        }
    }

    public class b implements c {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f19334c;
        public final /* synthetic */ float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.f19334c = f3;
            this.d = f4;
        }

        @Override // com.oplus.aiunit.vision.z9k.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.a;
            float f2 = this.b;
            float f3 = this.f19334c;
            float f4 = this.d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    public static final class d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        d = hashSet;
        f19333e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f19332c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        f19333e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, a);
            e(canvas);
        } finally {
            f19333e.unlock();
        }
    }

    public static Bitmap b(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapC = kf1Var.c(i, i2, k(bitmap));
        r(bitmap, bitmapC);
        a(bitmap, bitmapC, matrix);
        return bitmapC;
    }

    public static Bitmap c(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return f(kf1Var, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap d(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapG = g(kf1Var, bitmap);
        Bitmap bitmapC = kf1Var.c(iMin, iMin, h(bitmap));
        bitmapC.setHasAlpha(true);
        Lock lock = f19333e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapC);
            canvas.drawCircle(f2, f2, f2, b);
            canvas.drawBitmap(bitmapG, (Rect) null, rectF, f19332c);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                kf1Var.b(bitmapG);
            }
            return bitmapC;
        } catch (Throwable th) {
            f19333e.unlock();
            throw th;
        }
    }

    public static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapC = kf1Var.c((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), k(bitmap));
        r(bitmap, bitmapC);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmapC.getWidth() + "x" + bitmapC.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(fMin);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        a(bitmap, bitmapC, matrix);
        return bitmapC;
    }

    public static Bitmap g(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap) {
        Bitmap.Config configH = h(bitmap);
        if (configH.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapC = kf1Var.c(bitmap.getWidth(), bitmap.getHeight(), configH);
        new Canvas(bitmapC).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapC;
    }

    @NonNull
    public static Bitmap.Config h(@NonNull Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f19333e;
    }

    public static int j(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @NonNull
    public static Bitmap.Config k(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @VisibleForTesting
    public static void l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i) {
        if (!m(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapC = kf1Var.c(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapC.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmapC, matrix);
        return bitmapC;
    }

    public static Bitmap o(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, float f, float f2, float f3, float f4) {
        return q(kf1Var, bitmap, new b(f, f2, f3, f4));
    }

    public static Bitmap p(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i) {
        cpe.a(i > 0, "roundingRadius must be greater than 0.");
        return q(kf1Var, bitmap, new a(i));
    }

    public static Bitmap q(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, c cVar) {
        Bitmap.Config configH = h(bitmap);
        Bitmap bitmapG = g(kf1Var, bitmap);
        Bitmap bitmapC = kf1Var.c(bitmapG.getWidth(), bitmapG.getHeight(), configH);
        bitmapC.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapG, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
        Lock lock = f19333e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapC);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                kf1Var.b(bitmapG);
            }
            return bitmapC;
        } catch (Throwable th) {
            f19333e.unlock();
            throw th;
        }
    }

    public static void r(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
