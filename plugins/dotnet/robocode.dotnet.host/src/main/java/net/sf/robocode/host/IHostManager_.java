// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package net.sf.robocode.host;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class IHostManager_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return net.sf.robocode.host.IHostManager_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        net.sf.robocode.host.IHostManager_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __IHostManager extends system.Object implements net.sf.robocode.host.IHostManager {
    
    protected __IHostManager(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    public native void cleanup();
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/Object;Ljava/lang/Object;Lnet/sf/robocode/peer/IRobotPeer;)Ljava/lang/Object;")
    public native java.lang.Object createRobotProxy(robocode.control.RobotSpecification par0, net.sf.robocode.host.RobotStatics par1, net.sf.robocode.peer.IRobotPeer par2);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lnet/sf/robocode/repository/IRobotItem;)[Ljava/lang/String;")
    public native java.lang.String[] getReferencedClasses(net.sf.robocode.repository.IRobotItem par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lnet/sf/robocode/repository/IRobotItem;ZZ)Lnet/sf/robocode/repository/RobotType;")
    public native net.sf.robocode.repository.RobotType getRobotType(net.sf.robocode.repository.IRobotItem par0, boolean par1, boolean par2);
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    public native void initSecurity();
    
    @net.sf.jni4net.attributes.ClrMethod("()J")
    public native long getRobotFilesystemQuota();
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    public native void resetThreadManager();
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/Object;)V")
    public native void addSafeThread(java.lang.Thread par0);
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/Object;)V")
    public native void removeSafeThread(java.lang.Thread par0);
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/io/PrintStream;")
    public native java.io.PrintStream getRobotOutputStream();
}
//</generated-proxy>
