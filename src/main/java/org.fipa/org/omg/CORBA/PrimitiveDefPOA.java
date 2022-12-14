package org.omg.CORBA;


/**
* org/omg/CORBA/PrimitiveDefPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public abstract class PrimitiveDefPOA extends org.omg.PortableServer.Servant
 implements org.omg.CORBA.PrimitiveDefOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_kind", new java.lang.Integer (0));
    _methods.put ("_get_type", new java.lang.Integer (1));
    _methods.put ("_get_def_kind", new java.lang.Integer (2));
    _methods.put ("destroy", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // org/omg/CORBA/PrimitiveDef/_get_kind
       {
         org.omg.CORBA.PrimitiveKind $result = null;
         $result = this.kind ();
         out = $rh.createReply();
         org.omg.CORBA.PrimitiveKindHelper.write (out, $result);
         break;
       }

       case 1:  // org/omg/CORBA/IDLType/_get_type
       {
         org.omg.CORBA.TypeCode $result = null;
         $result = this.type ();
         out = $rh.createReply();
         out.write_TypeCode ($result);
         break;
       }


  // read interface
       case 2:  // org/omg/CORBA/IRObject/_get_def_kind
       {
         org.omg.CORBA.DefinitionKind $result = null;
         $result = this.def_kind ();
         out = $rh.createReply();
         org.omg.CORBA.DefinitionKindHelper.write (out, $result);
         break;
       }


  // write interface
       case 3:  // org/omg/CORBA/IRObject/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CORBA/PrimitiveDef:1.0", 
    "IDL:CORBA/IDLType:1.0", 
    "IDL:CORBA/IRObject:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PrimitiveDef _this() 
  {
    return PrimitiveDefHelper.narrow(
    super._this_object());
  }

  public PrimitiveDef _this(org.omg.CORBA.ORB orb) 
  {
    return PrimitiveDefHelper.narrow(
    super._this_object(orb));
  }


} // class PrimitiveDefPOA
