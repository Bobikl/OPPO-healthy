package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: loaded from: classes13.dex */
public interface rka extends qka {

    public static class a implements rka {
        public eug a;

        public a(eug eugVar) {
            this.a = eugVar;
        }

        @Override // com.oplus.aiunit.vision.rka
        public yka a(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.rka
        public bla d(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.rka
        public bma e(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.rka
        public fla g(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.qka
        public eug getProvider() {
            return this.a;
        }

        @Override // com.oplus.aiunit.vision.qka
        public void i(eug eugVar) {
            this.a = eugVar;
        }

        @Override // com.oplus.aiunit.vision.rka
        public xja j(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.rka
        public gla k(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.rka
        public bka l(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.rka
        public dka m(JavaType javaType) throws JsonMappingException {
            return null;
        }
    }

    yka a(JavaType javaType) throws JsonMappingException;

    hla c(JavaType javaType) throws JsonMappingException;

    bla d(JavaType javaType) throws JsonMappingException;

    bma e(JavaType javaType) throws JsonMappingException;

    fla g(JavaType javaType) throws JsonMappingException;

    xja j(JavaType javaType) throws JsonMappingException;

    gla k(JavaType javaType) throws JsonMappingException;

    bka l(JavaType javaType) throws JsonMappingException;

    dka m(JavaType javaType) throws JsonMappingException;
}
