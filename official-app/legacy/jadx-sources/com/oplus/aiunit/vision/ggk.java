package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/ggk;", "Lcom/oplus/aiunit/vision/if0;", "", "K4", "p1", "showNfcTip", "", "J3", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface ggk extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nUnBindAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnBindAbility.kt\ncom/heytap/health/settings/watch/unbind/UnBindAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,84:1\n37#2,5:85\n37#2,5:90\n37#2,5:95\n*S KotlinDebug\n*F\n+ 1 UnBindAbility.kt\ncom/heytap/health/settings/watch/unbind/UnBindAbility$DefaultImpls\n*L\n29#1:85,5\n37#1:90,5\n45#1:95,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String a(@NotNull ggk ggkVar, boolean z) {
            String string;
            if (!(ggkVar instanceof DeviceInfo)) {
                throw new RuntimeException(ggkVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) ggkVar;
            Context contextA = b78.a();
            if (deviceInfo.k0()) {
                string = contextA.getString(R$string.un_pair_iwatch_tips);
            } else if (deviceInfo.Ua()) {
                string = contextA.getString(com.heytap.health.device_pair.R$string.pair_device_reset_tip2);
            } else {
                boolean zK9 = deviceInfo.K9();
                String string2 = contextA.getString(com.heytap.health.device_pair.R$string.pair_device_reset_tip1);
                Intrinsics.checkNotNullExpressionValue(string2, "appContext.getString(com…g.pair_device_reset_tip1)");
                String string3 = contextA.getString(com.heytap.health.device_pair.R$string.pair_device_reset_tip2);
                Intrinsics.checkNotNullExpressionValue(string3, "appContext.getString(com…g.pair_device_reset_tip2)");
                String string4 = contextA.getString(com.heytap.health.device_pair.R$string.pair_device_reset_tip3_new);
                Intrinsics.checkNotNullExpressionValue(string4, "appContext.getString(com…ir_device_reset_tip3_new)");
                String string5 = contextA.getString(com.heytap.health.device_pair.R$string.pair_device_reset_tip4);
                Intrinsics.checkNotNullExpressionValue(string5, "appContext.getString(com…g.pair_device_reset_tip4)");
                if (deviceInfo.Na()) {
                    if (zK9) {
                        if (deviceInfo.Oa()) {
                            string3 = string2;
                        } else {
                            string3 = "";
                        }
                    } else if (!z || !deviceInfo.Aa()) {
                        string2 = "";
                    }
                    string2 = string4;
                } else if (zK9) {
                    string2 = string4;
                    string3 = string5;
                } else if (deviceInfo.Aa()) {
                    string2 = string4;
                } else {
                    string2 = "";
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string6 = contextA.getString(com.heytap.health.device_pair.R$string.pair_device_reset_tip);
                Intrinsics.checkNotNullExpressionValue(string6, "appContext.getString(com…ng.pair_device_reset_tip)");
                String str = String.format(string6, Arrays.copyOf(new Object[]{string2, string3}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                string = StringsKt__StringsKt.trim((CharSequence) str).toString();
            }
            Intrinsics.checkNotNullExpressionValue(string, "applyInfo {\n        val …ip), s1, s2).trim()\n    }");
            return string;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull ggk ggkVar) {
            if (ggkVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) ggkVar;
                return deviceInfo.K9() || deviceInfo.F9() || deviceInfo.G9();
            }
            throw new RuntimeException(ggkVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull ggk ggkVar) {
            if (ggkVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) ggkVar;
                return !deviceInfo.A9() && deviceInfo.Na();
            }
            throw new RuntimeException(ggkVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    @NotNull
    String J3(boolean showNfcTip);

    boolean K4();

    boolean p1();
}
