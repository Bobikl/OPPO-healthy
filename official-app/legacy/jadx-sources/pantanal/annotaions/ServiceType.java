package pantanal.annotaions;

import androidx.annotation.Keep;
import com.oplus.instant.router.Instant;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lpantanal/annotaions/ServiceType;", "", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface ServiceType {
    public static final int APP = 2;
    public static final int CONTENT_OPERATION = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int INSTANT = 1;
    public static final int OPERATION_WIDGET = 5;
    public static final int SEEDLING = 100;
    public static final int SERVICE = 4;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpantanal/annotaions/ServiceType$Companion;", "", "()V", "APP", "", "CONTENT_OPERATION", "DES_SERVICE_TYPE", "", "", "getDES_SERVICE_TYPE", "()Ljava/util/Map;", "INSTANT", "OPERATION_WIDGET", "SEEDLING", "SERVICE", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final int APP = 2;
        public static final int CONTENT_OPERATION = 3;
        public static final int INSTANT = 1;
        public static final int OPERATION_WIDGET = 5;
        public static final int SEEDLING = 100;
        public static final int SERVICE = 4;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Map<Integer, String> DES_SERVICE_TYPE = MapsKt__MapsKt.mapOf(TuplesKt.to(1, Instant.HOST_INSTANT), TuplesKt.to(2, "assistant"), TuplesKt.to(3, "content_operation"), TuplesKt.to(4, "service"), TuplesKt.to(5, "widget"), TuplesKt.to(100, "seedling"));

        private Companion() {
        }

        @NotNull
        public final Map<Integer, String> getDES_SERVICE_TYPE() {
            return DES_SERVICE_TYPE;
        }
    }
}
