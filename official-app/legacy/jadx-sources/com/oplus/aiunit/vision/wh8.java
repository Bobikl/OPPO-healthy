package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.monitor.MemInfo;
import com.heytap.health.monitor.storage.HeadSizeDataStore;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class wh8 {
    public final Context a;
    public final HeadSizeDataStore b;

    public wh8(Context context) {
        this.a = context;
        this.b = new HeadSizeDataStore(context);
    }

    public void a() {
        List<MemInfo> listE = this.b.e();
        List<MemInfo> listA = this.b.a();
        List<MemInfo> listF = this.b.f();
        List<MemInfo> listB = this.b.b();
        List<MemInfo> listG = this.b.g();
        List<MemInfo> listC = this.b.c();
        Iterator<MemInfo> it = listE.iterator();
        while (it.hasNext()) {
            c(it.next(), 0);
        }
        Iterator<MemInfo> it2 = listA.iterator();
        while (it2.hasNext()) {
            c(it2.next(), 1);
        }
        Iterator<MemInfo> it3 = listF.iterator();
        while (it3.hasNext()) {
            c(it3.next(), 2);
        }
        Iterator<MemInfo> it4 = listB.iterator();
        while (it4.hasNext()) {
            c(it4.next(), 3);
        }
        Iterator<MemInfo> it5 = listG.iterator();
        while (it5.hasNext()) {
            c(it5.next(), 4);
        }
        Iterator<MemInfo> it6 = listC.iterator();
        while (it6.hasNext()) {
            c(it6.next(), 5);
        }
    }

    public final String b(int i) {
        if (i == 0) {
            return "MEMORY_MAX_PSS_ALL";
        }
        if (i == 1) {
            return "MEMORY_AVERAGE_PSS_ALL";
        }
        if (i == 2) {
            return "MEMORY_MAX_PSS_BG";
        }
        if (i == 3) {
            return "MEMORY_AVERAGE_PSS_BG";
        }
        if (i != 4) {
            return i != 5 ? "" : "MEMORY_AVERAGE_PSS_FG";
        }
        return "MEMORY_MAX_PSS_FG";
    }

    public final void c(MemInfo memInfo, int i) {
        com.heytap.health.base.track.a.j().a("type", Integer.valueOf(i)).a("totalPss", Integer.valueOf(memInfo.totalPss)).a("nativePss", Integer.valueOf(memInfo.nativePss)).a("dalvikPss", Integer.valueOf(memInfo.dalvikPss)).a("otherPss", Integer.valueOf(memInfo.otherPss)).a("day", memInfo.day).a("progress", gxe.c()).a("fg", Boolean.valueOf(memInfo.foreground)).a(ClickApiEntity.TIME, Long.valueOf(memInfo.time)).a("cpuAbi", j1i.a() ? "64" : "32").b();
        a7b.f("HeadSizeUploader", "reportAndRemove() called with: memInfo = [" + memInfo + "], type = [" + b(i) + "], process is " + gxe.c() + "");
        this.b.h(memInfo.day);
    }
}
