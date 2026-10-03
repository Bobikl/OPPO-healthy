package com.squareup.wire;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.oplus.aiunit.vision.c8l;
import com.oplus.smartenginehelper.ParserTag;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.JvmClassMappingKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KClass;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 E*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002EFB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0000J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0000J\u0015\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001bH&¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u0013\u0010\u0019\u001a\u00028\u00002\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\u0013\u0010\u0019\u001a\u00028\u00002\u0006\u0010#\u001a\u00020$¢\u0006\u0002\u0010%J\u0013\u0010\u0019\u001a\u00028\u00002\u0006\u0010 \u001a\u00020&¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u001d\u0010(\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010)\u001a\u00028\u0000H&¢\u0006\u0002\u0010.J\u001b\u0010(\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020/2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u00100J\u001b\u0010(\u001a\u00020+2\u0006\u00101\u001a\u0002022\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u00103J'\u00104\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u00105\u001a\u0002062\b\u0010)\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u00107J\u0015\u00108\u001a\u0002062\u0006\u0010)\u001a\u00028\u0000H&¢\u0006\u0002\u00109J\u001f\u0010:\u001a\u0002062\u0006\u00105\u001a\u0002062\b\u0010)\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010;J\u0015\u0010<\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H&¢\u0006\u0002\u0010=J\u0015\u0010>\u001a\u00020?2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010@J\u0019\u0010A\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010B\u001a\u00020CH\u0000¢\u0006\u0002\bDR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006G"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", ExifInterface.LONGITUDE_EAST, "", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "type", "Ljava/lang/Class;", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;)V", "Lkotlin/reflect/KClass;", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;)V", "getFieldEncoding$wire_runtime", "()Lcom/squareup/wire/FieldEncoding;", "packedAdapter", "", "getPackedAdapter$wire_runtime", "()Lcom/squareup/wire/ProtoAdapter;", "setPackedAdapter$wire_runtime", "(Lcom/squareup/wire/ProtoAdapter;)V", "repeatedAdapter", "getRepeatedAdapter$wire_runtime", "setRepeatedAdapter$wire_runtime", "getType", "()Lkotlin/reflect/KClass;", "asPacked", "asRepeated", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Object;", "stream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "bytes", "", "([B)Ljava/lang/Object;", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)Ljava/lang/Object;", "Lokio/ByteString;", "(Lokio/ByteString;)Ljava/lang/Object;", "encode", "value", "(Ljava/lang/Object;)[B", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "(Lcom/squareup/wire/ProtoWriter;Ljava/lang/Object;)V", "Ljava/io/OutputStream;", "(Ljava/io/OutputStream;Ljava/lang/Object;)V", "sink", "Lokio/BufferedSink;", "(Lokio/BufferedSink;Ljava/lang/Object;)V", "encodeWithTag", "tag", "", "(Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "encodedSize", "(Ljava/lang/Object;)I", "encodedSizeWithTag", "(ILjava/lang/Object;)I", "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "(Ljava/lang/Object;)Ljava/lang/String;", "withLabel", Feedback.WIDGET_LABEL, "Lcom/squareup/wire/WireField$Label;", "withLabel$wire_runtime", "Companion", "EnumConstantNotFoundException", "wire-runtime"}, k = 1, mv = {1, 1, 15})
public abstract class ProtoAdapter<E> {

    @NotNull
    private final FieldEncoding fieldEncoding;

    @Nullable
    private ProtoAdapter<List<E>> packedAdapter;

    @Nullable
    private ProtoAdapter<List<E>> repeatedAdapter;

    @Nullable
    private final KClass<?> type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ProtoAdapter<Boolean> BOOL = ProtoAdapterKt.COMMON_BOOL;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> INT32 = ProtoAdapterKt.COMMON_INT32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> UINT32 = ProtoAdapterKt.COMMON_UINT32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> SINT32 = ProtoAdapterKt.COMMON_SINT32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> FIXED32 = ProtoAdapterKt.COMMON_FIXED32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Integer> SFIXED32 = ProtoAdapterKt.COMMON_SFIXED32;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> INT64 = ProtoAdapterKt.COMMON_INT64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> UINT64 = ProtoAdapterKt.COMMON_UINT64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> SINT64 = ProtoAdapterKt.COMMON_SINT64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> FIXED64 = ProtoAdapterKt.COMMON_FIXED64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Long> SFIXED64 = ProtoAdapterKt.COMMON_SFIXED64;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Float> FLOAT = ProtoAdapterKt.COMMON_FLOAT;

    @JvmField
    @NotNull
    public static final ProtoAdapter<Double> DOUBLE = ProtoAdapterKt.COMMON_DOUBLE;

    @JvmField
    @NotNull
    public static final ProtoAdapter<ByteString> BYTES = ProtoAdapterKt.COMMON_BYTES;

