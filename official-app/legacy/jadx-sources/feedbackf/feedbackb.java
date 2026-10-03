package feedbackf;

import java.util.Arrays;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class feedbackb extends Lambda implements Function1<Byte, CharSequence> {
    public static final feedbackb feedbacka = new feedbackb();

    public feedbackb() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final CharSequence invoke(Byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b.byteValue())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return str;
    }
}
