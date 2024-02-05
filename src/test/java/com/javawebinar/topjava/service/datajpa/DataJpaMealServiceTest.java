package com.javawebinar.topjava.service.datajpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import com.javawebinar.topjava.MealTestData;
import com.javawebinar.topjava.model.Meal;
import com.javawebinar.topjava.service.AbstractMealServiceTest;
import com.javawebinar.topjava.util.exception.NotFoundException;

import static com.javawebinar.topjava.MealTestData.*;
import static com.javawebinar.topjava.Profiles.DATAJPA;
import static com.javawebinar.topjava.UserTestData.*;

@ActiveProfiles(DATAJPA)
class DataJpaMealServiceTest extends AbstractMealServiceTest {
    @Test
    void getWithUser() {
        Meal adminMeal = service.getWithUser(ADMIN_MEAL_ID, ADMIN_ID);
        MEAL_MATCHER.assertMatch(adminMeal, adminMeal1);
        USER_MATCHER.assertMatch(adminMeal.getUser(), admin);
    }

    @Test
    void getWithUserNotFound() {
        Assertions.assertThrows(NotFoundException.class,
                () -> service.getWithUser(MealTestData.NOT_FOUND, ADMIN_ID));
    }
}
