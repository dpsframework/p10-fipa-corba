package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/TransactionFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public interface TransactionFactoryOperations 
{
  org.omg.CosTransactions.Control create (int time_out);
  org.omg.CosTransactions.Control recreate (org.omg.CosTransactions.PropagationContext ctx);
} // interface TransactionFactoryOperations
