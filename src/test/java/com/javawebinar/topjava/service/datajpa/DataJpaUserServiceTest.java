package com.javawebinar.topjava.service.datajpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import com.javawebinar.topjava.model.User;
import com.javawebinar.topjava.service.AbstractUserServiceTest;
import com.javawebinar.topjava.util.exception.NotFoundException;

import static com.javawebinar.topjava.Profiles.DATAJPA;
import static com.javawebinar.topjava.UserTestData.*;

@ActiveProfiles(DATAJPA)
class DataJpaUserServiceTest extends AbstractUserServiceTest {
    @Test
    void getWithMeals() {
        User actual = service.getWithMeals(ADMIN_ID);
        USER_WITH_MEALS_MATCHER.assertMatch(actual, admin);
    }

    @Test
    void getWithMealsNotFound() {
        Assertions.assertThrows(NotFoundException.class,
                () -> service.getWithMeals(NOT_FOUND));
    }
}