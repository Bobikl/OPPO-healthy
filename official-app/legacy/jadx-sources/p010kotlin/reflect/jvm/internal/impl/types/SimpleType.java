package p010kotlin.reflect.jvm.internal.impl.types;

import com.heytap.log.config.LogMemoryConfig;
import java.io.IOException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p010kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import p010kotlin.text.StringsKt__StringBuilderKt;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public abstract SimpleType makeNullableAsSpecified(boolean z);

    @Override // p010kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public abstract SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes);

    @NotNull
    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            StringsKt__StringBuilderKt.append(sb, "[", DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, it.next(), null, 2, null), "] ");
        }
        sb.append(getConstructor());
        if (!getArguments().isEmpty()) {
            CollectionsKt___CollectionsKt.joinTo(getArguments(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? LogMemoryConfig.LOG_ELLIPSIS : null, (124 & 64) != 0 ? null : null);
        }
        if (isMarkedNullable()) {
            sb.append("?");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
