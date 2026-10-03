package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.ExceptionsKt__ExceptionsKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.IntIterator;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.ranges.IntRange;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.Charsets;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010&\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010'\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010(\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0\f\"\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0012\u00102\u001a\u000200*\u00020/2\u0006\u00101\u001a\u000200\u001a \u00106\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000104\u001a\n\u00107\u001a\u00020\u0018*\u00020$\u001a\u0010\u0010;\u001a\u00020:*\b\u0012\u0004\u0012\u00020908\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020908*\u00020:\u001a\u0012\u0010=\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010@\u001a\u00020?*\u00020>\u001a\u0015\u0010C\u001a\u00020\u0018*\u00020A2\u0006\u0010B\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010E\u001a\u00020\u0018*\u00020D2\u0006\u0010B\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010F\u001a\u00020\u0000*\u00020\u00182\u0006\u0010B\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010I\u001a\u00020\u0004*\u00020G2\u0006\u0010H\u001a\u00020\u0018\u001a\n\u0010J\u001a\u00020\u0018*\u00020/\u001a\u001a\u0010M\u001a\u00020\b*\u00020K2\u0006\u00103\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u001a\u0010O\u001a\u00020\b*\u00020K2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u0012\u0010R\u001a\u00020\b*\u00020P2\u0006\u0010Q\u001a\u00020/\u001a\u0012\u0010T\u001a\u00020\u0018*\u00020S2\u0006\u0010C\u001a\u00020A\u001a\u0014\u0010U\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010W\u001a\u00020\u0000*\u00020V\u001a\u0012\u0010Y\u001a\u00020\u0000*\u00020\u00062\u0006\u0010X\u001a\u00020\u0000\u001a\u0014\u0010Z\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010X\u001a\u00020\u0018\u001a\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010[*\b\u0012\u0004\u0012\u00028\u000008\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010[2\u0012\u0010\\\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b]\u0010^\u001a.\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_\"\u0004\b\u0000\u0010T\"\u0004\b\u0001\u0010Y*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_\u001a\n\u0010b\u001a\u00020\u0004*\u00020a\u001a\n\u0010c\u001a\u00020\u0004*\u00020P\u001a\n\u0010e\u001a\u00020\u0004*\u00020d\u001a\u0012\u0010i\u001a\u00020\b*\u00020f2\u0006\u0010h\u001a\u00020g\u001a\n\u0010j\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010k\u001a\u00020\u0006*\u00020\u0018\u001a3\u0010p\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010[2\u0006\u0010l\u001a\u00020+2\f\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000m2\u0006\u0010o\u001a\u00020\u0006¢\u0006\u0004\bp\u0010q\u001a'\u0010t\u001a\u00020\u0004\"\u0004\b\u0000\u0010R*\b\u0012\u0004\u0012\u00028\u00000r2\u0006\u0010s\u001a\u00028\u0000H\u0000¢\u0006\u0004\bt\u0010u\u001a \u0010z\u001a\u00020y*\u00060vj\u0002`w2\u0010\u0010x\u001a\f\u0012\b\u0012\u00060vj\u0002`w08\"\u0014\u0010|\u001a\u00020{8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010}\"\u0014\u0010~\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007f\"\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0017\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bt\u0010\u0087\u0001\"\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0017\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010\u008d\u0001\"\u0016\u0010\u008f\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010z\"\u0017\u0010\u0090\u0001\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0017\u0010\u0092\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"", "arrayLength", TypedValues.CycleType.S_WAVE_OFFSET, "count", "", "i", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "M", "", "other", "Ljava/util/Comparator;", "comparator", "C", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "s", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lcom/oplus/aiunit/vision/uk9;", "includeDefaultPort", "R", "value", "", "v", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", LogFieldKey.MESSAGE_KEY, "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "x", "z", "X", "delimiters", "o", "", "delimiter", "n", "w", "f", UserInfo.SEX_FEMALE, "format", "", "args", "r", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "H", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", b2n.g, "G", "", "Lcom/oplus/aiunit/vision/xh8;", "Lcom/oplus/aiunit/vision/gj8;", "O", "N", b2n.f, "Lcom/oplus/aiunit/vision/wr6;", "Lcom/oplus/aiunit/vision/wr6$c;", MapSchema.FIELD_NAME_ENTRY, "", "mask", "b", "", "c", "d", "Lokio/BufferedSink;", "medium", "a0", "J", "Lokio/Source;", "timeUnit", "L", "timeout", "q", "Ljava/net/Socket;", "source", ExifInterface.LONGITUDE_EAST, "Lokio/Buffer;", "K", c8l.KEY_B, "Lcom/oplus/aiunit/vision/ytf;", "t", "defaultValue", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, ExifInterface.GPS_DIRECTION_TRUE, "elements", "u", "([Ljava/lang/Object;)Ljava/util/List;", "", "U", "Ljava/io/Closeable;", "j", LogFieldKey.LEVEL_KEY, "Ljava/net/ServerSocket;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/lc7;", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "D", "Q", SecureGcmConstants.MESSAGE_KEY, "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "I", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "Z", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lcom/oplus/aiunit/vision/gj8;", "Lcom/oplus/aiunit/vision/cuf;", "EMPTY_RESPONSE", "Lcom/oplus/aiunit/vision/cuf;", "Lcom/oplus/aiunit/vision/gqf;", "EMPTY_REQUEST", "Lcom/oplus/aiunit/vision/gqf;", "Lokio/Options;", "Lokio/Options;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "assertionsEnabled", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp4_extension_release"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "Util")
public final class sqk {

    @JvmField
    @NotNull
    public static final byte[] EMPTY_BYTE_ARRAY;

    @JvmField
    @NotNull
    public static final gj8 EMPTY_HEADERS = gj8.INSTANCE.h(new String[0]);

    @JvmField
    @NotNull
    public static final gqf EMPTY_REQUEST;

    @JvmField
    @NotNull
    public static final cuf EMPTY_RESPONSE;

    @JvmField
    @NotNull
    public static final TimeZone UTC;
    public static final Options a;

    @JvmField
    public static final boolean assertionsEnabled;
    public static final Regex b;

    @JvmField
    @NotNull
    public static final String okHttpName;

    @NotNull
    public static final String userAgent = "okhttp/4.9.3.7";

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/wr2;", "it", "Lcom/oplus/aiunit/vision/wr6;", "a", "(Lcom/oplus/aiunit/vision/wr2;)Lcom/oplus/aiunit/vision/wr6;"}, k = 3, mv = {1, 4, 0})
    public static final class a implements wr6.c {
        public final /* synthetic */ wr6 a;

        public a(wr6 wr6Var) {
            this.a = wr6Var;
        }

        @Override // com.oplus.aiunit.vision.wr6.c
        @NotNull
        public final wr6 a(@NotNull wr2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Runnable;", "newThread"}, k = 3, mv = {1, 4, 0})
    public static final class b implements ThreadFactory {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f16706j;

        public b(String str, boolean z) {
            this.i = str;
            this.f16706j = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.i);
            thread.setDaemon(this.f16706j);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = cuf.Companion.f(cuf.INSTANCE, bArr, null, 1, null);
        EMPTY_REQUEST = gqf.Companion.l(gqf.INSTANCE, bArr, null, 0, 0, 7, null);
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        a = companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone(v05.TIME_ZONE_0);
        Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        b = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = efd.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        okHttpName = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static /* synthetic */ int A(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return z(str, i, i2);
    }

    public static final int B(@NotNull String indexOfNonWhitespace, int i) {
        Intrinsics.checkNotNullParameter(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i < length) {
            char cCharAt = indexOfNonWhitespace.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return indexOfNonWhitespace.length();
    }

    @NotNull
    public static final String[] C(@NotNull String[] intersect, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(intersect, "$this$intersect");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean D(@NotNull lc7 isCivilized, @NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(isCivilized, "$this$isCivilized");
        Intrinsics.checkNotNullParameter(file, "file");
        Sink sinkH = isCivilized.h(file);
        try {
            try {
                isCivilized.c(file);
                CloseableKt.closeFinally(sinkH, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(sinkH, null);
                isCivilized.c(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(sinkH, th);
                throw th2;
            }
        }
    }

    public static final boolean E(@NotNull Socket isHealthy, @NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(isHealthy, "$this$isHealthy");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                isHealthy.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean F(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt__StringsJVMKt.equals(name, "Authorization", true) || StringsKt__StringsJVMKt.equals(name, "Cookie", true) || StringsKt__StringsJVMKt.equals(name, "Proxy-Authorization", true) || StringsKt__StringsJVMKt.equals(name, "Set-Cookie", true);
    }

    public static final int G(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    @NotNull
    public static final Charset H(@NotNull BufferedSource readBomAsCharset, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(readBomAsCharset, "$this$readBomAsCharset");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = readBomAsCharset.select(a);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iSelect == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    @Nullable
    public static final <T> T I(@NotNull Object instance, @NotNull Class<T> fieldType, @NotNull String fieldName) throws IllegalAccessException {
        Object objI;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        do {
            T tCast = null;
            if (!(!Intrinsics.areEqual(superclass, Object.class))) {
                if (!(!Intrinsics.areEqual(fieldName, "delegate")) || (objI = I(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) I(objI, fieldType, fieldName);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                Intrinsics.checkNotNullExpressionValue(declaredField, "c.getDeclaredField(fieldName)");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (fieldType.isInstance(obj)) {
                    tCast = fieldType.cast(obj);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
        } while (superclass != null);
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
    }

    public static final int J(@NotNull BufferedSource readMedium) throws IOException {
        Intrinsics.checkNotNullParameter(readMedium, "$this$readMedium");
        return b(readMedium.readByte(), 255) | (b(readMedium.readByte(), 255) << 16) | (b(readMedium.readByte(), 255) << 8);
    }

    public static final int K(@NotNull Buffer skipAll, byte b2) throws EOFException {
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        int i = 0;
        while (!skipAll.exhausted() && skipAll.getByte(0L) == b2) {
            i++;
            skipAll.readByte();
        }
        return i;
    }

    public static final boolean L(@NotNull Source skipAll, int i, @NotNull TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = skipAll.timeout().getHasDeadline() ? skipAll.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        skipAll.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (skipAll.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.timeout().clearDeadline();
            } else {
                skipAll.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.timeout().clearDeadline();
            } else {
                skipAll.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                skipAll.timeout().clearDeadline();
            } else {
                skipAll.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    @NotNull
    public static final ThreadFactory M(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(name, z);
    }

    @NotNull
    public static final List<xh8> N(@NotNull gj8 toHeaderList) {
        Intrinsics.checkNotNullParameter(toHeaderList, "$this$toHeaderList");
        IntRange intRangeUntil = RangesKt___RangesKt.until(0, toHeaderList.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new xh8(toHeaderList.c(iNextInt), toHeaderList.h(iNextInt)));
        }
        return arrayList;
    }

    @NotNull
    public static final gj8 O(@NotNull List<xh8> toHeaders) {
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        gj8.a aVar = new gj8.a();
        for (xh8 xh8Var : toHeaders) {
            aVar.e(xh8Var.getName().utf8(), xh8Var.getValue().utf8());
        }
        return aVar.g();
    }

    @NotNull
    public static final String P(int i) {
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String Q(long j2) {
        String hexString = Long.toHexString(j2);
        Intrinsics.checkNotNullExpressionValue(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String R(@NotNull uk9 toHostHeader, boolean z) {
        String host;
        Intrinsics.checkNotNullParameter(toHostHeader, "$this$toHostHeader");
        if (StringsKt__StringsKt.contains$default((CharSequence) toHostHeader.getHost(), (CharSequence) ":", false, 2, (Object) null)) {
            host = '[' + toHostHeader.getHost() + ']';
        } else {
            host = toHostHeader.getHost();
        }
        if (!z && toHostHeader.getPort() == uk9.INSTANCE.c(toHostHeader.getScheme())) {
            return host;
        }
        return host + ':' + toHostHeader.getPort();
    }

    public static /* synthetic */ String S(uk9 uk9Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return R(uk9Var, z);
    }

    @NotNull
    public static final <T> List<T> T(@NotNull List<? extends T> toImmutableList) {
        Intrinsics.checkNotNullParameter(toImmutableList, "$this$toImmutableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList((Collection) toImmutableList));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> U(@NotNull Map<K, ? extends V> toImmutableMap) {
        Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final long V(@NotNull String toLongOrDefault, long j2) {
        Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final int W(@Nullable String str, int i) {
        if (str != null) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j2 < 0) {
                    return 0;
                }
                return (int) j2;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @NotNull
    public static final String X(@NotNull String trimSubstring, int i, int i2) {
        Intrinsics.checkNotNullParameter(trimSubstring, "$this$trimSubstring");
        int iX = x(trimSubstring, i, i2);
        String strSubstring = trimSubstring.substring(iX, z(trimSubstring, iX, i2));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String Y(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return X(str, i, i2);
    }

    @NotNull
    public static final Throwable Z(@NotNull Exception withSuppressed, @NotNull List<? extends Exception> suppressed) {
        Intrinsics.checkNotNullParameter(withSuppressed, "$this$withSuppressed");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt__ExceptionsKt.addSuppressed(withSuppressed, it.next());
        }
        return withSuppressed;
    }

    public static final <E> void a(@NotNull List<E> addIfAbsent, E e2) {
        Intrinsics.checkNotNullParameter(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(e2)) {
            return;
        }
        addIfAbsent.add(e2);
    }

    public static final void a0(@NotNull BufferedSink writeMedium, int i) throws IOException {
        Intrinsics.checkNotNullParameter(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i >>> 16) & 255);
        writeMedium.writeByte((i >>> 8) & 255);
        writeMedium.writeByte(i & 255);
    }

    public static final int b(byte b2, int i) {
        return b2 & i;
    }

    public static final int c(short s, int i) {
        return s & i;
    }

    public static final long d(int i, long j2) {
        return ((long) i) & j2;
    }

    @NotNull
    public static final wr6.c e(@NotNull wr6 asFactory) {
        Intrinsics.checkNotNullParameter(asFactory, "$this$asFactory");
        return new a(asFactory);
    }

    public static final boolean f(@NotNull String canParseAsIpAddress) {
        Intrinsics.checkNotNullParameter(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return b.matches(canParseAsIpAddress);
    }

    public static final boolean g(@NotNull uk9 canReuseConnectionFor, @NotNull uk9 other) {
        Intrinsics.checkNotNullParameter(canReuseConnectionFor, "$this$canReuseConnectionFor");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(canReuseConnectionFor.getHost(), other.getHost()) && canReuseConnectionFor.getPort() == other.getPort() && Intrinsics.areEqual(canReuseConnectionFor.getScheme(), other.getScheme());
    }

    public static final int h(@NotNull String name, long j2, @Nullable TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z = true;
        if (!(j2 >= 0)) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis == 0 && j2 > 0) {
            z = false;
        }
        if (z) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void i(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(@NotNull Closeable closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void k(@NotNull ServerSocket closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void l(@NotNull Socket closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.areEqual(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] m(@NotNull String[] concat, @NotNull String value) {
        Intrinsics.checkNotNullParameter(concat, "$this$concat");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(concat, concat.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) objArrCopyOf;
        strArr[ArraysKt___ArraysKt.getLastIndex(strArr)] = value;
        return strArr;
    }

    public static final int n(@NotNull String delimiterOffset, char c2, int i, int i2) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        while (i < i2) {
            if (delimiterOffset.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int o(@NotNull String delimiterOffset, @NotNull String delimiters, int i, int i2) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            if (StringsKt__StringsKt.contains$default((CharSequence) delimiters, delimiterOffset.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int p(String str, char c2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return n(str, c2, i, i2);
    }

    public static final boolean q(@NotNull Source discard, int i, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(discard, "$this$discard");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return L(discard, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final String r(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }

    public static final boolean s(@NotNull String[] hasIntersection, @Nullable String[] strArr, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(hasIntersection, "$this$hasIntersection");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(hasIntersection.length == 0) && strArr != null) {
            if (!(strArr.length == 0)) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long t(@NotNull ytf headersContentLength) {
        Intrinsics.checkNotNullParameter(headersContentLength, "$this$headersContentLength");
        String strA = headersContentLength.getHeaders().a("Content-Length");
        if (strA != null) {
            return V(strA, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> u(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int v(@NotNull String[] indexOf, @NotNull String value, @NotNull Comparator<String> comparator) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = indexOf.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(indexOf[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int w(@NotNull String indexOfControlOrNonAscii) {
        Intrinsics.checkNotNullParameter(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = indexOfControlOrNonAscii.charAt(i);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int x(@NotNull String indexOfFirstNonAsciiWhitespace, int i, int i2) {
        Intrinsics.checkNotNullParameter(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char cCharAt = indexOfFirstNonAsciiWhitespace.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int y(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return x(str, i, i2);
    }

    public static final int z(@NotNull String indexOfLastNonAsciiWhitespace, int i, int i2) {
        Intrinsics.checkNotNullParameter(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char cCharAt = indexOfLastNonAsciiWhitespace.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }
}
