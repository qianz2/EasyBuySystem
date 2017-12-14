package cn.easybuy.dao.order;

import java.util.List;

import cn.easybuy.dao.IBaseDao;
import cn.easybuy.entity.UserAddress;
import cn.easybuy.param.UserAddressParam;

/**
 * addObject(UserAddress userAddress)
 * getRowList(params)
 */
public interface UserAddressDao extends IBaseDao {
	
	public List<UserAddress> queryUserAddressList(UserAddressParam param);
	
	public Integer saveUserAddress(UserAddress userAddress);
	
	public UserAddress getUserAddressById(Integer addressId);

}
