package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.cqf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0003:\u0001\u0007J'\u0010\u0007\u001a\u00028\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/cqf;", "Req", "", "Rsp", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public interface gea<Req extends cqf, Rsp> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0004*\u00020\u00032\u00020\u0003J\u000f\u0010\u0005\u001a\u00028\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00028\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/cqf;", "Req", "", "Rsp", "request", "()Lcom/oplus/aiunit/vision/cqf;", "a", "(Lcom/oplus/aiunit/vision/cqf;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public interface a<Req extends cqf, Rsp> {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.gea$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C0878a {
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Object a(a aVar, cqf cqfVar, Continuation continuation, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: proceed");
                }
                if ((i & 1) != 0) {
                    cqfVar = aVar.request();
                }
                return aVar.a(cqfVar, continuation);
            }
        }

        @Nullable
        Object a(@NotNull Req req, @NotNull Continuation<? super Rsp> continuation);

        @NotNull
        Req request();
    }

    @Nullable
    Object a(@NotNull a<Req, Rsp> aVar, @NotNull Continuation<? super Rsp> continuation);
}
