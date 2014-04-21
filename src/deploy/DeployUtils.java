package deploy;

import javax.xml.ws.Endpoint;

/**
 * <b>function:</b> 发布WebService工具类
 */
public final class DeployUtils {
    /**
     * <b>function:</b>发布WebService
     * @author hoojo
     */
    public static void deployService(String address, Object service) {
        System.out.println("Server start ……");
        Endpoint.publish(address, service);
    }
}
