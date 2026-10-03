package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: loaded from: classes13.dex */
public interface k95 {

    public static abstract class a implements k95 {
        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, oc1 oc1Var, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, oc1 oc1Var) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, oc1 oc1Var, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, oc1 oc1Var, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, oc1 oc1Var) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, oc1 oc1Var, yna ynaVar, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, oc1 oc1Var, yna ynaVar, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, oc1 oc1Var, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException {
            return null;
        }

        @Override // com.oplus.aiunit.vision.k95
        public lka<?> findTreeNodeDeserializer(Class<? extends ela> cls, DeserializationConfig deserializationConfig, oc1 oc1Var) throws JsonMappingException {
            return null;
        }
    }

    lka<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, oc1 oc1Var, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException;

    lka<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, oc1 oc1Var) throws JsonMappingException;

    lka<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, oc1 oc1Var, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException;

    lka<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, oc1 oc1Var, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException;

    lka<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, oc1 oc1Var) throws JsonMappingException;

    lka<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, oc1 oc1Var, yna ynaVar, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException;

    lka<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, oc1 oc1Var, yna ynaVar, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException;

    lka<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, oc1 oc1Var, mdk mdkVar, lka<?> lkaVar) throws JsonMappingException;

    lka<?> findTreeNodeDeserializer(Class<? extends ela> cls, DeserializationConfig deserializationConfig, oc1 oc1Var) throws JsonMappingException;
}
