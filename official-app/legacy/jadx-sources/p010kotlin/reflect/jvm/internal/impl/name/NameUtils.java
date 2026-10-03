package p010kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes11.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    @NotNull
    private static final Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new Regex("[^\\p{L}\\p{Digit}]");

    private NameUtils() {
    }

    @JvmStatic
    @NotNull
    public static final Name contextReceiverName(int i) {
        Name nameIdentifier = Name.identifier("_context_receiver_" + i);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(\"_context_receiver_$index\")");
        return nameIdentifier;
    }

    @JvmStatic
    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.replace(name, "_");
    }
}
