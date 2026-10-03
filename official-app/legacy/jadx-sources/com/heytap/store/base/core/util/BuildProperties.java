package com.heytap.store.base.core.util;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class BuildProperties {
    private static BuildProperties ourInstance;
    private final Properties properties;

    private BuildProperties() throws IOException {
        Properties properties = new Properties();
        this.properties = properties;
        properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
    }

    public static BuildProperties getInstance() throws IOException {
        if (ourInstance == null) {
            ourInstance = new BuildProperties();
        }
        return ourInstance;
    }

    public boolean containsKey(Object obj) {
        return this.properties.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.properties.containsValue(obj);
    }

    public Set<Map.Entry<Object, Object>> entrySet() {
        return this.properties.entrySet();
    }

    public String getProperty(String str) {
        return this.properties.getProperty(str);
    }

    public boolean isEmpty() {
        return this.properties.isEmpty();
    }

    public Set keySet() {
        return this.properties.keySet();
    }

    public Enumeration keys() {
        return this.properties.keys();
    }

    public int size() {
        return this.properties.size();
    }

    public Collection values() {
        return this.properties.values();
    }

    public String getProperty(String str, String str2) {
        return this.properties.getProperty(str, str2);
    }
}
