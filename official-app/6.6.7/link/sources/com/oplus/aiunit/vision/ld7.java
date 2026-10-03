package com.oplus.aiunit.vision;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0003\u0010\u0007R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\n\u0010\u000eR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0010\u0010\u000eR2\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/ld7;", "", "", "a", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "fileName", "", "b", "I", "getFileSize", "()I", "(I)V", "fileSize", "c", "getLoadProtocolTime", "loadProtocolTime", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getLoadImgTime", "()Ljava/util/ArrayList;", "setLoadImgTime", "(Ljava/util/ArrayList;)V", "loadImgTime", "e", "getPlayAnim", "playAnim", "<init>", "()V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stat.kt\ncom/oplus/vfxsdk/common/perf/FileStat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1549#2:179\n1620#2,3:180\n1549#2:183\n1620#2,3:184\n*S KotlinDebug\n*F\n+ 1 Stat.kt\ncom/oplus/vfxsdk/common/perf/FileStat\n*L\n77#1:179\n77#1:180,3\n79#1:183\n79#1:184,3\n*E\n"})
public final class ld7 {
    public int b;
    public int c;

    @NotNull
    public String a = "";

    @NotNull
    public ArrayList<Object> d = new ArrayList<>();

    @NotNull
    public final ArrayList<Object> e = new ArrayList<>();

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a = str;
    }

    public final void b(int i) {
        this.b = i;
    }

    public final void c(int i) {
        this.c = i;
    }
}
