package com.heytap.health.sport.moving;

import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.oplus.channel.client.data.Action;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/heytap/health/sport/moving/ISportLifecycle;", "", "", "start", "pause", "b", "a", Action.LIFE_CIRCLE_VALUE_STOP, "State", "sport_release"}, k = 1, mv = {1, 8, 0})
public interface ISportLifecycle {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/health/sport/moving/ISportLifecycle$State;", "", "(Ljava/lang/String;I)V", "START", LanUtils.US.PAUSE, "RECOVERY", "STOP", "DEFAULT", "sport_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        START,
        PAUSE,
        RECOVERY,
        STOP,
        DEFAULT
    }

    void a();

    void b();

    void pause();

    void start();

    void stop();
}
