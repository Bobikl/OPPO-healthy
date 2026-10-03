package com.oplus.aiunit.vision;

import com.heytap.health.device_app_store.install.IAppInstallStatusService;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.watch.music.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/u8c;", "Lcom/oplus/aiunit/vision/oo5;", "Lcom/oplus/aiunit/vision/if0;", "Lcom/oplus/aiunit/vision/ma5;", "", "G0", "g8", "t1", "I4", "N3", "C6", c8l.KEY_C2, "n7", "", "simpleFormat", "fewerFormat", "fullFormat", "U3", "", "K", "t5", "Q6", "f7", "j7", "Z1", "d6", "Y3", "I1", "Inner", "b", "music_impl_release"}, k = 1, mv = {1, 8, 0})
public interface u8c extends oo5, if0, ma5 {

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMusicAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicAbility.kt\ncom/heytap/health/watch/music/ability/MusicAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,198:1\n37#2,5:199\n37#2,5:204\n37#2,5:209\n37#2,5:214\n37#2,5:219\n37#2,5:224\n37#2,5:229\n37#2,5:234\n37#2,5:239\n37#2,5:244\n37#2,5:249\n37#2,5:254\n37#2,5:259\n37#2,5:264\n37#2,5:269\n37#2,5:274\n37#2,5:279\n37#2,5:284\n*S KotlinDebug\n*F\n+ 1 MusicAbility.kt\ncom/heytap/health/watch/music/ability/MusicAbility$DefaultImpls\n*L\n42#1:199,5\n57#1:204,5\n70#1:209,5\n77#1:214,5\n85#1:219,5\n93#1:224,5\n100#1:229,5\n107#1:234,5\n113#1:239,5\n123#1:244,5\n133#1:249,5\n141#1:254,5\n149#1:259,5\n157#1:264,5\n167#1:269,5\n175#1:274,5\n183#1:279,5\n191#1:284,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static String a(@NotNull u8c u8cVar, @NotNull String simpleFormat, @NotNull String fewerFormat, @NotNull String fullFormat) {
            Intrinsics.checkNotNullParameter(simpleFormat, "simpleFormat");
            Intrinsics.checkNotNullParameter(fewerFormat, "fewerFormat");
            Intrinsics.checkNotNullParameter(fullFormat, "fullFormat");
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                if (deviceInfo.F9()) {
                    return fewerFormat;
                }
                return deviceInfo.ea() ? simpleFormat : fullFormat;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull u8c u8cVar) {
            if (!(u8cVar instanceof DeviceInfo)) {
                throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            String strMa = ((DeviceInfo) u8cVar).Ma();
            if (strMa == null || strMa.length() == 0) {
                a7b.m("MusicAbility", "checkConnecting with empty mac");
                return false;
            }
            int iY = u8cVar.Y(true);
            if (iY == -1) {
                return true;
            }
            y0k.i(b78.a().getResources().getString(iY));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int c(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                return ((DeviceInfo) u8cVar).K9() ? 800 : 400;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int d(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                if (deviceInfo.F9()) {
                    return R$string.watch_music_add_format_tip;
                }
                return deviceInfo.ea() ? R$string.watch_music_add_format_tip3 : R$string.watch_music_add_format_tip2;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int e(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                if (deviceInfo.ea()) {
                    return R$string.watch_music_uninstalled_msg_3;
                }
                return (deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca()) ? R$string.watch_music_uninstalled_msg_2 : R$string.watch_music_uninstalled_msg_1;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int f(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return (deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca()) ? R$string.watch_music_uninstalled_title_2 : R$string.watch_music_uninstalled_title_1;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int g(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return (deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca()) ? R$string.watch_music_permission_msg_1 : R$string.watch_music_permission_msg;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int h(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return (deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca()) ? R$string.watch_music_permission_title_1 : R$string.watch_music_permission_title;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int i(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                return ((DeviceInfo) u8cVar).ea() ? R$string.watch_music_storage_size1 : R$string.watch_music_storage_size;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int j(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                return ((DeviceInfo) u8cVar).ea() ? R$string.watch_music_storage_low_tip_title1 : R$string.watch_music_storage_low_tip_title;
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean k(@NotNull u8c u8cVar, @NotNull int... appIds) {
            Intrinsics.checkNotNullParameter(appIds, "appIds");
            return ma5.a.a(u8cVar, appIds);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean l(@NotNull u8c u8cVar) {
            if (!(u8cVar instanceof DeviceInfo)) {
                throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
            if (u8cVar.s5()) {
                return u8cVar.J4(22);
            }
            if (deviceInfo.T9() || deviceInfo.ha()) {
                Object objNavigation = x0.d().b("/device_app_store/AppInstallStatusService").navigation();
                IAppInstallStatusService iAppInstallStatusService = objNavigation instanceof IAppInstallStatusService ? (IAppInstallStatusService) objNavigation : null;
                if (iAppInstallStatusService != null ? iAppInstallStatusService.J(deviceInfo.Ma()) : false) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean m(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return deviceInfo.ha() || deviceInfo.T9() || (deviceInfo.O9() && ugl.a(deviceInfo.Ma(), 60)) || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        public static boolean n(@NotNull u8c u8cVar) {
            return ma5.a.b(u8cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean o(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                return ((DeviceInfo) u8cVar).ea();
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean p(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return (deviceInfo.K9() && !deviceInfo.M9()) || deviceInfo.ea();
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean q(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return (deviceInfo.ea() && ugl.a(deviceInfo.Ma(), 170)) || deviceInfo.ca() || deviceInfo.ka() || (deviceInfo.ja() && ugl.a(deviceInfo.Ma(), 200));
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean r(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return deviceInfo.ea() && ugl.a(deviceInfo.Ma(), 190);
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean s(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja() || deviceInfo.ka() || deviceInfo.ca();
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean t(@NotNull u8c u8cVar) {
            if (u8cVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) u8cVar;
                return deviceInfo.G9() | deviceInfo.F9();
            }
            throw new RuntimeException(u8cVar + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.u8c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/u8c$b;", "", "<init>", "()V", "music_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    boolean C2();

    boolean C6();

    boolean G0();

    int I1();

    boolean I4();

    int K();

    boolean N3();

    int Q6();

    @NotNull
    String U3(@NotNull String simpleFormat, @NotNull String fewerFormat, @NotNull String fullFormat);

    boolean Y3();

    int Z1();

    int d6();

    int f7();

    boolean g8();

    int j7();

    boolean n7();

    boolean t1();

    int t5();
}
