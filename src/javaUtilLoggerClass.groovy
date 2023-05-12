import groovy.util.logging.Log

/**
 * Sample Groovy class using {@code @Log} to inject java.util.logging logger
 * into the class.
 */
@Log
class JavaUtilLoggerClass
{
   /**
    * Constructor.
    */
   public JavaUtilLoggerClass()
   {
      println "\njava.util.logging (${log.name}: ${log.class}):"
      log.info "${this.printAndReturnValue(1)}"
      log.finer "${this.printAndReturnValue(2)}"
   }

   /**
    * Print provided value and then return it as part of String indicating part
    * of JDK's java.util.logging.
    *
    * @param newValue Value to be printed and included in return String.
    * @return String indicating newValue and JDK for java.util.logging.
    */
   public String printAndReturnValue(int newValue)
   {
      println "JDK: Print method invoked for ${newValue}"
      return "JDK: ${newValue}"
   }
}
