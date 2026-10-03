package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sport.moving.ISportLifecycle;
import com.heytap.health.sport.moving.MoveLifecycleManager;
import com.oplus.channel.client.data.Action;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/bie;", "Lcom/heytap/health/sport/moving/ISportLifecycle;", "", "d", "start", "pause", "b", "a", Action.LIFE_CIRCLE_VALUE_STOP, "", "stateValue", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "Companion", "sport_release"}, k = 1, mv = {1, 8, 0})
public final class bie implements ISportLifecycle {
    public static final int $stable = 0;

    @NotNull
    public static final String ACTION_PHONE_SPORT_STATE_CHANGED = "action_phone_sport_state_changed";

    @NotNull
    public static final String KEY_PHONE_SPORT_STATE = "key_phone_sport_state";

    @NotNull
    public static final String KEY_PHONE_SPORT_TYPE = "key_phone_sport_type";

    @NotNull
    public static final String PERMISSION_RECEIVE_SPORT_STATE = "com.heytap.health.permission.RECEIVE_SPORT_STATE";
    public static final int PHONE_SPORT_STATE_PAUSE = 2;
    public static final int PHONE_SPORT_STATE_RECOVERY = 3;
    public static final int PHONE_SPORT_STATE_START = 1;
    public static final int PHONE_SPORT_STATE_STOP = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final List<String> a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.oplus.subsys", "com.oplus.networksense"});

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bie$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/bie$a;", "", "", "", "TARGET_PACKAGES", "Ljava/util/List;", "a", "()Ljava/util/List;", "ACTION_PHONE_SPORT_STATE_CHANGED", "Ljava/lang/String;", "KEY_PHONE_SPORT_STATE", "KEY_PHONE_SPORT_TYPE", "PERMISSION_RECEIVE_SPORT_STATE", "", "PHONE_SPORT_STATE_PAUSE", "I", "PHONE_SPORT_STATE_RECOVERY", "PHONE_SPORT_STATE_START", "PHONE_SPORT_STATE_STOP", "TAG", "<init>", "()V", "sport_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> a() {
            return bie.a;
        }
    }

    @Override // com.heytap.health.sport.moving.ISportLifecycle
    public void a() {
    }

    @Override // com.heytap.health.sport.moving.ISportLifecycle
    public void b() {
        e(3);
    }

    public final void d() {
        MoveLifecycleManager.INSTANCE.r(this);
        a7b.f("PhoneSportStateBroadcaster", "registered");
    }

    public final void e(int stateValue) {
        Context contextA = b78.a();
        int iO = MoveLifecycleManager.INSTANCE.o();
        for (String str : a) {
            try {
                Intent intent = new Intent(ACTION_PHONE_SPORT_STATE_CHANGED);
                intent.putExtra(KEY_PHONE_SPORT_STATE, stateValue);
                intent.putExtra(KEY_PHONE_SPORT_TYPE, iO);
                intent.setPackage(str);
                contextA.sendBroadcast(intent, PERMISSION_RECEIVE_SPORT_STATE);
                a7b.f("PhoneSportStateBroadcaster", "Send phone sport state broadcast to " + str + ", state=" + stateValue + ", type=" + iO);
            } catch (Exception e2) {
                a7b.b("PhoneSportStateBroadcaster", "Send broadcast to " + str + " error: " + e2.getMessage());
            }
        }
    }

    @Override // com.heytap.health.sport.moving.ISportLifecycle
    public void pause() {
        e(2);
    }

    @Override // com.heytap.health.sport.moving.ISportLifecycle
    public void start() {
        e(1);
    }

    @Override // com.heytap.health.sport.moving.ISportLifecycle
    public void stop() {
        e(0);
    }
}
