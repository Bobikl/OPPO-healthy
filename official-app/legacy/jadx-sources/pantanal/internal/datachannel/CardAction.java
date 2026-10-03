package pantanal.internal.datachannel;

import androidx.annotation.Keep;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.o1e;
import io.protostuff.MapSchema;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B9\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0017\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J?\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006!"}, d2 = {"Lpantanal/internal/datachannel/CardAction;", "", "", "component1", "Ljava/util/concurrent/ConcurrentHashMap;", "", "component2", "", "component3", "component4", "action", RnConstant.KEY_INIT_OPTIONS, "shouldForceFetch", "shouldNotify", "copy", "toString", "hashCode", "other", "equals", "I", "getAction", "()I", "Ljava/util/concurrent/ConcurrentHashMap;", "getParam", "()Ljava/util/concurrent/ConcurrentHashMap;", "Z", "getShouldForceFetch", "()Z", "getShouldNotify", "<init>", "(ILjava/util/concurrent/ConcurrentHashMap;ZZ)V", "Companion", "a", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardAction {

    @NotNull
    private static final CardAction ACTION_CREATE_FORCE_UPDATE;

    @NotNull
    private static final CardAction ACTION_DESTROY;

    @NotNull
    public static final String ACTION_EXTRA_KEY = "extra_key";

    @NotNull
    private static final CardAction ACTION_HIDE;

    @NotNull
    private static final CardAction ACTION_HOST_CHANGE;

    @NotNull
    private static final CardAction ACTION_PAUSE;

    @NotNull
    private static final CardAction ACTION_RENDER_FAIL;

    @NotNull
    private static final CardAction ACTION_RESUME_FORCE_UPDATE;

    @NotNull
    private static final CardAction ACTION_SHOW;

    @NotNull
    private static final CardAction ACTION_SIZE_CHANGE;

    @NotNull
    private static final CardAction ACTION_UNSUBSCRIBED;

    @NotNull
    private static final CardAction ACTION_UPDATE_DATA;

    @NotNull
    public static final String CONFIGURATION_LIST_KEY = "configuration_list_key";

    @NotNull
    public static final String CONFIGURATION_OBSERVER_ID = "configuration_observer_id";

    @NotNull
    public static final String EXTRA_FORCE_UPDATE = "force_update";

    @NotNull
    public static final String LIFE_CIRCLE_KEY = "life_circle";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_CREATE = "create";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_DESTROY = "destroy";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_HIDE = "hide";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_HOST_CHANGE = "host_change";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_PAUSE = "pause";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_RENDER_FAIL = "render_fail";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_RESUME = "resume";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_SHOW = "show";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_SIZE_CHANGE = "size_change";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_SUBSCRIBED = "subscribed";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_UNSUBSCRIBED = "unsubscribed";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_UPDATE_DATA = "update_data";

    @NotNull
    public static final String PUBLISH_CONFIGURATION_LIST = "publish_configuration_list";
    private final int action;

    @Nullable
    private final ConcurrentHashMap<String, String> param;
    private final boolean shouldForceFetch;
    private final boolean shouldNotify;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CardAction ACTION_CREATE = new CardAction(2, o1e.a(TuplesKt.to("life_circle", "create")), false, false);

    @NotNull
    private static final CardAction ACTION_RESUME = new CardAction(2, o1e.a(TuplesKt.to("life_circle", "resume")), false, false, 12, null);

    @NotNull
    private static final CardAction ACTION_SUBSCRIBED = new CardAction(2, o1e.a(TuplesKt.to("life_circle", "subscribed")), false, false);

    /* JADX INFO: renamed from: pantanal.internal.datachannel.CardAction$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0014\u0010\"\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010)\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010#R\u0014\u0010+\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010,\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010#R\u0014\u0010-\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010#R\u0014\u0010.\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010#R\u0014\u0010/\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010#R\u0014\u00100\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010#R\u0014\u00101\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010#R\u0014\u00102\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010#R\u0014\u00103\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010#R\u0014\u00104\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010#¨\u00067"}, d2 = {"Lpantanal/internal/datachannel/CardAction$a;", "", "Lpantanal/internal/datachannel/CardAction;", "ACTION_CREATE_FORCE_UPDATE", "Lpantanal/internal/datachannel/CardAction;", "b", "()Lpantanal/internal/datachannel/CardAction;", "ACTION_CREATE", "a", "ACTION_DESTROY", "c", "ACTION_RESUME", b2n.g, "ACTION_RESUME_FORCE_UPDATE", "i", "ACTION_PAUSE", "f", "ACTION_SUBSCRIBED", LogFieldKey.LEVEL_KEY, "ACTION_UNSUBSCRIBED", LogFieldKey.MESSAGE_KEY, "ACTION_SHOW", "j", "ACTION_HIDE", "d", "ACTION_RENDER_FAIL", b2n.f, "ACTION_UPDATE_DATA", "n", "ACTION_HOST_CHANGE", MapSchema.FIELD_NAME_ENTRY, "ACTION_SIZE_CHANGE", MapSchema.FIELD_NAME_KEY, "", "ACTION_EXTRA_KEY", "Ljava/lang/String;", "CONFIGURATION_LIST_KEY", "CONFIGURATION_OBSERVER_ID", "EXTRA_FORCE_UPDATE", "LIFE_CIRCLE_KEY", "LIFE_CIRCLE_VALUE_CREATE", "LIFE_CIRCLE_VALUE_DESTROY", "LIFE_CIRCLE_VALUE_HIDE", "LIFE_CIRCLE_VALUE_HOST_CHANGE", "LIFE_CIRCLE_VALUE_PAUSE", "LIFE_CIRCLE_VALUE_RENDER_FAIL", "LIFE_CIRCLE_VALUE_RESUME", "LIFE_CIRCLE_VALUE_SHOW", "LIFE_CIRCLE_VALUE_SIZE_CHANGE", "LIFE_CIRCLE_VALUE_SUBSCRIBED", "LIFE_CIRCLE_VALUE_UNSUBSCRIBED", "LIFE_CIRCLE_VALUE_UPDATE_DATA", "PUBLISH_CONFIGURATION_LIST", "<init>", "()V", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CardAction a() {
            return CardAction.ACTION_CREATE;
        }

        @NotNull
        public final CardAction b() {
            return CardAction.ACTION_CREATE_FORCE_UPDATE;
        }

        @NotNull
        public final CardAction c() {
            return CardAction.ACTION_DESTROY;
        }

        @NotNull
        public final CardAction d() {
            return CardAction.ACTION_HIDE;
        }

        @NotNull
        public final CardAction e() {
            return CardAction.ACTION_HOST_CHANGE;
        }

        @NotNull
        public final CardAction f() {
            return CardAction.ACTION_PAUSE;
        }

        @NotNull
        public final CardAction g() {
            return CardAction.ACTION_RENDER_FAIL;
        }

        @NotNull
        public final CardAction h() {
            return CardAction.ACTION_RESUME;
        }

        @NotNull
        public final CardAction i() {
            return CardAction.ACTION_RESUME_FORCE_UPDATE;
        }

        @NotNull
        public final CardAction j() {
            return CardAction.ACTION_SHOW;
        }

        @NotNull
        public final CardAction k() {
            return CardAction.ACTION_SIZE_CHANGE;
        }

        @NotNull
        public final CardAction l() {
            return CardAction.ACTION_SUBSCRIBED;
        }

        @NotNull
        public final CardAction m() {
            return CardAction.ACTION_UNSUBSCRIBED;
        }

        @NotNull
        public final CardAction n() {
            return CardAction.ACTION_UPDATE_DATA;
        }
    }

    static {
        int i = 2;
        ACTION_CREATE_FORCE_UPDATE = new CardAction(i, o1e.a(TuplesKt.to("life_circle", "create"), TuplesKt.to(ACTION_EXTRA_KEY, EXTRA_FORCE_UPDATE)), false, false, 12, null);
        int i2 = 2;
        boolean z = false;
        boolean z2 = false;
        int i3 = 12;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ACTION_DESTROY = new CardAction(i2, o1e.a(TuplesKt.to("life_circle", "destroy")), z, z2, i3, defaultConstructorMarker);
        ACTION_RESUME_FORCE_UPDATE = new CardAction(i2, o1e.a(TuplesKt.to("life_circle", "resume"), TuplesKt.to(ACTION_EXTRA_KEY, EXTRA_FORCE_UPDATE)), z, z2, i3, defaultConstructorMarker);
        int i4 = 2;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 12;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        ACTION_PAUSE = new CardAction(i4, o1e.a(TuplesKt.to("life_circle", "pause")), z3, z4, i5, defaultConstructorMarker2);
        ACTION_UNSUBSCRIBED = new CardAction(i4, o1e.a(TuplesKt.to("life_circle", "unsubscribed")), z3, z4, i5, defaultConstructorMarker2);
        ACTION_SHOW = new CardAction(i2, o1e.a(TuplesKt.to("life_circle", LIFE_CIRCLE_VALUE_SHOW)), z, z2, i3, defaultConstructorMarker);
        boolean z5 = false;
        boolean z6 = false;
        int i6 = 12;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        ACTION_HIDE = new CardAction(i, o1e.a(TuplesKt.to("life_circle", LIFE_CIRCLE_VALUE_HIDE)), z5, z6, i6, defaultConstructorMarker3);
        int i7 = 2;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 12;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        ACTION_RENDER_FAIL = new CardAction(i7, o1e.a(TuplesKt.to("life_circle", LIFE_CIRCLE_VALUE_RENDER_FAIL)), z7, z8, i8, defaultConstructorMarker4);
        ACTION_UPDATE_DATA = new CardAction(i, o1e.a(TuplesKt.to("life_circle", LIFE_CIRCLE_VALUE_UPDATE_DATA)), z5, z6, i6, defaultConstructorMarker3);
        ACTION_HOST_CHANGE = new CardAction(i7, o1e.a(TuplesKt.to("life_circle", LIFE_CIRCLE_VALUE_HOST_CHANGE)), z7, z8, i8, defaultConstructorMarker4);
        ACTION_SIZE_CHANGE = new CardAction(i, o1e.a(TuplesKt.to("life_circle", LIFE_CIRCLE_VALUE_SIZE_CHANGE)), z5, z6, i6, defaultConstructorMarker3);
    }

    public CardAction(int i, @Nullable ConcurrentHashMap<String, String> concurrentHashMap, boolean z, boolean z2) {
        this.action = i;
        this.param = concurrentHashMap;
        this.shouldForceFetch = z;
        this.shouldNotify = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardAction copy$default(CardAction cardAction, int i, ConcurrentHashMap concurrentHashMap, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cardAction.action;
        }
        if ((i2 & 2) != 0) {
            concurrentHashMap = cardAction.param;
        }
        if ((i2 & 4) != 0) {
            z = cardAction.shouldForceFetch;
        }
        if ((i2 & 8) != 0) {
            z2 = cardAction.shouldNotify;
        }
        return cardAction.copy(i, concurrentHashMap, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final ConcurrentHashMap<String, String> component2() {
        return this.param;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShouldForceFetch() {
        return this.shouldForceFetch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShouldNotify() {
        return this.shouldNotify;
    }

    @NotNull
    public final CardAction copy(int action, @Nullable ConcurrentHashMap<String, String> param, boolean shouldForceFetch, boolean shouldNotify) {
        return new CardAction(action, param, shouldForceFetch, shouldNotify);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardAction)) {
            return false;
        }
        CardAction cardAction = (CardAction) other;
        return this.action == cardAction.action && Intrinsics.areEqual(this.param, cardAction.param) && this.shouldForceFetch == cardAction.shouldForceFetch && this.shouldNotify == cardAction.shouldNotify;
    }

    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final ConcurrentHashMap<String, String> getParam() {
        return this.param;
    }

    public final boolean getShouldForceFetch() {
        return this.shouldForceFetch;
    }

    public final boolean getShouldNotify() {
        return this.shouldNotify;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.action) * 31;
        ConcurrentHashMap<String, String> concurrentHashMap = this.param;
        int iHashCode2 = (iHashCode + (concurrentHashMap == null ? 0 : concurrentHashMap.hashCode())) * 31;
        boolean z = this.shouldForceFetch;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        boolean z2 = this.shouldNotify;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "CardAction(action=" + this.action + ", param=" + this.param + ", shouldForceFetch=" + this.shouldForceFetch + ", shouldNotify=" + this.shouldNotify + ")";
    }

    public /* synthetic */ CardAction(int i, ConcurrentHashMap concurrentHashMap, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, concurrentHashMap, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? true : z2);
    }
}
