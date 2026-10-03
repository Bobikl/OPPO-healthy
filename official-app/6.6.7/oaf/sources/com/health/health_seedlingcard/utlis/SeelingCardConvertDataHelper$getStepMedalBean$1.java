package com.health.health_seedlingcard.utlis;

import android.net.Uri;
import androidx.core.content.FileProvider;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.m8b;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Result;", "", "", "block", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.health_seedlingcard.utlis.SeelingCardConvertDataHelper$getStepMedalBean$1", f = "SeelingCardConvertDataHelper.kt", i = {0}, l = {1146}, m = "invokeSuspend", n = {"block"}, s = {"L$0"})
public final class SeelingCardConvertDataHelper$getStepMedalBean$1 extends SuspendLambda implements Function2<Function1<? super Result<? extends String>, ? extends Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $filePath;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ Ref.ObjectRef<File> $stepMedalPic;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeelingCardConvertDataHelper$getStepMedalBean$1(Ref.ObjectRef<File> objectRef, String str, String str2, String str3, Continuation<? super SeelingCardConvertDataHelper$getStepMedalBean$1> continuation) {
        super(2, continuation);
        this.$stepMedalPic = objectRef;
        this.$filePath = str;
        this.$imageUrl = str2;
        this.$fileName = str3;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SeelingCardConvertDataHelper$getStepMedalBean$1 seelingCardConvertDataHelper$getStepMedalBean$1 = new SeelingCardConvertDataHelper$getStepMedalBean$1(this.$stepMedalPic, this.$filePath, this.$imageUrl, this.$fileName, continuation);
        seelingCardConvertDataHelper$getStepMedalBean$1.L$0 = obj;
        return seelingCardConvertDataHelper$getStepMedalBean$1;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable th;
        Function1 function1;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1 function2 = (Function1) this.L$0;
            this.$stepMedalPic.element = new File(this.$filePath);
            if (((File) this.$stepMedalPic.element).exists()) {
                m8b.f(SeelingCardConvertDataHelper.a, "seed card image exists");
                Uri uriForFile = FileProvider.getUriForFile(e88.a(), jug.SEEDLING_CARD_PROVIDER, (File) this.$stepMedalPic.element);
                SeelingCardConvertDataHelper seelingCardConvertDataHelper = SeelingCardConvertDataHelper.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(uriForFile, "uri");
                seelingCardConvertDataHelper.r(uriForFile);
                m8b.f(SeelingCardConvertDataHelper.a, "medal pic uri = " + uriForFile + " ");
                m8b.f(SeelingCardConvertDataHelper.a, "medal pic uri = " + this.$filePath + " ");
                Result.Companion companion = Result.Companion;
                function2.invoke(Result.box-impl(Result.constructor-impl(uriForFile.toString())));
            } else {
                m8b.f(SeelingCardConvertDataHelper.a, "seed card image not exists");
                String str = this.$imageUrl;
                String str2 = this.$filePath;
                String str3 = this.$fileName;
                try {
                    Result.Companion companion2 = Result.Companion;
                    SeelingCardConvertDataHelper seelingCardConvertDataHelper2 = SeelingCardConvertDataHelper.INSTANCE;
                    this.L$0 = function2;
                    this.label = 1;
                    Object objM = seelingCardConvertDataHelper2.m(str, str2, str3, this);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objM;
                    function1 = function2;
                } catch (Throwable th2) {
                    th = th2;
                    function1 = function2;
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1 = (Function1) this.L$0;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        obj2 = Result.constructor-impl((String) obj);
        if (Result.isSuccess-impl(obj2)) {
            function1.invoke(Result.box-impl(Result.constructor-impl((String) obj2)));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj2);
        if (th4 != null) {
            function1.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th4))));
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull Function1<? super Result<String>, Unit> function1, @Nullable Continuation<? super Unit> continuation) {
        return create(function1, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
