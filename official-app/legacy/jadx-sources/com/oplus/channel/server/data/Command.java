package com.oplus.channel.server.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000e\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/channel/server/data/Command;", "", "methodType", "", "callbackId", "", "params", "", "businessTag", "(ILjava/lang/String;[BLjava/lang/Object;)V", "getBusinessTag", "()Ljava/lang/Object;", "getCallbackId", "()Ljava/lang/String;", "getMethodType", "()I", "getParams", "()[B", "toString", "Companion", "Method", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Command {
    public static final int DATA_ITEM_END = 100;
    public static final int DATA_TYPE_BYTE_ARRAY = 3;
    public static final int DATA_TYPE_INT = 1;
    public static final int DATA_TYPE_STRING = 2;
    public static final int DATA_VERSION_OF_TYPE = 1;

    @Nullable
    private final Object businessTag;

    @NotNull
    private final String callbackId;
    private final int methodType;

    @Nullable
    private final byte[] params;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/oplus/channel/server/data/Command$Method;", "", "()V", "OBSERVE", "", "REPLACE_OBSERVE", "REQUEST", "REQUEST_ONCE", "STOP_OBSERVE", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    public Command(int i, @NotNull String callbackId, @Nullable byte[] bArr, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        this.methodType = i;
        this.callbackId = callbackId;
        this.params = bArr;
        this.businessTag = obj;
    }

    @Nullable
    public final Object getBusinessTag() {
        return this.businessTag;
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
        return "Command(methodType=" + this.methodType + ", callbackId=" + this.callbackId + ", businessTag = " + this.businessTag + ')';
    }

    public /* synthetic */ Command(int i, String str, byte[] bArr, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : bArr, (i2 & 8) != 0 ? null : obj);
    }
}
