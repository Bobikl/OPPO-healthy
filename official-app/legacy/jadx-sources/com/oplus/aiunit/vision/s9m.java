package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.t9m;
import com.oplus.cardwidget.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0006*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/s9m;", "Lcom/oplus/aiunit/vision/t9m;", ExifInterface.GPS_DIRECTION_TRUE, "", "event", "", "a", "(Lcom/oplus/aiunit/vision/t9m;)V", "Lcom/oplus/aiunit/vision/djm;", "subscriber", "b", "<init>", "()V", "c", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEventPublisher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventPublisher.kt\ncom/oplus/cardwidget/domain/event/EventPublisher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1849#2,2:57\n*S KotlinDebug\n*F\n+ 1 EventPublisher.kt\ncom/oplus/cardwidget/domain/event/EventPublisher\n*L\n40#1:57,2\n*E\n"})
public final class s9m<T extends t9m> {

    @NotNull
    public static final ThreadLocal<List<djm<t9m>>> b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<Boolean> f16517c = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/oplus/aiunit/vision/s9m$a", "Ljava/lang/ThreadLocal;", "", "a", "()Ljava/lang/Boolean;", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ThreadLocal<Boolean> {
        @Override // java.lang.ThreadLocal
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/s9m$b", "Ljava/lang/ThreadLocal;", "", "Lcom/oplus/aiunit/vision/djm;", "Lcom/oplus/aiunit/vision/t9m;", "a", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ThreadLocal<List<djm<t9m>>> {
        @Override // java.lang.ThreadLocal
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<djm<t9m>> initialValue() {
            return new ArrayList();
        }
    }

    public final void a(@NotNull T event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ThreadLocal<Boolean> threadLocal = f16517c;
        Boolean bool = threadLocal.get();
        Intrinsics.checkNotNullExpressionValue(bool, "isPublishing.get()");
        if (bool.booleanValue()) {
            Logger.INSTANCE.d("EventPublisher", "is publishing, not publish again");
            return;
        }
        try {
            threadLocal.set(Boolean.TRUE);
            List<djm<t9m>> list = b.get();
            Logger.INSTANCE.d("EventPublisher", "event is publishing..." + list);
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((djm) it.next()).a(event);
                }
            }
        } finally {
            f16517c.set(Boolean.FALSE);
        }
    }

    public final void b(@NotNull djm<T> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (f16517c.get().booleanValue()) {
            Logger.INSTANCE.d("EventPublisher", "is publishing, not allow subscribe");
        } else {
            Logger.INSTANCE.d("EventPublisher", "subscribe...");
            b.get().add(subscriber);
        }
    }
}
