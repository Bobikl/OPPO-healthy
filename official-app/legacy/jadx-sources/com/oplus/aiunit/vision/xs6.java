package com.oplus.aiunit.vision;

import android.os.Process;
import com.heytap.health.oaf.OafHost;
import com.heytap.health.owconnect.OWConnectRecord;
import com.heytap.health.owconnect.diagnosis.Events$OWConnection;
import com.heytap.health.owconnect.diagnosis.Events$OWStep;
import com.heytap.health.owconnect.diagnosis.Events$WConnectEvent;
import com.heytap.store.base.core.util.KeyMaps;
import com.oplus.weatherservicesdk.data.Weather;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0006J'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/xs6;", "", "", "crashTime", "", "crashMsg", "", b2n.f, "Lcom/heytap/health/owconnect/diagnosis/Events$OWConnection;", "owConnection", b2n.g, MapSchema.FIELD_NAME_ENTRY, "Ljava/io/PrintWriter;", "writer", "", "args", "c", "(Ljava/io/PrintWriter;[Ljava/lang/String;)V", "", "a", "Ljava/util/List;", "recent10OWConnections", "Ljava/util/concurrent/ThreadPoolExecutor;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ThreadPoolExecutor;", "singleThread", "J", "d", "()J", "startTime", "transportCrashTime", "Ljava/lang/String;", "transportCrashMsg", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEventRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRepo.kt\ncom/heytap/health/owconnect/EventRepo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1864#2,2:109\n1855#2,2:111\n1866#2:113\n1855#2,2:114\n1864#2,2:116\n1855#2,2:118\n1866#2:120\n*S KotlinDebug\n*F\n+ 1 EventRepo.kt\ncom/heytap/health/owconnect/EventRepo\n*L\n98#1:109,2\n101#1:111,2\n98#1:113\n45#1:114,2\n82#1:116,2\n89#1:118,2\n82#1:120\n*E\n"})
public final class xs6 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static long transportCrashTime;

    @NotNull
    public static final xs6 INSTANCE = new xs6();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<Events$OWConnection> recent10OWConnections = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final ThreadPoolExecutor singleThread = yq8.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long startTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String transportCrashMsg = "";

    public static final void f() {
        int i = 0;
        for (Object obj : recent10OWConnections) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Events$OWConnection events$OWConnection = (Events$OWConnection) obj;
            if (transportCrashMsg.length() > 0) {
                xil.d(OWConnectRecord.DOC_TAG, "owev-> transportCrashTime -> " + x05.s(Long.valueOf(transportCrashTime)));
                xil.d(OWConnectRecord.DOC_TAG, "owev-> transportCrashMsg -> " + transportCrashMsg);
            }
            xil.d(OWConnectRecord.DOC_TAG, "owev-> oaf version " + OafHost.i().k() + " ");
            xil.d(OWConnectRecord.DOC_TAG, "owev-> ======= recent events " + i + "===================================================");
            List<Events$WConnectEvent> eventsList = events$OWConnection.getEventsList();
            Intrinsics.checkNotNullExpressionValue(eventsList, "owConnection.eventsList");
            for (Events$WConnectEvent it : eventsList) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                xil.d(OWConnectRecord.DOC_TAG, "owev-> " + c9d.k(it) + Weather.SEPARATOR);
            }
            i = i2;
        }
        xil.d(OWConnectRecord.DOC_TAG, "owev-> ======= recent events ===================================================");
    }

    public static final void i(Events$OWConnection owConnection) {
        Intrinsics.checkNotNullParameter(owConnection, "$owConnection");
        try {
            xil.d(OWConnectRecord.DOC_TAG, "owev-> ======================= oaf version " + OafHost.i().k() + " ================");
            List<Events$WConnectEvent> eventsList = owConnection.getEventsList();
            Intrinsics.checkNotNullExpressionValue(eventsList, "owConnection.eventsList");
            boolean z = false;
            for (Events$WConnectEvent it : eventsList) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                xil.d(OWConnectRecord.DOC_TAG, "owev-> " + c9d.k(it) + Weather.SEPARATOR);
                if (it.getStep() == Events$OWStep.HFP && it.getConnect()) {
                    z = true;
                }
            }
            List<Events$OWConnection> list = recent10OWConnections;
            if (list.size() > 9) {
                list.remove(0);
            }
            list.add(owConnection);
            xil.d(OWConnectRecord.DOC_TAG, "owev-> ========================================================== " + list.size());
            boolean zH = c9d.h(owConnection);
            String strJ = c9d.j(owConnection);
            if (!zH && ((Intrinsics.areEqual(strJ, com.heytap.health.oaf.event.a.AUTO_RETRY) || Intrinsics.areEqual(strJ, com.heytap.health.oaf.event.a.SCREEN_ON)) && !c9d.f(owConnection))) {
                xil.a("OWDoctor --> report ignore, " + c9d.c(owConnection));
                return;
            }
            com.heytap.health.base.track.a.b bVar = new com.heytap.health.base.track.a.b(4012);
            bVar.a("RESULT", Boolean.valueOf(zH));
            bVar.a("ACL", Boolean.valueOf(z));
            bVar.a("REQ", strJ);
            bVar.a("pageid", c9d.b(owConnection));
            bVar.a(KeyMaps.REFERER, c9d.a(owConnection));
            if (!zH) {
                bVar.a("REASON", c9d.c(owConnection));
            }
            bVar.b();
        } catch (Exception e2) {
            xil.d(OWConnectRecord.DOC_TAG, "saveEvent-> " + e2.getMessage());
        }
    }

    public final void c(@NotNull PrintWriter writer, @Nullable String[] args) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        int i = 0;
        for (Object obj : recent10OWConnections) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            writer.println("ow events -> ======= oaf version " + OafHost.i().k() + "======================");
            writer.println("ow events -> ======= recent events " + i + "===================================================");
            List<Events$WConnectEvent> eventsList = ((Events$OWConnection) obj).getEventsList();
            Intrinsics.checkNotNullExpressionValue(eventsList, "owConnection.eventsList");
            for (Events$WConnectEvent it : eventsList) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                writer.println("ow events-> " + c9d.k(it));
            }
            i = i2;
        }
        writer.println("ow events -> ======= recent events ===================================================");
    }

    public final long d() {
        return startTime;
    }

    public final void e() {
        singleThread.submit(new Runnable() { // from class: com.oplus.aiunit.vision.vs6
            @Override // java.lang.Runnable
            public final void run() {
                xs6.f();
            }
        });
    }

    public final void g(long crashTime, @NotNull String crashMsg) {
        Intrinsics.checkNotNullParameter(crashMsg, "crashMsg");
        transportCrashTime = crashTime;
        transportCrashMsg = crashMsg;
        com.heytap.health.base.track.a.b bVar = new com.heytap.health.base.track.a.b(4012);
        Boolean bool = Boolean.FALSE;
        bVar.a("RESULT", bool);
        bVar.a("ACL", bool);
        bVar.a(KeyMaps.REFERER, Integer.valueOf(Process.myPid()));
        bVar.a("REQ", "proc_start：" + x05.s(Long.valueOf(startTime)));
        if (transportCrashMsg.length() > 0) {
            bVar.a("REASON", "crash_msg: " + transportCrashMsg);
        }
        bVar.b();
    }

    public final void h(@NotNull final Events$OWConnection owConnection) {
        Intrinsics.checkNotNullParameter(owConnection, "owConnection");
        singleThread.submit(new Runnable() { // from class: com.oplus.aiunit.vision.ws6
            @Override // java.lang.Runnable
            public final void run() {
                xs6.i(owConnection);
            }
        });
    }
}
