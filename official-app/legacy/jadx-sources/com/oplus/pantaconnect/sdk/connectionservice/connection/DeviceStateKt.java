package com.oplus.pantaconnect.sdk.connectionservice.connection;

import coconut.pitaya;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceState;", "Lcoconut/pitaya;", "toBufferType", "(Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceState;)Lcoconut/pitaya;", "toExternalType", "(Lcoconut/pitaya;)Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceState;", "connectionservice_release"}, k = 2, mv = {1, 9, 0})
public final class DeviceStateKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceState.values().length];
            try {
                iArr[DeviceState.DISCOVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceState.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceState.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceState.LOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[pitaya.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pitaya pitayaVar = pitaya.DISCOVERED;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pitaya pitayaVar2 = pitaya.DISCOVERED;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pitaya pitayaVar3 = pitaya.DISCOVERED;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final pitaya toBufferType(@NotNull DeviceState deviceState) {
        int i = WhenMappings.$EnumSwitchMapping$0[deviceState.ordinal()];
        if (i == 1) {
            return pitaya.DISCOVERED;
        }
        if (i == 2) {
            return pitaya.CONNECTED;
        }
        if (i == 3) {
            return pitaya.DISCONNECTED;
        }
        if (i == 4) {
            return pitaya.LOST;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final DeviceState toExternalType(@NotNull pitaya pitayaVar) {
        int i = WhenMappings.$EnumSwitchMapping$1[pitayaVar.ordinal()];
        if (i == 1) {
            return DeviceState.DISCOVERED;
        }
        if (i == 2) {
            return DeviceState.CONNECTED;
        }
        if (i != 3) {
            return i != 4 ? DeviceState.DISCOVERED : DeviceState.LOST;
        }
        return DeviceState.DISCONNECTED;
    }
}
