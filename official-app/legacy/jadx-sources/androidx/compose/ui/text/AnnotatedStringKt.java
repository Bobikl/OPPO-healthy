package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.InlineMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0016\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a%\u0010\t\u001a\u00020\u00012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000\u001a(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0000\u001a\b\u0010\u0016\u001a\u00020\u0001H\u0000\u001aD\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0019\u0018\u00010\u0018\"\u0004\b\u0000\u0010\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u001a0\u0019\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a(\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0000\u001a\u0014\u0010#\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a\u0014\u0010&\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a,\u0010'\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020(0\u0019\u0018\u00010\u0018*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a*\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0019\u0018\u00010\u0018*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a*\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0019\u0018\u00010\u0018*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001ad\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0018\"\u0004\b\u0000\u0010\u001a*\u00020\u00012\u0006\u0010,\u001a\u00020\u00062>\b\u0004\u0010-\u001a8\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u0002H\u001a0.H\u0080\bø\u0001\u0000\u001a \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00190\u0018*\u00020\u00012\u0006\u0010,\u001a\u00020\u0006H\u0000\u001a\u001c\u00103\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002\u001a\u0014\u00104\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a\u0014\u00105\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001aB\u00106\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u00108\u001a\u0002092\u0019\b\u0004\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010:\u001aB\u00106\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010;\u001a\u00020<2\u0019\b\u0004\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010=\u001aJ\u00106\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0019\b\u0004\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010@\u001aB\u0010A\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010B\u001a\u00020\u00062\u0019\b\u0004\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010C\u001a@\u0010A\u001a\u0002H7\"\b\b\u0000\u00107*\u00020(*\u00020\f2\u0006\u0010B\u001a\u00020\b2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H70\u000b¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006E"}, d2 = {"EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedString", "text", "", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "buildAnnotatedString", "builder", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/ExtensionFunctionType;", "contains", "", "baseStart", "", "baseEnd", "targetStart", "targetEnd", "emptyAnnotatedString", "filterRanges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", ExifInterface.GPS_DIRECTION_TRUE, "ranges", "start", TextEntity.ELLIPSIZE_END, "intersect", "lStart", "lEnd", "rStart", "rEnd", "capitalize", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "getLocalAnnotations", "", "getLocalParagraphStyles", "getLocalSpanStyles", "mapEachParagraphStyle", "defaultParagraphStyle", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "annotatedString", "normalizedParagraphStyles", "substringWithoutParagraphStyles", "toLowerCase", "toUpperCase", "withAnnotation", "R", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tag", "annotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withStyle", Const.Arguments.Open.STYLE, "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,4:1136\n38#2:1142\n151#2,3:1144\n33#2,4:1147\n154#2,2:1151\n38#2:1153\n156#2:1154\n33#2,4:1158\n38#2:1164\n151#2,3:1166\n33#2,4:1169\n154#2,2:1173\n38#2:1175\n156#2:1176\n33#2,4:1180\n38#2:1186\n151#2,3:1188\n33#2,4:1191\n154#2,2:1195\n38#2:1197\n156#2:1198\n151#2,3:1199\n33#2,4:1202\n154#2,2:1206\n38#2:1208\n156#2:1209\n33#2,4:1214\n38#2:1220\n151#2,5:1222\n38#2:1227\n156#2:1228\n35#3,3:1133\n38#3,2:1140\n40#3:1143\n35#3,3:1155\n38#3,2:1162\n40#3:1165\n35#3,3:1177\n38#3,2:1184\n40#3:1187\n35#3,3:1211\n38#3,2:1218\n40#3:1221\n1#4:1210\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n676#1:1127,6\n712#1:1136,4\n712#1:1142\n713#1:1144,3\n713#1:1147,4\n713#1:1151,2\n713#1:1153\n713#1:1154\n739#1:1158,4\n739#1:1164\n740#1:1166,3\n740#1:1169,4\n740#1:1173,2\n740#1:1175\n740#1:1176\n766#1:1180,4\n766#1:1186\n767#1:1188,3\n767#1:1191,4\n767#1:1195,2\n767#1:1197\n767#1:1198\n803#1:1199,3\n803#1:1202,4\n803#1:1206,2\n803#1:1208\n803#1:1209\n1049#1:1214,4\n1049#1:1220\n1049#1:1222,5\n1049#1:1227\n1049#1:1228\n712#1:1133,3\n712#1:1140,2\n712#1:1143\n739#1:1155,3\n739#1:1162,2\n739#1:1165\n766#1:1177,3\n766#1:1184,2\n766#1:1187\n1049#1:1211,3\n1049#1:1218,2\n1049#1:1221\n*E\n"})
public final class AnnotatedStringKt {

