package p010kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* JADX INFO: loaded from: classes11.dex */
public enum AnnotationUseSiteTarget {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER(ParserTag.TAG_GET),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER(RnConstant.KEY_INIT_OPTIONS),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    @NotNull
    private final String renderName;

    AnnotationUseSiteTarget(String str) {
        this.renderName = str == null ? CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(name()) : str;
    }

    @NotNull
    public final String getRenderName() {
        return this.renderName;
    }

    /* synthetic */ AnnotationUseSiteTarget(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
