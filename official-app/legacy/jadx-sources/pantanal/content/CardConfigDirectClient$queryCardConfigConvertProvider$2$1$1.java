package pantanal.content;

import android.content.ContentProviderClient;
import android.os.Bundle;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/os/Bundle;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "pantanal.content.CardConfigDirectClient$queryCardConfigConvertProvider$2$1$1", f = "CardConfigDirectClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CardConfigDirectClient$queryCardConfigConvertProvider$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bundle>, Object> {
    final /* synthetic */ ContentProviderClient $it;
    final /* synthetic */ String $method;
    final /* synthetic */ Bundle $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardConfigDirectClient$queryCardConfigConvertProvider$2$1$1(ContentProviderClient contentProviderClient, String str, Bundle bundle, Continuation<? super CardConfigDirectClient$queryCardConfigConvertProvider$2$1$1> continuation) {
        super(2, continuation);
        this.$it = contentProviderClient;
        this.$method = str;
        this.$params = bundle;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CardConfigDirectClient$queryCardConfigConvertProvider$2$1$1(this.$it, this.$method, this.$params, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.$it.call(this.$method, null, this.$params);
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Bundle> continuation) {
        return ((CardConfigDirectClient$queryCardConfigConvertProvider$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
