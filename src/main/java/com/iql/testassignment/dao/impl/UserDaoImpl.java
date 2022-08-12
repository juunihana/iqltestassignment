package com.iql.testassignment.dao.impl;

import com.iql.testassignment.bean.User;
import com.iql.testassignment.dao.UserDao;
import com.iql.testassignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;

    @Autowired
    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> searchByName(String name) {
        return null;
    }
/*
    public UserBean getById(long id) {
        Optional<UserEntity> optionalUser = userRepository.findById(id);
        UserEntity user = optionalUser.orElse(null);

        if (user != null) {
            UserBean userBean = new UserBean(
                    user.getId(),
                    user.getName(),
                    user.getDateOfBirth(),
                    user.getPassword(),
                    user.getAccount().getBalance(),
                    user.getEmailList().stream()
                            .map(EmailEntity::getEmail)
                            .collect(Collectors.toList()),
                    user.getPhoneList().stream()
                            .map(PhoneEntity::getPhone)
                            .collect(Collectors.toList())
            );

            return userBean;
        } else {
            return null;
        }
    }

    public void save(UserBean userBean) {
        UserEntity user = new UserEntity();
        user.setName(userBean.getName());
        user.setDateOfBirth(userBean.getDateOfBirth());
        user.setPassword(userBean.getPassword());

        AccountEntity account = new AccountEntity();
        account.setBalance(userBean.getAccount());
        account.setUser(user);

        EmailEntity email = new AccountEntity();
        account.setBalance(userBean.getAccount());
        account.setUser(user);
    }*/
}
