package com.oplus.aiunit.vision;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class l0c {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static int e(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int f(float f, float f2) {
        return g((int) f, (int) f2);
    }

    public static int g(int i, int i2) {
        return i - (i2 * e(i, i2));
    }

    public static void h(eyg eygVar, Path path) {
        path.reset();
        PointF pointFB = eygVar.b();
        path.moveTo(pointFB.x, pointFB.y);
        a.set(pointFB.x, pointFB.y);
        for (int i = 0; i < eygVar.a().size(); i++) {
            we4 we4Var = eygVar.a().get(i);
            PointF pointFA = we4Var.a();
            PointF pointFB2 = we4Var.b();
            PointF pointFC = we4Var.c();
            PointF pointF = a;
            if (pointFA.equals(pointF) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
            } else {
                path.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
        }
        if (eygVar.d()) {
            path.close();
        }
    }

    public static float i(float f, float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int j(int i, int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static void k(goa goaVar, int i, List<goa> list, goa goaVar2, koa koaVar) {
        if (goaVar.c(koaVar.getName(), i)) {
            list.add(goaVar2.a(koaVar.getName()).i(koaVar));
        }
    }
}
