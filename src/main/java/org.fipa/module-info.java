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