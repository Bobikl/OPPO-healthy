package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: loaded from: classes13.dex */
public interface fug {

    public static class a implements fug {
        @Override // com.oplus.aiunit.vision.fug
        public yla<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, oc1 oc1Var, wdk wdkVar, yla<Object> ylaVar) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.fug
        public yla<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, oc1 oc1Var, wdk wdkVar, yla<Object> ylaVar) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.fug
        public yla<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, oc1 oc1Var, wdk wdkVar, yla<Object> ylaVar) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.fug
        public yla<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, oc1 oc1Var, yla<Object> ylaVar, wdk wdkVar, yla<Object> ylaVar2) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.fug
        public yla<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, oc1 oc1Var, yla<Object> ylaVar, wdk wdkVar, yla<Object> ylaVar2) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.fug
        public yla<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, oc1 oc1Var, wdk wdkVar, yla<Object> ylaVar) {
            return findSerializer(serializationConfig, referenceType, oc1Var);
        }

        @Override // com.oplus.aiunit.vision.fug
        public yla<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, oc1 oc1Var) {
            return null;
        }
    }

    yla<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, oc1 oc1Var, wdk wdkVar, yla<Object> ylaVar);

    yla<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, oc1 oc1Var, wdk wdkVar, yla<Object> ylaVar);

    yla<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, oc1 oc1Var, wdk wdkVar, yla<Object> ylaVar);

    yla<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, oc1 oc1Var, yla<Object> ylaVar, wdk wdkVar, yla<Object> ylaVar2);

    yla<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, oc1 oc1Var, yla<Object> ylaVar, wdk wdkVar, yla<Object> ylaVar2);

    yla<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, oc1 oc1Var, wdk wdkVar, yla<Object> ylaVar);

    yla<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, oc1 oc1Var);
}
