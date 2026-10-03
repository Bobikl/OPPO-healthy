package com.oplus.aiunit.vision;

import androidx.autofill.HintConstants;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.accessory.constant.FastPairConstants;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okio.Buffer;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.IntProgression;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\b\u0018\u0000 H2\u00020\u0001:\u0002\u0017\u001cBc\b\u0000\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\b\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010.\u001a\u00020\u0014\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\b0/\u0012\u0010\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010/\u0012\b\u00108\u001a\u0004\u0018\u00010\b\u0012\u0006\u00109\u001a\u00020\b¢\u0006\u0004\bF\u0010GJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\bJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016R\u0017\u0010\u001b\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010&\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010)\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010.\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\b0/8\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001e\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0019\u00108\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b5\u0010\u001fR\u0014\u00109\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0011\u0010:\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u0011\u0010;\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010<\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0/8G¢\u0006\u0006\u001a\u0004\b'\u00103R\u0013\u0010>\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0013\u0010@\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b?\u0010\u001fR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\b0A8G¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010E\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006I"}, d2 = {"Lcom/oplus/aiunit/vision/uk9;", "", "Ljava/net/URL;", "y", "()Ljava/net/URL;", "Ljava/net/URI;", "x", "()Ljava/net/URI;", "", "name", "s", "u", "link", "v", "Lcom/oplus/aiunit/vision/uk9$a;", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "other", "", "equals", "", "hashCode", "toString", "a", "Z", MapSchema.FIELD_NAME_KEY, "()Z", "isHttps", "b", "Ljava/lang/String;", "w", "()Ljava/lang/String;", "scheme", "c", "z", HintConstants.AUTOFILL_HINT_USERNAME, "d", "o", HintConstants.AUTOFILL_HINT_PASSWORD, MapSchema.FIELD_NAME_ENTRY, "j", "host", "f", "I", "q", "()I", "port", "", b2n.f, "Ljava/util/List;", LogFieldKey.PROCESS_NAME_KEY, "()Ljava/util/List;", "pathSegments", b2n.g, "queryNamesAndValues", "i", "fragment", "url", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "r", SearchIntents.EXTRA_QUERY, "", "t", "()Ljava/util/Set;", "queryParameterNames", "encodedFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class uk9 {

    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isHttps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String scheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String username;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String password;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int port;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<String> pathSegments;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final List<String> queryNamesAndValues;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final String fragment;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u000f\u0018\u0000 L2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u000f\u0010$\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u0006\u0010'\u001a\u00020&J\b\u0010(\u001a\u00020\u0004H\u0016J!\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b*\u0010+R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00103\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\"\u00106\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010,\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010,\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\"\u0010\u001a\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR,\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010@\u001a\u0004\bC\u0010A\"\u0004\bD\u0010ER$\u0010I\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\bG\u0010.\"\u0004\bH\u00100¨\u0006M"}, d2 = {"Lcom/oplus/aiunit/vision/uk9$a;", "", "", "d", "", "input", "startPos", "limit", "", LogFieldKey.PROCESS_NAME_KEY, CityBean.POS, "", "addTrailingSlash", "alreadyEncoded", "n", b2n.g, "i", LogFieldKey.LEVEL_KEY, "scheme", "q", HintConstants.AUTOFILL_HINT_USERNAME, "x", HintConstants.AUTOFILL_HINT_PASSWORD, MapSchema.FIELD_NAME_KEY, "host", b2n.f, "port", LogFieldKey.MESSAGE_KEY, "encodedQuery", MapSchema.FIELD_NAME_ENTRY, "name", "value", "b", "encodedName", "encodedValue", "a", "o", "()Lcom/oplus/aiunit/vision/uk9$a;", "Lcom/oplus/aiunit/vision/uk9;", "c", "toString", "base", "j", "(Lcom/oplus/aiunit/vision/uk9;Ljava/lang/String;)Lcom/oplus/aiunit/vision/uk9$a;", "Ljava/lang/String;", "getScheme$okhttp4_extension_release", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp4_extension_release", "t", "encodedUsername", "getEncodedPassword$okhttp4_extension_release", "s", "encodedPassword", "getHost$okhttp4_extension_release", "u", "I", "getPort$okhttp4_extension_release", "()I", "v", "(I)V", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "encodedPathSegments", "getEncodedQueryNamesAndValues$okhttp4_extension_release", "setEncodedQueryNamesAndValues$okhttp4_extension_release", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp4_extension_release", "r", "encodedFragment", "<init>", "()V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String scheme;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public String host;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<String> encodedPathSegments;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public List<String> encodedQueryNamesAndValues;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public String encodedFragment;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String encodedUsername = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String encodedPassword = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int port = -1;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.uk9$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/uk9$a$a;", "", "", "input", "", CityBean.POS, "limit", b2n.f, b2n.g, "f", MapSchema.FIELD_NAME_ENTRY, "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int e(String input, int pos, int limit) {
                try {
                    int i = Integer.parseInt(Companion.b(uk9.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 <= i && 65535 >= i) {
                        return i;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == ':') {
                        return pos;
                    }
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos >= limit) {
                                break;
                            }
                        } while (input.charAt(pos) != ']');
                    }
                    pos++;
                }
                return limit;
            }

            public final int g(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((Intrinsics.compare((int) cCharAt, 97) < 0 || Intrinsics.compare((int) cCharAt, 122) > 0) && (Intrinsics.compare((int) cCharAt, 65) < 0 || Intrinsics.compare((int) cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char cCharAt2 = input.charAt(pos);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        @NotNull
        public final a a(@NotNull String encodedName, @Nullable String encodedValue) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            Companion companion = uk9.INSTANCE;
            list.add(Companion.b(companion, encodedName, 0, 0, uk9.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(encodedValue != null ? Companion.b(companion, encodedValue, 0, 0, uk9.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        public final a b(@NotNull String name, @Nullable String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            Companion companion = uk9.INSTANCE;
            list.add(Companion.b(companion, name, 0, 0, uk9.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(value != null ? Companion.b(companion, value, 0, 0, uk9.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        public final uk9 c() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = uk9.INSTANCE;
            String strH = Companion.h(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strH2 = Companion.h(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iD = d();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.h(uk9.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? Companion.h(uk9.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new uk9(str, strH, strH2, str2, iD, arrayList2, arrayList, str4 != null ? Companion.h(uk9.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final int d() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = uk9.INSTANCE;
            String str = this.scheme;
            Intrinsics.checkNotNull(str);
            return companion.c(str);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        @NotNull
        public final a e(@Nullable String encodedQuery) {
            List<String> listJ;
            if (encodedQuery != null) {
                Companion companion = uk9.INSTANCE;
                String strB = Companion.b(companion, encodedQuery, 0, 0, uk9.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (strB != null) {
                    listJ = companion.j(strB);
                } else {
                    listJ = null;
                }
            } else {
                listJ = null;
            }
            this.encodedQueryNamesAndValues = listJ;
            return this;
        }

        @NotNull
        public final List<String> f() {
            return this.encodedPathSegments;
        }

        @NotNull
        public final a g(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strE = hf9.e(Companion.h(uk9.INSTANCE, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.host = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final boolean h(String input) {
            return Intrinsics.areEqual(input, ".") || StringsKt__StringsJVMKt.equals(input, "%2e", true);
        }

        public final boolean i(String input) {
            return Intrinsics.areEqual(input, "..") || StringsKt__StringsJVMKt.equals(input, "%2e.", true) || StringsKt__StringsJVMKt.equals(input, ".%2e", true) || StringsKt__StringsJVMKt.equals(input, "%2e%2e", true);
        }

        @NotNull
        public final a j(@Nullable uk9 base, @NotNull String input) {
            int iO;
            int i;
            int i2;
            boolean z;
            String str;
            int i3;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(input, "input");
            int iY = sqk.y(input, 0, 0, 3, null);
            int iA = sqk.A(input, iY, 0, 2, null);
            Companion companion = INSTANCE;
            int iG = companion.g(input, iY, iA);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z4 = true;
            byte b = -1;
            if (iG != -1) {
                if (StringsKt__StringsJVMKt.startsWith(input, "https:", iY, true)) {
                    this.scheme = Const.Scheme.SCHEME_HTTPS;
                    iY += 6;
                } else {
                    if (!StringsKt__StringsJVMKt.startsWith(input, "http:", iY, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = "http";
                    iY += 5;
                }
            } else {
                if (base == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.scheme = base.getScheme();
            }
            int iH = companion.h(input, iY, iA);
            byte b2 = Utf8.REPLACEMENT_BYTE;
            byte b3 = FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_SEEKER;
            if (iH >= 2 || base == null || (!Intrinsics.areEqual(base.getScheme(), this.scheme))) {
                int i4 = iY + iH;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    iO = sqk.o(input, "@/\\?#", i4, iA);
                    byte bCharAt = iO != iA ? input.charAt(iO) : b;
                    if (bCharAt == b || bCharAt == b3 || bCharAt == 47 || bCharAt == 92 || bCharAt == b2) {
                        break;
                    }
                    if (bCharAt != 64) {
                        z = z4;
                        str = str2;
                        iA = iA;
                    } else {
                        if (z5) {
                            z = z4;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str = str2;
                            i3 = iO;
                            sb2.append(Companion.b(uk9.INSTANCE, input, i4, iO, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z2 = z6;
                        } else {
                            int iN = sqk.n(input, ':', i4, iO);
                            Companion companion2 = uk9.INSTANCE;
                            z = z4;
                            String str3 = str2;
                            String strB = Companion.b(companion2, input, i4, iN, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z6) {
                                strB = this.encodedUsername + "%40" + strB;
                            }
                            this.encodedUsername = strB;
                            if (iN != iO) {
                                this.encodedPassword = Companion.b(companion2, input, iN + 1, iO, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z3 = z;
                            } else {
                                z3 = z5;
                            }
                            z5 = z3;
                            str = str3;
                            z2 = z;
                            i3 = iO;
                        }
                        i4 = i3 + 1;
                        z6 = z2;
                    }
                    str2 = str;
                    z4 = z;
                    iA = iA;
                    b3 = FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_SEEKER;
                    b2 = Utf8.REPLACEMENT_BYTE;
                    b = -1;
                }
                boolean z7 = z4;
                String str4 = str2;
                i = iA;
                Companion companion3 = INSTANCE;
                int iF = companion3.f(input, i4, iO);
                int i5 = iF + 1;
                if (i5 < iO) {
                    i2 = i4;
                    this.host = hf9.e(Companion.h(uk9.INSTANCE, input, i4, iF, false, 4, null));
                    int iE = companion3.e(input, i5, iO);
                    this.port = iE;
                    if (!(iE != -1 ? z7 : false)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i5, iO);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str4);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    i2 = i4;
                    Companion companion4 = uk9.INSTANCE;
                    this.host = hf9.e(Companion.h(companion4, input, i2, iF, false, 4, null));
                    String str5 = this.scheme;
                    Intrinsics.checkNotNull(str5);
                    this.port = companion4.c(str5);
                }
                if (!(this.host != null ? z7 : false)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i2, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str4);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iY = iO;
            } else {
                this.encodedUsername = base.g();
                this.encodedPassword = base.c();
                this.host = base.getHost();
                this.port = base.getPort();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.e());
                if (iY == iA || input.charAt(iY) == '#') {
                    e(base.f());
                }
                i = iA;
            }
            int i6 = i;
            int iO2 = sqk.o(input, "?#", iY, i6);
            p(input, iY, iO2);
            if (iO2 < i6 && input.charAt(iO2) == '?') {
                int iN2 = sqk.n(input, '#', iO2, i6);
                Companion companion5 = uk9.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.j(Companion.b(companion5, input, iO2 + 1, iN2, uk9.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iO2 = iN2;
            }
            if (iO2 < i6 && input.charAt(iO2) == '#') {
                this.encodedFragment = Companion.b(uk9.INSTANCE, input, iO2 + 1, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final a k(@NotNull String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.encodedPassword = Companion.b(uk9.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER, null);
            return this;
        }

        public final void l() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        @NotNull
        public final a m(int port) {
            if (1 <= port && 65535 >= port) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + port).toString());
        }

        public final void n(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strB = Companion.b(uk9.INSTANCE, input, pos, limit, uk9.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, 240, null);
            if (h(strB)) {
                return;
            }
            if (i(strB)) {
                l();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strB);
            } else {
                this.encodedPathSegments.add(strB);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        @NotNull
        public final a o() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.b(uk9.INSTANCE, list.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list2.get(i2);
                    list2.set(i2, str2 != null ? Companion.b(uk9.INSTANCE, str2, 0, 0, uk9.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.b(uk9.INSTANCE, str3, 0, 0, uk9.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final void p(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i = startPos;
                if (i >= limit) {
                    return;
                }
                startPos = sqk.o(input, "/\\", i, limit);
                boolean z = startPos < limit;
                n(input, i, startPos, z, true);
                if (z) {
                    startPos++;
                }
            }
        }

        @NotNull
        public final a q(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt__StringsJVMKt.equals(scheme, "http", true)) {
                this.scheme = "http";
            } else {
                if (!StringsKt__StringsJVMKt.equals(scheme, Const.Scheme.SCHEME_HTTPS, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = Const.Scheme.SCHEME_HTTPS;
            }
            return this;
        }

        public final void r(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void s(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final void t(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0035  */
        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x0046  */
        /* JADX WARN: Code duplicated, block: B:38:0x0093  */
        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            } else {
                if (this.encodedPassword.length() > 0) {
                    sb.append(this.encodedUsername);
                    if (this.encodedPassword.length() > 0) {
                        sb.append(':');
                        sb.append(this.encodedPassword);
                    }
                    sb.append('@');
                }
            }
            String str2 = this.host;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, ':', false, 2, (Object) null)) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iD = d();
                String str3 = this.scheme;
                if (str3 != null) {
                    Companion companion = uk9.INSTANCE;
                    Intrinsics.checkNotNull(str3);
                    if (iD != companion.c(str3)) {
                        sb.append(':');
                        sb.append(iD);
                    }
                } else {
                    sb.append(':');
                    sb.append(iD);
                }
            }
            Companion companion2 = uk9.INSTANCE;
            companion2.i(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list);
                companion2.k(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(@Nullable String str) {
            this.host = str;
        }

        public final void v(int i) {
            this.port = i;
        }

        public final void w(@Nullable String str) {
            this.scheme = str;
        }

        @NotNull
        public final a x(@NotNull String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.encodedUsername = Companion.b(uk9.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER, null);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.uk9$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J%\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00020\u00062\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0000¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e*\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J1\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJc\u0010!\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b!\u0010\"J,\u0010%\u001a\u00020\n*\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u001c\u0010&\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002JV\u0010(\u001a\u00020\n*\u00020#2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002R\u0014\u0010)\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010*R\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010*R\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00103\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010*R\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00105\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010*R\u0014\u00106\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010*R\u0014\u00107\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010*¨\u0006:"}, d2 = {"Lcom/oplus/aiunit/vision/uk9$b;", "", "", "scheme", "", "c", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", kvi.FLEXIBLE_OUT_RES_DIR_NAME, "", "i", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", MapSchema.FIELD_NAME_KEY, "", "j", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/oplus/aiunit/vision/uk9;", "d", "(Ljava/lang/String;)Lcom/oplus/aiunit/vision/uk9;", "f", CityBean.POS, "limit", "", "plusIsSpace", b2n.f, "(Ljava/lang/String;IIZ)Ljava/lang/String;", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "Lokio/Buffer;", "encoded", LogFieldKey.MESSAGE_KEY, MapSchema.FIELD_NAME_ENTRY, "input", LogFieldKey.LEVEL_KEY, "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return companion.a(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        public static /* synthetic */ String h(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.g(str, i, i2, z);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        @NotNull
        public final String a(@NotNull String canonicalize, int i, int i2, @NotNull String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
            Intrinsics.checkNotNullParameter(canonicalize, "$this$canonicalize");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i;
            while (true) {
                if (iCharCount >= i2) {
                    String strSubstring = canonicalize.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                int iCodePointAt = canonicalize.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt__StringsKt.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null))) {
                    break;
                }
                if (iCodePointAt == 37) {
                    if (!z) {
                        break;
                    }
                    if (z2) {
                        if (e(canonicalize, iCharCount, i2)) {
                        }
                    }
                    if (iCodePointAt == 43) {
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                } else if (iCodePointAt == 43 || !z3) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
                Buffer buffer = new Buffer();
                buffer.writeUtf8(canonicalize, i, iCharCount);
                l(buffer, canonicalize, iCharCount, i2, encodeSet, z, z2, z3, z4, charset);
                return buffer.readUtf8();
            }
            Buffer buffer2 = new Buffer();
            buffer2.writeUtf8(canonicalize, i, iCharCount);
            l(buffer2, canonicalize, iCharCount, i2, encodeSet, z, z2, z3, z4, charset);
            return buffer2.readUtf8();
        }

        @JvmStatic
        public final int c(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals(Const.Scheme.SCHEME_HTTPS)) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        @JvmStatic
        @JvmName(name = ParserTag.TAG_GET)
        @NotNull
        public final uk9 d(@NotNull String toHttpUrl) {
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            return new a().j(null, toHttpUrl).c();
        }

        public final boolean e(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && sqk.G(str.charAt(i + 1)) != -1 && sqk.G(str.charAt(i3)) != -1;
        }

        @JvmStatic
        @JvmName(name = "parse")
        @Nullable
        public final uk9 f(@NotNull String toHttpUrlOrNull) {
            Intrinsics.checkNotNullParameter(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return d(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String g(@NotNull String percentDecode, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(percentDecode, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char cCharAt = percentDecode.charAt(i3);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(percentDecode, i, i3);
                    m(buffer, percentDecode, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = percentDecode.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(@NotNull List<String> toPathString, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(toPathString, "$this$toPathString");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = toPathString.size();
            for (int i = 0; i < size; i++) {
                out.append(mla.SEPARATOR);
                out.append(toPathString.get(i));
            }
        }

        @NotNull
        public final List<String> j(@NotNull String toQueryNamesAndValues) {
            Intrinsics.checkNotNullParameter(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= toQueryNamesAndValues.length()) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, Typography.amp, i, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = toQueryNamesAndValues.length();
                }
                int i2 = iIndexOf$default;
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, kam.h, i, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > i2) {
                    String strSubstring = toQueryNamesAndValues.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = toQueryNamesAndValues.substring(i, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = toQueryNamesAndValues.substring(iIndexOf$default2 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void k(@NotNull List<String> toQueryString, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(toQueryString, "$this$toQueryString");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, toQueryString.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                String str = toQueryString.get(first);
                String str2 = toQueryString.get(first + 1);
                if (first > 0) {
                    out.append(Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append(kam.h);
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0065  */
        /* JADX WARN: Code duplicated, block: B:41:0x006a  */
        /* JADX WARN: Code duplicated, block: B:44:0x0071  */
        /* JADX WARN: Code duplicated, block: B:50:0x008a  */
        /* JADX WARN: Code duplicated, block: B:53:0x0093 A[LOOP:1: B:51:0x008d->B:53:0x0093, LOOP_END] */
        public final void l(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            int iCharCount = i;
            Buffer buffer2 = null;
            while (iCharCount < i2) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z3) {
                        buffer.writeUtf8(z ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt__StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null))) {
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset != null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!buffer2.exhausted()) {
                            int i3 = buffer2.readByte() & 255;
                            buffer.writeByte(37);
                            buffer.writeByte((int) uk9.k[(i3 >> 4) & 15]);
                            buffer.writeByte((int) uk9.k[i3 & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!e(str, iCharCount, i2)) {
                                    }
                                }
                            }
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            if (charset != null) {
                                buffer2.writeUtf8CodePoint(iCodePointAt);
                            } else {
                                buffer2.writeUtf8CodePoint(iCodePointAt);
                            }
                            while (!buffer2.exhausted()) {
                                int i4 = buffer2.readByte() & 255;
                                buffer.writeByte(37);
                                buffer.writeByte((int) uk9.k[(i4 >> 4) & 15]);
                                buffer.writeByte((int) uk9.k[i4 & 15]);
                            }
                        }
                        buffer.writeUtf8CodePoint(iCodePointAt);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        public final void m(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                    int iG = sqk.G(str.charAt(i + 1));
                    int iG2 = sqk.G(str.charAt(i3));
                    if (iG == -1 || iG2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((iG << 4) + iG2);
                        i = i3 + Character.charCount(iCodePointAt);
                    }
                } else if (iCodePointAt == 43 && z) {
                    buffer.writeByte(32);
                    i++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }
    }

    public uk9(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = Intrinsics.areEqual(scheme, Const.Scheme.SCHEME_HTTPS);
    }

    @JvmStatic
    @JvmName(name = ParserTag.TAG_GET)
    @NotNull
    public static final uk9 i(@NotNull String str) {
        return INSTANCE.d(str);
    }

    @JvmStatic
    @JvmName(name = "parse")
    @Nullable
    public static final uk9 n(@NotNull String str) {
        return INSTANCE.f(str);
    }

    @JvmName(name = "encodedFragment")
    @Nullable
    public final String b() {
        if (this.fragment == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '#', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPassword")
    @NotNull
    public final String c() {
        if (this.password.length() == 0) {
            return "";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (Object) null) + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null);
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iIndexOf$default, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPath")
    @NotNull
    public final String d() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, mla.SEPARATOR, this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int iO = sqk.o(str, "?#", iIndexOf$default, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iIndexOf$default, iO);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPathSegments")
    @NotNull
    public final List<String> e() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, mla.SEPARATOR, this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int iO = sqk.o(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iO) {
            int i = iIndexOf$default + 1;
            int iN = sqk.n(this.url, mla.SEPARATOR, i, iO);
            String str2 = this.url;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i, iN);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iN;
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof uk9) && Intrinsics.areEqual(((uk9) other).url, this.url);
    }

    @JvmName(name = "encodedQuery")
    @Nullable
    public final String f() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        int iN = sqk.n(str, '#', iIndexOf$default, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iIndexOf$default, iN);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedUsername")
    @NotNull
    public final String g() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int iO = sqk.o(str, ":@", length, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iO);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "fragment")
    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @JvmName(name = "host")
    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    @NotNull
    public final a l() {
        a aVar = new a();
        aVar.w(this.scheme);
        aVar.t(g());
        aVar.s(c());
        aVar.u(this.host);
        aVar.v(this.port != INSTANCE.c(this.scheme) ? this.port : -1);
        aVar.f().clear();
        aVar.f().addAll(e());
        aVar.e(f());
        aVar.r(b());
        return aVar;
    }

    @Nullable
    public final a m(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().j(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @JvmName(name = HintConstants.AUTOFILL_HINT_PASSWORD)
    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @JvmName(name = "pathSegments")
    @NotNull
    public final List<String> p() {
        return this.pathSegments;
    }

    @JvmName(name = "port")
    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @JvmName(name = SearchIntents.EXTRA_QUERY)
    @Nullable
    public final String r() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.k(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @Nullable
    public final String s(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (!Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    @JvmName(name = "queryParameterNames")
    @NotNull
    public final Set<String> t() {
        if (this.queryNamesAndValues == null) {
            return SetsKt__SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @NotNull
    public final String u() {
        a aVarM = m("/...");
        Intrinsics.checkNotNull(aVarM);
        return aVarM.x("").k("").c().getUrl();
    }

    @Nullable
    public final uk9 v(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarM = m(link);
        if (aVarM != null) {
            return aVarM.c();
        }
        return null;
    }

    @JvmName(name = "scheme")
    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @JvmName(name = ParserTag.TAG_URI)
    @NotNull
    public final URI x() {
        String string = l().o().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    @JvmName(name = "url")
    @NotNull
    public final URL y() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    @JvmName(name = HintConstants.AUTOFILL_HINT_USERNAME)
    @NotNull
    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getUsername() {
        return this.username;
    }
}
