package com.oplus.channel.client.data;

import android.os.Parcel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.channel.client.data.CommandClient, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/channel/client/data/CommandClient;", "", "methodType", "", "callbackId", "", "params", "", "(ILjava/lang/String;[B)V", "getCallbackId", "()Ljava/lang/String;", "getMethodType", "()I", "getParams", "()[B", "toString", "Companion", "Method", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DATA_ITEM_END = 100;
    private static final int DATA_TYPE_BYTE_ARRAY = 3;
    private static final int DATA_TYPE_INT = 1;
    private static final int DATA_TYPE_STRING = 2;
    public static final int DATA_VERSION_OF_TYPE = 1;

    @NotNull
    private final String callbackId;
    private final int methodType;

    @Nullable
    private final byte[] params;

    /* JADX INFO: renamed from: com.oplus.channel.client.data.CommandClient$Companion, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/oplus/channel/client/data/CommandClient$Companion;", "", "()V", "DATA_ITEM_END", "", "DATA_TYPE_BYTE_ARRAY", "DATA_TYPE_INT", "DATA_TYPE_STRING", "DATA_VERSION_OF_TYPE", "passObject", "", "parcel", "Landroid/os/Parcel;", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void passObject(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = 0;
            while (i != 100) {
                i = parcel.readInt();
                if (i == 1) {
                    parcel.readInt();
                } else if (i == 2) {
                    parcel.readString();
                } else if (i == 3) {
                    parcel.readByteArray(new byte[parcel.readInt()]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.oplus.channel.client.data.CommandClient$Method */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/oplus/channel/client/data/CommandClient$Method;", "", "()V", "OBSERVE", "", "REPLACE_OBSERVE", "REQUEST", "REQUEST_ONCE", "STOP_OBSERVE", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Method {

        @NotNull
        public static final Method INSTANCE = new Method();
        public static final int OBSERVE = 2;
        public static final int REPLACE_OBSERVE = 3;
        public static final int REQUEST = 0;
        public static final int REQUEST_ONCE = 1;
        public static final int STOP_OBSERVE = 4;

        private Method() {
        }
    }

    public Command(int i, @NotNull String callbackId, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        this.methodType = i;
        this.callbackId = callbackId;
        this.params = bArr;
    }

    @NotNull
    public final String getCallbackId() {
        return this.callbackId;
    }

    public final int getMethodType() {
        return this.methodType;
    }

    @Nullable
    public final byte[] getParams() {
        return this.params;
    }

    @NotNull
    public String toString() {
        return "Command(methodType=" + this.methodType + ", callbackId=" + this.callbackId + ')';
    }

    public /* synthetic */ Command(int i, String str, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : bArr);
    }
}
