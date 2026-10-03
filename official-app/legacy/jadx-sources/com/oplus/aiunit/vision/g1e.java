package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes11.dex */
public class g1e implements f1e {
    public Hashtable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Vector f11591j;

    public g1e(Hashtable hashtable, Vector vector) {
        this.i = hashtable;
        this.f11591j = vector;
    }

    public void a(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object object = objectInputStream.readObject();
        if (object instanceof Hashtable) {
            this.i = (Hashtable) object;
            this.f11591j = (Vector) objectInputStream.readObject();
        } else {
            j1 j1Var = new j1((byte[]) object);
            while (true) {
                n1 n1Var = (n1) j1Var.s();
                if (n1Var == null) {
                    return;
                } else {
                    setBagAttribute(n1Var, j1Var.s());
                }
            }
        }
    }

    public void b(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.f11591j.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        q1 q1Var = new q1(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            n1 n1Var = (n1) bagAttributeKeys.nextElement();
            q1Var.j(n1Var);
            q1Var.j((f1) this.i.get(n1Var));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }

    @Override // com.oplus.aiunit.vision.f1e
    public f1 getBagAttribute(n1 n1Var) {
        return (f1) this.i.get(n1Var);
    }

    @Override // com.oplus.aiunit.vision.f1e
    public Enumeration getBagAttributeKeys() {
        return this.f11591j.elements();
    }

    @Override // com.oplus.aiunit.vision.f1e
    public void setBagAttribute(n1 n1Var, f1 f1Var) {
        if (this.i.containsKey(n1Var)) {
            this.i.put(n1Var, f1Var);
        } else {
            this.i.put(n1Var, f1Var);
            this.f11591j.addElement(n1Var);
        }
    }

    public g1e() {
        this(new Hashtable(), new Vector());
    }
}
