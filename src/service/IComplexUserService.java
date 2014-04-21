package service;

import javax.jws.WebParam;
import javax.jws.WebService;

import model.User;
import model.Users;
/**
 * <b>function:</b>定制客户端请求WebService所需要的接口
 * endpointInterface 这个一定要说明，因为实现类和定义的接口不是在同一个目录下面，默认是找实现类的目录，这样就会出现请求无效的情况
 */
@WebService(endpointInterface="service.imp.ComplexUserService")
public interface IComplexUserService {
    
    public User getUserByName(@WebParam(name = "name") String name);
    
    public void setUser(User user);
    
    public Users getUsers(int i);
    
    public void setUsers(Users users);
    
    public Users getUserArray(int i);
    
    public void setUserArray(Users users);
    
    public void setUserMap(Users maps);
    
    public Users getUserMap();
}