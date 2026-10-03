package com.heytap.store.db.entity;

/* JADX INFO: loaded from: classes4.dex */
public class Condition {
    private final StringBuilder mBuilder;

    public Condition(String str) {
        StringBuilder sb = new StringBuilder();
        this.mBuilder = sb;
        sb.append(oneCondition(str));
    }

    private String andCondition(String str) {
        return String.format(" AND (%s)", str);
    }

    private String oneCondition(String str) {
        return String.format("(%s)", str);
    }

    private String orCondition(String str) {
        return String.format(" OR (%s)", str);
    }

    public Condition appendAnd(String str) {
        this.mBuilder.append(andCondition(str));
        return this;
    }

    public Condition appendOr(String str) {
        this.mBuilder.append(orCondition(str));
        return this;
    }

    public void clear() {
        StringBuilder sb = this.mBuilder;
        sb.delete(0, sb.length());
    }

    public String toString() {
        return this.mBuilder.toString();
    }

    private static String oneCondition(String str, int i) {
        return String.format("(%s=%d)", str, Integer.valueOf(i));
    }

    public Condition appendAnd(String str, int i) {
        return appendAnd(oneCondition(str, i));
    }

    public Condition appendOr(String str, int i) {
        return appendOr(oneCondition(str, i));
    }

    private static String oneCondition(String str, long j2) {
        return String.format("(%s=%d)", str, Long.valueOf(j2));
    }

    public Condition(String str, int i) {
        this(oneCondition(str, i));
    }

    private static String oneCondition(String str, String str2) {
        return String.format("(%s='%s')", str, str2);
    }

    public Condition appendAnd(String str, long j2) {
        return appendAnd(oneCondition(str, j2));
    }

    public Condition appendOr(String str, long j2) {
        return appendOr(oneCondition(str, j2));
    }

    public Condition(String str, long j2) {
        this(oneCondition(str, j2));
    }

    public Condition(String str, String str2) {
        this(oneCondition(str, str2));
    }

    public Condition appendAnd(String str, String str2) {
        return appendAnd(oneCondition(str, str2));
    }

    public Condition appendOr(String str, String str2) {
        return appendOr(oneCondition(str, str2));
    }
}
