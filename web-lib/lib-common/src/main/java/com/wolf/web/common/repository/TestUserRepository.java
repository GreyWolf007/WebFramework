package com.wolf.web.common.repository;

import com.wolf.web.common.domain.dto.TestUserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: GreyWolf
 * @create: 2018/11/13 09:30
 **/
@Mapper
public interface TestUserRepository {
    List<TestUserDto> load(@Param("id") int id, @Param("name") String name);

    List<TestUserDto> list();

    int insert(TestUserDto user);

    int update(TestUserDto user);

    int delete(@Param("id") int id);
}
