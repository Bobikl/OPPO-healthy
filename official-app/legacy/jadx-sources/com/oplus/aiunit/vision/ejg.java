package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.WindowManager;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class ejg {
    public static int a;
    public static final Map<NearUIConfig.Status, Point> b = new HashMap();

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b() {
        com.heytap.health.base.resposiveui.config.a aVarM = com.heytap.health.base.resposiveui.config.a.m(b78.a());
        NearUIConfig.Status status = NearUIConfig.Status.UNFOLD;
        NearUIConfig.Status value = aVarM.q().getValue();
        NearUIConfig.Status status2 = NearUIConfig.Status.FOLD;
        if (value == status2) {
            status = status2;
        }
        Point pointI = b.get(status);
        if (pointI == null) {
            pointI = i(status);
        }
        return pointI.y;
    }

    public static int c() {
        com.heytap.health.base.resposiveui.config.a aVarM = com.heytap.health.base.resposiveui.config.a.m(b78.a());
        NearUIConfig.Status status = NearUIConfig.Status.UNFOLD;
        NearUIConfig.Status value = aVarM.q().getValue();
        NearUIConfig.Status status2 = NearUIConfig.Status.FOLD;
        if (value == status2) {
            status = status2;
        }
        Point pointI = b.get(status);
        if (pointI == null) {
            pointI = i(status);
        }
        return pointI.x;
    }

    public static Bitmap d(Bitmap bitmap, int i) {
        float fA = a(b78.a(), i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, fA, fA, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public static int e(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int f(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static Bitmap g(nzg.a aVar) {
        return aVar.r().j();
    }

    public static int h() {
        int i = a;
        if (i > 0) {
            return i;
        }
        Context contextA = b78.a();
        int iA = a(contextA, 20.0f);
        int identifier = contextA.getResources().getIdentifier("status_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier > 0) {
            iA = contextA.getResources().getDimensionPixelSize(identifier);
        }
        a = iA;
        return iA;
    }

    public static Point i(NearUIConfig.Status status) {
        Point point = new Point();
        b.put(status, point);
        WindowManager windowManager = (WindowManager) b78.a().getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            point.x = bounds.right;
            point.y = bounds.bottom;
        } else {
            windowManager.getDefaultDisplay().getRealSize(point);
        }
        return point;
    }

    public static boolean j(Context context) {
        int identifier = context.getResources().getIdentifier("config_lidControlsDisplayFold", "bool", "android");
        if (identifier > 0) {
            return context.getResources().getBoolean(identifier);
        }
        return false;
    }

    public static boolean k() {
        return Settings.Secure.getInt(b78.a().getContentResolver(), "navigation_mode", 0) == 2;
    }

    public static float l(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static int m(int i) {
        return (int) ((i / b78.a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int n(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().scaledDensity * f) + 0.5f);
    }
}
