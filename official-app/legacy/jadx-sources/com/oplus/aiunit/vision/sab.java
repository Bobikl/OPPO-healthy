package com.oplus.aiunit.vision;

import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0006\u001a@\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lcom/oplus/aiunit/vision/wab;", "Lkotlin/ParameterName;", "name", "frameInfo", "com/oplus/aiunit/vision/sab$a", "d", "(Lkotlin/jvm/functions/Function1;)Lcom/oplus/aiunit/vision/sab$a;", "lottie-compose_release"}, k = 2, mv = {1, 6, 0})
public final class sab {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0004\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/sab$a", "Lcom/oplus/aiunit/vision/mbb;", "Lcom/oplus/aiunit/vision/wab;", "frameInfo", "a", "(Lcom/oplus/aiunit/vision/wab;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> extends mbb<T> {
        public final /* synthetic */ Function1<wab<T>, T> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super wab<T>, ? extends T> function1) {
            this.d = function1;
        }

        @Override // com.oplus.aiunit.vision.mbb
        public T a(@NotNull wab<T> frameInfo) {
            Intrinsics.checkNotNullParameter(frameInfo, "frameInfo");
            return this.d.invoke(frameInfo);
        }
    }

    public static final <T> Function1<wab<T>, T> c(State<? extends Function1<? super wab<T>, ? extends T>> state) {
        return state.getValue();
    }

    public static final <T> a d(Function1<? super wab<T>, ? extends T> function1) {
        return new a(function1);
    }
}
