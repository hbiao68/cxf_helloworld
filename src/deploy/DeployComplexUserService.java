package deploy;

import service.imp.ComplexUserService;


/**
 * <b>function:</b> 发布ComplexUserService服务
 */
public class DeployComplexUserService {
 
    public static void main(String[] args) throws InterruptedException {
        String address = "http://localhost:9000/complexUser";
        DeployUtils.deployService(address, new ComplexUserService());
        Thread.sleep(1000 * 60 * 20);
        System.exit(0);
        System.out.println("Server exit ");
    }
}