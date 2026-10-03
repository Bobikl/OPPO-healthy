package com.squareup.javapoet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.lang.model.SourceVersion;

/* JADX INFO: loaded from: classes10.dex */
public final class NameAllocator implements Cloneable {
    private final Set<String> allocatedNames;
    private final Map<Object, String> tagToName;

    public NameAllocator() {
        this(new LinkedHashSet(), new LinkedHashMap());
    }

    public static String toJavaIdentifier(String str) {
        StringBuilder sb = new StringBuilder();
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCharCount == 0 && !Character.isJavaIdentifierStart(iCodePointAt) && Character.isJavaIdentifierPart(iCodePointAt)) {
                sb.append("_");
            }
            sb.appendCodePoint(Character.isJavaIdentifierPart(iCodePointAt) ? iCodePointAt : 95);
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb.toString();
    }

    public String get(Object obj) {
        String str = this.tagToName.get(obj);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unknown tag: " + obj);
    }

    public String newName(String str) {
        return newName(str, UUID.randomUUID().toString());
    }

    private NameAllocator(LinkedHashSet<String> linkedHashSet, LinkedHashMap<Object, String> linkedHashMap) {
        this.allocatedNames = linkedHashSet;
        this.tagToName = linkedHashMap;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NameAllocator m5269clone() {
        return new NameAllocator(new LinkedHashSet(this.allocatedNames), new LinkedHashMap(this.tagToName));
    }

    public String newName(String str, Object obj) {
        Util.checkNotNull(str, "suggestion", new Object[0]);
        Util.checkNotNull(obj, "tag", new Object[0]);
        String javaIdentifier = toJavaIdentifier(str);
        while (true) {
            if (!SourceVersion.isKeyword(javaIdentifier) && this.allocatedNames.add(javaIdentifier)) {
                break;
            }
            javaIdentifier = javaIdentifier + "_";
        }
        String strPut = this.tagToName.put(obj, javaIdentifier);
        if (strPut == null) {
            return javaIdentifier;
        }
        this.tagToName.put(obj, strPut);
        throw new IllegalArgumentException("tag " + obj + " cannot be used for both '" + strPut + "' and '" + javaIdentifier + "'");
    }
}
