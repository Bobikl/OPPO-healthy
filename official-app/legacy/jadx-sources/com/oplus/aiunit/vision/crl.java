package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Color;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.business.creation.engine.compress.CompressType;
import com.heytap.health.watchface.provider.WatchFaceDeviceProvider;
import com.heytap.health.watchface.utils.PowerTipsUtil;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/crl;", "Lcom/oplus/aiunit/vision/if0;", "", LogFieldKey.LEVEL_KEY, "", "Q5", "Lcom/oplus/aiunit/vision/s3;", c8l.KEY_B0, ExifInterface.LONGITUDE_WEST, "c1", "f2", "N2", "s8", "w3", "deviceType", "c7", LogFieldKey.PROCESS_NAME_KEY, "", "kotlin.jvm.PlatformType", "R7", "U1", "M7", "i6", "errorCode", "v1", "L2", "Lcom/heytap/health/watchface/business/creation/engine/compress/CompressType;", "T0", "k3", "P4", "index", "i2", "Landroid/content/Context;", "context", "powerDegree", "R3", "W5", "r4", "P1", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface crl extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWfAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WfAbility.kt\ncom/heytap/health/watchface/adaptation/ability/WfAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,500:1\n37#2,5:501\n37#2,5:506\n37#2,5:511\n37#2,5:516\n37#2,5:521\n37#2,5:526\n37#2,5:531\n37#2,5:536\n37#2,5:541\n37#2,5:546\n37#2,5:551\n30#2,5:556\n37#2,5:561\n37#2,5:566\n37#2,5:571\n37#2,5:576\n37#2,5:581\n30#2,5:586\n30#2,5:591\n37#2,5:596\n37#2,5:601\n37#2,5:606\n37#2,5:611\n30#2,5:616\n30#2,5:621\n37#2,5:626\n37#2,5:631\n37#2,5:636\n*S KotlinDebug\n*F\n+ 1 WfAbility.kt\ncom/heytap/health/watchface/adaptation/ability/WfAbility$Info$DefaultImpls\n*L\n94#1:501,5\n104#1:506,5\n108#1:511,5\n118#1:516,5\n122#1:521,5\n126#1:526,5\n130#1:531,5\n139#1:536,5\n146#1:541,5\n155#1:546,5\n159#1:551,5\n207#1:556,5\n211#1:561,5\n219#1:566,5\n223#1:571,5\n242#1:576,5\n250#1:581,5\n254#1:586,5\n264#1:591,5\n268#1:596,5\n275#1:601,5\n289#1:606,5\n293#1:611,5\n297#1:616,5\n309#1:621,5\n334#1:626,5\n339#1:631,5\n344#1:636,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static int a(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                if (deviceInfo.Na()) {
                    return !deviceInfo.Pa() ? 2 : 0;
                }
                return 1;
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public static s3 b(@NotNull crl crlVar) {
            if (!(crlVar instanceof DeviceInfo)) {
                throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) crlVar;
            if (deviceInfo.ha() || deviceInfo.O9()) {
                return new hyd();
            }
            if (deviceInfo.W9()) {
                return new syd();
            }
            if (crlVar.W()) {
                return new wyd();
            }
            if (deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca()) {
                return crlVar.N2();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static String c(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return crlVar.p() ? ybb.b(deviceInfo.Ma()) : ybb.a(deviceInfo.Ma());
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String d(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                String string = ((DeviceInfo) crlVar).F9() ? b78.a().getResources().getString(R$string.watch_face_online_face) : b78.a().getResources().getString(R$string.watch_face_main_banner_find);
                Intrinsics.checkNotNullExpressionValue(string, "applyInfo {\n            …)\n            }\n        }");
                return string;
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int e(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return (deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca()) ? 10 : 1;
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String f(@NotNull crl crlVar, @NotNull Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!(crlVar instanceof DeviceModel)) {
                throw new RuntimeException(crlVar + " not is " + DeviceModel.class.getCanonicalName());
            }
            DeviceModel deviceModel = (DeviceModel) crlVar;
            if (deviceModel.aa()) {
                return PowerTipsUtil.INSTANCE.a(context, i, new PowerTipsDesc(1, "0.5-1"), new PowerTipsDesc(2, "1-1.5"));
            }
            if (deviceModel.ja() || deviceModel.ka() || deviceModel.ca()) {
                return PowerTipsUtil.INSTANCE.a(context, i, new PowerTipsDesc(1, "0.5-1"), new PowerTipsDesc(2, "1-2"));
            }
            return deviceModel.ea() ? PowerTipsUtil.INSTANCE.a(context, i, new PowerTipsDesc(1, "0.3-0.5"), new PowerTipsDesc(2, "0.5-1")) : "";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String g(@NotNull crl crlVar) {
            if (!(crlVar instanceof DeviceModel)) {
                throw new RuntimeException(crlVar + " not is " + DeviceModel.class.getCanonicalName());
            }
            DeviceModel deviceModel = (DeviceModel) crlVar;
            if (deviceModel.K9() || deviceModel.fa()) {
                return "1";
            }
            if (deviceModel.A9() || deviceModel.E9()) {
                return "2";
            }
            return (deviceModel.F9() || deviceModel.ea()) ? "3" : "";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static s3 h(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                if (deviceInfo.ia()) {
                    return new czd();
                }
                return (deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca()) ? new dzd() : new yyd();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int i(@NotNull crl crlVar, int i) {
            if (!(crlVar instanceof DeviceModel)) {
                throw new RuntimeException(crlVar + " not is " + DeviceModel.class.getCanonicalName());
            }
            DeviceModel deviceModel = (DeviceModel) crlVar;
            if (deviceModel.ia() || deviceModel.ja() || deviceModel.ka() || deviceModel.ca() || i != 3) {
                return -16777216;
            }
            return Color.parseColor("#FF333333");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean j(@NotNull crl crlVar, int i) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return i == 515 && (deviceInfo.G9() || deviceInfo.F9());
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean k(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return (deviceInfo.ka() && ugl.a(deviceInfo.Ma(), 150)) || (deviceInfo.ca() && ugl.a(deviceInfo.Ma(), 130)) || (deviceInfo.ja() && ugl.a(deviceInfo.Ma(), 240));
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean l(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean m(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) crlVar;
                return deviceModel.M9() || deviceModel.F9() || deviceModel.G9() || deviceModel.ia() || deviceModel.O9();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean n(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean o(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean p(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean q(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return (deviceInfo.T9() && ugl.a(deviceInfo.Ma(), 115)) || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ea() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean r(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                return ((DeviceInfo) crlVar).M9();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean s(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                return ((DeviceInfo) crlVar).U9();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean t(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean u(@NotNull crl crlVar, int i) {
            if (!(crlVar instanceof DeviceInfo)) {
                throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) crlVar;
            switch (i) {
                case 2:
                    return deviceInfo.A9();
                case 3:
                case 10:
                case 12:
                default:
                    return false;
                case 4:
                    return deviceInfo.O9();
                case 5:
                    return deviceInfo.fa();
                case 6:
                    return deviceInfo.T9();
                case 7:
                    return deviceInfo.E9();
                case 8:
                    return deviceInfo.X9();
                case 9:
                    return deviceInfo.ia();
                case 11:
                    return deviceInfo.ja();
                case 13:
                    return deviceInfo.ea();
                case 14:
                    return deviceInfo.ka() || deviceInfo.ca();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static CompressType v(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                return ((DeviceInfo) crlVar).ea() ? CompressType.BIN : CompressType.ZIP;
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean w(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) crlVar;
                return (deviceInfo.ca() && ugl.a(deviceInfo.Ma(), 153)) || (deviceInfo.ka() && ugl.a(deviceInfo.Ma(), 180)) || (deviceInfo.ja() && ugl.a(deviceInfo.Ma(), 240));
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean x(@NotNull crl crlVar) {
            if (crlVar instanceof DeviceInfo) {
                return !((DeviceInfo) crlVar).O9();
            }
            throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean y(@NotNull crl crlVar) {
            if (!(crlVar instanceof DeviceInfo)) {
                throw new RuntimeException(crlVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) crlVar;
            if (!deviceInfo.qa(DeviceConstants.BaseDevice.AbstractC0341b.i.INSTANCE)) {
                return false;
            }
            if (!deviceInfo.Na()) {
                ltl.i(WatchFaceDeviceProvider.TAG, "onRequestDeviceInfo: disconnected");
                return false;
            }
            if (deviceInfo.Pa()) {
                return true;
            }
            ltl.i(WatchFaceDeviceProvider.TAG, "onRequestDeviceInfo: connected device is not main module");
            return false;
        }
    }

    @Nullable
    s3 B0();

    @NotNull
    String L2();

    boolean M7();

    @NotNull
    s3 N2();

    boolean P1();

    boolean P4();

    boolean Q5();

    @NotNull
    String R3(@NotNull Context context, int powerDegree);

    String R7();

    @NotNull
    CompressType T0();

    int U1();

    boolean W();

    boolean W5();

    boolean c1();

    boolean c7(int deviceType);

    boolean f2();

    int i2(int index);

    @NotNull
    String i6();

    boolean k3();

    int l();

    boolean p();

    boolean r4();

    boolean s8();

    boolean v1(int errorCode);

    boolean w3();
}
