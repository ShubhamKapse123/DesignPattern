package com.myclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;

public class DestroySinglton{
/*1. Use the reflection API -- using reflection API we can access private modifier
   solution-> inside contructore throw the exception if object if not null.
  2.Using Serialization
  Solution-> We need implement the readResolve() Method to return object
  3. Enum

  4.Cloning
  solution -> return the same object in overreded method

*/
public static void main(String[] args) throws IOException,ClassNotFoundException,CloneNotSupportedException{
    
// ThreadSafeSinglton bank= ThreadSafeSinglton.getThreadSafeSinglton();
// System.out.println(bank.hashCode());
// Constructor<ThreadSafeSinglton> con=ThreadSafeSinglton.class.getDeclaredConstructors();
// con.setAccessible(true);
// ThreadSafeSinglton s2=con.newInstance();
// System.out.println(s2.hashCode());

ThreadSafeSinglton s1= ThreadSafeSinglton.getThreadSafeSinglton();
ObjectOutputStream ous= new ObjectOutputStream(new FileOutputStream("abc.ob"));
ous.writeObject(s1);


ObjectInputStream ois= new ObjectInputStream(new FileInputStream("abc.ob"));
ThreadSafeSinglton s2=(ThreadSafeSinglton)ois.readObject();

//System.out.print(s1.equals(s2));

// ThreadSafeSinglton s3=(ThreadSafeSinglton)s1.clone();

// System.out.print(s1.equals(s3));

}
}