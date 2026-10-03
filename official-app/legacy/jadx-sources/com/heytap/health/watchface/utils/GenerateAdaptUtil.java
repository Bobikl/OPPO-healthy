package com.heytap.health.watchface.utils;

import android.text.TextUtils;
import com.heytap.health.base.R$string;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import com.heytap.health.device_manager_base.ScreenType;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$ScreenType;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.adaptation.common.WfListInfoCache;
import com.oplus.aiunit.vision.ExtraInfo;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.i11;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.ntl;
import com.oplus.aiunit.vision.y0k;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/watchface/utils/GenerateAdaptUtil;", "", "", "mac", "", b2n.f, MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/watch/watchface/proto/Proto$DeviceInfo;", "d", "c", "", "Lcom/heytap/health/watchface/adaptation/base/BaseWatchFaceBean;", "f", "a", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "activeDevice", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class GenerateAdaptUtil {

    @NotNull
    public static final GenerateAdaptUtil INSTANCE = new GenerateAdaptUtil();

    @NotNull
    public static final String TAG = "DeviceUtil";

    public final boolean a(@Nullable String mac) {
        if (TextUtils.isEmpty(mac)) {
            ltl.i("DeviceUtil", "checkDeviceStatus mac is empty.");
            return false;
        }
        if (gl4.managerApi.isStubModule()) {
            y0k.i(b78.a().getString(lc5.c(mac).a(GenerateAdaptUtil$checkDeviceStatus$1.INSTANCE) == DevicePageType.ON_STUB_MODULE ? R$string.lib_base_disconnect_on_stub_module : R$string.lib_base_on_low_smart_module));
            return false;
        }
        if (g(mac)) {
            return true;
        }
        y0k.i(b78.a().getString(R$string.lib_base_device_disconnected_retry_later));
        return false;
    }

    public final Proto$DeviceInfo b(UserDeviceInfo activeDevice) {
        ltl.a("DeviceUtil", "getCurrentDeviceInfo start createDeviceInfoByDM");
        ExtraInfo extraInfo = activeDevice.getExtraInfo();
        Proto$DeviceInfo.Builder deviceUniqueId = Proto$DeviceInfo.newBuilder().setScreenType(extraInfo.getScreenType() == ScreenType.SCREEN_TYPE_ROUND ? Proto$ScreenType.SCREEN_TYPE_OVAL : Proto$ScreenType.SCREEN_TYPE_SQUARE).setDeviceMac(activeDevice.getMac()).setDeviceUniqueId(activeDevice.getDeviceUniqueId());
        String skuCode = activeDevice.getSkuCode();
        if (skuCode == null) {
            skuCode = "";
        }
        return deviceUniqueId.setSku(skuCode).setFirmwareVersion(activeDevice.getOtaVersion()).setModel(activeDevice.getModel()).setSecretKey("key").setDeviceCategory(extraInfo.getH5DeviceType()).setScreenHeight(extraInfo.getHeightPixel()).setScreenRadius(extraInfo.getScreenRadius()).setScreenWidth(extraInfo.getWidthPixel()).build();
    }

    @Nullable
    public final Proto$DeviceInfo c() {
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        if (userDeviceInfoJ != null) {
            return b(userDeviceInfoJ);
        }
        ltl.d("DeviceUtil", "getCurrentDeviceInfo failed， device not connect");
        return null;
    }

    @Nullable
    public final Proto$DeviceInfo d() {
        Proto$DeviceInfo proto$DeviceInfoH;
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        if (userDeviceInfoJ == null) {
            ltl.d("DeviceUtil", "getCurrentDeviceInfo failed device not connect.");
            return null;
        }
        if (userDeviceInfoJ.getExtraInfo() == null) {
            ltl.d("DeviceUtil", "getCurrentDeviceInfo failed config not support.");
            return null;
        }
        i11 i11VarJ = ntl.m().j(userDeviceInfoJ.getMac());
        return (i11VarJ == null || (proto$DeviceInfoH = i11VarJ.h()) == null) ? b(userDeviceInfoJ) : proto$DeviceInfoH;
    }

    @Nullable
    public final String e() {
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        if (userDeviceInfoJ != null) {
            return userDeviceInfoJ.getMac();
        }
        ltl.d("DeviceUtil", "getCurrentDeviceMac failed， device not connect");
        return null;
    }

    @Nullable
    public final List<BaseWatchFaceBean> f(@NotNull String mac) {
        List<BaseWatchFaceBean> listK;
        Intrinsics.checkNotNullParameter(mac, "mac");
        i11 i11VarJ = ntl.m().j(mac);
        return (i11VarJ == null || (listK = i11VarJ.k()) == null) ? WfListInfoCache.b().d(mac) : listK;
    }

    public final boolean g(@Nullable String mac) {
        return gl4.managerApi.isConnected(mac);
    }
}
