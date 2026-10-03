package androidx.compose.ui.text;

import com.oplus.smartenginehelper.entity.TextEntity;
import java.util.ArrayList;
import java.util.List;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"getLocalPlaceholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "start", "", TextEntity.ELLIPSIZE_END, "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n35#2,3:153\n38#2,2:160\n40#2:163\n33#3,4:156\n38#3:162\n151#3,5:164\n38#3:169\n156#3:170\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n141#1:153,3\n141#1:160,2\n141#1:163\n141#1:156,4\n141#1:162\n141#1:164,5\n141#1:169\n141#1:170\n*E\n"})
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<Placeholder> range = list.get(i3);
            AnnotatedString.Range<Placeholder> range2 = range;
            if (AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            if (!(i <= range3.getStart() && range3.getEnd() <= i2)) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), range3.getStart() - i, range3.getEnd() - i));
        }
        return arrayList2;
    }
}
