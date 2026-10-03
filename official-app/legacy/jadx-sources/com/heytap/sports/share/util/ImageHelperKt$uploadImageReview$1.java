package com.heytap.sports.share.util;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Result;", "", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.sports.share.util.ImageHelperKt$uploadImageReview$1", f = "ImageHelper.kt", i = {}, l = {7}, m = "invokeSuspend", n = {}, s = {})
public final class ImageHelperKt$uploadImageReview$1 extends SuspendLambda implements Function2<Function1<? super Result<? extends Boolean>, ? extends Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $filer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageHelperKt$uploadImageReview$1(File file, Continuation<? super ImageHelperKt$uploadImageReview$1> continuation) {
        super(2, continuation);
        this.$filer = file;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ImageHelperKt$uploadImageReview$1 imageHelperKt$uploadImageReview$1 = new ImageHelperKt$uploadImageReview$1(this.$filer, continuation);
        imageHelperKt$uploadImageReview$1.L$0 = obj;
        return imageHelperKt$uploadImageReview$1;
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Function1<? super Result<? extends Boolean>, ? extends Unit> function1, Continuation<? super Unit> continuation) {
        return invoke2((Function1<? super Result<Boolean>, Unit>) function1, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Function1 function1;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1 function2 = (Function1) this.L$0;
            Result.Companion companion = Result.INSTANCE;
            ImageUtil imageUtil = ImageUtil.INSTANCE;
            File file = this.$filer;
            this.L$0 = function2;
            this.label = 1;
            Object objG = imageUtil.g(file, this);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objG;
            function1 = function2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        function1.invoke(Result.m5286boximpl(Result.m5287constructorimpl(obj)));
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull Function1<? super Result<Boolean>, Unit> function1, @Nullable Continuation<? super Unit> continuation) {
        return ((ImageHelperKt$uploadImageReview$1) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
