package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.protocol.dm.DMProto$WearingStatus;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.wsport.courier.StaminaParmCourier;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b3\bf\u0018\u0000 >2\u00020\u0001:\u0001?J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016J\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u0002H\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020\nH\u0016J\u0010\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\nH\u0016J\b\u00104\u001a\u00020\u0002H\u0016J\b\u00105\u001a\u00020\u0002H\u0016J\b\u00106\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020\u0002H\u0016J\b\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020\u0002H\u0016J\b\u0010:\u001a\u00020\u0002H\u0016J\b\u0010;\u001a\u00020\u0002H\u0016J\b\u0010<\u001a\u00020\u0002H\u0016J\b\u0010=\u001a\u00020\u0002H\u0002¨\u0006@"}, d2 = {"Lcom/oplus/aiunit/vision/fbi;", "Lcom/oplus/aiunit/vision/if0;", "", "p7", "", "H7", "", "I", "", "B3", "", "U0", "y2", "", "K5", "isAutoSync", "I5", "a6", "heartRateAlarmType", "A4", "h4", "A", "g3", "U2", "P3", "U7", "u2", "a5", "k2", "d3", "v4", "f4", "p0", "p2", "i0", "z0", "N6", "L6", "W0", "S4", "u6", "P8", "f6", "G", "B7", "q8", "D", "l4", "K0", "E1", y15.PARAMS_DATA_TYPE, "n4", "o7", "g0", "d2", "o1", "C7", "b3", "I6", "T3", "k7", "isWatch2NotWearingMoreThan2Hours", "Inner", "b", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface fbi extends if0 {

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSportHealthAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportHealthAbility.kt\ncom/heytap/device/ability/SportHealthAbility$DeviceInfo$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,566:1\n37#2,5:567\n30#2,5:572\n37#2,5:577\n37#2,5:582\n37#2,5:587\n37#2,5:592\n37#2,5:597\n37#2,5:602\n37#2,5:607\n37#2,5:612\n37#2,5:617\n37#2,5:622\n37#2,5:627\n37#2,5:632\n37#2,5:637\n37#2,5:642\n37#2,5:647\n37#2,5:652\n37#2,5:657\n37#2,5:662\n37#2,5:667\n37#2,5:672\n37#2,5:677\n37#2,5:682\n37#2,5:687\n37#2,5:692\n37#2,5:697\n37#2,5:702\n37#2,5:707\n37#2,5:712\n37#2,5:717\n37#2,5:722\n37#2,5:727\n37#2,5:732\n37#2,5:737\n37#2,5:742\n37#2,5:747\n37#2,5:752\n37#2,5:757\n37#2,5:762\n37#2,5:767\n37#2,5:772\n37#2,5:777\n37#2,5:782\n37#2,5:787\n37#2,5:792\n37#2,5:797\n37#2,5:802\n37#2,5:807\n37#2,5:812\n37#2,5:817\n37#2,5:822\n37#2,5:827\n37#2,5:832\n37#2,5:837\n37#2,5:842\n*S KotlinDebug\n*F\n+ 1 SportHealthAbility.kt\ncom/heytap/device/ability/SportHealthAbility$DeviceInfo$DefaultImpls\n*L\n49#1:567,5\n53#1:572,5\n61#1:577,5\n81#1:582,5\n91#1:587,5\n99#1:592,5\n103#1:597,5\n120#1:602,5\n144#1:607,5\n148#1:612,5\n153#1:617,5\n157#1:622,5\n161#1:627,5\n170#1:632,5\n176#1:637,5\n186#1:642,5\n193#1:647,5\n208#1:652,5\n212#1:657,5\n219#1:662,5\n226#1:667,5\n233#1:672,5\n240#1:677,5\n260#1:682,5\n274#1:687,5\n281#1:692,5\n298#1:697,5\n315#1:702,5\n319#1:707,5\n343#1:712,5\n348#1:717,5\n353#1:722,5\n358#1:727,5\n365#1:732,5\n378#1:737,5\n385#1:742,5\n392#1:747,5\n399#1:752,5\n406#1:757,5\n413#1:762,5\n421#1:767,5\n429#1:772,5\n442#1:777,5\n449#1:782,5\n456#1:787,5\n463#1:792,5\n478#1:797,5\n491#1:802,5\n500#1:807,5\n507#1:812,5\n514#1:817,5\n523#1:822,5\n532#1:827,5\n541#1:832,5\n550#1:837,5\n556#1:842,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean A(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ia() || deviceInfo.X9() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean B(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return (deviceInfo.ka() && deviceInfo.Sa(180)) || (deviceInfo.ca() && deviceInfo.Sa(180)) || ((deviceInfo.X9() && deviceInfo.Sa(270)) || ((deviceInfo.ia() && deviceInfo.Sa(200)) || ((deviceInfo.ja() && deviceInfo.Sa(240)) || ((deviceInfo.ba() && deviceInfo.Sa(120)) || (deviceInfo.ga() && deviceInfo.Sa(60))))));
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean C(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                return ((DeviceInfo) fbiVar).Xa();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean D(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                return ((DeviceInfo) fbiVar).A9();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean E(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.T9() || deviceInfo.E9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean F(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean G(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ha() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.X9() || deviceInfo.ja() || deviceInfo.ia() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean H(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean I(@NotNull fbi fbiVar) {
            if (!(fbiVar instanceof DeviceInfo)) {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
            if (deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || deviceInfo.ja() || deviceInfo.ia() || deviceInfo.X9() || deviceInfo.T9()) {
                return true;
            }
            return (deviceInfo.O9() || deviceInfo.k0()) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0038  */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean J(@NotNull fbi fbiVar) {
            if (!(fbiVar instanceof DeviceInfo)) {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
            if (!deviceInfo.A9() && !deviceInfo.T9() && !deviceInfo.E9() && !deviceInfo.ha()) {
                if (deviceInfo.O9()) {
                    UserDeviceInfo userDeviceInfoKa = deviceInfo.getDeviceInfo();
                    if (!ugl.e(userDeviceInfoKa != null ? userDeviceInfoKa.getFirmwareVersion() : null, 60)) {
                        return deviceInfo.K9() ? false : false;
                    }
                } else if ((deviceInfo.K9() || !deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.k.INSTANCE)) && (!deviceInfo.I9() || !deviceInfo.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE))) {
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean K(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean L(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean M(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ha() || deviceInfo.O9() || deviceInfo.fa() || deviceInfo.T9() || deviceInfo.E9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean N(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ba() || deviceInfo.aa() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean O(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return (deviceInfo.M9() || (deviceInfo.O9() && !deviceInfo.Wa()) || deviceInfo.F9() || deviceInfo.fa() || deviceInfo.k0()) ? false : true;
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean P(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return (deviceInfo.M9() || (deviceInfo.O9() && !deviceInfo.Wa()) || deviceInfo.F9() || deviceInfo.A9() || deviceInfo.k0()) ? false : true;
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Q(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.T9() || deviceInfo.E9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean R(fbi fbiVar) {
            DMProto$WearingStatus dMProto$WearingStatusE = bjl.INSTANCE.e();
            if (dMProto$WearingStatusE == null) {
                return false;
            }
            a7b.f("SportHealthAbility", "Watch2 wear state=" + a1e.b(dMProto$WearingStatusE));
            long recentWearingTime = ((long) dMProto$WearingStatusE.getRecentWearingTime()) * 1000;
            return dMProto$WearingStatusE.getState() == 0 && recentWearingTime != 0 && System.currentTimeMillis() - recentWearingTime > 7200000;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                if (deviceInfo.ja() || deviceInfo.aa()) {
                    return deviceInfo.Sa(240);
                }
                return deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean T(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return (deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.j.INSTANCE)) || (deviceInfo.I9() && deviceInfo.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean U(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.O9() || deviceInfo.ha();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                if (deviceInfo.ja() || deviceInfo.aa()) {
                    return deviceInfo.Sa(240);
                }
                return deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean W(@NotNull fbi fbiVar) {
            if (!(fbiVar instanceof DeviceInfo)) {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
            if (deviceInfo.ja() || deviceInfo.aa()) {
                return deviceInfo.Sa(240);
            }
            if (deviceInfo.ka() || deviceInfo.ca()) {
                return deviceInfo.Sa(130);
            }
            return deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void X(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                if (deviceInfo.A9() || deviceInfo.Ra()) {
                    return;
                }
                StaminaParmCourier.d();
                return;
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String Y(@NotNull fbi fbiVar) {
            if (!(fbiVar instanceof DeviceInfo)) {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
            if (deviceInfo.ka()) {
                return "WatchTaycan";
            }
            if (deviceInfo.ea()) {
                return "WatchColumbus";
            }
            if (deviceInfo.ja()) {
                return "WatchStarRiver";
            }
            if (deviceInfo.ba()) {
                return "WatchBagel";
            }
            if (deviceInfo.ia()) {
                return "WatchStar";
            }
            if (deviceInfo.X9()) {
                return "Watch4";
            }
            if (deviceInfo.ha()) {
                return "Watch3SE";
            }
            if (!deviceInfo.T9()) {
                if (deviceInfo.O9()) {
                    return "Watch2";
                }
                if (deviceInfo.M9()) {
                    return "Watch1";
                }
                if (deviceInfo.E9()) {
                    return "Heisenberg";
                }
                if (deviceInfo.A9()) {
                    return op5.BAND;
                }
                if (deviceInfo.F9()) {
                    return DeviceInfoUtil.BRAND_ONEPLUES;
                }
                if (deviceInfo.fa()) {
                    return "WatchFree";
                }
                if (deviceInfo.G9()) {
                    return "isRealMe";
                }
            }
            return "Watch3";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void a(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                if (((DeviceInfo) fbiVar).A9()) {
                    cx0.f().d();
                }
            } else {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ea() && deviceInfo.Sa(170);
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int c(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return (deviceInfo.A9() || deviceInfo.fa() || deviceInfo.F9() || deviceInfo.E9() || deviceInfo.M9() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia()) ? 30000 : 15000;
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                return ((DeviceInfo) fbiVar).M9();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull fbi fbiVar, int i) {
            if (fbiVar instanceof DeviceInfo) {
                return ((DeviceInfo) fbiVar).M9() && i == 1;
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean f(@NotNull fbi fbiVar, boolean z) {
            if (!(fbiVar instanceof DeviceInfo)) {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
            if ((!deviceInfo.O9() && !deviceInfo.ha()) || !z || !R(fbiVar)) {
                return false;
            }
            a7b.f("SportHealthAbility", "Watch not wearing more than 2 hours, cancel auto data sync");
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int g(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                return ((DeviceInfo) fbiVar).fa() ? 1 : 2;
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String h(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceModel) {
                return ((DeviceModel) fbiVar).A9() ? "band_log" : "device_log";
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static int[] i(@NotNull fbi fbiVar) {
            int i;
            int i2;
            if (!(fbiVar instanceof DeviceInfo)) {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
            int[] iArr = new int[2];
            if (deviceInfo.M9() && deviceInfo.Ya()) {
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

        /* JADX WARN: Multi-variable type inference failed */
        public static int j(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                return ((DeviceInfo) fbiVar).M9() ? 3 : 7;
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static double[] k(@NotNull fbi fbiVar) {
            double d;
            double d2;
            if (!(fbiVar instanceof DeviceInfo)) {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
            double[] dArr = new double[2];
            if (deviceInfo.A9() || deviceInfo.fa() || deviceInfo.E9() || deviceInfo.Ya()) {
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

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean l(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || deviceInfo.ja() || deviceInfo.ia() || deviceInfo.X9();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean m(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return (deviceInfo.aa() && deviceInfo.Sa(140)) || (deviceInfo.ja() && !deviceInfo.aa() && deviceInfo.Sa(130)) || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean n(@NotNull fbi fbiVar) {
            if (!(fbiVar instanceof DeviceInfo)) {
                throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
            if (deviceInfo.ea() || deviceInfo.ja() || deviceInfo.ia() || deviceInfo.X9() || deviceInfo.T9() || deviceInfo.E9()) {
                return true;
            }
            if (!deviceInfo.O9()) {
                return false;
            }
            UserDeviceInfo userDeviceInfoKa = deviceInfo.getDeviceInfo();
            Intrinsics.checkNotNull(userDeviceInfoKa);
            return ugl.e(userDeviceInfoKa.getFirmwareVersion(), 60);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean o(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                return ((DeviceInfo) fbiVar).ea();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean p(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || deviceInfo.ja() || deviceInfo.ha() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean q(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                if (deviceInfo.ja() || deviceInfo.aa()) {
                    return deviceInfo.Sa(240);
                }
                return deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean r(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean s(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ja();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean t(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.ea() || deviceInfo.ja() || deviceInfo.ia() || deviceInfo.X9() || deviceInfo.T9() || deviceInfo.O9();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean u(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.ja() || deviceInfo.ea() || deviceInfo.k0() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean v(@NotNull fbi fbiVar, int i) {
            if (fbiVar instanceof DeviceInfo) {
                return (!fbiVar.l4() || i == 18 || i == 9 || i == 12 || i == 5 || i == 14 || i == 27) ? false : true;
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean w(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                return ((DeviceInfo) fbiVar).Ya();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean x(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                if (deviceInfo.ja() || deviceInfo.aa()) {
                    return deviceInfo.Sa(240);
                }
                return deviceInfo.K9() && deviceInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.g.INSTANCE);
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean y(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.T9() || deviceInfo.E9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean z(@NotNull fbi fbiVar) {
            if (fbiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) fbiVar;
                return deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(fbiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.fbi$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/fbi$b;", "", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    void A();

    boolean A4(int heartRateAlarmType);

    void B3();

    boolean B7();

    boolean C7();

    boolean D();

    int E1();

    boolean G();

    @NotNull
    String H7();

    @NotNull
    double[] I();

    boolean I5(boolean isAutoSync);

    boolean I6();

    boolean K0();

    @NotNull
    int[] K5();

    boolean L6();

    boolean N6();

    boolean P3();

    boolean P8();

    boolean S4();

    boolean T3();

    int U0();

    boolean U2();

    boolean U7();

    boolean W0();

    boolean a5();

    boolean a6();

    boolean b3();

    boolean d2();

    boolean d3();

    boolean f4();

    boolean f6();

    boolean g0();

    boolean g3();

    int h4();

    @NotNull
    String i0();

    boolean k2();

    boolean k7();

    boolean l4();

    boolean n4(int dataType);

    boolean o1();

    boolean o7();

    boolean p0();

    boolean p2();

    boolean p7();

    boolean q8();

    boolean u2();

    boolean u6();

    boolean v4();

    boolean y2();

    boolean z0();
}
