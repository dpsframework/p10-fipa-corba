package org.omg.IOP.CodecFactoryPackage;

/**
* org/omg/IOP/CodecFactoryPackage/UnknownEncodingHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/IOP.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class UnknownEncodingHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.CodecFactoryPackage.UnknownEncoding value = null;

  public UnknownEncodingHolder ()
  {
  }

  public UnknownEncodingHolder (org.omg.IOP.CodecFactoryPackage.UnknownEncoding initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.CodecFactoryPackage.UnknownEncodingHelper.type ();
  }

}
