package pantanal.app.bean;

import com.oplus.aiunit.vision.op5;
import com.oplus.aiunit.vision.y6e;
import com.oplus.channel.client.ClientProxy;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;
import pantanal.annotaions.EntranceType;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0003J\b\u0010\u0016\u001a\u00020\u0006H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006+"}, d2 = {"Lpantanal/app/bean/Entrance;", "", "entranceType", "", "host", "providerAuthority", "", "clientName", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "getClientName", "()Ljava/lang/String;", "getEntranceType", "()I", "getHost", "getProviderAuthority", "getEntranceName", "getShortName", "isAODorHeadset", "", "isWatch", "shouldShowInEntrance", JsonToSeedlingCardOptionsConvertor.KEY_GRADE, "toString", LanConstants.OPERATOR_UNKNOWN, "ASSISTANT", "LAUNCHER", "LOCK_SCREEN", "CAPSULE", "STATUS_BAR", "NOTIFICATION", "AOD", "HEADSET", "SECONDARY_LOCKSCREEN", "SECONDARY_NOTIFICATION", "CAR_LAUNCHER", "WATCH", "CALENDAR", "SPEECH_ASSITANT", "FULL_SEARCH", "PERSISTENT_CONTAINER", "UMS_AI_FLOW", "SEEDLING_HOST_APP", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum Entrance {
    UNKNOWN(-1, -1, "", ""),
    ASSISTANT(1, 0, Constants.PROVIDER_AUTHORITY_ASSISTANT_SCREEN, ClientProxy.CLIENT_NAME_ASSISTANT),
    LAUNCHER(2, 1, Constants.PROVIDER_AUTHORITY_LAUNCHER, ClientProxy.CLIENT_NAME_LAUNCHER),
    LOCK_SCREEN(64, 5, Constants.PROVIDER_AUTHORITY_SYSTEM_UI, "seedling_client_lockscreen"),
    CAPSULE(32, 6, "", "seedling_client_capsule"),
    STATUS_BAR(8, 20, Constants.PROVIDER_AUTHORITY_SYSTEM_UI, "seedling_client_statusbar"),
    NOTIFICATION(16, 30, Constants.PROVIDER_AUTHORITY_SYSTEM_UI, "seedling_client_notification"),
    AOD(4, 40, Constants.PROVIDER_AUTHORITY_SYSTEM_UI, "seedling_client_aod"),
    HEADSET(128, 50, "com.oplus.card.server.headset.provider", "seedling_client_headset"),
    SECONDARY_LOCKSCREEN(256, 60, Constants.PROVIDER_AUTHORITY_SECONDARY_HOME, "seedling_client_secondary_lockscreen"),
    SECONDARY_NOTIFICATION(512, 70, Constants.PROVIDER_AUTHORITY_SECONDARY_HOME, "seedling_client_secondary_notification"),
    CAR_LAUNCHER(4096, 80, "com.oplus.card.server.carlauncher.provider", "seedling_client_car_launcher"),
    WATCH(2048, 90, y6e.PROVIDER_HEALTH, "seedling_client_health"),
    CALENDAR(8192, 110, "com.oplus.card.server.calendar.provider", "seedling_client_calendar"),
    SPEECH_ASSITANT(16384, 120, "com.oplus.card.server.speech.assistant.provider", "seedling_client_speech_assistant"),
    FULL_SEARCH(32768, 130, Constants.PROVIDER_AUTHORITY_FULL_SEARCH, "seedling_client_full_search"),
    PERSISTENT_CONTAINER(131072, 4, Constants.PROVIDER_AUTHORITY_ASSISTANT_SCREEN, ClientProxy.CLIENT_NAME_ASSISTANT),
    UMS_AI_FLOW(65536, 140, "com.oplus.card.ums.server.aiflow.provider", "seedling_client_ums_ai_flow"),
    SEEDLING_HOST_APP(1073741824, 100, "com.oplus.card.server.hostapp.provider", "seedling_client_host_app");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "Entrance";

    @NotNull
    private final String clientName;
    private final int entranceType;
    private final int host;

    @NotNull
    private final String providerAuthority;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpantanal/app/bean/Entrance$Companion;", "", "()V", "TAG", "", "findByType", "Lpantanal/app/bean/Entrance;", "type", "", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEntrance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Entrance.kt\npantanal/app/bean/Entrance$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n1#2:312\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final Entrance findByType(int type) {
            for (Entrance entrance : Entrance.values()) {
                if (entrance.getEntranceType() == type) {
                    if (entrance == null) {
                        return Entrance.UNKNOWN;
                    }
                    return entrance;
                }
            }
            entrance = null;
            if (entrance == null) {
                return Entrance.UNKNOWN;
            }
            return entrance;
        }
    }

    Entrance(int i, int i2, String str, String str2) {
        this.entranceType = i;
        this.host = i2;
        this.providerAuthority = str;
        this.clientName = str2;
    }

    @NotNull
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    public final String getEntranceName() {
        String str = EntranceType.INSTANCE.getDES_SUPPORT_ENTRANCE_MAP().get(Integer.valueOf(this.entranceType));
        return str == null ? "unknown" : str;
    }

    public final int getEntranceType() {
        return this.entranceType;
    }

    public final int getHost() {
        return this.host;
    }

    @NotNull
    public final String getProviderAuthority() {
        return this.providerAuthority;
    }

    @NotNull
    public final String getShortName() {
        int i = this.entranceType;
        if (i == 1) {
            return "AST";
        }
        if (i == 2) {
            return "Lnch";
        }
        switch (i) {
            case 4:
            case 8:
            case 16:
                return "SysUi";
            case 64:
                return "Lock";
            case 128:
                return "HeadSet";
            case 256:
            case 512:
                return "SecLnch";
            case 2048:
                return op5.WATCH;
            case 4096:
                return "Car";
            case 8192:
                return "Calendar";
            case 16384:
                return "SpeechAst";
            case 32768:
                return "FullSearch";
            case 65536:
                return "UMS_AF";
            case 131072:
                return "PersistentContainer";
            case 1073741824:
                return "HostApp";
            default:
                return "unknown";
        }
    }

    public final boolean isAODorHeadset() {
        int i = this.entranceType;
        return i == 4 || i == 128;
    }

    public final boolean isWatch() {
        return this.entranceType == 2048;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    public final boolean shouldShowInEntrance(int importance) {
        int i = this.entranceType;
        if (i != 1 && i != 2) {
            switch (i) {
                case 4:
                case 16:
                case 256:
                case 512:
                    if (importance < 3) {
                        return false;
                    }
                    break;
                case 8:
                    if (importance < 4) {
                        return false;
                    }
                    break;
                case 128:
                    if (importance < 5) {
                        return false;
                    }
                    break;
                case 2048:
                case 4096:
                case 8192:
                case 16384:
                case 32768:
                case 65536:
                case 131072:
                case 1073741824:
                    if (importance < 1) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        } else if (importance < 1) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return "[" + getEntranceName() + ",type=" + this.entranceType + ",hostId=" + this.host + "]";
    }
}
