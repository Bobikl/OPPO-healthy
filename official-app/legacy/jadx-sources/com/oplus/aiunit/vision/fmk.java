package com.oplus.aiunit.vision;

import android.util.Pair;
import com.heytap.store.base.core.http.HttpUtils;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001c\u0010\b\u001a\u00020\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006J\u0006\u0010\t\u001a\u00020\u0002R<\u0010\u000e\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b0\nj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/fmk;", "", "", "key", "value", "a", "", "map", "b", "c", "Ljava/util/ArrayList;", "Landroid/util/Pair;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "mParams", "Ljava/lang/String;", "mUrl", "<init>", "(Ljava/lang/String;)V", "Companion", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class fmk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator<Pair<String, String>> f11433c = a.INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ArrayList<Pair<String, String>> mParams;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String mUrl;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/util/Pair;", "", "kotlin.jvm.PlatformType", "lhs", "rhs", "", "a", "(Landroid/util/Pair;Landroid/util/Pair;)I"}, k = 3, mv = {1, 4, 0})
    public static final class a<T> implements Comparator<Pair<String, String>> {
        public static final a INSTANCE = new a();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(Pair<String, String> pair, Pair<String, String> pair2) {
            Intrinsics.checkNotNull(pair);
            String str = (String) pair.first;
            Intrinsics.checkNotNull(pair2);
            String right = (String) pair2.first;
            if (str != null) {
                str.length();
            }
            if (right != null) {
                right.length();
            }
            Intrinsics.checkNotNullExpressionValue(right, "right");
            return str.compareTo(right);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.fmk$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R&\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/fmk$b;", "", "", "url", "Lcom/oplus/aiunit/vision/fmk;", "c", "params", "b", "Ljava/util/Comparator;", "Landroid/util/Pair;", "PARAMS_COMPARATOR", "Ljava/util/Comparator;", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(String url, String params) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null)) {
                return url + '?' + params;
            }
            if (StringsKt__StringsJVMKt.endsWith$default(url, "&", false, 2, null)) {
                return url + params;
            }
            return url + Typography.amp + params;
        }

        @NotNull
        public final fmk c(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new fmk(url);
        }
    }

    public fmk(@NotNull String mUrl) {
        Intrinsics.checkNotNullParameter(mUrl, "mUrl");
        this.mUrl = mUrl;
        this.mParams = new ArrayList<>();
    }

    @NotNull
    public final fmk a(@Nullable String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (key != null && key.length() > 0) {
            this.mParams.add(new Pair<>(key, value));
        }
        return this;
    }

    @NotNull
    public final fmk b(@Nullable Map<String, String> map) {
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                this.mParams.add(new Pair<>(str, map.get(str)));
            }
        }
        return this;
    }

    @NotNull
    public final String c() throws IllegalArgumentException {
        if (this.mParams.isEmpty()) {
            return this.mUrl;
        }
        Collections.sort(this.mParams, f11433c);
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
            return companion.b(str, string);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2.getMessage());
        }
    }
}
