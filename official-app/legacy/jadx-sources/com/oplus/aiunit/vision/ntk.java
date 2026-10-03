package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.Command;
import com.lifesense.plugin.ble.data.other.DeviceTypeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
@Deprecated
public class ntk {
    public static final String AID_GUANGXITONG = "A0000006320101054758474D4B";
    public static final String AID_HAINANYKT = "A000000632010105484E594B54";
    public static final String AID_HONGSHANTONG = "A00000063201010504678810FFFFFFFF";
    public static final String AID_JILINTONG_VFC = "A0000006320101054A4C4A4C54";
    public static final String AID_SHENYANG = "A0000006320101055359534A54";
    public static final String AID_SHIJIAZHUANG = "A0000006320101054842534A5A";
    public static final String AID_XIANTONG = "A0000006320101055358434154";
    public static final String AID_YISUMA = "5A4A422E5359532E4444463031";
    public static final HashMap<String, String[]> STATIONS_STATUS_CODE_SET;
    public static final HashMap<String, HashMap<String, String>> STATIONS_STATUS_RESULT_SET;
    public static final HashMap<String, int[]> STATIONS_STATUS_SUB_SET;
    public static final Set<String> VFCAidSet;
    public static final String[] a;
    public static final String[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f14636c;
    public static final String[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f14637e;
    public static final int[] f;
    public static final int[] g;
    public static final String[] h;
    public static final String[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f14638j;
    public static final String[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f14639l;
    public static final String[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f14640n;
    public static final int[] o;
    public static final HashMap<String, String> p;
    public static final HashMap<String, String> q;
    public static final HashMap<String, String> r;

    static {
        String[] strArr = {d04.TAG_AID_BIG + d("A0000006320101054758474D4B") + "A0000006320101054758474D4B", z60.CMD_APDU_SITE_STATE_00B201D400};
        a = strArr;
        String[] strArr2 = {d04.TAG_AID_BIG + d("A0000006320101055358434154") + "A0000006320101055358434154", z60.CMD_APDU_SITE_STATE_00B201D400};
        b = strArr2;
        String[] strArr3 = {d04.TAG_AID_BIG + d("A0000006320101054A4C4A4C54") + "A0000006320101054A4C4A4C54", z60.CMD_APDU_SITE_STATE_00B201D400};
        f14636c = strArr3;
        String[] strArr4 = {d04.TAG_AID_BIG + d("A000000632010105484E594B54") + "A000000632010105484E594B54", z60.CMD_APDU_SITE_STATE_00B201D400};
        d = strArr4;
        String[] strArr5 = {"00A40400095552554D51495F4150", "00A4000002DF01", "00B203BC00"};
        f14637e = strArr5;
        int[] iArr = {8, 10};
        f = iArr;
        int[] iArr2 = {10, 12};
        g = iArr2;
        String[] strArr6 = {d04.TAG_AID_BIG + d("A0000006320101055359534A54") + "A0000006320101055359534A54", "00B202CC00"};
        h = strArr6;
        String[] strArr7 = {d04.TAG_AID_BIG + d("5A4A422E5359532E4444463031") + "5A4A422E5359532E4444463031", z60.CMD_APDU_SITE_STATE_00B201D400};
        i = strArr7;
        String[] strArr8 = {d04.TAG_AID_BIG + d("A0000006320101054842534A5A") + "A0000006320101054842534A5A", z60.CMD_APDU_SITE_STATE_00B201D400};
        f14638j = strArr8;
        String[] strArr9 = {d04.TAG_AID_BIG + d("6A682ECAD0C3F1BFA8") + "6A682ECAD0C3F1BFA8", z60.CMD_APDU_CARD_INFO_00A40000023F01, "00B201BC00"};
        k = strArr9;
        String[] strArr10 = {d04.TAG_AID_BIG + d("A00000063201010502697010FFFFFFFF") + "A00000063201010502697010FFFFFFFF", z60.CMD_APDU_SITE_STATE_00B201D400};
        f14639l = strArr10;
        String[] strArr11 = {d04.TAG_AID_BIG + d("A000000003869807004580") + "A000000003869807004580", z60.CMD_APDU_SITE_STATE_00B201D400};
        m = strArr11;
        String[] strArr12 = {d04.TAG_AID_BIG + d("A0000006320101054842594B54") + "A0000006320101054842594B54", z60.CMD_APDU_SITE_STATE_00B201D400};
        f14640n = strArr12;
        HashSet hashSet = new HashSet();
        VFCAidSet = hashSet;
        HashMap<String, String[]> map = new HashMap<>(20);
        STATIONS_STATUS_CODE_SET = map;
        HashMap<String, int[]> map2 = new HashMap<>(20);
        STATIONS_STATUS_SUB_SET = map2;
        int[] iArr3 = {28, 30};
        o = iArr3;
        HashMap<String, HashMap<String, String>> map3 = new HashMap<>();
        STATIONS_STATUS_RESULT_SET = map3;
        HashMap<String, String> map4 = new HashMap<>();
        p = map4;
        HashMap<String, String> map5 = new HashMap<>();
        q = map5;
        HashMap<String, String> map6 = new HashMap<>();
        r = map6;
        hashSet.add("A0000006320101054758474D4B");
        hashSet.add("A0000006320101055358434154");
        hashSet.add("A0000006320101054A4C4A4C54");
        hashSet.add("A000000632010105484E594B54");
        hashSet.add("A00000063201010504678810FFFFFFFF");
        hashSet.add("A0000006320101055359534A54");
        hashSet.add("5A4A422E5359532E4444463031");
        hashSet.add("A0000006320101054842534A5A");
        hashSet.add("6A682ECAD0C3F1BFA8");
        hashSet.add("A00000063201010502697010FFFFFFFF");
        hashSet.add("A000000003869807004580");
        hashSet.add("A0000006320101054842594B54");
        map.put("A0000006320101054758474D4B", strArr);
        map.put("A0000006320101055358434154", strArr2);
        map.put("A0000006320101054A4C4A4C54", strArr3);
        map.put("A000000632010105484E594B54", strArr4);
        map.put("A00000063201010504678810FFFFFFFF", strArr5);
        map.put("A0000006320101055359534A54", strArr6);
        map.put("5A4A422E5359532E4444463031", strArr7);
        map.put("A0000006320101054842534A5A", strArr8);
        map.put("6A682ECAD0C3F1BFA8", strArr9);
        map.put("A00000063201010502697010FFFFFFFF", strArr10);
        map.put("A000000003869807004580", strArr11);
        map.put("A0000006320101054842594B54", strArr12);
        map2.put("A0000006320101054758474D4B", iArr3);
        map2.put("A0000006320101055358434154", iArr3);
        map2.put("A0000006320101054A4C4A4C54", iArr3);
        map2.put("A000000632010105484E594B54", iArr3);
        map2.put("A00000063201010504678810FFFFFFFF", iArr);
        map2.put("A0000006320101055359534A54", iArr2);
        map2.put("5A4A422E5359532E4444463031", iArr3);
        map2.put("A0000006320101054842534A5A", iArr3);
        map2.put("6A682ECAD0C3F1BFA8", new int[]{8, 10});
        map2.put("A00000063201010502697010FFFFFFFF", iArr3);
        map2.put("A000000003869807004580", iArr3);
        map2.put("A0000006320101054842594B54", iArr3);
        map4.put("00", "INIT_STATUS");
        map4.put("01", "GO_TRAFFIC");
        map4.put("02", "OUT_TRAFIIC");
        map4.put(DeviceTypeConstants.HEIGHT_RULER, "GO_TRAFFIC");
        map4.put("04", "OUT_TRAFIIC");
        map5.put("01", "GO_TRAFFIC");
        map5.put("00", "OUT_TRAFIIC");
        map6.put("01", "GO_TRAFFIC");
        map6.put("00", "OUT_TRAFIIC");
        map3.put("A0000006320101054758474D4B", map4);
        map3.put("A0000006320101055358434154", map4);
        map3.put("A0000006320101054A4C4A4C54", map4);
        map3.put("A000000632010105484E594B54", map4);
        map3.put("A00000063201010504678810FFFFFFFF", map5);
        map3.put("A0000006320101055359534A54", map6);
        map3.put("5A4A422E5359532E4444463031", map4);
        map3.put("A0000006320101054842534A5A", map4);
        map3.put("6A682ECAD0C3F1BFA8", map6);
        map3.put("A00000063201010502697010FFFFFFFF", map4);
        map3.put("A000000003869807004580", map4);
        map3.put("A0000006320101054842594B54", map4);
    }

    public static int a(List<Command> list, String[] strArr, int i2, String str) {
        if (strArr == null) {
            t6b.b("VFCConstant", "genCommands failed");
            return 0;
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            list.add(c(strArr[i3], i2 + i3, str));
        }
        return strArr.length;
    }

    public static List<Command> b(String str, HashMap<String, String[]> map, String str2) {
        if (map == null) {
            return null;
        }
        if (str != null) {
            str = str.toUpperCase();
        }
        String[] strArr = map.get(str);
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, strArr, 0, str2);
        return arrayList;
    }

    public static Command c(String str, int i2, String str2) {
        Command command = new Command();
        command.setCommand(str);
        command.setChecker(str2);
        command.setIndex(String.valueOf(i2));
        return command;
    }

    public static String d(String str) {
        return e1j.o(str.length() / 2).toUpperCase();
    }
}
