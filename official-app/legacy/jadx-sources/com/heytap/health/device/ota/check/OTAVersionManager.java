package com.heytap.health.device.ota.check;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.heytap.health.device.ota.OTAUpdateTransportApi;
import com.heytap.health.device.ota.bean.OTASpBean;
import com.heytap.health.device.ota.bean.OTAVersion;
import com.heytap.health.device.ota.cloud.OppoOtaUtils;
import com.heytap.health.device.ota.cloud.model.RespsInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.heytap.log.config.StdDtoConst;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.OTAVersionParam;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ard;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.d6d;
import com.oplus.aiunit.vision.e6d;
import com.oplus.aiunit.vision.j6d;
import com.oplus.aiunit.vision.kta;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.r8d;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.sbe;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.vsd;
import com.oplus.aiunit.vision.yjf;
import com.oplus.aiunit.vision.ysd;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0011H\u0007J\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\nH\u0002J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\fH\u0002R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001c¨\u0006%"}, d2 = {"Lcom/heytap/health/device/ota/check/OTAVersionManager;", "", "Lcom/heytap/health/protocol/dm/DMProto$ConnectDeviceInfo;", "deviceInfo", "Lcom/oplus/aiunit/vision/s8d;", RnConstant.KEY_INIT_OPTIONS, "Lcom/oplus/aiunit/vision/r8d;", "callback", "", MapSchema.FIELD_NAME_KEY, "", "macAddress", "Lcom/heytap/health/device/ota/bean/OTAVersion;", HttpConst.OTA_VERSION, "f", b2n.g, "language", "Lcom/oplus/aiunit/vision/e6d;", "i", "j", "targetLanguage", "Lcom/google/gson/JsonObject;", "d", b2n.f, "version", MapSchema.FIELD_NAME_ENTRY, "Landroidx/collection/ArrayMap;", "a", "Landroidx/collection/ArrayMap;", "mVersionMap", "", "b", "mTimestampMap", "c", "mTransVersionMap", "<init>", "()V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOTAVersionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTAVersionManager.kt\ncom/heytap/health/device/ota/check/OTAVersionManager\n+ 2 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n*L\n1#1,274:1\n22#2:275\n22#2:276\n22#2:277\n*S KotlinDebug\n*F\n+ 1 OTAVersionManager.kt\ncom/heytap/health/device/ota/check/OTAVersionManager\n*L\n47#1:275\n48#1:276\n49#1:277\n*E\n"})
public final class OTAVersionManager {

