package com.oplus.deepthinker.sdk.app.aidl.proton.intentdecision;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.reflect.TypeToken;
import com.oplus.aiunit.vision.tc8;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0014H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005¨\u0006\u001b"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/ServiceResult;", "Landroid/os/Parcelable;", "services", "", "Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/Service;", "(Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "extra", "Landroid/os/Bundle;", "getExtra", "()Landroid/os/Bundle;", "setExtra", "(Landroid/os/Bundle;)V", "", "getServices", "()Ljava/util/List;", "setServices", "describeContents", "", "toString", "", "writeToParcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "CREATOR", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ServiceResult implements Parcelable {

    @NotNull
    public static final String BUNDLE_KEY_SERVICE_RESULT = "service_result";

    @NotNull
    public static final String BUNDLE_KEY_TOP_K_SERVICE = "top_k_service";

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Bundle extra;

    @NotNull
    private List<Service> services;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.aidl.proton.intentdecision.ServiceResult$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001d\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/ServiceResult$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/ServiceResult;", "()V", "BUNDLE_KEY_SERVICE_RESULT", "", "BUNDLE_KEY_TOP_K_SERVICE", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/ServiceResult;", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ServiceResult> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ServiceResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ServiceResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ServiceResult[] newArray(int size) {
            return new ServiceResult[size];
        }
    }

    public ServiceResult(@NotNull List<Service> services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.services = new ArrayList();
        List<Service> list = services;
        if (!list.isEmpty()) {
            this.services.addAll(list);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Bundle getExtra() {
        return this.extra;
    }

    @NotNull
    public final List<Service> getServices() {
        return this.services;
    }

    public final void setExtra(@Nullable Bundle bundle) {
        this.extra = bundle;
    }

    public final void setServices(@NotNull List<Service> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.services = list;
    }

    @NotNull
    public String toString() {
        return "ServiceResult{services = " + this.services + ", extra = " + this.extra + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(tc8.b(this.services));
        parcel.writeBundle(this.extra);
    }

    public ServiceResult(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.services = new ArrayList();
        String string = parcel.readString();
        this.extra = parcel.readBundle(ServiceResult.class.getClassLoader());
        Type type = new TypeToken<List<? extends Service>>() { // from class: com.oplus.deepthinker.sdk.app.aidl.proton.intentdecision.ServiceResult$special$$inlined$genericType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
        List list = (List) tc8.a(string, type);
        if (list == null) {
            return;
        }
        getServices().addAll(list);
    }
}