    @NotNull
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull SpanStyle spanStyle, @Nullable ParagraphStyle paragraphStyle) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        return new AnnotatedString(text, CollectionsKt__CollectionsJVMKt.listOf(new AnnotatedString.Range(spanStyle, 0, text.length())), paragraphStyle == null ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, text.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    @NotNull
    public static final AnnotatedString buildAnnotatedString(@NotNull Function1<? super AnnotatedString.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        builder.invoke(builder2);
        return builder2.toAnnotatedString();
    }

    @NotNull
    public static final AnnotatedString capitalize(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.capitalize.1
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i, int i2) {
                Intrinsics.checkNotNullParameter(str, "str");
                if (i == 0) {
                    String strSubstring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.capitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i, int i2, int i3, int i4) {
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if ((i3 == i4) != (i == i2)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final AnnotatedString decapitalize(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.decapitalize.1
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i, int i2) {
                Intrinsics.checkNotNullParameter(str, "str");
                if (i == 0) {
                    String strSubstring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.decapitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i2) {
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<? extends T> range = list.get(i3);
            AnnotatedString.Range<? extends T> range2 = range;
            if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i, range3.getStart()) - i, Math.min(i2, range3.getEnd()) - i, range3.getTag()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        if (i == i2 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i3);
            AnnotatedString.Range<? extends Object> range2 = range;
            if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), RangesKt___RangesKt.coerceIn(range3.getStart(), i, i2) - i, RangesKt___RangesKt.coerceIn(range3.getEnd(), i, i2) - i, range3.getTag()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i == i2 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i3);
            AnnotatedString.Range<ParagraphStyle> range2 = range;
            if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), RangesKt___RangesKt.coerceIn(range3.getStart(), i, i2) - i, RangesKt___RangesKt.coerceIn(range3.getEnd(), i, i2) - i));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        if (i == i2 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i3);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), RangesKt___RangesKt.coerceIn(range3.getStart(), i, i2) - i, RangesKt___RangesKt.coerceIn(range3.getEnd(), i, i2) - i));
        }
        return arrayList2;
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || contains(i, i2, i3, i4) || contains(i3, i4, i, i2);
    }

    @NotNull
    public static final <T> List<T> mapEachParagraphStyle(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle defaultParagraphStyle, @NotNull Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> block) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        Intrinsics.checkNotNullParameter(block, "block");
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, defaultParagraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i);
            arrayList.add(block.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    @NotNull
    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle defaultParagraphStyle) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i);
            ParagraphStyle paragraphStyleComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            if (start != i2) {
                arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, i2, start));
            }
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle.merge(paragraphStyleComponent1), start, end));
            i++;
            i2 = end;
        }
        if (i2 != length) {
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        String strSubstring;
        if (i != i2) {
            strSubstring = annotatedString.getText().substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new AnnotatedString(strSubstring, getLocalSpanStyles(annotatedString, i, i2), null, null, 12, null);
    }

    @NotNull
    public static final AnnotatedString toLowerCase(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toLowerCase.1
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i, int i2) {
                Intrinsics.checkNotNullParameter(str, "str");
                String strSubstring = str.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toLowerCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString toUpperCase(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toUpperCase.1
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i, int i2) {
                Intrinsics.checkNotNullParameter(str, "str");
                String strSubstring = str.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toUpperCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull String tag, @NotNull String annotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushStringAnnotation = builder.pushStringAnnotation(tag, annotation);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStringAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull SpanStyle style, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushStyle = builder.pushStyle(style);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull TtsAnnotation ttsAnnotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushTtsAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull ParagraphStyle style, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushStyle = builder.pushStyle(style);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull ParagraphStyle paragraphStyle) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        return new AnnotatedString(text, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsJVMKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, text.length())));
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull UrlAnnotation urlAnnotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushUrlAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }
}
