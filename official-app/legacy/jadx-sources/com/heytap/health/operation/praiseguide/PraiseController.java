package com.heytap.health.operation.praiseguide;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.heytap.health.base.praise.PraiseModule;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.ooe;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.vik;
import com.oplus.aiunit.vision.wq8;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.HashMap;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J \u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/heytap/health/operation/praiseguide/PraiseController;", "", "Lcom/heytap/health/base/praise/PraiseModule;", "praiseModule", "", b2n.g, "Landroid/app/Activity;", "context", "", LogFieldKey.MESSAGE_KEY, "", "i", MapSchema.FIELD_NAME_KEY, "dialogTimes", LogFieldKey.PROCESS_NAME_KEY, "(Lcom/heytap/health/base/praise/PraiseModule;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/operation/praiseguide/PraiseGlobalConfig;", "n", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "", "settingValue", "q", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "packageName", "", "j", "Landroid/net/Uri;", ParserTag.TAG_URI, "targetPkgName", LogFieldKey.LEVEL_KEY, "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/heytap/health/base/track/a$b;", "kotlin.jvm.PlatformType", "b", "Lcom/heytap/health/base/track/a$b;", "moduleReport", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "c", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPraiseController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PraiseController.kt\ncom/heytap/health/operation/praiseguide/PraiseController\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,285:1\n48#2,4:286\n*S KotlinDebug\n*F\n+ 1 PraiseController.kt\ncom/heytap/health/operation/praiseguide/PraiseController\n*L\n53#1:286,4\n*E\n"})
public final class PraiseController {
    public static final int INITIAL_PRAISE_DIALOG_TIMES = 1;

    @NotNull
    public static final String STORE_COMMENT_SCHEMA_PREFIX = "oaps://mk/developer/comment?pkg=";
    public static final int SWITCH_MODULE_PRAISE = 14;

    @NotNull
    public static final String SWITCH_USER_SETTING_KEY = "SHOW_STORE_REVIEW_GUIDE_COUNT";

