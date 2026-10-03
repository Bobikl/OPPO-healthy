package pantanal.annotaions;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.collections.MapsKt__MapsKt;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lpantanal/annotaions/ServiceCategory;", "", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface ServiceCategory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int NON_SYSTEM_SERVICE = 1;
    public static final int SYSTEM_SERVICE = 2;

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpantanal/annotaions/ServiceCategory$Companion;", "", "()V", "DES_SERVICE_CATEGORY", "", "", "", "getDES_SERVICE_CATEGORY", "()Ljava/util/Map;", "NON_SYSTEM_SERVICE", "SYSTEM_SERVICE", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Map<Integer, String> DES_SERVICE_CATEGORY = MapsKt__MapsKt.mapOf(TuplesKt.to(1, "non_system_service"), TuplesKt.to(2, "system_service"));
        public static final int NON_SYSTEM_SERVICE = 1;
        public static final int SYSTEM_SERVICE = 2;

        private Companion() {
        }

        @NotNull
        public final Map<Integer, String> getDES_SERVICE_CATEGORY() {
            return DES_SERVICE_CATEGORY;
        }
    }
}
