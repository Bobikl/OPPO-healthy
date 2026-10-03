package com.oplus.pantaconnect.sdk.discovery;

import com.oplus.pantaconnect.agents.InternalDiscoverableDeviceLevel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toInternalDiscoverableDeviceLevel", "Lcom/oplus/pantaconnect/agents/InternalDiscoverableDeviceLevel;", "Lcom/oplus/pantaconnect/sdk/discovery/DiscoverableDeviceLevel;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DiscoverableDeviceLevelKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverableDeviceLevel.values().length];
            try {
                iArr[DiscoverableDeviceLevel.SAME_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverableDeviceLevel.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final InternalDiscoverableDeviceLevel toInternalDiscoverableDeviceLevel(@NotNull DiscoverableDeviceLevel discoverableDeviceLevel) {
        int i = WhenMappings.$EnumSwitchMapping$0[discoverableDeviceLevel.ordinal()];
        if (i == 1) {
            return InternalDiscoverableDeviceLevel.SAME_ACCOUNT_DEVICE;
        }
        if (i == 2) {
            return InternalDiscoverableDeviceLevel.ALL_DEVICE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
