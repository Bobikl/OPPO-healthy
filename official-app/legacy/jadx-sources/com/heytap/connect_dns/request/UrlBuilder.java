package com.heytap.connect_dns.request;

import android.util.Pair;
import com.heytap.connect_dns.request.UrlBuilder;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.jla;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\nJ#\u0010\u0005\u001a\u00020\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R>\u0010\u0018\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00160\u0015j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016`\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/heytap/connect_dns/request/UrlBuilder;", "", "", "key", "value", "addParam", "(Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/connect_dns/request/UrlBuilder;", "", "(Ljava/lang/String;J)Lcom/heytap/connect_dns/request/UrlBuilder;", "", "(Ljava/lang/String;I)Lcom/heytap/connect_dns/request/UrlBuilder;", "", "map", "(Ljava/util/Map;)Lcom/heytap/connect_dns/request/UrlBuilder;", "", "clear", "()V", jla.DEFAULT_BUILD_METHOD, "()Ljava/lang/String;", "mUrl", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Landroid/util/Pair;", "Lkotlin/collections/ArrayList;", "mParams", "Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class UrlBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Comparator<Pair<String, String>> PARAMS_COMPARATOR = new Comparator() { // from class: com.oplus.aiunit.vision.emk
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return UrlBuilder.m4614PARAMS_COMPARATOR$lambda0((Pair) obj, (Pair) obj2);
        }
    };

    @NotNull
    private final ArrayList<Pair<String, String>> mParams;

    @NotNull
    private final String mUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/heytap/connect_dns/request/UrlBuilder$Companion;", "", "", "url", "params", "joinParams", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/heytap/connect_dns/request/UrlBuilder;", "newBuilder", "(Ljava/lang/String;)Lcom/heytap/connect_dns/request/UrlBuilder;", "Ljava/util/Comparator;", "Landroid/util/Pair;", "PARAMS_COMPARATOR", "Ljava/util/Comparator;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String joinParams(String url, String params) {
            StringBuilder sb;
            char c2;
            if (!StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null)) {
                sb = new StringBuilder();
                sb.append(url);
                c2 = '?';
            } else {
                if (StringsKt__StringsJVMKt.endsWith$default(url, "&", false, 2, null)) {
                    return Intrinsics.stringPlus(url, params);
                }
                sb = new StringBuilder();
                sb.append(url);
                c2 = Typography.amp;
            }
            sb.append(c2);
            sb.append(params);
            return sb.toString();
        }

        @NotNull
        public final UrlBuilder newBuilder(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new UrlBuilder(url);
        }
    }

    public UrlBuilder(@NotNull String mUrl) {
        Intrinsics.checkNotNullParameter(mUrl, "mUrl");
        this.mUrl = mUrl;
        this.mParams = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: PARAMS_COMPARATOR$lambda-0, reason: not valid java name */
    public static final int m4614PARAMS_COMPARATOR$lambda0(Pair pair, Pair pair2) {
        Intrinsics.checkNotNull(pair);
        String str = (String) pair.first;
        Intrinsics.checkNotNull(pair2);
        String right = (String) pair2.first;
        Intrinsics.checkNotNullExpressionValue(right, "right");
        return str.compareTo(right);
    }

    @NotNull
    public final UrlBuilder addParam(@Nullable String key, int value) {
        if (key != null && key.length() > 0) {
            this.mParams.add(new Pair<>(key, String.valueOf(value)));
        }
        return this;
    }

    @NotNull
    public final String build() {
        if (this.mParams.isEmpty()) {
            return this.mUrl;
        }
        Collections.sort(this.mParams, PARAMS_COMPARATOR);
        StringBuilder sb = new StringBuilder();
        try {
            for (Pair<String, String> pair : this.mParams) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                Object obj = pair.second;
                if (obj == null || ((String) obj).length() <= 0) {
                    sb.append((String) pair.first);
                    sb.append(HttpUtils.EQUAL_SIGN);
                } else {
                    sb.append((String) pair.first);
                    sb.append(HttpUtils.EQUAL_SIGN);
                    sb.append(URLEncoder.encode((String) pair.second, "UTF-8"));
                }
            }
            Companion companion = INSTANCE;
            String str = this.mUrl;
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
            return companion.joinParams(str, string);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2.getMessage());
        }
    }

    public final void clear() {
        this.mParams.clear();
    }

    @NotNull
    public final UrlBuilder addParam(@Nullable String key, long value) {
        if (key != null && key.length() > 0) {
            this.mParams.add(new Pair<>(key, String.valueOf(value)));
        }
        return this;
    }

    @NotNull
    public final UrlBuilder addParam(@Nullable String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (key != null && key.length() > 0) {
            this.mParams.add(new Pair<>(key, value));
        }
        return this;
    }

    @NotNull
    public final UrlBuilder addParam(@Nullable Map<String, String> map) {
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                this.mParams.add(new Pair<>(str, map.get(str)));
            }
        }
        return this;
    }
}
