# p10-fipa-corba: <br>Módulo FIPA perteneciente a JADE 4.5.x: propuesta de actualización a OpenJDK-18 y Java Platform Module System con GlassFish CORBA ORB embebido.

- [English version here..](README_en.md)

La descripción completa de esta propuesta de actualización se puede encontrar en:

- <https://dpsframework.org/proposals/P10-FIPA-CORBA_en.html>




## 1. Antecedentes

### 1.1. Descripción de la propuesta

- Se propone extraer temporalmente el módulo FIPA del núcleo de desarrollo de la plataforma JADE. Ya que, con la versión actual de Java JDK-17 o superior, ya no es posible compilar JADE. Esto se debe a que las bibliotecas CORBA se eliminaron del núcleo de las versiones estándar de Java SE y las versiones de desarrollo de Java JDK-17 y posteriores.

- Una vez realizada la separación FIPA del núcleo JADE, se podrá conocer el alcance de los cambios necesarios en el módulo FIPA; saber cuáles son las bibliotecas de GlassFish de CORBA ORB necesarias para lograr una estabilidad óptima; y permitir la integración posterior del módulo FIPA con JADE compilado con OpenJDK-17 o superior.


## 1.2 Un ejemplo del módulo propuesto: `module-info.java`

```java
/**
 * JADE Revisión 6868 versión 4.5.4. por Enrico Scagliotti y Giovanni Caire.
 * Fuente: https://jade.tilab.com/svn/jade/trunk
 * Revisión: 6868
 * Autor: caire
 * Fecha: jueves, 14 de julio de 2022 11:06:20
 * Mensaje: Se registró correctamente el seguimiento de la pila cuando se produce un error inesperado al crear un agente.
 * Modificado: /trunk/src/jade/core/management/AgentManagementService.java
 * ---
 * Revisión: 6867
 * Autor: scagliotti
 * Fecha: viernes, 29 de abril de 2022 12:07:55
 * Mensaje: Versión actualizada a 4.5.4
 * Modificado: /trunk/build.properties
 * ---
 * Esta propuesta: P10-FIPA-CORBA https://dpsframework.org/proposals/P10-FIPA-CORBA_en.html
 * Fuente en: GitHub https://github.com/dpsframework/p10-fipa-corba
 * CORBA en: https://repo1.maven.org/maven2/org/glassfish/corba/glassfish-corba-omgapi/4.1.0/
 * glassfish-corba-omgapi-4.1.0-sources.jar 2017-07-14 15:15 1470786
 */
módulo org.fipa {
exporta FIPA a com.tilab.jade;

exporta org.omg.CORBA a com.tilab.jade;
exporta org.omg.CosNaming a com.tilab.jade;

requiere java.rmi;
requiere java.desktop;
requiere java.base;
}

```

### 1.3. Recopilación y empaquetado en bruto



```shell

Windows:
-----------
dir /s/b *.java > sources.txt
javac --module-path org.fipa @sources.txt -d built/org.fipa -verbose
jar -cvf org.fipa-2002.jar builded/org.fipa/module-info.class -C built/org.fipa .



GNU y OS-X:
------------
find . -iname *java -type f > sources.txt
javac --module-path org.fipa @sources.txt -d built/org.fipa -verbose
jar -cvf org.fipa-2002.jar builded/org.fipa/module-info.class -C built/org.fipa .

  
```



