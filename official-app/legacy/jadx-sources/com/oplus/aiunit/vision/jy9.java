package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.OneTimeSport;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/jy9;", "", "Ljava/io/InputStream;", "inputStream", "Lcom/heytap/databaseengine/model/OneTimeSport;", "b", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "Ljava/io/OutputStream;", "outputStream", "", "a", "(Lcom/heytap/databaseengine/model/OneTimeSport;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public interface jy9 {
    @Nullable
    Object a(@NotNull OneTimeSport oneTimeSport, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object b(@NotNull InputStream inputStream, @NotNull Continuation<? super OneTimeSport> continuation);
}
