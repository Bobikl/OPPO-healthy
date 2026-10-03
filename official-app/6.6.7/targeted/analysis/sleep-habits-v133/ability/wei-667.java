package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.protocol.dm.DMProto;
import com.heytap.wsport.courier.StaminaParmCourier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b3\bf\u0018\u0000 >2\u00020\u0001:\u0001?J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016J\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u0002H\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020\nH\u0016J\u0010\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\nH\u0016J\b\u00104\u001a\u00020\u0002H\u0016J\b\u00105\u001a\u00020\u0002H\u0016J\b\u00106\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020\u0002H\u0016J\b\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020\u0002H\u0016J\b\u0010:\u001a\u00020\u0002H\u0016J\b\u0010;\u001a\u00020\u0002H\u0016J\b\u0010<\u001a\u00020\u0002H\u0016J\b\u0010=\u001a\u00020\u0002H\u0002¨\u0006@"}, d2 = {"Lcom/oplus/aiunit/vision/wei;", "Lcom/oplus/aiunit/vision/ag0;", kq5.NOT_SET, "r7", kq5.NOT_SET, "J7", kq5.NOT_SET, "I", kq5.NOT_SET, "C3", kq5.NOT_SET, "U0", "z2", kq5.NOT_SET, "K5", "isAutoSync", "I5", "a6", "heartRateAlarmType", "z4", "g4", "A", "h3", "V2", "Q3", "V7", "v2", "Z4", "l2", "e3", "u4", "e4", "p0", "q2", "i0", "z0", "P6", "N6", "W0", "R4", "v6", "R8", "f6", "G", "D7", "r8", "D", "k4", "K0", "F1", "dataType", "m4", "q7", "g0", "e2", "p1", "E7", "c3", "K6", "U3", "m7", "isWatch2NotWearingMoreThan2Hours", "Inner", "b", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface wei extends ag0 {

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSportHealthAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportHealthAbility.kt\ncom/heytap/device/ability/SportHealthAbility$DeviceInfo$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,567:1\n37#2,5:568\n30#2,5:573\n37#2,5:578\n37#2,5:583\n37#2,5:588\n37#2,5:593\n37#2,5:598\n37#2,5:603\n37#2,5:608\n37#2,5:613\n37#2,5:618\n37#2,5:623\n37#2,5:628\n37#2,5:633\n37#2,5:638\n37#2,5:643\n37#2,5:648\n37#2,5:653\n37#2,5:658\n37#2,5:663\n37#2,5:668\n37#2,5:673\n37#2,5:678\n37#2,5:683\n37#2,5:688\n37#2,5:693\n37#2,5:698\n37#2,5:703\n37#2,5:708\n37#2,5:713\n37#2,5:718\n37#2,5:723\n37#2,5:728\n37#2,5:733\n37#2,5:738\n37#2,5:743\n37#2,5:748\n37#2,5:753\n37#2,5:758\n37#2,5:763\n37#2,5:768\n37#2,5:773\n37#2,5:778\n37#2,5:783\n37#2,5:788\n37#2,5:793\n37#2,5:798\n37#2,5:803\n37#2,5:808\n37#2,5:813\n37#2,5:818\n37#2,5:823\n37#2,5:828\n37#2,5:833\n37#2,5:838\n37#2,5:843\n*S KotlinDebug\n*F\n+ 1 SportHealthAbility.kt\ncom/heytap/device/ability/SportHealthAbility$DeviceInfo$DefaultImpls\n*L\n49#1:568,5\n53#1:573,5\n61#1:578,5\n81#1:583,5\n91#1:588,5\n99#1:593,5\n103#1:598,5\n120#1:603,5\n144#1:608,5\n148#1:613,5\n153#1:618,5\n157#1:623,5\n161#1:628,5\n170#1:633,5\n176#1:638,5\n186#1:643,5\n193#1:648,5\n208#1:653,5\n212#1:658,5\n219#1:663,5\n226#1:668,5\n233#1:673,5\n240#1:678,5\n260#1:683,5\n274#1:688,5\n281#1:693,5\n298#1:698,5\n315#1:703,5\n319#1:708,5\n343#1:713,5\n348#1:718,5\n353#1:723,5\n358#1:728,5\n365#1:733,5\n378#1:738,5\n385#1:743,5\n392#1:748,5\n399#1:753,5\n406#1:758,5\n413#1:763,5\n421#1:768,5\n429#1:773,5\n442#1:778,5\n449#1:783,5\n456#1:788,5\n463#1:793,5\n478#1:798,5\n491#1:803,5\n500#1:808,5\n507#1:813,5\n514#1:818,5\n523#1:823,5\n532#1:828,5\n541#1:833,5\n550#1:838,5\n556#1:843,5\n*E\n"})
    public static final class a {
        public static boolean A(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.ka() || deviceInfo.Z9() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean B(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return (deviceInfo.ma() && deviceInfo.Ua(180)) || (deviceInfo.ea() && deviceInfo.Ua(180)) || ((deviceInfo.Z9() && deviceInfo.Ua(270)) || ((deviceInfo.ka() && deviceInfo.Ua(200)) || ((deviceInfo.la() && deviceInfo.Ua(240)) || ((deviceInfo.da() && deviceInfo.Ua(120)) || (deviceInfo.ia() && deviceInfo.Ua(60))))));
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean C(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                return ((DeviceInfo) weiVar).Za();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean D(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                return ((DeviceInfo) weiVar).C9();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean E(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.V9() || deviceInfo.G9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean F(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean G(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.ja() || deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.ha() || deviceInfo.G9() || deviceInfo.Z9() || deviceInfo.la() || deviceInfo.ka() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean H(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean I(@NotNull wei weiVar) {
            if (!(weiVar instanceof DeviceInfo)) {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) weiVar;
            if (deviceInfo.ma() || deviceInfo.ea() || deviceInfo.ga() || deviceInfo.la() || deviceInfo.ka() || deviceInfo.Z9() || deviceInfo.V9()) {
                return true;
            }
            return (deviceInfo.Q9() || deviceInfo.k0()) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0038  */
        public static boolean J(@NotNull wei weiVar) {
            if (!(weiVar instanceof DeviceInfo)) {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) weiVar;
            if (!deviceInfo.C9() && !deviceInfo.V9() && !deviceInfo.G9() && !deviceInfo.ja()) {
                if (deviceInfo.Q9()) {
                    UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                    if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 60)) {
                        return deviceInfo.M9() ? false : false;
                    }
                } else if ((deviceInfo.M9() || !deviceInfo.qa(DeviceConstants.b.b.k.INSTANCE)) && (!deviceInfo.K9() || !deviceInfo.qa(DeviceConstants.b.a.b.INSTANCE))) {
                }
            }
            return true;
        }

        public static boolean K(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean L(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean M(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.ja() || deviceInfo.Q9() || deviceInfo.ha() || deviceInfo.V9() || deviceInfo.G9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean N(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.da() || deviceInfo.ca() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean O(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return (deviceInfo.O9() || (deviceInfo.Q9() && !deviceInfo.Ya()) || deviceInfo.H9() || deviceInfo.ha() || deviceInfo.k0()) ? false : true;
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean P(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return (deviceInfo.O9() || (deviceInfo.Q9() && !deviceInfo.Ya()) || deviceInfo.H9() || deviceInfo.C9() || deviceInfo.k0()) ? false : true;
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean Q(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.V9() || deviceInfo.G9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean R(wei weiVar) {
            DMProto.WearingStatus wearingStatusE = zml.INSTANCE.e();
            if (wearingStatusE == null) {
                return false;
            }
            m8b.f("SportHealthAbility", "Watch2 wear state=" + v2e.b(wearingStatusE));
            long recentWearingTime = ((long) wearingStatusE.getRecentWearingTime()) * 1000;
            return wearingStatusE.getState() == 0 && recentWearingTime != 0 && System.currentTimeMillis() - recentWearingTime > 7200000;
        }

        public static boolean S(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                if (deviceInfo.la() || deviceInfo.ca()) {
                    return deviceInfo.Ua(240);
                }
                return deviceInfo.M9() && deviceInfo.qa(DeviceConstants.b.b.g.INSTANCE);
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean T(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return (deviceInfo.M9() && deviceInfo.qa(DeviceConstants.b.b.j.INSTANCE)) || (deviceInfo.K9() && deviceInfo.qa(DeviceConstants.b.a.b.INSTANCE));
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean U(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.Q9() || deviceInfo.ja();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean V(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                if (deviceInfo.la() || deviceInfo.ca()) {
                    return deviceInfo.Ua(240);
                }
                return deviceInfo.M9() && deviceInfo.qa(DeviceConstants.b.b.g.INSTANCE);
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean W(@NotNull wei weiVar) {
            if (!(weiVar instanceof DeviceInfo)) {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) weiVar;
            if (deviceInfo.ga()) {
                return deviceInfo.Ua(210);
            }
            if (deviceInfo.la() || deviceInfo.ca()) {
                return deviceInfo.Ua(240);
            }
            if (deviceInfo.ma() || deviceInfo.ea()) {
                return deviceInfo.Ua(i9a.PRIORITY_LOW_30);
            }
            return deviceInfo.M9() && deviceInfo.qa(DeviceConstants.b.b.g.INSTANCE);
        }

        public static void X(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                if (deviceInfo.C9() || deviceInfo.Ta()) {
                    return;
                }
                StaminaParmCourier.d();
                return;
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        @NotNull
        public static String Y(@NotNull wei weiVar) {
            if (!(weiVar instanceof DeviceInfo)) {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) weiVar;
            if (deviceInfo.ma()) {
                return "WatchTaycan";
            }
            if (deviceInfo.ga()) {
                return "WatchColumbus";
            }
            if (deviceInfo.la()) {
                return "WatchStarRiver";
            }
            if (deviceInfo.da()) {
                return "WatchBagel";
            }
            if (deviceInfo.ka()) {
                return "WatchStar";
            }
            if (deviceInfo.Z9()) {
                return "Watch4";
            }
            if (deviceInfo.ja()) {
                return "Watch3SE";
            }
            if (!deviceInfo.V9()) {
                if (deviceInfo.Q9()) {
                    return "Watch2";
                }
                if (deviceInfo.O9()) {
                    return "Watch1";
                }
                if (deviceInfo.G9()) {
                    return "Heisenberg";
                }
                if (deviceInfo.C9()) {
                    return kq5.BAND;
                }
                if (deviceInfo.H9()) {
                    return "OnePlus";
                }
                if (deviceInfo.ha()) {
                    return "WatchFree";
                }
                if (deviceInfo.I9()) {
                    return "isRealMe";
                }
            }
            return "Watch3";
        }

        public static void a(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                if (((DeviceInfo) weiVar).C9()) {
                    qx0.f().d();
                }
            } else {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
        }

        public static boolean b(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.ga() && deviceInfo.Ua(170);
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static int c(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return (deviceInfo.C9() || deviceInfo.ha() || deviceInfo.H9() || deviceInfo.G9() || deviceInfo.O9() || deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka()) ? 30000 : 15000;
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean d(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                return ((DeviceInfo) weiVar).O9();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean e(@NotNull wei weiVar, int i) {
            if (weiVar instanceof DeviceInfo) {
                return ((DeviceInfo) weiVar).O9() && i == 1;
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean f(@NotNull wei weiVar, boolean z) {
            if (!(weiVar instanceof DeviceInfo)) {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) weiVar;
            if ((!deviceInfo.Q9() && !deviceInfo.ja()) || !z || !R(weiVar)) {
                return false;
            }
            m8b.f("SportHealthAbility", "Watch not wearing more than 2 hours, cancel auto data sync");
            return true;
        }

        public static int g(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                return ((DeviceInfo) weiVar).ha() ? 1 : 2;
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        @NotNull
        public static String h(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceModel) {
                return ((DeviceModel) weiVar).C9() ? "band_log" : "device_log";
            }
            throw new RuntimeException(weiVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        @NotNull
        public static int[] i(@NotNull wei weiVar) {
            int i;
            int i2;
            if (!(weiVar instanceof DeviceInfo)) {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) weiVar;
            int[] iArr = new int[2];
            if (deviceInfo.O9() && deviceInfo.ab()) {
                i = 50;
                i2 = 4;
            } else {
                i = 5;
                i2 = 21;
            }
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        public static int j(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                return ((DeviceInfo) weiVar).O9() ? 3 : 7;
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        @NotNull
        public static double[] k(@NotNull wei weiVar) {
            double d;
            double d2;
            if (!(weiVar instanceof DeviceInfo)) {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) weiVar;
            double[] dArr = new double[2];
            if (deviceInfo.C9() || deviceInfo.ha() || deviceInfo.G9() || deviceInfo.ab()) {
                d = 60.0d;
                d2 = 30.0d;
            } else {
                d = 15360.0d;
                d2 = 15.0d;
            }
            dArr[0] = d;
            dArr[1] = d2;
            return dArr;
        }

        public static boolean l(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.ma() || deviceInfo.ea() || deviceInfo.ga() || deviceInfo.la() || deviceInfo.ka() || deviceInfo.Z9();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean m(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return (deviceInfo.ca() && deviceInfo.Ua(140)) || (deviceInfo.la() && !deviceInfo.ca() && deviceInfo.Ua(i9a.PRIORITY_LOW_30)) || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean n(@NotNull wei weiVar) {
            if (!(weiVar instanceof DeviceInfo)) {
                throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) weiVar;
            if (deviceInfo.ga() || deviceInfo.la() || deviceInfo.ka() || deviceInfo.Z9() || deviceInfo.V9() || deviceInfo.G9()) {
                return true;
            }
            if (!deviceInfo.Q9()) {
                return false;
            }
            UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
            Intrinsics.checkNotNull(userDeviceInfoMa);
            return skl.e(userDeviceInfoMa.getFirmwareVersion(), 60);
        }

        public static boolean o(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                return ((DeviceInfo) weiVar).ga();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean p(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.ma() || deviceInfo.ea() || deviceInfo.ga() || deviceInfo.la() || deviceInfo.ja() || deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean q(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                if (deviceInfo.la() || deviceInfo.ca()) {
                    return deviceInfo.Ua(240);
                }
                return deviceInfo.M9() && deviceInfo.qa(DeviceConstants.b.b.g.INSTANCE);
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean r(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean s(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea() || deviceInfo.la();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean t(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.ma() || deviceInfo.ea() || deviceInfo.ga() || deviceInfo.la() || deviceInfo.ka() || deviceInfo.Z9() || deviceInfo.V9() || deviceInfo.Q9();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean u(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.la() || deviceInfo.ga() || deviceInfo.k0() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean v(@NotNull wei weiVar, int i) {
            if (weiVar instanceof DeviceInfo) {
                return (!weiVar.k4() || i == 18 || i == 9 || i == 12 || i == 5 || i == 14 || i == 27) ? false : true;
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean w(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                return ((DeviceInfo) weiVar).ab();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean x(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                if (deviceInfo.la() || deviceInfo.ca()) {
                    return deviceInfo.Ua(240);
                }
                return deviceInfo.M9() && deviceInfo.qa(DeviceConstants.b.b.g.INSTANCE);
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean y(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.V9() || deviceInfo.G9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean z(@NotNull wei weiVar) {
            if (weiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) weiVar;
                return deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea();
            }
            throw new RuntimeException(weiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.wei$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/wei$b;", kq5.NOT_SET, "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    void A();

    void C3();

    boolean D();

    boolean D7();

    boolean E7();

    int F1();

    boolean G();

    @NotNull
    double[] I();

    boolean I5(boolean isAutoSync);

    @NotNull
    String J7();

    boolean K0();

    @NotNull
    int[] K5();

    boolean K6();

    boolean N6();

    boolean P6();

    boolean Q3();

    boolean R4();

    boolean R8();

    int U0();

    boolean U3();

    boolean V2();

    boolean V7();

    boolean W0();

    boolean Z4();

    boolean a6();

    boolean c3();

    boolean e2();

    boolean e3();

    boolean e4();

    boolean f6();

    boolean g0();

    int g4();

    boolean h3();

    @NotNull
    String i0();

    boolean k4();

    boolean l2();

    boolean m4(int dataType);

    boolean m7();

    boolean p0();

    boolean p1();

    boolean q2();

    boolean q7();

    boolean r7();

    boolean r8();

    boolean u4();

    boolean v2();

    boolean v6();

    boolean z0();

    boolean z2();

    boolean z4(int heartRateAlarmType);
}