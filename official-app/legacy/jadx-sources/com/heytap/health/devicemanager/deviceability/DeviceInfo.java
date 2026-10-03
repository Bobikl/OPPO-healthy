package com.heytap.health.devicemanager.deviceability;

import com.heytap.health.base.switchManager.CKV;
import com.heytap.health.base.switchManager.SwitchStateUtil;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.device_manager_base.b;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.rp5;
import com.oplus.aiunit.vision.ugl;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b)\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0006\u0010\u0014\u001a\u00020\u0003J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0003R$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", "Lcom/heytap/health/device_manager_base/b;", "", "Qa", "Na", "Oa", "Pa", "Va", "Za", "Ya", "Xa", "Ra", "Wa", "", "version", "Sa", "", "tag", "Ta", "bb", "C0", "Ua", "Lcom/oplus/aiunit/vision/ra5$c;", "La", oea.CALLBACK, "ab", "db", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "x", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "Ka", "()Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "setDeviceInfo", "(Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;)V", "deviceInfo", "y", "Lkotlin/Lazy;", "Ma", "()Ljava/lang/String;", "mac", "<init>", "DeviceInfoInner", "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfo.kt\ncom/heytap/health/devicemanager/deviceability/DeviceInfo\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n37#2,5:223\n37#2,2:228\n40#2,2:231\n37#2,5:233\n37#2,5:238\n37#2,5:243\n37#2,5:248\n37#2,5:253\n37#2,5:258\n37#2,5:263\n37#2,5:268\n37#2,5:273\n37#2,5:278\n37#2,5:283\n37#2,5:288\n37#2,5:293\n37#2,5:298\n37#2,5:303\n37#2,5:308\n37#2,5:313\n37#2,5:318\n1#3:230\n*S KotlinDebug\n*F\n+ 1 DeviceInfo.kt\ncom/heytap/health/devicemanager/deviceability/DeviceInfo\n*L\n38#1:223,5\n42#1:228,2\n42#1:231,2\n46#1:233,5\n50#1:238,5\n54#1:243,5\n58#1:248,5\n62#1:253,5\n66#1:258,5\n72#1:263,5\n81#1:268,5\n89#1:273,5\n93#1:278,5\n107#1:283,5\n115#1:288,5\n127#1:293,5\n138#1:298,5\n154#1:303,5\n162#1:308,5\n179#1:313,5\n183#1:318,5\n*E\n"})
public class DeviceInfo extends DeviceModel implements b {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public UserDeviceInfo deviceInfo;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy mac;

