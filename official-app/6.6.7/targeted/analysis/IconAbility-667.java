package com.oplus.aiunit.p007vision;

import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.NTFCmdId;
import com.heytap.health.watch.notification.impl.R$drawable;
import com.heytap.health.watch.notification.impl.fluid.FluidSupportProvider;
import com.heytap.health.watch.notification.impl.fluid.ImageBean;
import com.heytap.health.watch.notification.impl.module.NotificationHolder;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.gpj;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.skl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/uwc;", "", "Companion", "a", "b", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public interface uwc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String PKG_BAIDU_MAP = "com.baidu.BaiduMap";

    @NotNull
    public static final String TAG = "NTF_Ability";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.uwc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/uwc$a;", "", "", "packageName", "", "a", "b", "TAG", "Ljava/lang/String;", "PKG_BAIDU_MAP", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String PKG_BAIDU_MAP = "com.baidu.BaiduMap";

        @NotNull
        public static final String TAG = "NTF_Ability";
        public static final /* synthetic */ Companion a = new Companion();

        @JvmStatic
        public final boolean a(@Nullable String packageName) {
            return TextUtils.equals(packageName, "com.baidu.BaiduMap") || TextUtils.equals(packageName, "com.sdu.didi.psnger");
        }

        @JvmStatic
        public final boolean b(@Nullable String packageName) {
            return TextUtils.equals(packageName, "com.tencent.tmgp.sgame") || TextUtils.equals(packageName, "com.tencent.tmgp.pubgmhd");
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u001a\u0010#\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\u001a\u0010$\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\u0012\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010 2\u0006\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020\u001cH\u0016J\b\u0010-\u001a\u00020\u000bH\u0016¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/uwc$b;", "Lcom/oplus/aiunit/vision/cxc;", "", "p3", "k5", "u5", "H8", "T8", "o8", "j0", "r4", "", "packageName", "S", "E1", "N4", "O1", "p5", "I3", "E5", "c2", "p4", "i8", "w5", "c5", "i2", "v5", "i5", "", "M8", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/oplus/aiunit/vision/g3a;", "Z0", "J", "L0", "l8", "str", "n", "Lcom/heytap/health/watch/notification/impl/fluid/ImageBean;", "bean", "B2", "u6", "A7", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public interface b extends cxc {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nNotificationAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationAbility.kt\ncom/heytap/health/watch/notification/impl/ability/NotificationAbility$Info$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,458:1\n37#2,5:459\n37#2,5:464\n37#2,5:469\n37#2,5:474\n37#2,5:479\n37#2,5:484\n37#2,5:489\n37#2,5:494\n37#2,5:499\n37#2,5:504\n37#2,5:509\n37#2,5:514\n37#2,5:519\n37#2,5:524\n37#2,5:529\n37#2,5:534\n37#2,5:539\n37#2,5:544\n37#2,5:549\n37#2,5:554\n37#2,5:559\n37#2,5:564\n37#2,5:569\n37#2,5:574\n37#2,5:579\n37#2,5:584\n37#2,5:589\n37#2,5:594\n37#2,5:599\n37#2,5:604\n37#2,5:609\n*S KotlinDebug\n*F\n+ 1 NotificationAbility.kt\ncom/heytap/health/watch/notification/impl/ability/NotificationAbility$Info$DefaultImpls\n*L\n91#1:459,5\n107#1:464,5\n114#1:469,5\n118#1:474,5\n122#1:479,5\n126#1:484,5\n130#1:489,5\n139#1:494,5\n154#1:499,5\n159#1:504,5\n163#1:509,5\n167#1:514,5\n173#1:519,5\n183#1:524,5\n190#1:529,5\n198#1:534,5\n202#1:539,5\n207#1:544,5\n212#1:549,5\n219#1:554,5\n230#1:559,5\n235#1:564,5\n240#1:569,5\n252#1:574,5\n277#1:579,5\n327#1:584,5\n342#1:589,5\n350#1:594,5\n361#1:599,5\n435#1:604,5\n447#1:609,5\n*E\n"})
        public static final class a {
            public static boolean A(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).M9();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean B(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).Qa();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean C(@NotNull b bVar) {
                return cxc.a.e(bVar);
            }

            public static boolean D(@NotNull b bVar) {
                return cxc.a.f(bVar);
            }

            public static boolean E(@NotNull b bVar) {
                return cxc.a.g(bVar);
            }

            public static boolean F(@NotNull b bVar) {
                return cxc.a.h(bVar);
            }

            public static boolean G(@NotNull b bVar) {
                return cxc.a.i(bVar);
            }

            public static boolean H(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).ea();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0031  */
            public static boolean I(@NotNull b bVar) {
                boolean z;
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                DeviceInfo deviceInfo = (DeviceInfo) bVar;
                if (deviceInfo.ma() || deviceInfo.ea()) {
                    z = true;
                } else {
                    if (deviceInfo.la()) {
                        UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                        if (skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 200)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return z && deviceInfo.Za();
            }

            /* JADX WARN: Code duplicated, block: B:22:0x003f  */
            /* JADX WARN: Code duplicated, block: B:24:0x0045  */
            /* JADX WARN: Code duplicated, block: B:26:0x004b  */
            public static boolean J(@NotNull b bVar) {
                UserDeviceInfo userDeviceInfoMa;
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                DeviceInfo deviceInfo = (DeviceInfo) bVar;
                if (!deviceInfo.ma() && !deviceInfo.ea() && !deviceInfo.ga() && !deviceInfo.la() && !deviceInfo.ka()) {
                    if (!deviceInfo.Z9()) {
                        if (deviceInfo.V9()) {
                            userDeviceInfoMa = deviceInfo.Ma();
                            if (skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 120)) {
                            }
                        }
                        return false;
                    }
                    UserDeviceInfo userDeviceInfoMa2 = deviceInfo.Ma();
                    if (!skl.e(userDeviceInfoMa2 != null ? userDeviceInfoMa2.getFirmwareVersion() : null, 110)) {
                        if (deviceInfo.V9()) {
                            userDeviceInfoMa = deviceInfo.Ma();
                            if (skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 120)) {
                            }
                        }
                        return false;
                    }
                }
                return true;
            }

            public static boolean K(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    DeviceInfo deviceInfo = (DeviceInfo) bVar;
                    return deviceInfo.ma() || deviceInfo.ea() || deviceInfo.ga() || deviceInfo.la() || deviceInfo.ka() || deviceInfo.Z9() || deviceInfo.k0();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean L(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return !((DeviceInfo) bVar).k0() && bVar.E1();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean M(@NotNull b bVar) {
                return cxc.a.j(bVar);
            }

            public static boolean N(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    DeviceInfo deviceInfo = (DeviceInfo) bVar;
                    return !(!deviceInfo.M9() || deviceInfo.O9() || deviceInfo.Q9() || deviceInfo.V9()) || deviceInfo.ga();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            @NotNull
            public static IconCache a(@NotNull b bVar, @Nullable HealthNotificationBean healthNotificationBean, @NotNull Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                fxc fxcVar = fxc.INSTANCE;
                Bitmap bitmapP = fxcVar.p(bitmap, NTFCmdId.CID_NTF_SYNC_NEED_ICON_VALUE);
                byte[] bArrM = bVar.T8() ? fxcVar.m(bitmapP) : fxcVar.c(bitmapP);
                ByteString byteStringCopyFrom = ByteString.copyFrom(bArrM);
                if (healthNotificationBean != null) {
                    c0d c0dVar = c0d.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "byteString");
                    c0dVar.l(healthNotificationBean, bitmapP, bArrM, byteStringCopyFrom);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "byteString");
                return new IconCache(jCurrentTimeMillis, bitmapP, bArrM, byteStringCopyFrom);
            }

            @NotNull
            public static IconCache b(@NotNull b bVar, @Nullable HealthNotificationBean healthNotificationBean, @NotNull Bitmap bitmap) {
                IconCache iconCache;
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                DeviceInfo deviceInfo = (DeviceInfo) bVar;
                if (bVar.T8()) {
                    fxc fxcVar = fxc.INSTANCE;
                    Bitmap bitmapP = fxcVar.p(bitmap, NTFCmdId.CID_NTF_SYNC_NEED_ICON_VALUE);
                    byte[] bArrM = fxcVar.m(bitmapP);
                    ByteString byteStringCopyFrom = ByteString.copyFrom(bArrM);
                    if (healthNotificationBean != null) {
                        c0d c0dVar = c0d.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "byteString");
                        c0dVar.n(healthNotificationBean, bitmapP, bArrM, byteStringCopyFrom);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "byteString");
                    return new IconCache(jCurrentTimeMillis, bitmap, bArrM, byteStringCopyFrom);
                }
                if (deviceInfo.O9() || deviceInfo.C9() || deviceInfo.H9() || deviceInfo.I9()) {
                    fxc fxcVar2 = fxc.INSTANCE;
                    Bitmap bitmapQ = fxcVar2.q(bitmap, bVar.M8());
                    byte[] bArrD = fxcVar2.d(bitmapQ);
                    ByteString byteStringCopyFrom2 = ByteString.copyFrom(bArrD);
                    if (healthNotificationBean != null) {
                        c0d c0dVar2 = c0d.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom2, "byteString");
                        c0dVar2.n(healthNotificationBean, bitmapQ, bArrD, byteStringCopyFrom2);
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom2, "byteString");
                    return new IconCache(jCurrentTimeMillis2, bitmap, bArrD, byteStringCopyFrom2);
                }
                fxc fxcVar3 = fxc.INSTANCE;
                Bitmap bitmapP2 = fxcVar3.p(bitmap, bVar.M8());
                if (deviceInfo.Q9() || deviceInfo.V9() || bVar.N4()) {
                    byte[] bArrE = fxcVar3.e(bitmapP2);
                    ByteString byteStringCopyFrom3 = ByteString.copyFrom(bArrE);
                    if (healthNotificationBean != null) {
                        c0d c0dVar3 = c0d.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom3, "byteString");
                        c0dVar3.n(healthNotificationBean, bitmapP2, bArrE, byteStringCopyFrom3);
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom3, "byteString");
                    iconCache = new IconCache(jCurrentTimeMillis3, bitmap, bArrE, byteStringCopyFrom3);
                } else if (deviceInfo.ha() || deviceInfo.G9()) {
                    byte[] bArrB = fxcVar3.b(bitmapP2);
                    ByteString byteStringCopyFrom4 = ByteString.copyFrom(bArrB);
                    if (healthNotificationBean != null) {
                        c0d c0dVar4 = c0d.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom4, "byteString");
                        c0dVar4.n(healthNotificationBean, bitmapP2, bArrB, byteStringCopyFrom4);
                    }
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom4, "byteString");
                    iconCache = new IconCache(jCurrentTimeMillis4, bitmap, bArrB, byteStringCopyFrom4);
                } else {
                    byte[] bArrD2 = fxcVar3.d(bitmapP2);
                    ByteString byteStringCopyFrom5 = ByteString.copyFrom(bArrD2);
                    if (healthNotificationBean != null) {
                        c0d c0dVar5 = c0d.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom5, "byteString");
                        c0dVar5.n(healthNotificationBean, bitmapP2, bArrD2, byteStringCopyFrom5);
                    }
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom5, "byteString");
                    iconCache = new IconCache(jCurrentTimeMillis5, bitmap, bArrD2, byteStringCopyFrom5);
                }
                return iconCache;
            }

            public static int c(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).C0() ? 1 : 2;
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static int d(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    DeviceInfo deviceInfo = (DeviceInfo) bVar;
                    return (deviceInfo.la() || deviceInfo.ga() || deviceInfo.ma() || deviceInfo.ea()) ? 2 : 1;
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            @NotNull
            public static String e(@NotNull b bVar, @Nullable String str) {
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                DeviceInfo deviceInfo = (DeviceInfo) bVar;
                if (str == null || str.length() == 0) {
                    return "";
                }
                if (deviceInfo.ga()) {
                    UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                    if (!skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 101) && new Regex("[\ud83c-\u10fc00-\udfff]+|[☀-⛿✀-➿]|[😀-🙏]|[🚀-\u1f6ff]|[🌀-🏿]|[🤀-🧿]").containsMatchIn(str)) {
                        m8b.f("NTF_Ability", "fixColumbusEmoji: matched");
                        str = str + "\u200b\u200b";
                    }
                }
                return str;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
            
                if (r0.equals(com.oplus.aiunit.p007vision.acl.KEY_D18) == false) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
            
                if (r0.equals(com.oplus.aiunit.p007vision.acl.KEY_A0) != false) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
            
                if (r0.equals(com.oplus.aiunit.p007vision.acl.KEY_A) == false) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
            
                if (r0.equals(com.oplus.aiunit.p007vision.acl.KEY_COMPAT_RIGHT_ICON) == false) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
            
                r5 = com.oplus.aiunit.p007vision.fxc.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "origin");
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
            
                if (r0.equals(com.oplus.aiunit.p007vision.acl.KEY_EXTERNAL_ICON) == false) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
            
                r5 = com.oplus.aiunit.p007vision.fxc.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "origin");
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
            
                return r5.p(r4, 32);
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
            
                return r5.p(r4, 48);
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
            
                if (r0.equals(com.oplus.aiunit.p007vision.acl.KEY_COMPAT_LEFT_ICON) == false) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
            
                if (r0.equals(com.oplus.aiunit.p007vision.acl.KEY_ICON) == false) goto L47;
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static android.graphics.Bitmap f(@org.jetbrains.annotations.NotNull com.oplus.aiunit.vision.uwc.b r4, @org.jetbrains.annotations.NotNull com.heytap.health.watch.notification.impl.fluid.ImageBean r5) {
                /*
                    Method dump skipped, instruction units count: 304
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.oplus.aiunit.vision.uwc.b.a.f(com.oplus.aiunit.vision.uwc$b, com.heytap.health.watch.notification.impl.fluid.ImageBean):android.graphics.Bitmap");
            }

            public static int g(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    if (bVar.T8()) {
                        return R$drawable.notification_fluid_tips_iwatch;
                    }
                    if (bVar.I3()) {
                        return R$drawable.notification_fluid_tips_round_unbent;
                    }
                    return bVar.m1() == 2 ? R$drawable.notification_fluid_tips_round_bent : R$drawable.notification_fluid_tips_square_old;
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            @NotNull
            public static String h(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    if (bVar.I3()) {
                        return FluidSupportProvider.ROUND_UNBENT;
                    }
                    return bVar.m1() == 2 ? FluidSupportProvider.ROUND_BENT : FluidSupportProvider.SQUARE_OLD;
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static int i(@NotNull b bVar) {
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                DeviceInfo deviceInfo = (DeviceInfo) bVar;
                if (deviceInfo.U9() || deviceInfo.ja() || deviceInfo.Y9()) {
                    return 78;
                }
                if (deviceInfo.ha()) {
                    return 64;
                }
                if (deviceInfo.G9()) {
                    return 80;
                }
                return bVar.E1() ? 64 : 84;
            }

            public static boolean j(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).G9();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean k(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    DeviceInfo deviceInfo = (DeviceInfo) bVar;
                    return (deviceInfo.Qa() && deviceInfo.O9()) || deviceInfo.H9() || deviceInfo.C9() || deviceInfo.I9();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static int l(@NotNull b bVar) {
                return cxc.a.b(bVar);
            }

            public static boolean m(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return bVar.N4();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean n(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).G9();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean o(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).ha();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean p(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).k0();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean q(@NotNull b bVar, @NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "packageName");
                if (bVar instanceof DeviceInfo) {
                    return bVar.N4() && NotificationHolder.INSTANCE.g(str);
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean r(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    DeviceInfo deviceInfo = (DeviceInfo) bVar;
                    return (deviceInfo.M9() || deviceInfo.ga()) && deviceInfo.C0();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean s(@NotNull b bVar) {
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                DeviceInfo deviceInfo = (DeviceInfo) bVar;
                if (!deviceInfo.M9()) {
                    if (deviceInfo.K9()) {
                        return deviceInfo.qa(DeviceConstants.b.a.b.INSTANCE);
                    }
                    return true;
                }
                if (deviceInfo.O9() || deviceInfo.Q9()) {
                    return true;
                }
                return (deviceInfo.la() && deviceInfo.Ua(200)) || deviceInfo.qa(DeviceConstants.b.b.g.INSTANCE);
            }

            public static boolean t(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    DeviceInfo deviceInfo = (DeviceInfo) bVar;
                    return deviceInfo.ma() || deviceInfo.ea() || (deviceInfo.la() && deviceInfo.Ua(240));
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean u(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return bVar.I3() && (gpj.o("com.coloros.sceneservice") < 16002080 || gpj.o("com.oplus.pantanal.ums") < 16001079);
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0035  */
            /* JADX WARN: Code duplicated, block: B:28:0x0056  */
            public static boolean v(@NotNull b bVar) {
                boolean z;
                boolean z2;
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                DeviceInfo deviceInfo = (DeviceInfo) bVar;
                boolean zZ9 = deviceInfo.Z9();
                if (!deviceInfo.ka() || deviceInfo.da() || deviceInfo.ia()) {
                    z = false;
                } else {
                    UserDeviceInfo userDeviceInfoMa = deviceInfo.Ma();
                    if (skl.e(userDeviceInfoMa != null ? userDeviceInfoMa.getFirmwareVersion() : null, 120)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!deviceInfo.da() || deviceInfo.ia()) {
                    z2 = false;
                } else {
                    UserDeviceInfo userDeviceInfoMa2 = deviceInfo.Ma();
                    if (skl.e(userDeviceInfoMa2 != null ? userDeviceInfoMa2.getFirmwareVersion() : null, 40)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                return zZ9 || z || z2;
            }

            public static boolean w(@NotNull b bVar) {
                ApplicationInfo applicationInfo;
                Bundle bundle;
                if (!(bVar instanceof DeviceInfo)) {
                    throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
                }
                try {
                    applicationInfo = e88.a().getPackageManager().getApplicationInfo(com.heytap.health.watch.notification.impl.whitelist.a.PACKAGE_MMS, 128);
                } catch (Exception e) {
                    m8b.b("NTF_VerifyCodeReceiver", "initVerifyRegister: " + e.getMessage());
                    applicationInfo = null;
                }
                String string = (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? null : bundle.getString("verify_code_report_support");
                boolean z = false;
                if (string != null && StringsKt.contains$default(string, "health", false, 2, (Object) null)) {
                    z = true;
                }
                m8b.f("NTF_VerifyCodeReceiver", "initVerifyRegister: support=" + z);
                return z;
            }

            public static boolean x(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).k0();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean y(@NotNull b bVar) {
                if (bVar instanceof DeviceInfo) {
                    return ((DeviceInfo) bVar).H9() || bVar.W3();
                }
                throw new RuntimeException(bVar + " not is " + DeviceInfo.class.getCanonicalName());
            }

            public static boolean z(@NotNull b bVar) {
                return cxc.a.d(bVar);
            }
        }

        @NotNull
        String A7();

        @Nullable
        Bitmap B2(@NotNull ImageBean bean);

        boolean E1();

        boolean E5();

        boolean H8();

        boolean I3();

        @NotNull
        IconCache J(@Nullable HealthNotificationBean hnb, @NotNull Bitmap bitmap);

        int L0();

        int M8();

        boolean N4();

        boolean O1();

        boolean S(@NotNull String packageName);

        boolean T8();

        @NotNull
        IconCache Z0(@Nullable HealthNotificationBean hnb, @NotNull Bitmap bitmap);

        boolean c2();

        boolean c5();

        boolean i2();

        boolean i5();

        boolean i8();

        boolean j0();

        boolean k5();

        int l8();

        @NotNull
        String n(@Nullable String str);

        boolean o8();

        boolean p3();

        boolean p4();

        boolean p5();

        boolean r4();

        boolean u5();

        int u6();

        boolean v5();

        boolean w5();
    }
}
