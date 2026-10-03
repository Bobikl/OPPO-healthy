package com.oplus.aiunit.model;

import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.settings.DeviceSettings;
import com.heytap.health.settings.watch.sporthealthsettings2.ability.DeviceSettingAbilityGenerate;
import com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.g;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainAdapter;
import com.heytap.health.voiceassistant.proto.VAProto;
import com.lifesense.plugin.ble.data.tracker.ATCmdProfile;
import com.oplus.aiunit.vision.ag0;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.skl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016J\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u0002H\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u00020\u0002H\u0016J\b\u00103\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020\u0002H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0004H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0004H\u0016J\b\u00109\u001a\u00020\u0002H\u0016J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020\u0002H\u0016J\b\u0010=\u001a\u00020\u0002H\u0016J\u0010\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>H\u0002J\f\u0010A\u001a\u00020\u0002*\u00020>H\u0002¨\u0006B"}, d2 = {"Lcom/oplus/aiunit/vision/jki;", "Lcom/oplus/aiunit/vision/ag0;", "", "onlyStepAndCalorie", "", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainAdapter$d;", "n5", "Q0", "T2", "U2", "U", "z5", "S4", "J3", "X2", "x8", "z", "j1", "u0", "f8", "j4", "B6", "M1", "V", "O5", "A4", "Q7", "C4", "e1", "N2", "H2", "i7", "N0", "I7", "E8", "b4", "G5", "g", "C7", "f4", "T1", "j7", "O6", "i1", "W4", "f", "o0", "e", "D1", "w3", "z3", "B7", "e8", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "p8", "Lcom/oplus/aiunit/vision/k79;", "X0", "x1", "Lcom/heytap/health/settings/DeviceSettings$SettingAbility;", "o5", "h1", "D0", "", "dataType", "isSupportFeature", "isSupport", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface jki extends ag0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSportSettingAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSettingAbility.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ability/SportSettingAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1082:1\n37#2,2:1083\n40#2,2:1088\n37#2,5:1090\n37#2,5:1095\n37#2,5:1100\n37#2,5:1105\n37#2,5:1110\n37#2,5:1117\n37#2,5:1122\n37#2,5:1127\n37#2,5:1132\n37#2,5:1137\n37#2,5:1142\n37#2,5:1147\n37#2,5:1152\n37#2,5:1157\n37#2,5:1162\n37#2,5:1167\n37#2,5:1172\n37#2,5:1177\n37#2,5:1182\n37#2,5:1187\n37#2,5:1192\n37#2,5:1197\n37#2,5:1202\n37#2,5:1207\n37#2,5:1212\n37#2,5:1217\n37#2,5:1222\n37#2,5:1227\n37#2,5:1232\n37#2,5:1237\n37#2,5:1242\n37#2,5:1247\n37#2,5:1252\n37#2,5:1257\n37#2,5:1262\n37#2,5:1267\n37#2,5:1272\n37#2,5:1277\n37#2,5:1282\n37#2,5:1287\n37#2,5:1292\n37#2,5:1297\n37#2,5:1302\n37#2,5:1307\n37#2,5:1312\n37#2,5:1317\n37#2,5:1322\n37#2,5:1327\n37#2,5:1332\n37#2,5:1337\n37#2,5:1342\n37#2,5:1347\n37#2,5:1352\n37#2,5:1357\n37#2,5:1362\n1864#3,3:1085\n1855#3,2:1115\n*S KotlinDebug\n*F\n+ 1 SportSettingAbility.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ability/SportSettingAbility$DefaultImpls\n*L\n40#1:1083,2\n40#1:1088,2\n474#1:1090,5\n486#1:1095,5\n499#1:1100,5\n503#1:1105,5\n510#1:1110,5\n548#1:1117,5\n556#1:1122,5\n566#1:1127,5\n573#1:1132,5\n581#1:1137,5\n586#1:1142,5\n593#1:1147,5\n600#1:1152,5\n607#1:1157,5\n611#1:1162,5\n616#1:1167,5\n620#1:1172,5\n627#1:1177,5\n634#1:1182,5\n641#1:1187,5\n649#1:1192,5\n657#1:1197,5\n664#1:1202,5\n671#1:1207,5\n675#1:1212,5\n683#1:1217,5\n696#1:1222,5\n706#1:1227,5\n716#1:1232,5\n723#1:1237,5\n730#1:1242,5\n738#1:1247,5\n745#1:1252,5\n758#1:1257,5\n765#1:1262,5\n772#1:1267,5\n779#1:1272,5\n786#1:1277,5\n798#1:1282,5\n805#1:1287,5\n809#1:1292,5\n816#1:1297,5\n824#1:1302,5\n831#1:1307,5\n838#1:1312,5\n845#1:1317,5\n853#1:1322,5\n861#1:1327,5\n871#1:1332,5\n939#1:1337,5\n1019#1:1342,5\n1024#1:1347,5\n1028#1:1352,5\n1072#1:1357,5\n1077#1:1362,5\n348#1:1085,3\n523#1:1115,2\n*E\n"})
    public static final class a {
        public static boolean A(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.C0() && (deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea());
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean B(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.ja() || deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean C(jki jkiVar, int i) {
            Iterator<T> it = jkiVar.n5(false).iterator();
            while (it.hasNext()) {
                if (((SHSettingMainAdapter.d) it.next()).a == i) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0036  */
        /* JADX WARN: Code duplicated, block: B:20:0x003c  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        /* JADX WARN: Code duplicated, block: B:23:0x0047  */
        /* JADX WARN: Code duplicated, block: B:26:0x0050  */
        /* JADX WARN: Code duplicated, block: B:28:0x0056  */
        /* JADX WARN: Code duplicated, block: B:30:0x005c  */
        /* JADX WARN: Code duplicated, block: B:31:0x0061  */
        /* JADX WARN: Code duplicated, block: B:34:0x006a  */
        /* JADX WARN: Code duplicated, block: B:36:0x0070  */
        /* JADX WARN: Code duplicated, block: B:38:0x0076  */
        /* JADX WARN: Code duplicated, block: B:41:0x0082  */
        /* JADX WARN: Code duplicated, block: B:43:0x0088  */
        public static boolean D(@NotNull jki jkiVar) {
            UserDeviceInfo userDeviceInfoMa;
            UserDeviceInfo userDeviceInfoMa2;
            String firmwareVersion;
            UserDeviceInfo userDeviceInfoMa3;
            String firmwareVersion2;
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            if (!deviceInfo.Ta()) {
                if (!deviceInfo.ca() && !deviceInfo.ga()) {
                    if (deviceInfo.la()) {
                        UserDeviceInfo userDeviceInfoMa4 = deviceInfo.Ma();
                        if (!skl.f(userDeviceInfoMa4 != null ? userDeviceInfoMa4.getFirmwareVersion() : null, "A", 188)) {
                            if (!deviceInfo.da()) {
                                userDeviceInfoMa3 = deviceInfo.Ma();
                                if (userDeviceInfoMa3 != null) {
                                    firmwareVersion2 = userDeviceInfoMa3.getFirmwareVersion();
                                } else {
                                    firmwareVersion2 = null;
                                }
                                if (!skl.e(firmwareVersion2, 90)) {
                                    if (!deviceInfo.ka()) {
                                        userDeviceInfoMa2 = deviceInfo.Ma();
                                        if (userDeviceInfoMa2 != null) {
                                            firmwareVersion = userDeviceInfoMa2.getFirmwareVersion();
                                        } else {
                                            firmwareVersion = null;
                                        }
                                        if (!skl.e(firmwareVersion, ATCmdProfile.PushLanguageOfA5)) {
                                            if (!deviceInfo.ia()) {
                                                userDeviceInfoMa = deviceInfo.Ma();
                                                if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 30)) {
                                                    if (!jkiVar.Q0()) {
                                                    }
                                                }
                                            } else if (!jkiVar.Q0()) {
                                            }
                                        }
                                    } else if (!deviceInfo.ia()) {
                                        userDeviceInfoMa = deviceInfo.Ma();
                                        if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 30)) {
                                            if (!jkiVar.Q0()) {
                                            }
                                        }
                                    } else if (!jkiVar.Q0()) {
                                    }
                                }
                            } else if (!deviceInfo.ka()) {
                                userDeviceInfoMa2 = deviceInfo.Ma();
                                if (userDeviceInfoMa2 != null) {
                                    firmwareVersion = userDeviceInfoMa2.getFirmwareVersion();
                                } else {
                                    firmwareVersion = null;
                                }
                                if (!skl.e(firmwareVersion, ATCmdProfile.PushLanguageOfA5)) {
                                    if (!deviceInfo.ia()) {
                                        userDeviceInfoMa = deviceInfo.Ma();
                                        if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 30)) {
                                            if (!jkiVar.Q0()) {
                                            }
                                        }
                                    } else if (!jkiVar.Q0()) {
                                    }
                                }
                            } else if (!deviceInfo.ia()) {
                                userDeviceInfoMa = deviceInfo.Ma();
                                if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 30)) {
                                    if (!jkiVar.Q0()) {
                                    }
                                }
                            } else if (!jkiVar.Q0()) {
                            }
                        }
                    } else if (!deviceInfo.da()) {
                        userDeviceInfoMa3 = deviceInfo.Ma();
                        if (userDeviceInfoMa3 != null) {
                            firmwareVersion2 = userDeviceInfoMa3.getFirmwareVersion();
                        } else {
                            firmwareVersion2 = null;
                        }
                        if (!skl.e(firmwareVersion2, 90)) {
                            if (!deviceInfo.ka()) {
                                userDeviceInfoMa2 = deviceInfo.Ma();
                                if (userDeviceInfoMa2 != null) {
                                    firmwareVersion = userDeviceInfoMa2.getFirmwareVersion();
                                } else {
                                    firmwareVersion = null;
                                }
                                if (!skl.e(firmwareVersion, ATCmdProfile.PushLanguageOfA5)) {
                                    if (!deviceInfo.ia()) {
                                        userDeviceInfoMa = deviceInfo.Ma();
                                        if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 30)) {
                                            if (!jkiVar.Q0()) {
                                            }
                                        }
                                    } else if (!jkiVar.Q0()) {
                                    }
                                }
                            } else if (!deviceInfo.ia()) {
                                userDeviceInfoMa = deviceInfo.Ma();
                                if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 30)) {
                                    if (!jkiVar.Q0()) {
                                    }
                                }
                            } else if (!jkiVar.Q0()) {
                            }
                        }
                    } else if (!deviceInfo.ka()) {
                        userDeviceInfoMa2 = deviceInfo.Ma();
                        if (userDeviceInfoMa2 != null) {
                            firmwareVersion = userDeviceInfoMa2.getFirmwareVersion();
                        } else {
                            firmwareVersion = null;
                        }
                        if (!skl.e(firmwareVersion, ATCmdProfile.PushLanguageOfA5)) {
                            if (!deviceInfo.ia()) {
                                userDeviceInfoMa = deviceInfo.Ma();
                                if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 30)) {
                                    if (!jkiVar.Q0()) {
                                    }
                                }
                            } else if (!jkiVar.Q0()) {
                            }
                        }
                    } else if (!deviceInfo.ia()) {
                        userDeviceInfoMa = deviceInfo.Ma();
                        if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 30)) {
                            if (!jkiVar.Q0()) {
                            }
                        }
                    } else if (!jkiVar.Q0() || deviceInfo.ea()) {
                    }
                }
                return true;
            }
            return false;
        }

        public static boolean E(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean F(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0026  */
        /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN, SYNTHETIC] */
        public static boolean G(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            if (!deviceInfo.V9()) {
                if (deviceInfo.ja()) {
                    UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                    if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 75)) {
                        if (deviceInfo.Z9()) {
                            return false;
                        }
                    }
                } else if (deviceInfo.Z9()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean H(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean I(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.ca() || (deviceInfo.la() && deviceInfo.Ua(70)) || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean J(@NotNull jki jkiVar) {
            return C(jkiVar, 5);
        }

        public static boolean K(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.ja() || deviceInfo.Q9() || deviceInfo.ha() || deviceInfo.V9() || deviceInfo.G9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean L(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean M(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean N(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return (deviceInfo.O9() || deviceInfo.C9() || !g.u()) ? false : true;
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean O(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.C9() || deviceInfo.ha() || deviceInfo.Q9() || deviceInfo.ja() || deviceInfo.G9();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean P(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.C9() || deviceInfo.ha() || deviceInfo.Q9() || deviceInfo.ja() || deviceInfo.H9() || deviceInfo.G9();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean Q(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return jkiVar.Q0() || ((deviceInfo.la() || deviceInfo.ca()) && deviceInfo.Ua(240));
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean R(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean S(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            if (deviceInfo.C9()) {
                UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                if (!skl.d(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null)) {
                    return false;
                }
            }
            if (deviceInfo.O9()) {
                UserDeviceInfo userDeviceInfoMa2 = deviceInfo.Ma();
                if (!skl.i(userDeviceInfoMa2 != null ? userDeviceInfoMa2.getFirmwareVersion() : null)) {
                    return false;
                }
            }
            return true;
        }

        public static boolean T(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            if (!deviceInfo.C9()) {
                if (deviceInfo.O9()) {
                    UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                    if (skl.g(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null)) {
                    }
                }
                return true;
            }
            return false;
        }

        public static boolean U(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                return false;
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean V(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.ja() || deviceInfo.H9() || deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.G9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean W(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return (deviceInfo.la() && deviceInfo.Ua(240)) || jkiVar.Q0() || deviceInfo.ga() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0028  */
        /* JADX WARN: Code duplicated, block: B:16:0x002e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0034  */
        /* JADX WARN: Code duplicated, block: B:21:0x003e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0044  */
        public static boolean X(@NotNull jki jkiVar) {
            UserDeviceInfo userDeviceInfoMa;
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            if (!deviceInfo.V9()) {
                if (deviceInfo.ja()) {
                    UserDeviceInfo userDeviceInfoMa2 = deviceInfo.Ma();
                    if (!skl.e(userDeviceInfoMa2 != null ? userDeviceInfoMa2.getFirmwareVersion() : null, 75)) {
                        if (!deviceInfo.Ya()) {
                            userDeviceInfoMa = deviceInfo.Ma();
                            if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 75)) {
                                if (deviceInfo.Z9()) {
                                }
                            }
                        } else if (deviceInfo.Z9()) {
                        }
                    }
                } else if (!deviceInfo.Ya()) {
                    userDeviceInfoMa = deviceInfo.Ma();
                    if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 75)) {
                        if (deviceInfo.Z9()) {
                        }
                    }
                } else if (deviceInfo.Z9() && !deviceInfo.ka() && !deviceInfo.la() && !deviceInfo.ga() && !jkiVar.Q0() && !deviceInfo.ea()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean Y(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.qa(DeviceConstants.b.b.c.INSTANCE) || (deviceInfo.ma() && deviceInfo.Ua(180)) || ((deviceInfo.la() || deviceInfo.ca()) && deviceInfo.Ua(240));
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean Z(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                return false;
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        @NotNull
        public static DeviceSettings.SettingAbility a(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            if (jkiVar.x1()) {
                DeviceSettingAbilityGenerate deviceSettingAbilityGenerate = DeviceSettingAbilityGenerate.INSTANCE;
                String strOa = deviceInfo.Oa();
                if (strOa == null) {
                    strOa = "";
                }
                DeviceSettings.SettingAbility settingAbilityR = deviceSettingAbilityGenerate.r(strOa);
                if (settingAbilityR != null) {
                    return settingAbilityR;
                }
            }
            if (deviceInfo.ma()) {
                return DeviceSettingAbilityGenerate.INSTANCE.g();
            }
            if (deviceInfo.ga()) {
                return DeviceSettingAbilityGenerate.INSTANCE.m();
            }
            if (deviceInfo.ca()) {
                return DeviceSettingAbilityGenerate.INSTANCE.l();
            }
            if (deviceInfo.la()) {
                return DeviceSettingAbilityGenerate.INSTANCE.o();
            }
            if (deviceInfo.da() || deviceInfo.ka()) {
                return DeviceSettingAbilityGenerate.INSTANCE.b();
            }
            if (deviceInfo.Z9()) {
                return DeviceSettingAbilityGenerate.INSTANCE.k();
            }
            if (deviceInfo.V9()) {
                return DeviceSettingAbilityGenerate.INSTANCE.j();
            }
            if (deviceInfo.Q9()) {
                return DeviceSettingAbilityGenerate.INSTANCE.i();
            }
            if (deviceInfo.O9()) {
                return DeviceSettingAbilityGenerate.INSTANCE.h();
            }
            if (deviceInfo.ha()) {
                return DeviceSettingAbilityGenerate.INSTANCE.n();
            }
            if (deviceInfo.G9()) {
                return DeviceSettingAbilityGenerate.INSTANCE.d();
            }
            if (deviceInfo.C9()) {
                return DeviceSettingAbilityGenerate.INSTANCE.c();
            }
            return deviceInfo.H9() ? DeviceSettingAbilityGenerate.INSTANCE.f() : DeviceSettingAbilityGenerate.INSTANCE.e();
        }

        public static boolean a0(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            if (!if0.E()) {
                return true;
            }
            if (deviceInfo.O9()) {
                UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                if (skl.h(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public static List<HeartRateSettingBean> b(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            ArrayList arrayList = new ArrayList();
            if (deviceInfo.C9() || deviceInfo.ha() || deviceInfo.G9()) {
                String string = e88.a().getString(R.string.settings_heart_rate_detech_per_six_minute);
                Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …te_detech_per_six_minute)");
                String string2 = e88.a().getString(R.string.settings_heart_rate_detech_per_six_minute_desc_v2);
                Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …h_per_six_minute_desc_v2)");
                arrayList.add(new HeartRateSettingBean(string, string2, 2, false));
                String string3 = e88.a().getString(R.string.settings_heart_rate_detech_per_two_minute);
                Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …te_detech_per_two_minute)");
                String string4 = e88.a().getString(R.string.settings_heart_rate_detech_per_two_minute_desc_v2);
                Intrinsics.checkNotNullExpressionValue(string4, "getAppContext()\n        …h_per_two_minute_desc_v2)");
                arrayList.add(new HeartRateSettingBean(string3, string4, 1, false));
                if (deviceInfo.C9()) {
                    String string5 = e88.a().getString(R.string.settings_real_time_monitor_title);
                    Intrinsics.checkNotNullExpressionValue(string5, "getAppContext()\n        …_real_time_monitor_title)");
                    String string6 = e88.a().getString(R.string.settings_real_time_monitor_desc);
                    Intrinsics.checkNotNullExpressionValue(string6, "getAppContext()\n        …s_real_time_monitor_desc)");
                    arrayList.add(new HeartRateSettingBean(string5, string6, 0, false));
                } else {
                    String string7 = e88.a().getString(R.string.settings_real_time_monitor_title);
                    Intrinsics.checkNotNullExpressionValue(string7, "getAppContext()\n        …_real_time_monitor_title)");
                    String string8 = e88.a().getString(R.string.settings_real_time_monitor_desc);
                    Intrinsics.checkNotNullExpressionValue(string8, "getAppContext()\n        …s_real_time_monitor_desc)");
                    arrayList.add(new HeartRateSettingBean(string7, string8, 4, false));
                }
            } else if (deviceInfo.O9()) {
                String string9 = e88.a().getString(R.string.settings_interval_monitor_title);
                Intrinsics.checkNotNullExpressionValue(string9, "getAppContext()\n        …s_interval_monitor_title)");
                String string10 = e88.a().getString(R.string.settings_heart_rate_detech_per_two_minute_desc_v2);
                Intrinsics.checkNotNullExpressionValue(string10, "getAppContext()\n        …h_per_two_minute_desc_v2)");
                HeartRateSettingBean heartRateSettingBean = new HeartRateSettingBean(string9, string10, 1, false);
                String string11 = e88.a().getString(R.string.settings_real_time_monitor_title);
                Intrinsics.checkNotNullExpressionValue(string11, "getAppContext()\n        …_real_time_monitor_title)");
                String string12 = e88.a().getString(R.string.settings_real_time_monitor_desc);
                Intrinsics.checkNotNullExpressionValue(string12, "getAppContext()\n        …s_real_time_monitor_desc)");
                HeartRateSettingBean heartRateSettingBean2 = new HeartRateSettingBean(string11, string12, 4, false);
                arrayList.add(heartRateSettingBean);
                arrayList.add(heartRateSettingBean2);
            } else {
                String string13 = e88.a().getString(R.string.settings_monitor_ai);
                Intrinsics.checkNotNullExpressionValue(string13, "getAppContext().getStrin…ring.settings_monitor_ai)");
                String string14 = e88.a().getString(R.string.settings_monitor_ai_desc_v2);
                Intrinsics.checkNotNullExpressionValue(string14, "getAppContext()\n        …tings_monitor_ai_desc_v2)");
                HeartRateSettingBean heartRateSettingBean3 = new HeartRateSettingBean(string13, string14, 3, false);
                String string15 = e88.a().getString(R.string.settings_real_time_monitor_title);
                Intrinsics.checkNotNullExpressionValue(string15, "getAppContext()\n        …_real_time_monitor_title)");
                String string16 = e88.a().getString(R.string.settings_real_time_monitor_desc);
                Intrinsics.checkNotNullExpressionValue(string16, "getAppContext()\n        …s_real_time_monitor_desc)");
                HeartRateSettingBean heartRateSettingBean4 = new HeartRateSettingBean(string15, string16, 4, false);
                arrayList.add(heartRateSettingBean3);
                arrayList.add(heartRateSettingBean4);
            }
            return arrayList;
        }

        public static boolean b0(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.Z9() || deviceInfo.ka();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        @NotNull
        public static List<SportHealthSetting> c(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(SportHealthSetting.CALORIE_GOAL_VALUE);
            arrayList.add(SportHealthSetting.STEP_GOAL_VALUE);
            if (jkiVar.E8()) {
                arrayList.add(SportHealthSetting.EXERCISE_TIME_GOAL_VALUE);
                arrayList.add(SportHealthSetting.ACTIVITY_GOAL_VALUE);
            }
            arrayList.add(SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE);
            arrayList.add(SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE);
            if (jkiVar.o0()) {
                arrayList.add(SportHealthSetting.SPORTS_GOAL_VALUE);
            }
            if (jkiVar.C7()) {
                arrayList.add(SportHealthSetting.MENSTRUAL_CYCLE_ENABLE);
            }
            arrayList.add(SportHealthSetting.SEDENTARY_REMIND_ENABLE);
            if (jkiVar.H2()) {
                arrayList.add(SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE);
            }
            if (jkiVar.i7()) {
                arrayList.add(SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE);
                arrayList.add(SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE);
                arrayList.add(SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE);
            }
            if (jkiVar.M1()) {
                arrayList.add(SportHealthSetting.FALL_DOWN_ENABLE);
            }
            arrayList.add(SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE);
            arrayList.add(SportHealthSetting.AFIB_ENABLE);
            if (jkiVar.u0()) {
                arrayList.add(SportHealthSetting.STRESS_AUTO_MEASURE_ENABLE);
                arrayList.add(SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE);
            }
            if (jkiVar.D1()) {
                arrayList.add(SportHealthSetting.MEDITATION_BREATH_VALUE);
            }
            if (jkiVar.f8()) {
                arrayList.add(SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE);
                arrayList.add(SportHealthSetting.LOW_SPO2_WARNING_ENABLE);
            }
            if (jkiVar.O5()) {
                if (jkiVar.B7()) {
                    arrayList.add(SportHealthSetting.SLEEP_APNEA_MONITORING);
                } else {
                    arrayList.add(SportHealthSetting.OSA_ENABLE);
                }
            }
            if (jkiVar.A4()) {
                arrayList.add(SportHealthSetting.SLEEP_BREATHING_RATE_ENABLE);
            }
            if (jkiVar.X2()) {
                arrayList.add(SportHealthSetting.SLEEP_REM_ENABLE);
            }
            if (jkiVar.w3()) {
                arrayList.add(SportHealthSetting.ACHIEVEMENT_REMINDER_ENABLE);
            }
            if (m(jkiVar, jkiVar.o5().getGoalSetting())) {
                arrayList.add(SportHealthSetting.NAP_NEWGOALSETTINGSELECTED);
                arrayList.add(SportHealthSetting.NAP_REGULAREARLYBEDTIME);
                arrayList.add(SportHealthSetting.NAP_SUNSHINEDURATION);
            }
            return arrayList;
        }

        public static boolean c0(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                return ((DeviceInfo) jkiVar).qa(DeviceConstants.b.b.g.INSTANCE);
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        @NotNull
        public static List<SHSettingMainAdapter.d> d(@NotNull jki jkiVar, boolean z) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            ArrayList arrayList = new ArrayList();
            SHSettingMainAdapter.d dVarC = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_activity));
            Intrinsics.checkNotNullExpressionValue(dVarC, "createTitleItem(\n       …s_activity)\n            )");
            arrayList.add(dVarC);
            int i = 0;
            SHSettingMainAdapter.d dVarB = SHSettingMainAdapter.d.b(0, SportHealthSetting.STEP_GOAL_VALUE);
            Intrinsics.checkNotNullExpressionValue(dVarB, "createSettingItem(\n     …_GOAL_VALUE\n            )");
            arrayList.add(dVarB);
            SHSettingMainAdapter.d dVarA = SHSettingMainAdapter.d.a(2);
            Intrinsics.checkNotNullExpressionValue(dVarA, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
            arrayList.add(dVarA);
            SHSettingMainAdapter.d dVarB2 = SHSettingMainAdapter.d.b(1, SportHealthSetting.CALORIE_GOAL_VALUE);
            Intrinsics.checkNotNullExpressionValue(dVarB2, "createSettingItem(\n     …_GOAL_VALUE\n            )");
            arrayList.add(dVarB2);
            if (jkiVar.E8() && deviceInfo.C0()) {
                SHSettingMainAdapter.d dVarA2 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA2, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA2);
                SHSettingMainAdapter.d dVarB3 = SHSettingMainAdapter.d.b(35, SportHealthSetting.EXERCISE_TIME_GOAL_VALUE);
                Intrinsics.checkNotNullExpressionValue(dVarB3, "createSettingItem(\n     …L_VALUE\n                )");
                arrayList.add(dVarB3);
                SHSettingMainAdapter.d dVarA3 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA3, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA3);
                SHSettingMainAdapter.d dVarB4 = SHSettingMainAdapter.d.b(36, SportHealthSetting.ACTIVITY_GOAL_VALUE);
                Intrinsics.checkNotNullExpressionValue(dVarB4, "createSettingItem(\n     …L_VALUE\n                )");
                arrayList.add(dVarB4);
            }
            if (z) {
                return arrayList;
            }
            SHSettingMainAdapter.d dVarA4 = SHSettingMainAdapter.d.a(2);
            Intrinsics.checkNotNullExpressionValue(dVarA4, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
            arrayList.add(dVarA4);
            SHSettingMainAdapter.d dVarB5 = SHSettingMainAdapter.d.b(3, SportHealthSetting.SEDENTARY_REMIND_ENABLE);
            Intrinsics.checkNotNullExpressionValue(dVarB5, "createSettingItem(\n     …MIND_ENABLE\n            )");
            arrayList.add(dVarB5);
            if (jkiVar.i7()) {
                SHSettingMainAdapter.d dVarA5 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA5, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA5);
                SHSettingMainAdapter.d dVarB6 = SHSettingMainAdapter.d.b(23, SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB6, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB6);
            }
            if (jkiVar.M1()) {
                SHSettingMainAdapter.d dVarC2 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_security_guard));
                Intrinsics.checkNotNullExpressionValue(dVarC2, "createTitleItem(\n       …_guard)\n                )");
                arrayList.add(dVarC2);
                SHSettingMainAdapter.d dVarB7 = SHSettingMainAdapter.d.b(21, SportHealthSetting.FALL_DOWN_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB7, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB7);
            }
            SHSettingMainAdapter.d dVarC3 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_heart_guard));
            Intrinsics.checkNotNullExpressionValue(dVarC3, "createTitleItem(\n       …eart_guard)\n            )");
            arrayList.add(dVarC3);
            if (deviceInfo.O9() && jkiVar.z5()) {
                SHSettingMainAdapter.d dVarB8 = SHSettingMainAdapter.d.b(4, SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB8, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB8);
            } else {
                SHSettingMainAdapter.d dVarB9 = SHSettingMainAdapter.d.b(10, SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB9, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB9);
            }
            SHSettingMainAdapter.d dVarA6 = SHSettingMainAdapter.d.a(2);
            Intrinsics.checkNotNullExpressionValue(dVarA6, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
            arrayList.add(dVarA6);
            SHSettingMainAdapter.d dVarB10 = SHSettingMainAdapter.d.b(5, SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE);
            Intrinsics.checkNotNullExpressionValue(dVarB10, "createSettingItem(\n     …TION_ENABLE\n            )");
            arrayList.add(dVarB10);
            SHSettingMainAdapter.d dVarA7 = SHSettingMainAdapter.d.a(2);
            Intrinsics.checkNotNullExpressionValue(dVarA7, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
            arrayList.add(dVarA7);
            SHSettingMainAdapter.d dVarB11 = SHSettingMainAdapter.d.b(6, SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE);
            Intrinsics.checkNotNullExpressionValue(dVarB11, "createSettingItem(\n     …TION_ENABLE\n            )");
            arrayList.add(dVarB11);
            if (jkiVar.V()) {
                SHSettingMainAdapter.d dVarA8 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA8, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA8);
                SHSettingMainAdapter.d dVarB12 = SHSettingMainAdapter.d.b(22, SportHealthSetting.AFIB_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB12, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB12);
            }
            if (jkiVar.G5()) {
                SHSettingMainAdapter.d dVarC4 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_blood_sugar_setting));
                Intrinsics.checkNotNullExpressionValue(dVarC4, "createTitleItem(\n       …etting)\n                )");
                arrayList.add(dVarC4);
                SHSettingMainAdapter.d dVarB13 = SHSettingMainAdapter.d.b(38, SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB13, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB13);
            }
            if (jkiVar.u0()) {
                if (jkiVar.e()) {
                    SHSettingMainAdapter.d dVarC5 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_physical_mental_health));
                    Intrinsics.checkNotNullExpressionValue(dVarC5, "createTitleItem(\n       …th)\n                    )");
                    arrayList.add(dVarC5);
                } else {
                    SHSettingMainAdapter.d dVarC6 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_stress));
                    Intrinsics.checkNotNullExpressionValue(dVarC6, "createTitleItem(\n       …ss)\n                    )");
                    arrayList.add(dVarC6);
                }
                SHSettingMainAdapter.d dVarB14 = SHSettingMainAdapter.d.b(11, SportHealthSetting.STRESS_AUTO_MEASURE_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB14, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB14);
                SHSettingMainAdapter.d dVarA9 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA9, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA9);
                SHSettingMainAdapter.d dVarB15 = SHSettingMainAdapter.d.b(12, SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB15, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB15);
                if (jkiVar.w3()) {
                    SHSettingMainAdapter.d dVarA10 = SHSettingMainAdapter.d.a(2);
                    Intrinsics.checkNotNullExpressionValue(dVarA10, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                    arrayList.add(dVarA10);
                    SHSettingMainAdapter.d dVarB16 = SHSettingMainAdapter.d.b(44, SportHealthSetting.ACHIEVEMENT_REMINDER_ENABLE);
                    Intrinsics.checkNotNullExpressionValue(dVarB16, "createSettingItem(\n     …BLE\n                    )");
                    arrayList.add(dVarB16);
                }
                if (jkiVar.D1()) {
                    SHSettingMainAdapter.d dVarA11 = SHSettingMainAdapter.d.a(2);
                    Intrinsics.checkNotNullExpressionValue(dVarA11, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                    arrayList.add(dVarA11);
                    SHSettingMainAdapter.d dVarB17 = SHSettingMainAdapter.d.b(43, SportHealthSetting.MEDITATION_BREATH_VALUE);
                    Intrinsics.checkNotNullExpressionValue(dVarB17, "createSettingItem(\n     …LUE\n                    )");
                    arrayList.add(dVarB17);
                }
            }
            if (jkiVar.f8()) {
                SHSettingMainAdapter.d dVarC7 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_spo2));
                Intrinsics.checkNotNullExpressionValue(dVarC7, "createTitleItem(\n       …s_spo2)\n                )");
                arrayList.add(dVarC7);
                SHSettingMainAdapter.d dVarB18 = SHSettingMainAdapter.d.b(31, SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB18, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB18);
            }
            if (jkiVar.g()) {
                SHSettingMainAdapter.d dVarC8 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_wrist_temperature));
                Intrinsics.checkNotNullExpressionValue(dVarC8, "createTitleItem(\n       …rature)\n                )");
                arrayList.add(dVarC8);
                SHSettingMainAdapter.d dVarB19 = SHSettingMainAdapter.d.b(40, SportHealthSetting.WRIST_TEMPERATURE_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB19, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB19);
            }
            if (jkiVar.C7()) {
                SHSettingMainAdapter.d dVarC9 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_menstrual_cycle));
                Intrinsics.checkNotNullExpressionValue(dVarC9, "createTitleItem(\n       …_cycle)\n                )");
                arrayList.add(dVarC9);
                SHSettingMainAdapter.d dVarB20 = SHSettingMainAdapter.d.b(41, SportHealthSetting.MENSTRUAL_CYCLE_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB20, "createSettingItem(Consta…g.MENSTRUAL_CYCLE_ENABLE)");
                arrayList.add(dVarB20);
            }
            SHSettingMainAdapter.d dVarC10 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_sleep));
            Intrinsics.checkNotNullExpressionValue(dVarC10, "createTitleItem(\n       …ings_sleep)\n            )");
            arrayList.add(dVarC10);
            ArrayList arrayList2 = new ArrayList();
            if (jkiVar.O5() || jkiVar.B6()) {
                SHSettingMainAdapter.d dVarB21 = SHSettingMainAdapter.d.b(29, jkiVar.B6() ? SportHealthSetting.OXIMETRY : jkiVar.B7() ? SportHealthSetting.SLEEP_APNEA_MONITORING : SportHealthSetting.OSA_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB21, "createSettingItem(\n     …Setting\n                )");
                arrayList2.add(dVarB21);
            }
            if (jkiVar.j4()) {
                SHSettingMainAdapter.d dVarB22 = SHSettingMainAdapter.d.b(9, SportHealthSetting.OXIMETRY);
                Intrinsics.checkNotNullExpressionValue(dVarB22, "createSettingItem(\n     …XIMETRY\n                )");
                arrayList2.add(dVarB22);
            }
            if (jkiVar.A4()) {
                SHSettingMainAdapter.d dVarB23 = SHSettingMainAdapter.d.b(30, SportHealthSetting.SLEEP_BREATHING_RATE_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB23, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList2.add(dVarB23);
            }
            if (jkiVar.X2()) {
                SHSettingMainAdapter.d dVarB24 = SHSettingMainAdapter.d.b(15, SportHealthSetting.SLEEP_REM_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB24, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList2.add(dVarB24);
            }
            Object objNavigation = e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
            ISleepDataService iSleepDataService = objNavigation instanceof ISleepDataService ? (ISleepDataService) objNavigation : null;
            if (iSleepDataService != null && iSleepDataService.F5()) {
                SHSettingMainAdapter.d dVarA12 = SHSettingMainAdapter.d.a(100);
                Intrinsics.checkNotNullExpressionValue(dVarA12, "createDataItem(Constants…TYPE_SLEEP_MODEL_SETTING)");
                arrayList2.add(dVarA12);
            }
            if (jkiVar.z3()) {
                SHSettingMainAdapter.d dVarA13 = SHSettingMainAdapter.d.a(151);
                Intrinsics.checkNotNullExpressionValue(dVarA13, "createDataItem(Constants…m.ITEM_SLEEP_CALIBRATION)");
                arrayList2.add(dVarA13);
            }
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add((SHSettingMainAdapter.d) obj);
                if (i != arrayList2.size() - 1) {
                    SHSettingMainAdapter.d dVarA14 = SHSettingMainAdapter.d.a(2);
                    Intrinsics.checkNotNullExpressionValue(dVarA14, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                    arrayList.add(dVarA14);
                }
                i = i2;
            }
            SHSettingMainAdapter.d dVarC11 = SHSettingMainAdapter.d.c(e88.a().getString(R.string.settings_sports));
            Intrinsics.checkNotNullExpressionValue(dVarC11, "createTitleItem(\n       …ngs_sports)\n            )");
            arrayList.add(dVarC11);
            if (jkiVar.o0()) {
                SHSettingMainAdapter.d dVarB25 = SHSettingMainAdapter.d.b(42, SportHealthSetting.SPORTS_GOAL_VALUE);
                Intrinsics.checkNotNullExpressionValue(dVarB25, "createSettingItem(\n     …L_VALUE\n                )");
                arrayList.add(dVarB25);
                SHSettingMainAdapter.d dVarA15 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA15, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA15);
            }
            if (jkiVar.x8()) {
                SHSettingMainAdapter.d dVarB26 = SHSettingMainAdapter.d.b(8, SportHealthSetting.AUTO_PAUSE_SPORT_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB26, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB26);
            }
            if (jkiVar.z()) {
                SHSettingMainAdapter.d dVarA16 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA16, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA16);
                SHSettingMainAdapter.d dVarB27 = SHSettingMainAdapter.d.b(7, SportHealthSetting.AUTO_RECOGNIZE_SPORT_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB27, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB27);
            }
            if (jkiVar.j1()) {
                SHSettingMainAdapter.d dVarB28 = SHSettingMainAdapter.d.b(45, SportHealthSetting.END_SPORT_REMINDER_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB28, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB28);
                SHSettingMainAdapter.d dVarB29 = SHSettingMainAdapter.d.b(46, SportHealthSetting.CONTINUE_SPORT_REMINDER_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB29, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB29);
            }
            if (jkiVar.N0()) {
                SHSettingMainAdapter.d dVarA17 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA17, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA17);
                SHSettingMainAdapter.d dVarB30 = SHSettingMainAdapter.d.b(32, SportHealthSetting.SPORTS_VOICE_BROADCAST_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB30, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB30);
            }
            if (jkiVar.b4()) {
                SHSettingMainAdapter.d dVarA18 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA18, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA18);
                SHSettingMainAdapter.d dVarB31 = SHSettingMainAdapter.d.b(37, SportHealthSetting.DOUBLE_CLICK_SCREEN_VOICE_BROADCAST_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB31, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB31);
            }
            if (jkiVar.I7()) {
                SHSettingMainAdapter.d dVarA19 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA19, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA19);
                SHSettingMainAdapter.d dVarB32 = SHSettingMainAdapter.d.b(33, SportHealthSetting.BUTTON_TO_PAUSE_OR_RESUME_ENABLE);
                Intrinsics.checkNotNullExpressionValue(dVarB32, "createSettingItem(\n     …_ENABLE\n                )");
                arrayList.add(dVarB32);
            }
            if (jkiVar.D0()) {
                SHSettingMainAdapter.d dVarB33 = SHSettingMainAdapter.d.b(33, SportHealthSetting.NAP_NEWGOALSETTINGSELECTED);
                Intrinsics.checkNotNullExpressionValue(dVarB33, "createSettingItem(\n     …ELECTED\n                )");
                arrayList.add(dVarB33);
                SHSettingMainAdapter.d dVarB34 = SHSettingMainAdapter.d.b(33, SportHealthSetting.NAP_SUNSHINEDURATION);
                Intrinsics.checkNotNullExpressionValue(dVarB34, "createSettingItem(\n     …URATION\n                )");
                arrayList.add(dVarB34);
                SHSettingMainAdapter.d dVarB35 = SHSettingMainAdapter.d.b(33, SportHealthSetting.NAP_REGULAREARLYBEDTIME);
                Intrinsics.checkNotNullExpressionValue(dVarB35, "createSettingItem(\n     …BEDTIME\n                )");
                arrayList.add(dVarB35);
            }
            if (jkiVar.Q7()) {
                if (jkiVar.C4()) {
                    SHSettingMainAdapter.d dVarA20 = SHSettingMainAdapter.d.a(2);
                    Intrinsics.checkNotNullExpressionValue(dVarA20, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                    arrayList.add(dVarA20);
                    SHSettingMainAdapter.d dVarA21 = SHSettingMainAdapter.d.a(19);
                    Intrinsics.checkNotNullExpressionValue(dVarA21, "createDataItem(Constants…SPORTS_DATA_SET_ENTRANCE)");
                    arrayList.add(dVarA21);
                }
                SHSettingMainAdapter.d dVarA22 = SHSettingMainAdapter.d.a(2);
                Intrinsics.checkNotNullExpressionValue(dVarA22, "createDataItem(Constants.ITEM_TYPE_DIVIDER)");
                arrayList.add(dVarA22);
                SHSettingMainAdapter.d dVarA23 = SHSettingMainAdapter.d.a(20);
                Intrinsics.checkNotNullExpressionValue(dVarA23, "createDataItem(Constants…E_CUSTOM_SPORTS_ENTRANCE)");
                arrayList.add(dVarA23);
            }
            return arrayList;
        }

        public static boolean d0(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static /* synthetic */ List e(jki jkiVar, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShsSettingItem");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return jkiVar.n5(z);
        }

        public static boolean f(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                return ((DeviceInfo) jkiVar).C9();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean g(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                return jkiVar.Q0();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean h(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return !(!deviceInfo.M9() || deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka()) || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean i(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return jkiVar.Q0() || ((deviceInfo.la() || deviceInfo.ca()) && deviceInfo.Ua(240)) || ((deviceInfo.ka() && deviceInfo.Ua(200)) || ((deviceInfo.da() && deviceInfo.Ua(120)) || ((deviceInfo.ia() && deviceInfo.Ua(60)) || (deviceInfo.aa() && deviceInfo.Ua(VAProto.VoiceAssistant.S_VA_ID_VALUE)))));
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean j(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean k(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.G9() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean l(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            boolean z = false;
            if (!deviceInfo.ka() && !deviceInfo.Z9()) {
                z = true;
                if (deviceInfo.O9()) {
                    UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                    skl.h(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null);
                }
            }
            return z;
        }

        public static boolean m(jki jkiVar, int i) {
            return i > 0;
        }

        public static boolean n(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.ja() || deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.G9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean o(@NotNull jki jkiVar) {
            return C(jkiVar, 22);
        }

        public static boolean p(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return jkiVar.Q0() || ((deviceInfo.la() || deviceInfo.ca()) && deviceInfo.Ua(240));
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean q(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.ca() || (deviceInfo.la() && deviceInfo.Ua(120)) || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean r(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.O9() || deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.C9() || deviceInfo.ha() || deviceInfo.H9() || deviceInfo.G9();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean s(@NotNull jki jkiVar) {
            if (!(jkiVar instanceof DeviceInfo)) {
                throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
            if (!deviceInfo.Z9() && !deviceInfo.ka() && !deviceInfo.la() && !jkiVar.Q0() && !deviceInfo.ea()) {
                return false;
            }
            Object objNavigation = e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
            ISleepDataService iSleepDataService = objNavigation instanceof ISleepDataService ? (ISleepDataService) objNavigation : null;
            return iSleepDataService != null && iSleepDataService.R0(deviceInfo.Oa());
        }

        public static boolean t(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.ma() || deviceInfo.ea() || ((deviceInfo.la() || deviceInfo.ca()) && deviceInfo.Ua(240));
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean u(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return jkiVar.C4() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean v(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.Q9() || deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean w(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.ja() || deviceInfo.V9() || deviceInfo.G9() || deviceInfo.Ya() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean x(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.V9() || deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean y(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return deviceInfo.Z9() || deviceInfo.ka() || deviceInfo.la() || deviceInfo.ga() || jkiVar.Q0() || deviceInfo.ea();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean z(@NotNull jki jkiVar) {
            if (jkiVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) jkiVar;
                return !deviceInfo.O9() && deviceInfo.bb();
            }
            throw new RuntimeException(jkiVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean A4();

    boolean B6();

    boolean B7();

    boolean C4();

    boolean C7();

    boolean D0();

    boolean D1();

    boolean E8();

    boolean G5();

    boolean H2();

    boolean I7();

    boolean J3();

    boolean M1();

    boolean N0();

    boolean N2();

    boolean O5();

    boolean O6();

    boolean Q0();

    boolean Q7();

    boolean S4();

    boolean T1();

    boolean T2();

    boolean U();

    boolean U2();

    boolean V();

    boolean W4();

    @NotNull
    List<HeartRateSettingBean> X0();

    boolean X2();

    boolean b4();

    boolean e();

    boolean e1();

    boolean e8();

    boolean f();

    boolean f4();

    boolean f8();

    boolean g();

    boolean h1();

    boolean i1();

    boolean i7();

    boolean j1();

    boolean j4();

    boolean j7();

    @NotNull
    List<SHSettingMainAdapter.d> n5(boolean onlyStepAndCalorie);

    boolean o0();

    @NotNull
    DeviceSettings.SettingAbility o5();

    @NotNull
    List<SportHealthSetting> p8();

    boolean u0();

    boolean w3();

    boolean x1();

    boolean x8();

    boolean z();

    boolean z3();

    boolean z5();
}