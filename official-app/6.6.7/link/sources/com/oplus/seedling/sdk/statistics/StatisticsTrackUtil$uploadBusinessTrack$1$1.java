package com.oplus.seedling.sdk.statistics;

import android.content.Context;
import com.oplus.aiunit.vision.hck;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.oplus.seedling.sdk.statistics.StatisticsTrackUtil$uploadBusinessTrack$1$1", f = "StatisticsTrackUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatisticsTrackUtil$uploadBusinessTrack$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Map<String, String> $data;
    final /* synthetic */ String $eventId;
    final /* synthetic */ String $logTag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatisticsTrackUtil$uploadBusinessTrack$1$1(Map<String, String> map, Context context, String str, String str2, Continuation<? super StatisticsTrackUtil$uploadBusinessTrack$1$1> continuation) {
        super(2, continuation);
        this.$data = map;
        this.$context = context;
        this.$logTag = str;
        this.$eventId = str2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new StatisticsTrackUtil$uploadBusinessTrack$1$1(this.$data, this.$context, this.$logTag, this.$eventId, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Map<String, String> map = this.$data;
        Context context = this.$context;
        String str = this.$logTag;
        String str2 = this.$eventId;
        try {
            Result.Companion companion = Result.Companion;
            Map mutableMap = map != null ? MapsKt.toMutableMap(map) : null;
            if (mutableMap != null) {
            }
            hck.d(context, str, str2, mutableMap != null ? MapsKt.toMap(mutableMap) : null);
            ht9.a.a(s8e.INSTANCE, "StatisticsTrackUtil", "uploadBusinessTrack success, eventId: " + str2 + ", mutableMap: " + mutableMap, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj2);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, "StatisticsTrackUtil", "uploadBusinessTrack error, msg: " + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
