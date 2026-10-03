package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/suf;", "", "", "Lcom/oplus/aiunit/vision/iqc;", "list", "", "c", "rest", "", "d", "one", "other", "", "a", "b", "Ljava/util/List;", "resultList", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepRestRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRestRepository.kt\ncom/heytap/device/sleep/RestMerger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n1855#2,2:412\n*S KotlinDebug\n*F\n+ 1 SleepRestRepository.kt\ncom/heytap/device/sleep/RestMerger\n*L\n351#1:412,2\n*E\n"})
public final class suf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<NewSleepRest> resultList = new ArrayList();

    public final boolean a(NewSleepRest one, NewSleepRest other) {
        return one.m() >= other.o() && other.m() >= one.o();
    }

    public final NewSleepRest b(NewSleepRest one, NewSleepRest other) {
        int bedTime;
        int bedTimeDayOfWeek;
        int wakeUpTime;
        int wakeUpTimeDayOfWeek;
        if (one.o() < other.o()) {
            bedTime = one.getBedTime();
            bedTimeDayOfWeek = one.getBedTimeDayOfWeek();
        } else {
            bedTime = other.getBedTime();
            bedTimeDayOfWeek = other.getBedTimeDayOfWeek();
        }
        int i = bedTime;
        int i2 = bedTimeDayOfWeek;
        if (one.m() > other.m()) {
            wakeUpTime = one.getWakeUpTime();
            wakeUpTimeDayOfWeek = one.getWakeUpTimeDayOfWeek();
        } else {
            wakeUpTime = other.getWakeUpTime();
            wakeUpTimeDayOfWeek = other.getWakeUpTimeDayOfWeek();
        }
        return new NewSleepRest(i, wakeUpTime, i2, wakeUpTimeDayOfWeek, 0L, (one.s() || other.s()) ? 1 : 0, 16, null);
    }

    @NotNull
    public final List<NewSleepRest> c(@NotNull List<NewSleepRest> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d((NewSleepRest) it.next());
        }
        return this.resultList;
    }

    public final void d(NewSleepRest rest) {
        boolean z;
        Iterator<NewSleepRest> it = this.resultList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            NewSleepRest next = it.next();
            if (a(next, rest)) {
                rest = b(rest, next);
                it.remove();
                z = true;
                break;
            }
        }
        if (z) {
            d(rest);
        } else {
            this.resultList.add(rest);
        }
    }
}
