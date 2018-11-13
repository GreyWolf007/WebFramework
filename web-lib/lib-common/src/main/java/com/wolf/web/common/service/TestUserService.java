package com.wolf.web.common.service;

import com.wolf.web.common.domain.dto.TestUserDto;
import com.wolf.web.common.exception.CommonException;
import com.wolf.web.common.repository.TestUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: GreyWolf
 * @create: 2018/11/13 09:36
 **/
@Service
public class TestUserService {
    @Autowired
    private TestUserRepository testUserRepository;

    public List<TestUserDto> list() {
        return this.testUserRepository.list();
    }

    public List<TestUserDto> load(int id, String name) {
        return this.testUserRepository.load(id, name);
    }

    @Transactional(rollbackFor = Exception.class)
    public int insert(TestUserDto user) {
        return this.testUserRepository.insert(user);
    }

    @Transactional(rollbackFor = Exception.class)
    public int update(TestUserDto user) throws CommonException {
        if (Math.abs(1) > 0)
            throw new CommonException("test exception");
        return this.testUserRepository.update(user);
    }

    @Transactional(rollbackFor = Exception.class)
    public int delete(int id) {
        return this.testUserRepository.delete(id);
    }


}
