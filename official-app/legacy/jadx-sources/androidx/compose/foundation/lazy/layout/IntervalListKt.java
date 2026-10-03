package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¨\u0006\u0006"}, d2 = {"binarySearch", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "itemIndex", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n48#2:217\n523#2:218\n523#2:219\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n192#1:217\n197#1:218\n206#1:219\n*E\n"})
public final class IntervalListKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalFoundationApi
    public static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> mutableVector, int i) {
        int size = mutableVector.getSize() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = ((size - i2) / 2) + i2;
            int startIndex = mutableVector.getContent()[i3].getStartIndex();
            if (startIndex == i) {
                return i3;
            }
            if (startIndex < i) {
                i2 = i3 + 1;
                if (i < mutableVector.getContent()[i2].getStartIndex()) {
                    return i3;
                }
            } else {
                size = i3 - 1;
            }
        }
        return i2;
    }
}
