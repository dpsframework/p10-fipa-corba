package org.omg.PortableServer;


/**
* org/omg/PortableServer/ImplicitActivationPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
         * This policy specifies whether implicit activation 
         * of servants is supported in the created POA.
         */
public interface ImplicitActivationPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
           * specifies the policy value
           */
  org.omg.PortableServer.ImplicitActivationPolicyValue value ();
} // interface ImplicitActivationPolicyOperations
