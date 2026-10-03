package com.heytap.health.service;

import android.companion.AssociationInfo;
import android.companion.CompanionDeviceService;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@RequiresApi(31)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/service/CompanionDeviceDaemonService;", "Landroid/companion/CompanionDeviceService;", "", "onCreate", "", "address", "onDeviceAppeared", "Landroid/companion/AssociationInfo;", "associationInfo", "onDeviceDisappeared", "onDestroy", "<init>", "()V", "Companion", "a", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class CompanionDeviceDaemonService extends CompanionDeviceService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a7b.f("CDM#Service", "onCreate: CompanionDeviceDaemonService created");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        a7b.f("CDM#Service", "onDestroy: CompanionDeviceDaemonService destroyed");
    }

    public void onDeviceAppeared(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        a7b.f("CDM#Service", "onDeviceAppeared " + address);
    }

    public void onDeviceDisappeared(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        a7b.f("CDM#Service", "onDeviceDisappeared " + address);
    }

    public void onDeviceAppeared(@NotNull AssociationInfo associationInfo) {
        Intrinsics.checkNotNullParameter(associationInfo, "associationInfo");
        try {
            super.onDeviceAppeared(associationInfo);
            if (Build.VERSION.SDK_INT >= 33) {
                a7b.f("CDM#Service", "onDeviceAppeared " + ((Object) associationInfo.getDisplayName()));
            }
        } catch (Exception unused) {
            a7b.b("CDM#Service", "onDeviceAppeared error");
        }
    }

    public void onDeviceDisappeared(@NotNull AssociationInfo associationInfo) {
        Intrinsics.checkNotNullParameter(associationInfo, "associationInfo");
        try {
            super.onDeviceDisappeared(associationInfo);
            if (Build.VERSION.SDK_INT >= 33) {
                a7b.f("CDM#Service", "onDeviceDisappeared " + ((Object) associationInfo.getDisplayName()));
            }
        } catch (Exception unused) {
            a7b.b("CDM#Service", "onDeviceDisappeared error");
        }
    }
}
