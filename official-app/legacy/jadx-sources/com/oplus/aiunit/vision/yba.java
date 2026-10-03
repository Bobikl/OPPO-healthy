package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.Command;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class yba {
    public static final String[] A;
    public static final String[] A0;
    public static final String[] B;
    public static final String[] B0;
    public static final String[] C;
    public static final String[] C0;
    public static final String[] D;
    public static final String[] D0;
    public static final String[] E;
    public static final String[] E0;
    public static final String[] F;
    public static final String[] F0;
    public static final String[] G;
    public static final String[] G0;
    public static final String[] H;
    public static final String[] H0;
    public static final String[] I;
    public static final String[] I0;
    public static final String[] J;
    public static final String[] J0;
    public static final String[] K;
    public static final String[] K0;
    public static final String[] L;
    public static final String[] L0;
    public static final String[] M;
    public static final String[] M0;
    public static final String[] N;
    public static final String[] N0;
    public static final String[] O;
    public static final String[] O0;
    public static final String[] P;
    public static final String[] P0;
    public static final String[] Q;
    public static final String[] Q0;
    public static final String[] R;
    public static final String[] R0;
    public static final String[] S;
    public static final String[] S0;
    public static final String[] SZT_IN_OUT;
    public static final String[] T;
    public static final String[] T0;
    public static final String[] U;
    public static final String[] U0;
    public static final String[] V;
    public static final String[] V0;
    public static final String[] W;
    public static final String[] W0;
    public static final String[] X;
    public static final String[] X0;
    public static final String[] Y;
    public static final String[] Y0;
    public static final String[] Z;
    public static final String[] Z0;
    public static final HashMap<String, String[]> a;
    public static final String[] a0;
    public static final String[] a1;
    public static final HashMap<String, String[]> b;
    public static final String[] b0;
    public static final String[] b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<String, String[]> f18952c;
    public static final String[] c0;
    public static final String[] c1;
    public static final String[] d;
    public static final String[] d0;
    public static final String[] d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f18953e;
    public static final String[] e0;
    public static final String[] f;
    public static final String[] f0;
    public static final String[] g;
    public static final String[] g0;
    public static final String[] h;
    public static final String[] h0;
    public static final String[] i;
    public static final String[] i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f18954j;
    public static final String[] j0;
    public static final String[] k;
    public static final String[] k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f18955l;
    public static final String[] l0;
    public static final String[] m;
    public static final String[] m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f18956n;
    public static final String[] n0;
    public static final String[] o;
    public static final String[] o0;
    public static final String[] p;
    public static final String[] p0;
    public static final String[] q;
    public static final String[] q0;
    public static final String[] r;
    public static final String[] r0;
    public static final String[] s;
    public static final String[] s0;
    public static final String[] t;
    public static final String[] t0;
    public static final String[] u;
    public static final String[] u0;
    public static final String[] v;
    public static final String[] v0;
    public static final String[] w;
    public static final String[] w0;
    public static final String[] x;
    public static final String[] x0;
    public static final String[] y;
    public static final String[] y0;
    public static final String[] z;
    public static final String[] z0;

    static {
        HashMap<String, String[]> map = new HashMap<>(20);
        a = map;
        HashMap<String, String[]> map2 = new HashMap<>(20);
        b = map2;
        HashMap<String, String[]> map3 = new HashMap<>(20);
        f18952c = map3;
        String[] strArr = {"00A404000E535A542E57414C4C45542E454E56", "00A40000021001", z60.CMD_APDU_BALANCE_805C000204};
        d = strArr;
        String[] strArr2 = {"00A404000E535A542E57414C4C45542E454E56", "00A40000021001", z60.OPCODES_TRANS_C400};
        f18953e = strArr2;
        String[] strArr3 = {"00A404000E535A542E57414C4C45542E454E56", "00A40000021001", z60.CMD_APDU_CARD_INFO_00B0950000};
        f = strArr3;
        SZT_IN_OUT = new String[]{"00A404000E535A542E57414C4C45542E454E56", "00A40000021001", "00B2014020"};
        map.put("535A542E57414C4C45542E454E56", strArr);
        map2.put("535A542E57414C4C45542E454E56", strArr2);
        map3.put("535A542E57414C4C45542E454E56", strArr3);
        String[] strArr4 = {"00A4040010A00000063201010510009156000014A1", "00A4000002ADFA", z60.CMD_APDU_BALANCE_805C000204};
        g = strArr4;
        String[] strArr5 = {"00A4040010A00000063201010510009156000014A1", "00A4000002ADFA", z60.OPCODES_TRANS_C400};
        h = strArr5;
        String[] strArr6 = {"00A4040010A00000063201010510009156000014A1", "00A4000002ADFA", z60.CMD_APDU_CARD_INFO_00B0950000};
        i = strArr6;
        map.put("A00000063201010510009156000014A1", strArr4);
        map2.put("A00000063201010510009156000014A1", strArr5);
        map3.put("A00000063201010510009156000014A1", strArr6);
        String[] strArr7 = {"00A4040010A0000006320101055800022058100000", z60.CMD_APDU_BALANCE_805C000204};
        f18954j = strArr7;
        String[] strArr8 = {"00A4040010A0000006320101055800022058100000", z60.OPCODES_TRANS_C400, "00A40400105943542E555345525800022058100000", "00A4000002ddf1", "00A4000002adf3", z60.OPCODES_TRANS_C400};
        k = strArr8;
        String[] strArr9 = {"00A4040010A0000006320101055800022058100000", z60.CMD_APDU_CARD_INFO_00B0950000};
        f18955l = strArr9;
        map.put("5943542E555345525800022058100000", strArr7);
        map.put("A0000006320101055800022058100000", strArr7);
        map2.put("5943542E555345525800022058100000", strArr8);
        map2.put("A0000006320101055800022058100000", strArr8);
        map3.put("5943542E555345525800022058100000", strArr9);
        map3.put("A0000006320101055800022058100000", strArr9);
        String[] strArr10 = {"00A4040010A0000000032660869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        m = strArr10;
        String[] strArr11 = {"00A4040010A00000063201010526600051494E4744", z60.OPCODES_TRANS_C400, z60.OPCODES_TRANS_D400, "00A4040010A0000000032660869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400, z60.OPCODES_TRANS_D400};
        f18956n = strArr11;
        String[] strArr12 = {"00A4040010A0000000032660869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_CARD_INFO_00B0950000};
        o = strArr12;
        map.put("A0000000032660869807010000000000", strArr10);
        map2.put("A0000000032660869807010000000000", strArr11);
        map3.put("A0000000032660869807010000000000", strArr12);
        String[] strArr13 = {"00A404000C4351515041592e5359533331", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        p = strArr13;
        String[] strArr14 = {"00A404000C4351515041592e5359533331", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400};
        q = strArr14;
        String[] strArr15 = {"00A404000C4351515041592E5359533331", "00A40000023F00", "00B0850000"};
        r = strArr15;
        map.put("4351515041592E5359533331", strArr13);
        map2.put("4351515041592E5359533331", strArr14);
        map3.put("4351515041592E5359533331", strArr15);
        String[] strArr16 = {"00A4040010A000000632010105215053555A484F55", z60.CMD_APDU_BALANCE_805C000204};
        s = strArr16;
        String[] strArr17 = {"00A4040010A000000632010105215053555A484F55", z60.OPCODES_TRANS_C400};
        t = strArr17;
        String[] strArr18 = {"00A4040010A000000632010105215053555A484F55", z60.CMD_APDU_CARD_INFO_00B0950000};
        u = strArr18;
        map.put("A000000632010105215053555A484F55", strArr16);
        map2.put("A000000632010105215053555A484F55", strArr17);
        map3.put("A000000632010105215053555A484F55", strArr18);
        String[] strArr19 = {"00A4040009A0000053425748544B", "00A40000021001", z60.CMD_APDU_BALANCE_805C000204};
        v = strArr19;
        String[] strArr20 = {"00A4040009A0000053425748544B", "00A40000021001", "0020000003123456", z60.OPCODES_TRANS_C400};
        w = strArr20;
        String[] strArr21 = {"00A4040009A0000053425748544B", "00B08A0000"};
        x = strArr21;
        map.put("A0000053425748544B", strArr19);
        map2.put("A0000053425748544B", strArr20);
        map3.put("A0000053425748544B", strArr21);
        String[] strArr22 = {"00A404000DA0000006320101054758474D4B", z60.CMD_APDU_BALANCE_805C000204};
        y = strArr22;
        String[] strArr23 = {"00A404000DA0000006320101054758474D4B", z60.OPCODES_TRANS_C400};
        z = strArr23;
        String[] strArr24 = {"00A404000DA0000006320101054758474D4B", z60.CMD_APDU_CARD_INFO_00B095001E};
        A = strArr24;
        map.put("A0000006320101054758474D4B", strArr22);
        map2.put("A0000006320101054758474D4B", strArr23);
        map3.put("A0000006320101054758474D4B", strArr24);
        String[] strArr25 = {"00A404000DA0000006320101055358434154", z60.CMD_APDU_BALANCE_805C000204};
        B = strArr25;
        String[] strArr26 = {"00A404000DA0000006320101055358434154", z60.OPCODES_TRANS_C400};
        C = strArr26;
        String[] strArr27 = {"00A404000DA0000006320101055358434154", z60.CMD_APDU_CARD_INFO_00B095001E};
        D = strArr27;
        map.put("A0000006320101055358434154", strArr25);
        map2.put("A0000006320101055358434154", strArr26);
        map3.put("A0000006320101055358434154", strArr27);
        String[] strArr28 = {"00A4040010A0000000032300869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        E = strArr28;
        String[] strArr29 = {"00A4040010A0000000032300869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400};
        F = strArr29;
        String[] strArr30 = {"00A4040010A0000000032300869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_CARD_INFO_00B0950000};
        G = strArr30;
        map.put("A0000000032300869807010000000000", strArr28);
        map2.put("A0000000032300869807010000000000", strArr29);
        map3.put("A0000000032300869807010000000000", strArr30);
        String[] strArr31 = {"00A4040010A0000000033150869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        H = strArr31;
        String[] strArr32 = {"00A4040010A0000000033150869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400, z60.OPCODES_TRANS_8400};
        I = strArr32;
        String[] strArr33 = {"00A4040010A0000000033150869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_CARD_INFO_00B0950000};
        J = strArr33;
        map.put("A0000000033150869807010000000000", strArr31);
        map2.put("A0000000033150869807010000000000", strArr32);
        map3.put("A0000000033150869807010000000000", strArr33);
        String[] strArr34 = {"00A4040009A0000053425A5A4854", "00A40000021001", z60.CMD_APDU_BALANCE_805C000204};
        K = strArr34;
        String[] strArr35 = {"00A4040009A0000053425A5A4854", "00A40000021001", z60.OPCODES_TRANS_C400, z60.OPCODES_TRANS_8400};
        L = strArr35;
        String[] strArr36 = {"00A4040009A0000053425A5A4854", "00A40000021001", z60.CMD_APDU_CARD_INFO_00B0950000};
        M = strArr36;
        map.put("A0000053425A5A4854", strArr34);
        map2.put("A0000053425A5A4854", strArr35);
        map3.put("A0000053425A5A4854", strArr36);
        String[] strArr37 = {"00A4040010A0000000031500869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        N = strArr37;
        String[] strArr38 = {"00A4040010A0000006320101051500484145524249", z60.OPCODES_TRANS_C400, "00A4040010A0000000031500869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400};
        O = strArr38;
        String[] strArr39 = {"00A4040010A0000006320101051500484145524249", z60.CMD_APDU_CARD_INFO_00B0950000};
        P = strArr39;
        map.put("A0000000031500869807010000000000", strArr37);
        map2.put("A0000000031500869807010000000000", strArr38);
        map3.put("A0000000031500869807010000000000", strArr39);
        String[] strArr40 = {"00A4040010A0000000033610869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        Q = strArr40;
        String[] strArr41 = {"00A4040010A0000000033610869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400};
        R = strArr41;
        String[] strArr42 = {"00A4040010A0000000033610869807010000000000", "00B0850000"};
        S = strArr42;
        map.put("A0000000033610869807010000000000", strArr40);
        map2.put("A0000000033610869807010000000000", strArr41);
        map3.put("A0000000033610869807010000000000", strArr42);
        String[] strArr43 = {"00A404000DA000000632010105484E594B54", z60.CMD_APDU_BALANCE_805C000204};
        T = strArr43;
        String[] strArr44 = {"00A404000DA000000632010105484E594B54", z60.OPCODES_TRANS_C400};
        U = strArr44;
        String[] strArr45 = {"00A404000DA000000632010105484E594B54", z60.CMD_APDU_CARD_INFO_00B0950000};
        V = strArr45;
        map.put("A000000632010105484E594B54", strArr43);
        map2.put("A000000632010105484E594B54", strArr44);
        map3.put("A000000632010105484E594B54", strArr45);
        String[] strArr46 = {"00A4040010A00000063201010504678810FFFFFFFF", z60.CMD_APDU_BALANCE_805C000204};
        W = strArr46;
        String[] strArr47 = {"00A4040010A00000063201010504678810FFFFFFFF", z60.OPCODES_TRANS_C400};
        X = strArr47;
        String[] strArr48 = {"00A4040010A00000063201010504678810FFFFFFFF", z60.CMD_APDU_CARD_INFO_00B095001E};
        Y = strArr48;
        map.put("A00000063201010504678810FFFFFFFF", strArr46);
        map2.put("A00000063201010504678810FFFFFFFF", strArr47);
        map3.put("A00000063201010504678810FFFFFFFF", strArr48);
        String[] strArr49 = {"00A404000DA0000006320101054A4C4A4C54", z60.CMD_APDU_BALANCE_805C000204};
        Z = strArr49;
        String[] strArr50 = {"00A404000DA0000006320101054A4C4A4C54", z60.OPCODES_TRANS_C400};
        a0 = strArr50;
        String[] strArr51 = {"00A404000DA0000006320101054A4C4A4C54", z60.CMD_APDU_CARD_INFO_00B0950000};
        b0 = strArr51;
        map.put("A0000006320101054A4C4A4C54", strArr49);
        map2.put("A0000006320101054A4C4A4C54", strArr50);
        map3.put("A0000006320101054A4C4A4C54", strArr51);
        String[] strArr52 = {"00A404000FA00000004644574F50504F53484149", z60.CMD_APDU_CARD_INFO_00A40000023F01, "805003020B01000000000000000000000F"};
        c0 = strArr52;
        String[] strArr53 = {"00A4040010A0000006320101060200290046445774", z60.CMD_APDU_CARD_INFO_00A40000023F01, "805003020B01000000000000000000000F"};
        d0 = strArr53;
        String[] strArr54 = {"00A404000FA00000004644574F50504F53484149", z60.CMD_APDU_CARD_INFO_00A40000023F01, "00A40000020018", z60.OPCODES_TRANS_0400};
        e0 = strArr54;
        String[] strArr55 = {"00A4040010A0000006320101060200290046445774", z60.CMD_APDU_CARD_INFO_00A40000023F01, "00A40000020018", z60.OPCODES_TRANS_0400};
        f0 = strArr55;
        String[] strArr56 = {"00A404000FA00000004644574F50504F53484149", z60.CMD_APDU_CARD_INFO_00A40000023F01};
        g0 = strArr56;
        String[] strArr57 = {"00A4040010A0000006320101060200290046445774", z60.CMD_APDU_CARD_INFO_00A40000023F01};
        h0 = strArr57;
        map.put("A00000004644574F50504F53484149", strArr52);
        map2.put("A00000004644574F50504F53484149", strArr54);
        map3.put("A00000004644574F50504F53484149", strArr56);
        map.put("A0000006320101060200290046445774", strArr53);
        map2.put("A0000006320101060200290046445774", strArr55);
        map3.put("A0000006320101060200290046445774", strArr57);
        String[] strArr58 = {"00A4040010A000000632010105116044414C49414E", z60.CMD_APDU_BALANCE_805C000204};
        i0 = strArr58;
        String[] strArr59 = {"00A4040010A000000632010105116044414C49414E", z60.OPCODES_TRANS_C400};
        j0 = strArr59;
        String[] strArr60 = {"00A4040010A000000632010105116044414C49414E", z60.CMD_APDU_CARD_INFO_00B0950000};
        k0 = strArr60;
        map.put("A000000632010105116044414C49414E", strArr58);
        map2.put("A000000632010105116044414C49414E", strArr59);
        map3.put("A000000632010105116044414C49414E", strArr60);
        String[] strArr61 = {"00A4040010A00000063201010531805441495A484F", z60.CMD_APDU_BALANCE_805C000204};
        l0 = strArr61;
        String[] strArr62 = {"00A4040010A00000063201010531805441495A484F", z60.OPCODES_TRANS_C400, "00A4040010A0000000033180869807010000000000", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_D400};
        m0 = strArr62;
        String[] strArr63 = {"00A4040010A00000063201010531805441495A484F", z60.CMD_APDU_CARD_INFO_00B0950000};
        n0 = strArr63;
        map.put("A0000000033180869807010000000000", strArr61);
        map2.put("A0000000033180869807010000000000", strArr62);
        map3.put("A0000000033180869807010000000000", strArr63);
        String[] strArr64 = {"00A404000DA0000006320101055359534A54", "00B201CC00", z60.CMD_APDU_BALANCE_805C000204};
        o0 = strArr64;
        String[] strArr65 = {"00A404000DA0000006320101055359534A54", z60.OPCODES_TRANS_C400};
        p0 = strArr65;
        String[] strArr66 = {"00A404000DA0000006320101055359534A54", z60.CMD_APDU_CARD_INFO_00B095001E};
        q0 = strArr66;
        map.put("A0000006320101055359534A54", strArr64);
        map2.put("A0000006320101055359534A54", strArr65);
        map3.put("A0000006320101055359534A54", strArr66);
        String[] strArr67 = {"00A404000D5A4A422E5359532E4444463031", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        r0 = strArr67;
        String[] strArr68 = {"00A404000D5A4A422E5359532E4444463031", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400, z60.OPCODES_TRANS_8400};
        s0 = strArr68;
        String[] strArr69 = {"00A404000D5A4A422E5359532E4444463031", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_CARD_INFO_00B095001E};
        t0 = strArr69;
        map.put("5A4A422E5359532E4444463031", strArr67);
        map2.put("5A4A422E5359532E4444463031", strArr68);
        map3.put("5A4A422E5359532E4444463031", strArr69);
        String[] strArr70 = {"00A404000DA0000006320101054842534A5A", z60.CMD_APDU_BALANCE_805C000204};
        u0 = strArr70;
        String[] strArr71 = {"00A404000DA0000006320101054842534A5A", z60.OPCODES_TRANS_C400};
        v0 = strArr71;
        String[] strArr72 = {"00A404000DA0000006320101054842534A5A", z60.CMD_APDU_CARD_INFO_00B095001E};
        w0 = strArr72;
        map.put("A0000006320101054842534A5A", strArr70);
        map2.put("A0000006320101054842534A5A", strArr71);
        map3.put("A0000006320101054842534A5A", strArr72);
        String[] strArr73 = {"00A404000FA00000063201010501273020FFFFFFFF", z60.CMD_APDU_BALANCE_805C000204};
        x0 = strArr73;
        String[] strArr74 = {"00A404000FA00000063201010501273020FFFFFFFF", z60.OPCODES_TRANS_C400};
        y0 = strArr74;
        String[] strArr75 = {"00A404000FA00000063201010501273020FFFFFFFF", z60.CMD_APDU_CARD_INFO_00B095001E};
        z0 = strArr75;
        map.put("A00000063201010501273020FFFFFFFF", strArr73);
        map2.put("A00000063201010501273020FFFFFFFF", strArr74);
        map3.put("A00000063201010501273020FFFFFFFF", strArr75);
        String[] strArr76 = {"00A4040010A000000632010105535A4B5700000731", z60.CMD_APDU_BALANCE_805C000204};
        A0 = strArr76;
        String[] strArr77 = {"00A4040010A000000632010105535A4B5700000731", z60.OPCODES_TRANS_C400};
        B0 = strArr77;
        String[] strArr78 = {"00A4040010A000000632010105535A4B5700000731", z60.CMD_APDU_CARD_INFO_00B095001E};
        C0 = strArr78;
        map.put("A000000632010105535A4B5700000731", strArr76);
        map2.put("A000000632010105535A4B5700000731", strArr77);
        map3.put("A000000632010105535A4B5700000731", strArr78);
        String[] strArr79 = {"00A4040010315041592E5359532E44444630310791", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        D0 = strArr79;
        String[] strArr80 = {"00A4040010315041592E5359532E44444630310791", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400};
        E0 = strArr80;
        String[] strArr81 = {"00A4040010315041592E5359532E44444630310791", z60.CMD_APDU_CARD_INFO_00A40000023F01, "00B0950022"};
        F0 = strArr81;
        map.put("315041592E5359532E44444630310791", strArr79);
        map2.put("315041592E5359532E44444630310791", strArr80);
        map3.put("315041592E5359532E44444630310791", strArr81);
        String[] strArr82 = {"00A4040010A000000632010105535A4B5700000931", z60.CMD_APDU_BALANCE_805C000204};
        G0 = strArr82;
        String[] strArr83 = {"00A4040010A000000632010105535A4B5700000931", z60.OPCODES_TRANS_C400};
        H0 = strArr83;
        String[] strArr84 = {"00A4040010A000000632010105535A4B5700000931", z60.CMD_APDU_CARD_INFO_00B095001E};
        I0 = strArr84;
        map.put("A000000632010105535A4B5700000931", strArr82);
        map2.put("A000000632010105535A4B5700000931", strArr83);
        map3.put("A000000632010105535A4B5700000931", strArr84);
        String[] strArr85 = {"00A404000DD156000015CCECB8AECDA8BFA8", "00A40000021001", z60.CMD_APDU_BALANCE_805C000204};
        J0 = strArr85;
        String[] strArr86 = {"00A404000DD156000015CCECB8AECDA8BFA8", "00A40000021001", z60.OPCODES_TRANS_C417};
        K0 = strArr86;
        String[] strArr87 = {"00A404000DD156000015CCECB8AECDA8BFA8", "00A40000021001", z60.CMD_APDU_CARD_INFO_00B0950000};
        L0 = strArr87;
        map.put("D156000015CCECB8AECDA8BFA8", strArr85);
        map2.put("D156000015CCECB8AECDA8BFA8", strArr86);
        map3.put("D156000015CCECB8AECDA8BFA8", strArr87);
        String[] strArr88 = {"00A4040010A0000006320101053000300100083010", z60.CMD_APDU_BALANCE_805C000204};
        M0 = strArr88;
        String[] strArr89 = {"00A4040010A0000006320101053000300100083010", z60.OPCODES_TRANS_C400};
        N0 = strArr89;
        String[] strArr90 = {"00A4040010A0000006320101053000300100083010", z60.CMD_APDU_CARD_INFO_00B0950000};
        O0 = strArr90;
        map.put("A0000006320101053000300100083010", strArr88);
        map2.put("A0000006320101053000300100083010", strArr89);
        map3.put("A0000006320101053000300100083010", strArr90);
        String[] strArr91 = {"00A40400096A682ECAD0C3F1BFA8", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        P0 = strArr91;
        String[] strArr92 = {"00A40400096A682ECAD0C3F1BFA8", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_8400, z60.OPCODES_TRANS_C400, z60.OPCODES_TRANS_D400};
        Q0 = strArr92;
        String[] strArr93 = {"00A40400096A682ECAD0C3F1BFA8", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_CARD_INFO_00B095001E};
        R0 = strArr93;
        map.put("6A682ECAD0C3F1BFA8", strArr91);
        map2.put("6A682ECAD0C3F1BFA8", strArr92);
        map3.put("6A682ECAD0C3F1BFA8", strArr93);
        String[] strArr94 = {"00A4040010A00000063201010502697010FFFFFFFF", z60.CMD_APDU_BALANCE_805C000204};
        S0 = strArr94;
        String[] strArr95 = {"00A4040010A00000063201010502697010FFFFFFFF", z60.OPCODES_TRANS_C400};
        T0 = strArr95;
        String[] strArr96 = {"00A4040010A00000063201010502697010FFFFFFFF", z60.CMD_APDU_CARD_INFO_00B095001E};
        U0 = strArr96;
        map.put("A00000063201010502697010FFFFFFFF", strArr94);
        map2.put("A00000063201010502697010FFFFFFFF", strArr95);
        map3.put("A00000063201010502697010FFFFFFFF", strArr96);
        String[] strArr97 = {"00A404000BA000000003869807004580", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_BALANCE_805C000204};
        V0 = strArr97;
        String[] strArr98 = {"00A404000BA000000003869807004580", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.OPCODES_TRANS_C400, "00A4040010A00000063201010503684580FFFFFFFF", z60.OPCODES_TRANS_C400};
        W0 = strArr98;
        String[] strArr99 = {"00A404000BA000000003869807004580", z60.CMD_APDU_CARD_INFO_00A40000023F01, z60.CMD_APDU_CARD_INFO_00B0950000};
        X0 = strArr99;
        map.put("A000000003869807004580", strArr97);
        map2.put("A000000003869807004580", strArr98);
        map3.put("A000000003869807004580", strArr99);
        String[] strArr100 = {"00A404000DA0000006320101054842594B54", z60.CMD_APDU_BALANCE_805C000204};
        Y0 = strArr100;
        String[] strArr101 = {"00A404000DA0000006320101054842594B54", z60.OPCODES_TRANS_C400};
        Z0 = strArr101;
        String[] strArr102 = {"00A404000DA0000006320101054842594B54", z60.CMD_APDU_CARD_INFO_00B095001E};
        a1 = strArr102;
        map.put("A0000006320101054842594B54", strArr100);
        map2.put("A0000006320101054842594B54", strArr101);
        map3.put("A0000006320101054842594B54", strArr102);
        String[] strArr103 = {"00A4040010A00000063201010511215449414E4A49", z60.CMD_APDU_BALANCE_805C000204};
        b1 = strArr103;
        String[] strArr104 = {"00A4040010A00000063201010511215449414E4A49", z60.OPCODES_TRANS_C400};
        c1 = strArr104;
        String[] strArr105 = {"00A4040010A00000063201010511215449414E4A49", z60.CMD_APDU_CARD_INFO_00B0950000};
        d1 = strArr105;
        map.put("A00000063201010511215449414E4A49", strArr103);
        map2.put("A00000063201010511215449414E4A49", strArr104);
        map3.put("A00000063201010511215449414E4A49", strArr105);
    }

    public static int a(List<Command> list, String[] strArr, int i2, String str) {
        if (strArr == null) {
            t6b.b("InstructsConfig", "genCommands failed");
            return 0;
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            list.add(e(strArr[i3], i2 + i3, str));
        }
        return strArr.length;
    }

    public static List<Command> b(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = a.get(str.toUpperCase());
        ArrayList arrayList = new ArrayList();
        a(arrayList, strArr, 0, ".*(9000)$");
        return arrayList;
    }

    public static List<Command> c(String str) {
        if (str != null) {
            str = str.toUpperCase();
        }
        String[] strArr = f18952c.get(str);
        ArrayList arrayList = new ArrayList();
        a(arrayList, strArr, 0, ".*(9000)$");
        return arrayList;
    }

    public static List<Command> d(String str) {
        if (str != null) {
            str = str.toUpperCase();
        }
        String[] strArr = b.get(str);
        ArrayList arrayList = new ArrayList(15);
        if (strArr != null) {
            int iA = 0;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str2 = strArr[i2];
                if (z60.OPCODES_DEFAULT_SELECT.equals(str2)) {
                    arrayList.add(e(j3.e(str), iA + i2, ".*(9000|6A83)$"));
                } else if (str2.startsWith(z60.OP_TRANS_PRE)) {
                    iA += a(arrayList, z60.OPCODES_SET.get(str2), iA + i2, ".*(9000|6A83)$");
                } else {
                    arrayList.add(e(str2, iA + i2, ".*(9000|6A83)$"));
                }
            }
        } else {
            t6b.b("InstructsConfig", "get command failed");
        }
        return arrayList;
    }

    public static Command e(String str, int i2, String str2) {
        Command command = new Command();
        command.setCommand(str);
        command.setChecker(str2);
        command.setIndex(String.valueOf(i2));
        return command;
    }
}