    @NotNull
    public static final String TAG = "PraiseController";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final com.heytap.health.base.track.a.b moduleReport = com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, -2);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineExceptionHandler exceptionHandler = new c(CoroutineExceptionHandler.INSTANCE);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PraiseModule.values().length];
            try {
                iArr[PraiseModule.APP_RECORD_SHARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PraiseModule.APP_COURSE_SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 PraiseController.kt\ncom/heytap/health/operation/praiseguide/PraiseController\n*L\n1#1,110:1\n54#2,2:111\n*E\n"})
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            a7b.b(PraiseController.TAG, "error:" + exception.getMessage());
        }
    }

    public final void h(@NotNull PraiseModule praiseModule) {
        Intrinsics.checkNotNullParameter(praiseModule, "praiseModule");
        a7b.f(TAG, "checkAndShowPraiseDialog praiseModule:" + praiseModule);
        if (k(praiseModule)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, this.exceptionHandler, null, new PraiseController$checkAndShowPraiseDialog$1(this, praiseModule, null), 2, null);
    }

    public final int i(PraiseModule praiseModule) {
        int i = b.$EnumSwitchMapping$0[praiseModule.ordinal()];
        if (i != 1) {
            return i != 2 ? -1 : 2;
        }
        return 1;
    }

    public final long j(Activity context, String packageName) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 128);
            if (packageInfo != null) {
                return packageInfo.getLongVersionCode();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return -1L;
    }

    public final boolean k(PraiseModule praiseModule) {
        if (!ilj.B()) {
            a7b.f(TAG, "not oppobrand, do nothing");
            return true;
        }
        if (g3k.x()) {
            a7b.f(TAG, "checkAndShowPraiseDialog tourist mode, do nothing");
            return true;
        }
        if (!rpc.c()) {
            a7b.f(TAG, "checkAndShowPraiseDialog no network, do nothing");
            return true;
        }
        if (praiseModule != PraiseModule.INVALID_MODULE) {
            return false;
        }
        a7b.f(TAG, "invalid module, do nothing");
        return true;
    }

    public final boolean l(Activity context, Uri uri, String targetPkgName) {
        a7b.f(TAG, "final jumpApp");
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(targetPkgName);
            intent.setData(uri);
            context.startActivityForResult(intent, 100);
            return true;
        } catch (Exception e2) {
            a7b.b(TAG, "jumpApp startActivity error:" + e2.getMessage());
            return false;
        }
    }

    public final boolean m(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = STORE_COMMENT_SCHEMA_PREFIX + context.getPackageName();
        if (j(context, "com.heytap.market") >= 84000) {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(url)");
            return l(context, uri, "com.heytap.market");
        }
        if (j(context, "com.oppo.market") < 84000) {
            return false;
        }
        Uri uri2 = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(url)");
        return l(context, uri2, "com.oppo.market");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(Continuation<? super PraiseGlobalConfig> continuation) {
        PraiseController$queryGlobalConfig$1 praiseController$queryGlobalConfig$1;
        if (continuation instanceof PraiseController$queryGlobalConfig$1) {
            praiseController$queryGlobalConfig$1 = (PraiseController$queryGlobalConfig$1) continuation;
            int i = praiseController$queryGlobalConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                praiseController$queryGlobalConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                praiseController$queryGlobalConfig$1 = new PraiseController$queryGlobalConfig$1(this, continuation);
            }
        } else {
            praiseController$queryGlobalConfig$1 = new PraiseController$queryGlobalConfig$1(this, continuation);
        }
        Object objB = praiseController$queryGlobalConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = praiseController$queryGlobalConfig$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            HashMap map = new HashMap();
            map.put("switchType", Boxing.boxInt(14));
            ooe ooeVar = (ooe) com.heytap.health.network.core.a.j(ooe.class);
            praiseController$queryGlobalConfig$1.label = 1;
            objB = ooeVar.b(map, praiseController$queryGlobalConfig$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        BaseResponse baseResponse = (BaseResponse) objB;
        if (baseResponse.isSuccess() && baseResponse.getBody() != null) {
            Object body = baseResponse.getBody();
            Intrinsics.checkNotNull(body, "null cannot be cast to non-null type com.heytap.health.operation.praiseguide.SwitchGlobalResult");
            SwitchGlobalResult switchGlobalResult = (SwitchGlobalResult) body;
            a7b.f(TAG, "queryGlobalConfig praiseConfig:" + switchGlobalResult + ",curThread:" + Thread.currentThread());
            if (switchGlobalResult.getConfig() != null) {
                try {
                    Object objFromJson = new Gson().fromJson(switchGlobalResult.getConfig(), (Class<Object>) PraiseGlobalConfig.class);
                    Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type com.heytap.health.operation.praiseguide.PraiseGlobalConfig");
                    PraiseGlobalConfig praiseGlobalConfig = (PraiseGlobalConfig) objFromJson;
                    a7b.f(TAG, "queryGlobalConfig transfer success：" + praiseGlobalConfig);
                    return praiseGlobalConfig;
                } catch (JsonSyntaxException e2) {
                    a7b.b(TAG, "queryGlobalConfig json parse error:" + e2);
                }
            }
        }
        a7b.b(TAG, "queryGlobalConfig response error:" + baseResponse.getErrorCode() + ",body:" + baseResponse.getBody() + ",msg:" + baseResponse.getMessage());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(Continuation<? super Integer> continuation) {
        PraiseController$queryUserConfig$1 praiseController$queryUserConfig$1;
        if (continuation instanceof PraiseController$queryUserConfig$1) {
            praiseController$queryUserConfig$1 = (PraiseController$queryUserConfig$1) continuation;
            int i = praiseController$queryUserConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                praiseController$queryUserConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                praiseController$queryUserConfig$1 = new PraiseController$queryUserConfig$1(this, continuation);
            }
        } else {
            praiseController$queryUserConfig$1 = new PraiseController$queryUserConfig$1(this, continuation);
        }
        Object objC = praiseController$queryUserConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = praiseController$queryUserConfig$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (PraiseController) praiseController$queryUserConfig$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return Boxing.boxInt(1);
        }
        ResultKt.throwOnFailure(objC);
        HashMap map = new HashMap();
        map.put("settingKey", SWITCH_USER_SETTING_KEY);
        ooe ooeVar = (ooe) com.heytap.health.network.core.a.j(ooe.class);
        praiseController$queryUserConfig$1.L$0 = this;
        praiseController$queryUserConfig$1.label = 1;
        objC = ooeVar.c(map, praiseController$queryUserConfig$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        BaseResponse baseResponse = (BaseResponse) objC;
        a7b.f(TAG, "queryUserConfig response:" + baseResponse.getBody() + ",response:" + baseResponse.getMessage());
        if (!baseResponse.isSuccess()) {
            a7b.b(TAG, "queryUserConfig response error:" + baseResponse.getErrorCode() + ",body:" + baseResponse.getBody() + ",msg:" + baseResponse.getMessage());
            return null;
        }
        if (baseResponse.getBody() == null) {
            praiseController$queryUserConfig$1.L$0 = null;
            praiseController$queryUserConfig$1.label = 2;
            if (this.q("1", praiseController$queryUserConfig$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Boxing.boxInt(1);
        }
        Object body = baseResponse.getBody();
        Intrinsics.checkNotNull(body, "null cannot be cast to non-null type com.heytap.health.operation.praiseguide.SwitchUserResult");
        SwitchUserResult switchUserResult = (SwitchUserResult) body;
        a7b.f(TAG, "queryUserConfig praiseConfig:" + switchUserResult);
        String settingValue = switchUserResult.getSettingValue();
        if (settingValue != null) {
            try {
                a7b.f(TAG, "queryUserConfig settingValue:" + settingValue);
                return Boxing.boxInt(Integer.parseInt(settingValue));
            } catch (NumberFormatException e2) {
                a7b.b(TAG, "queryUserConfig parse value error:" + e2);
            }
        }
        return null;
    }

    public final Object p(PraiseModule praiseModule, int i, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(wq8.INSTANCE.f(), new PraiseController$showPraiseDialog$2(this, i, praiseModule, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final Object q(String str, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(wq8.INSTANCE.e(), new PraiseController$syncUserSetting$2(str, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
