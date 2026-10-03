package com.oplus.aiunit.vision;

import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/xh8;", "", "", "toString", "Lokio/ByteString;", "a", "b", "", "hashCode", "other", "", "equals", "I", "hpackSize", "Lokio/ByteString;", "name", "c", "value", "<init>", "(Lokio/ByteString;Lokio/ByteString;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/ByteString;Ljava/lang/String;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class xh8 {

    @JvmField
    @NotNull
    public static final ByteString PSEUDO_PREFIX;

    @JvmField
    @NotNull
    public static final ByteString RESPONSE_STATUS;

    @NotNull
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @JvmField
    @NotNull
    public static final ByteString TARGET_AUTHORITY;

    @NotNull
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @JvmField
    @NotNull
    public static final ByteString TARGET_METHOD;

    @NotNull
    public static final String TARGET_METHOD_UTF8 = ":method";

    @JvmField
    @NotNull
    public static final ByteString TARGET_PATH;

    @NotNull
    public static final String TARGET_PATH_UTF8 = ":path";

    @JvmField
    @NotNull
    public static final ByteString TARGET_SCHEME;

    @NotNull
    public static final String TARGET_SCHEME_UTF8 = ":scheme";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int hpackSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final ByteString name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    @NotNull
    public final ByteString value;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        PSEUDO_PREFIX = companion.encodeUtf8(":");
        RESPONSE_STATUS = companion.encodeUtf8(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = companion.encodeUtf8(TARGET_METHOD_UTF8);
        TARGET_PATH = companion.encodeUtf8(TARGET_PATH_UTF8);
        TARGET_SCHEME = companion.encodeUtf8(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = companion.encodeUtf8(TARGET_AUTHORITY_UTF8);
    }

    public xh8(@NotNull ByteString name, @NotNull ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.size() + 32 + value.size();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ByteString getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ByteString getValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof xh8)) {
            return false;
        }
        xh8 xh8Var = (xh8) other;
        return Intrinsics.areEqual(this.name, xh8Var.name) && Intrinsics.areEqual(this.value, xh8Var.value);
    }

    public int hashCode() {
        ByteString byteString = this.name;
        int iHashCode = (byteString != null ? byteString.hashCode() : 0) * 31;
        ByteString byteString2 = this.value;
        return iHashCode + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xh8(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.encodeUtf8(name), companion.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xh8(@NotNull ByteString name, @NotNull String value) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
