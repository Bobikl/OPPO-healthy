package pantanal.app.bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes11.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lpantanal/app/bean/DISPLAYAREA;", "", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface DISPLAYAREA {
    public static final int AOD = 4;
    public static final int ASSISTANT = 1;
    public static final int ASSISTANT_LAUNCHER = 0;
    public static final int CAPSULE = 32;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DRAGONFLY_SECONDARY_HOME_ONLY = 128;
    public static final int ILLEGAL = -1;
    public static final int LAUNCHER = 2;
    public static final int LOCK_SCREEN = 64;
    public static final int NOTIFICATION = 16;
    public static final int STATUS_BAR = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpantanal/app/bean/DISPLAYAREA$Companion;", "", "()V", "AOD", "", "ASSISTANT", "ASSISTANT_LAUNCHER", "CAPSULE", "DRAGONFLY_SECONDARY_HOME_ONLY", "ILLEGAL", "LAUNCHER", "LOCK_SCREEN", "NOTIFICATION", "STATUS_BAR", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int AOD = 4;
        public static final int ASSISTANT = 1;
        public static final int ASSISTANT_LAUNCHER = 0;
        public static final int CAPSULE = 32;
        public static final int DRAGONFLY_SECONDARY_HOME_ONLY = 128;
        public static final int ILLEGAL = -1;
        public static final int LAUNCHER = 2;
        public static final int LOCK_SCREEN = 64;
        public static final int NOTIFICATION = 16;
        public static final int STATUS_BAR = 8;

        private Companion() {
        }
    }
}
