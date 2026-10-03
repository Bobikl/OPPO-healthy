package pantanal.app.groupcard.stack;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lpantanal/app/groupcard/stack/StackConstants;", "", "()V", "CardState", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StackConstants {

    @NotNull
    public static final StackConstants INSTANCE = new StackConstants();

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lpantanal/app/groupcard/stack/StackConstants$CardState;", "", "Companion", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface CardState {
        public static final int ABLE_TO_CLOSE = 2;
        public static final int ABLE_TO_EDIT = 1;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int UNABLE_TO_EDIT = 0;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpantanal/app/groupcard/stack/StackConstants$CardState$Companion;", "", "()V", "ABLE_TO_CLOSE", "", "ABLE_TO_EDIT", "UNABLE_TO_EDIT", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ABLE_TO_CLOSE = 2;
            public static final int ABLE_TO_EDIT = 1;
            public static final int UNABLE_TO_EDIT = 0;

            private Companion() {
            }
        }
    }

    private StackConstants() {
    }
}
