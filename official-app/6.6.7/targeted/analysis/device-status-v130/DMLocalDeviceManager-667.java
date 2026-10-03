package com.heytap.health.devicemanagerimpl.core;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.base.utils.AsyncResultCoroutine;
import com.heytap.health.core.provider.HealthSwitchProvider;
import com.heytap.health.devicemanagerimpl.core.DMLocalDeviceManager;
import com.heytap.health.devicemanagerimpl.util.DeviceCommonFilter;
import com.heytap.health.vision.processor.bean.AboutDeviceInfo;
import com.heytap.health.vision.processor.bean.UserDeviceInfo;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.model.cm4;
import com.oplus.aiunit.model.ji0;
import com.oplus.aiunit.model.lr5;
import com.oplus.aiunit.model.y7j;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.kdb;
import com.oplus.aiunit.vision.ro0;
import com.oplus.aiunit.vision.veb;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007J\u0014\u0010\u0010\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0017J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006J\u0014\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\tJ\u0010\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u001c\u0010'\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010)\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/heytap/health/devicemanagerimpl/processor/DMLocalDeviceManager;", BuildConfig.VERSION_NAME, "Lcom/heytap/health/base/utils/AsyncResultCoroutine;", "Lcom/oplus/aiunit/vision/ji0;", "i", "Lcom/heytap/health/base/utils/AsyncResult;", BuildConfig.VERSION_NAME, "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "h", BuildConfig.VERSION_NAME, "userDeviceList", BuildConfig.VERSION_NAME, "j", "userDeviceInfo", BuildConfig.VERSION_NAME, "w", "y", "r", BuildConfig.VERSION_NAME, "mac", "s", "f", "m", "Lcom/heytap/health/devicemanager/processor/bean/AboutDeviceInfo;", "g", "p", "aboutDeviceInfo", "t", "o", "aboutDeviceInfoList", "v", "k", "Lcom/oplus/aiunit/vision/y7j;", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/fdg;", "kotlin.jvm.PlatformType", "a", "Lcom/oplus/aiunit/vision/fdg;", "DMSpInstant", "b", "DMAboutDeviceSpInstant", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDMLocalDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DMLocalDeviceManager.kt\ncom/heytap/health/devicemanagerimpl/processor/DMLocalDeviceManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n314#2,11:295\n1#3:306\n1054#4:307\n1655#4,8:308\n1855#4,2:316\n*S KotlinDebug\n*F\n+ 1 DMLocalDeviceManager.kt\ncom/heytap/health/devicemanagerimpl/processor/DMLocalDeviceManager\n*L\n59#1:295,11\n114#1:307\n115#1:308,8\n248#1:316,2\n*E\n"})
public final class DMLocalDeviceManager {

