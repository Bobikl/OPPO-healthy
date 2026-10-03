package androidx.compose.ui.input.key;

import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0006\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"nativeKeyCode", "", "Landroidx/compose/ui/input/key/Key;", "getNativeKeyCode-YVgTNJs", "(J)I", "Key", "(I)J", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKey.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Key.android.kt\nandroidx/compose/ui/input/key/Key_androidKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1710:1\n55#2:1711\n48#2:1712\n*S KotlinDebug\n*F\n+ 1 Key.android.kt\nandroidx/compose/ui/input/key/Key_androidKt\n*L\n1707#1:1711\n1709#1:1712\n*E\n"})
public final class Key_androidKt {
    public static final long Key(int i) {
        return Key.m2284constructorimpl((((long) i) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: renamed from: getNativeKeyCode-YVgTNJs, reason: not valid java name */
    public static final int m2890getNativeKeyCodeYVgTNJs(long j2) {
        return (int) (j2 >> 32);
    }
}
