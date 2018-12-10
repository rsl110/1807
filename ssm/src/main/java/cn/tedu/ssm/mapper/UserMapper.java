package cn.tedu.ssm.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.ssm.pojo.User;

public interface UserMapper{
	public List<User> findAll();
	@Select("select * from user where id = #{id}")
	public User getById(Integer id);
	@Insert("insert into user(name,birthday,address) values(#{name},#{birthday},#{address})")
	public void add(User user);
	@Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
	public void updateById(@Param("id")Integer id, 
			@Param("name")String name,
			@Param("birthday")Date birthday, 
			@Param("address")String address);
	@Delete("delete from user where id =#{id}")
	public void deleteById(@Param("id")Integer id);
}
