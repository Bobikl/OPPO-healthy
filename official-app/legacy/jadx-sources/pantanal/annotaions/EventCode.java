package pantanal.annotaions;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lpantanal/annotaions/EventCode;", "", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface EventCode {
    public static final int CLICK = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int EVENT_CODE_APP_RECOMMEND_FEEDBACK = 201;
    public static final int EXPOSE = 2;
    public static final int FIRST_RECOMMEND = 5;
    public static final int INTENT_REMOVE_ORDER_VIEW = 8;
    public static final int INTENT_SERVICE_CLOSE = 10;
    public static final int INTENT_SERVICE_CLOSE_ONCE = 6;
    public static final int LOAD_FAILED = 4;
    public static final int REPLACE_EXTEND_TIME = 7;
    public static final int SCENE_SERVICE_COMPOSE_FAILED = 9;
    public static final int SELL_MODE_BUS_SUBWAY = 101;
    public static final int SELL_MODE_EXPRESS_DELIVERY = 102;
    public static final int SELL_MODE_FLIGHT = 104;
    public static final int SELL_MODE_HIGH_SPEED_RAIL = 103;
    public static final int SELL_MODE_SERVICE_INTRODUCTION = 100;
    public static final int UNINTERESTED = 32;
    public static final int UNRECOMMENDED = 3;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lpantanal/annotaions/EventCode$Companion;", "", "()V", "CLICK", "", "EVENT_CODE_APP_RECOMMEND_FEEDBACK", "EXPOSE", "FIRST_RECOMMEND", "INTENT_REMOVE_ORDER_VIEW", "INTENT_SERVICE_CLOSE", "INTENT_SERVICE_CLOSE_ONCE", "LOAD_FAILED", "REPLACE_EXTEND_TIME", "SCENE_SERVICE_COMPOSE_FAILED", "SELL_MODE_BUS_SUBWAY", "SELL_MODE_EXPRESS_DELIVERY", "SELL_MODE_FLIGHT", "SELL_MODE_HIGH_SPEED_RAIL", "SELL_MODE_SERVICE_INTRODUCTION", "UNINTERESTED", "UNRECOMMENDED", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CLICK = 1;
        public static final int EVENT_CODE_APP_RECOMMEND_FEEDBACK = 201;
        public static final int EXPOSE = 2;
        public static final int FIRST_RECOMMEND = 5;
        public static final int INTENT_REMOVE_ORDER_VIEW = 8;
        public static final int INTENT_SERVICE_CLOSE = 10;
        public static final int INTENT_SERVICE_CLOSE_ONCE = 6;
        public static final int LOAD_FAILED = 4;
        public static final int REPLACE_EXTEND_TIME = 7;
        public static final int SCENE_SERVICE_COMPOSE_FAILED = 9;
        public static final int SELL_MODE_BUS_SUBWAY = 101;
        public static final int SELL_MODE_EXPRESS_DELIVERY = 102;
        public static final int SELL_MODE_FLIGHT = 104;
        public static final int SELL_MODE_HIGH_SPEED_RAIL = 103;
        public static final int SELL_MODE_SERVICE_INTRODUCTION = 100;
        public static final int UNINTERESTED = 32;
        public static final int UNRECOMMENDED = 3;

        private Companion() {
        }
    }
}
