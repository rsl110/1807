package cn.tedu.ssm.service;

import java.util.Date;
import java.util.List;

import cn.tedu.ssm.pojo.User;

public interface UserService {
	public List<User> findAll();

	public User getById(Integer id);

	public void add(User user);

	public void updateById(Integer id, String name, Date birthday, String address);

	public void deleteById(Integer id);
}