    @JvmField
    @NotNull
    public static final ProtoAdapter<String> STRING = ProtoAdapterKt.COMMON_STRING;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0004\"\u0010\b\u0001\u0010\u001b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001d\u001a\u0002H\u001bH\u0007¢\u0006\u0002\u0010\u001eJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0004\"\u0004\b\u0001\u0010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001b0 H\u0007J\u0014\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010!\u001a\u00020\u0017H\u0007J&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H$0#\"\b\b\u0001\u0010$*\u00020%2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H$0 H\u0007JB\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u0002H)0'0\u0004\"\u0004\b\u0001\u0010(\"\u0004\b\u0002\u0010)2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H(0\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H)0\u0004H\u0007JH\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0004\"\u0014\b\u0001\u0010\u001b*\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H-0\u001c\"\u0014\b\u0002\u0010-*\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H-0.2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001b0 H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion;", "", "()V", "BOOL", "Lcom/squareup/wire/ProtoAdapter;", "", "BYTES", "Lokio/ByteString;", "DOUBLE", "", "FIXED32", "", "FIXED64", "", "FLOAT", "", "INT32", "INT64", "SFIXED32", "SFIXED64", "SINT32", "SINT64", "STRING", "", "UINT32", "UINT64", ParserTag.TAG_GET, "M", "Lcom/squareup/wire/Message;", "message", "(Lcom/squareup/wire/Message;)Lcom/squareup/wire/ProtoAdapter;", "type", "Ljava/lang/Class;", "adapterString", "newEnumAdapter", "Lcom/squareup/wire/EnumAdapter;", ExifInterface.LONGITUDE_EAST, "Lcom/squareup/wire/WireEnum;", "newMapAdapter", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "keyAdapter", "valueAdapter", "newMessageAdapter", c8l.KEY_B, "Lcom/squareup/wire/Message$Builder;", "wire-runtime"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <M extends Message<?, ?>> ProtoAdapter<M> get(@NotNull M message) {
            Intrinsics.checkParameterIsNotNull(message, "message");
            return get(message.getClass());
        }

        @JvmStatic
        @NotNull
        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(@NotNull Class<E> type) {
            Intrinsics.checkParameterIsNotNull(type, "type");
            return new RuntimeEnumAdapter(type);
        }

        @JvmStatic
        @NotNull
        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(@NotNull ProtoAdapter<K> keyAdapter, @NotNull ProtoAdapter<V> valueAdapter) {
            Intrinsics.checkParameterIsNotNull(keyAdapter, "keyAdapter");
            Intrinsics.checkParameterIsNotNull(valueAdapter, "valueAdapter");
            return new MapProtoAdapter(keyAdapter, valueAdapter);
        }

