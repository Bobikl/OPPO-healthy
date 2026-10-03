package com.heytap.health.esim.nsc.manager;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.nsc.dto.NetWorkServiceNetSource;
import com.heytap.health.esim.nsc.dto.UserCombo;
import com.heytap.health.settings.me.setting.NetWorkOfficeWebViewActivity;
import com.heytap.sporthealth.blib.helper.UISwitchKt;
import com.oplus.aiunit.vision.Order;
import com.oplus.aiunit.vision.dkf;
import com.oplus.aiunit.vision.ko0;
import com.oplus.aiunit.vision.sbe;
import com.oplus.aiunit.vision.t04;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.zv8;
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
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%JR\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0082@ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/heytap/health/esim/nsc/manager/H5NSCTransaction;", "Lcom/heytap/health/esim/nsc/manager/NSCTransaction;", "Landroid/content/Context;", "context", "", "comboThirdId", t04.DEVICE_UNIQUE_ID, "eid", "imei", "", "businessType", "Lkotlin/Result;", "", "f", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lcom/heytap/health/esim/nsc/dto/UserCombo;", "userCombo", "", "a", "(Landroid/content/Context;Lcom/heytap/health/esim/nsc/dto/UserCombo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", sbe.PAY_SDK_PREPAYTOKEN, "productionName", "signType", "tradeType", "n", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "NORMAL_PAY", "b", "PERIODIC_PAY", "c", "PAYMENT", "SIGN", MapSchema.FIELD_NAME_ENTRY, "SIGNANDPAY", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class H5NSCTransaction extends NSCTransaction {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String NORMAL_PAY = "NORMAL_PAY";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String PERIODIC_PAY = "PERIODIC_PAY";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String PAYMENT = "PAYMENT";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String SIGN = "SIGN";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String SIGNANDPAY = "SIGNANDPAY";

    /* JADX WARN: Code duplicated, block: B:27:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object a(@NotNull Context context, @NotNull UserCombo userCombo, @NotNull Continuation<? super Unit> continuation) {
        H5NSCTransaction$autoRenewal$1 h5NSCTransaction$autoRenewal$1;
        H5NSCTransaction h5NSCTransaction;
        ko0 ko0Var;
        String productId;
        String orderId;
        if (continuation instanceof H5NSCTransaction$autoRenewal$1) {
            h5NSCTransaction$autoRenewal$1 = (H5NSCTransaction$autoRenewal$1) continuation;
            int i = h5NSCTransaction$autoRenewal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5NSCTransaction$autoRenewal$1.label = i - Integer.MIN_VALUE;
            } else {
                h5NSCTransaction$autoRenewal$1 = new H5NSCTransaction$autoRenewal$1(this, continuation);
            }
        } else {
            h5NSCTransaction$autoRenewal$1 = new H5NSCTransaction$autoRenewal$1(this, continuation);
        }
        Object objA = h5NSCTransaction$autoRenewal$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = h5NSCTransaction$autoRenewal$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                context = (Context) h5NSCTransaction$autoRenewal$1.L$1;
                this = (H5NSCTransaction) h5NSCTransaction$autoRenewal$1.L$0;
                ResultKt.throwOnFailure(objA);
            } else if (i2 == 2) {
                ko0Var = (ko0) h5NSCTransaction$autoRenewal$1.L$1;
                h5NSCTransaction = (H5NSCTransaction) h5NSCTransaction$autoRenewal$1.L$0;
                ResultKt.throwOnFailure(objA);
                productId = ko0Var.getProductId();
                orderId = ko0Var.getOrderId();
                h5NSCTransaction$autoRenewal$1.L$0 = null;
                h5NSCTransaction$autoRenewal$1.L$1 = null;
                h5NSCTransaction$autoRenewal$1.label = 3;
                if (h5NSCTransaction.c(productId, orderId, h5NSCTransaction$autoRenewal$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        NetWorkServiceNetSource netWorkServiceNetSource = NetWorkServiceNetSource.INSTANCE;
        String mac = userCombo.getMac();
        String id = userCombo.getId();
        String imei = userCombo.getImei();
        String eid = userCombo.getEid();
        Integer numBoxInt = Boxing.boxInt(2);
        h5NSCTransaction$autoRenewal$1.L$0 = this;
        h5NSCTransaction$autoRenewal$1.L$1 = context;
        h5NSCTransaction$autoRenewal$1.label = 1;
        objA = netWorkServiceNetSource.a(mac, id, imei, eid, numBoxInt, h5NSCTransaction$autoRenewal$1);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        Context context2 = context;
        ko0 ko0Var2 = (ko0) objA;
        String str = ko0Var2.getCom.oplus.aiunit.vision.sbe.PAY_SDK_PREPAYTOKEN java.lang.String();
        String str2 = ko0Var2.getCom.oplus.aiunit.vision.sbe.PAY_SDK_PRODUCTNAME java.lang.String();
        String str3 = this.PERIODIC_PAY;
        String str4 = this.SIGN;
        h5NSCTransaction$autoRenewal$1.L$0 = this;
        h5NSCTransaction$autoRenewal$1.L$1 = ko0Var2;
        h5NSCTransaction$autoRenewal$1.label = 2;
        if (this.n(context2, str, str2, str3, str4, h5NSCTransaction$autoRenewal$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        h5NSCTransaction = this;
        ko0Var = ko0Var2;
        productId = ko0Var.getProductId();
        orderId = ko0Var.getOrderId();
        h5NSCTransaction$autoRenewal$1.L$0 = null;
        h5NSCTransaction$autoRenewal$1.L$1 = null;
        h5NSCTransaction$autoRenewal$1.label = 3;
        if (h5NSCTransaction.c(productId, orderId, h5NSCTransaction$autoRenewal$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object d(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull Continuation<? super Result<Boolean>> continuation) {
        H5NSCTransaction$pay$1 h5NSCTransaction$pay$1;
        if (continuation instanceof H5NSCTransaction$pay$1) {
            h5NSCTransaction$pay$1 = (H5NSCTransaction$pay$1) continuation;
            int i2 = h5NSCTransaction$pay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h5NSCTransaction$pay$1.label = i2 - Integer.MIN_VALUE;
            } else {
                h5NSCTransaction$pay$1 = new H5NSCTransaction$pay$1(this, continuation);
            }
        } else {
            h5NSCTransaction$pay$1 = new H5NSCTransaction$pay$1(this, continuation);
        }
        H5NSCTransaction$pay$1 h5NSCTransaction$pay$2 = h5NSCTransaction$pay$1;
        Object obj = h5NSCTransaction$pay$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = h5NSCTransaction$pay$2.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        Function2<? super Order, ? super Continuation<? super Boolean>, ? extends Object> h5NSCTransaction$pay$3 = new H5NSCTransaction$pay$2(this, context, null);
        h5NSCTransaction$pay$2.label = 1;
        Object objB = b(context, str, str2, str3, str4, i, h5NSCTransaction$pay$3, h5NSCTransaction$pay$2);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object f(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull Continuation<? super Result<Boolean>> continuation) {
        H5NSCTransaction$sign$1 h5NSCTransaction$sign$1;
        if (continuation instanceof H5NSCTransaction$sign$1) {
            h5NSCTransaction$sign$1 = (H5NSCTransaction$sign$1) continuation;
            int i2 = h5NSCTransaction$sign$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h5NSCTransaction$sign$1.label = i2 - Integer.MIN_VALUE;
            } else {
                h5NSCTransaction$sign$1 = new H5NSCTransaction$sign$1(this, continuation);
            }
        } else {
            h5NSCTransaction$sign$1 = new H5NSCTransaction$sign$1(this, continuation);
        }
        H5NSCTransaction$sign$1 h5NSCTransaction$sign$2 = h5NSCTransaction$sign$1;
        Object obj = h5NSCTransaction$sign$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = h5NSCTransaction$sign$2.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        Function2<? super Order, ? super Continuation<? super Boolean>, ? extends Object> h5NSCTransaction$sign$3 = new H5NSCTransaction$sign$2(this, context, i, null);
        h5NSCTransaction$sign$2.label = 1;
        Object objB = b(context, str, str2, str3, str4, i, h5NSCTransaction$sign$3, h5NSCTransaction$sign$2);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    public final Object n(Context context, final String str, final String str2, final String str3, final String str4, Continuation<? super Boolean> continuation) {
        return UISwitchKt.a(context, new Function1<Function1<? super Boolean, ? extends Unit>, Unit>() { // from class: com.heytap.health.esim.nsc.manager.H5NSCTransaction$toH5$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
                invoke2((Function1<? super Boolean, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super Boolean, Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str5 = zv8.b.URL_H5_PAY + "?paymentType=" + str3 + "&prePayToken=" + Uri.encode(str) + "&tradeType=" + str4;
                dkf.INSTANCE.b("toH5: " + str5);
                x0.d().b("/thirdservice/ThirdPartyServiceWebViewActivity").withString(NetWorkOfficeWebViewActivity.EXTRA_WEBSITE, str5).withString("theme", "0").withString("title", str2).navigation();
            }
        }, new Function1<Function1<? super Boolean, ? extends Unit>, Unit>() { // from class: com.heytap.health.esim.nsc.manager.H5NSCTransaction$toH5$3
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
                invoke2((Function1<? super Boolean, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super Boolean, Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.invoke(Boolean.TRUE);
            }
        }, continuation);
    }
}
