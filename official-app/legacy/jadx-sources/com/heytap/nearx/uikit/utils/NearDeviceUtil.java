package com.heytap.nearx.uikit.utils;

import android.os.Build;
import com.oplus.aiunit.vision.fjc;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import io.protostuff.MapSchema;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b<\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010*\u001a\u0004\u0018\u00010\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b\"\u0010'R!\u00100\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b,\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b-\u0010.R!\u00103\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b1\u0010&\u0012\u0004\b2\u0010)\u001a\u0004\b,\u0010.R!\u00106\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b4\u0010&\u0012\u0004\b5\u0010)\u001a\u0004\b1\u0010.R!\u00108\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b-\u0010&\u0012\u0004\b7\u0010)\u001a\u0004\b4\u0010.R\u001a\u0010;\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010)\u001a\u0004\b%\u00109¨\u0006="}, d2 = {"Lcom/heytap/nearx/uikit/utils/NearDeviceUtil;", "", "", LanConstants.OPERATOR_UNKNOWN, "I", "V_1_0", "V_1_2", "V_1_4", "V_2_0", "V_2_1", "V_3_0", "V_3_1", "V_3_2", "V_5_0", "V_5_1", "V_5_2", "V_6_0", "V_6_1", "V_6_2", "V_6_7", "V_7_0", "V_7_1", "V_7_2", "V_8_0", "V_8_1", "V_8_2", "V_12_0", "V_13_0", "DEVICE_TYPE_DEVICE1", "DEVICE_TYPE_DEVICE2", "DEVICE_TYPE_DEVICE3", "DEVICE_TYPE_DEVICE4", "Ljava/util/HashMap;", "", "a", "Ljava/util/HashMap;", "sDeviceMap", "b", "Lkotlin/Lazy;", "()Ljava/lang/Integer;", "getDeviceType$annotations", "()V", "deviceType", "", "c", "f", "()Z", "isOplus$annotations", "isOplus", "d", "isDevice1$annotations", "isDevice1", MapSchema.FIELD_NAME_ENTRY, "isDevice2$annotations", "isDevice2", "isDevice3$annotations", "isDevice3", "()I", "getOsVersionCode$annotations", "osVersionCode", "<init>", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class NearDeviceUtil {
    public static final int DEVICE_TYPE_DEVICE1 = 1;
    public static final int DEVICE_TYPE_DEVICE2 = 2;
    public static final int DEVICE_TYPE_DEVICE3 = 3;
    public static final int DEVICE_TYPE_DEVICE4 = 4;
    public static final int UNKNOWN = 0;
    public static final int V_12_0 = 23;
    public static final int V_13_0 = 26;
    public static final int V_1_0 = 1;
    public static final int V_1_2 = 2;
    public static final int V_1_4 = 3;
    public static final int V_2_0 = 4;
    public static final int V_2_1 = 5;
    public static final int V_3_0 = 6;
    public static final int V_3_1 = 7;
    public static final int V_3_2 = 8;
    public static final int V_5_0 = 9;
    public static final int V_5_1 = 10;
    public static final int V_5_2 = 11;
    public static final int V_6_0 = 12;
    public static final int V_6_1 = 13;
    public static final int V_6_2 = 14;
    public static final int V_6_7 = 15;
    public static final int V_7_0 = 16;
    public static final int V_7_1 = 17;
    public static final int V_7_2 = 18;
    public static final int V_8_0 = 19;
    public static final int V_8_1 = 20;
    public static final int V_8_2 = 21;

    @NotNull
    public static final NearDeviceUtil INSTANCE = new NearDeviceUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Integer> sDeviceMap = new HashMap<>(11);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy deviceType = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.nearx.uikit.utils.NearDeviceUtil$deviceType$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:7:0x0035  */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            int i;
            if (NearDeviceUtil.f()) {
                fjc.a("NearDeviceUtil", "osVersionCode = " + NearDeviceUtil.b() + " ,isOplus = " + NearDeviceUtil.f());
                i = 4;
            } else if (NearDeviceUtil.c()) {
                i = 1;
            } else if (NearDeviceUtil.d()) {
                i = 2;
            } else if (NearDeviceUtil.e()) {
                i = 3;
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy isOplus = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.nearx.uikit.utils.NearDeviceUtil$isOplus$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:14:0x0083  */
        /* JADX WARN: Code duplicated, block: B:16:0x0089  */
        /* JADX WARN: Code duplicated, block: B:17:0x008b  */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean z;
            String str = Build.MANUFACTURER;
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            if (!str.equals(new String("OnePlus".getBytes(), UTF_8))) {
                Charset UTF_9 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                if (!str.equals(new String("ONEPLUS".getBytes(), UTF_9))) {
                    Charset UTF_10 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_10, "UTF_8");
                    if (!str.equals(new String("GALILEI".getBytes(), UTF_10))) {
                        Charset UTF_11 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_11, "UTF_8");
                        if (!str.equals(new String("galilei".getBytes(), UTF_11))) {
                            Charset UTF_12 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_12, "UTF_8");
                            if (!str.equals(new String("FARADAY".getBytes(), UTF_12))) {
                                Charset UTF_13 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_13, "UTF_8");
                                if (!str.equals(new String("faraday".getBytes(), UTF_13))) {
                                    z = false;
                                } else if (NearDeviceUtil.b() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else if (NearDeviceUtil.b() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else if (NearDeviceUtil.b() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else if (NearDeviceUtil.b() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (NearDeviceUtil.b() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (NearDeviceUtil.b() > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy isDevice1 = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.nearx.uikit.utils.NearDeviceUtil$isDevice1$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:8:0x0032  */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean z;
            String str = Build.MANUFACTURER;
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            if (str.equals(new String("OPPO".getBytes(), UTF_8))) {
                z = true;
            } else {
                Charset UTF_9 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                if (str.equals(new String("Oppo".getBytes(), UTF_9))) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy isDevice2 = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.nearx.uikit.utils.NearDeviceUtil$isDevice2$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:16:0x0086  */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean z;
            String str = Build.MANUFACTURER;
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            if (str.equals(new String("OnePlus".getBytes(), UTF_8))) {
                z = true;
            } else {
                Charset UTF_9 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                if (str.equals(new String("ONEPLUS".getBytes(), UTF_9))) {
                    z = true;
                } else {
                    Charset UTF_10 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_10, "UTF_8");
                    if (str.equals(new String("GALILEI".getBytes(), UTF_10))) {
                        z = true;
                    } else {
                        Charset UTF_11 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_11, "UTF_8");
                        if (str.equals(new String("galilei".getBytes(), UTF_11))) {
                            z = true;
                        } else {
                            Charset UTF_12 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_12, "UTF_8");
                            if (str.equals(new String("FARADAY".getBytes(), UTF_12))) {
                                z = true;
                            } else {
                                Charset UTF_13 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_13, "UTF_8");
                                if (str.equals(new String("faraday".getBytes(), UTF_13))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy isDevice3 = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.nearx.uikit.utils.NearDeviceUtil$isDevice3$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:10:0x0047  */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean z;
            String str = Build.MANUFACTURER;
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            if (str.equals(new String("REALME".getBytes(), UTF_8))) {
                z = true;
            } else {
                Charset UTF_9 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                if (str.equals(new String("Realme".getBytes(), UTF_9))) {
                    z = true;
                } else {
                    Charset UTF_10 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_10, "UTF_8");
                    if (str.equals(new String("realme".getBytes(), UTF_10))) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    });

    @Nullable
    public static final Integer a() {
        return (Integer) deviceType.getValue();
    }

    public static final int b() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                Class<?> cls = Class.forName(new String("com.oplus.os.OplusBuild".getBytes(), UTF_8));
                Charset UTF_9 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                Object objInvoke = cls.getDeclaredMethod(new String("getOplusOSVERSION".getBytes(), UTF_9), new Class[0]).invoke(cls, new Object[0]);
                if (objInvoke != null) {
                    return ((Integer) objInvoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            Charset UTF_10 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_10, "UTF_8");
            Class<?> cls2 = Class.forName(new String(new byte[]{99, 111, 109, 46, 99, 111, 108, 111, 114, 46, (byte) 111, (byte) 115, 46, 67, 111, 108, 111, 114, 66, 117, 105, 108, 100}, UTF_10));
            Charset UTF_11 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_11, "UTF_8");
            Object objInvoke2 = cls2.getDeclaredMethod(new String(new byte[]{103, 101, 116, (byte) 67, 111, 108, 111, 114, (byte) 79, 83, 86, 69, 82, 83, 73, 79, 78}, UTF_11), new Class[0]).invoke(cls2, new Object[0]);
            if (objInvoke2 != null) {
                return ((Integer) objInvoke2).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception e2) {
            fjc.b("NearDeviceUtil", Intrinsics.stringPlus("NearDeviceUtil failed. error = ", e2.getMessage()));
            return 0;
        }
    }

    public static final boolean c() {
        return ((Boolean) isDevice1.getValue()).booleanValue();
    }

    public static final boolean d() {
        return ((Boolean) isDevice2.getValue()).booleanValue();
    }

    public static final boolean e() {
        return ((Boolean) isDevice3.getValue()).booleanValue();
    }

    public static final boolean f() {
        return ((Boolean) isOplus.getValue()).booleanValue();
    }
}
