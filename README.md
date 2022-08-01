# p10-fipa-corba

FIPA module belonging to JADE 4.5.4 update proposal to OpenJDK-17 and, Java Platform Module System with built-in GlassFish CORBA ORB.



## Proposed module: `module-info.java`

```java

/**
 * JADE Revision 6868 version 4.5.4. Scagliotti and G. Caire.
 * Source:   https://jade.tilab.com/svn/jade/trunk
 * Revision: 6868
 * Author: caire
 * Date: jueves, 14 de julio de 2022 11:06:20
 * Message: Properly logged the stack-trace when an unexpected error occurs creating an agent.
 * Modified : /trunk/src/jade/core/management/AgentManagementService.java
 * ---
 * Revision: 6867
 * Author: scagliotti
 * Date: viernes, 29 de abril de 2022 12:07:55
 * Message: Upgraded version to 4.5.4
 * Modified : /trunk/build.properties
 * ---
 * Proposal:   P10-FIPA-CORBA   https://dpsframework.org/proposals/P10-FIPA-CORBA_en.html
 * Repository: GitHub           https://github.com/dpsframework/p10-fipa-corba   
 * CORBA:      https://repo1.maven.org/maven2/org/glassfish/corba/glassfish-corba-omgapi/4.1.0/
 *             glassfish-corba-omgapi-4.1.0-sources.jar          2017-07-14 15:15   1470786 
 */
module org.fipa {
	exports FIPA to com.tilab.jade;
	
	exports org.omg.CORBA to com.tilab.jade;
	exports org.omg.CosNaming to com.tilab.jade;
	
	requires java.rmi;
	requires java.desktop;
	requires java.base;
}


```



## How to compile step by step


```shell

  
  dir /s/b *.java > sources.txt
  javac --module-path org.fipa @sources.txt -d builded/classes/org.fipa -verbose
  jar -cvf org.fipa-2002-jdk17.jar builded\classes\org.fipa\module-info.class -C builded\classes\org.fipa .
  
  


```






## OpenJDK-17  Java Problems 



