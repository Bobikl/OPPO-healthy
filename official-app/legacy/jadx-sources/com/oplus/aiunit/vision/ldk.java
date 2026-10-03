package com.oplus.aiunit.vision;

import android.os.Build;
import android.os.Bundle;
import java.util.List;
import org.iccoa.android.digitalkey.DigitalKeyData;

/* JADX INFO: loaded from: classes11.dex */
@FunctionalInterface
public interface ldk<T> {
    public static final ldk<Void> TYPE_CONVERTER_VOID = new ldk() { // from class: com.oplus.aiunit.vision.edk
        @Override // com.oplus.aiunit.vision.ldk
        public final Object m(Bundle bundle) {
            return ldk.c(bundle);
        }
    };
    public static final ldk<List<DigitalKeyData>> TYPE_CONVERTER_DIGITAL_KEY_DATA_LIST = new ldk() { // from class: com.oplus.aiunit.vision.fdk
        @Override // com.oplus.aiunit.vision.ldk
        public final Object m(Bundle bundle) {
            return ldk.d(bundle);
        }
    };
    public static final ldk<DigitalKeyData> TYPE_CONVERTER_DIGITAL_KEY_DATA = new ldk() { // from class: com.oplus.aiunit.vision.gdk
        @Override // com.oplus.aiunit.vision.ldk
        public final Object m(Bundle bundle) {
            return ldk.h(bundle);
        }
    };
    public static final ldk<String> TYPE_CONVERTER_STRING = new ldk() { // from class: com.oplus.aiunit.vision.hdk
        @Override // com.oplus.aiunit.vision.ldk
        public final Object m(Bundle bundle) {
            return ldk.i(bundle);
        }
    };
    public static final ldk<byte[]> TYPE_CONVERTER_BYTES = new ldk() { // from class: com.oplus.aiunit.vision.idk
        @Override // com.oplus.aiunit.vision.ldk
        public final Object m(Bundle bundle) {
            return ldk.j(bundle);
        }
    };
    public static final ldk<Boolean> TYPE_CONVERTER_BOOLEAN = new ldk() { // from class: com.oplus.aiunit.vision.jdk
        @Override // com.oplus.aiunit.vision.ldk
        public final Object m(Bundle bundle) {
            return ldk.k(bundle);
        }
    };
    public static final ldk<Integer> TYPE_CONVERTER_INTEGER = new ldk() { // from class: com.oplus.aiunit.vision.kdk
        @Override // com.oplus.aiunit.vision.ldk
        public final Object m(Bundle bundle) {
            return ldk.f(bundle);
        }
    };

    static /* synthetic */ Void c(Bundle bundle) {
        return null;
    }

    static /* synthetic */ List d(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("data", DigitalKeyData.class) : bundle.getParcelableArrayList("data");
    }

    static /* synthetic */ Integer f(Bundle bundle) {
        return Integer.valueOf(bundle.getInt("data", -1));
    }

    static /* synthetic */ DigitalKeyData h(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? (DigitalKeyData) bundle.getParcelable("data", DigitalKeyData.class) : (DigitalKeyData) bundle.getParcelable("data");
    }

    static /* synthetic */ String i(Bundle bundle) {
        return bundle.getString("data", "");
    }

    static /* synthetic */ byte[] j(Bundle bundle) {
        return bundle.getByteArray("data");
    }

    static /* synthetic */ Boolean k(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean("data", false));
    }

    T m(Bundle bundle);
}