    public DeviceInfo(@Nullable UserDeviceInfo userDeviceInfo) {
        super(userDeviceInfo != null ? userDeviceInfo.getModel() : null);
        this.deviceInfo = userDeviceInfo;
        this.mac = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.devicemanager.deviceability.DeviceInfo$mac$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                UserDeviceInfo deviceInfo = this.this$0.getDeviceInfo();
                if (deviceInfo != null) {
                    return deviceInfo.getMac();
                }
                return null;
            }
        });
    }

    @Override // com.heytap.health.device_manager_base.b
    public boolean C0() {
        return Intrinsics.areEqual(La(), ra5.c.b.INSTANCE);
    }

    @Nullable
    /* JADX INFO: renamed from: Ka, reason: from getter */
    public final UserDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final ra5.c La() {
        return gl4.managerApi.f(Ma());
    }

    @Nullable
    public final String Ma() {
        return (String) this.mac.getValue();
    }

    public boolean Na() {
        UserDeviceInfo userDeviceInfo = this.deviceInfo;
        if (userDeviceInfo != null) {
            return userDeviceInfo.isConnect();
        }
        return false;
    }

    public boolean Oa() {
        UserDeviceInfo userDeviceInfo = this.deviceInfo;
        if (userDeviceInfo != null) {
            return userDeviceInfo.isConnectBLE();
        }
        return false;
    }

    public boolean Pa() {
        UserDeviceInfo userDeviceInfo = this.deviceInfo;
        if (userDeviceInfo != null) {
            return userDeviceInfo.isConnectBT();
        }
        return false;
    }

    public boolean Qa() {
        return !Na();
    }

    public boolean Ra() {
        UserDeviceInfo userDeviceInfo = this.deviceInfo;
        String str = "";
        if (userDeviceInfo != null) {
            VirtualAccountData virtualAccountData = userDeviceInfo.getVirtualAccountData();
            String virtualSsoid = virtualAccountData != null ? virtualAccountData.getVirtualSsoid() : null;
            if (virtualSsoid == null) {
                ml4.c("InfoAbility", "isFamilyDevice virtualAccountData is null");
            } else {
                str = virtualSsoid;
            }
        } else {
            ml4.c("InfoAbility", "isFamilyDevice deviceInfo is null");
        }
        return str.length() > 0;
    }

    public boolean Sa(int version) {
        UserDeviceInfo userDeviceInfo = this.deviceInfo;
        if (userDeviceInfo != null) {
            return ugl.e(userDeviceInfo.getFirmwareVersion(), version);
        }
        return false;
    }

    public boolean Ta(@NotNull String tag, int version) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        UserDeviceInfo userDeviceInfo = this.deviceInfo;
        if (userDeviceInfo != null) {
            return ugl.f(userDeviceInfo.getFirmwareVersion(), tag, version);
        }
        return false;
    }

    public boolean Ua() {
        return Intrinsics.areEqual(La(), ra5.c.C0924c.INSTANCE);
    }

    public boolean Va() {
        if (!M9()) {
            return false;
        }
        UserDeviceInfo userDeviceInfo = this.deviceInfo;
        return userDeviceInfo != null && userDeviceInfo.getSubDeviceType() == 1;
    }

    public boolean Wa() {
        if (O9()) {
            UserDeviceInfo userDeviceInfo = this.deviceInfo;
            if (rp5.h(userDeviceInfo != null ? userDeviceInfo.getDeviceOsVersion() : null)) {
                return true;
            }
        }
        return false;
    }

    public boolean Xa() {
        return K9() && Pa();
    }

    public boolean Ya() {
        return K9() && Oa();
    }

    public boolean Za() {
        return Va() || R9() || V9() || Z9() || (K9() && oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE)) || (I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
    }

    public final boolean ab() {
        return !Ra() && (ca() || (aa() && Sa(240)));
    }

    public final boolean bb() {
        if (!K9() || !oa(DeviceConstants.BaseDevice.AbstractC0341b.j.INSTANCE)) {
            return false;
        }
        if (T9()) {
            return Sa(77);
        }
        return true;
    }

    public boolean cb() {
        if (!K9() || !oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE)) {
            return I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE);
        }
        if (ja()) {
            return Sa(200);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1  */
    public final boolean db() {
        int i;
        String value;
        int i2;
        String value2;
        int i3;
        String value3;
        int i4;
        String value4;
        if (Ua() || !ilj.B()) {
            return false;
        }
        if (((!K9() || !oa(DeviceConstants.BaseDevice.AbstractC0341b.f.INSTANCE)) && (!I9() || !oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE))) || !Ta("C", 0)) {
            List<CKV> listB = SwitchStateUtil.b();
            Object obj = null;
            if (ea()) {
                if (listB != null) {
                    for (Object obj2 : listB) {
                        if (Intrinsics.areEqual(((CKV) obj2).getKey(), "p2p_columbus_version")) {
                            obj = obj2;
                            break;
                        }
                    }
                    CKV ckv = (CKV) obj;
                    if (ckv == null || (value4 = ckv.getValue()) == null) {
                        i4 = 190;
                    } else {
                        i4 = Integer.parseInt(value4);
                    }
                } else {
                    i4 = 190;
                }
                return Sa(i4);
            }
            if (ka()) {
                if (listB != null) {
                    for (Object obj3 : listB) {
                        if (Intrinsics.areEqual(((CKV) obj3).getKey(), "p2p_taycan_version")) {
                            obj = obj3;
                            break;
                        }
                    }
                    CKV ckv2 = (CKV) obj;
                    if (ckv2 == null || (value3 = ckv2.getValue()) == null) {
                        i3 = 150;
                    } else {
                        i3 = Integer.parseInt(value3);
                    }
                } else {
                    i3 = 150;
                }
                return Sa(i3);
            }
            if (ca()) {
                if (listB != null) {
                    for (Object obj4 : listB) {
                        if (Intrinsics.areEqual(((CKV) obj4).getKey(), "p2p_coco_version")) {
                            obj = obj4;
                            break;
                        }
                    }
                    CKV ckv3 = (CKV) obj;
                    if (ckv3 == null || (value2 = ckv3.getValue()) == null) {
                        i2 = 126;
                    } else {
                        i2 = Integer.parseInt(value2);
                    }
                } else {
                    i2 = 126;
                }
                return Sa(i2);
            }
            if (ja() || aa()) {
                if (listB != null) {
                    for (Object obj5 : listB) {
                        if (Intrinsics.areEqual(((CKV) obj5).getKey(), "p2p_star_river_version")) {
                            obj = obj5;
                            break;
                        }
                    }
                    CKV ckv4 = (CKV) obj;
                    if (ckv4 == null || (value = ckv4.getValue()) == null) {
                        i = 240;
                    } else {
                        i = Integer.parseInt(value);
                    }
                } else {
                    i = 240;
                }
                return Sa(i);
            }
            boolean z = K9() && oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
            boolean z2 = I9() && oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE);
            if (!z && !z2) {
                return false;
            }
        }
        return true;
    }
}
