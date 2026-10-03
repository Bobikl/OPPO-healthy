package com.oplus.aiunit.vision;

import com.oplus.weatherservicesdk.data.Weather;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.ParseException;

/* JADX INFO: loaded from: classes11.dex */
public class mdb {
    public static HashMap<String, mdb> Commands = new HashMap<>(300);
    public static HashMap<String, Object> Packages = new HashMap<>();
    public Object a;
    public Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14034c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14035e;

    public mdb(Object obj, Method method, int i) {
        this.d = false;
        this.a = obj;
        this.b = method;
        this.f14034c = i;
    }

    public Object a(wpj wpjVar, String[] strArr) throws ParseException {
        try {
            return this.b.invoke(this.a, wpjVar, strArr);
        } catch (IllegalAccessException e2) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + wpjVar.r() + ":" + wpjVar.h() + Weather.SEPARATOR, e2);
        } catch (IllegalArgumentException e3) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + wpjVar.r() + ":" + wpjVar.h() + Weather.SEPARATOR, e3);
        } catch (InvocationTargetException e4) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + wpjVar.r() + ":" + wpjVar.h() + Weather.SEPARATOR + e4.getCause().getMessage());
        }
    }

    public mdb(int i, int i2) {
        this((Object) null, (Method) null, i);
        this.d = true;
        this.f14035e = i2;
    }

    public mdb(int i) {
        this((Object) null, (Method) null, i);
    }

    public mdb(String str, String str2, float f) {
        this.d = false;
        int i = (int) f;
        Class<?>[] clsArr = {wpj.class, String[].class};
        try {
            Object objNewInstance = Packages.get(str);
            if (objNewInstance == null) {
                objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
                Packages.put(str, objNewInstance);
            }
            this.a = objNewInstance;
            this.b = objNewInstance.getClass().getDeclaredMethod(str2, clsArr);
            this.f14034c = i;
        } catch (Exception e2) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e2.toString());
        }
    }

    public mdb(String str, String str2, float f, float f2) {
        this.d = false;
        int i = (int) f;
        Class<?>[] clsArr = {wpj.class, String[].class};
        try {
            Object objNewInstance = Packages.get(str);
            if (objNewInstance == null) {
                objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
                Packages.put(str, objNewInstance);
            }
            this.a = objNewInstance;
            this.b = objNewInstance.getClass().getDeclaredMethod(str2, clsArr);
            this.f14034c = i;
            this.d = true;
            this.f14035e = (int) f2;
        } catch (Exception e2) {
            System.err.println("Cannot load package " + str + ":");
            System.err.println(e2.toString());
        }
    }
}
