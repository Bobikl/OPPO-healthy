package pantanal.annotaions;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.oplus.seedling.sdk.utils.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lpantanal/annotaions/EntranceType;", "", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"WrongConstant"})
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface EntranceType {
    public static final int ALL = 0;
    public static final int AOD = 4;
    public static final int ASSISTANT = 1;
    public static final int CALENDAR = 8192;
    public static final int CAPSULE = 32;
    public static final int CAR_LAUNCHER = 4096;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FULL_SEARCH = 32768;
    public static final int HEADSET = 128;
    public static final int LAUNCHER = 2;
    public static final int LOCK_SCREEN = 64;
    public static final int NOTIFICATION = 16;
    public static final int PERSISTENT_CONTAINER = 131072;
    public static final int SECONDARY_LOCKSCREEN = 256;
    public static final int SECONDARY_NOTIFICATION = 512;
    public static final int SECONDARY_SECONDARY_LAUNCHER = 1024;
    public static final int SEEDING_HOST_APP = 1073741824;
    public static final int SPEECH_ASSISTANT = 16384;
    public static final int STATUS_BAR = 8;

    @NotNull
    public static final String TAG = "EntranceType";
    public static final int UMS_AI_FLOW = 65536;
    public static final int UNDEFINED = -1;
    public static final int WATCH = 2048;

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lpantanal/annotaions/EntranceType$Companion;", "", "()V", "ALL", "", "AOD", "ASSISTANT", "BASE_ENTRY_ONE", "CALENDAR", "CAPSULE", "CAR_LAUNCHER", "DES_SUPPORT_ENTRANCE_MAP", "", "", "getDES_SUPPORT_ENTRANCE_MAP", "()Ljava/util/Map;", "FULL_SEARCH", "HEADSET", "LAUNCHER", "LOCK_SCREEN", "NOTIFICATION", "PERSISTENT_CONTAINER", "SECONDARY_LOCKSCREEN", "SECONDARY_NOTIFICATION", "SECONDARY_SECONDARY_LAUNCHER", "SEEDING_HOST_APP", "SPEECH_ASSISTANT", "STATUS_BAR", "TAG", "UMS_AI_FLOW", "UNDEFINED", "VALID_ENTRANCE", "", "getVALID_ENTRANCE", "()[I", "WATCH", "isValid", "", "entranceType", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ALL = 0;
        public static final int AOD = 4;
        public static final int ASSISTANT = 1;
        private static final int BASE_ENTRY_ONE = 1;
        public static final int CALENDAR = 8192;
        public static final int CAPSULE = 32;
        public static final int CAR_LAUNCHER = 4096;

        @NotNull
        private static final Map<Integer, String> DES_SUPPORT_ENTRANCE_MAP;
        public static final int FULL_SEARCH = 32768;
        public static final int HEADSET = 128;
        public static final int LAUNCHER = 2;
        public static final int LOCK_SCREEN = 64;
        public static final int NOTIFICATION = 16;
        public static final int PERSISTENT_CONTAINER = 131072;
        public static final int SECONDARY_LOCKSCREEN = 256;
        public static final int SECONDARY_NOTIFICATION = 512;
        public static final int SECONDARY_SECONDARY_LAUNCHER = 1024;
        public static final int SEEDING_HOST_APP = 1073741824;
        public static final int SPEECH_ASSISTANT = 16384;
        public static final int STATUS_BAR = 8;

        @NotNull
        public static final String TAG = "EntranceType";
        public static final int UMS_AI_FLOW = 65536;
        public static final int UNDEFINED = -1;

        @NotNull
        private static final int[] VALID_ENTRANCE;
        public static final int WATCH = 2048;

        static {
            Constants.EntranceType.Companion companion = Constants.EntranceType.INSTANCE;
            VALID_ENTRANCE = companion.getVALID_ENTRANCE();
            DES_SUPPORT_ENTRANCE_MAP = companion.getDES_SUPPORT_ENTRANCE_MAP();
        }

        private Companion() {
        }

        @NotNull
        public final Map<Integer, String> getDES_SUPPORT_ENTRANCE_MAP() {
            return DES_SUPPORT_ENTRANCE_MAP;
        }

        @NotNull
        public final int[] getVALID_ENTRANCE() {
            return VALID_ENTRANCE;
        }

        public final boolean isValid(int entranceType) {
            return ArraysKt___ArraysKt.contains(VALID_ENTRANCE, entranceType);
        }
    }
}
