package com.oplus.aiunit.vision;

import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.XmlReader;
import com.heytap.health.watch.oafagent.R$xml;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wyf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wyf f18443c = new wyf();
    public final ah0<qt9, ot9> a;
    public final ah0<f07, e07> b;

    public wyf() {
        ah0<qt9, ot9> ah0Var = new ah0<>();
        this.a = ah0Var;
        ah0<f07, e07> ah0Var2 = new ah0<>();
        this.b = ah0Var2;
        y9d.b(ah0Var, ah0Var2);
    }

    public static wyf d() {
        return f18443c;
    }

    public void a(PrintWriter printWriter, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            printWriter.println("OLink -> Oaf:");
            for (Map.Entry<qt9, ArrayList<ot9>> entry : this.a.b().entrySet()) {
                printWriter.println("  " + entry.getKey() + " --> " + entry.getValue());
            }
            printWriter.println("FOLink -> FOaf:");
            for (Map.Entry<f07, ArrayList<e07>> entry2 : this.b.b().entrySet()) {
                printWriter.println("  " + entry2.getKey() + " --> " + entry2.getValue());
            }
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            y9d.c(map, map2);
            printWriter.println("IOaf -> IOlink:");
            for (Map.Entry entry3 : map.entrySet()) {
                printWriter.println("  " + entry3.getKey() + " --> " + entry3.getValue());
            }
            printWriter.println("FOaf -> FOlink:");
            for (Map.Entry entry4 : map2.entrySet()) {
                printWriter.println("  " + entry4.getKey() + " --> " + entry4.getValue());
            }
            List<xq> listA = y9d.a();
            printWriter.println("allAgentInfo:");
            Iterator<xq> it = listA.iterator();
            while (it.hasNext()) {
                printWriter.println("  " + it.next());
            }
        }
    }

    public byte[] b() throws ResourceParserException {
        return i(R$xml.accessoryservices);
    }

    public byte[] c() throws ResourceParserException {
        return i(R$xml.accessoryservicesslave);
    }

    public List<e07> e(int i, String str) {
        ArrayList<e07> arrayListA = this.b.a(f07.a(i, null));
        if (arrayListA == null) {
            return null;
        }
        return new ArrayList(arrayListA);
    }

    public List<e07> f(int i, String str) {
        ArrayList<e07> arrayListA = this.b.a(f07.a(i, str));
        if (arrayListA == null) {
            return null;
        }
        return new ArrayList(arrayListA);
    }

    public List<ot9> g(int i, int i2) {
        ArrayList<ot9> arrayListA = this.a.a(qt9.a(i, "?", 0));
        if (arrayListA == null) {
            return null;
        }
        return new ArrayList(arrayListA);
    }

    public List<ot9> h(int i, int i2) {
        ArrayList<ot9> arrayListA = this.a.a(qt9.a(i, String.valueOf(i2), 0));
        if (arrayListA == null) {
            return null;
        }
        return new ArrayList(arrayListA);
    }

    public final byte[] i(int i) throws ResourceParserException {
        return XmlReader.preProcessXml(b78.a().getResources().getXml(i));
    }
}
