package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3774updateRangeAfterDeletepWDy79M(long j2, long j3) {
        int iM3639getLengthimpl;
        int iM3641getMinimpl = TextRange.m3641getMinimpl(j2);
        int iM3640getMaximpl = TextRange.m3640getMaximpl(j2);
        if (TextRange.m3645intersects5zctL8(j3, j2)) {
            if (TextRange.m3633contains5zctL8(j3, j2)) {
                iM3641getMinimpl = TextRange.m3641getMinimpl(j3);
                iM3640getMaximpl = iM3641getMinimpl;
            } else {
                if (TextRange.m3633contains5zctL8(j2, j3)) {
                    iM3639getLengthimpl = TextRange.m3639getLengthimpl(j3);
                } else if (TextRange.m3634containsimpl(j3, iM3641getMinimpl)) {
                    iM3641getMinimpl = TextRange.m3641getMinimpl(j3);
                    iM3639getLengthimpl = TextRange.m3639getLengthimpl(j3);
                } else {
                    iM3640getMaximpl = TextRange.m3641getMinimpl(j3);
                }
                iM3640getMaximpl -= iM3639getLengthimpl;
            }
        } else if (iM3640getMaximpl > TextRange.m3641getMinimpl(j3)) {
            iM3641getMinimpl -= TextRange.m3639getLengthimpl(j3);
            iM3639getLengthimpl = TextRange.m3639getLengthimpl(j3);
            iM3640getMaximpl -= iM3639getLengthimpl;
        }
        return TextRangeKt.TextRange(iM3641getMinimpl, iM3640getMaximpl);
    }
}
