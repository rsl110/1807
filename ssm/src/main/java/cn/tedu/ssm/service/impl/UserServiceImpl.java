package cn.tedu.ssm.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ssm.mapper.UserMapper;
import cn.tedu.ssm.pojo.User;
import cn.tedu.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	public List<User> findAll(){
		return userMapper.findAll();
	}
	@Override
	public User getById(Integer id) {
		
		return userMapper.getById(id);
	}
	@Override
	public void add(User user) {
		userMapper.add(user);
		
	}
	@Override
	public void updateById(Integer id, String name, Date birthday, String address) {
		userMapper.updateById( id,  name, birthday, address);
		
	}
	@Override
	public void deleteById(Integer id) {
		userMapper.deleteById(id);
		
	}

}
