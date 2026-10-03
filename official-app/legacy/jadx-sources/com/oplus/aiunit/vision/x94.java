package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.AnyThread;
import com.heytap.health.base.app.component.DeviceIdleDisableWork;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes15.dex */
public class x94 {
    public static final String DELAY_KEY_HEALTH_SLEEP_AUDIO = "health_sleep_audio";
    public static final String DELAY_KEY_SLEEP_PHONE_SLEEP = "sleep_phone_sleep";
    public static final Set<String> a;
    public static final Set<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f18539c;

    public static final class a {
        public static void a(Context context, boolean z, Runnable runnable) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new us3.a("com.heytap.health.linkage.watch.WatchProvider", z).b(runnable).a());
            x94.d(context, arrayList);
        }

        public static void b(Context context, boolean z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new us3.a("com.heytap.wearable.watch.game.DeviceSdkService", z).a());
            x94.d(context, arrayList);
        }
    }

    public static final class b {
        public static boolean a(Context context) {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, "com.heytap.health.linkage.watch.WatchProvider"));
            a7b.f("CTCUtils", "checkDeviceCenterIsEnable currState:" + componentEnabledSetting);
            return componentEnabledSetting == 1;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        HashSet hashSet2 = new HashSet();
        b = hashSet2;
        HashSet hashSet3 = new HashSet();
        f18539c = hashSet3;
        hashSet3.add("com.heytap.health.watch.commonsync.receiver.TransportTimeChangedReceiver");
        hashSet3.add("com.heytap.health.watchface.provider.WatchFaceDeviceProvider");
        hashSet3.add("com.heytap.health.watch.notification.impl.breeno.manager.BreenoSceneReceiver");
        hashSet3.add("com.heytap.health.watch.notification.impl.flashback.FlashbackProvider");
        hashSet3.add("com.health.health_seedlingcard.receiver.SeedlingCardReceiver");
        hashSet3.add("com.heytap.health.watch.thirdparty.ThirdPartyService");
        hashSet3.add("com.heytap.health.watch.notification.impl.fluid.FluidSupportProvider");
        hashSet.add("com.heytap.wearable.watch.game.DeviceSdkService");
        hashSet.add("com.heytap.health.linkage.watch.WatchProvider");
        hashSet.add("com.heytap.health.watch.commonsync.receiver.TransportTimeChangedReceiver");
        hashSet.add("com.heytap.health.watchface.provider.WatchFaceDeviceProvider");
        hashSet.add("com.heytap.health.watch.notification.impl.breeno.manager.BreenoSceneReceiver");
        hashSet.add("com.heytap.health.watch.notification.impl.flashback.FlashbackProvider");
        hashSet.add("com.health.health_seedlingcard.receiver.SeedlingCardReceiver");
        hashSet2.add("com.health.health_seedlingcard.receiver.SeedlingCardReceiver");
    }

    public static void c() {
        a7b.f("CTCUtils", "clearDelayDeviceIdleWorkKeys() called before clean:" + f());
        g().a0("delay_idle_disable");
        a7b.f("CTCUtils", "clearDelayDeviceIdleWorkKeys() called after clean:" + f());
    }

    public static void d(final Context context, final ArrayList<us3> arrayList) {
        lbd.Z(new Callable() { // from class: com.oplus.aiunit.vision.w94
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x94.i(context, arrayList);
            }
        }).L0(su8.f()).c();
    }

    @AnyThread
    public static void e(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = f18539c.iterator();
        while (it.hasNext()) {
            arrayList.add(new us3.a(it.next(), z).a());
        }
        d(context, arrayList);
        if (z) {
            v94.INSTANCE.b(context, Boolean.TRUE, false);
        }
    }

    public static boolean f() {
        Set<String> setF = g().F("delay_idle_disable");
        boolean z = !setF.isEmpty();
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("delayDeviceIdle() called businessKeys = [");
            sb.append(setF);
            sb.append("]");
        }
        return z;
    }

    public static v9g g() {
        return v9g.x("heytap_health_device_component_control");
    }

    public static void h(Context context) {
        v9g v9gVarG = g();
        boolean zR = v9gVarG.r("device_service_init", false);
        boolean zR2 = v9gVarG.r("device_seedling_card_init", false);
        a7b.f("CTCUtils", "initComponent init:" + zR + " initSeedCard:" + zR2);
        if (!(zR && zR2) && qe0.u(context)) {
            v9gVarG.W("device_service_init", true);
            v9gVarG.W("device_seedling_card_init", true);
            a7b.f("CTCUtils", "initComponent isFirstInstall return !!");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!zR) {
            Iterator<String> it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(new us3.a(it.next(), false).a());
            }
            v9gVarG.W("device_service_init", true);
        }
        if (!zR2) {
            Iterator<String> it2 = b.iterator();
            while (it2.hasNext()) {
                arrayList.add(new us3.a(it2.next(), false).a());
            }
            v9gVarG.W("device_seedling_card_init", true);
        }
        d(context, arrayList);
    }

    public static /* synthetic */ Boolean i(Context context, ArrayList arrayList) throws Exception {
        Runnable runnable;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        v9g v9gVarG = g();
        for (int i = 0; i < arrayList.size(); i++) {
            us3 us3Var = (us3) arrayList.get(i);
            ComponentName componentName = new ComponentName(context, us3Var.a);
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            int i2 = us3Var.b ? 1 : 2;
            int iZ = v9gVarG.z(us3Var.a, -1);
            a7b.f("CTCUtils", "controlComponent: " + us3Var.d + " currState: " + componentEnabledSetting + " newState: " + i2 + " spState:" + iZ);
            if (componentEnabledSetting == i2 && (iZ == -1 || iZ == i2)) {
                a7b.f("CTCUtils", "controlComponent: " + us3Var.d + " nowState: " + packageManager.getComponentEnabledSetting(componentName));
                if (!us3Var.b) {
                }
            } else {
                v9gVarG.S(us3Var.a, i2);
                if (us3Var.f17586c && i2 == 2) {
                    a7b.f("CTCUtils", "controlComponent: " + us3Var.d + " isProvider set disableState via DeviceIdleDisableWork");
                    arrayList2.add(us3Var.a);
                } else {
                    a7b.f("CTCUtils", "controlComponent: " + us3Var.d + " set newState: " + i2);
                    packageManager.setComponentEnabledSetting(componentName, i2, 1);
                    a7b.f("CTCUtils", "controlComponent: " + us3Var.d + " nowState: " + packageManager.getComponentEnabledSetting(componentName));
                    if (!us3Var.b && (runnable = us3Var.f) != null) {
                        runnable.run();
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            a7b.f("CTCUtils", "controlComponent: set disableState via DeviceIdleDisableWork, count: " + arrayList2.size());
            DeviceIdleDisableWork.c((String[]) arrayList2.toArray(new String[0]));
        }
        return Boolean.TRUE;
    }

    public static void j(String str, boolean z) {
        a7b.f("CTCUtils", "setDelayDeviceIdleWork() called businessKey = [" + str + "], delay = [" + z + "]");
        v9g v9gVarG = g();
        Set<String> setF = v9gVarG.F("delay_idle_disable");
        if (setF.isEmpty()) {
            setF = new HashSet<>();
        }
        if (z) {
            setF.add(str);
        } else {
            setF.remove(str);
        }
        v9gVarG.V("delay_idle_disable", setF);
    }
}
