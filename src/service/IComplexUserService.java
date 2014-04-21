package service;

import javax.jws.WebParam;
import javax.jws.WebService;

import model.User;
import model.Users;
/**
 * <b>function:</b>定制客户端请求WebService所需要的接口
 */
@WebService
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