package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.oplus.aiunit.vision.a60;
import com.oplus.aiunit.vision.cbd;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.vdk;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AnnotationIntrospector implements Serializable {

    public static class ReferenceProperty {
        public final Type a;
        public final String b;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this.a = type;
            this.b = str;
        }

        public static ReferenceProperty a(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public static ReferenceProperty e(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        public String b() {
            return this.b;
        }

        public boolean c() {
            return this.a == Type.BACK_REFERENCE;
        }

        public boolean d() {
            return this.a == Type.MANAGED_REFERENCE;
        }
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public <A extends Annotation> A _findAnnotation(a60 a60Var, Class<A> cls) {
        return (A) a60Var.getAnnotation(cls);
    }

    public boolean _hasAnnotation(a60 a60Var, Class<? extends Annotation> cls) {
        return a60Var.hasAnnotation(cls);
    }

    public boolean _hasOneOf(a60 a60Var, Class<? extends Annotation>[] clsArr) {
        return a60Var.hasOneOf(clsArr);
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, List<BeanPropertyWriter> list) {
    }

    public VisibilityChecker<?> findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.a aVar, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public String findClassDescription(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Object findContentDeserializer(a60 a60Var) {
        return null;
    }

    public Object findContentSerializer(a60 a60Var) {
        return null;
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, a60 a60Var) {
        if (!hasCreatorAnnotation(a60Var)) {
            return null;
        }
        JsonCreator.Mode modeFindCreatorBinding = findCreatorBinding(a60Var);
        return modeFindCreatorBinding == null ? JsonCreator.Mode.DEFAULT : modeFindCreatorBinding;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(a60 a60Var) {
        return null;
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(a60 a60Var, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(a60 a60Var) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(a60 a60Var, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(a60 a60Var, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(a60 a60Var) {
        return null;
    }

    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    @Deprecated
    public String findEnumValue(Enum<?> r1) {
        return r1.name();
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public Object findFilterId(a60 a60Var) {
        return null;
    }

    public JsonFormat.Value findFormat(a60 a60Var) {
        return JsonFormat.Value.empty();
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = findInjectableValueId(annotatedMember);
        if (objFindInjectableValueId != null) {
            return JacksonInject.Value.forId(objFindInjectableValueId);
        }
        return null;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(a60 a60Var) {
        return null;
    }

    public Object findKeySerializer(a60 a60Var) {
        return null;
    }

    public Boolean findMergeInfo(a60 a60Var) {
        return null;
    }

    public PropertyName findNameForDeserialization(a60 a60Var) {
        return null;
    }

    public PropertyName findNameForSerialization(a60 a60Var) {
        return null;
    }

    public Object findNamingStrategy(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Object findNullSerializer(a60 a60Var) {
        return null;
    }

    public cbd findObjectIdInfo(a60 a60Var) {
        return null;
    }

    public cbd findObjectReferenceInfo(a60 a60Var, cbd cbdVar) {
        return cbdVar;
    }

    public Class<?> findPOJOBuilder(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public jla.a findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(a60 a60Var, boolean z) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(a60 a60Var) {
        return null;
    }

    public List<PropertyName> findPropertyAliases(a60 a60Var) {
        return null;
    }

    public vdk<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String findPropertyDefaultValue(a60 a60Var) {
        return null;
    }

    public String findPropertyDescription(a60 a60Var) {
        return null;
    }

    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, a60 a60Var) {
        return findPropertyIgnorals(a60Var);
    }

    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(a60 a60Var) {
        return JsonIgnoreProperties.Value.empty();
    }

    public JsonInclude.Value findPropertyInclusion(a60 a60Var) {
        return JsonInclude.Value.empty();
    }

    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, a60 a60Var) {
        return JsonIncludeProperties.Value.all();
    }

    public Integer findPropertyIndex(a60 a60Var) {
        return null;
    }

    public vdk<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    public PropertyName findRootName(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(a60 a60Var, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(a60 a60Var) {
        return null;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(a60 a60Var, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(a60 a60Var, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(a60 a60Var, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(a60 a60Var) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(a60 a60Var) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(a60 a60Var) {
        return null;
    }

    public Object findSerializer(a60 a60Var) {
        return null;
    }

    public JsonSetter.Value findSetterInfo(a60 a60Var) {
        return JsonSetter.Value.empty();
    }

    public List<NamedType> findSubtypes(a60 a60Var) {
        return null;
    }

    public String findTypeName(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public vdk<?> findTypeResolver(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Class<?>[] findViews(a60 a60Var) {
        return null;
    }

    public PropertyName findWrapperName(a60 a60Var) {
        return null;
    }

    public Boolean hasAnyGetter(a60 a60Var) {
        if ((a60Var instanceof AnnotatedMethod) && hasAnyGetterAnnotation((AnnotatedMethod) a60Var)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAnySetter(a60 a60Var) {
        return null;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, a60 a60Var) {
        return null;
    }

    public Boolean hasAsValue(a60 a60Var) {
        if ((a60Var instanceof AnnotatedMethod) && hasAsValueAnnotation((AnnotatedMethod) a60Var)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(a60 a60Var) {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, a60 a60Var, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, a60 a60Var, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public abstract Version version();

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        collection.add(this);
        return collection;
    }
}
