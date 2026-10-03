package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Pair;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.health.sport.R$drawable;
import com.heytap.health.sport.R$string;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class kji {
    public static String a(int i) {
        if (i <= 0) {
            return "--'--\"";
        }
        int iA = (int) hq8.a(i);
        return String.format(Locale.getDefault(), "%1$d'%2$02d\"", Integer.valueOf(iA / 60), Integer.valueOf(iA % 60));
    }

    public static String b(int i) {
        if (i <= 0) {
            return "-- " + eji.a(0);
        }
        double dK = fji.k(3600.0d / ((double) i));
        return nji.m(nji.l(dK)) + " " + eji.a((int) dK);
    }

    public static Pair<String, Integer> c(RunExtra runExtra) {
        String string;
        int i;
        Context contextA = b78.a();
        int gameId = runExtra.getGameId();
        if (gameId == 1) {
            string = contextA.getString(R$string.lib_core_game_king);
            i = R$drawable.lib_game_avatar_king;
        } else if (gameId == 2) {
            string = contextA.getString(R$string.lib_core_game_peace);
            i = R$drawable.lib_game_avatar_peace;
        } else if (gameId == 3) {
            string = contextA.getString(R$string.lib_core_game_cf);
            i = R$drawable.lib_game_avatar_cf;
        } else if (gameId == 4) {
            string = contextA.getString(R$string.lib_core_game_qqfc);
            i = R$drawable.lib_game_avatar_qq;
        } else if (gameId != 5) {
            string = contextA.getString(R$string.lib_core_game_default);
            i = R$drawable.lib_game_avatar_default;
        } else {
            string = contextA.getString(R$string.lib_core_game_ace);
            i = R$drawable.lib_game_avatar_ace;
        }
        return Pair.create(string, Integer.valueOf(i));
    }

    public static boolean d(int i) {
        return oei.j(i) || (oei.i(i) && i != 34) || oei.l(i);
    }
}
