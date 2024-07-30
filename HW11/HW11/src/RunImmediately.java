import java.lang.annotation.ElementType;
//Enum that declares the possible kinds of elements an annotation type can be applied to. Examples include TYPE, FIELD, METHOD, etc.
//Other possible targets include TYPE (class, interface, enum), FIELD (field), PARAMETER (parameter), etc.

import java.lang.annotation.Retention;
//Retention: Annotation that specifies how long annotations with the annotated type are to be retained.

import java.lang.annotation.RetentionPolicy;
//RetentionPolicy: Enum that specifies the possible retention policies for annotations: SOURCE, CLASS, and RUNTIME.
//RUNTIME: This means the annotation is available at runtime.
// Other retention policies are SOURCE (discarded during the compile process)
// and CLASS (retained in the .class file but not available at runtime).

import java.lang.annotation.Target;
//Target: Annotation that marks another annotation to restrict what kind of Java elements the annotation can be applied to.


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunImmediately {

    int times();
}
