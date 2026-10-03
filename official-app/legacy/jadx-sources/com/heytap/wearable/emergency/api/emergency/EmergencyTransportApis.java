package com.heytap.wearable.emergency.api.emergency;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.wearable.emergency.api.IEmergencyAidl;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import com.oplus.aiunit.vision.a7b;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0007J\u0010\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/heytap/wearable/emergency/api/emergency/EmergencyTransportApis;", "", "Lkotlin/Function1;", "Lcom/heytap/wearable/emergency/api/IEmergencyAidl;", "Lkotlin/ParameterName;", "name", "service", "", "code", "b", "", "url", "", "d", "Landroid/os/Bundle;", "data", MapSchema.FIELD_NAME_ENTRY, "f", "TAG", "Ljava/lang/String;", "EMERGENCY_TRANSPORT_AIDL", "EMERGENCY_SAFE_EVENT_KEY", "EMERGENCY_SAFE_EVENT_KEY_FLUID", "KEY_TRAVEL_ID", "<init>", "()V", "emergency_release"}, k = 1, mv = {1, 8, 0})
public final class EmergencyTransportApis {

    @NotNull
    public static final String EMERGENCY_SAFE_EVENT_KEY = "safe_event";

    @NotNull
    public static final String EMERGENCY_SAFE_EVENT_KEY_FLUID = "update_fluid";

    @NotNull
    public static final String EMERGENCY_TRANSPORT_AIDL = "emergency_transport_aidl";

    @NotNull
    public static final EmergencyTransportApis INSTANCE = new EmergencyTransportApis();

    @NotNull
    public static final String KEY_TRAVEL_ID = "travelId";

    @NotNull
    public static final String TAG = "HSG_TransportApis";

    public static final IEmergencyAidl c(IBinder iBinder) {
        return IEmergencyAidl.Stub.asInterface(iBinder);
    }

    @SuppressLint({"CheckResult"})
    public final void b(@NotNull Function1<? super IEmergencyAidl, Unit> code) {
        Intrinsics.checkNotNullParameter(code, "code");
        IEmergencyAidl iEmergencyAidl = (IEmergencyAidl) ClientManager.getInstance().getBuildService(EMERGENCY_TRANSPORT_AIDL, new ClientManager.a() { // from class: com.oplus.aiunit.vision.il6
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return EmergencyTransportApis.c(iBinder);
            }
        });
        if (iEmergencyAidl == null) {
            a7b.m("HSG_TransportApis", "getService: service is null");
        }
        if (iEmergencyAidl != null) {
            code.invoke(iEmergencyAidl);
        }
    }

    public final boolean d(@Nullable String url) {
        return (url != null && StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) KEY_TRAVEL_ID, false, 2, (Object) null)) && StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "guardId", false, 2, (Object) null);
    }

    public final void e(@NotNull final Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        b(new Function1<IEmergencyAidl, Unit>() { // from class: com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis$pushSafeEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IEmergencyAidl iEmergencyAidl) throws RemoteException {
                invoke2(iEmergencyAidl);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IEmergencyAidl it) throws RemoteException {
                Intrinsics.checkNotNullParameter(it, "it");
                it.pushSafeEvent(data);
            }
        });
    }

    public final void f(@NotNull final Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        b(new Function1<IEmergencyAidl, Unit>() { // from class: com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis$updateFluidDate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IEmergencyAidl iEmergencyAidl) throws RemoteException {
                invoke2(iEmergencyAidl);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IEmergencyAidl it) throws RemoteException {
                Intrinsics.checkNotNullParameter(it, "it");
                it.updateFluidDate(data);
            }
        });
    }
}