|       |  Description  |  Resource  |  Path  |  Location  |  Type  |  
| :---: |  :---         |  :---      |  :---  |  :---      |  :---  |  
| 1      |  Dictionary is a raw type. References to generic type Dictionary<K,V> should be parameterized  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 2      |  Hashtable is a raw type. References to generic type Hashtable<K,V> should be parameterized  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 3      |  The constructor DynamicImplementation() is deprecated  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 12  |  Java Problem  |  
| 4      |  The constructor Integer(int) is deprecated since version 9  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 23  |  Java Problem  |  
| 5      |  The method op_name() from the type ServerRequest is deprecated  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 27  |  Java Problem  |  
| 6      |  The method params(NVList) from the type ServerRequest is deprecated  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 34  |  Java Problem  |  
| 7      |  The method result(Any) from the type ServerRequest is deprecated  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 40  |  Java Problem  |  
| 8      |  The type Delegate is not exported from this module  |  _MTSStub.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 9      |  The type DynamicImplementation is deprecated  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 9  |  Java Problem  |  
| 10      |  The type InputStream is not exported from this module  |  AgentIDHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 34  |  Java Problem  |  
| 11      |  The type InputStream is not exported from this module  |  AgentIDHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 12      |  The type InputStream is not exported from this module  |  AgentIDsHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 13      |  The type InputStream is not exported from this module  |  AgentIDsHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 14      |  The type InputStream is not exported from this module  |  DateTimeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 23  |  Java Problem  |  
| 15      |  The type InputStream is not exported from this module  |  DateTimeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 16      |  The type InputStream is not exported from this module  |  EnvelopeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 82  |  Java Problem  |  
| 17      |  The type InputStream is not exported from this module  |  EnvelopeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 18      |  The type InputStream is not exported from this module  |  EnvelopesHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 19      |  The type InputStream is not exported from this module  |  EnvelopesHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 20      |  The type InputStream is not exported from this module  |  FipaMessageHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 21      |  The type InputStream is not exported from this module  |  FipaMessageHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 22      |  The type InputStream is not exported from this module  |  MTSHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 16  |  Java Problem  |  
| 23      |  The type InputStream is not exported from this module  |  MTSHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 24      |  The type InputStream is not exported from this module  |  OptAgentIDHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 24  |  Java Problem  |  
| 25      |  The type InputStream is not exported from this module  |  OptAgentIDHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 26      |  The type InputStream is not exported from this module  |  OptDateTimeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 24  |  Java Problem  |  
| 27      |  The type InputStream is not exported from this module  |  OptDateTimeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 28      |  The type InputStream is not exported from this module  |  OptReceivedObjectHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 24  |  Java Problem  |  
| 29      |  The type InputStream is not exported from this module  |  OptReceivedObjectHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 30      |  The type InputStream is not exported from this module  |  OptTransportBehaviourTypeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 27  |  Java Problem  |  
| 31      |  The type InputStream is not exported from this module  |  OptTransportBehaviourTypeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 32      |  The type InputStream is not exported from this module  |  PayloadHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 19  |  Java Problem  |  
| 33      |  The type InputStream is not exported from this module  |  PayloadHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 34      |  The type InputStream is not exported from this module  |  PropertyHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 17  |  Java Problem  |  
| 35      |  The type InputStream is not exported from this module  |  PropertyHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 36      |  The type InputStream is not exported from this module  |  ReceivedObjectHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 20  |  Java Problem  |  
| 37      |  The type InputStream is not exported from this module  |  ReceivedObjectHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 38      |  The type InputStream is not exported from this module  |  TransportBehaviourTypeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 39      |  The type InputStream is not exported from this module  |  TransportBehaviourTypeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 40      |  The type InputStream is not exported from this module  |  URLHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 16  |  Java Problem  |  
| 41      |  The type InputStream is not exported from this module  |  stringsHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 42      |  The type InputStream is not exported from this module  |  stringsHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 25  |  Java Problem  |  
| 43      |  The type OutputStream is not exported from this module  |  AgentIDHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 44      |  The type OutputStream is not exported from this module  |  AgentIDHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 45      |  The type OutputStream is not exported from this module  |  AgentIDsHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 46      |  The type OutputStream is not exported from this module  |  AgentIDsHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 47      |  The type OutputStream is not exported from this module  |  DateTimeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 48      |  The type OutputStream is not exported from this module  |  DateTimeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 49      |  The type OutputStream is not exported from this module  |  EnvelopeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 50      |  The type OutputStream is not exported from this module  |  EnvelopeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 51      |  The type OutputStream is not exported from this module  |  EnvelopesHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 52      |  The type OutputStream is not exported from this module  |  EnvelopesHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 53      |  The type OutputStream is not exported from this module  |  FipaMessageHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 54      |  The type OutputStream is not exported from this module  |  FipaMessageHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 55      |  The type OutputStream is not exported from this module  |  MTSHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 56      |  The type OutputStream is not exported from this module  |  MTSHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 57      |  The type OutputStream is not exported from this module  |  OptAgentIDHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 58      |  The type OutputStream is not exported from this module  |  OptAgentIDHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 59      |  The type OutputStream is not exported from this module  |  OptDateTimeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 60      |  The type OutputStream is not exported from this module  |  OptDateTimeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 61      |  The type OutputStream is not exported from this module  |  OptReceivedObjectHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 62      |  The type OutputStream is not exported from this module  |  OptReceivedObjectHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 63      |  The type OutputStream is not exported from this module  |  OptTransportBehaviourTypeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 64      |  The type OutputStream is not exported from this module  |  OptTransportBehaviourTypeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 65      |  The type OutputStream is not exported from this module  |  PayloadHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 66      |  The type OutputStream is not exported from this module  |  PayloadHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 67      |  The type OutputStream is not exported from this module  |  PropertyHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 68      |  The type OutputStream is not exported from this module  |  PropertyHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 69      |  The type OutputStream is not exported from this module  |  ReceivedObjectHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 70      |  The type OutputStream is not exported from this module  |  ReceivedObjectHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 71      |  The type OutputStream is not exported from this module  |  TransportBehaviourTypeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 72      |  The type OutputStream is not exported from this module  |  TransportBehaviourTypeHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 73      |  The type OutputStream is not exported from this module  |  URLHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 74      |  The type OutputStream is not exported from this module  |  stringsHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 13  |  Java Problem  |  
| 75      |  The type OutputStream is not exported from this module  |  stringsHolder.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 21  |  Java Problem  |  
| 76      |  The value of the local variable _memberCount is not used  |  AgentIDHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 71  |  Java Problem  |  
| 77      |  The value of the local variable _memberCount is not used  |  DateTimeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 46  |  Java Problem  |  
| 78      |  The value of the local variable _memberCount is not used  |  EnvelopeHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 173  |  Java Problem  |  
| 79      |  The value of the local variable _memberCount is not used  |  FipaMessageHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 52  |  Java Problem  |  
| 80      |  The value of the local variable _memberCount is not used  |  PropertyHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 34  |  Java Problem  |  
| 81      |  The value of the local variable _memberCount is not used  |  ReceivedObjectHelper.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 40  |  Java Problem  |  
| 82      |  Type safety: The method put(Object, Object) belongs to the raw type Dictionary. References to generic type Dictionary<K,V> should be parameterized  |  _MTSImplBase.java  |  /org.fipa/src/main/java/org.fipa/FIPA  |  line 23  |  Java Problem  |  



## Testing with

..
