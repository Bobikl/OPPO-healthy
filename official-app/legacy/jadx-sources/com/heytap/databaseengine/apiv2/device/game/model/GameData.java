package com.heytap.databaseengine.apiv2.device.game.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class GameData {
    private int countDown;
    private int killType;

    public static final class a {
        public static /* bridge */ /* synthetic */ int a(a aVar) {
            throw null;
        }

        public static /* bridge */ /* synthetic */ int b(a aVar) {
            throw null;
        }
    }

    private GameData(a aVar) {
        this.killType = a.b(aVar);
        this.countDown = a.a(aVar);
    }

    public int getCountDown() {
        return this.countDown;
    }

    public int getKillType() {
        return this.killType;
    }
}
