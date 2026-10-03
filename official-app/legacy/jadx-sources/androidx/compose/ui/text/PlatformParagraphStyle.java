package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.op5;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001e\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007B\u0014\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\bB\u0007\b\u0016¢\u0006\u0002\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", ParserTag.INCLUDE_FONT_PADDING, "", "(Z)V", "emojiSupportMatch", "Landroidx/compose/ui/text/EmojiSupportMatch;", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "()V", "getEmojiSupportMatch-_3YsG6Y", "()I", "I", "getIncludeFontPadding$annotations", "getIncludeFontPadding", "()Z", "equals", "other", "hashCode", "", op5.MERGER, "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlatformParagraphStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @Deprecated(message = "Sets includeFontPadding parameter for transitioning. Will be removed.")
    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) other;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m3524equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    /* JADX INFO: renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name and from getter */
    public final int getEmojiSupportMatch() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + EmojiSupportMatch.m3525hashCodeimpl(this.emojiSupportMatch);
    }

    @NotNull
    public final PlatformParagraphStyle merge(@Nullable PlatformParagraphStyle other) {
        return other == null ? this : other;
    }

    @NotNull
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m3526toStringimpl(this.emojiSupportMatch)) + ')';
    }

    @Deprecated(message = "Provides configuration options for behavior compatibility.")
    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    @Deprecated(message = "Provides configuration options for behavior compatibility.")
    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = EmojiSupportMatch.INSTANCE.m3528getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EmojiSupportMatch.INSTANCE.m3528getDefault_3YsG6Y() : i, (i2 & 2) != 0 ? true : z, (DefaultConstructorMarker) null);
    }

    private PlatformParagraphStyle(int i, boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = i;
    }

    private PlatformParagraphStyle(int i) {
        this.includeFontPadding = true;
        this.emojiSupportMatch = i;
    }

    public /* synthetic */ PlatformParagraphStyle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EmojiSupportMatch.INSTANCE.m3528getDefault_3YsG6Y() : i, (DefaultConstructorMarker) null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.INSTANCE.m3528getDefault_3YsG6Y(), true, (DefaultConstructorMarker) null);
    }
}
