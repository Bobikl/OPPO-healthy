package com.oplus.carlink.controlsdk;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.e1d;
import com.oplus.aiunit.vision.f1d;
import com.oplus.aiunit.vision.g1d;
import com.oplus.carlink.controlsdk.data.CarInfo;
import com.oplus.carlink.controlsdk.data.CarStatus;
import com.oplus.carlink.controlsdk.data.CompanyInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.oplus.carlink.controlsdk.a$a, reason: collision with other inner class name */
    @FunctionalInterface
    public interface InterfaceC0954a {
        void a(f1d f1dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$carControl$9(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("car_control", bundle, carControlCallback.asCarControlCallback(e1d.f10750O00));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCarInfo$5(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("get_car_info", bundle, carControlCallback.asCarControlCallback(e1d.f10752OO0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCarList$2(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("get_car_list", bundle, carControlCallback.asCarControlCallback(e1d.O000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCarStatus$6(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("get_car_status", bundle, carControlCallback.asCarControlCallback(e1d.f10751O0O));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCompanyInfo$4(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("get_company_info", bundle, carControlCallback.asCarControlCallback(e1d.OOO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCurrentCar$3(CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("get_current_car", new Bundle(), carControlCallback.asCarControlCallback(e1d.f10752OO0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getServiceStatus$0(CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("get_service_status", new Bundle(), carControlCallback.asCarControlCallback(e1d.f10750O00));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hasCarBinding$10(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("has_car_binding", bundle, carControlCallback.asCarControlCallback(e1d.O00O));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isCompanySupport$1(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("is_company_support", bundle, carControlCallback.asCarControlCallback(e1d.O00O));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showUserAgreement$11(CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("show_cta", new Bundle(), carControlCallback.asCarControlCallback(e1d.O00O));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startCarBinding$7(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("start_car_binding", bundle, carControlCallback.asCarControlCallback(e1d.f10752OO0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unbindCar$8(Bundle bundle, CarControlCallback carControlCallback, f1d f1dVar) {
        f1dVar.a("unbind_car", bundle, carControlCallback.asCarControlCallback(e1d.f10750O00));
    }

    public void carControl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Boolean bool, @NotNull final CarControlCallback<Void> carControlCallback) {
        final Bundle bundle = new Bundle();
        bundle.putString("company_id", g1d.c(str));
        bundle.putString("car_id", str2);
        bundle.putString("control_skill", str3);
        bundle.putString("control_action", str4);
        bundle.putBoolean("control_is_show_toast", bool.booleanValue());
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.e0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$carControl$9(bundle, carControlCallback, f1dVar);
            }
        });
    }

    public void getCarInfo(@NotNull String str, @NotNull String str2, @NotNull final CarControlCallback<CarInfo> carControlCallback) {
        final Bundle bundle = new Bundle();
        bundle.putString("company_id", g1d.c(str));
        bundle.putString("car_id", str2);
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.j0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$getCarInfo$5(bundle, carControlCallback, f1dVar);
            }
        });
    }

    public void getCarList(String str, @NotNull final CarControlCallback<List<CarInfo>> carControlCallback) {
        final Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("company_id", g1d.c(str));
        }
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.g0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$getCarList$2(bundle, carControlCallback, f1dVar);
            }
        });
    }

    public void getCarStatus(@NotNull String str, @NotNull String str2, @NotNull final CarControlCallback<CarStatus> carControlCallback) {
        final Bundle bundle = new Bundle();
        bundle.putString("company_id", g1d.c(str));
        bundle.putString("car_id", str2);
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.h0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$getCarStatus$6(bundle, carControlCallback, f1dVar);
            }
        });
    }

    public void getCompanyInfo(@NotNull String str, @NotNull final CarControlCallback<CompanyInfo> carControlCallback) {
        final Bundle bundle = new Bundle();
        bundle.putString("company_id", g1d.c(str));
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.k0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$getCompanyInfo$4(bundle, carControlCallback, f1dVar);
            }
        });
    }

    public void getCurrentCar(@NotNull final CarControlCallback<CarInfo> carControlCallback) {
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.i0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$getCurrentCar$3(carControlCallback, f1dVar);
            }
        });
    }

    public void getServiceStatus(@NotNull final CarControlCallback<Void> carControlCallback) {
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.d0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$getServiceStatus$0(carControlCallback, f1dVar);
            }
        });
    }

    public void hasCarBinding(@NotNull String str, String str2, @NotNull final CarControlCallback<Boolean> carControlCallback) {
        final Bundle bundle = new Bundle();
        bundle.putString("company_id", g1d.c(str));
        if (str2 != null) {
            bundle.putString("car_id", str2);
        }
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.c0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$hasCarBinding$10(bundle, carControlCallback, f1dVar);
            }
        });
    }

    public void isCompanySupport(@NotNull String str, @NotNull final CarControlCallback<Boolean> carControlCallback) {
        final Bundle bundle = new Bundle();
        bundle.putString("company_id", g1d.c(str));
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.a0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$isCompanySupport$1(bundle, carControlCallback, f1dVar);
            }
        });
    }

    public abstract void safeCall(@NonNull CarControlCallback<?> carControlCallback, @NonNull InterfaceC0954a interfaceC0954a);

    public void showUserAgreement(@NotNull final CarControlCallback<Boolean> carControlCallback) {
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.f0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$showUserAgreement$11(carControlCallback, f1dVar);
            }
        });
    }

    public void startCarBinding(@Nullable String str, int i, boolean z, @Nullable String str2, @NotNull final CarControlCallback<CarInfo> carControlCallback) {
        final Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("company_id", g1d.c(str));
        }
        if (i > 0) {
            bundle.putInt("car_binding_timeout", i);
        }
        bundle.putBoolean("is_download_app", z);
        if (str2 != null) {
            bundle.putString("jump_deeplink", str2);
        }
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.l0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$startCarBinding$7(bundle, carControlCallback, f1dVar);
            }
        });
    }

    public void unbindCar(@NotNull String str, @NotNull final CarControlCallback<Void> carControlCallback) {
        final Bundle bundle = new Bundle();
        bundle.putString("company_id", g1d.c(str));
        safeCall(carControlCallback, new InterfaceC0954a() { // from class: com.oplus.aiunit.vision.b0d
            @Override // com.oplus.carlink.controlsdk.a.InterfaceC0954a
            public final void a(f1d f1dVar) {
                com.oplus.carlink.controlsdk.a.lambda$unbindCar$8(bundle, carControlCallback, f1dVar);
            }
        });
    }
}
