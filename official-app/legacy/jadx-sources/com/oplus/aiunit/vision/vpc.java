package com.oplus.aiunit.vision;

import java.util.HashMap;
import org.scilab.forge.jlatexmath.ParseException;

/* JADX INFO: loaded from: classes11.dex */
public class vpc {
    public static HashMap<String, String> a = new HashMap<>();
    public static HashMap<String, String> b = new HashMap<>();

    public static void a(String str, String str2, int i) throws ParseException {
        a.put(str, str2);
        mdb.Commands.put(str, new mdb("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i));
    }

    public static void b(String str, String str2, int i, String str3) throws ParseException {
        if (a.get(str) == null) {
            a.put(str, str2);
            b.put(str, str3);
            mdb.Commands.put(str, new mdb("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i, 1.0f));
        } else {
            throw new ParseException("Command " + str + " already exists ! Use renewcommand instead ...");
        }
    }

    public static void c(String str, String str2, int i) {
        if (a.get(str) != null) {
            a.put(str, str2);
            mdb.Commands.put(str, new mdb("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i));
        } else {
            throw new ParseException("Command " + str + " is not defined ! Use newcommand instead ...");
        }
    }

    public static boolean d(String str) {
        return a.containsKey(str);
    }
}
