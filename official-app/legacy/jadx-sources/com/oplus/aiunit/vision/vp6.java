package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/vp6;", "Lcom/oplus/aiunit/vision/if0;", "", "j4", "c4", "H4", "n5", "u7", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public interface vp6 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEsimAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EsimAbility.kt\ncom/heytap/health/esim/ability/EsimAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n37#2,5:81\n37#2,5:86\n37#2,2:91\n40#2,2:94\n37#2,5:96\n37#2,5:101\n1#3:93\n*S KotlinDebug\n*F\n+ 1 EsimAbility.kt\ncom/heytap/health/esim/ability/EsimAbility$DefaultImpls\n*L\n23#1:81,5\n27#1:86,5\n32#1:91,2\n32#1:94,2\n39#1:96,5\n48#1:101,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull vp6 vp6Var) {
            if (vp6Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) vp6Var;
                return deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(vp6Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull vp6 vp6Var) {
            if (vp6Var instanceof DeviceInfo) {
                return ((DeviceInfo) vp6Var).Pa();
            }
            throw new RuntimeException(vp6Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:47:0x009d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        
            if (r0.equals("OWW212") == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        
            if (r0.equals("OWW211") == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
        
            if (r0.equals("OW20W3") == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        
            if (r0.equals("OW20W2") == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        
            if (r0.equals("OW20W1") == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        
            return r3.Sa(107);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        
            return r3.Sa(89);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean c(@NotNull vp6 vp6Var) {
            if (!(vp6Var instanceof DeviceInfo)) {
                throw new RuntimeException(vp6Var + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) vp6Var;
            String model = deviceInfo.getModel();
            if (model != null) {
                switch (model.hashCode()) {
                    case -1951400758:
                        if (model.equals("OW19W1")) {
                            return false;
                        }
                        break;
                    case -1951400757:
                        if (model.equals("OW19W2")) {
                            return false;
                        }
                        break;
                    case -1951400756:
                        if (model.equals("OW19W3")) {
                            return false;
                        }
                        break;
                    case -1951379616:
                        break;
                    case -1951379615:
                        break;
                    case -1951379614:
                        break;
                    case -1950276605:
                        break;
                    case -1950276604:
                        break;
                    case -1950276603:
                        if (model.equals("OWW213")) {
                            return deviceInfo.Sa(89);
                        }
                        break;
                    case -1950276574:
                        if (model.equals("OWW221")) {
                            return deviceInfo.Sa(131);
                        }
                        break;
                    case -1950276543:
                        if (model.equals("OWW231")) {
                            return deviceInfo.Sa(42);
                        }
                        break;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull vp6 vp6Var) {
            if (vp6Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) vp6Var;
                if (!deviceInfo.T9()) {
                    return false;
                }
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                return deviceInfo2 != null && ugl.c(deviceInfo2.getFirmwareVersion()) == 109;
            }
            throw new RuntimeException(vp6Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e(@NotNull vp6 vp6Var) {
            if (vp6Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) vp6Var;
                if (!deviceInfo.T9()) {
                    return false;
                }
                UserDeviceInfo deviceInfo2 = deviceInfo.getDeviceInfo();
                return deviceInfo2 != null && ugl.c(deviceInfo2.getFirmwareVersion()) != 109;
            }
            throw new RuntimeException(vp6Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean H4();

    boolean c4();

    boolean j4();

    boolean n5();

    boolean u7();
}
