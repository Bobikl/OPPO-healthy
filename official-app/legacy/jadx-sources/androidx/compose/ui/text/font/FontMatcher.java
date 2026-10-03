package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000fJ7\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0011JF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0080\b¢\u0006\u0002\b\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "fontList", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "filterByClosestWeight", "preferBelow", "", "minSearchRange", "maxSearchRange", "filterByClosestWeight$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n102#1,34:189\n102#1,34:234\n108#1,28:279\n108#1,28:318\n35#2,3:166\n38#2,2:173\n40#2:176\n35#2,3:177\n38#2,2:184\n40#2:187\n35#2,3:223\n38#2,2:230\n40#2:233\n35#2,3:268\n38#2,2:275\n40#2:278\n35#2,3:307\n38#2,2:314\n40#2:317\n35#2,3:346\n38#2,2:353\n40#2:356\n35#2,3:357\n38#2,2:364\n40#2:367\n35#2,3:368\n38#2,2:375\n40#2:378\n33#3,4:169\n38#3:175\n33#3,4:180\n38#3:186\n33#3,4:226\n38#3:232\n33#3,4:271\n38#3:277\n33#3,4:310\n38#3:316\n33#3,4:349\n38#3:355\n33#3,4:360\n38#3:366\n33#3,4:371\n38#3:377\n1#4:188\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:189,34\n71#1:234,34\n80#1:279,28\n87#1:318,28\n49#1:166,3\n49#1:173,2\n49#1:176\n57#1:177,3\n57#1:184,2\n57#1:187\n65#1:223,3\n65#1:230,2\n65#1:233\n71#1:268,3\n71#1:275,2\n71#1:278\n80#1:307,3\n80#1:314,2\n80#1:317\n87#1:346,3\n87#1:353,2\n87#1:356\n135#1:357,3\n135#1:364,2\n135#1:367\n135#1:368,3\n135#1:375,2\n135#1:378\n49#1:169,4\n49#1:175\n57#1:180,4\n57#1:186\n65#1:226,4\n65#1:232\n71#1:271,4\n71#1:277\n80#1:310,4\n80#1:316\n87#1:349,4\n87#1:355\n135#1:360,4\n135#1:366\n135#1:371,4\n135#1:377\n*E\n"})
public final class FontMatcher {
    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z, FontWeight fontWeight2, FontWeight fontWeight3, int i, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i & 8) != 0) {
            fontWeight3 = null;
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        FontWeight fontWeight5 = null;
        for (int i2 = 0; i2 < size; i2++) {
            FontWeight weight = ((Font) list.get(i2)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = list.get(i3);
            if (Intrinsics.areEqual(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<Font> filterByClosestWeight$ui_text_release(@NotNull List<? extends Font> list, @NotNull FontWeight fontWeight, boolean z, @Nullable FontWeight fontWeight2, @Nullable FontWeight fontWeight3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        for (int i = 0; i < size; i++) {
            FontWeight weight = list.get(i).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Font font = list.get(i2);
            if (Intrinsics.areEqual(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m3721matchFontRetOiIg(@NotNull FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (fontFamily instanceof FontListFontFamily) {
            return m3722matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, fontStyle);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @NotNull
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m3722matchFontRetOiIg(@NotNull FontListFontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m3723matchFontRetOiIg(fontFamily.getFonts(), fontWeight, fontStyle);
    }

    @NotNull
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m3723matchFontRetOiIg(@NotNull List<? extends Font> fontList, @NotNull FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size = fontList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Font font = fontList.get(i2);
            Font font2 = font;
            if (Intrinsics.areEqual(font2.getWeight(), fontWeight) && FontStyle.m3727equalsimpl0(font2.getStyle(), fontStyle)) {
                arrayList2.add(font);
            }
            i2++;
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Font font3 = fontList.get(i3);
            if (FontStyle.m3727equalsimpl0(font3.getStyle(), fontStyle)) {
                arrayList3.add(font3);
            }
        }
        if (!arrayList3.isEmpty()) {
            fontList = arrayList3;
        }
        List<? extends Font> list = fontList;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            int size3 = list.size();
            FontWeight fontWeight3 = null;
            for (int i4 = 0; i4 < size3; i4++) {
                FontWeight weight = list.get(i4).getWeight();
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight3 = weight;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                }
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i < size4) {
                Font font4 = list.get(i);
                if (Intrinsics.areEqual(font4.getWeight(), fontWeight3)) {
                    arrayList.add(font4);
                }
                i++;
            }
        } else if (fontWeight.compareTo(companion.getW500()) > 0) {
            int size5 = list.size();
            FontWeight fontWeight4 = null;
            for (int i5 = 0; i5 < size5; i5++) {
                FontWeight weight2 = list.get(i5).getWeight();
                if (weight2.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight2;
                    }
                } else {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                }
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            arrayList = new ArrayList(list.size());
            int size6 = list.size();
            while (i < size6) {
                Font font5 = list.get(i);
                if (Intrinsics.areEqual(font5.getWeight(), fontWeight4)) {
                    arrayList.add(font5);
                }
                i++;
            }
        } else {
            FontWeight w500 = companion.getW500();
            int size7 = list.size();
            FontWeight fontWeight5 = null;
            FontWeight fontWeight6 = null;
            for (int i6 = 0; i6 < size7; i6++) {
                FontWeight weight3 = list.get(i6).getWeight();
                if (w500 == null || weight3.compareTo(w500) <= 0) {
                    if (weight3.compareTo(fontWeight) < 0) {
                        if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                            fontWeight5 = weight3;
                        }
                    } else {
                        if (weight3.compareTo(fontWeight) <= 0) {
                            fontWeight5 = weight3;
                            fontWeight6 = fontWeight5;
                            break;
                        }
                        if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                            fontWeight6 = weight3;
                        }
                    }
                }
            }
            if (fontWeight6 != null) {
                fontWeight5 = fontWeight6;
            }
            arrayList = new ArrayList(list.size());
            int size8 = list.size();
            for (int i7 = 0; i7 < size8; i7++) {
                Font font6 = list.get(i7);
                if (Intrinsics.areEqual(font6.getWeight(), fontWeight5)) {
                    arrayList.add(font6);
                }
            }
            if (arrayList.isEmpty()) {
                FontWeight w501 = FontWeight.INSTANCE.getW500();
                int size9 = list.size();
                FontWeight fontWeight7 = null;
                for (int i8 = 0; i8 < size9; i8++) {
                    FontWeight weight4 = list.get(i8).getWeight();
                    if (w501 == null || weight4.compareTo(w501) >= 0) {
                        if (weight4.compareTo(fontWeight) < 0) {
                            if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                                fontWeight2 = weight4;
                            }
                        } else {
                            if (weight4.compareTo(fontWeight) <= 0) {
                                fontWeight2 = weight4;
                                fontWeight7 = fontWeight2;
                                break;
                            }
                            if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                                fontWeight7 = weight4;
                            }
                        }
                    }
                }
                if (fontWeight7 != null) {
                    fontWeight2 = fontWeight7;
                }
                arrayList = new ArrayList(list.size());
                int size10 = list.size();
                while (i < size10) {
                    Font font7 = list.get(i);
                    if (Intrinsics.areEqual(font7.getWeight(), fontWeight2)) {
                        arrayList.add(font7);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }
}
