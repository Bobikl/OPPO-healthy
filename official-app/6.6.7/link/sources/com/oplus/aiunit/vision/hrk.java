package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0019JQ\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0007\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJY\u0010\r\u001a(\u0012\u0004\u0012\u00020\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0007\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJQ\u0010\u000f\u001a(\u0012\u0004\u0012\u00020\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0007\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJn\u0010\u0014\u001a&\u0012\u0004\u0012\u00020\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00070\u00070\u0007\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112.\u0010\u0013\u001a*\u0012\u0004\u0012\u00020\b\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0018\u00010\u00070\u0007J?\u0010\u0016\u001a&\u0012\u0004\u0012\u00020\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00070\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/hrk;", "", "", "beginTime", "endTime", "", "mode", "", "", "Lcom/oplus/aiunit/vision/e15;", "g", "(JJZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFromDateBegin", "f", "(JJZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "T", "", "launcherPkgs", "map", "h", "timeNow", "e", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "applicationContext", "Companion", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final class hrk {
    public Context a;

    @Nullable
    public final Object d(long j, long j2, boolean z, @NotNull Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, e15>>>> continuation) {
        throw null;
    }

    @Nullable
    public final Object e(long j, @NotNull Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, e15>>>> continuation) {
        throw null;
    }

    public final Object f(long j, long j2, boolean z, boolean z2, Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, e15>>>> continuation) {
        throw null;
    }

    public final Object g(long j, long j2, boolean z, Continuation<? super Map<String, ? extends Map<String, ? extends Map<String, e15>>>> continuation) {
        throw null;
    }

    @NotNull
    public final <T> Map<String, Map<String, Map<String, T>>> h(@NotNull List<String> launcherPkgs, @NotNull Map<String, ? extends Map<String, ? extends Map<String, ? extends T>>> map) {
        throw null;
    }
}
