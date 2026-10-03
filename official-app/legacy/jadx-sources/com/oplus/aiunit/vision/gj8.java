package com.oplus.aiunit.vision;

import com.oplus.weatherservicesdk.data.Weather;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.ArrayIteratorKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.jvm.internal.markers.KMappedMarker;
import p010kotlin.ranges.IntProgression;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 #2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0005\u0007B\u0017\b\u0002\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0004\u001a\u00020\u0003J\u001b\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0096\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000e0\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/gj8;", "", "Lkotlin/Pair;", "", "name", "a", "Ljava/util/Date;", "b", "", "index", "c", b2n.g, "", "names", "", "i", "", "iterator", "Lcom/oplus/aiunit/vision/gj8$a;", "d", "", "other", "", "equals", "hashCode", "toString", "", b2n.f, "", "[Ljava/lang/String;", "namesAndValues", "size", "()I", "<init>", "([Ljava/lang/String;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class gj8 implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String[] namesAndValues;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u0019\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0013\u001a\u00020\u000bR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/gj8$a;", "", "", "line", "d", "(Ljava/lang/String;)Lcom/oplus/aiunit/vision/gj8$a;", "a", "name", "value", "b", "f", "Lcom/oplus/aiunit/vision/gj8;", "headers", "c", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;Ljava/lang/String;)Lcom/oplus/aiunit/vision/gj8$a;", "j", MapSchema.FIELD_NAME_KEY, b2n.g, b2n.f, "", "Ljava/util/List;", "i", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final a a(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 0, false, 6, (Object) null);
            if (!(iIndexOf$default != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (strSubstring == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            String strSubstring2 = line.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            b(string, strSubstring2);
            return this;
        }

        @NotNull
        public final a b(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion companion = gj8.INSTANCE;
            companion.d(name);
            companion.e(value, name);
            e(name, value);
            return this;
        }

        @NotNull
        public final a c(@NotNull gj8 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                e(headers.c(i), headers.h(i));
            }
            return this;
        }

        @NotNull
        public final a d(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                e(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                e("", strSubstring3);
            } else {
                e("", line);
            }
            return this;
        }

        @NotNull
        public final a e(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(StringsKt__StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        @NotNull
        public final a f(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            gj8.INSTANCE.d(name);
            e(name, value);
            return this;
        }

        @NotNull
        public final gj8 g() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new gj8((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @Nullable
        public final String h(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.downTo(this.namesAndValues.size() - 2, 0), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return null;
                }
            } else if (first < last) {
                return null;
            }
            while (!StringsKt__StringsJVMKt.equals(name, this.namesAndValues.get(first), true)) {
                if (first == last) {
                    return null;
                }
                first += step;
            }
            return this.namesAndValues.get(first + 1);
        }

        @NotNull
        public final List<String> i() {
            return this.namesAndValues;
        }

        @NotNull
        public final a j(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (StringsKt__StringsJVMKt.equals(name, this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @NotNull
        public final a k(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Companion companion = gj8.INSTANCE;
            companion.d(name);
            companion.e(value, name);
            j(name);
            e(name, value);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.gj8$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/gj8$b;", "", "", "", "namesAndValues", "Lcom/oplus/aiunit/vision/gj8;", b2n.g, "([Ljava/lang/String;)Lcom/oplus/aiunit/vision/gj8;", "", b2n.f, "(Ljava/util/Map;)Lcom/oplus/aiunit/vision/gj8;", "name", "f", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "d", "value", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void d(String name) {
            if (!(name.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = name.charAt(i);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(sqk.r("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), name).toString());
                }
            }
        }

        public final void e(String value, String name) {
            int length = value.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = value.charAt(i);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(sqk.r("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), name));
                    sb.append(sqk.F(name) ? "" : ": " + value);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public final String f(String[] namesAndValues, String name) {
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.downTo(namesAndValues.length - 2, 0), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return null;
                }
            } else if (first < last) {
                return null;
            }
            while (!StringsKt__StringsJVMKt.equals(name, namesAndValues[first], true)) {
                if (first == last) {
                    return null;
                }
                first += step;
            }
            return namesAndValues[first + 1];
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public final gj8 g(@NotNull Map<String, String> toHeaders) {
            Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = StringsKt__StringsKt.trim((CharSequence) key).toString();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string2 = StringsKt__StringsKt.trim((CharSequence) value).toString();
                d(string);
                e(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new gj8(strArr, null);
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public final gj8 h(@NotNull String... namesAndValues) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = namesAndValues.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr[i] = StringsKt__StringsKt.trim((CharSequence) str).toString();
            }
            IntProgression intProgressionStep = RangesKt___RangesKt.step(ArraysKt___ArraysKt.getIndices(strArr), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step < 0 ? first >= last : first <= last) {
                while (true) {
                    String str2 = strArr[first];
                    String str3 = strArr[first + 1];
                    d(str2);
                    e(str3, str2);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            return new gj8(strArr, null);
        }
    }

    public gj8(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    public static final gj8 e(@NotNull Map<String, String> map) {
        return INSTANCE.g(map);
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    public static final gj8 f(@NotNull String... strArr) {
        return INSTANCE.h(strArr);
    }

    @Nullable
    public final String a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return INSTANCE.f(this.namesAndValues, name);
    }

    @Nullable
    public final Date b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = a(name);
        if (strA != null) {
            return y05.a(strA);
        }
        return null;
    }

    @NotNull
    public final String c(int index) {
        return this.namesAndValues[index * 2];
    }

    @NotNull
    public final a d() {
        a aVar = new a();
        CollectionsKt__MutableCollectionsKt.addAll(aVar.i(), this.namesAndValues);
        return aVar;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof gj8) && Arrays.equals(this.namesAndValues, ((gj8) other).namesAndValues);
    }

    @NotNull
    public final Map<String, List<String>> g() {
        TreeMap treeMap = new TreeMap(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (strC == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strC.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(h(i));
        }
        return treeMap;
    }

    @NotNull
    public final String h(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @NotNull
    public final List<String> i(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (StringsKt__StringsJVMKt.equals(name, c(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(h(i));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = TuplesKt.to(c(i), h(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    @NotNull
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(c(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @JvmName(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            String strH = h(i);
            sb.append(strC);
            sb.append(": ");
            if (sqk.F(strC)) {
                strH = "██";
            }
            sb.append(strH);
            sb.append(Weather.SEPARATOR);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ gj8(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