    @NotNull
    public static final OTAVersionManager INSTANCE = new OTAVersionManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ArrayMap<String, OTAVersion> mVersionMap = new ArrayMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ArrayMap<String, Long> mTimestampMap = new ArrayMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ArrayMap<String, String> mTransVersionMap = new ArrayMap<>();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/gson/JsonObject;", "originJsonObject", "Lcom/heytap/health/device/ota/cloud/model/RespsInfo;", "a", "(Lcom/google/gson/JsonObject;)Lcom/heytap/health/device/ota/cloud/model/RespsInfo;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T, R> implements d08 {
        public static final a<T, R> INSTANCE = new a<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RespsInfo apply(@Nullable JsonObject jsonObject) {
            return OppoOtaUtils.c(jsonObject);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/health/device/ota/cloud/model/RespsInfo;", "respsInfo", "Lcom/oplus/aiunit/vision/d6d;", "Lorg/jetbrains/annotations/NotNull;", "a", "(Lcom/heytap/health/device/ota/cloud/model/RespsInfo;)Lcom/oplus/aiunit/vision/d6d;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d6d apply(@Nullable RespsInfo respsInfo) {
            return OppoOtaUtils.a(respsInfo);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/d6d;", "Lorg/jetbrains/annotations/NotNull;", "otaDescription", "", "a", "(Lcom/oplus/aiunit/vision/d6d;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements o14 {
        public final /* synthetic */ e6d i;

        public c(e6d e6dVar) {
            this.i = e6dVar;
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull d6d otaDescription) {
            Intrinsics.checkNotNullParameter(otaDescription, "otaDescription");
            this.i.a(otaDescription);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements o14 {
        public final /* synthetic */ e6d i;

        public d(e6d e6dVar) {
            this.i = e6dVar;
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a7b.b("OTAVersionManager", "request description error: " + throwable.getMessage());
            this.i.a(null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/gson/JsonObject;", "originJsonObject", "Lcom/heytap/health/device/ota/cloud/model/RespsInfo;", "a", "(Lcom/google/gson/JsonObject;)Lcom/heytap/health/device/ota/cloud/model/RespsInfo;"}, k = 3, mv = {1, 8, 0})
    public static final class e<T, R> implements d08 {
        public static final e<T, R> INSTANCE = new e<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RespsInfo apply(@NotNull JsonObject originJsonObject) {
            Intrinsics.checkNotNullParameter(originJsonObject, "originJsonObject");
            return OppoOtaUtils.c(originJsonObject);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/health/device/ota/cloud/model/RespsInfo;", "respsInfo", "Lcom/heytap/health/device/ota/bean/OTAVersion;", "a", "(Lcom/heytap/health/device/ota/cloud/model/RespsInfo;)Lcom/heytap/health/device/ota/bean/OTAVersion;"}, k = 3, mv = {1, 8, 0})
    public static final class f<T, R> implements d08 {
        public static final f<T, R> INSTANCE = new f<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OTAVersion apply(@NotNull RespsInfo respsInfo) {
            Intrinsics.checkNotNullParameter(respsInfo, "respsInfo");
            return OppoOtaUtils.b(respsInfo);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/health/device/ota/bean/OTAVersion;", HttpConst.OTA_VERSION, "", "a", "(Lcom/heytap/health/device/ota/bean/OTAVersion;)V"}, k = 3, mv = {1, 8, 0})
    public static final class g<T> implements o14 {
        public final /* synthetic */ DMProto$ConnectDeviceInfo i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ r8d f3937j;
        public final /* synthetic */ OTAVersionParam k;

        public g(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo, r8d r8dVar, OTAVersionParam oTAVersionParam) {
            this.i = dMProto$ConnectDeviceInfo;
            this.f3937j = r8dVar;
            this.k = oTAVersionParam;
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull OTAVersion otaVersion) {
            Intrinsics.checkNotNullParameter(otaVersion, "otaVersion");
            OTAVersionManager.mTimestampMap.put(this.i.getDeviceOtaVersion(), Long.valueOf(System.currentTimeMillis()));
            if (otaVersion.resultCode == 0) {
                a7b.f("OTAVersionManager", "requestVersion fail with msg: " + otaVersion.msg);
                yjf.c().g(this.i.getDeviceBtMac());
                OTAVersionManager.mVersionMap.put(this.i.getDeviceOtaVersion(), null);
                this.f3937j.a(null);
                return;
            }
            OTAVersionManager.mVersionMap.put(this.i.getDeviceOtaVersion(), otaVersion);
            OTAVersionManager.INSTANCE.g(this.i, this.k, otaVersion);
            this.f3937j.a(otaVersion);
            if (vsd.a(this.i.getDeviceBtMac()).e5()) {
                OTADeviceQueryManager oTADeviceQueryManager = OTADeviceQueryManager.INSTANCE;
                String deviceBtMac = this.i.getDeviceBtMac();
                Intrinsics.checkNotNullExpressionValue(deviceBtMac, "deviceInfo.deviceBtMac");
                String strB = kta.b();
                Intrinsics.checkNotNullExpressionValue(strB, "getLangAndCountryUseHyphen()");
                oTADeviceQueryManager.b(deviceBtMac, strB);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class h<T> implements o14 {
        public final /* synthetic */ DMProto$ConnectDeviceInfo i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ r8d f3938j;

        public h(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo, r8d r8dVar) {
            this.i = dMProto$ConnectDeviceInfo;
            this.f3938j = r8dVar;
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a7b.b("OTAVersionManager", "request ota error: " + throwable.getMessage());
            yjf.c().g(this.i.getDeviceBtMac());
            if (!(throwable instanceof HttpException) || 304 != ((HttpException) throwable).code()) {
                this.f3938j.b(throwable);
                return;
            }
            OTAVersionManager.mTimestampMap.put(this.i.getDeviceOtaVersion(), Long.valueOf(System.currentTimeMillis()));
            OTAVersionManager.mVersionMap.put(this.i.getDeviceOtaVersion(), null);
            this.f3938j.a(null);
        }
    }

    @JvmStatic
    public static final void f(@NotNull String macAddress, @NotNull OTAVersion otaVersion) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(otaVersion, "otaVersion");
        StringBuilder sb = new StringBuilder();
        sb.append("[onTransferSuccess] --> ");
        sb.append(otaVersion);
        mTransVersionMap.put(macAddress, otaVersion.otaVersion);
    }

    @JvmStatic
    public static final void h(@NotNull String macAddress) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        mTransVersionMap.remove(macAddress);
    }

    @JvmStatic
    @SuppressLint({"CheckResult"})
    public static final void i(@NotNull DMProto$ConnectDeviceInfo deviceInfo, @NotNull String language, @NotNull e6d callback) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("version", "3");
        jsonObject.addProperty(HttpConst.OTA_VERSION, deviceInfo.getDeviceOtaVersion());
        String deviceUniqueId = vsd.a(deviceInfo.getDeviceBtMac()).getDeviceUniqueId();
        if (TextUtils.isEmpty(deviceUniqueId)) {
            a7b.m("OTAVersionManager", "device unique id is empty");
            deviceUniqueId = "";
        }
        jsonObject.addProperty("imei", deviceUniqueId);
        jsonObject.addProperty("language", language);
        jsonObject.addProperty("mode", Integer.valueOf(OppoOtaUtils.g()));
        jsonObject.addProperty(HttpConst.TRACK_REGION, "");
        jsonObject.addProperty(HttpConst.U_REGION, "");
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("otaPkgType", "1");
        jsonObject2.addProperty("version", deviceInfo.getDeviceOtaVersion());
        jsonArray.add(jsonObject2);
        jsonObject.add("modules", jsonArray);
        StringBuilder sb = new StringBuilder();
        sb.append("requestDescription jsonObject: ");
        sb.append(jsonObject);
        JsonObject jsonObjectD = OppoOtaUtils.d(jsonObject);
        Intrinsics.checkNotNullExpressionValue(jsonObjectD, "createEncryptJsonObject(jsonObject)");
        ((ard) ysd.b(ard.class)).c(jsonObjectD).j0(a.INSTANCE).j0(b.INSTANCE).L0(su8.c()).b(new c(callback), new d(callback));
    }

    @JvmStatic
    @SuppressLint({"CheckResult"})
    public static final void k(@NotNull DMProto$ConnectDeviceInfo deviceInfo, @NotNull OTAVersionParam param, @NotNull r8d callback) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = mTransVersionMap.get(deviceInfo.getDeviceBtMac());
        OTAVersion oTAVersion = null;
        if (str != null && !TextUtils.equals(str, deviceInfo.getDeviceOtaVersion())) {
            a7b.f("OTAVersionManager", "not complete after transfer, return null");
            callback.a(null);
            return;
        }
        Long l2 = mTimestampMap.get(deviceInfo.getDeviceOtaVersion());
        if (l2 == null || param.getForceRefresh() || System.currentTimeMillis() - l2.longValue() >= 300000) {
            JsonObject jsonObjectD = INSTANCE.d(deviceInfo, param.getLanguage());
            StringBuilder sb = new StringBuilder();
            sb.append("requestServerVersion jsonObject: ");
            sb.append(jsonObjectD);
            JsonObject jsonObjectD2 = OppoOtaUtils.d(jsonObjectD);
            Intrinsics.checkNotNullExpressionValue(jsonObjectD2, "createEncryptJsonObject(jsonObject)");
            ((ard) ysd.b(ard.class)).b(jsonObjectD2).j0(e.INSTANCE).j0(f.INSTANCE).L0(su8.c()).b(new g(deviceInfo, callback, param), new h(deviceInfo, callback));
            return;
        }
        ArrayMap<String, OTAVersion> arrayMap = mVersionMap;
        OTAVersion oTAVersion2 = arrayMap.get(deviceInfo.getDeviceOtaVersion());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("return cache version: ");
        sb2.append(oTAVersion2);
        OTAVersion it = arrayMap.get(deviceInfo.getDeviceOtaVersion());
        if (it != null) {
            OTAVersionManager oTAVersionManager = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            oTAVersionManager.g(deviceInfo, param, it);
            oTAVersion = it;
        }
        callback.a(oTAVersion);
    }

    public final JsonObject d(DMProto$ConnectDeviceInfo deviceInfo, String targetLanguage) {
        String deviceOtaVersion;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("version", "3");
        String strE = ((Boolean) lc5.d(deviceInfo.getDeviceModel()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.device.ota.check.OTAVersionManager$buildRequestObject$productName$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Boolean.valueOf(applyMode.A9());
            }
        })).booleanValue() ? OppoOtaUtils.e(deviceInfo.getDeviceSku(), deviceInfo.getDeviceModel()) : deviceInfo.getDeviceModel();
        String deviceSoftVersion = deviceInfo.getDeviceSoftVersion();
        if (((Boolean) lc5.d(deviceInfo.getDeviceModel()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.device.ota.check.OTAVersionManager$buildRequestObject$deviceOtaVersion$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Boolean.valueOf(applyMode.A9());
            }
        })).booleanValue()) {
            deviceOtaVersion = strE + "_" + deviceInfo.getDeviceHardVersion() + "." + deviceSoftVersion;
        } else {
            deviceOtaVersion = deviceInfo.getDeviceOtaVersion();
        }
        String deviceUniqueId = vsd.a(deviceInfo.getDeviceBtMac()).getDeviceUniqueId();
        if (deviceUniqueId == null || deviceUniqueId.length() == 0) {
            a7b.m("OTAVersionManager", "device unique id is empty");
        }
        jsonObject.addProperty("otaPrefix", strE);
        jsonObject.addProperty(sbe.PAY_SDK_PRODUCTNAME, strE);
        jsonObject.addProperty(HttpConst.OTA_VERSION, deviceOtaVersion);
        jsonObject.addProperty("romVersion", deviceSoftVersion);
        if (deviceUniqueId == null) {
            deviceUniqueId = "";
        }
        jsonObject.addProperty("imei", deviceUniqueId);
        jsonObject.addProperty("mode", Integer.valueOf(OppoOtaUtils.g()));
        jsonObject.addProperty("language", targetLanguage);
        jsonObject.addProperty(ClickApiEntity.TIME, Long.valueOf(System.currentTimeMillis()));
        jsonObject.addProperty("androidVersion", "unknown");
        jsonObject.addProperty(HttpConst.COLOR_OS_VERSION, "unknown");
        jsonObject.addProperty(StdDtoConst.REGISTRATIONID_KEY, "unknown");
        jsonObject.addProperty("type", "0");
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("otaPkgType", "1");
        jsonObject2.addProperty("version", deviceOtaVersion);
        jsonArray.add(jsonObject2);
        jsonObject.add("modules", jsonArray);
        return jsonObject;
    }

    public final void e(DMProto$ConnectDeviceInfo deviceInfo, OTAVersion version) {
        if (OTASpBean.newItem(deviceInfo.getDeviceBtMac()).isAutoDownload()) {
            if (Intrinsics.areEqual(Boolean.TRUE, rpc.b(b78.a()))) {
                a7b.f("OTAVersionManager", "is mobile");
                return;
            }
            if (j6d.d(version.firmwareUrl) != null) {
                a7b.f("OTAVersionManager", "file has download");
                return;
            }
            OTAUpdateTransportApi.Companion companion = OTAUpdateTransportApi.INSTANCE;
            String deviceBtMac = deviceInfo.getDeviceBtMac();
            Intrinsics.checkNotNullExpressionValue(deviceBtMac, "deviceInfo.deviceBtMac");
            companion.h(deviceBtMac, version, true, null);
        }
    }

    public final void g(DMProto$ConnectDeviceInfo deviceInfo, OTAVersionParam param, OTAVersion otaVersion) {
        yjf.c().b(deviceInfo.getDeviceBtMac());
        if (param.getAutoDownload()) {
            e(deviceInfo, otaVersion);
        }
    }

    public final void j(@NotNull DMProto$ConnectDeviceInfo deviceInfo, @NotNull String language, @NotNull r8d callback) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(callback, "callback");
        k(deviceInfo, new OTAVersionParam(false, false, false, language, 7, null), callback);
    }
}
