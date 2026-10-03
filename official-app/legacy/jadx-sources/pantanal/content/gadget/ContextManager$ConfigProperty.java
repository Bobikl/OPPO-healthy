package pantanal.content.gadget;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003B\u0000¨\u0006\u0004"}, d2 = {"pantanal/content/gadget/ContextManager$ConfigProperty", "", "Companion", "a", "card-config_release"}, k = 1, mv = {1, 8, 0})
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface ContextManager$ConfigProperty {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int LANGUAGE = 2;
    public static final int UI_MODE = 1;

    /* JADX INFO: renamed from: pantanal.content.gadget.ContextManager$ConfigProperty$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lpantanal/content/gadget/ContextManager$ConfigProperty$a;", "", "", "UI_MODE", "I", "LANGUAGE", "<init>", "()V", "card-config_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final int LANGUAGE = 2;
        public static final int UI_MODE = 1;
        public static final /* synthetic */ Companion a = new Companion();
    }
}