    @NotNull
    public static final DMLocalDeviceManager INSTANCE = new DMLocalDeviceManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final fdg DMSpInstant = fdg.x("DMDBManager");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final fdg DMAboutDeviceSpInstant = fdg.x("DMDBMANAGER_ABOUTDEVICE");

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/devicemanagerimpl/processor/DMLocalDeviceManager$a", "Lcom/oplus/aiunit/vision/ro0;", BuildConfig.VERSION_NAME, "Lcom/oplus/aiunit/vision/y7j;", HealthSwitchProvider.KEY_RESULT, BuildConfig.VERSION_NAME, "c", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ro0<List<? extends y7j>> {
        public final /* synthetic */ CancellableContinuation<List<y7j>> j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super List<y7j>> cancellableContinuation) {
            this.j = cancellableContinuation;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull List<y7j> result) {
            Intrinsics.checkNotNullParameter(result, HealthSwitchProvider.KEY_RESULT);
            this.j.resumeWith(Result.constructor-impl(result));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", BuildConfig.VERSION_NAME, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 DMLocalDeviceManager.kt\ncom/heytap/health/devicemanagerimpl/processor/DMLocalDeviceManager\n*L\n1#1,328:1\n114#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((UserDeviceInfo) t2).getBindingTime()), Long.valueOf(((UserDeviceInfo) t).getBindingTime()));
        }
    }

    public static final boolean l(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean n(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean u(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean x(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @NotNull
    public final AsyncResult<Boolean> f(@Nullable final String mac) {
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends Boolean>, ? extends Unit>, Unit>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$asyncDeleteUserBoundDeviceByMac$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<Boolean>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Function1<? super Result<Boolean>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "it");
                DMLocalDeviceManager.INSTANCE.m(mac);
                Result.Companion companion = Result.Companion;
                function1.invoke(Result.box-impl(Result.constructor-impl(Boolean.TRUE)));
            }
        });
    }

    @NotNull
    public final AsyncResult<AboutDeviceInfo> g(@Nullable final String mac) {
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends AboutDeviceInfo>, ? extends Unit>, Unit>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$asyncGetAboutDeviceInfoListByMac$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<? extends AboutDeviceInfo>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Function1<? super Result<? extends AboutDeviceInfo>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "it");
                Result.Companion companion = Result.Companion;
                function1.invoke(Result.box-impl(Result.constructor-impl(DMLocalDeviceManager.INSTANCE.p(mac))));
            }
        });
    }

    @NotNull
    public final AsyncResult<List<UserDeviceInfo>> h() {
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends List<UserDeviceInfo>>, ? extends Unit>, Unit>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$asyncGetUserBoundDeviceList$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<? extends List<UserDeviceInfo>>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Function1<? super Result<? extends List<UserDeviceInfo>>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "it");
                Result.Companion companion = Result.Companion;
                function1.invoke(Result.box-impl(Result.constructor-impl(DMLocalDeviceManager.INSTANCE.r())));
            }
        });
    }

    @NotNull
    public final AsyncResultCoroutine<ji0> i() {
        return new AsyncResultCoroutine<>((CoroutineScope) null, new DMLocalDeviceManager$asyncGetUserBoundDeviceListAndSupportModels$1(null), 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final AsyncResult<Boolean> j(@NotNull final List<? extends UserDeviceInfo> userDeviceList) {
        Intrinsics.checkNotNullParameter(userDeviceList, "userDeviceList");
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends Boolean>, ? extends Unit>, Unit>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$asyncSaveUserDeviceList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<Boolean>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Function1<? super Result<Boolean>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "it");
                DMLocalDeviceManager.INSTANCE.y(userDeviceList);
                Result.Companion companion = Result.Companion;
                function1.invoke(Result.box-impl(Result.constructor-impl(Boolean.TRUE)));
            }
        });
    }

    public final synchronized void k(@Nullable final String mac) {
        boolean z;
        if (mac != null) {
            try {
                z = mac.length() == 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            cm4.c("DMLocalDeviceManager", "deleteAboutDeviceInfoByMac mac is null or empty");
            return;
        }
        List<AboutDeviceInfo> listO = o();
        final Function1<AboutDeviceInfo, Boolean> function1 = new Function1<AboutDeviceInfo, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$deleteAboutDeviceInfoByMac$removeIf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Boolean invoke(@NotNull AboutDeviceInfo aboutDeviceInfo) {
                Intrinsics.checkNotNullParameter(aboutDeviceInfo, "it");
                return Boolean.valueOf(Intrinsics.areEqual(aboutDeviceInfo.getDeviceUniqueId(), mac));
            }
        };
        boolean zRemoveIf = listO.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.yl4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return DMLocalDeviceManager.l(function1, obj);
            }
        });
        v(listO);
        cm4.d("DMLocalDeviceManager", "deleteAboutDeviceInfoByMac remove " + veb.a(mac) + " done,result:" + zRemoveIf);
    }

    public final synchronized void m(@Nullable final String mac) {
        boolean z;
        if (mac != null) {
            try {
                z = mac.length() == 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            cm4.c("DMLocalDeviceManager", "deleteUserBoundDeviceByMac mac is null or empty");
            return;
        }
        List<UserDeviceInfo> listR = r();
        final Function1<UserDeviceInfo, Boolean> function1 = new Function1<UserDeviceInfo, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$deleteUserBoundDeviceByMac$removeIf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Boolean invoke(@NotNull UserDeviceInfo userDeviceInfo) {
                Intrinsics.checkNotNullParameter(userDeviceInfo, "it");
                return Boolean.valueOf(UserDeviceInfo.isSameDevice(userDeviceInfo, mac));
            }
        };
        boolean zRemoveIf = listR.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.xl4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return DMLocalDeviceManager.n(function1, obj);
            }
        });
        y(listR);
        k(mac);
        cm4.d("DMLocalDeviceManager", "deleteUserBoundDeviceByMac remove " + veb.a(mac) + " done,result:" + zRemoveIf);
    }

    @NotNull
    public final synchronized List<AboutDeviceInfo> o() {
        Object arrayList;
        try {
            Result.Companion companion = Result.Companion;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String ssoid = cn.c().getSsoid();
            List<? extends AboutDeviceInfo> arrayList2 = (List) new Gson().fromJson(DMAboutDeviceSpInstant.E(ssoid, BuildConfig.VERSION_NAME), new TypeToken<List<AboutDeviceInfo>>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$getAboutDeviceInfoList$1$aboutDeviceInfos$1
            }.getType());
            if (arrayList2 != null) {
                Intrinsics.checkNotNullExpressionValue(arrayList2, "fromJson<MutableList<Abo…utDeviceInfo>>() {}.type)");
                cm4.d("DMLocalDeviceManager", "getAboutDeviceInfoList done " + arrayList2.size() + ",cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "," + kdb.d(ssoid));
            } else {
                arrayList2 = new ArrayList<>();
            }
            if (arrayList2.isEmpty()) {
                List<UserDeviceInfo> listR = INSTANCE.r();
                if (!listR.isEmpty()) {
                    for (UserDeviceInfo userDeviceInfo : listR) {
                        AboutDeviceInfo aboutDeviceInfo = new AboutDeviceInfo();
                        aboutDeviceInfo.setDeviceUniqueId(userDeviceInfo.getMac());
                        aboutDeviceInfo.setModel(userDeviceInfo.getModel());
                        aboutDeviceInfo.setOsVersion(userDeviceInfo.getDeviceOsVersion());
                        aboutDeviceInfo.setVersionNumber(userDeviceInfo.getFirmwareVersion());
                        aboutDeviceInfo.setImei(userDeviceInfo.getImei());
                        aboutDeviceInfo.setSerialNumber(userDeviceInfo.getDeviceSn());
                        aboutDeviceInfo.setBluetoothAddress(userDeviceInfo.getMac());
                        arrayList2.add(aboutDeviceInfo);
                    }
                    cm4.a("DMLocalDeviceManager", "getAboutDeviceInfoList cache is empty,getUserBoundDeviceList");
                    INSTANCE.v(arrayList2);
                }
            }
            arrayList = Result.constructor-impl(arrayList2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            arrayList = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(arrayList);
        if (th2 != null) {
            cm4.c("DMLocalDeviceManager", "getAboutDeviceInfoList fail " + th2.getMessage());
            arrayList = new ArrayList();
        }
        return (List) arrayList;
    }

    @Nullable
    public final AboutDeviceInfo p(@Nullable String mac) {
        Object obj = null;
        if (mac == null || mac.length() == 0) {
            cm4.c("DMLocalDeviceManager", "getAboutDeviceInfoListByMac mac is null or empty");
            return null;
        }
        for (Object obj2 : o()) {
            if (Intrinsics.areEqual(mac, ((AboutDeviceInfo) obj2).getDeviceUniqueId())) {
                obj = obj2;
                break;
            }
        }
        AboutDeviceInfo aboutDeviceInfo = (AboutDeviceInfo) obj;
        if (aboutDeviceInfo == null) {
            cm4.c("DMLocalDeviceManager", "getAboutDeviceInfoListByMac not find " + veb.a(mac));
        }
        return aboutDeviceInfo;
    }

    public final Object q(Continuation<? super List<y7j>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        lr5.f().subscribe(new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @NotNull
    public final synchronized List<UserDeviceInfo> r() {
        Object arrayList;
        try {
            Result.Companion companion = Result.Companion;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String ssoid = cn.c().getSsoid();
            List arrayList2 = (List) new Gson().fromJson(DMSpInstant.E(ssoid, BuildConfig.VERSION_NAME), new TypeToken<List<UserDeviceInfo>>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$getUserBoundDeviceList$1$1
            }.getType());
            if (arrayList2 != null) {
                Intrinsics.checkNotNullExpressionValue(arrayList2, "fromJson<MutableList<Use…erDeviceInfo>>() {}.type)");
                cm4.d("DMLocalDeviceManager", "getUserBoundDeviceList done " + arrayList2.size() + ",cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "," + kdb.d(ssoid));
            } else {
                arrayList2 = new ArrayList();
            }
            arrayList = Result.constructor-impl(arrayList2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            arrayList = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(arrayList);
        if (th2 != null) {
            cm4.c("DMLocalDeviceManager", "getUserBoundDeviceList fail " + th2.getMessage());
            arrayList = new ArrayList();
        }
        DeviceCommonFilter.INSTANCE.b((List) arrayList);
        return (List) arrayList;
    }

    @Nullable
    public final UserDeviceInfo s(@Nullable String mac) {
        Object obj = null;
        if (mac == null || mac.length() == 0) {
            cm4.c("DMLocalDeviceManager", "getUserBoundDeviceListByMac mac is null or empty");
            return null;
        }
        for (Object obj2 : r()) {
            if (UserDeviceInfo.isSameDevice((UserDeviceInfo) obj2, mac)) {
                obj = obj2;
                break;
            }
        }
        UserDeviceInfo userDeviceInfo = (UserDeviceInfo) obj;
        if (userDeviceInfo == null) {
            cm4.c("DMLocalDeviceManager", "getUserBoundDeviceListByMac not find " + veb.a(mac));
        }
        return userDeviceInfo;
    }

    public final synchronized void t(@NotNull final AboutDeviceInfo aboutDeviceInfo) {
        Object next;
        Intrinsics.checkNotNullParameter(aboutDeviceInfo, "aboutDeviceInfo");
        List<AboutDeviceInfo> listO = o();
        Iterator<T> it = listO.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(aboutDeviceInfo.getDeviceUniqueId(), ((AboutDeviceInfo) next).getDeviceUniqueId()));
        if (((AboutDeviceInfo) next) != null) {
            cm4.d("DMLocalDeviceManager", "saveAboutDeviceInfo find " + veb.a(aboutDeviceInfo.getDeviceUniqueId()) + ",update");
            final Function1<AboutDeviceInfo, Boolean> function1 = new Function1<AboutDeviceInfo, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$saveAboutDeviceInfo$2$1
                {
                    super(1);
                }

                @NotNull
                public final Boolean invoke(@NotNull AboutDeviceInfo aboutDeviceInfo2) {
                    Intrinsics.checkNotNullParameter(aboutDeviceInfo2, "it");
                    return Boolean.valueOf(Intrinsics.areEqual(aboutDeviceInfo.getDeviceUniqueId(), aboutDeviceInfo2.getDeviceUniqueId()));
                }
            };
            listO.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.am4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return DMLocalDeviceManager.u(function1, obj);
                }
            });
            listO.add(aboutDeviceInfo);
        } else {
            cm4.d("DMLocalDeviceManager", "saveAboutDeviceInfo not find " + veb.a(aboutDeviceInfo.getDeviceUniqueId()) + ",insert");
            listO.add(aboutDeviceInfo);
        }
        v(listO);
    }

    public final synchronized void v(@NotNull List<? extends AboutDeviceInfo> aboutDeviceInfoList) {
        Object obj;
        Intrinsics.checkNotNullParameter(aboutDeviceInfoList, "aboutDeviceInfoList");
        try {
            Result.Companion companion = Result.Companion;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String ssoid = cn.c().getSsoid();
            DMAboutDeviceSpInstant.U(ssoid, new Gson().toJson(aboutDeviceInfoList));
            cm4.d("DMLocalDeviceManager", "saveAboutDeviceInfoList done cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "," + kdb.d(ssoid));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            cm4.c("DMLocalDeviceManager", "saveAboutDeviceInfoList fail " + th2.getMessage());
        }
    }

    public final synchronized void w(@NotNull final UserDeviceInfo userDeviceInfo) {
        Object next;
        Intrinsics.checkNotNullParameter(userDeviceInfo, "userDeviceInfo");
        List<UserDeviceInfo> listR = r();
        Iterator<T> it = listR.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!UserDeviceInfo.isSameDevice((UserDeviceInfo) next, userDeviceInfo));
        if (((UserDeviceInfo) next) != null) {
            cm4.d("DMLocalDeviceManager", "saveUserBoundDevice find " + veb.a(userDeviceInfo.getMac()) + ",update");
            final Function1<UserDeviceInfo, Boolean> function1 = new Function1<UserDeviceInfo, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.processor.DMLocalDeviceManager$saveUserBoundDevice$2$1
                {
                    super(1);
                }

                @NotNull
                public final Boolean invoke(@NotNull UserDeviceInfo userDeviceInfo2) {
                    Intrinsics.checkNotNullParameter(userDeviceInfo2, "it");
                    return Boolean.valueOf(UserDeviceInfo.isSameDevice(userDeviceInfo2, userDeviceInfo));
                }
            };
            listR.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.zl4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return DMLocalDeviceManager.x(function1, obj);
                }
            });
            listR.add(userDeviceInfo);
        } else {
            cm4.d("DMLocalDeviceManager", "saveUserBoundDevice not find " + veb.a(userDeviceInfo.getMac()) + ",insert");
            listR.add(userDeviceInfo);
        }
        y(listR);
    }

    public final synchronized void y(@NotNull List<? extends UserDeviceInfo> userDeviceList) {
        Object obj;
        Intrinsics.checkNotNullParameter(userDeviceList, "userDeviceList");
        try {
            Result.Companion companion = Result.Companion;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String ssoid = cn.c().getSsoid();
            fdg fdgVar = DMSpInstant;
            Gson gson = new Gson();
            List listSortedWith = CollectionsKt.sortedWith(userDeviceList, new b());
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listSortedWith) {
                if (hashSet.add(((UserDeviceInfo) obj2).getMac())) {
                    arrayList.add(obj2);
                }
            }
            fdgVar.U(ssoid, gson.toJson(CollectionsKt.toMutableList(arrayList)));
            cm4.d("DMLocalDeviceManager", "saveUserDeviceList done cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + "," + kdb.d(ssoid));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            cm4.c("DMLocalDeviceManager", "saveUserDeviceList fail " + th2.getMessage());
        }
    }
}
