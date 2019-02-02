package com.budgetcheckerweb.dao;

import com.budgetcheckerweb.model.User;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {

    private List<User> users = Arrays.asList(
            new User("Kseniia", "Shavonina",
                    "mymail@yandex.ru", "1", new BigDecimal("7777777.77")),
            new User("John", "Doe",
                    "johndoe@gmail.com", "2", BigDecimal.ZERO)
    );

    public List<User> getAllUsers() {
        return users;
    }

}
