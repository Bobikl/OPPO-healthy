package com.oplus.aiunit.vision;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class xi9 extends w5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f18645e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final wi9 a;
    public final Pattern b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18646c;
    public sh1 d;

    public static class b extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            int iC = l8eVar.c();
            CharSequence charSequenceB = l8eVar.b();
            if (l8eVar.d() < 4 && charSequenceB.charAt(iC) == '<') {
                for (int i = 1; i <= 7; i++) {
                    if (i != 7 || !(hhbVar.a().d() instanceof a7e)) {
                        Pattern pattern = xi9.f18645e[i][0];
                        Pattern pattern2 = xi9.f18645e[i][1];
                        if (pattern.matcher(charSequenceB.subSequence(iC, charSequenceB.length())).find()) {
                            return di1.d(new xi9(pattern2)).b(l8eVar.getIndex());
                        }
                    }
                }
            }
            return di1.c();
        }
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void e(CharSequence charSequence) {
        this.d.a(charSequence);
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f18646c = true;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void g() {
        this.a.n(this.d.b());
        this.d = null;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        if (this.f18646c) {
            return th1.d();
        }
        return (l8eVar.a() && this.b == null) ? th1.d() : th1.b(l8eVar.getIndex());
    }

    public xi9(Pattern pattern) {
        this.a = new wi9();
        this.f18646c = false;
        this.d = new sh1();
        this.b = pattern;
    }
}
