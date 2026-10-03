package com.heytap.store.homemodule.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class VideoPlayTimesUtil {
    static Map<Integer, Integer> map = new HashMap();

    public static void addTimes(int i) {
        if (map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), Integer.valueOf(map.get(Integer.valueOf(i)).intValue() + 1));
        } else {
            map.put(Integer.valueOf(i), 1);
        }
    }

    public static boolean canPlay(int i) {
        return getPlayTimes(i) < 1;
    }

    public static void clear() {
        map.clear();
    }

    public static int getPlayTimes(int i) {
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i)).intValue();
        }
        return 0;
    }
}
