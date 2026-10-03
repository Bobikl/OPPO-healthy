package com.heytap.health.esim.nsc.manager;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.esim.R$string;
import com.heytap.health.esim.nsc.RealNameAuthWebActivity;
import com.heytap.health.esim.nsc.utils.NSCHelper;
import com.heytap.sporthealth.blib.helper.UISwitchKt;
import com.oplus.aiunit.vision.RealNameStatus;
import com.oplus.aiunit.vision.dkf;
import com.oplus.aiunit.vision.mtj;
import com.oplus.aiunit.vision.qtf;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/esim/nsc/manager/RealNameAuthManager;", "", "", "iccid", "", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/base/base/BaseActivity;", "context", "c", "(Lcom/heytap/health/base/base/BaseActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "url", "Lkotlin/Result;", "f", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RealNameAuthManager {
    public static final int $stable = 0;

    @NotNull
    public static final RealNameAuthManager INSTANCE = new RealNameAuthManager();

    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws Exception {
        RealNameAuthManager$auth$1 realNameAuthManager$auth$1;
        RealNameAuthManager realNameAuthManager;
        String str2;
        String str3;
        if (continuation instanceof RealNameAuthManager$auth$1) {
            realNameAuthManager$auth$1 = (RealNameAuthManager$auth$1) continuation;
            int i = realNameAuthManager$auth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realNameAuthManager$auth$1.label = i - Integer.MIN_VALUE;
            } else {
                realNameAuthManager$auth$1 = new RealNameAuthManager$auth$1(this, continuation);
            }
        } else {
            realNameAuthManager$auth$1 = new RealNameAuthManager$auth$1(this, continuation);
        }
        Object objE = realNameAuthManager$auth$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = realNameAuthManager$auth$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (String) realNameAuthManager$auth$1.L$2;
                baseActivity = (BaseActivity) realNameAuthManager$auth$1.L$1;
                this = (RealNameAuthManager) realNameAuthManager$auth$1.L$0;
                ResultKt.throwOnFailure(objE);
            } else if (i2 == 2) {
                str2 = (String) realNameAuthManager$auth$1.L$2;
                baseActivity = (BaseActivity) realNameAuthManager$auth$1.L$1;
                realNameAuthManager = (RealNameAuthManager) realNameAuthManager$auth$1.L$0;
                ResultKt.throwOnFailure(objE);
                str3 = (String) objE;
                if (!mtj.b(str3)) {
                    throw new RuntimeException("实名认证地址获取失败");
                }
                dkf.INSTANCE.a("RealNameManager realNameUrl obtain, then to web");
                realNameAuthManager$auth$1.L$0 = realNameAuthManager;
                realNameAuthManager$auth$1.L$1 = baseActivity;
                realNameAuthManager$auth$1.L$2 = str2;
                realNameAuthManager$auth$1.label = 3;
                if (realNameAuthManager.f(baseActivity, str3, realNameAuthManager$auth$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dkf.INSTANCE.a("RealNameManager return from web, then to confirmIsRealNameAuthed");
                baseActivity.j7(qtf.l(R$string.esim_redtea_loading_realname));
                realNameAuthManager$auth$1.L$0 = null;
                realNameAuthManager$auth$1.L$1 = null;
                realNameAuthManager$auth$1.L$2 = null;
                realNameAuthManager$auth$1.label = 4;
                objE = realNameAuthManager.e(str2, realNameAuthManager$auth$1);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 3) {
                str2 = (String) realNameAuthManager$auth$1.L$2;
                baseActivity = (BaseActivity) realNameAuthManager$auth$1.L$1;
                realNameAuthManager = (RealNameAuthManager) realNameAuthManager$auth$1.L$0;
                ResultKt.throwOnFailure(objE);
                ((Result) objE).getValue();
                dkf.INSTANCE.a("RealNameManager return from web, then to confirmIsRealNameAuthed");
                baseActivity.j7(qtf.l(R$string.esim_redtea_loading_realname));
                realNameAuthManager$auth$1.L$0 = null;
                realNameAuthManager$auth$1.L$1 = null;
                realNameAuthManager$auth$1.L$2 = null;
                realNameAuthManager$auth$1.label = 4;
                objE = realNameAuthManager.e(str2, realNameAuthManager$auth$1);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objE);
            }
            if (((Boolean) objE).booleanValue()) {
                dkf.INSTANCE.a("RealNameManager auth succeed after auth by webview");
                return Boxing.boxBoolean(true);
            }
            dkf.INSTANCE.a("RealNameManager auth fail after auth by webview");
            return Boxing.boxBoolean(false);
        }
        ResultKt.throwOnFailure(objE);
        NSCHelper nSCHelper = NSCHelper.INSTANCE;
        RealNameAuthManager$auth$2 realNameAuthManager$auth$2 = new RealNameAuthManager$auth$2(str, null);
        realNameAuthManager$auth$1.L$0 = this;
        realNameAuthManager$auth$1.L$1 = baseActivity;
        realNameAuthManager$auth$1.L$2 = str;
        realNameAuthManager$auth$1.label = 1;
        objE = nSCHelper.e(2, realNameAuthManager$auth$2, realNameAuthManager$auth$1);
        if (objE == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Boolean) objE).booleanValue()) {
            dkf.INSTANCE.a("RealNameManager auth succeed");
            return Boxing.boxBoolean(true);
        }
        NSCHelper nSCHelper2 = NSCHelper.INSTANCE;
        RealNameAuthManager$auth$realNameUrl$1 realNameAuthManager$auth$realNameUrl$1 = new RealNameAuthManager$auth$realNameUrl$1(str, null);
        realNameAuthManager$auth$1.L$0 = this;
        realNameAuthManager$auth$1.L$1 = baseActivity;
        realNameAuthManager$auth$1.L$2 = str;
        realNameAuthManager$auth$1.label = 2;
        objE = nSCHelper2.e(2, realNameAuthManager$auth$realNameUrl$1, realNameAuthManager$auth$1);
        if (objE == coroutine_suspended) {
            return coroutine_suspended;
        }
        String str4 = str;
        realNameAuthManager = this;
        str2 = str4;
        str3 = (String) objE;
        if (!mtj.b(str3)) {
            throw new RuntimeException("实名认证地址获取失败");
        }
        dkf.INSTANCE.a("RealNameManager realNameUrl obtain, then to web");
        realNameAuthManager$auth$1.L$0 = realNameAuthManager;
        realNameAuthManager$auth$1.L$1 = baseActivity;
        realNameAuthManager$auth$1.L$2 = str2;
        realNameAuthManager$auth$1.label = 3;
        if (realNameAuthManager.f(baseActivity, str3, realNameAuthManager$auth$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        dkf.INSTANCE.a("RealNameManager return from web, then to confirmIsRealNameAuthed");
        baseActivity.j7(qtf.l(R$string.esim_redtea_loading_realname));
        realNameAuthManager$auth$1.L$0 = null;
        realNameAuthManager$auth$1.L$1 = null;
        realNameAuthManager$auth$1.L$2 = null;
        realNameAuthManager$auth$1.label = 4;
        objE = realNameAuthManager.e(str2, realNameAuthManager$auth$1);
        if (objE == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Boolean) objE).booleanValue()) {
            dkf.INSTANCE.a("RealNameManager auth succeed after auth by webview");
            return Boxing.boxBoolean(true);
        }
        dkf.INSTANCE.a("RealNameManager auth fail after auth by webview");
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        RealNameAuthManager$checkIsRealNameAuthed$1 realNameAuthManager$checkIsRealNameAuthed$1;
        if (continuation instanceof RealNameAuthManager$checkIsRealNameAuthed$1) {
            realNameAuthManager$checkIsRealNameAuthed$1 = (RealNameAuthManager$checkIsRealNameAuthed$1) continuation;
            int i = realNameAuthManager$checkIsRealNameAuthed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realNameAuthManager$checkIsRealNameAuthed$1.label = i - Integer.MIN_VALUE;
            } else {
                realNameAuthManager$checkIsRealNameAuthed$1 = new RealNameAuthManager$checkIsRealNameAuthed$1(this, continuation);
            }
        } else {
            realNameAuthManager$checkIsRealNameAuthed$1 = new RealNameAuthManager$checkIsRealNameAuthed$1(this, continuation);
        }
        Object objB = realNameAuthManager$checkIsRealNameAuthed$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = realNameAuthManager$checkIsRealNameAuthed$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            RealNameAuthManagerNetSource realNameAuthManagerNetSource = RealNameAuthManagerNetSource.INSTANCE;
            realNameAuthManager$checkIsRealNameAuthed$1.label = 1;
            objB = realNameAuthManagerNetSource.b(str, realNameAuthManager$checkIsRealNameAuthed$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        return Boxing.boxBoolean(((RealNameStatus) objB).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, Continuation<? super Boolean> continuation) {
        RealNameAuthManager$confirmIsRealNameAuthed$1 realNameAuthManager$confirmIsRealNameAuthed$1;
        boolean zBooleanValue;
        if (continuation instanceof RealNameAuthManager$confirmIsRealNameAuthed$1) {
            realNameAuthManager$confirmIsRealNameAuthed$1 = (RealNameAuthManager$confirmIsRealNameAuthed$1) continuation;
            int i = realNameAuthManager$confirmIsRealNameAuthed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realNameAuthManager$confirmIsRealNameAuthed$1.label = i - Integer.MIN_VALUE;
            } else {
                realNameAuthManager$confirmIsRealNameAuthed$1 = new RealNameAuthManager$confirmIsRealNameAuthed$1(this, continuation);
            }
        } else {
            realNameAuthManager$confirmIsRealNameAuthed$1 = new RealNameAuthManager$confirmIsRealNameAuthed$1(this, continuation);
        }
        Object objE = realNameAuthManager$confirmIsRealNameAuthed$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = realNameAuthManager$confirmIsRealNameAuthed$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objE);
                NSCHelper nSCHelper = NSCHelper.INSTANCE;
                RealNameAuthManager$confirmIsRealNameAuthed$2 realNameAuthManager$confirmIsRealNameAuthed$2 = new RealNameAuthManager$confirmIsRealNameAuthed$2(str, null);
                realNameAuthManager$confirmIsRealNameAuthed$1.label = 1;
                objE = nSCHelper.e(2, realNameAuthManager$confirmIsRealNameAuthed$2, realNameAuthManager$confirmIsRealNameAuthed$1);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objE);
            }
            zBooleanValue = ((Boolean) objE).booleanValue();
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(final Context context, final String str, Continuation<? super Result<Boolean>> continuation) {
        RealNameAuthManager$observerWeb$1 realNameAuthManager$observerWeb$1;
        if (continuation instanceof RealNameAuthManager$observerWeb$1) {
            realNameAuthManager$observerWeb$1 = (RealNameAuthManager$observerWeb$1) continuation;
            int i = realNameAuthManager$observerWeb$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realNameAuthManager$observerWeb$1.label = i - Integer.MIN_VALUE;
            } else {
                realNameAuthManager$observerWeb$1 = new RealNameAuthManager$observerWeb$1(this, continuation);
            }
        } else {
            realNameAuthManager$observerWeb$1 = new RealNameAuthManager$observerWeb$1(this, continuation);
        }
        Object objA = realNameAuthManager$observerWeb$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = realNameAuthManager$observerWeb$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            Function1<Function1<? super Result<? extends Boolean>, ? extends Unit>, Unit> function1 = new Function1<Function1<? super Result<? extends Boolean>, ? extends Unit>, Unit>() { // from class: com.heytap.health.esim.nsc.manager.RealNameAuthManager$observerWeb$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Result<? extends Boolean>, ? extends Unit> function2) {
                    invoke2((Function1<? super Result<Boolean>, Unit>) function2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Function1<? super Result<Boolean>, Unit> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    dkf.INSTANCE.a("observerWeb-> togo web page " + str);
                    Context context2 = context;
                    Intent intent = new Intent(context, (Class<?>) RealNameAuthWebActivity.class);
                    intent.putExtra("url", str);
                    context2.startActivity(intent);
                }
            };
            RealNameAuthManager$observerWeb$3 realNameAuthManager$observerWeb$3 = new Function1<Function1<? super Result<? extends Boolean>, ? extends Unit>, Unit>() { // from class: com.heytap.health.esim.nsc.manager.RealNameAuthManager$observerWeb$3
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Result<? extends Boolean>, ? extends Unit> function2) {
                    invoke2((Function1<? super Result<Boolean>, Unit>) function2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Function1<? super Result<Boolean>, Unit> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Result.Companion companion = Result.INSTANCE;
                    it.invoke(Result.m5286boximpl(Result.m5287constructorimpl(Boolean.TRUE)));
                }
            };
            realNameAuthManager$observerWeb$1.label = 1;
            objA = UISwitchKt.a(context, function1, realNameAuthManager$observerWeb$3, realNameAuthManager$observerWeb$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        return ((Result) objA).getValue();
    }
}
