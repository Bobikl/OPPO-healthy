package com.oplus.aiunit.vision;

import com.github.mikephil.charting.jobs.AnimatedMoveViewJob;
import com.github.mikephil.charting.jobs.AnimatedZoomJob;
import com.github.mikephil.charting.jobs.MoveViewJob;
import com.github.mikephil.charting.jobs.ZoomJob;
import com.github.mikephil.charting.utils.ObjectPool;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes16.dex */
public class i83 {
    public static void a() throws Exception {
        Field declaredField = AnimatedMoveViewJob.class.getDeclaredField("pool");
        declaredField.setAccessible(true);
        ObjectPool objectPoolCreate = ObjectPool.create(2, new AnimatedMoveViewJob(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        objectPoolCreate.setReplenishPercentage(0.5f);
        declaredField.set(null, objectPoolCreate);
    }

    public static void b() throws Exception {
        Field declaredField = AnimatedZoomJob.class.getDeclaredField("pool");
        declaredField.setAccessible(true);
        ObjectPool objectPoolCreate = ObjectPool.create(2, new AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L));
        objectPoolCreate.setReplenishPercentage(0.5f);
        declaredField.set(null, objectPoolCreate);
    }

    public static void c() throws Exception {
        Field declaredField = MoveViewJob.class.getDeclaredField("pool");
        declaredField.setAccessible(true);
        ObjectPool objectPoolCreate = ObjectPool.create(2, new MoveViewJob(null, 0.0f, 0.0f, null, null));
        objectPoolCreate.setReplenishPercentage(0.5f);
        declaredField.set(null, objectPoolCreate);
    }

    public static void d() throws Exception {
        Field declaredField = ZoomJob.class.getDeclaredField("pool");
        declaredField.setAccessible(true);
        ObjectPool objectPoolCreate = ObjectPool.create(2, new ZoomJob(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        objectPoolCreate.setReplenishPercentage(0.5f);
        declaredField.set(null, objectPoolCreate);
    }

    public static void e() {
        try {
            c();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("fixMoveViewJobLeak: ");
            sb.append(e2.toString());
        }
        try {
            d();
        } catch (Exception e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fixZoomJobLeak: ");
            sb2.append(e3.toString());
        }
        try {
            a();
        } catch (Exception e4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("fixAnimatedMoveViewJobLeak: ");
            sb3.append(e4.toString());
        }
        try {
            b();
        } catch (Exception e5) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("fixAnimatedZoomJobLeak: ");
            sb4.append(e5.toString());
        }
    }
}
