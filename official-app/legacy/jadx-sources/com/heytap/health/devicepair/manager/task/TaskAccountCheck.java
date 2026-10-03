package com.heytap.health.devicepair.manager.task;

import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.devicemanager.UserInfoHelper;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.a;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.u83;
import com.oplus.aiunit.vision.um;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J2\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\fH\u0002J\f\u0010\u000f\u001a\u00020\u0005*\u00020\u0005H\u0002J\f\u0010\u0010\u001a\u00020\u0005*\u00020\u0005H\u0002J\u0013\u0010\u0011\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/TaskAccountCheck;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "watchAccountNumber", "phoneAccountNumber", "", "r", "str1", "str2", "Lkotlin/Function2;", "block", "s", "u", "t", "v", "Lcom/oplus/aiunit/vision/u83;", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/u83;", "callback", "n", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "", "o", "I", "CODE_NOT_MATCH", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;Lcom/oplus/aiunit/vision/u83;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskAccountCheck extends a {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final u83 callback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int CODE_NOT_MATCH;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskAccountCheck(@NotNull PairContext pairContext, @NotNull u83 callback) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        this.TAG = "TaskAccountCheck";
        this.CODE_NOT_MATCH = 101;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.devicepair.manager.a
    @Nullable
    public Object a(@NotNull Continuation<? super ResultData> continuation) {
        TaskAccountCheck$execute$1 taskAccountCheck$execute$1;
        final String accountNumber;
        Object objV;
        final ResultData resultDataD;
        if (continuation instanceof TaskAccountCheck$execute$1) {
            taskAccountCheck$execute$1 = (TaskAccountCheck$execute$1) continuation;
            int i = taskAccountCheck$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskAccountCheck$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                taskAccountCheck$execute$1 = new TaskAccountCheck$execute$1(this, continuation);
            }
        } else {
            taskAccountCheck$execute$1 = new TaskAccountCheck$execute$1(this, continuation);
        }
        Object obj = taskAccountCheck$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskAccountCheck$execute$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (gl4.managerApi.getBoundDeviceInfoByMac(getPairContext().getPairParams().getId()) != null) {
                resultDataD = ResultData.Companion.d(ResultData.INSTANCE, 0, null, 3, null);
            } else {
                accountNumber = getPairContext().getPairParams().getAccountNumber();
                taskAccountCheck$execute$1.L$0 = this;
                taskAccountCheck$execute$1.L$1 = accountNumber;
                taskAccountCheck$execute$1.label = 1;
                objV = v(taskAccountCheck$execute$1);
                if (objV == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (resultDataD.b()) {
                this.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskAccountCheck$execute$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.callback.b(resultDataD);
                    }
                });
            }
            return this.o(resultDataD);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) taskAccountCheck$execute$1.L$1;
        TaskAccountCheck taskAccountCheck = (TaskAccountCheck) taskAccountCheck$execute$1.L$0;
        ResultKt.throwOnFailure(obj);
        accountNumber = str;
        this = taskAccountCheck;
        objV = obj;
        final String str2 = (String) objV;
        if (this.r(accountNumber, str2)) {
            resultDataD = ResultData.Companion.d(ResultData.INSTANCE, 0, null, 3, null);
        } else {
            this.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskAccountCheck$execute$result$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.callback.a(accountNumber, str2);
                }
            });
            resultDataD = ResultData.INSTANCE.a(this.CODE_NOT_MATCH, new ResultData.PairExpandBean(ResultData.PairFailType.NORMAL, "not match"));
        }
        if (resultDataD.b()) {
            this.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskAccountCheck$execute$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.callback.b(resultDataD);
                }
            });
        }
        return this.o(resultDataD);
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    public final boolean r(String watchAccountNumber, String phoneAccountNumber) {
        if (!(watchAccountNumber.length() == 0)) {
            if (!(phoneAccountNumber.length() == 0) && !Intrinsics.areEqual(watchAccountNumber, phoneAccountNumber)) {
                boolean zS = s(t(watchAccountNumber), t(phoneAccountNumber), new Function2<String, String, Boolean>() { // from class: com.heytap.health.devicepair.manager.task.TaskAccountCheck$checkAccountNumberRule$result$1
                    @Override // p010kotlin.jvm.functions.Function2
                    @NotNull
                    public final Boolean invoke(@NotNull String str, @NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str, "long");
                        Intrinsics.checkNotNullParameter(str2, "short");
                        return Boolean.valueOf(StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null));
                    }
                });
                return zS ? s(u(watchAccountNumber), u(phoneAccountNumber), new Function2<String, String, Boolean>() { // from class: com.heytap.health.devicepair.manager.task.TaskAccountCheck$checkAccountNumberRule$1
                    @Override // p010kotlin.jvm.functions.Function2
                    @NotNull
                    public final Boolean invoke(@NotNull String str, @NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str, "long");
                        Intrinsics.checkNotNullParameter(str2, "short");
                        return Boolean.valueOf(StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null));
                    }
                }) : zS;
            }
        }
        return true;
    }

    public final boolean s(String str1, String str2, Function2<? super String, ? super String, Boolean> block) {
        if (!(str1.length() == 0)) {
            if (!(str2.length() == 0)) {
                if (str1.length() == str2.length()) {
                    return Intrinsics.areEqual(str1, str2);
                }
                if (str1.length() <= str2.length()) {
                    str2 = str1;
                    str1 = str2;
                }
                return block.invoke(str1, str2).booleanValue();
            }
        }
        return true;
    }

    public final String t(String str) {
        Matcher matcher = Pattern.compile("^(\\d+|[a-zA-Z0-9_-]+)").matcher(str);
        String strGroup = matcher.find() ? matcher.group(1) : "";
        Intrinsics.checkNotNullExpressionValue(strGroup, "compile(\"^(\\\\d+|[a-zA-Z0…          }\n            }");
        return strGroup;
    }

    public final String u(String str) {
        Matcher matcher = Pattern.compile("(\\d+|@.*\\..*)$").matcher(str);
        String strGroup = matcher.find() ? matcher.group(1) : "";
        Intrinsics.checkNotNullExpressionValue(strGroup, "compile(\"(\\\\d+|@.*\\\\..*)…          }\n            }");
        return strGroup;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(Continuation<? super String> continuation) {
        TaskAccountCheck$getCurrAccountInfo$1 taskAccountCheck$getCurrAccountInfo$1;
        Object objM5287constructorimpl;
        if (continuation instanceof TaskAccountCheck$getCurrAccountInfo$1) {
            taskAccountCheck$getCurrAccountInfo$1 = (TaskAccountCheck$getCurrAccountInfo$1) continuation;
            int i = taskAccountCheck$getCurrAccountInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskAccountCheck$getCurrAccountInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                taskAccountCheck$getCurrAccountInfo$1 = new TaskAccountCheck$getCurrAccountInfo$1(this, continuation);
            }
        } else {
            taskAccountCheck$getCurrAccountInfo$1 = new TaskAccountCheck$getCurrAccountInfo$1(this, continuation);
        }
        Object objB = taskAccountCheck$getCurrAccountInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskAccountCheck$getCurrAccountInfo$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objB);
                Result.Companion companion = Result.INSTANCE;
                String ssoid = um.c().getSsoid();
                Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
                AsyncResult<String> asyncResultF = UserInfoHelper.f(ssoid);
                taskAccountCheck$getCurrAccountInfo$1.L$0 = this;
                taskAccountCheck$getCurrAccountInfo$1.label = 1;
                objB = asyncResultF.b(taskAccountCheck$getCurrAccountInfo$1);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (TaskAccountCheck) taskAccountCheck$getCurrAccountInfo$1.L$0;
                ResultKt.throwOnFailure(objB);
            }
            objM5287constructorimpl = Result.m5287constructorimpl((String) objB);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return objM5287constructorimpl;
        }
        ml4.c(this.getTAG(), "getCurrAccountInfo faile:" + thM5290exceptionOrNullimpl.getMessage());
        return "";
    }
}
