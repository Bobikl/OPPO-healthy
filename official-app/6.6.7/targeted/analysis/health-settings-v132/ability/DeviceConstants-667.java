package com.heytap.health.device_manager_base;

import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.model.bjg;
import com.oplus.aiunit.model.p83;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants;", BuildConfig.VERSION_NAME, "Companion", "a", "b", "c", "device_manager_base"}, k = 1, mv = {1, 8, 0})
public final class DeviceConstants {

    @NotNull
    public static final String F;

    @NotNull
    public static final String G;
    public static final int H;

    @NotNull
    public static final String I;

    @NotNull
    public static final String J;
    public static final int K;

    @NotNull
    public static final String L;
    public static final int M;

    @NotNull
    public static final String N;
    public static final int O;

    @NotNull
    public static final String P;

    @NotNull
    public static final String Q;
    public static final int R;

    @NotNull
    public static final String S;

    @NotNull
    public static final String T;

    @NotNull
    public static final String U;

    @NotNull
    public static final String V;

    @NotNull
    public static final String W;

    @NotNull
    public static final String X;

    @NotNull
    public static final String Y;

    @NotNull
    public static final String Z;

    @NotNull
    public static final String a0;

    @NotNull
    public static final String b0;

    @NotNull
    public static final String c0;

    @NotNull
    public static final String d0;

    @NotNull
    public static final String e0;

    @NotNull
    public static final String f0;

    @NotNull
    public static final String g0;

    @NotNull
    public static final String h0;

    @NotNull
    public static final String i0;

    @NotNull
    public static final String j0;

    @NotNull
    public static final String k0;

    @NotNull
    public static final String l0;

    @NotNull
    public static final String m0;

    @NotNull
    public static final String n0;

    @NotNull
    public static final Lazy<List<DeviceParams>> o0;

    @NotNull
    public static final Lazy<List<List<String>>> p0;

    @NotNull
    public static final Lazy<Map<Integer, List<List<String>>>> q0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String a = p83.r() + p83.k() + p83.b() + p83.i() + p83.k() + p83.b();

    @NotNull
    public static final String b = p83.r() + p83.k() + p83.b() + p83.i() + p83.k() + p83.d();
    public static final int c = 1;

    @NotNull
    public static final String d = p83.r() + p83.x() + p83.b() + p83.i() + p83.x() + p83.b();

    @NotNull
    public static final String e = p83.r() + p83.x() + p83.b() + p83.i() + p83.x() + p83.c();

    @NotNull
    public static final String f = p83.r() + p83.x() + p83.b() + p83.i() + p83.x() + p83.d();
    public static final int g = 2;

    @NotNull
    public static final String h = p83.r() + p83.x() + p83.c() + p83.a() + p83.x() + p83.d();

    @NotNull
    public static final String i = p83.r() + p83.x() + p83.c() + p83.a() + p83.x() + p83.b();

    @NotNull
    public static final String j = p83.r() + p83.x() + p83.c() + p83.a() + p83.x() + p83.c();

    @NotNull
    public static final String k = p83.r() + p83.x() + p83.x() + p83.c() + p83.a() + p83.c();

    @NotNull
    public static final String l = p83.r() + p83.x() + p83.x() + p83.c() + p83.b() + p83.d();
    public static final int m = 3;

    @NotNull
    public static final String n = p83.x() + p83.d() + p83.a() + p83.b() + p83.l() + p83.q();

    @NotNull
    public static final String o = p83.x() + p83.f() + p83.a() + p83.b() + p83.l() + p83.q();

    @NotNull
    public static final String p = p83.t() + p83.p() + p83.x() + p83.c() + p83.b() + p83.a() + p83.c();
    public static final int q = 4;

    @NotNull
    public static final String r = p83.r() + p83.x() + p83.x() + p83.c() + p83.a() + p83.g();

    @NotNull
    public static final String s = p83.r() + p83.x() + p83.x() + p83.c() + p83.a() + p83.h();
    public static final int t = 5;

    @NotNull
    public static final String u = p83.r() + p83.k() + p83.k() + p83.c() + p83.b() + p83.b();

    @NotNull
    public static final String v = p83.r() + p83.k() + p83.k() + p83.c() + p83.b() + p83.d();
    public static final int w = 6;

    @NotNull
    public static final String x = p83.r() + p83.x() + p83.x() + p83.c() + p83.b() + p83.c();

    @NotNull
    public static final String y = p83.r() + p83.x() + p83.x() + p83.c() + p83.b() + p83.b();
    public static final int z = 7;

    @NotNull
    public static final String A = p83.r() + p83.x() + p83.x() + p83.c() + p83.c() + p83.b();
    public static final int B = 8;

    @NotNull
    public static final String C = p83.r() + p83.x() + p83.x() + p83.c() + p83.d() + p83.b();
    public static final int D = 9;

    @NotNull
    public static final String E = p83.r() + p83.s() + p83.x() + p83.x() + p83.c() + p83.d() + p83.e();

