package com.oplus.aiunit.vision;

import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/df2;", "", "Companion", "a", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class df2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.df2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/df2$a;", "", "", "glsl", "", "alphaPremultiplied", "c", "glslCode", "", "Lkotlin/Pair;", "a", "b", "<init>", "()V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nCOEAGSLTranslater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COEAGSLTranslater.kt\ncom/oplus/vfxsdk/common/COEAGSLTranslater$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,273:1\n1855#2,2:274\n1855#2,2:276\n1313#3,2:278\n*S KotlinDebug\n*F\n+ 1 COEAGSLTranslater.kt\ncom/oplus/vfxsdk/common/COEAGSLTranslater$Companion\n*L\n154#1:274,2\n191#1:276,2\n209#1:278,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Pair<String, String>> a(String glslCode) {
            Sequence<MatchResult> sequenceFindAll$default = Regex.findAll$default(new Regex("texture\\s*\\(\\s*(\\w+)\\s*,\\s*"), glslCode, 0, 2, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (MatchResult matchResult : sequenceFindAll$default) {
                int i = 1;
                String string = StringsKt.trim((String) matchResult.getGroupValues().get(1)).toString();
                int iIntValue = matchResult.getRange().getEndInclusive().intValue() + 1;
                int i2 = iIntValue;
                while (i2 < glslCode.length() && i > 0) {
                    char cCharAt = glslCode.charAt(i2);
                    if (cCharAt == '(') {
                        i++;
                    } else if (cCharAt == ')') {
                        i--;
                    }
                    i2++;
                }
                if (i == 0) {
                    String strSubstring = glslCode.substring(iIntValue, i2 - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(TuplesKt.to(string, StringsKt.trim(strSubstring).toString()));
                }
            }
            return arrayList;
        }

        public final String b(String glslCode, boolean alphaPremultiplied) {
            Matcher matcher = Pattern.compile("void\\s+main\\s*\\(.*\\)\\s*\\{").matcher(glslCode);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            if (!matcher.find()) {
                return "";
            }
            int iEnd = matcher.end();
            int i = iEnd;
            int i2 = 1;
            while (i2 > 0 && i < glslCode.length()) {
                char cCharAt = glslCode.charAt(i);
                if (cCharAt == '{') {
                    i2++;
                } else if (cCharAt == '}') {
                    i2--;
                }
                i++;
            }
            String strSubstring = glslCode.substring(iEnd, i - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = StringsKt.trim(strSubstring).toString();
            StringBuilder sb = new StringBuilder();
            sb.append("    runtimeShader_uv = (u_matResolution * vec3(FragCoord, 1.0)).xy / u_resolution.xy;\n");
            sb.append("    runtimeShader_FragCoord = vec4((u_matResolution * vec3(FragCoord, 1.0)).xy, 0.0, 1.0);\n");
            sb.append("    runtimeShader_FragCoord.y = u_resolution.y - runtimeShader_FragCoord.y; \n");
            sb.append(StringsKt.trim(string).toString());
            if (alphaPremultiplied) {
                sb.append("\n    runtimeShader_FragColor.xyz *= runtimeShader_FragColor.a;\n");
            }
            sb.append("\n    return runtimeShader_FragColor;\n");
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new Regex("void\\s+main\\s*\\(.*\\)\\s*\\{").replace(StringsKt.replace$default(glslCode, string, string2, false, 4, (Object) null), "vec4 main(vec2 FragCoord) {");
        }

        @NotNull
        public final String c(@NotNull String glsl, boolean alphaPremultiplied) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(glsl, "glsl");
            List mutableList = CollectionsKt.toMutableList(StringsKt.lines(b(glsl, alphaPremultiplied)));
            StringBuilder sb = new StringBuilder();
            Regex regex = new Regex("uniform\\s+mat3\\s+u_matResolution\\s*;");
            Regex regex2 = new Regex("uniform\\s+vec2\\s+u_resolution\\s*;");
            Regex regex3 = new Regex("uniform\\s+float\\s+u_time\\s*;");
            Iterator it = mutableList.iterator();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            int i3 = -1;
            int i4 = -1;
            while (it.hasNext()) {
                int i5 = i2 + 1;
                String str3 = (String) it.next();
                it = it;
                int i6 = i2;
                if (StringsKt.startsWith$default(str3, "#version", false, 2, (Object) null)) {
                    i3 = i6;
                } else if (StringsKt.startsWith$default(str3, "precision", false, 2, (Object) null)) {
                    i4 = i6;
                }
                if (regex2.containsMatchIn(str3)) {
                    z = true;
                }
                if (regex3.containsMatchIn(str3)) {
                    z2 = true;
                }
                i2 = i5;
                if (regex.containsMatchIn(str3)) {
                    z3 = true;
                }
            }
            int i7 = -1;
            if (i3 != -1) {
                mutableList.set(i3, "// " + mutableList.get(i3) + "  // version directive is not needed in AGSL");
                i7 = -1;
            }
            if (i4 != i7) {
                mutableList.set(i4, "// " + mutableList.get(i4) + "  // precision directive is not needed in AGSL");
            }
            Regex regex4 = new Regex("uniform\\s+sampler2D\\s+(\\w+);");
            int size = mutableList.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (regex4.containsMatchIn((CharSequence) mutableList.get(i8))) {
                    MatchResult matchResultFind$default = Regex.find$default(regex4, (CharSequence) mutableList.get(i8), 0, 2, (Object) null);
                    Intrinsics.checkNotNull(matchResultFind$default);
                    String str4 = (String) matchResultFind$default.getGroupValues().get(1);
                    mutableList.set(i8, regex4.replace((CharSequence) mutableList.get(i8), "uniform shader " + str4 + ";\nuniform vec2 " + str4 + "_size;"));
                }
            }
            if (!z) {
                mutableList.add(0, "uniform vec2 u_resolution;");
            }
            if (!z2) {
                mutableList.add(0, "uniform float u_time;");
            }
            if (!z3) {
                mutableList.add(0, "uniform mat3 u_matResolution;");
            }
            mutableList.add(0, "vec4 runtimeShader_FragCoord;");
            mutableList.add(0, "vec2 runtimeShader_uv;");
            mutableList.add(0, "vec4 runtimeShader_FragColor;");
            int size2 = mutableList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                mutableList.set(i9, new Regex("gl_FragCoord").replace((CharSequence) mutableList.get(i9), "runtimeShader_FragCoord"));
            }
            Regex regex5 = new Regex("varying\\s+(vec\\d+)\\s+(\\w+);");
            Regex regex6 = new Regex("//\\s*RuntimeShader_uv");
            int size3 = mutableList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size3) {
                    str = null;
                    break;
                }
                String str5 = (String) CollectionsKt.getOrNull(mutableList, i10 - 1);
                regex6.containsMatchIn(String.valueOf(str5 != null ? StringsKt.trim(str5).toString() : null));
                MatchResult matchResultMatchEntire = regex5.matchEntire(StringsKt.trim((String) mutableList.get(i10)).toString());
                if (matchResultMatchEntire != null) {
                    str = (String) matchResultMatchEntire.getGroupValues().get(2);
                    mutableList.set(i10, "// " + mutableList.get(i10));
                    break;
                }
                i10++;
            }
            Regex regex7 = new Regex("texture2D\\s*\\((\\w+),\\s*([^\\)]+)\\)");
            int size4 = mutableList.size();
            int i11 = 0;
            while (i11 < size4) {
                if (regex7.containsMatchIn((CharSequence) mutableList.get(i11))) {
                    MatchResult matchResultFind$default2 = Regex.find$default(regex7, (CharSequence) mutableList.get(i11), i, 2, (Object) null);
                    Intrinsics.checkNotNull(matchResultFind$default2);
                    String str6 = (String) matchResultFind$default2.getGroupValues().get(1);
                    String str7 = (String) matchResultFind$default2.getGroupValues().get(2);
                    mutableList.set(i11, regex7.replace((CharSequence) mutableList.get(i11), str6 + ".eval(" + str7 + " * " + str6 + "_size)"));
                }
                i11++;
                i = 0;
            }
            if (str != null) {
                Regex regex8 = new Regex("\\b" + str + "\\b");
                int size5 = mutableList.size();
                for (int i12 = 0; i12 < size5; i12++) {
                    mutableList.set(i12, regex8.replace((CharSequence) mutableList.get(i12), "runtimeShader_uv"));
                }
            }
            Regex regex9 = new Regex("\\bgl_FragColor\\b");
            int size6 = mutableList.size();
            for (int i13 = 0; i13 < size6; i13++) {
                mutableList.set(i13, regex9.replace((CharSequence) mutableList.get(i13), "runtimeShader_FragColor"));
            }
            Regex regex10 = new Regex("in\\s+(vec\\d+)\\s+(\\w+);");
            int size7 = mutableList.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size7) {
                    str2 = null;
                    break;
                }
                String str8 = (String) CollectionsKt.getOrNull(mutableList, i14 - 1);
                regex6.containsMatchIn(String.valueOf(str8 != null ? StringsKt.trim(str8).toString() : null));
                MatchResult matchResultMatchEntire2 = regex10.matchEntire(StringsKt.trim((String) mutableList.get(i14)).toString());
                if (matchResultMatchEntire2 != null) {
                    String str9 = (String) matchResultMatchEntire2.getGroupValues().get(2);
                    mutableList.set(i14, "// " + mutableList.get(i14));
                    str2 = str9;
                    break;
                }
                i14++;
            }
            Regex regex11 = new Regex("texture\\s*\\(\\s*(\\w+)\\s*,\\s*([^,)]+)");
            int size8 = mutableList.size();
            int i15 = 0;
            while (i15 < size8) {
                if (regex11.containsMatchIn((CharSequence) mutableList.get(i15))) {
                    for (Iterator it2 = a((String) mutableList.get(i15)).iterator(); it2.hasNext(); it2 = it2) {
                        Pair pair = (Pair) it2.next();
                        String str10 = (String) pair.component1();
                        String str11 = (String) pair.component2();
                        StringBuilder sb2 = new StringBuilder();
                        Regex regex12 = regex11;
                        sb2.append("Texture variable: ");
                        sb2.append(str10);
                        sb2.append(", TexCoord variable: ");
                        sb2.append(str11);
                        System.out.println((Object) sb2.toString());
                        mutableList.set(i15, new Regex("texture\\s*\\(\\s*" + str10 + "\\s*,\\s*" + Regex.Companion.escape(str11) + "\\s*\\)").replace((CharSequence) mutableList.get(i15), str10 + ".eval((" + str11 + ") * " + str10 + "_size)"));
                        regex11 = regex12;
                        size8 = size8;
                    }
                }
                i15++;
                regex11 = regex11;
                size8 = size8;
            }
            Regex regex13 = new Regex("out\\s+(vec4)\\s+(\\w+);");
            int size9 = mutableList.size();
            String str12 = null;
            for (int i16 = 0; i16 < size9; i16++) {
                MatchResult matchResultMatchEntire3 = regex13.matchEntire(StringsKt.trim((String) mutableList.get(i16)).toString());
                if (matchResultMatchEntire3 != null && Intrinsics.areEqual(matchResultMatchEntire3.getGroupValues().get(1), "vec4")) {
                    mutableList.set(i16, "// " + mutableList.get(i16));
                    str12 = (String) matchResultMatchEntire3.getGroupValues().get(2);
                }
            }
            if (str2 != null) {
                Regex regex14 = new Regex("\\b" + str2 + "\\b");
                int size10 = mutableList.size();
                for (int i17 = 0; i17 < size10; i17++) {
                    mutableList.set(i17, regex14.replace((CharSequence) mutableList.get(i17), "runtimeShader_uv"));
                }
            }
            if (str12 != null) {
                int size11 = mutableList.size();
                for (int i18 = 0; i18 < size11; i18++) {
                    mutableList.set(i18, new Regex("\\b" + str12 + "\\b").replace((CharSequence) mutableList.get(i18), "runtimeShader_FragColor"));
                }
            }
            Iterator it3 = mutableList.iterator();
            while (it3.hasNext()) {
                sb.append((String) it3.next());
                sb.append(Weather.SEPARATOR);
            }
            if (dvk.INSTANCE.a()) {
                System.out.println((Object) " ------------ start -------------");
                System.out.println((Object) sb.toString());
                System.out.println((Object) " ------------ end --------------");
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }
}
