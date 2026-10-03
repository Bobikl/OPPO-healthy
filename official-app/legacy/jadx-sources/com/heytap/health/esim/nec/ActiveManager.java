package com.heytap.health.esim.nec;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.esim.bean.ESIMCMCCActiveInfoBean;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.dc6;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.wq8;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?JG\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0007JM\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\f0\u0007J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012J$\u0010\u0018\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002J)\u0010\u001b\u001a\u00020\f2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\f0\u0007R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010,\u001a\u00020+8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0014068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:¨\u0006@"}, d2 = {"Lcom/heytap/health/esim/nec/ActiveManager;", "", "", "imei", "eid", "", "retryCount", "Lkotlin/Function1;", "Lcom/heytap/health/esim/bean/ESIMCMCCActiveInfoBean;", "Lkotlin/ParameterName;", "name", "data", "", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "f", "phone", ClickApiEntity.TIME, "d", "Landroidx/lifecycle/LiveData;", b2n.g, "", "j", "deviceImei", "deviceEid", LogFieldKey.LEVEL_KEY, "needActivation", "callback", MapSchema.FIELD_NAME_KEY, "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "cs", "Lcom/oplus/aiunit/vision/dc6;", "b", "Lcom/oplus/aiunit/vision/dc6;", "i", "()Lcom/oplus/aiunit/vision/dc6;", oea.FEATURE_API_REQUEST, "STATE_NONE", "I", "STATE_ACTIVATING", "STATE_SUCCESS", "STATE_FAILED", "", "RETRY_DELAY", "J", "c", "Ljava/lang/String;", "mDeviceImei", "mDeviceEid", "Landroid/os/Handler;", MapSchema.FIELD_NAME_ENTRY, "Landroid/os/Handler;", "mainHandler", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "_activeH5Url", b2n.f, "Landroidx/lifecycle/LiveData;", "activeH5Url", "_necActive", "necActive", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ActiveManager {
    public static final int $stable;
    public static final long RETRY_DELAY = 400;
    public static final int STATE_ACTIVATING = 1;
    public static final int STATE_FAILED = 3;
    public static final int STATE_NONE = 0;
    public static final int STATE_SUCCESS = 2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final dc6 api;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static volatile String mDeviceImei;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static volatile String mDeviceEid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Handler mainHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final MutableLiveData<String> _activeH5Url;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final LiveData<String> activeH5Url;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final MutableLiveData<Boolean> _necActive;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final LiveData<Boolean> necActive;

    @NotNull
    public static final ActiveManager INSTANCE = new ActiveManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineScope cs = CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.b("CMCCActive"));

    static {
        Object objL = com.heytap.health.network.core.a.l(dc6.class);
        Intrinsics.checkNotNullExpressionValue(objL, "getEncryptApi(ESIMEncrypt::class.java)");
        api = (dc6) objL;
        mainHandler = new Handler(Looper.getMainLooper());
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        _activeH5Url = mutableLiveData;
        activeH5Url = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        _necActive = mutableLiveData2;
        necActive = mutableLiveData2;
        $stable = 8;
    }

    public static /* synthetic */ void e(ActiveManager activeManager, String str, String str2, String str3, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 3;
        }
        activeManager.d(str, str2, str3, i, function1);
    }

    @JvmStatic
    public static final void f(@NotNull String imei, @NotNull String eid, int retryCount, @NotNull Function1<? super ESIMCMCCActiveInfoBean, Unit> response) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(response, "response");
        BuildersKt__Builders_commonKt.launch$default(cs, null, null, new ActiveManager$cmccActiveInfo$1(imei, eid, retryCount, response, null), 3, null);
    }

    public static /* synthetic */ void g(String str, String str2, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        f(str, str2, i, function1);
    }

    public final void d(@NotNull String phone, @NotNull String imei, @NotNull String eid, int retryCount, @NotNull Function1<? super String, Unit> response) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(response, "response");
        BuildersKt__Builders_commonKt.launch$default(cs, null, null, new ActiveManager$cmccActive$1(phone, imei, eid, retryCount, response, null), 3, null);
    }

    @NotNull
    public final LiveData<String> h() {
        return activeH5Url;
    }

    @NotNull
    public final dc6 i() {
        return api;
    }

    @NotNull
    public final LiveData<Boolean> j() {
        return necActive;
    }

    public final void k(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Boolean value = _necActive.getValue();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(value, bool)) {
            callback.invoke(Boolean.FALSE);
            return;
        }
        String str = mDeviceImei;
        String str2 = mDeviceEid;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                g(str, str2, 0, new ActiveManager$recheckActivationAfterDownload$1(callback), 4, null);
                return;
            }
        }
        a7b.f("EsimHealth.CMCCActive", "recheckActivation: imei or eid is null");
        callback.invoke(bool);
    }

    public final void l(@Nullable final String phone, @Nullable final String deviceImei, @Nullable final String deviceEid) {
        mDeviceImei = deviceImei;
        mDeviceEid = deviceEid;
        _necActive.postValue(Boolean.TRUE);
        BusinessManager.INSTANCE.p(new Function2<Boolean, Boolean, Unit>() { // from class: com.heytap.health.esim.nec.ActiveManager$startGetNecActiveH5Url$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
                invoke(bool.booleanValue(), bool2.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z, boolean z2) {
                ActiveManager._necActive.postValue(Boolean.valueOf(z2));
                if (!z2) {
                    ActiveManager._activeH5Url.postValue("no_need");
                    return;
                }
                if (TextUtils.isEmpty(phone)) {
                    a7b.f("EsimHealth.CMCCActive", "startGetNecActiveH5Url phone is null");
                    ActiveManager._activeH5Url.postValue(null);
                }
                if (TextUtils.isEmpty(deviceImei)) {
                    a7b.f("EsimHealth.CMCCActive", "startGetNecActiveH5Url deviceImei is null");
                    ActiveManager._activeH5Url.postValue(null);
                }
                if (TextUtils.isEmpty(deviceEid)) {
                    a7b.f("EsimHealth.CMCCActive", "startGetNecActiveH5Url deviceEid is null");
                    ActiveManager._activeH5Url.postValue(null);
                }
                String str = phone;
                if (str != null) {
                    final String str2 = deviceImei;
                    final String str3 = deviceEid;
                    if (str2 == null || str3 == null) {
                        return;
                    }
                    ActiveManager.e(ActiveManager.INSTANCE, str, str2, str3, 0, new Function1<String, Unit>() { // from class: com.heytap.health.esim.nec.ActiveManager$startGetNecActiveH5Url$1$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                            invoke2(str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@Nullable String str4) {
                            a7b.f("EsimHealth.CMCCActive", "startGetNecActiveH5Url cmccActive called：" + str4);
                            ActiveManager.g(str2, str3, 0, new Function1<ESIMCMCCActiveInfoBean, Unit>() { // from class: com.heytap.health.esim.nec.ActiveManager$startGetNecActiveH5Url$1$1$1$1$1.1
                                @Override // p010kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ESIMCMCCActiveInfoBean eSIMCMCCActiveInfoBean) {
                                    invoke2(eSIMCMCCActiveInfoBean);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable ESIMCMCCActiveInfoBean eSIMCMCCActiveInfoBean) {
                                    String str5;
                                    Integer numValueOf = eSIMCMCCActiveInfoBean != null ? Integer.valueOf(eSIMCMCCActiveInfoBean.getActiveResult()) : null;
                                    Long lValueOf = eSIMCMCCActiveInfoBean != null ? Long.valueOf(eSIMCMCCActiveInfoBean.getTime()) : null;
                                    if (qe0.w()) {
                                        str5 = "  --> " + (eSIMCMCCActiveInfoBean != null ? eSIMCMCCActiveInfoBean.getUrl() : null);
                                    } else {
                                        str5 = "";
                                    }
                                    a7b.f("EsimHealth.CMCCActive", "startGetNecActiveH5Url cmccActiveInfo called：" + numValueOf + "  --> " + lValueOf + str5);
                                    ActiveManager._activeH5Url.postValue(eSIMCMCCActiveInfoBean != null ? eSIMCMCCActiveInfoBean.getUrl() : null);
                                }
                            }, 4, null);
                        }
                    }, 8, null);
                }
            }
        });
    }
}
