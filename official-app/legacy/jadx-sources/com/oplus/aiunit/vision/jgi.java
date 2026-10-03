package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.OneTimeSport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/jgi;", "", "Lcom/heytap/databaseengine/model/OneTimeSport;", "record", "b", "(Lcom/heytap/databaseengine/model/OneTimeSport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public interface jgi {
    @Nullable
    Object a(@NotNull Continuation<? super OneTimeSport> continuation);

    @Nullable
    Object b(@NotNull OneTimeSport oneTimeSport, @NotNull Continuation<? super OneTimeSport> continuation);

    @Nullable
    Object c(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object d(@NotNull OneTimeSport oneTimeSport, @NotNull Continuation<? super Unit> continuation);
}
