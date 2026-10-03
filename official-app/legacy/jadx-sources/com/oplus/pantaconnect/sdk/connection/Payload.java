package com.oplus.pantaconnect.sdk.connection;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.oplus.smartenginehelper.ParserTag;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J)\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0011J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0013J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0015J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0017J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006+"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/Payload;", "", "type", "Lcom/oplus/pantaconnect/sdk/connection/Payload$Type;", "payload", "id", "", "(Lcom/oplus/pantaconnect/sdk/connection/Payload$Type;Ljava/lang/Object;I)V", "getId", "()I", "getPayload", "()Ljava/lang/Object;", "setPayload", "(Ljava/lang/Object;)V", "getType", "()Lcom/oplus/pantaconnect/sdk/connection/Payload$Type;", "asBytes", "", "asParcelFileDescriptor", "Landroid/os/ParcelFileDescriptor;", "asStream", "Ljava/io/InputStream;", "asUri", "Landroid/net/Uri;", "component1", "component2", "component3", "copy", "equals", "", "other", "fromBytes", "bytes", "fromParcelFileDescriptor", "parcelFileDescriptor", "fromStream", "stream", "fromUri", ParserTag.TAG_URI, "hashCode", "toString", "", "Type", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Payload {
    private final int id;

    @Nullable
    private Object payload;

    @NotNull
    private final Type type;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/Payload$Type;", "", "(Ljava/lang/String;I)V", "BYTES", "FILE", "STREAM", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Type {
        BYTES,
        FILE,
        STREAM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }
    }

    @JvmOverloads
    public Payload(@NotNull Type type) {
        this(type, null, 0, 6, null);
    }

    public static /* synthetic */ Payload copy$default(Payload payload, Type type, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            type = payload.type;
        }
        if ((i2 & 2) != 0) {
            obj = payload.payload;
        }
        if ((i2 & 4) != 0) {
            i = payload.id;
        }
        return payload.copy(type, obj, i);
    }

    @NotNull
    public final byte[] asBytes() {
        Object obj = this.payload;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        return (byte[]) obj;
    }

    @NotNull
    public final ParcelFileDescriptor asParcelFileDescriptor() {
        Object obj = this.payload;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.os.ParcelFileDescriptor");
        return (ParcelFileDescriptor) obj;
    }

    @NotNull
    public final InputStream asStream() {
        Object obj = this.payload;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.io.InputStream");
        return (InputStream) obj;
    }

    @NotNull
    public final Uri asUri() {
        Object obj = this.payload;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.net.Uri");
        return (Uri) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Payload copy(@NotNull Type type, @Nullable Object payload, int id) {
        return new Payload(type, payload, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) other;
        return this.type == payload.type && Intrinsics.areEqual(this.payload, payload.payload) && this.id == payload.id;
    }

    @NotNull
    public final Payload fromBytes(@NotNull byte[] bytes) {
        this.payload = bytes;
        return this;
    }

    @NotNull
    public final Payload fromParcelFileDescriptor(@NotNull ParcelFileDescriptor parcelFileDescriptor) {
        this.payload = parcelFileDescriptor;
        return this;
    }

    @NotNull
    public final Payload fromStream(@NotNull InputStream stream) {
        this.payload = stream;
        return this;
    }

    @NotNull
    public final Payload fromUri(@NotNull Uri uri) {
        this.payload = uri;
        return this;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Object getPayload() {
        return this.payload;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Object obj = this.payload;
        return Integer.hashCode(this.id) + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final void setPayload(@Nullable Object obj) {
        this.payload = obj;
    }

    @NotNull
    public String toString() {
        return "Payload(type=" + this.type + ", payload=" + this.payload + ", id=" + this.id + ')';
    }

    @JvmOverloads
    public Payload(@NotNull Type type, @Nullable Object obj) {
        this(type, obj, 0, 4, null);
    }

    @JvmOverloads
    public Payload(@NotNull Type type, @Nullable Object obj, int i) {
        this.type = type;
        this.payload = obj;
        this.id = i;
    }

    public /* synthetic */ Payload(Type type, Object obj, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? -1 : i);
    }
}
