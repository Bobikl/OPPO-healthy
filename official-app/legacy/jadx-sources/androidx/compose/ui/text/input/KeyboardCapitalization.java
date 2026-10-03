package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class KeyboardCapitalization {
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m3806constructorimpl(0);
    private static final int Characters = m3806constructorimpl(1);
    private static final int Words = m3806constructorimpl(2);
    private static final int Sentences = m3806constructorimpl(3);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;", "", "()V", "Characters", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCharacters-IUNYP9k$annotations", "getCharacters-IUNYP9k", "()I", "I", "None", "getNone-IUNYP9k$annotations", "getNone-IUNYP9k", "Sentences", "getSentences-IUNYP9k$annotations", "getSentences-IUNYP9k", "Words", "getWords-IUNYP9k$annotations", "getWords-IUNYP9k", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3812getCharactersIUNYP9k$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3813getNoneIUNYP9k$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3814getSentencesIUNYP9k$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m3815getWordsIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m3816getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* JADX INFO: renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m3817getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* JADX INFO: renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m3818getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* JADX INFO: renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m3819getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }
    }

    private /* synthetic */ KeyboardCapitalization(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m3805boximpl(int i) {
        return new KeyboardCapitalization(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3806constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3807equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i == ((KeyboardCapitalization) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3808equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3809hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3810toStringimpl(int i) {
        if (m3808equalsimpl0(i, None)) {
            return "None";
        }
        if (m3808equalsimpl0(i, Characters)) {
            return "Characters";
        }
        if (m3808equalsimpl0(i, Words)) {
            return "Words";
        }
        return m3808equalsimpl0(i, Sentences) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3807equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3809hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m3810toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
