package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.carlink.controlsdk.data.CarInfo;
import com.oplus.carlink.controlsdk.data.CarStatus;
import com.oplus.carlink.controlsdk.data.CompanyInfo;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface e1d<T> {
    public static final e1d<Boolean> O00O;

    /* JADX INFO: renamed from: O00, reason: collision with root package name */
    public static final e1d<Void> f10750O00 = new e1d() { // from class: com.oplus.aiunit.vision.v0d
        @Override // com.oplus.aiunit.vision.e1d
        public final Object g(Bundle bundle) {
            return e1d.b(bundle);
        }
    };

    /* JADX INFO: renamed from: O0O, reason: collision with root package name */
    public static final e1d<CarStatus> f10751O0O = new e1d() { // from class: com.oplus.aiunit.vision.w0d
        @Override // com.oplus.aiunit.vision.e1d
        public final Object g(Bundle bundle) {
            return e1d.O00(bundle);
        }
    };

    /* JADX INFO: renamed from: OO0, reason: collision with root package name */
    public static final e1d<CarInfo> f10752OO0 = new e1d() { // from class: com.oplus.aiunit.vision.x0d
        @Override // com.oplus.aiunit.vision.e1d
        public final Object g(Bundle bundle) {
            return e1d.h(bundle);
        }
    };
    public static final e1d<CompanyInfo> OOO = new e1d() { // from class: com.oplus.aiunit.vision.y0d
        @Override // com.oplus.aiunit.vision.e1d
        public final Object g(Bundle bundle) {
            return e1d.e(bundle);
        }
    };
    public static final e1d<List<CarInfo>> O000 = new e1d() { // from class: com.oplus.aiunit.vision.z0d
        @Override // com.oplus.aiunit.vision.e1d
        public final Object g(Bundle bundle) {
            return e1d.c(bundle);
        }
    };

    static {
        new e1d() { // from class: com.oplus.aiunit.vision.a1d
            @Override // com.oplus.aiunit.vision.e1d
            public final Object g(Bundle bundle) {
                return bundle.getString("data", "");
            }
        };
        O00O = new e1d() { // from class: com.oplus.aiunit.vision.b1d
            @Override // com.oplus.aiunit.vision.e1d
            public final Object g(Bundle bundle) {
                return Boolean.valueOf(Boolean.parseBoolean(bundle.getString("data", SpeechConstant.FALSE_STR)));
            }
        };
        new e1d() { // from class: com.oplus.aiunit.vision.c1d
            @Override // com.oplus.aiunit.vision.e1d
            public final Object g(Bundle bundle) {
                return Integer.valueOf(Integer.parseInt(bundle.getString("data", "-1")));
            }
        };
    }

    static /* synthetic */ CarStatus O00(Bundle bundle) {
        try {
            return (CarStatus) g1d.a(bundle.getString("data"), CarStatus.class);
        } catch (Exception e2) {
            d1d.b("TypeConverter", "e:", e2);
            return null;
        }
    }

    static /* synthetic */ Void b(Bundle bundle) {
        return null;
    }

    static /* synthetic */ List c(Bundle bundle) {
        try {
            return Arrays.asList((CarInfo[]) g1d.a(bundle.getString("data"), CarInfo[].class));
        } catch (Exception e2) {
            d1d.b("TypeConverter", "e:", e2);
            return null;
        }
    }

    static /* synthetic */ CompanyInfo e(Bundle bundle) {
        try {
            return (CompanyInfo) g1d.a(bundle.getString("data"), CompanyInfo.class);
        } catch (Exception e2) {
            d1d.b("TypeConverter", "e:", e2);
            return null;
        }
    }

    static /* synthetic */ CarInfo h(Bundle bundle) {
        try {
            return (CarInfo) g1d.a(bundle.getString("data"), CarInfo.class);
        } catch (Exception e2) {
            d1d.b("TypeConverter", "e:", e2);
            return null;
        }
    }

    T g(Bundle bundle);
}
