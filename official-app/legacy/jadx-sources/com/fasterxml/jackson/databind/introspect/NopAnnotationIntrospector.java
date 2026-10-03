package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.oplus.aiunit.vision.k3e;

/* JADX INFO: loaded from: classes13.dex */
public abstract class NopAnnotationIntrospector extends AnnotationIntrospector {
    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() { // from class: com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector.1
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector, com.fasterxml.jackson.databind.AnnotationIntrospector
        public Version version() {
            return k3e.VERSION;
        }
    };
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Version version() {
        return Version.unknownVersion();
    }
}
