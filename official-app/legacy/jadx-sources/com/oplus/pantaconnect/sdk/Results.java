package com.oplus.pantaconnect.sdk;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.platform.usercenter.account.ams.ipc.AcResultHelper;

/* JADX INFO: loaded from: classes8.dex */
public final class Results {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rresults.proto\u0012\u001acom.oplus.pantaconnect.sdk\"£\u0001\n\fSealedResult\u0012:\n\nresultCode\u0018\u0001 \u0001(\u000e2&.com.oplus.pantaconnect.sdk.ResultCode\u0012\f\n\u0004data\u0018\u0002 \u0001(\f\u00128\n\terrorCode\u0018\u0003 \u0001(\u000e2%.com.oplus.pantaconnect.sdk.ErrorCode\u0012\u000f\n\u0007message\u0018\u0004 \u0001(\t*@\n\nResultCode\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\u0012\r\n\tCANCELLED\u0010\u0003*â\u0001\n\tErrorCode\u0012\u0016\n\u0012ERROR_CODE_UNKNOWN\u0010\u0000\u0012\u001c\n\u0018ERROR_CODE_FOR_DISCOVERY\u0010\u0001\u0012\u001d\n\u0019ERROR_CODE_FOR_CONNECTION\u0010\u0002\u0012\u001c\n\u0018ERROR_CODE_FOR_TRANSPORT\u0010\u0003\u0012\u001b\n\u0017ERROR_CODE_FOR_DATA_BUS\u0010\u0004\u0012!\n\u001dERROR_CODE_FOR_DEVICE_MANAGER\u0010\u0005\u0012\"\n\u001eERROR_CODE_FOR_NETWORK_MANAGER\u0010\u0006B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_sdk_SealedResult_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_sdk_SealedResult_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_oplus_pantaconnect_sdk_SealedResult_descriptor = descriptor2;
        internal_static_com_oplus_pantaconnect_sdk_SealedResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ResultCode", "Data", "ErrorCode", AcResultHelper.KEY_MSG});
    }

    private Results() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
