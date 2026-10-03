package com.heytap.sports.partner.model;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.heytap.sports.partner.bean.Highlights;
import com.heytap.sports.partner.bean.MessageSummary;
import com.heytap.sports.partner.bean.PartnerDetail;
import com.oplus.aiunit.vision.onc;
import com.oplus.aiunit.vision.rz4;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0004J\u0013\u0010\f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0004J\u0013\u0010\r\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/heytap/sports/partner/model/MainRepo;", "", "Lcom/heytap/sports/partner/bean/PartnerDetail;", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/sports/partner/bean/MessageSummary;", "f", "", "Lcom/heytap/sports/partner/bean/Highlights;", "d", "", "c", "a", "b", "Lcom/oplus/aiunit/vision/onc;", "kotlin.jvm.PlatformType", "Lcom/oplus/aiunit/vision/onc;", "mApiService", "<init>", "()V", "partner_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRepo.kt\ncom/heytap/sports/partner/model/MainRepo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class MainRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final onc mApiService = (onc) a.j(onc.class);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Continuation<? super Integer> continuation) {
        MainRepo$cancelLike$1 mainRepo$cancelLike$1;
        if (continuation instanceof MainRepo$cancelLike$1) {
            mainRepo$cancelLike$1 = (MainRepo$cancelLike$1) continuation;
            int i = mainRepo$cancelLike$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainRepo$cancelLike$1.label = i - Integer.MIN_VALUE;
            } else {
                mainRepo$cancelLike$1 = new MainRepo$cancelLike$1(this, continuation);
            }
        } else {
            mainRepo$cancelLike$1 = new MainRepo$cancelLike$1(this, continuation);
        }
        Object objC = mainRepo$cancelLike$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mainRepo$cancelLike$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objC);
                Result.Companion companion = Result.INSTANCE;
                Map<String, String> mapEmptyMap = MapsKt__MapsKt.emptyMap();
                onc oncVar = this.mApiService;
                mainRepo$cancelLike$1.label = 1;
                objC = oncVar.c(mapEmptyMap, mainRepo$cancelLike$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return Boxing.boxInt(((BaseResponse) objC).getErrorCode());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            return Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? objM5287constructorimpl : Boxing.boxInt(99999);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull Continuation<? super Integer> continuation) {
        MainRepo$commentAchievement$1 mainRepo$commentAchievement$1;
        if (continuation instanceof MainRepo$commentAchievement$1) {
            mainRepo$commentAchievement$1 = (MainRepo$commentAchievement$1) continuation;
            int i = mainRepo$commentAchievement$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainRepo$commentAchievement$1.label = i - Integer.MIN_VALUE;
            } else {
                mainRepo$commentAchievement$1 = new MainRepo$commentAchievement$1(this, continuation);
            }
        } else {
            mainRepo$commentAchievement$1 = new MainRepo$commentAchievement$1(this, continuation);
        }
        Object objE = mainRepo$commentAchievement$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mainRepo$commentAchievement$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objE);
                Result.Companion companion = Result.INSTANCE;
                Map<String, String> mapEmptyMap = MapsKt__MapsKt.emptyMap();
                onc oncVar = this.mApiService;
                mainRepo$commentAchievement$1.label = 1;
                objE = oncVar.e(mapEmptyMap, mainRepo$commentAchievement$1);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objE);
            }
            return Boxing.boxInt(((BaseResponse) objE).getErrorCode());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            return Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? objM5287constructorimpl : Boxing.boxInt(99999);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull Continuation<? super Integer> continuation) {
        MainRepo$like$1 mainRepo$like$1;
        if (continuation instanceof MainRepo$like$1) {
            mainRepo$like$1 = (MainRepo$like$1) continuation;
            int i = mainRepo$like$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainRepo$like$1.label = i - Integer.MIN_VALUE;
            } else {
                mainRepo$like$1 = new MainRepo$like$1(this, continuation);
            }
        } else {
            mainRepo$like$1 = new MainRepo$like$1(this, continuation);
        }
        Object objF = mainRepo$like$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mainRepo$like$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objF);
                Result.Companion companion = Result.INSTANCE;
                Map<String, String> mapEmptyMap = MapsKt__MapsKt.emptyMap();
                onc oncVar = this.mApiService;
                mainRepo$like$1.label = 1;
                objF = oncVar.f(mapEmptyMap, mainRepo$like$1);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objF);
            }
            return Boxing.boxInt(((BaseResponse) objF).getErrorCode());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            return Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? objM5287constructorimpl : Boxing.boxInt(99999);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull Continuation<? super List<Highlights>> continuation) {
        MainRepo$queryHighLights$1 mainRepo$queryHighLights$1;
        if (continuation instanceof MainRepo$queryHighLights$1) {
            mainRepo$queryHighLights$1 = (MainRepo$queryHighLights$1) continuation;
            int i = mainRepo$queryHighLights$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainRepo$queryHighLights$1.label = i - Integer.MIN_VALUE;
            } else {
                mainRepo$queryHighLights$1 = new MainRepo$queryHighLights$1(this, continuation);
            }
        } else {
            mainRepo$queryHighLights$1 = new MainRepo$queryHighLights$1(this, continuation);
        }
        Object objD = mainRepo$queryHighLights$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mainRepo$queryHighLights$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objD);
                Result.Companion companion = Result.INSTANCE;
                onc oncVar = this.mApiService;
                mainRepo$queryHighLights$1.label = 1;
                objD = oncVar.d(mainRepo$queryHighLights$1);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objD);
            }
            Object body = ((BaseResponse) objD).getBody();
            Intrinsics.checkNotNullExpressionValue(body, "response.body");
            return body;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            return Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? objM5287constructorimpl : CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull Continuation<? super PartnerDetail> continuation) {
        MainRepo$queryMainData$1 mainRepo$queryMainData$1;
        if (continuation instanceof MainRepo$queryMainData$1) {
            mainRepo$queryMainData$1 = (MainRepo$queryMainData$1) continuation;
            int i = mainRepo$queryMainData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainRepo$queryMainData$1.label = i - Integer.MIN_VALUE;
            } else {
                mainRepo$queryMainData$1 = new MainRepo$queryMainData$1(this, continuation);
            }
        } else {
            mainRepo$queryMainData$1 = new MainRepo$queryMainData$1(this, continuation);
        }
        Object objB = mainRepo$queryMainData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mainRepo$queryMainData$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objB);
                Result.Companion companion = Result.INSTANCE;
                Map<String, String> mapEmptyMap = MapsKt__MapsKt.emptyMap();
                onc oncVar = this.mApiService;
                mainRepo$queryMainData$1.label = 1;
                objB = oncVar.b(mapEmptyMap, mainRepo$queryMainData$1);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objB);
            }
            return ((BaseResponse) objB).getBody();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            return Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? objM5287constructorimpl : rz4.INSTANCE.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(@NotNull Continuation<? super MessageSummary> continuation) {
        MainRepo$queryMessageSummary$1 mainRepo$queryMessageSummary$1;
        if (continuation instanceof MainRepo$queryMessageSummary$1) {
            mainRepo$queryMessageSummary$1 = (MainRepo$queryMessageSummary$1) continuation;
            int i = mainRepo$queryMessageSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainRepo$queryMessageSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                mainRepo$queryMessageSummary$1 = new MainRepo$queryMessageSummary$1(this, continuation);
            }
        } else {
            mainRepo$queryMessageSummary$1 = new MainRepo$queryMessageSummary$1(this, continuation);
        }
        Object objA = mainRepo$queryMessageSummary$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mainRepo$queryMessageSummary$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objA);
                Result.Companion companion = Result.INSTANCE;
                onc oncVar = this.mApiService;
                mainRepo$queryMessageSummary$1.label = 1;
                objA = oncVar.a(mainRepo$queryMessageSummary$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            Object body = ((BaseResponse) objA).getBody();
            Intrinsics.checkNotNullExpressionValue(body, "response.body");
            return body;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            return Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? objM5287constructorimpl : new MessageSummary(0, null, 3, null);
        }
    }
}
