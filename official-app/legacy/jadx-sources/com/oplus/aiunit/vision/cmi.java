package com.oplus.aiunit.vision;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R>\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR>\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0002j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/cmi;", "", "Ljava/util/HashMap;", "", "Lcom/oplus/aiunit/vision/jc7;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "setFileStats", "(Ljava/util/HashMap;)V", "FileStats", "", "b", "getEngineStats", "setEngineStats", "EngineStats", "<init>", "()V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stat.kt\ncom/oplus/vfxsdk/common/perf/Stat\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,178:1\n125#2:179\n152#2,3:180\n125#2:183\n152#2,3:184\n*S KotlinDebug\n*F\n+ 1 Stat.kt\ncom/oplus/vfxsdk/common/perf/Stat\n*L\n129#1:179\n129#1:180,3\n130#1:183\n130#1:184,3\n*E\n"})
public final class cmi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public HashMap<String, jc7> FileStats = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public HashMap<Long, Object> EngineStats = new HashMap<>();

    @NotNull
    public final HashMap<String, jc7> a() {
        return this.FileStats;
    }
}
