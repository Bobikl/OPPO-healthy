package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004J\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/gbd;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "a", "()V", "result", "", "b", "(Ljava/lang/Object;)Z", "", "Lcom/oplus/aiunit/vision/w2j;", "Ljava/util/List;", "innerSubscribers", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onDispose", "Companion", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class gbd<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List<w2j<T>> innerSubscribers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Function0<Unit> onDispose;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.gbd$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0001\u0010\u0002*\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/gbd$a;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "", "result", "b", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "<init>", "()V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> void b(@Nullable Function1<? super T, Unit> function1, T t) {
            if (t == 0 || function1 == null) {
                return;
            }
            function1.invoke(t);
        }
    }

    public final void a() {
        this.innerSubscribers.clear();
        Function0<Unit> function0 = this.onDispose;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean b(@NotNull Object result) {
        Intrinsics.checkParameterIsNotNull(result, "result");
        List<w2j<T>> list = this.innerSubscribers;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            INSTANCE.b((w2j) it.next(), result);
        }
        return !list.isEmpty();
    }
}
