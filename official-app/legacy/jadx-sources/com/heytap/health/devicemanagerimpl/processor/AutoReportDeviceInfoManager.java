package com.heytap.health.devicemanagerimpl.processor;

import android.text.TextUtils;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicemanagerimpl.processor.cloundaccess.CloudAccoutDeviceProcessor;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.support.watchface.common.Constants;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bvf;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.d93;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hk5;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.mr3;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.rp5;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.ypf;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J$\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00010\u00010\u00140\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J$\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00010\u00010\u00140\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/heytap/health/devicemanagerimpl/processor/AutoReportDeviceInfoManager;", "", "Lcom/oplus/aiunit/vision/d93;", "event", "", "n", "", ClickApiEntity.TIME, LogFieldKey.LEVEL_KEY, "", MapSchema.FIELD_NAME_ENTRY, "f", MapSchema.FIELD_NAME_KEY, LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "Lcom/oplus/aiunit/vision/lbd;", "Lcom/oplus/aiunit/vision/ypf;", b2n.f, "deviceModelDetailRsp", "Lcom/heytap/health/network/core/BaseResponse;", "kotlin.jvm.PlatformType", "i", "j", b2n.g, "a", "J", "INTERVAL_TIME", "Lio/reactivex/rxjava3/disposables/a;", "b", "Lio/reactivex/rxjava3/disposables/a;", "reportDeviceInfoDisposable", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AutoReportDeviceInfoManager {

    @NotNull
    public static final AutoReportDeviceInfoManager INSTANCE = new AutoReportDeviceInfoManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static long INTERVAL_TIME = 86400000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static io.reactivex.rxjava3.disposables.a reportDeviceInfoDisposable;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "", "kotlin.jvm.PlatformType", "it", "a", "(Lcom/heytap/health/network/core/BaseResponse;)Lcom/heytap/health/network/core/BaseResponse;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T, R> implements d08 {
        public static final a<T, R> INSTANCE = new a<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseResponse<Object> apply(@NotNull BaseResponse<Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/bvf;", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "it", "a", "(Lcom/oplus/aiunit/vision/bvf;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<UserDeviceInfo> apply(@NotNull bvf<List<UserDeviceInfo>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.a(new ArrayList());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a.\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceList", "Lcom/oplus/aiunit/vision/jdd;", "", "", "kotlin.jvm.PlatformType", "a", "(Ljava/util/List;)Lcom/oplus/aiunit/vision/jdd;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutoReportDeviceInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReportDeviceInfoManager.kt\ncom/heytap/health/devicemanagerimpl/processor/AutoReportDeviceInfoManager$startCheckDeviceInfo$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n1855#2,2:233\n*S KotlinDebug\n*F\n+ 1 AutoReportDeviceInfoManager.kt\ncom/heytap/health/devicemanagerimpl/processor/AutoReportDeviceInfoManager$startCheckDeviceInfo$2\n*L\n78#1:233,2\n*E\n"})
    public static final class c<T, R> implements d08 {
        public static final c<T, R> INSTANCE = new c<>();

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/ypf;", "deviceModelDetailRsp", "Lcom/oplus/aiunit/vision/jdd;", "Lcom/heytap/health/network/core/BaseResponse;", "", "kotlin.jvm.PlatformType", "a", "(Lcom/oplus/aiunit/vision/ypf;)Lcom/oplus/aiunit/vision/jdd;"}, k = 3, mv = {1, 8, 0})
        public static final class a<T, R> implements d08 {
            public static final a<T, R> INSTANCE = new a<>();

            @Override // com.oplus.aiunit.vision.d08
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final jdd<? extends BaseResponse<Object>> apply(@NotNull ypf deviceModelDetailRsp) {
                Intrinsics.checkNotNullParameter(deviceModelDetailRsp, "deviceModelDetailRsp");
                return AutoReportDeviceInfoManager.INSTANCE.i(deviceModelDetailRsp);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lcom/heytap/health/network/core/BaseResponse;", "", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Throwable;)Lcom/heytap/health/network/core/BaseResponse;"}, k = 3, mv = {1, 8, 0})
        public static final class b<T, R> implements d08 {
            public static final b<T, R> INSTANCE = new b<>();

            @Override // com.oplus.aiunit.vision.d08
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BaseResponse<Object> apply(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BaseResponse<Object> baseResponse = new BaseResponse<>();
                baseResponse.setMessage(error.getMessage());
                return baseResponse;
            }
        }

        /* JADX INFO: renamed from: com.heytap.health.devicemanagerimpl.processor.AutoReportDeviceInfoManager$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u00002*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "kotlin.jvm.PlatformType", "it", "a", "([Ljava/lang/Object;)[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        public static final class C0366c<T, R> implements d08 {
            public static final C0366c<T, R> INSTANCE = new C0366c<>();

            @Override // com.oplus.aiunit.vision.d08
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] apply(@NotNull Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                StringBuilder sb = new StringBuilder();
                if (!(it.length == 0)) {
                    for (Object obj : it) {
                        if (obj instanceof BaseResponse) {
                            sb.append(((BaseResponse) obj).getMessage() + ";");
                        }
                    }
                }
                ml4.d("AutoReportDeviceInfo", "zip:" + ((Object) StringsKt__StringsKt.trim(sb)));
                return it;
            }
        }

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jdd<? extends Object[]> apply(@NotNull List<UserDeviceInfo> deviceList) {
            Intrinsics.checkNotNullParameter(deviceList, "deviceList");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = deviceList.iterator();
            while (it.hasNext()) {
                lbd<R> lbdVarT0 = AutoReportDeviceInfoManager.INSTANCE.g((UserDeviceInfo) it.next()).Q(a.INSTANCE).t0(b.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(lbdVarT0, "queryDeviceDetailByCloul…                        }");
                arrayList.add(lbdVarT0);
            }
            return lbd.q1(arrayList, C0366c.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/a;", "it", "", "a", "(Lio/reactivex/rxjava3/disposables/a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements o14 {
        public static final d<T> INSTANCE = new d<>();

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull io.reactivex.rxjava3.disposables.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AutoReportDeviceInfoManager.reportDeviceInfoDisposable = it;
        }
    }

    public final boolean e() {
        return System.currentTimeMillis() - f() > INTERVAL_TIME;
    }

    public final long f() {
        return v9g.w().B("device_fragment_spkty_new", 0L);
    }

    public final lbd<ypf> g(final UserDeviceInfo deviceInfo) {
        lbd lbdVarQ = CloudAccoutDeviceProcessor.s(deviceInfo.getModel(), deviceInfo.getDeviceType()).Q(new d08() { // from class: com.heytap.health.devicemanagerimpl.processor.AutoReportDeviceInfoManager$queryDeviceDetailByClould$1
            @Override // com.oplus.aiunit.vision.d08
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final jdd<? extends ypf> apply(@NotNull BaseResponse<hk5> object) {
                Intrinsics.checkNotNullParameter(object, "object");
                hk5 body = object.getBody();
                Intrinsics.checkNotNull(body);
                List<hk5.b> listD = body.d();
                if (listD == null || listD.isEmpty()) {
                    ml4.c("AutoReportDeviceInfo", "queryDeviceModelDetail SKU is null " + deviceInfo.getModel());
                    return lbd.O(new Throwable("queryDeviceModelDetail SKU is null " + deviceInfo.getModel()));
                }
                mr3 mr3VarD = lc5.d(deviceInfo.getModel());
                final UserDeviceInfo userDeviceInfo = deviceInfo;
                boolean zBooleanValue = ((Boolean) mr3VarD.a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.processor.AutoReportDeviceInfoManager$queryDeviceDetailByClould$1$fixReport$1
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull DeviceModel applyMode) {
                        Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                        return Boolean.valueOf(applyMode.M9() && !TextUtils.equals(userDeviceInfo.getDeviceUniqueId(), userDeviceInfo.getMac()));
                    }
                })).booleanValue();
                ml4.d("AutoReportDeviceInfo", "fix report " + zBooleanValue + ",mac:" + gdb.a(deviceInfo.getMac()));
                ypf ypfVar = new ypf();
                final UserDeviceInfo userDeviceInfo2 = deviceInfo;
                ypfVar.D(userDeviceInfo2.getDeviceName());
                ypfVar.F(userDeviceInfo2.getDeviceSn());
                ypfVar.G(String.valueOf(userDeviceInfo2.getDeviceType()));
                ypfVar.H(userDeviceInfo2.getDeviceUniqueId());
                ypfVar.I(rp5.a(userDeviceInfo2.getFirmwareVersion(), "unknown"));
                ypfVar.K(rp5.a(userDeviceInfo2.getHardwareVersion(), "unknown"));
                ypfVar.Q(userDeviceInfo2.getOtaVersion());
                ypfVar.N(userDeviceInfo2.getDeviceUniqueId());
                ypfVar.y((String) lc5.d(userDeviceInfo2.getModel()).a(new Function1<DeviceModel, String>() { // from class: com.heytap.health.devicemanagerimpl.processor.AutoReportDeviceInfoManager$queryDeviceDetailByClould$1$deviceInfoReq$1$1
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public final String invoke(@NotNull DeviceModel applyMode) {
                        Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                        return applyMode.X8() ? userDeviceInfo2.getMac() : userDeviceInfo2.getBleMac();
                    }
                }));
                ypfVar.P(userDeviceInfo2.getModel());
                ypfVar.O(userDeviceInfo2.getManufacturer());
                ypfVar.z(userDeviceInfo2.getBleSecretMetadata());
                ypfVar.R(userDeviceInfo2.getProjectId());
                ypfVar.B(userDeviceInfo2.getBoardId());
                ypfVar.V(userDeviceInfo2.getSubDeviceType());
                ypfVar.J(rp5.a(userDeviceInfo2.getGuid(), ""));
                ypfVar.E(rp5.a(userDeviceInfo2.getDeviceOsVersion(), Constants.HeyBuildVersion.V1_0));
                String strA = body.a();
                if (!((Boolean) lc5.d(ypfVar.r()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.processor.AutoReportDeviceInfoManager$queryDeviceDetailByClould$1.1
                    @Override // p010kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull DeviceModel applyMode) {
                        Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                        return Boolean.valueOf(applyMode.k0());
                    }
                })).booleanValue()) {
                    ml4.a("AutoReportDeviceInfo", "[getBindDeviceInfoFromCloud] deviceName: " + strA);
                    ypfVar.D(strA);
                }
                int size = listD.size();
                hk5.b bVar = null;
                for (int i = 0; i < size; i++) {
                    hk5.b bVar2 = listD.get(i);
                    if (TextUtils.equals(bVar2.d(), deviceInfo.getSkuCode())) {
                        ml4.a("AutoReportDeviceInfo", "set skuDesc:" + bVar2.e() + ", skuCode:" + bVar2.d());
                        String strE = bVar2.e();
                        if (strE == null) {
                            strE = "";
                        }
                        ypfVar.S(strE);
                        String strD = bVar2.d();
                        if (strD == null) {
                            strD = "";
                        }
                        ypfVar.T(strD);
                        String strB = bVar2.b();
                        if (strB == null) {
                            strB = "";
                        }
                        ypfVar.C(strB);
                        String strF = bVar2.f();
                        if (strF == null) {
                            strF = "";
                        }
                        ypfVar.U(strF);
                        break;
                    }
                    if (bVar2.g()) {
                        bVar = bVar2;
                    }
                }
                if (bVar != null && TextUtils.isEmpty(ypfVar.u())) {
                    ml4.a("AutoReportDeviceInfo", "set defuelt skuDesc:" + bVar.e() + ", skuCode:" + bVar.d());
                    String strE2 = bVar.e();
                    if (strE2 == null) {
                        strE2 = "";
                    }
                    ypfVar.S(strE2);
                    String strD2 = bVar.d();
                    if (strD2 == null) {
                        strD2 = "";
                    }
                    ypfVar.T(strD2);
                    String strB2 = bVar.b();
                    if (strB2 == null) {
                        strB2 = "";
                    }
                    ypfVar.C(strB2);
                    String strF2 = bVar.f();
                    ypfVar.U(strF2 != null ? strF2 : "");
                }
                if (!TextUtils.equals(deviceInfo.getDeviceName(), ypfVar.f()) || !TextUtils.equals(deviceInfo.getDeviceMarketName(), ypfVar.e()) || !TextUtils.equals(deviceInfo.getSku(), ypfVar.u()) || !TextUtils.equals(deviceInfo.getSkuMarketName(), ypfVar.w()) || zBooleanValue) {
                    return lbd.h0(ypfVar);
                }
                AutoReportDeviceInfoManager.INSTANCE.k();
                return lbd.O(new Throwable("all params is equals,mac:" + gdb.a(deviceInfo.getMac()) + ",model:" + deviceInfo.getModel()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(lbdVarQ, "deviceInfo: UserDeviceIn…iceInfoReq)\n            }");
        return lbdVarQ;
    }

    public final lbd<BaseResponse<Object>> h(ypf deviceModelDetailRsp) {
        lbd lbdVarJ0 = CloudAccoutDeviceProcessor.A(deviceModelDetailRsp, false).j0(a.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarJ0, "reportDeviceInfoToObserv…         it\n            }");
        return lbdVarJ0;
    }

    public final lbd<BaseResponse<Object>> i(ypf deviceModelDetailRsp) {
        AutoReportDeviceInfoManager autoReportDeviceInfoManager = INSTANCE;
        autoReportDeviceInfoManager.j(deviceModelDetailRsp);
        return autoReportDeviceInfoManager.h(deviceModelDetailRsp);
    }

    public final void j(ypf deviceModelDetailRsp) {
        DMLocalDeviceManager dMLocalDeviceManager = DMLocalDeviceManager.INSTANCE;
        UserDeviceInfo userDeviceInfoS = dMLocalDeviceManager.s(deviceModelDetailRsp.j());
        if (userDeviceInfoS != null) {
            userDeviceInfoS.setSku(deviceModelDetailRsp.u());
            userDeviceInfoS.setSkuMarketName(deviceModelDetailRsp.w());
            userDeviceInfoS.setDeviceName(deviceModelDetailRsp.f());
            userDeviceInfoS.setDeviceMarketName(deviceModelDetailRsp.e());
            dMLocalDeviceManager.w(userDeviceInfoS);
            gl4.businessApi.k(false);
        }
    }

    public final void k() {
        v9g.w().T("device_fragment_spkty_new", System.currentTimeMillis());
    }

    public final void l(long time) {
        INTERVAL_TIME = time;
    }

    public final void m() {
        io.reactivex.rxjava3.disposables.a aVar;
        io.reactivex.rxjava3.disposables.a aVar2 = reportDeviceInfoDisposable;
        boolean z = false;
        if (aVar2 != null && !aVar2.isDisposed()) {
            z = true;
        }
        if (z && (aVar = reportDeviceInfoDisposable) != null) {
            aVar.dispose();
        }
        DMLocalDeviceManager.INSTANCE.h().g().j0(b.INSTANCE).Q(c.INSTANCE).K(d.INSTANCE).c();
    }

    public final void n(@NotNull d93 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ml4.a("AutoReportDeviceInfo", "curr event " + event);
        if (!Intrinsics.areEqual(event, d93.a.INSTANCE) || e()) {
            m();
            return;
        }
        ml4.a("AutoReportDeviceInfo", "triggerEvent filter,last report time:" + f());
    }
}