        @JvmStatic
        @NotNull
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> type) {
            Intrinsics.checkParameterIsNotNull(type, "type");
            return RuntimeMessageAdapter.INSTANCE.create(type);
        }

        @JvmStatic
        @NotNull
        public final <M> ProtoAdapter<M> get(@NotNull Class<M> type) {
            Intrinsics.checkParameterIsNotNull(type, "type");
            try {
                Object obj = type.getField("ADAPTER").get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M>");
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e2);
            } catch (NoSuchFieldException e3) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e3);
            }
        }

        @JvmStatic
        @NotNull
        public final ProtoAdapter<?> get(@NotNull String adapterString) {
            Intrinsics.checkParameterIsNotNull(adapterString, "adapterString");
            try {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) adapterString, '#', 0, false, 6, (Object) null);
                String strSubstring = adapterString.substring(0, iIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = adapterString.substring(iIndexOf$default + 1);
                Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                Object obj = Class.forName(strSubstring).getField(strSubstring2).get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException("failed to access " + adapterString, e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("failed to access " + adapterString, e3);
            } catch (NoSuchFieldException e4) {
                throw new IllegalArgumentException("failed to access " + adapterString, e4);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "value", "", "type", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "Lkotlin/reflect/KClass;", "(ILkotlin/reflect/KClass;)V", "wire-runtime"}, k = 1, mv = {1, 1, 15})
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {

        @JvmField
        public final int value;

        public EnumConstantNotFoundException(int i, @Nullable KClass<?> kClass) {
            Class javaClass;
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown enum tag ");
            sb.append(i);
            sb.append(" for ");
            sb.append((kClass == null || (javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass)) == null) ? null : javaClass.getName());
            super(sb.toString());
            this.value = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EnumConstantNotFoundException(int i, @NotNull Class<?> type) {
            this(i, (KClass<?>) JvmClassMappingKt.getKotlinClass(type));
            Intrinsics.checkParameterIsNotNull(type, "type");
        }
    }

    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass) {
        Intrinsics.checkParameterIsNotNull(fieldEncoding, "fieldEncoding");
        this.fieldEncoding = fieldEncoding;
        this.type = kClass;
    }

    @JvmStatic
    @NotNull
    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(@NotNull M m) {
        return INSTANCE.get(m);
    }

    @JvmStatic
    @NotNull
    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(@NotNull Class<E> cls) {
        return INSTANCE.newEnumAdapter(cls);
    }

    @JvmStatic
    @NotNull
    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(@NotNull ProtoAdapter<K> protoAdapter, @NotNull ProtoAdapter<V> protoAdapter2) {
        return INSTANCE.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @JvmStatic
    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls) {
        return INSTANCE.newMessageAdapter(cls);
    }

    @NotNull
    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> packedAdapter$wire_runtime = getPackedAdapter$wire_runtime();
        if (packedAdapter$wire_runtime != null) {
            return packedAdapter$wire_runtime;
        }
        FieldEncoding fieldEncoding = getFieldEncoding();
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        if (!(fieldEncoding != fieldEncoding2)) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
        }
        ProtoAdapterKt.AnonymousClass2 anonymousClass2 = new ProtoAdapterKt.AnonymousClass2(this, fieldEncoding2, Reflection.getOrCreateKotlinClass(List.class));
        setPackedAdapter$wire_runtime(anonymousClass2);
        return anonymousClass2;
    }

    @NotNull
    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> repeatedAdapter$wire_runtime = getRepeatedAdapter$wire_runtime();
        if (repeatedAdapter$wire_runtime != null) {
            return repeatedAdapter$wire_runtime;
        }
        ProtoAdapterKt.AnonymousClass1 anonymousClass1 = new ProtoAdapterKt.AnonymousClass1(this, this, getFieldEncoding(), Reflection.getOrCreateKotlinClass(List.class));
        setRepeatedAdapter$wire_runtime(anonymousClass1);
        return anonymousClass1;
    }

    public abstract E decode(@NotNull ProtoReader reader) throws IOException;

    public final E decode(@NotNull InputStream stream) throws IOException {
        Intrinsics.checkParameterIsNotNull(stream, "stream");
        return decode(Okio.buffer(Okio.source(stream)));
    }

    public abstract void encode(@NotNull ProtoWriter writer, E value) throws IOException;

    public final void encode(@NotNull OutputStream stream, E value) throws IOException {
        Intrinsics.checkParameterIsNotNull(stream, "stream");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(stream));
        encode(bufferedSinkBuffer, value);
        bufferedSinkBuffer.emit();
    }

    public void encodeWithTag(@NotNull ProtoWriter writer, int tag, @Nullable E value) throws IOException {
        Intrinsics.checkParameterIsNotNull(writer, "writer");
        if (value == null) {
            return;
        }
        writer.writeTag(tag, getFieldEncoding());
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            writer.writeVarint32(encodedSize(value));
        }
        encode(writer, value);
    }

    public abstract int encodedSize(E value);

    public int encodedSizeWithTag(int tag, @Nullable E value) {
        if (value == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(value);
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(iEncodedSize);
        }
        return ProtoWriter.INSTANCE.tagSize$wire_runtime(tag) + iEncodedSize;
    }

    @NotNull
    /* JADX INFO: renamed from: getFieldEncoding$wire_runtime, reason: from getter */
    public final FieldEncoding getFieldEncoding() {
        return this.fieldEncoding;
    }

    @Nullable
    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    @Nullable
    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    @Nullable
    public final KClass<?> getType() {
        return this.type;
    }

    public abstract E redact(E value);

    public final void setPackedAdapter$wire_runtime(@Nullable ProtoAdapter<List<E>> protoAdapter) {
        this.packedAdapter = protoAdapter;
    }

    public final void setRepeatedAdapter$wire_runtime(@Nullable ProtoAdapter<List<E>> protoAdapter) {
        this.repeatedAdapter = protoAdapter;
    }

    @NotNull
    public String toString(E value) {
        return String.valueOf(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ProtoAdapter<?> withLabel$wire_runtime(@NotNull WireField.Label label) {
        Intrinsics.checkParameterIsNotNull(label, "label");
        if (label.isRepeated()) {
            return label.isPacked() ? asPacked() : asRepeated();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> type) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type));
        Intrinsics.checkParameterIsNotNull(fieldEncoding, "fieldEncoding");
        Intrinsics.checkParameterIsNotNull(type, "type");
    }

    @JvmStatic
    @NotNull
    public static final <M> ProtoAdapter<M> get(@NotNull Class<M> cls) {
        return INSTANCE.get(cls);
    }

    public final E decode(@NotNull byte[] bytes) throws IOException {
        Intrinsics.checkParameterIsNotNull(bytes, "bytes");
        return decode(new Buffer().write(bytes));
    }

    @JvmStatic
    @NotNull
    public static final ProtoAdapter<?> get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    public final E decode(@NotNull ByteString bytes) throws IOException {
        Intrinsics.checkParameterIsNotNull(bytes, "bytes");
        return decode(new Buffer().write(bytes));
    }

    public final E decode(@NotNull BufferedSource source) throws IOException {
        Intrinsics.checkParameterIsNotNull(source, "source");
        return decode(new ProtoReader(source));
    }

    public final void encode(@NotNull BufferedSink sink, E value) throws IOException {
        Intrinsics.checkParameterIsNotNull(sink, "sink");
        encode(new ProtoWriter(sink), value);
    }

    @NotNull
    public final byte[] encode(E value) throws IOException {
        Buffer buffer = new Buffer();
        encode(buffer, value);
        return buffer.readByteArray();
    }
}