    /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0003\b\u0091\u0001\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001Ja\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052*\u0010\r\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n\"\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\fR\u001a\u0010\u0016\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010\"\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001a\u0010$\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001a\u0010(\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u001a\u0010*\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u001a\u0010,\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019R\u001a\u0010.\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b.\u0010\u0017\u001a\u0004\b/\u0010\u0019R\u001a\u00100\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019R\u001a\u00102\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001fR\u001a\u00104\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b4\u0010\u0017\u001a\u0004\b5\u0010\u0019R\u001a\u00106\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b6\u0010\u0017\u001a\u0004\b7\u0010\u0019R\u001a\u00108\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b8\u0010\u0017\u001a\u0004\b9\u0010\u0019R\u001a\u0010:\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b:\u0010\u001d\u001a\u0004\b;\u0010\u001fR\u001a\u0010<\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b<\u0010\u0017\u001a\u0004\b=\u0010\u0019R\u001a\u0010>\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b>\u0010\u0017\u001a\u0004\b?\u0010\u0019R\u001a\u0010@\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b@\u0010\u001d\u001a\u0004\bA\u0010\u001fR\u001a\u0010B\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bB\u0010\u0017\u001a\u0004\bC\u0010\u0019R\u001a\u0010D\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bD\u0010\u0017\u001a\u0004\bE\u0010\u0019R\u001a\u0010F\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\bF\u0010\u001d\u001a\u0004\bG\u0010\u001fR\u001a\u0010H\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bH\u0010\u0017\u001a\u0004\bI\u0010\u0019R\u001a\u0010J\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bJ\u0010\u0017\u001a\u0004\bK\u0010\u0019R\u001a\u0010L\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\bL\u0010\u001d\u001a\u0004\bM\u0010\u001fR\u001a\u0010N\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bN\u0010\u0017\u001a\u0004\bO\u0010\u0019R\u001a\u0010P\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\bP\u0010\u001d\u001a\u0004\bQ\u0010\u001fR\u001a\u0010R\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bR\u0010\u0017\u001a\u0004\bS\u0010\u0019R\u001a\u0010T\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\bT\u0010\u001d\u001a\u0004\bU\u0010\u001fR\u001a\u0010V\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bV\u0010\u0017\u001a\u0004\bW\u0010\u0019R\u001a\u0010X\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bX\u0010\u0017\u001a\u0004\bY\u0010\u0019R\u001a\u0010Z\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bZ\u0010\u0017\u001a\u0004\b[\u0010\u0019R\u001a\u0010\\\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b\\\u0010\u001d\u001a\u0004\b]\u0010\u001fR\u001a\u0010^\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b^\u0010\u0017\u001a\u0004\b_\u0010\u0019R\u001a\u0010`\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b`\u0010\u0017\u001a\u0004\ba\u0010\u0019R\u001a\u0010b\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\bb\u0010\u001d\u001a\u0004\bc\u0010\u001fR\u001a\u0010d\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bd\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010e\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\be\u0010\u001d\u001a\u0004\bf\u0010\u001fR\u001a\u0010g\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bg\u0010\u0017\u001a\u0004\bh\u0010\u0019R\u001a\u0010i\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\bi\u0010\u001d\u001a\u0004\bj\u0010\u001fR\u001a\u0010k\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bk\u0010\u0017\u001a\u0004\bl\u0010\u0019R\u001a\u0010m\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bm\u0010\u0017\u001a\u0004\bn\u0010\u0019R\u001a\u0010o\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\bo\u0010\u001d\u001a\u0004\bp\u0010\u001fR\u001a\u0010q\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bq\u0010\u0017\u001a\u0004\br\u0010\u0019R\u001a\u0010s\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bs\u0010\u0017\u001a\u0004\bt\u0010\u0019R\u001a\u0010u\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bu\u0010\u0017\u001a\u0004\bv\u0010\u0019R\u001a\u0010w\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\bw\u0010\u0017\u001a\u0004\bx\u0010\u0019R\u001a\u0010y\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\by\u0010\u0017\u001a\u0004\bz\u0010\u0019R\u001a\u0010{\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b{\u0010\u0017\u001a\u0004\b|\u0010\u0019R\u001a\u0010}\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b}\u0010\u0017\u001a\u0004\b~\u0010\u0019R\u001b\u0010\u007f\u001a\u00020\f8\u0006X\u0086D¢\u0006\r\n\u0004\b\u007f\u0010\u0017\u001a\u0005\b\u0080\u0001\u0010\u0019R\u001d\u0010\u0081\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0017\u001a\u0005\b\u0082\u0001\u0010\u0019R\u001d\u0010\u0083\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0017\u001a\u0005\b\u0084\u0001\u0010\u0019R\u001d\u0010\u0085\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0017\u001a\u0005\b\u0086\u0001\u0010\u0019R\u001d\u0010\u0087\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0017\u001a\u0005\b\u0088\u0001\u0010\u0019R\u001d\u0010\u0089\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0017\u001a\u0005\b\u008a\u0001\u0010\u0019R\u001d\u0010\u008b\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0017\u001a\u0005\b\u008c\u0001\u0010\u0019R\u001d\u0010\u008d\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0017\u001a\u0005\b\u008e\u0001\u0010\u0019R\u001d\u0010\u008f\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0017\u001a\u0005\b\u0090\u0001\u0010\u0019R\u001d\u0010\u0091\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0017\u001a\u0005\b\u0092\u0001\u0010\u0019R\u001d\u0010\u0093\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0017\u001a\u0005\b\u0094\u0001\u0010\u0019R\u001d\u0010\u0095\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0017\u001a\u0005\b\u0096\u0001\u0010\u0019R\u001d\u0010\u0097\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0017\u001a\u0005\b\u0098\u0001\u0010\u0019R\u001d\u0010\u0099\u0001\u001a\u00020\f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0017\u001a\u0005\b\u009a\u0001\u0010\u0019R&\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R,\u0010¢\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u00118FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b \u0001\u0010\u009c\u0001\u001a\u0006\b¡\u0001\u0010\u009e\u0001R9\u0010§\u0001\u001a\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u00110£\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u009c\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001¨\u0006ª\u0001"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$a;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "Lcom/heytap/health/device_manager_base/DeviceConstants$c;", "deviceList", BuildConfig.VERSION_NAME, "groupId", "Lcom/heytap/health/device_manager_base/DeviceConstants$b;", "deviceGroup", "deviceType", BuildConfig.VERSION_NAME, "Lkotlin/Pair;", BuildConfig.VERSION_NAME, "modelAndBTName", BuildConfig.VERSION_NAME, "b", "(Ljava/util/List;ILcom/heytap/health/device_manager_base/DeviceConstants$b;I[Lkotlin/Pair;)V", BuildConfig.VERSION_NAME, "J", "model", "z", "B", "BAND_DEVICE_MODEL", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "BAND_NFC_MODEL", "k", "BAND1_GROUPID", "I", "i", "()I", "WATCH_BIG", "m0", "WATCH_SMALL", "t0", "WATCH_BIG_PRO", "n0", "W1_GROUPID", "X", "WATCH2_ECG_MODEL", "c0", "WATCH2_BIG", "b0", "WATCH2_SMALL", "d0", "WATCH2_SMALL_BLUETOOTH", "e0", "WATCH_SE_MODEL", "s0", "W2_GROUPID", "Y", "WATCH_RX_MODEL", "r0", "WATCH_RX_LIMITED_MODEL", "q0", "REALME_RX", "M", "RX_GROUPID", "N", "WATCH_FREE_COMMON_MODEL", "o0", "WATCH_FREE_FASHION_MODEL", "p0", "WF_GROUPID", "u0", "HEISENBERG_COMMON_MODEL", "D", "HEISENBERG_NFC_MODEL", "E", "HSB_GROUPID", "F", "WATCH3_COMMON_MODEL", "h0", "WATCH3_BIG_MODEL", "f0", "W3_GROUPID", "Z", "WATCH4_BIG_MODEL", "k0", "W4_GROUPID", "a0", "STAR_WATCH", "T", "STAR_GROUPID", "S", "BAGEL_WATCH", "h", "OPPO_SPORT_WATCH", "L", "STARRIVER_WATCH", "Q", "STARRIVER_GROUPID", "P", "ASTRA_WATCH", "f", "COLUMBUS_WATCH", "x", "COLUMBUS_ID", "w", "IWATCH_WATCH", "IWATCH_GROUPID", "H", "TAYCAN_WATCH", "W", "TAYCANGROUPID", "U", "COCO_WATCH", "t", "COCO_WATCH_NO_ESIM", "u", "COCO_GROUPID", "s", "BT_NAME_PREFIX_BAND", "l", "BT_NAME_PREFIX_WATCH1", "o", "BT_NAME_PREFIX_WATCH2", "p", "BT_NAME_PREFIX_ONE_PLUS", "m", "BT_NAME_PREFIX_WATCH_FREE", "q", "BT_NAME_PREFIX_REALME", "n", "HEISENBERG_BT_NAME_PREFIX", "C", "WATCH3_BT_NAME_PREFIX", "g0", "WATCH3_SE_BT_NAME_PREFIX", "j0", "WATCH3_PRO_BT_NAME_PREFIX", "i0", "WATCH4_PRO_BT_NAME_PREFIX", "l0", "STAR_BT_NAME_PREFIX", "R", "BAGEL_BT_NAME_PREFIX", "g", "STARRIVER_BT_NAME_PREFIX", "O", "ASTRA_BT_NAME_PREFIX", "d", "ASTRA_BT_NAME_PREFIX_TEMP", "e", "OPPO_SPORT_BT_NAME_PREFIX", "K", "COLUMBUS_BT_NAME_PREFIX", "v", "IWATCH_BT_NAME_PREFIX", "G", "TAYCAN_BT_NAME_PREFIX", "V", "COCO_BT_NAME_PREFIX", "r", "DeviceList$delegate", "Lkotlin/Lazy;", "A", "()Ljava/util/List;", "DeviceList", "ALL_MODELS$delegate", "c", "ALL_MODELS", BuildConfig.VERSION_NAME, "DEVICETYPE_TO_MODELS$delegate", "y", "()Ljava/util/Map;", "DEVICETYPE_TO_MODELS", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDeviceConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceConstants.kt\ncom/heytap/health/device_manager_base/DeviceConstants$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n13579#2,2:328\n766#3:330\n857#3,2:331\n1549#3:333\n1620#3,3:334\n288#3,2:338\n1#4:337\n*S KotlinDebug\n*F\n+ 1 DeviceConstants.kt\ncom/heytap/health/device_manager_base/DeviceConstants$Companion\n*L\n235#1:328,2\n273#1:330\n273#1:331,2\n274#1:333\n274#1:334,3\n283#1:338,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<DeviceParams> A() {
            return (List) DeviceConstants.o0.getValue();
        }

        @Nullable
        public final DeviceParams B(@Nullable String model) {
            Object next;
            Iterator<T> it = A().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((DeviceParams) next).getModel(), model)) {
                    return (DeviceParams) next;
                }
            }
            next = null;
            return (DeviceParams) next;
        }

        @NotNull
        public final String C() {
            return DeviceConstants.Y;
        }

        @NotNull
        public final String D() {
            return DeviceConstants.u;
        }

        @NotNull
        public final String E() {
            return DeviceConstants.v;
        }

        public final int F() {
            return DeviceConstants.w;
        }

        @NotNull
        public final String G() {
            return DeviceConstants.l0;
        }

        public final int H() {
            return DeviceConstants.M;
        }

        @NotNull
        public final String I() {
            return DeviceConstants.L;
        }

        @NotNull
        public final List<String> J(int groupId) {
            List<DeviceParams> listA = A();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (((DeviceParams) obj).getGroupId() == groupId) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((DeviceParams) it.next()).getModel());
            }
            return arrayList2;
        }

        @NotNull
        public final String K() {
            return DeviceConstants.j0;
        }

        @NotNull
        public final String L() {
            return DeviceConstants.F;
        }

        @NotNull
        public final String M() {
            return DeviceConstants.p;
        }

        public final int N() {
            return DeviceConstants.q;
        }

        @NotNull
        public final String O() {
            return DeviceConstants.g0;
        }

        public final int P() {
            return DeviceConstants.H;
        }

        @NotNull
        public final String Q() {
            return DeviceConstants.G;
        }

        @NotNull
        public final String R() {
            return DeviceConstants.e0;
        }

        public final int S() {
            return DeviceConstants.D;
        }

        @NotNull
        public final String T() {
            return DeviceConstants.C;
        }

        public final int U() {
            return DeviceConstants.O;
        }

        @NotNull
        public final String V() {
            return DeviceConstants.m0;
        }

        @NotNull
        public final String W() {
            return DeviceConstants.N;
        }

        public final int X() {
            return DeviceConstants.g;
        }

        public final int Y() {
            return DeviceConstants.m;
        }

        public final int Z() {
            return DeviceConstants.z;
        }

        public final int a0() {
            return DeviceConstants.B;
        }

        public final void b(List<DeviceParams> deviceList, int groupId, BaseDevice deviceGroup, int deviceType, Pair<String, String>... modelAndBTName) {
            for (Pair<String, String> pair : modelAndBTName) {
                deviceList.add(new DeviceParams((String) pair.getFirst(), (String) pair.getSecond(), deviceType, groupId, deviceGroup));
            }
        }

        @NotNull
        public final String b0() {
            return DeviceConstants.i;
        }

        @NotNull
        public final List<List<String>> c() {
            return (List) DeviceConstants.p0.getValue();
        }

        @NotNull
        public final String c0() {
            return DeviceConstants.h;
        }

        @NotNull
        public final String d() {
            return DeviceConstants.h0;
        }

        @NotNull
        public final String d0() {
            return DeviceConstants.j;
        }

        @NotNull
        public final String e() {
            return DeviceConstants.i0;
        }

        @NotNull
        public final String e0() {
            return DeviceConstants.k;
        }

        @NotNull
        public final String f() {
            return DeviceConstants.I;
        }

        @NotNull
        public final String f0() {
            return DeviceConstants.y;
        }

        @NotNull
        public final String g() {
            return DeviceConstants.f0;
        }

        @NotNull
        public final String g0() {
            return DeviceConstants.Z;
        }

        @NotNull
        public final String h() {
            return DeviceConstants.E;
        }

        @NotNull
        public final String h0() {
            return DeviceConstants.x;
        }

        public final int i() {
            return DeviceConstants.c;
        }

        @NotNull
        public final String i0() {
            return DeviceConstants.b0;
        }

        @NotNull
        public final String j() {
            return DeviceConstants.a;
        }

        @NotNull
        public final String j0() {
            return DeviceConstants.a0;
        }

        @NotNull
        public final String k() {
            return DeviceConstants.b;
        }

        @NotNull
        public final String k0() {
            return DeviceConstants.A;
        }

        @NotNull
        public final String l() {
            return DeviceConstants.S;
        }

        @NotNull
        public final String l0() {
            return DeviceConstants.d0;
        }

        @NotNull
        public final String m() {
            return DeviceConstants.V;
        }

        @NotNull
        public final String m0() {
            return DeviceConstants.d;
        }

        @NotNull
        public final String n() {
            return DeviceConstants.X;
        }

        @NotNull
        public final String n0() {
            return DeviceConstants.f;
        }

        @NotNull
        public final String o() {
            return DeviceConstants.T;
        }

        @NotNull
        public final String o0() {
            return DeviceConstants.r;
        }

        @NotNull
        public final String p() {
            return DeviceConstants.U;
        }

        @NotNull
        public final String p0() {
            return DeviceConstants.s;
        }

        @NotNull
        public final String q() {
            return DeviceConstants.W;
        }

        @NotNull
        public final String q0() {
            return DeviceConstants.o;
        }

        @NotNull
        public final String r() {
            return DeviceConstants.n0;
        }

        @NotNull
        public final String r0() {
            return DeviceConstants.n;
        }

        public final int s() {
            return DeviceConstants.R;
        }

        @NotNull
        public final String s0() {
            return DeviceConstants.l;
        }

        @NotNull
        public final String t() {
            return DeviceConstants.P;
        }

        @NotNull
        public final String t0() {
            return DeviceConstants.e;
        }

        @NotNull
        public final String u() {
            return DeviceConstants.Q;
        }

        public final int u0() {
            return DeviceConstants.t;
        }

        @NotNull
        public final String v() {
            return DeviceConstants.k0;
        }

        public final int w() {
            return DeviceConstants.K;
        }

        @NotNull
        public final String x() {
            return DeviceConstants.J;
        }

        @NotNull
        public final Map<Integer, List<List<String>>> y() {
            return (Map) DeviceConstants.q0.getValue();
        }

        @Nullable
        public final BaseDevice z(@NotNull String model) {
            Object next;
            Intrinsics.checkNotNullParameter(model, "model");
            Iterator<T> it = A().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((DeviceParams) next).getModel(), model));
            DeviceParams deviceParams = (DeviceParams) next;
            if (deviceParams != null) {
                return deviceParams.getBaseDevice();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b, reason: from toString */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\nB\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "toString", "a", "Ljava/lang/String;", "getDefaultModel", "()Ljava/lang/String;", "defaultModel", BuildConfig.VERSION_NAME, "b", "F", "()F", bjg.DATE, "<init>", "(Ljava/lang/String;F)V", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "device_manager_base"}, k = 1, mv = {1, 8, 0})
    public static abstract class BaseDevice {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String defaultModel;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final float date;

        /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$a */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b;", BuildConfig.VERSION_NAME, "defaultModel", BuildConfig.VERSION_NAME, bjg.DATE, "<init>", "(Ljava/lang/String;F)V", "a", "b", "c", "d", "e", "f", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$a;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$b;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$c;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$d;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$e;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$f;", "device_manager_base"}, k = 1, mv = {1, 8, 0})
        public static abstract class a extends BaseDevice {

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$a;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class C0015a extends a {

                @NotNull
                public static final C0015a INSTANCE = new C0015a();

                public C0015a() {
                    super(DeviceConstants.INSTANCE.j(), 19.0301f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$b;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class C0016b extends a {

                @NotNull
                public static final C0016b INSTANCE = new C0016b();

                public C0016b() {
                    super(DeviceConstants.INSTANCE.x(), 25.0416f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$a$c */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$c;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class c extends a {

                @NotNull
                public static final c INSTANCE = new c();

                public c() {
                    super(DeviceConstants.INSTANCE.D(), 21.1221f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$a$d */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$d;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class d extends a {

                @NotNull
                public static final d INSTANCE = new d();

                public d() {
                    super(DeviceConstants.INSTANCE.M(), 20.0601f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$a$e */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$e;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class e extends a {

                @NotNull
                public static final e INSTANCE = new e();

                public e() {
                    super(DeviceConstants.INSTANCE.r0(), 20.0301f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$a$f */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$a$f;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$a;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class f extends a {

                @NotNull
                public static final f INSTANCE = new f();

                public f() {
                    super(DeviceConstants.INSTANCE.o0(), 21.0913f, null);
                }
            }

            public /* synthetic */ a(String str, float f2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, f2);
            }

            public a(String str, float f2) {
                super(str, f2, null);
            }
        }

        /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b;", BuildConfig.VERSION_NAME, "defaultModel", BuildConfig.VERSION_NAME, bjg.DATE, "<init>", "(Ljava/lang/String;F)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$a;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$b;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$c;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$d;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$e;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$f;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$g;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$h;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$i;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$j;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$k;", "Lcom/heytap/health/device_manager_base/a;", "device_manager_base"}, k = 1, mv = {1, 8, 0})
        public static abstract class AbstractC0017b extends BaseDevice {

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$a;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class a extends AbstractC0017b {

                @NotNull
                public static final a INSTANCE = new a();

                public a() {
                    super(DeviceConstants.INSTANCE.f(), 24.0813f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$b;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class C0018b extends AbstractC0017b {

                @NotNull
                public static final C0018b INSTANCE = new C0018b();

                public C0018b() {
                    super(DeviceConstants.INSTANCE.h(), 24.0308f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$c */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$c;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class c extends AbstractC0017b {

                @NotNull
                public static final c INSTANCE = new c();

                public c() {
                    super(DeviceConstants.INSTANCE.t(), 25.0928f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$d */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$d;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class d extends AbstractC0017b {

                @NotNull
                public static final d INSTANCE = new d();

                public d() {
                    super(DeviceConstants.INSTANCE.L(), 24.0309f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$e */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$e;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class e extends AbstractC0017b {

                @NotNull
                public static final e INSTANCE = new e();

                public e() {
                    super(DeviceConstants.INSTANCE.T(), 23.0325f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$f */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$f;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class f extends AbstractC0017b {

                @NotNull
                public static final f INSTANCE = new f();

                public f() {
                    super(DeviceConstants.INSTANCE.Q(), 24.0625f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$g */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$g;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class g extends AbstractC0017b {

                @NotNull
                public static final g INSTANCE = new g();

                public g() {
                    super(DeviceConstants.INSTANCE.W(), 25.0623f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$h */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$h;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class h extends AbstractC0017b {

                @NotNull
                public static final h INSTANCE = new h();

                public h() {
                    super(DeviceConstants.INSTANCE.m0(), 19.0601f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$i */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$i;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class i extends AbstractC0017b {

                @NotNull
                public static final i INSTANCE = new i();

                public i() {
                    super(DeviceConstants.INSTANCE.b0(), 20.0601f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$j */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$j;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class j extends AbstractC0017b {

                @NotNull
                public static final j INSTANCE = new j();

                public j() {
                    super(DeviceConstants.INSTANCE.h0(), 21.1216f, null);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$b$b$k */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$b$b$k;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b$b;", "<init>", "()V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
            public static final class k extends AbstractC0017b {

                @NotNull
                public static final k INSTANCE = new k();

                public k() {
                    super(DeviceConstants.INSTANCE.k0(), 22.1226f, null);
                }
            }

            public /* synthetic */ AbstractC0017b(String str, float f2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, f2);
            }

            public AbstractC0017b(String str, float f2) {
                super(str, f2, null);
            }
        }

        public /* synthetic */ BaseDevice(String str, float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getDate() {
            return this.date;
        }

        @NotNull
        public String toString() {
            return "BaseDevice(defaultModel='" + this.defaultModel + "', date=" + this.date + ")";
        }

        public BaseDevice(String str, float f) {
            this.defaultModel = str;
            this.date = f;
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.device_manager_base.DeviceConstants$c, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\"\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006#"}, d2 = {"Lcom/heytap/health/device_manager_base/DeviceConstants$c;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "toString", "btName", BuildConfig.VERSION_NAME, "a", "toUpper", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "f", "pattern", "i", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "model", "b", "btNamePrefix", BuildConfig.VERSION_NAME, "c", "I", "d", "()I", "deviceType", "e", "groupId", "Lcom/heytap/health/device_manager_base/DeviceConstants$b;", "Lcom/heytap/health/device_manager_base/DeviceConstants$b;", "()Lcom/heytap/health/device_manager_base/DeviceConstants$b;", "deviceGroup", "Z", "isBand1", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILcom/heytap/health/device_manager_base/DeviceConstants$b;)V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDeviceConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceConstants.kt\ncom/heytap/health/device_manager_base/DeviceConstants$DeviceParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"})
    public static final class DeviceParams {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String model;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String btNamePrefix;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public final int deviceType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final int groupId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @NotNull
        public final BaseDevice baseDevice;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final boolean isBand1;

        public DeviceParams(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull BaseDevice baseDevice) {
            Intrinsics.checkNotNullParameter(str, "model");
            Intrinsics.checkNotNullParameter(str2, "btNamePrefix");
            Intrinsics.checkNotNullParameter(baseDevice, "deviceGroup");
            this.model = str;
            this.btNamePrefix = str2;
            this.deviceType = i;
            this.groupId = i2;
            this.baseDevice = baseDevice;
            this.isBand1 = i2 == DeviceConstants.INSTANCE.i();
        }

        public static /* synthetic */ Pattern g(DeviceParams deviceParams, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return deviceParams.f(str, z);
        }

        public final boolean a(@NotNull String btName) {
            Intrinsics.checkNotNullParameter(btName, "btName");
            boolean z = false;
            Pattern patternG = g(this, this.btNamePrefix, false, 2, null);
            Intrinsics.checkNotNullExpressionValue(patternG, "getMatcherByDeviceName(btNamePrefix)");
            boolean zI = i(patternG, btName);
            if (!this.isBand1) {
                return zI;
            }
            if (zI && !f("OPPO BAND", false).matcher(btName).find()) {
                z = true;
            }
            return z;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBtNamePrefix() {
            return this.btNamePrefix;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseDevice getBaseDevice() {
            return this.baseDevice;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getDeviceType() {
            return this.deviceType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getGroupId() {
            return this.groupId;
        }

        public final Pattern f(String btName, boolean toUpper) {
            if (toUpper) {
                btName = btName.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(btName, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            return Pattern.compile("^" + ((Object) btName) + "\\W+[0-9A-F]+$");
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        public final boolean i(Pattern pattern, String btName) {
            String upperCase = btName.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return pattern.matcher(upperCase).find();
        }

        @NotNull
        public String toString() {
            return "DeviceParams(model='" + this.model + "', btNamePrefix='" + this.btNamePrefix + "', deviceType=" + this.deviceType + ", groupId=" + this.groupId + ", baseDevice=" + this.baseDevice + ")";
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(p83.r());
        sb.append(p83.x());
        sb.append(p83.x());
        sb.append(p83.c());
        sb.append(p83.d());
        sb.append(p83.f());
        F = sb.toString();
        G = p83.r() + p83.x() + p83.x() + p83.c() + p83.f() + p83.b();
        H = 10;
        I = p83.r() + p83.x() + p83.x() + p83.c() + p83.e() + p83.c();
        J = p83.r() + p83.x() + p83.x() + p83.c() + p83.g() + p83.c();
        K = 11;
        L = p83.z() + p83.O() + p83.a() + p83.a() + p83.b();
        M = 12;
        N = p83.r() + p83.x() + p83.x() + p83.c() + p83.g() + p83.b();
        O = 13;
        P = p83.r() + p83.x() + p83.x() + p83.c() + p83.g() + p83.d();
        Q = p83.r() + p83.x() + p83.x() + p83.c() + p83.g() + p83.e();
        R = 14;
        S = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.k() + p83.z() + p83.H() + p83.B();
        T = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D();
        U = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.c();
        V = p83.r() + p83.H() + p83.C() + p83.s() + p83.F() + p83.N() + p83.L() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D();
        W = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.o() + p83.K() + p83.C() + p83.C();
        X = p83.K() + p83.C() + p83.z() + p83.F() + p83.G() + p83.C() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.w() + p83.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p83.r());
        sb2.append(p83.s());
        sb2.append(p83.s());
        sb2.append(p83.r());
        sb2.append(p83.v());
        sb2.append(p83.k());
        sb2.append(p83.z());
        sb2.append(p83.H());
        sb2.append(p83.B());
        sb2.append(p83.v());
        sb2.append(p83.c());
        Y = sb2.toString();
        Z = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.d();
        a0 = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.u() + p83.n();
        b0 = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.d() + p83.v() + p83.s() + p83.K() + p83.I();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(p83.r());
        sb3.append(p83.s());
        sb3.append(p83.s());
        sb3.append(p83.r());
        sb3.append(p83.v());
        sb3.append(p83.x());
        sb3.append(p83.z());
        sb3.append(p83.M());
        sb3.append(p83.A());
        sb3.append(p83.D());
        sb3.append(p83.v());
        sb3.append(p83.e());
        c0 = sb3.toString();
        d0 = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.e() + p83.v() + p83.s() + p83.K() + p83.I();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(p83.r());
        sb4.append(p83.s());
        sb4.append(p83.s());
        sb4.append(p83.r());
        sb4.append(p83.v());
        sb4.append(p83.x());
        sb4.append(p83.z());
        sb4.append(p83.M());
        sb4.append(p83.A());
        sb4.append(p83.D());
        sb4.append(p83.v());
        sb4.append(p83.y());
        e0 = sb4.toString();
        f0 = p83.r() + p83.H() + p83.C() + p83.s() + p83.F() + p83.N() + p83.L() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.c();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(p83.r());
        sb5.append(p83.s());
        sb5.append(p83.s());
        sb5.append(p83.r());
        sb5.append(p83.v());
        sb5.append(p83.x());
        sb5.append(p83.z());
        sb5.append(p83.M());
        sb5.append(p83.A());
        sb5.append(p83.D());
        sb5.append(p83.v());
        sb5.append(p83.y());
        sb5.append(p83.c());
        g0 = sb5.toString();
        h0 = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.y() + p83.c() + p83.v() + p83.p() + p83.E() + p83.H() + p83.E();
        i0 = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.y() + p83.c() + p83.v() + p83.e() + p83.d() + p83.G() + p83.G();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(p83.r());
        sb6.append(p83.s());
        sb6.append(p83.s());
        sb6.append(p83.r());
        sb6.append(p83.v());
        sb6.append(p83.x());
        sb6.append(p83.z());
        sb6.append(p83.M());
        sb6.append(p83.A());
        sb6.append(p83.D());
        sb6.append(p83.v());
        sb6.append(p83.u());
        sb6.append(p83.J());
        sb6.append(p83.I());
        sb6.append(p83.K());
        sb6.append(p83.M());
        j0 = sb6.toString();
        k0 = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.u();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(p83.j());
        sb7.append(p83.J());
        sb7.append(p83.J());
        sb7.append(p83.F());
        sb7.append(p83.C());
        sb7.append(p83.v());
        sb7.append(p83.x());
        sb7.append(p83.z());
        sb7.append(p83.M());
        sb7.append(p83.A());
        sb7.append(p83.D());
        l0 = sb7.toString();
        m0 = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.y() + p83.d();
        n0 = p83.r() + p83.s() + p83.s() + p83.r() + p83.v() + p83.x() + p83.z() + p83.M() + p83.A() + p83.D() + p83.v() + p83.y() + p83.d() + p83.v() + p83.p() + p83.E() + p83.H() + p83.E();
        o0 = LazyKt.lazy(new Function0<List<DeviceParams>>() { // from class: com.heytap.health.device_manager_base.DeviceConstants$Companion$DeviceList$2
            @NotNull
            public final List<DeviceConstants.DeviceParams> invoke() {
                ArrayList arrayList = new ArrayList();
                DeviceConstants.Companion companion = DeviceConstants.INSTANCE;
                companion.b(arrayList, companion.s(), DeviceConstants.BaseDevice.AbstractC0017b.c.INSTANCE, 1, TuplesKt.to(companion.t(), companion.r()), TuplesKt.to(companion.u(), companion.r()));
                companion.b(arrayList, companion.U(), DeviceConstants.BaseDevice.AbstractC0017b.g.INSTANCE, 1, TuplesKt.to(companion.W(), companion.V()));
                companion.b(arrayList, companion.H(), a.INSTANCE, 7, TuplesKt.to(companion.I(), companion.G()));
                companion.b(arrayList, companion.w(), DeviceConstants.BaseDevice.a.C0016b.INSTANCE, 3, TuplesKt.to(companion.x(), companion.v()));
                companion.b(arrayList, companion.P(), DeviceConstants.BaseDevice.AbstractC0017b.a.INSTANCE, 1, TuplesKt.to(companion.f(), companion.d()), TuplesKt.to(companion.f(), companion.e()));
                companion.b(arrayList, companion.P(), DeviceConstants.BaseDevice.AbstractC0017b.f.INSTANCE, 1, TuplesKt.to(companion.Q(), companion.O()));
                companion.b(arrayList, companion.S(), DeviceConstants.BaseDevice.AbstractC0017b.d.INSTANCE, 1, TuplesKt.to(companion.L(), companion.K()));
                companion.b(arrayList, companion.S(), DeviceConstants.BaseDevice.AbstractC0017b.C0018b.INSTANCE, 1, TuplesKt.to(companion.h(), companion.g()));
                companion.b(arrayList, companion.S(), DeviceConstants.BaseDevice.AbstractC0017b.e.INSTANCE, 1, TuplesKt.to(companion.T(), companion.R()));
                companion.b(arrayList, companion.a0(), DeviceConstants.BaseDevice.AbstractC0017b.k.INSTANCE, 1, TuplesKt.to(companion.k0(), companion.l0()));
                companion.b(arrayList, companion.Z(), DeviceConstants.BaseDevice.AbstractC0017b.j.INSTANCE, 1, TuplesKt.to(companion.h0(), companion.g0()), TuplesKt.to(companion.f0(), companion.i0()));
                companion.b(arrayList, companion.F(), DeviceConstants.BaseDevice.a.c.INSTANCE, 2, TuplesKt.to(companion.D(), companion.C()), TuplesKt.to(companion.E(), companion.C()));
                companion.b(arrayList, companion.u0(), DeviceConstants.BaseDevice.a.f.INSTANCE, 1, TuplesKt.to(companion.o0(), companion.q()), TuplesKt.to(companion.p0(), companion.q()));
                companion.b(arrayList, companion.N(), DeviceConstants.BaseDevice.a.d.INSTANCE, 3, TuplesKt.to(companion.M(), companion.n()));
                companion.b(arrayList, companion.N(), DeviceConstants.BaseDevice.a.e.INSTANCE, 3, TuplesKt.to(companion.r0(), companion.m()), TuplesKt.to(companion.q0(), companion.m()));
                companion.b(arrayList, companion.Y(), DeviceConstants.BaseDevice.AbstractC0017b.i.INSTANCE, 1, TuplesKt.to(companion.c0(), companion.p()), TuplesKt.to(companion.b0(), companion.p()), TuplesKt.to(companion.d0(), companion.p()), TuplesKt.to(companion.e0(), companion.p()), TuplesKt.to(companion.s0(), companion.j0()));
                companion.b(arrayList, companion.X(), DeviceConstants.BaseDevice.AbstractC0017b.h.INSTANCE, 1, TuplesKt.to(companion.n0(), companion.o()), TuplesKt.to(companion.t0(), companion.o()), TuplesKt.to(companion.m0(), companion.o()));
                companion.b(arrayList, companion.i(), DeviceConstants.BaseDevice.a.C0015a.INSTANCE, 2, TuplesKt.to(companion.k(), companion.l()), TuplesKt.to(companion.j(), companion.l()));
                return arrayList;
            }
        });
        p0 = LazyKt.lazy(new Function0<List<List<String>>>() { // from class: com.heytap.health.device_manager_base.DeviceConstants$Companion$ALL_MODELS$2

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", BuildConfig.VERSION_NAME, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 DeviceConstants.kt\ncom/heytap/health/device_manager_base/DeviceConstants$Companion$ALL_MODELS$2\n*L\n1#1,328:1\n245#2:329\n*E\n"})
            public static final class a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((DeviceConstants.DeviceParams) t2).getGroupId()), Integer.valueOf(((DeviceConstants.DeviceParams) t).getGroupId()));
                }
            }

            @NotNull
            public final List<List<String>> invoke() {
                ArrayList arrayList = new ArrayList();
                List listSortedWith = CollectionsKt.sortedWith(DeviceConstants.INSTANCE.A(), new a());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listSortedWith) {
                    Integer numValueOf = Integer.valueOf(((DeviceConstants.DeviceParams) obj).getGroupId());
                    Object arrayList2 = linkedHashMap.get(numValueOf);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(numValueOf, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = ((Iterable) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((DeviceConstants.DeviceParams) it.next()).getModel());
                    }
                    arrayList.add(arrayList3);
                }
                return arrayList;
            }
        });
        q0 = LazyKt.lazy(new Function0<Map<Integer, List<List<String>>>>() { // from class: com.heytap.health.device_manager_base.DeviceConstants$Companion$DEVICETYPE_TO_MODELS$2

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", BuildConfig.VERSION_NAME, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 DeviceConstants.kt\ncom/heytap/health/device_manager_base/DeviceConstants$Companion$DEVICETYPE_TO_MODELS$2\n*L\n1#1,328:1\n262#2:329\n*E\n"})
            public static final class a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((DeviceConstants.DeviceParams) t2).getGroupId()), Integer.valueOf(((DeviceConstants.DeviceParams) t).getGroupId()));
                }
            }

            @NotNull
            public final Map<Integer, List<List<String>>> invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<DeviceConstants.DeviceParams> listA = DeviceConstants.INSTANCE.A();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj : listA) {
                    Integer numValueOf = Integer.valueOf(((DeviceConstants.DeviceParams) obj).getDeviceType());
                    Object arrayList = linkedHashMap2.get(numValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap2.put(numValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = CollectionsKt.sortedWith(list, new a()).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((DeviceConstants.DeviceParams) it.next()).getModel());
                    }
                    linkedHashMap.put(Integer.valueOf(iIntValue), CollectionsKt.mutableListOf(new List[]{arrayList2}));
                }
                return linkedHashMap;
            }
        });
    }
}