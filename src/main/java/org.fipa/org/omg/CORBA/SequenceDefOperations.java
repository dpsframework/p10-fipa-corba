package org.omg.CORBA;


/**
* org/omg/CORBA/SequenceDefOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public interface SequenceDefOperations  extends org.omg.CORBA.IDLTypeOperations
{
  int bound ();
  void bound (int newBound);
  org.omg.CORBA.TypeCode element_type ();
  org.omg.CORBA.IDLType element_type_def ();
  void element_type_def (org.omg.CORBA.IDLType newElement_type_def);
} // interface SequenceDefOperations
