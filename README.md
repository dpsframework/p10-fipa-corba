# p10-fipa-corba 
[English](https://github.com/dpsframework/p10-fipa-corba#p10-fipa-corba-1)


## Estado de la propuesta (Finalizada)


- **modified**:  '2022-06-18'
- **status**:  'Finalizado'
- **title**:  'Propuesta: compilar el módulo FIPA con Java JDK-17'
- **subtitle**:  'Propuesta: estudio de integración de librería CORBA utilizada por FIPA y, su posibilidad de adaptar a compilador Java OpenJDK-17'
- **resumen**:  'El módulo FIPA perteneciente a JADE 4.5.4, requiere las librerías de GlassFish CORBA ORB para su compilación. Antes de acometer la migración de JADE 4.5.4 r6867 a Java OpenJDK-17, es necesario comprobar el comportamiento de FIPA con versiones superiores de Java.'



##  Lista de Tareas:

- [x]  \(1) Lograr el cumplimiento del módulo FIPA con las especificaciones del sistema de módulos[^migra17] de la Plataforma Java (JPMS).
- [x]  \(2) Separa el módulo FIPA de JADE y estudiar sus requisitos particulares de compilación con Oracle Java[^java] JDK-11 hasta JDK-17 LTS  y superiores. Estudiar adicionalmente, cómo compilar con versiones de OpenJDK[^openJDK] desde la openJDK-11 hasta la OpenJDK-18.
- [x]  \(3) Modificar los Objetos de FIPA que impiden compilar con versiones superiores. Documentar los cambios y comprobar su integración con la plataforma JADE.
- [x]  \(4) Analizar javax utilizado por FIPA.
- [x]  \(5) Analizar GlassFish CORBA utilizado por FIPA.
- [x]  \(6) Preparar como Repositorio GitHub para su descarga y evaluación.


### Ejemplo de solución aportada para el módulo: `module-info.java` 

```java

module org.fipa {
	exports FIPA to com.tilab.jade;
	
	exports org.omg.CORBA to com.tilab.jade;
	exports org.omg.CosNaming to com.tilab.jade;
	
	requires java.rmi;
	requires java.desktop;
	requires java.base;
}
```

### Cómo compilar desde la Línea de comandos


```shell

Windows:
-----------
dir /s/b *.java   >  sources.txt
javac --module-path org.fipa @sources.txt -d builded/org.fipa -verbose
jar -cvf org.fipa-2002.jar builded/org.fipa/module-info.class -C builded/org.fipa .



GNU and OS-X:    
------------
find . -iname *java -type f   >   sources.txt
javac --module-path org.fipa @sources.txt -d builded/org.fipa -verbose
jar -cvf org.fipa-2002.jar builded/org.fipa/module-info.class -C builded/org.fipa .

  
```


## Descripción de la propuesta

##   Sección 1: Identificación
-  Responsable de la propuesta: FJAC
-  Fecha de la propuesta: Enero, 2022
-  Ubicación de resultados: GitHub

##   Sección 2: Actualización
-  Se utilizan compilador OpenJDK-11 a OpenJDK-18.
-  Se utiliza implementación de FIPA realizada por JADE en 2002.

###  2.1. Descripción de la propuesta:

-  Se propone extraer temporalmente el módulo FIPA del núcleo del desarrollo de la plataforma JADE. Ya que, con la versión actual de Java JDK-18 o superior, ya no es posible compilar JADE. Esto está provocado porque las librerías de CORBA han sido eliminadas del núcleo de las versiones Estándar de Java SE y de la versión de desarrollo Java JDK veriones 17 y superiores. 
-  Una vez realizada la separación FIPA del núcleo de JADE, se podrá conocer el alcance de los cambios necesarios en el módulo FIPA; conocer cuáles son las librerías necesarias de GlassFish de CORBA ORB para alcanzar una estabilidad óptima; y permitir la integración posterior del módulo FIPA con JADE compilado con OpenJDK-17 o superior.

###  2.2. Plataforma de destino
-  Java SE 17, OpenJDK-17 o superior, Java JDK-17 o superior. Esto implica que podrá ser utilizado en entornos de Escritorio o de Servidor, con arquitecturas y sistemas operativos distintos.
  
-  El objetivo final es su integración en JADE 4.5.4, y permanecer a las espera de una futura revisión de JADE.




###  2.3. ¿Qué necesita la propuesta de actualización?
-  Acceso al código del módulo FIPA de la Plataforma JADE. Se encuentra en: <https://jade.tilab.com/svn/jade/trunk/>
-  Un entorno de desarrollo. Se ha empleado Eclipse 2021-12.
-  Una recopilación pormenorizada de los errores que ofrece el compilador OpenJDK-17/ Java JDK-17; su corrección progresiva; la incorporación del Sistema de Módulos de la Plataforma Java para permitir la integración posterior de este módulo FIPA con la plataforma JADE.


###  2.4. ¿Por qué esta propuesta?
-  Porque la evolución del compilador Java, ha eliminado del núcleo de Java, las librerías de CORBA. 
-  Porque no es posible compilar la Plataforma JADE sobre Java OpenJDK-17. El único modo es incorporar las librerías GlassFish CORBA ORB al CLASSPATH. Exigiendo, a su vez, la distribución de JADE con estas librerías concretas.






###  2.5. Tecnología o tecnologías subyacentes:
-  OpenJDK-9 a OpenJDK18.
-  Oracle Java JDK-9 hasta Oracle Java JDK-18.
-  GlassFish CORBA ORB 2.4









###  2.6. ¿Nombre del paquete para la propuesta de API?
-  Archivo: **org-fipa-2002.jar**
-  Paquete: **FIPA**













###  2.7. Dependencias en sistemas operativos específicos
-  Las correspondientes a la versión y arquitectura del compilador de Java.












###  2.8. Cuestiones de seguridad por el modelo de seguridad actual
-  No se han analizado.














###  2.9. ¿Problemas de internacionalización o localización?
-  No se han implementado.















###  2.10. ¿Alguna necesidad de revisión como resultado de este trabajo?
-  No se ha previsto. A la espera de revisión.
















###  2.11. Cronograma para el desarrollo de esta propuesta
-   Inicio: **Enero de 2022**
-   Final: **Julio 2022**
















##   Sección 3: Contribuciones




###  3.1. Documentos, propuestas o implementaciones que describen la tecnología.















###  3.2. Punto de partida de la obra.
-   Módulo FIPA implementado por TILAB, dentro del desarrollo de JADE.



















##   Sección 4: Información Adicional (Opcional)












###  4.1. Información adicional a incluir en la Propuesta de Mejora
-  Otros documentos relevantes incluyen los siguientes documentos FIPA, que se pueden encontrar en http://www.fipa.org
  
1. [FIPA00003] FIPA Agent Communication Language Specification (http://www.fipa.org/fipa00003/),
1. [FIPA00007] FIPA Content Languages Specification (http://www.fipa.org/fipa00007/),
1. [FIPA00008] FIPA SL Content Language Specification (http://www.fipa.org/fipa00008/),
1. [FIPA00009] FIPA CCL Content Language Specification (http://www.fipa.org/fipa00009/),
1. [FIPA00010] FIPA KIF Content Language Specification (http://www.fipa.org/fipa00010/),
1. [FIPA00011] FIPA RDF Content Language Specification (http://www.fipa.org/fipa00011/),
1. [FIPA00067] FIPA Message Transport Service Specification (http://www.fipa.org/fipa00067/),
1. [FIPA00068] FIPA ACL Message Representation Library Specification (http://www.fipa.org/fipa00068/),
1. [FIPA00069] FIPA ACL Message Representation in Bit-efficient Encoding Specification (http://www.fipa.org/fipa00069/),
1. [FIPA00070] FIPA ACL Message Representation in String Specification (http://www.fipa.org/fipa00070 /),
1. [FIPA00071] FIPA ACL Message Representation in XML Specification (http://www.fipa.org/fipa00071/),
1. [FIPA00072] FIPA Agent Message Transport Envelope Representation Library Specification (http://www.fipa.org/fipa00072/),
1. [FIPA00073] FIPA Agent Message Transport Envelope Representation in String Specification (http://www.fipa.org/fipa00073/),
1. [FIPA00074] FIPA Agent Message Transport Protocol Library Specification (http://www.fipa.org/fipa00074/),
1. [FIPA00075] FIPA Agent Message Transport Protocol for IIOP Specification (http://www.fipa.org/fipa00075/),
1. [FIPA00076] FIPA Agent Message Transport Protocol for WAP Specification (http://www.fipa.org/fipa00076/).




 

 


---


# p10-fipa-corba
[Castellano](https://github.com/dpsframework/p10-fipa-corba#p10-fipa-corba)


## Proposal status (COMPLETED)

- **modified**:  '2022-06-18'
- **status**:  'Completed'
- **title**:  'Proposal: compile FIPA module with Java JDK-17'
- **subtitle**:  'Proposal: integration study of the CORBA library used by FIPA and its possibility of adapting to the OpenJDK-17 Java compiler'
- **abstract**:  'The FIPA module belonging to JADE 4.5.4 requires the GlassFish CORBA ORB libraries for its compilation. Before migrating from JADE 4.5.4 r6867 to Java OpenJDK-17, it is necessary to check the behavior of FIPA with higher versions of Java.'


##  To-Do List:
- [x]  \(1) Achieve FIPA module compliance with the Java Platform Module System[^migra17] (JPMS) specifications.
- [x]  \(2) Separate the FIPA module from JADE and study the particular compilation requirements with Oracle Java[^java] JDK-11 through JDK-17 LTS and higher. Further study, how to compile with OpenJDK[^openJDK] versions from openJDK-11 to OpenJDK-18.
- [x]  \(3) Modify the FIPA Objects that prevent compiling with higher versions. Document the changes and check their integration with the JADE platform.
- [x]  \(4) Analyze the javax used by FIPA.
- [x]  \(5) Analyze GlassFish CORBA used by FIPA.
- [x]  \(6) Prepare as a GitHub repository for download and evaluation.



### The proposed module: `module-info.java` 

```java

module org.fipa {
	exports FIPA to com.tilab.jade;
	
	exports org.omg.CORBA to com.tilab.jade;
	exports org.omg.CosNaming to com.tilab.jade;
	
	requires java.rmi;
	requires java.desktop;
	requires java.base;
}
```

### A raw compilation and packaging


```shell

Windows:
-----------
dir /s/b *.java   >  sources.txt
javac --module-path org.fipa @sources.txt -d builded/org.fipa -verbose
jar -cvf org.fipa-2002.jar builded/org.fipa/module-info.class -C builded/org.fipa .



GNU and OS-X:    
------------
find . -iname *java -type f   >   sources.txt
javac --module-path org.fipa @sources.txt -d builded/org.fipa -verbose
jar -cvf org.fipa-2002.jar builded/org.fipa/module-info.class -C builded/org.fipa .

  
```


## Proposal description
 

##   Section 1: Identification
-  Responsible for the proposal: FJAC
-  Proposal date: January, 2022.
-  Results location: GitHub

##   Section 2: Update
-  OpenJDK-11 to OpenJDK-18 compiler are used.
-  FIPA implementation made by JADE in 2002 is used.

###  2.1. Description of the proposal:

-  It is proposed to temporarily extract the FIPA module from the core of the JADE platform development. Since, with the current version of Java JDK-18 or higher, it is no longer possible to compile JADE. This is caused because the CORBA libraries have been removed from the core of the Java SE Standard releases and the Java JDK development release versions 17 and higher.
-  Once the FIPA separation of the JADE core has been carried out, it will be possible to know the scope of the necessary changes in the FIPA module; know which are the necessary libraries of GlassFish of CORBA ORB to achieve optimal stability; and allow later integration of the FIPA module with JADE compiled with OpenJDK-17 or higher.

###  2.2. Target platform
-  Java SE 17, OpenJDK-17 or higher, Java JDK-17 or higher. This implies that it can be used in Desktop or Server environments, with different architectures and operating systems.
  
-  The final objective is its integration in JADE 4.5.4, and to wait for a future revision of JADE.




###  23. What does the update proposal need?
-  Access to the code of the FIPA module of the JADE Platform. Found at: <https://jade.tilab.com/svn/jade/trunk/>
-  A development environment. Eclipse 2021-12 has been used.
-  A detailed compilation of the errors offered by the OpenJDK-17/ Java JDK-17 compiler; its progressive correction; the incorporation of the Java Platform Module System to allow later integration of this FIPA module with the JADE platform.


###  2.4. Why this proposal?
-  Because the evolution of the Java compiler has removed the CORBA libraries from the Java core.
-  Because it is not possible to compile the JADE Platform on top of Java OpenJDK-17. The only way is to add the GlassFish CORBA ORB libraries to the CLASSPATH. Requiring, in turn, the distribution of JADE with these specific libraries.






###  2.5. Underlying technology or technologies:
-  OpenJDK-9 to OpenJDK18.
-  Oracle Java JDK-9 through Oracle Java JDK-18.
-  GlassFish CORBA ORB 2.4









###  2.6. Package name for API proposal?
-  File: **org-fipa-2002.jar**
-  Package: **FIPA**













###  2.7. Dependencies on specific operating systems
-  Those corresponding to the version and architecture of the Java compiler.












###  2.8. Security issues due to the current security model
-  They have not been analyzed.














###  2.9. Internationalization or localization problems?
-  They have not been implemented.















###  2.10. Any need for revision as a result of this work?
-  It has not been planned. Awaiting review.
















###  2.11. Schedule for the development of this proposal
-   Start: **January 2022**
-   End: **July 2022**
















##   Section 3: Contributions




###  3.1. Documents, proposals or implementations that describe the technology.















###  3.2. Starting point of the work.
-   FIPA module implemented by TILAB, within the development of JADE.



















##   Section 4: Additional Information (Optional)












###  4.1. Additional information to include in the Improvement Proposal
-  Other relevant documents include the following FIPA documents, which can be found at http://www.fipa.org
  
1. [FIPA00003] FIPA Agent Communication Language Specification (http://www.fipa.org/fipa00003/),
1. [FIPA00007] FIPA Content Languages Specification (http://www.fipa.org/fipa00007/),
1. [FIPA00008] FIPA SL Content Language Specification (http://www.fipa.org/fipa00008/),
1. [FIPA00009] FIPA CCL Content Language Specification (http://www.fipa.org/fipa00009/),
1. [FIPA00010] FIPA KIF Content Language Specification (http://www.fipa.org/fipa00010/),
1. [FIPA00011] FIPA RDF Content Language Specification (http://www.fipa.org/fipa00011/),
1. [FIPA00067] FIPA Message Transport Service Specification (http://www.fipa.org/fipa00067/),
1. [FIPA00068] FIPA ACL Message Representation Library Specification (http://www.fipa.org/fipa00068/),
1. [FIPA00069] FIPA ACL Message Representation in Bit-efficient Encoding Specification (http://www.fipa.org/fipa00069/),
1. [FIPA00070] FIPA ACL Message Representation in String Specification (http://www.fipa.org/fipa00070 /),
1. [FIPA00071] FIPA ACL Message Representation in XML Specification (http://www.fipa.org/fipa00071/),
1. [FIPA00072] FIPA Agent Message Transport Envelope Representation Library Specification (http://www.fipa.org/fipa00072/),
1. [FIPA00073] FIPA Agent Message Transport Envelope Representation in String Specification (http://www.fipa.org/fipa00073/),
1. [FIPA00074] FIPA Agent Message Transport Protocol Library Specification (http://www.fipa.org/fipa00074/),
1. [FIPA00075] FIPA Agent Message Transport Protocol for IIOP Specification (http://www.fipa.org/fipa00075/),
1. [FIPA00076] FIPA Agent Message Transport Protocol for WAP Specification (http://www.fipa.org/fipa00076/).




 

 









##  _References_

[^1]: CLIPS Rule Based Programming Language Files. Expert System Tool. Gary, Riley D. (Ed. 2022). URL: https://sourceforge.net/projects/clipsrules/.

[^java]: ORACLE Java 17 is the latest long-term support (LTS) release under Java's six-month release cadence and is the result of extensive collaboration between Oracle engineers and other members of the worldwide Java developer community via the OpenJDK Community and the Java Community Process (JCP). Verificada con la versioón jdk-17.0.3.1 (junio, 2022). https://www.oracle.com/news/announcement/oracle-releases-java-17-2021-09-14/.

[^jade]:    JADE Platform. jade - Revision 6867: /trunk. https://jade.tilab.com/svn/jade/trunk/  Login/passwod: jade/jade. Version 4.5.4 (abril, 2022).

[^migra17]: Significant Changes in JDK 17 Release. Notes for additional descriptions of the new features and enhancements, and API specification in JDK 17. Updates in Java SE 17 and JDK 17: https://docs.oracle.com/en/java/javase/17/migrate/significant-changes-jdk-release.html

[^openJDK]: OpenJDK 17 is the open-source reference implementation of version 17 of the Java SE Platform, as specified by by JSR 390 in the Java Community Process. JDK 17 reached General Availability on 14 September 2021. URL for OpenJDK-11 is: https://openjdk.java.net/projects/jdk/11/. URL for OpenJDK-17 is: https://openjdk.java.net/projects/jdk/17/.

[^cool]: COOL is the acronym for CLIPS Object Oriented Language.





