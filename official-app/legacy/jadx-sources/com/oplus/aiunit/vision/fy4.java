package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.AppListBean;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020\nH\u0016J\b\u0010&\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020\nH\u0016J\b\u0010(\u001a\u00020\nH\u0016J\b\u0010)\u001a\u00020\nH\u0016J\b\u0010*\u001a\u00020\nH\u0016¨\u0006+"}, d2 = {"Lcom/oplus/aiunit/vision/fy4;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/ma5;", "", "", "h6", "appPackageConstant", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "installAppSet", "", "R5", "v0", "r7", "h3", "p6", "O6", "q2", "K7", "y6", "E8", "h0", "Z6", "n3", "r1", "t4", "k6", "n0", "u8", ExifInterface.GPS_DIRECTION_TRUE, "X", "b6", "O2", "m4", "G4", "f0", "l7", "T6", b2n.f, "e1", MapSchema.FIELD_NAME_ENTRY, "W7", "t2", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface fy4 extends if0, ma5 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDataSyncListAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSyncListAbility.kt\ncom/heytap/device/ability/DataSyncListAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,418:1\n37#2,5:419\n37#2,5:424\n37#2,5:429\n37#2,5:434\n37#2,5:439\n37#2,5:444\n37#2,5:449\n37#2,5:454\n37#2,5:459\n37#2,5:464\n37#2,5:469\n37#2,5:474\n37#2,5:479\n37#2,5:484\n37#2,5:489\n37#2,5:494\n37#2,5:499\n37#2,5:504\n37#2,5:509\n37#2,5:514\n37#2,5:519\n37#2,5:524\n37#2,5:529\n37#2,5:534\n37#2,5:539\n37#2,5:544\n37#2,5:549\n37#2,5:554\n37#2,5:559\n37#2,5:564\n37#2,5:569\n37#2,5:574\n37#2,5:579\n*S KotlinDebug\n*F\n+ 1 DataSyncListAbility.kt\ncom/heytap/device/ability/DataSyncListAbility$DefaultImpls\n*L\n30#1:419,5\n237#1:424,5\n242#1:429,5\n247#1:434,5\n252#1:439,5\n257#1:444,5\n263#1:449,5\n269#1:454,5\n275#1:459,5\n281#1:464,5\n286#1:469,5\n291#1:474,5\n296#1:479,5\n306#1:484,5\n311#1:489,5\n316#1:494,5\n322#1:499,5\n327#1:504,5\n332#1:509,5\n337#1:514,5\n348#1:519,5\n353#1:524,5\n358#1:529,5\n363#1:534,5\n368#1:539,5\n373#1:544,5\n378#1:549,5\n383#1:554,5\n388#1:559,5\n393#1:564,5\n400#1:569,5\n405#1:574,5\n414#1:579,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean A(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return !deviceInfo.M9() || (deviceInfo.M9() && deviceInfo.Pa());
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean B(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.fa() || deviceInfo.E9();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean C(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.A9() || deviceInfo.M9() || deviceInfo.F9() || deviceInfo.G9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean D(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.E9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean E(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.F9() || deviceInfo.G9() || deviceInfo.E9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean F(@NotNull fy4 fy4Var) {
            if (!(fy4Var instanceof DeviceInfo)) {
                throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
            if (deviceInfo.ka()) {
                return deviceInfo.Sa(180);
            }
            if (deviceInfo.ja() || deviceInfo.aa()) {
                return deviceInfo.Sa(240);
            }
            return deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.c.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean G(@NotNull fy4 fy4Var) {
            if (!(fy4Var instanceof DeviceInfo)) {
                throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
            if (deviceInfo.ja() || deviceInfo.aa()) {
                if (!deviceInfo.Sa(240) && !deviceInfo.Pa()) {
                    return false;
                }
            } else if (!deviceInfo.ka() && !deviceInfo.ca() && !deviceInfo.ea() && ((!deviceInfo.O9() && !deviceInfo.T9() && !deviceInfo.X9() && !deviceInfo.ia()) || !deviceInfo.Pa())) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean H(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.X9() || (!deviceInfo.aa() && deviceInfo.ja()) || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean I(@NotNull fy4 fy4Var) {
            return ma5.a.b(fy4Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static List<Integer> a(@NotNull fy4 fy4Var) {
            if (!(fy4Var instanceof DeviceInfo)) {
                throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
            ArrayList arrayList = new ArrayList();
            if (deviceInfo.k0()) {
                arrayList.add(1);
                arrayList.add(34);
                arrayList.add(2);
                arrayList.add(3);
                arrayList.add(23);
                arrayList.add(20);
                arrayList.add(5);
                return arrayList;
            }
            if (deviceInfo.Ra()) {
                a7b.b("Data-Sync", "Device is family device, sync data not support");
            } else {
                AppListBean appListBeanFindDeviceAppListByMac = gl4.businessApi.findDeviceAppListByMac(deviceInfo.Ma());
                HashSet<Integer> installAppSet = appListBeanFindDeviceAppListByMac != null ? appListBeanFindDeviceAppListByMac.getInstallAppSet() : null;
                if (fy4Var.v0() && fy4Var.R5(10, installAppSet)) {
                    arrayList.add(1);
                }
                if (fy4Var.r7() && fy4Var.R5(12, installAppSet)) {
                    arrayList.add(2);
                }
                if (fy4Var.h3() && fy4Var.R5(17, installAppSet)) {
                    arrayList.add(3);
                }
                if (fy4Var.p6() && fy4Var.R5(16, installAppSet)) {
                    arrayList.add(4);
                }
                if (fy4Var.q2() && fy4Var.R5(12, installAppSet)) {
                    arrayList.add(6);
                }
                if (fy4Var.K7() && fy4Var.R5(10, installAppSet)) {
                    arrayList.add(7);
                }
                if (fy4Var.y6() && fy4Var.R5(10, installAppSet)) {
                    arrayList.add(34);
                }
                if (fy4Var.E8() && fy4Var.R5(19, installAppSet)) {
                    arrayList.add(8);
                }
                if (fy4Var.Z6() && fy4Var.R5(18, installAppSet)) {
                    arrayList.add(10);
                }
                if (fy4Var.n3() && fy4Var.R5(10, installAppSet)) {
                    arrayList.add(11);
                }
                if (fy4Var.t4() && fy4Var.R5(12, installAppSet)) {
                    arrayList.add(13);
                }
                if (fy4Var.k6() && fy4Var.R5(12, installAppSet)) {
                    arrayList.add(14);
                }
                if (fy4Var.n0()) {
                    arrayList.add(15);
                }
                if (fy4Var.u8() && fy4Var.R5(12, installAppSet)) {
                    arrayList.add(16);
                }
                if (fy4Var.T()) {
                    arrayList.add(17);
                }
                if (fy4Var.X() && fy4Var.R5(11, installAppSet)) {
                    arrayList.add(18);
                }
                if (fy4Var.b6() && fy4Var.R5(16, installAppSet)) {
                    arrayList.add(19);
                }
                if (fy4Var.O2() && fy4Var.R5(17, installAppSet)) {
                    arrayList.add(20);
                }
                if (fy4Var.m4() && fy4Var.R5(17, installAppSet)) {
                    arrayList.add(21);
                }
                if (fy4Var.G4() && fy4Var.R5(17, installAppSet)) {
                    arrayList.add(22);
                }
                if (fy4Var.f0() && fy4Var.R5(17, installAppSet)) {
                    arrayList.add(23);
                }
                if (fy4Var.l7() && fy4Var.R5(15, installAppSet)) {
                    arrayList.add(24);
                }
                if (fy4Var.T6()) {
                    arrayList.add(25);
                    arrayList.add(26);
                    arrayList.add(27);
                }
                if (fy4Var.g() && fy4Var.R5(23, installAppSet)) {
                    arrayList.add(28);
                    arrayList.add(29);
                }
                if (fy4Var.e() && fy4Var.R5(19, installAppSet)) {
                    arrayList.add(32);
                    arrayList.add(33);
                }
                if (fy4Var.W7() && fy4Var.R5(33, installAppSet)) {
                    arrayList.add(35);
                    arrayList.add(36);
                }
                if (fy4Var.h0() && fy4Var.R5(11, installAppSet)) {
                    arrayList.add(9);
                }
                if (fy4Var.O6() && fy4Var.R5(11, installAppSet)) {
                    arrayList.add(5);
                }
                if (fy4Var.r1() && fy4Var.R5(13, installAppSet)) {
                    arrayList.add(12);
                }
                if (fy4Var.e1()) {
                    arrayList.add(31);
                }
                if (arrayList.isEmpty()) {
                    a7b.b("Data-Sync", "Device type not support, dataType=null");
                }
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull fy4 fy4Var, int i, @Nullable HashSet<Integer> hashSet) {
            if (fy4Var instanceof DeviceInfo) {
                if (hashSet != null) {
                    return hashSet.contains(Integer.valueOf(i));
                }
                return true;
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean c(@NotNull fy4 fy4Var, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            return ma5.a.a(fy4Var, appIds);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.E9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || ((deviceInfo.V9() || deviceInfo.X9() || deviceInfo.ja()) && deviceInfo.Pa());
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return (deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca()) && deviceInfo.Pa();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean g(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.k0() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean h(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                return ((DeviceInfo) fy4Var).o2();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean i(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.Za() && deviceInfo.Pa() && !deviceInfo.k0();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean k(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.fa() || ((deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja()) && deviceInfo.Pa());
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean l(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.fa() || deviceInfo.E9() || deviceInfo.O9();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean m(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                return ((DeviceInfo) fy4Var).o2();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean n(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return (deviceInfo.M9() && deviceInfo.Pa()) || deviceInfo.F9() || deviceInfo.G9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean o(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.fa() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0020  */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean p(@NotNull fy4 fy4Var) {
            if (!(fy4Var instanceof DeviceInfo)) {
                throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
            if (deviceInfo.ka()) {
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                if (!ugl.e(deviceInfo2 != null ? deviceInfo2.getFirmwareVersion() : null, 180)) {
                    if (deviceInfo.K9()) {
                    }
                    return false;
                }
            } else if (deviceInfo.K9() || !deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.c.INSTANCE)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean q(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean r(@NotNull fy4 fy4Var) {
            if (!(fy4Var instanceof DeviceInfo)) {
                throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
            if (deviceInfo.ja() || deviceInfo.aa()) {
                if (!deviceInfo.Sa(240) && !deviceInfo.Pa()) {
                    return false;
                }
            } else if (!deviceInfo.ka() && !deviceInfo.ca() && !deviceInfo.ea() && !deviceInfo.E9() && ((!deviceInfo.O9() && !deviceInfo.T9() && !deviceInfo.X9() && !deviceInfo.ia()) || !deviceInfo.Pa())) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean s(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return (deviceInfo.M9() && deviceInfo.Pa()) || deviceInfo.F9() || deviceInfo.G9() || deviceInfo.E9();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean t(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean u(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                return ((DeviceInfo) fy4Var).o2();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0027  */
        /* JADX WARN: Code duplicated, block: B:16:0x002d  */
        /* JADX WARN: Code duplicated, block: B:18:0x0033  */
        /* JADX WARN: Code duplicated, block: B:21:0x003f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean v(@NotNull fy4 fy4Var) {
            UserDeviceInfo deviceInfo;
            if (!(fy4Var instanceof DeviceInfo)) {
                throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo2 = (DeviceInfo) fy4Var;
            if (!deviceInfo2.ba() && deviceInfo2.ia()) {
                UserDeviceInfo deviceInfo3 = deviceInfo2.getDeviceInfo();
                if (!ugl.e(deviceInfo3 != null ? deviceInfo3.getFirmwareVersion() : null, 80)) {
                    if (!deviceInfo2.X9()) {
                        deviceInfo = deviceInfo2.getDeviceInfo();
                        if (!ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 170)) {
                            if (deviceInfo2.ja()) {
                            }
                        }
                    } else if (deviceInfo2.ja()) {
                    }
                }
            } else if (!deviceInfo2.X9()) {
                deviceInfo = deviceInfo2.getDeviceInfo();
                if (!ugl.e(deviceInfo != null ? deviceInfo.getFirmwareVersion() : null, 170)) {
                    if (deviceInfo2.ja()) {
                    }
                }
            } else if (deviceInfo2.ja() && !deviceInfo2.ea() && !deviceInfo2.ka() && !deviceInfo2.ca()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean w(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.E9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean x(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.E9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean y(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.A9() || deviceInfo.F9() || deviceInfo.G9() || deviceInfo.fa() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.k0() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean z(@NotNull fy4 fy4Var) {
            if (fy4Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fy4Var;
                return deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fy4Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean E8();

    boolean G4();

    boolean K7();

    boolean O2();

    boolean O6();

    boolean R5(int appPackageConstant, @Nullable HashSet<Integer> installAppSet);

    boolean T();

    boolean T6();

    boolean W7();

    boolean X();

    boolean Z6();

    boolean b6();

    boolean e();

    boolean e1();

    boolean f0();

    boolean g();

    boolean h0();

    boolean h3();

    @NotNull
    List<Integer> h6();

    boolean k6();

    boolean l7();

    boolean m4();

    boolean n0();

    boolean n3();

    boolean p6();

    boolean q2();

    boolean r1();

    boolean r7();

    boolean t2();

    boolean t4();

    boolean u8();

    boolean v0();

    boolean y6();
}
